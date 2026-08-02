package com.google.firebase.installations.local;

/* loaded from: classes4.dex */
public class IidStore {
    private static final java.lang.String[] ALLOWABLE_SCOPES = {"*", com.google.firebase.messaging.FirebaseMessaging.INSTANCE_ID_SCOPE, com.google.android.gms.stats.CodePackage.GCM, ""};
    private static final java.lang.String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final java.lang.String JSON_ENCODED_PREFIX = "{";
    private static final java.lang.String JSON_TOKEN_KEY = "token";
    private static final java.lang.String STORE_KEY_ID = "|S|id";
    private static final java.lang.String STORE_KEY_PUB = "|S||P|";
    private static final java.lang.String STORE_KEY_SEPARATOR = "|";
    private static final java.lang.String STORE_KEY_TOKEN = "|T|";
    private final java.lang.String defaultSenderId;
    private final android.content.SharedPreferences iidPrefs;

    public IidStore(com.google.firebase.FirebaseApp firebaseApp) {
        this.iidPrefs = firebaseApp.getApplicationContext().getSharedPreferences(IID_SHARED_PREFS_NAME, 0);
        this.defaultSenderId = getDefaultSenderId(firebaseApp);
    }

    public IidStore(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        this.iidPrefs = sharedPreferences;
        this.defaultSenderId = str;
    }

    private static java.lang.String getDefaultSenderId(com.google.firebase.FirebaseApp firebaseApp) {
        java.lang.String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        java.lang.String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        java.lang.String[] split = applicationId.split(io.ktor.sse.ServerSentEventKt.COLON);
        if (split.length != 4) {
            return null;
        }
        java.lang.String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private java.lang.String createTokenKey(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(STORE_KEY_TOKEN);
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return sb.toString();
    }

    public java.lang.String readToken() {
        synchronized (this.iidPrefs) {
            for (java.lang.String str : ALLOWABLE_SCOPES) {
                java.lang.String string = this.iidPrefs.getString(createTokenKey(this.defaultSenderId, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith(JSON_ENCODED_PREFIX)) {
                        string = parseIidTokenFromJson(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    private java.lang.String parseIidTokenFromJson(java.lang.String str) {
        try {
            return new org.json.JSONObject(str).getString("token");
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public java.lang.String readIid() {
        synchronized (this.iidPrefs) {
            java.lang.String readInstanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
            if (readInstanceIdFromLocalStorage != null) {
                return readInstanceIdFromLocalStorage;
            }
            return readPublicKeyFromLocalStorageAndCalculateInstanceId();
        }
    }

    private java.lang.String readInstanceIdFromLocalStorage() {
        java.lang.String string;
        synchronized (this.iidPrefs) {
            string = this.iidPrefs.getString(STORE_KEY_ID, null);
        }
        return string;
    }

    private java.lang.String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        synchronized (this.iidPrefs) {
            java.lang.String string = this.iidPrefs.getString(STORE_KEY_PUB, null);
            if (string == null) {
                return null;
            }
            java.security.PublicKey parseKey = parseKey(string);
            if (parseKey == null) {
                return null;
            }
            return getIdFromPublicKey(parseKey);
        }
    }

    private static java.lang.String getIdFromPublicKey(java.security.PublicKey publicKey) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & com.google.common.base.Ascii.SI) + 112) & 255);
            return android.util.Base64.encodeToString(digest, 0, 8, 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private java.security.PublicKey parseKey(java.lang.String str) {
        try {
            return java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(str, 8)));
        } catch (java.lang.IllegalArgumentException | java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException unused) {
            return null;
        }
    }
}
