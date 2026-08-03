package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public final class zzcp {
    private static volatile com.google.android.gms.internal.auth.zzdh zza;

    private zzcp() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:6|(3:10|11|12)|18|(1:22)|23|24|25|26|27|28|29|(1:31)(1:81)|32|(10:34|35|36|37|38|39|(2:40|(3:42|(3:57|58|59)(7:44|45|(2:47|(1:50))|51|(1:53)|54|55)|56)(1:60))|61|62|63)(1:80)|64|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0068, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0069, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r3 = com.google.android.gms.internal.auth.zzdh.zzc();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.auth.zzdh zza(android.content.Context context) {
        com.google.android.gms.internal.auth.zzdh zzdhVar;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads;
        com.google.android.gms.internal.auth.zzdh zzc;
        synchronized (com.google.android.gms.internal.auth.zzcp.class) {
            zzdhVar = zza;
            if (zzdhVar == null) {
                java.lang.String str = android.os.Build.TYPE;
                java.lang.String str2 = android.os.Build.TAGS;
                try {
                    if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                        zzc = com.google.android.gms.internal.auth.zzdh.zzc();
                        zzdhVar = zzc;
                        zza = zzdhVar;
                    }
                    android.os.StrictMode.allowThreadDiskWrites();
                    java.io.File file = new java.io.File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    com.google.android.gms.internal.auth.zzdh zzc2 = file.exists() ? com.google.android.gms.internal.auth.zzdh.zzd(file) : com.google.android.gms.internal.auth.zzdh.zzc();
                    if (zzc2.zzb()) {
                        java.lang.Object zza2 = zzc2.zza();
                        try {
                            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream((java.io.File) zza2)));
                            try {
                                androidx.collection.SimpleArrayMap simpleArrayMap = new androidx.collection.SimpleArrayMap();
                                java.util.HashMap hashMap = new java.util.HashMap();
                                while (true) {
                                    java.lang.String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    java.lang.String[] split = readLine.split(io.ktor.sse.ServerSentEventKt.SPACE, 3);
                                    if (split.length != 3) {
                                        android.util.Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                    } else {
                                        java.lang.String str3 = new java.lang.String(split[0]);
                                        java.lang.String decode = android.net.Uri.decode(new java.lang.String(split[1]));
                                        java.lang.String str4 = (java.lang.String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            java.lang.String str5 = new java.lang.String(split[2]);
                                            str4 = android.net.Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        if (!simpleArrayMap.containsKey(str3)) {
                                            simpleArrayMap.put(str3, new androidx.collection.SimpleArrayMap());
                                        }
                                        ((androidx.collection.SimpleArrayMap) simpleArrayMap.get(str3)).put(decode, str4);
                                    }
                                }
                                android.util.Log.w("HermeticFileOverrides", "Parsed " + zza2.toString() + " for Android package " + context.getPackageName());
                                com.google.android.gms.internal.auth.zzci zzciVar = new com.google.android.gms.internal.auth.zzci(simpleArrayMap);
                                bufferedReader.close();
                                zzc = com.google.android.gms.internal.auth.zzdh.zzd(zzciVar);
                            } catch (java.lang.Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (java.lang.Throwable th2) {
                                    try {
                                        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                                    } catch (java.lang.Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        } catch (java.io.IOException e) {
                            throw new java.lang.RuntimeException(e);
                        }
                    } else {
                        zzc = com.google.android.gms.internal.auth.zzdh.zzc();
                    }
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                    zzdhVar = zzc;
                    zza = zzdhVar;
                } catch (java.lang.Throwable th3) {
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th3;
                }
                if (com.google.android.gms.internal.auth.zzcc.zzb() && !context.isDeviceProtectedStorage()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
            }
        }
        return zzdhVar;
    }
}
