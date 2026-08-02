package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzazu implements com.google.android.libraries.places.internal.zzbdu {
    SECONDARY_HOURS_TYPE_UNSPECIFIED(0),
    DRIVE_THROUGH(1),
    HAPPY_HOUR(2),
    DELIVERY(3),
    TAKEOUT(4),
    KITCHEN(5),
    BREAKFAST(6),
    LUNCH(7),
    DINNER(8),
    BRUNCH(9),
    PICKUP(10),
    ACCESS(11),
    SENIOR_HOURS(12),
    ONLINE_SERVICE_HOURS(13),
    UNRECOGNIZED(-1);

    private final int zzp;

    zzazu(int i) {
        this.zzp = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbdu
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzp;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.zzp);
    }
}
