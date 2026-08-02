package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzfnc {
    public static boolean zza(int i7) {
        int i8 = i7 - 1;
        return i8 == 2 || i8 == 4 || i8 == 5 || i8 == 6 || i8 == 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int zzb(Context context, zzfmc zzfmcVar) {
        int i7;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] listFiles = file.listFiles(new zzfyy(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e7) {
                    zzd(null, e7.toString(), context, zzfmcVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] != 2) {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s7 = ByteBuffer.wrap(bArr2).getShort();
                        if (s7 == 3) {
                            fileInputStream.close();
                            i7 = 5;
                        } else if (s7 == 40) {
                            fileInputStream.close();
                            i7 = 3;
                        } else if (s7 == 62) {
                            fileInputStream.close();
                            i7 = 7;
                        } else if (s7 == 183) {
                            fileInputStream.close();
                            i7 = 6;
                        } else if (s7 != 243) {
                            zzd(bArr, null, context, zzfmcVar);
                        } else {
                            fileInputStream.close();
                            i7 = 8;
                        }
                        if (i7 == 1000) {
                            String zzc = zzc(context, zzfmcVar);
                            if (TextUtils.isEmpty(zzc)) {
                                zzd(null, "Empty dev arch", context, zzfmcVar);
                            } else if (zzc.equalsIgnoreCase("i686") || zzc.equalsIgnoreCase("x86")) {
                                i7 = 5;
                            } else if (zzc.equalsIgnoreCase("x86_64")) {
                                i7 = 7;
                            } else if (zzc.equalsIgnoreCase("arm64-v8a")) {
                                i7 = 6;
                            } else if (zzc.equalsIgnoreCase("armeabi-v7a") || zzc.equalsIgnoreCase("armv71")) {
                                i7 = 3;
                            } else if (zzc.equalsIgnoreCase("riscv64")) {
                                i7 = 8;
                            } else {
                                zzd(null, zzc, context, zzfmcVar);
                            }
                            i7 = 1;
                        }
                        zzfmcVar.zzb(5018, i7 != 1 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? i7 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                        return i7;
                    }
                    zzd(bArr, null, context, zzfmcVar);
                }
                fileInputStream.close();
                i7 = 1;
                if (i7 == 1000) {
                }
                zzfmcVar.zzb(5018, i7 != 1 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? i7 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                return i7;
            }
            zzfmcVar.zzb(5017, "No .so");
        } else {
            zzfmcVar.zzb(5017, "No lib/");
        }
        i7 = 1000;
        if (i7 == 1000) {
        }
        zzfmcVar.zzb(5018, i7 != 1 ? i7 != 3 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? i7 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
        return i7;
    }

    private static final String zzc(Context context, zzfmc zzfmcVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzftx.OS_ARCH.zza();
        if (!TextUtils.isEmpty(zza) && hashSet.contains(zza)) {
            return zza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e7) {
            zzfmcVar.zzc(2024, 0L, e7);
        } catch (NoSuchFieldException e8) {
            zzfmcVar.zzc(2024, 0L, e8);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfmc zzfmcVar) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzftx.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfmcVar.zzb(4007, sb.toString());
    }
}
