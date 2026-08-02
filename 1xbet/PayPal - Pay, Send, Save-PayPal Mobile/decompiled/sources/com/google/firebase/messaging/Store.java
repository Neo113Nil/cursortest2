package com.google.firebase.messaging;

/* loaded from: classes4.dex */
class Store {
    static final java.lang.String NO_BACKUP_FILE = "com.google.android.gms.appid-no-backup";
    static final java.lang.String PREFERENCES = "com.google.android.gms.appid";
    private static final java.lang.String SCOPE_ALL = "*";
    private static final java.lang.String STORE_KEY_TOKEN = "|T|";
    final android.content.SharedPreferences store;

    public Store(android.content.Context context) {
        this.store = context.getSharedPreferences(PREFERENCES, 0);
        checkForRestore(context, NO_BACKUP_FILE);
    }

    private void checkForRestore(android.content.Context context, java.lang.String str) {
        java.io.File file = new java.io.File(androidx.core.content.ContextCompat.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            deleteAll();
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
                e.getMessage();
            }
        }
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.store.getAll().isEmpty();
        }
        return isEmpty;
    }

    private java.lang.String createTokenKey(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(STORE_KEY_TOKEN);
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    public void deleteAll() {
        synchronized (this) {
            this.store.edit().clear().commit();
        }
    }

    public com.google.firebase.messaging.Store.Token getToken(java.lang.String str, java.lang.String str2) {
        com.google.firebase.messaging.Store.Token parse;
        synchronized (this) {
            parse = com.google.firebase.messaging.Store.Token.parse(this.store.getString(createTokenKey(str, str2), null));
        }
        return parse;
    }

    public void saveToken(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        synchronized (this) {
            java.lang.String encode = com.google.firebase.messaging.Store.Token.encode(str3, str4, java.lang.System.currentTimeMillis());
            if (encode == null) {
                return;
            }
            android.content.SharedPreferences.Editor edit = this.store.edit();
            edit.putString(createTokenKey(str, str2), encode);
            edit.commit();
        }
    }

    public void deleteToken(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            java.lang.String createTokenKey = createTokenKey(str, str2);
            android.content.SharedPreferences.Editor edit = this.store.edit();
            edit.remove(createTokenKey);
            edit.commit();
        }
    }

    static class Token {
        private static final java.lang.String KEY_APP_VERSION = "appVersion";
        private static final java.lang.String KEY_TIMESTAMP = "timestamp";
        private static final java.lang.String KEY_TOKEN = "token";
        private static final long REFRESH_PERIOD_MILLIS = java.util.concurrent.TimeUnit.DAYS.toMillis(7);
        final java.lang.String appVersion;
        final long timestamp;
        final java.lang.String token;

        private Token(java.lang.String str, java.lang.String str2, long j) {
            this.token = str;
            this.appVersion = str2;
            this.timestamp = j;
        }

        static com.google.firebase.messaging.Store.Token parse(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    return new com.google.firebase.messaging.Store.Token(jSONObject.getString("token"), jSONObject.getString(KEY_APP_VERSION), jSONObject.getLong("timestamp"));
                } catch (org.json.JSONException unused) {
                    return null;
                }
            }
            return new com.google.firebase.messaging.Store.Token(str, null, 0L);
        }

        static java.lang.String encode(java.lang.String str, java.lang.String str2, long j) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("token", str);
                jSONObject.put(KEY_APP_VERSION, str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
                return null;
            }
        }

        boolean needsRefresh(java.lang.String str) {
            return java.lang.System.currentTimeMillis() > this.timestamp + REFRESH_PERIOD_MILLIS || !str.equals(this.appVersion);
        }
    }
}
