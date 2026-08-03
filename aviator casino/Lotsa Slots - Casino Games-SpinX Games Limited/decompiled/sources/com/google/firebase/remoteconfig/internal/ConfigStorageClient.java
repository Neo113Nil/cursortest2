package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigStorageClient {
    private static final java.lang.String JSON_STRING_ENCODING = "UTF-8";
    private static final java.util.Map<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigStorageClient> clientInstances = new java.util.HashMap();
    private final android.content.Context context;
    private final java.lang.String fileName;

    private ConfigStorageClient(android.content.Context context, java.lang.String str) {
        this.context = context;
        this.fileName = str;
    }

    public synchronized java.lang.Void write(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) throws java.io.IOException {
        java.io.FileOutputStream openFileOutput = this.context.openFileOutput(this.fileName, 0);
        try {
            openFileOutput.write(configContainer.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }

    @javax.annotation.Nullable
    public synchronized com.google.firebase.remoteconfig.internal.ConfigContainer read() throws java.io.IOException {
        java.io.FileInputStream fileInputStream;
        java.lang.Throwable th;
        try {
            fileInputStream = this.context.openFileInput(this.fileName);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                com.google.firebase.remoteconfig.internal.ConfigContainer copyOf = com.google.firebase.remoteconfig.internal.ConfigContainer.copyOf(new org.json.JSONObject(new java.lang.String(bArr, "UTF-8")));
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return copyOf;
            } catch (java.io.FileNotFoundException | org.json.JSONException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException | org.json.JSONException unused2) {
            fileInputStream = null;
        } catch (java.lang.Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public synchronized java.lang.Void clear() {
        this.context.deleteFile(this.fileName);
        return null;
    }

    public static synchronized com.google.firebase.remoteconfig.internal.ConfigStorageClient getInstance(android.content.Context context, java.lang.String str) {
        com.google.firebase.remoteconfig.internal.ConfigStorageClient configStorageClient;
        synchronized (com.google.firebase.remoteconfig.internal.ConfigStorageClient.class) {
            java.util.Map<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigStorageClient> map = clientInstances;
            if (!map.containsKey(str)) {
                map.put(str, new com.google.firebase.remoteconfig.internal.ConfigStorageClient(context, str));
            }
            configStorageClient = map.get(str);
        }
        return configStorageClient;
    }

    public static synchronized void clearInstancesForTest() {
        synchronized (com.google.firebase.remoteconfig.internal.ConfigStorageClient.class) {
            clientInstances.clear();
        }
    }

    java.lang.String getFileName() {
        return this.fileName;
    }
}
