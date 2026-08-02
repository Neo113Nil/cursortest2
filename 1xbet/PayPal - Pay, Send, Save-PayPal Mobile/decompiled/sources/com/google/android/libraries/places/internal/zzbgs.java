package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzbgs implements com.google.android.libraries.places.internal.zzbdu {
    WIDGET_TYPE_UNSPECIFIED(0),
    PLACE_DETAILS(1),
    PLACE_LIST(2),
    PLACE_AUTOCOMPLETE(3),
    ELEVATION(4),
    INTERNAL_PLACE_DETAILS(5),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzbgs(int i) {
        this.zzh = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbdu
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.zzh);
    }
}
