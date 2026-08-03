package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzjy {
    private static volatile com.google.common.base.Optional zza;

    private zzjy() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:12|13)|25|26|27|28|29|30|(1:32)(1:81)|33|(9:35|36|37|38|39|(2:40|(3:42|(3:57|58|59)(7:44|45|(2:47|(1:50))|51|(1:53)|54|55)|56)(1:60))|61|62|63)(1:80)|64|13) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0072, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r0 = com.google.common.base.Optional.absent();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.common.base.Optional zza(android.content.Context context) {
        android.content.Context createDeviceProtectedStorageContext;
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads;
        com.google.common.base.Optional optional = zza;
        if (optional == null) {
            synchronized (com.google.android.gms.internal.measurement.zzjy.class) {
                optional = zza;
                if (optional == null) {
                    java.lang.String str = android.os.Build.TYPE;
                    java.lang.String str2 = android.os.Build.TAGS;
                    int i = com.google.android.gms.internal.measurement.zzka.zza;
                    try {
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            optional = com.google.common.base.Optional.absent();
                            zza = optional;
                        }
                        android.os.StrictMode.allowThreadDiskWrites();
                        char c = 0;
                        java.io.File file = new java.io.File(createDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                        com.google.common.base.Optional absent = file.exists() ? com.google.common.base.Optional.of(file) : com.google.common.base.Optional.absent();
                        if (absent.isPresent()) {
                            java.io.File file2 = (java.io.File) absent.get();
                            try {
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file2)));
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
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder(readLine.length() + 9);
                                            sb.append("Invalid: ");
                                            sb.append(readLine);
                                            android.util.Log.e("HermeticFileOverrides", sb.toString());
                                        } else {
                                            java.lang.String str3 = new java.lang.String(split[c]);
                                            java.lang.String decode = android.net.Uri.decode(new java.lang.String(split[1]));
                                            java.lang.String str4 = (java.lang.String) hashMap.get(split[2]);
                                            if (str4 == null) {
                                                java.lang.String str5 = new java.lang.String(split[2]);
                                                str4 = android.net.Uri.decode(str5);
                                                if (str4.length() < 1024 || str4 == str5) {
                                                    hashMap.put(str5, str4);
                                                }
                                            }
                                            androidx.collection.SimpleArrayMap simpleArrayMap2 = (androidx.collection.SimpleArrayMap) simpleArrayMap.get(str3);
                                            if (simpleArrayMap2 == null) {
                                                simpleArrayMap2 = new androidx.collection.SimpleArrayMap();
                                                simpleArrayMap.put(str3, simpleArrayMap2);
                                            }
                                            simpleArrayMap2.put(decode, str4);
                                            c = 0;
                                        }
                                    }
                                    java.lang.String obj = file2.toString();
                                    java.lang.String packageName = createDeviceProtectedStorageContext.getPackageName();
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(obj.length() + 28 + java.lang.String.valueOf(packageName).length());
                                    sb2.append("Parsed ");
                                    sb2.append(obj);
                                    sb2.append(" for Android package ");
                                    sb2.append(packageName);
                                    android.util.Log.w("HermeticFileOverrides", sb2.toString());
                                    com.google.android.gms.internal.measurement.zzjs zzjsVar = new com.google.android.gms.internal.measurement.zzjs(simpleArrayMap);
                                    bufferedReader.close();
                                    optional = com.google.common.base.Optional.of(zzjsVar);
                                } finally {
                                }
                            } catch (java.io.IOException e) {
                                throw new java.lang.RuntimeException(e);
                            }
                        } else {
                            optional = com.google.common.base.Optional.absent();
                        }
                        zza = optional;
                    } finally {
                        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                    createDeviceProtectedStorageContext = (!com.google.android.gms.internal.measurement.zzjm.zza() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                    allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                }
            }
        }
        return optional;
    }
}
