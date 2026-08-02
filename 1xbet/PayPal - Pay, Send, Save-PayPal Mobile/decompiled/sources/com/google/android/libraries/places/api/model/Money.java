package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class Money implements android.os.Parcelable {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.Money build() {
            long longValue = getUnits().longValue();
            java.lang.Integer nanos = getNanos();
            if (longValue > 0) {
                com.google.common.base.Preconditions.checkArgument(nanos.intValue() >= 0, "Unit is positive and nano must be positive or zero, but was: %s.", nanos);
            } else if (longValue < 0) {
                com.google.common.base.Preconditions.checkArgument(nanos.intValue() <= 0, "Unit is negative and nano must be negative or zero, but was: %s.", nanos);
            }
            return zza();
        }

        public abstract java.lang.Integer getNanos();

        public abstract java.lang.Long getUnits();

        public abstract com.google.android.libraries.places.api.model.Money.Builder setCurrencyCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Money.Builder setNanos(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.model.Money.Builder setUnits(java.lang.Long l);

        abstract com.google.android.libraries.places.api.model.Money zza();
    }

    public static com.google.android.libraries.places.api.model.Money newInstance(java.lang.String str, java.lang.Long l, java.lang.Integer num) {
        com.google.android.libraries.places.api.model.zzaq zzaqVar = new com.google.android.libraries.places.api.model.zzaq();
        zzaqVar.setCurrencyCode(str);
        zzaqVar.setUnits(l);
        zzaqVar.setNanos(num);
        return zzaqVar.build();
    }

    public abstract java.lang.String getCurrencyCode();

    public abstract java.lang.Integer getNanos();

    public abstract java.lang.Long getUnits();
}
