package com.google.firebase.installations.local;

/* loaded from: classes4.dex */
public class PersistedInstallation {
    private static final java.lang.String AUTH_TOKEN_KEY = "AuthToken";
    private static final java.lang.String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
    private static final java.lang.String FIREBASE_INSTALLATION_ID_KEY = "Fid";
    private static final java.lang.String FIS_ERROR_KEY = "FisError";
    private static final java.lang.String PERSISTED_STATUS_KEY = "Status";
    private static final java.lang.String REFRESH_TOKEN_KEY = "RefreshToken";
    private static final java.lang.String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
    private static final java.lang.String TAG = "PersistedInstallation";
    private static final java.lang.String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
    private java.io.File dataFile;
    private final com.google.firebase.FirebaseApp firebaseApp;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(com.google.firebase.FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    private java.io.File getDataFile() {
        if (this.dataFile == null) {
            synchronized (this) {
                if (this.dataFile == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("PersistedInstallation.");
                    sb.append(this.firebaseApp.getPersistenceKey());
                    sb.append(".json");
                    java.lang.String obj = sb.toString();
                    java.io.File file = new java.io.File(this.firebaseApp.getApplicationContext().getNoBackupFilesDir(), obj);
                    this.dataFile = file;
                    if (file.exists()) {
                        return this.dataFile;
                    }
                    java.io.File file2 = new java.io.File(this.firebaseApp.getApplicationContext().getFilesDir(), obj);
                    if (file2.exists() && !file2.renameTo(this.dataFile)) {
                        new java.io.IOException("Unable to move the file from back up to non back up directory");
                        return file2;
                    }
                }
            }
        }
        return this.dataFile;
    }

    public void clearDataFile() {
        getDataFile().delete();
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry readPersistedInstallationEntryValue() {
        org.json.JSONObject readJSONFromFile = readJSONFromFile();
        java.lang.String optString = readJSONFromFile.optString(FIREBASE_INSTALLATION_ID_KEY, null);
        int optInt = readJSONFromFile.optInt(PERSISTED_STATUS_KEY, com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        java.lang.String optString2 = readJSONFromFile.optString(AUTH_TOKEN_KEY, null);
        java.lang.String optString3 = readJSONFromFile.optString(REFRESH_TOKEN_KEY, null);
        long optLong = readJSONFromFile.optLong(TOKEN_CREATION_TIME_IN_SECONDS_KEY, 0L);
        long optLong2 = readJSONFromFile.optLong(EXPIRES_IN_SECONDS_KEY, 0L);
        return com.google.firebase.installations.local.PersistedInstallationEntry.builder().setFirebaseInstallationId(optString).setRegistrationStatus(com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.values()[optInt]).setAuthToken(optString2).setRefreshToken(optString3).setTokenCreationEpochInSecs(optLong).setExpiresInSecs(optLong2).setFisError(readJSONFromFile.optString(FIS_ERROR_KEY, null)).build();
    }

    private org.json.JSONObject readJSONFromFile() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(getDataFile());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (java.io.IOException | org.json.JSONException unused) {
            return new org.json.JSONObject();
        }
    }

    public com.google.firebase.installations.local.PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        java.io.File createTempFile;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(FIREBASE_INSTALLATION_ID_KEY, persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put(PERSISTED_STATUS_KEY, persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put(AUTH_TOKEN_KEY, persistedInstallationEntry.getAuthToken());
            jSONObject.put(REFRESH_TOKEN_KEY, persistedInstallationEntry.getRefreshToken());
            jSONObject.put(TOKEN_CREATION_TIME_IN_SECONDS_KEY, persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put(EXPIRES_IN_SECONDS_KEY, persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put(FIS_ERROR_KEY, persistedInstallationEntry.getFisError());
            createTempFile = java.io.File.createTempFile("PersistedInstallation", "tmp", this.firebaseApp.getApplicationContext().getFilesDir());
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (java.io.IOException | org.json.JSONException unused) {
        }
        if (createTempFile.renameTo(getDataFile())) {
            return persistedInstallationEntry;
        }
        throw new java.io.IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public void clearForTesting() {
        getDataFile().delete();
    }
}
