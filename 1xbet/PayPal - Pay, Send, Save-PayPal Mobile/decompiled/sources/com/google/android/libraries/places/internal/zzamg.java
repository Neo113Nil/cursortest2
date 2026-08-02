package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public enum zzamg implements com.google.android.libraries.places.internal.zzbdu {
    CONTENT_UNDEFINED(0),
    PHOTO(1),
    ADDRESS(2),
    RATING(3),
    TYPE(4),
    PRICE(5),
    ACCESSIBILITY(6),
    MAPS_LINK(7),
    DIRECTIONS_LINK(8),
    OPEN_NOW_STATUS(9),
    SUMMARY(10),
    OPENING_HOURS(11),
    WEBSITE(12),
    PHONE_NUMBER(13),
    TYPE_SPECIFIC_HIGHLIGHTS(14),
    REVIEWS(15),
    PLUS_CODE(16),
    FEATURES(17),
    GENERATIVE_SUMMARY(18);

    private final int zzt;

    zzamg(int i) {
        this.zzt = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbdu
    public final int zza() {
        return this.zzt;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.zzt);
    }
}
