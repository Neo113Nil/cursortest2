package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzamz implements com.google.android.libraries.places.internal.zzbdu {
    SIZE_UNDEFINED(0),
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private final int zze;

    zzamz(int i) {
        this.zze = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbdu
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.zze);
    }
}
