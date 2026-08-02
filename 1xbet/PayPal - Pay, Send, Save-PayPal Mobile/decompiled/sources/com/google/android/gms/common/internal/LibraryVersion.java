package com.google.android.gms.common.internal;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class LibraryVersion {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("LibraryVersion", "");
    private static final com.google.android.gms.common.internal.LibraryVersion zzb = new com.google.android.gms.common.internal.LibraryVersion();
    private final java.util.concurrent.ConcurrentHashMap zzc = new java.util.concurrent.ConcurrentHashMap();

    protected LibraryVersion() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String getVersion(java.lang.String str) {
        java.lang.String str2;
        java.io.InputStream inputStream;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zzc;
        if (concurrentHashMap.containsKey(str)) {
            return (java.lang.String) concurrentHashMap.get(str);
        }
        java.util.Properties properties = new java.util.Properties();
        java.lang.String str3 = null;
        try {
            try {
                inputStream = com.google.android.gms.common.internal.LibraryVersion.class.getResourceAsStream(java.lang.String.format("/%s.properties", str));
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream = str3;
            }
        } catch (java.io.IOException e) {
            e = e;
            str2 = null;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                com.google.android.gms.common.internal.GmsLogger gmsLogger = zza;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 12 + java.lang.String.valueOf(str3).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str3);
                gmsLogger.v("LibraryVersion", sb.toString());
            } else {
                com.google.android.gms.common.internal.GmsLogger gmsLogger2 = zza;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 43);
                sb2.append("Failed to get app version for libraryName: ");
                sb2.append(str);
                gmsLogger2.w("LibraryVersion", sb2.toString());
            }
        } catch (java.io.IOException e2) {
            e = e2;
            str2 = str3;
            str3 = inputStream;
            com.google.android.gms.common.internal.GmsLogger gmsLogger3 = zza;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 43);
            sb3.append("Failed to get app version for libraryName: ");
            sb3.append(str);
            gmsLogger3.e("LibraryVersion", sb3.toString(), e);
            java.lang.String str4 = str2;
            inputStream = str3;
            str3 = str4;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            this.zzc.put(str, str3);
            return str3;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (inputStream != null) {
                com.google.android.gms.common.util.IOUtils.closeQuietly(inputStream);
            }
            throw th;
        }
        if (inputStream != null) {
            com.google.android.gms.common.util.IOUtils.closeQuietly(inputStream);
        }
        if (str3 == null) {
            zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            str3 = "UNKNOWN";
        }
        this.zzc.put(str, str3);
        return str3;
    }

    public static com.google.android.gms.common.internal.LibraryVersion getInstance() {
        return zzb;
    }
}
