package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzanj implements com.google.android.libraries.places.internal.zzbdu {
    POSITION_UNDEFINED(0),
    POSITION_TOP(1),
    POSITION_BOTTOM(2);

    private final int zzd;

    zzanj(int i) {
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
