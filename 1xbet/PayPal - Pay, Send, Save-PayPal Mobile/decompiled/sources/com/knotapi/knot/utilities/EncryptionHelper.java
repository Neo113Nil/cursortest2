package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class EncryptionHelper {
    private static final java.lang.String APP_INSTANCE_ID_KEY = "app_instance_id";
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 16;
    private static final java.lang.String KEY_DERIVATION_ALGORITHM = "PBKDF2WithHmacSHA256";
    private static final int KEY_LENGTH = 256;
    private static final int PBKDF2_ITERATIONS = 10000;
    private static final java.lang.String SALT_PREF_KEY = "encryption_salt";
    private static final java.lang.String TAG = "EncryptionHelper";
    private static final java.lang.String TRANSFORMATION = "AES/GCM/NoPadding";

    public static java.lang.String decrypt(android.content.Context context, java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        try {
            javax.crypto.SecretKey deriveKey = deriveKey(context);
            if (deriveKey == null) {
                return null;
            }
            byte[] decode = android.util.Base64.decode(str, 0);
            byte[] bArr = new byte[12];
            int length = decode.length - 12;
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(decode, 0, bArr, 0, 12);
            java.lang.System.arraycopy(decode, 12, bArr2, 0, length);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, deriveKey, new javax.crypto.spec.GCMParameterSpec(128, bArr));
            return new java.lang.String(cipher.doFinal(bArr2));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static javax.crypto.SecretKey deriveKey(android.content.Context context) {
        byte[] orCreateSalt;
        try {
            java.lang.String devicePassword = getDevicePassword(context);
            if (devicePassword == null || (orCreateSalt = getOrCreateSalt(context)) == null) {
                return null;
            }
            return new javax.crypto.spec.SecretKeySpec(javax.crypto.SecretKeyFactory.getInstance(KEY_DERIVATION_ALGORITHM).generateSecret(new javax.crypto.spec.PBEKeySpec(devicePassword.toCharArray(), orCreateSalt, 10000, 256)).getEncoded(), org.jose4j.keys.AesKey.ALGORITHM);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String encrypt(android.content.Context context, java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        try {
            javax.crypto.SecretKey deriveKey = deriveKey(context);
            if (deriveKey == null) {
                return null;
            }
            byte[] bArr = new byte[12];
            new java.security.SecureRandom().nextBytes(bArr);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, deriveKey, new javax.crypto.spec.GCMParameterSpec(128, bArr));
            byte[] doFinal = cipher.doFinal(str.getBytes());
            byte[] bArr2 = new byte[doFinal.length + 12];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 12);
            java.lang.System.arraycopy(doFinal, 0, bArr2, 12, doFinal.length);
            return android.util.Base64.encodeToString(bArr2, 0);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.String getDevicePassword(android.content.Context context) {
        try {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("encryption_prefs", 0);
            java.lang.String string = sharedPreferences.getString(APP_INSTANCE_ID_KEY, null);
            if (string == null) {
                string = java.util.UUID.randomUUID().toString();
                sharedPreferences.edit().putString(APP_INSTANCE_ID_KEY, string).apply();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("knotapi_encryption_key_");
            sb.append(string);
            return sb.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String getEncryptedString(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String decrypt;
        java.lang.String string = context.getSharedPreferences(str, 0).getString(str2, null);
        return (string == null || (decrypt = decrypt(context, string)) == null) ? str3 : decrypt;
    }

    private static byte[] getOrCreateSalt(android.content.Context context) {
        try {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("encryption_prefs", 0);
            java.lang.String string = sharedPreferences.getString(SALT_PREF_KEY, null);
            if (string != null) {
                return android.util.Base64.decode(string, 0);
            }
            byte[] bArr = new byte[16];
            new java.security.SecureRandom().nextBytes(bArr);
            sharedPreferences.edit().putString(SALT_PREF_KEY, android.util.Base64.encodeToString(bArr, 0)).apply();
            return bArr;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static void putEncryptedString(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String encrypt = encrypt(context, str3);
        if (encrypt != null) {
            context.getSharedPreferences(str, 0).edit().putString(str2, encrypt).apply();
        }
    }
}
