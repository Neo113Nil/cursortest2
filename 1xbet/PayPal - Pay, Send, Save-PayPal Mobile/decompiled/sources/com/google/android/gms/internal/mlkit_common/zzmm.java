package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public enum zzmm implements com.google.android.gms.internal.mlkit_common.zzba {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzmm(int i) {
        this.zzd = i;
    }

    public static com.google.android.gms.internal.mlkit_common.zzmm zzb(int i) {
        for (com.google.android.gms.internal.mlkit_common.zzmm zzmmVar : values()) {
            if (zzmmVar.zzd == i) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzd;
    }
}
