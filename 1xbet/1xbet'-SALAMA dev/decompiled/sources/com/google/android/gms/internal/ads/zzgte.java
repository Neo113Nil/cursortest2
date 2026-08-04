package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum zzgte implements zzgxk {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    private final int zzi;

    zzgte(int i7) {
        this.zzi = i7;
    }

    public static zzgte zzb(int i7) {
        if (i7 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i7 == 1) {
            return TINK;
        }
        if (i7 == 2) {
            return LEGACY;
        }
        if (i7 == 3) {
            return RAW;
        }
        if (i7 == 4) {
            return CRUNCHY;
        }
        if (i7 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
