package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzayy implements com.google.android.libraries.places.internal.zzbdu {
    BUSINESS_STATUS_UNSPECIFIED(0),
    OPERATIONAL(1),
    CLOSED_TEMPORARILY(2),
    CLOSED_PERMANENTLY(3),
    FUTURE_OPENING(4),
    UNRECOGNIZED(-1);

    private final int zzg;

    zzayy(int i) {
        this.zzg = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbdu
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzg;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.zzg);
    }
}
