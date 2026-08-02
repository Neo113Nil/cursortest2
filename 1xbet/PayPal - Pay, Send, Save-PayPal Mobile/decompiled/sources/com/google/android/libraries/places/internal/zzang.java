package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzang implements com.google.android.libraries.places.internal.zzbdu {
    UNDEFINED(0),
    SEARCH_BY_TEXT_REQUEST(1),
    SEARCH_NEARBY_REQUEST(2);

    private final int zzd;

    zzang(int i) {
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
