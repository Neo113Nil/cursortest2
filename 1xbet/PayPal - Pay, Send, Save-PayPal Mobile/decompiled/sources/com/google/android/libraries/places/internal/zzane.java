package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzane implements com.google.android.libraries.places.internal.zzbdu {
    ORIENTATION_UNDEFINED(0),
    ORIENTATION_VERTICAL(1),
    ORIENTATION_HORIZONTAL(2);

    private final int zzd;

    zzane(int i) {
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
