package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public enum zzbei implements zzifq {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);

    private final int zzh;

    zzbei(int i) {
        this.zzh = i;
    }

    public static zzbei zzb(int i) {
        if (i == 0) {
            return UNSUPPORTED;
        }
        if (i == 2) {
            return ARM7;
        }
        if (i == 999) {
            return UNKNOWN;
        }
        if (i == 4) {
            return X86;
        }
        if (i == 5) {
            return ARM64;
        }
        if (i == 6) {
            return X86_64;
        }
        if (i != 7) {
            return null;
        }
        return RISCV64;
    }

    public static zzifs zzc() {
        return zzbeh.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzifq
    public final int zza() {
        return this.zzh;
    }
}
