package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfyd {
    public static boolean zza(com.google.android.gms.internal.ads.zzbds zzbdsVar) {
        int ordinal = zzbdsVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5;
    }

    public static final com.google.android.gms.internal.ads.zzbds zzb(android.content.Context context, com.google.android.gms.internal.ads.zzfxg zzfxgVar) {
        com.google.android.gms.internal.ads.zzbds zzbdsVar;
        java.io.FileInputStream fileInputStream;
        byte[] bArr;
        java.io.File file = new java.io.File(new java.io.File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            java.io.File[] listFiles = file.listFiles(new com.google.android.gms.internal.ads.zzgzu(java.util.regex.Pattern.compile(".*\\.so$", 2)));
            if (listFiles == null || listFiles.length == 0) {
                if (zzfxgVar != null) {
                    zzfxgVar.zze(5017, "No .so");
                } else {
                    zzfxgVar = null;
                }
                zzbdsVar = com.google.android.gms.internal.ads.zzbds.UNKNOWN;
            } else {
                try {
                    fileInputStream = new java.io.FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (java.io.IOException e) {
                    zzc(null, e.toString(), context, zzfxgVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzc(bArr, null, context, zzfxgVar);
                        zzbdsVar = com.google.android.gms.internal.ads.zzbds.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = java.nio.ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            zzbdsVar = com.google.android.gms.internal.ads.zzbds.X86;
                        } else if (s == 40) {
                            zzbdsVar = com.google.android.gms.internal.ads.zzbds.ARM7;
                        } else if (s == 62) {
                            zzbdsVar = com.google.android.gms.internal.ads.zzbds.X86_64;
                        } else if (s == 183) {
                            zzbdsVar = com.google.android.gms.internal.ads.zzbds.ARM64;
                        } else if (s != 243) {
                            zzc(bArr, null, context, zzfxgVar);
                            zzbdsVar = com.google.android.gms.internal.ads.zzbds.UNSUPPORTED;
                        } else {
                            zzbdsVar = com.google.android.gms.internal.ads.zzbds.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzbdsVar = com.google.android.gms.internal.ads.zzbds.UNSUPPORTED;
                }
            }
        } else {
            if (zzfxgVar != null) {
                zzfxgVar.zze(5017, "No lib/");
            } else {
                zzfxgVar = null;
            }
            zzbdsVar = com.google.android.gms.internal.ads.zzbds.UNKNOWN;
        }
        if (zzbdsVar == com.google.android.gms.internal.ads.zzbds.UNKNOWN) {
            java.lang.String zzd = zzd(context, zzfxgVar);
            if (android.text.TextUtils.isEmpty(zzd)) {
                zzc(null, "Empty dev arch", context, zzfxgVar);
                zzbdsVar = com.google.android.gms.internal.ads.zzbds.UNSUPPORTED;
            } else if (zzd.equalsIgnoreCase("i686") || zzd.equalsIgnoreCase("x86")) {
                zzbdsVar = com.google.android.gms.internal.ads.zzbds.X86;
            } else if (zzd.equalsIgnoreCase("x86_64")) {
                zzbdsVar = com.google.android.gms.internal.ads.zzbds.X86_64;
            } else if (zzd.equalsIgnoreCase("arm64-v8a")) {
                zzbdsVar = com.google.android.gms.internal.ads.zzbds.ARM64;
            } else if (zzd.equalsIgnoreCase("armeabi-v7a") || zzd.equalsIgnoreCase("armv71")) {
                zzbdsVar = com.google.android.gms.internal.ads.zzbds.ARM7;
            } else if (zzd.equalsIgnoreCase("riscv64")) {
                zzbdsVar = com.google.android.gms.internal.ads.zzbds.RISCV64;
            } else {
                zzc(null, zzd, context, zzfxgVar);
                zzbdsVar = com.google.android.gms.internal.ads.zzbds.UNSUPPORTED;
            }
        }
        if (zzfxgVar != null) {
            zzfxgVar.zze(5018, zzbdsVar.name());
        }
        return zzbdsVar;
    }

    private static final void zzc(byte[] bArr, java.lang.String str, android.content.Context context, com.google.android.gms.internal.ads.zzfxg zzfxgVar) {
        if (zzfxgVar == null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("os.arch:");
        sb.append(com.google.android.gms.internal.ads.zzgtz.OS_ARCH.zza());
        sb.append(";");
        try {
            java.lang.String[] strArr = (java.lang.String[]) android.os.Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(java.util.Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(android.os.Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(android.os.Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(java.util.Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfxgVar.zze(4007, sb.toString());
    }

    private static final java.lang.String zzd(android.content.Context context, com.google.android.gms.internal.ads.zzfxg zzfxgVar) {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList("i686", "armv71"));
        java.lang.String zza = com.google.android.gms.internal.ads.zzgtz.OS_ARCH.zza();
        if (!android.text.TextUtils.isEmpty(zza) && hashSet.contains(zza)) {
            return zza;
        }
        try {
            java.lang.String[] strArr = (java.lang.String[]) android.os.Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (java.lang.IllegalAccessException e) {
            if (zzfxgVar != null) {
                zzfxgVar.zzc(2024, 0L, e);
            }
        } catch (java.lang.NoSuchFieldException e2) {
            if (zzfxgVar != null) {
                zzfxgVar.zzc(2024, 0L, e2);
            }
        }
        return android.os.Build.CPU_ABI != null ? android.os.Build.CPU_ABI : android.os.Build.CPU_ABI2;
    }
}
