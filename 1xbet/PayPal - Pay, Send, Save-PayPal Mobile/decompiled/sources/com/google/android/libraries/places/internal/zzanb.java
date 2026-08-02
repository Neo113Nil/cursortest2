package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzanb implements com.google.android.libraries.places.internal.zzbdu {
    CONTENT_UNDEFINED(0),
    PHOTO(1),
    ADDRESS(2),
    RATING(3),
    TYPE(4),
    PRICE(5),
    ACCESSIBILITY(6),
    OPEN_NOW_STATUS(7);

    private final int zzi;

    zzanb(int i) {
        this.zzi = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbdu
    public final int zza() {
        return this.zzi;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.zzi);
    }
}
