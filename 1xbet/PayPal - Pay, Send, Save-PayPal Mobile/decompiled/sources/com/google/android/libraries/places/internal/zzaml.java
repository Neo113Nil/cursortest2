package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzaml implements com.google.android.libraries.places.internal.zzbdu {
    VARIANT_UNDEFINED(0),
    VARIANT_COMPACT(1),
    VARIANT_FULL(2);

    private final int zzd;

    zzaml(int i) {
        this.zzd = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbdu
    public final int zza() {
        return this.zzd;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.zzd);
    }
}
