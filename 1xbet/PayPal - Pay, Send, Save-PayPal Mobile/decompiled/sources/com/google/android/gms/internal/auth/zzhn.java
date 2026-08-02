package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.auth.zzhl zzb;

    static {
        if (com.google.android.gms.internal.auth.zzhj.zzu() && com.google.android.gms.internal.auth.zzhj.zzv()) {
            int i = com.google.android.gms.internal.auth.zzds.zza;
        }
        zzb = new com.google.android.gms.internal.auth.zzhm();
    }

    static /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            throw new java.lang.AssertionError();
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }

    static boolean zzb(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    static boolean zzc(byte[] bArr, int i, int i2) {
        return zzb.zzb(bArr, i, i2);
    }
}
