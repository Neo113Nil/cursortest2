package com.google.android.gms.common.util;

/* loaded from: classes4.dex */
public class ProcessUtils {

    @javax.annotation.Nullable
    private static java.lang.String zza;
    private static int zzb;

    @javax.annotation.Nullable
    private static java.lang.Boolean zzc;

    public static boolean zza() {
        java.lang.Boolean bool = zzc;
        if (bool == null) {
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
                bool = java.lang.Boolean.valueOf(android.os.Process.isIsolated());
            } else {
                try {
                    java.lang.Object zza2 = com.google.android.gms.internal.common.zzj.zza(android.os.Process.class, "isIsolated", new com.google.android.gms.internal.common.zzi[0]);
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    if (zza2 == null) {
                        throw new com.google.android.gms.internal.common.zzy(com.google.android.gms.internal.common.zzx.zza("expected a non-null reference", objArr));
                    }
                    bool = (java.lang.Boolean) zza2;
                } catch (java.lang.ReflectiveOperationException unused) {
                    bool = java.lang.Boolean.FALSE;
                }
            }
            zzc = bool;
        }
        return bool.booleanValue();
    }

    public static java.lang.String getMyProcessName() {
        java.lang.String str;
        if (zza == null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                zza = android.app.Application.getProcessName();
            } else {
                int i = zzb;
                if (i == 0) {
                    i = android.os.Process.myPid();
                    zzb = i;
                }
                java.lang.String str2 = null;
                java.io.BufferedReader bufferedReader = null;
                java.io.BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 14);
                        sb.append("/proc/");
                        sb.append(i);
                        sb.append("/cmdline");
                        java.lang.String obj = sb.toString();
                        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                        try {
                            java.io.BufferedReader bufferedReader3 = new java.io.BufferedReader(new java.io.FileReader(obj));
                            try {
                                java.lang.String readLine = bufferedReader3.readLine();
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(readLine);
                                java.lang.String str3 = readLine;
                                str = readLine.trim();
                            } catch (java.io.IOException unused) {
                                str = null;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader3;
                                com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReader2);
                                throw th;
                            }
                            bufferedReader = bufferedReader3;
                        } finally {
                            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (java.io.IOException unused2) {
                        str = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                    com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReader);
                    str2 = str;
                }
                zza = str2;
            }
        }
        return zza;
    }

    private ProcessUtils() {
    }
}
