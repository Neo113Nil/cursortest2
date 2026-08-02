package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class EVSearchOptions implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.EVSearchOptions build();

        public abstract java.util.List<com.google.android.libraries.places.api.model.EVConnectorType> getConnectorTypes();

        public abstract java.lang.Double getMinimumChargingRateKw();

        public abstract com.google.android.libraries.places.api.model.EVSearchOptions.Builder setConnectorTypes(java.util.List<com.google.android.libraries.places.api.model.EVConnectorType> list);

        public abstract com.google.android.libraries.places.api.model.EVSearchOptions.Builder setMinimumChargingRateKw(java.lang.Double d);
    }

    public abstract java.util.List<com.google.android.libraries.places.api.model.EVConnectorType> getConnectorTypes();

    public abstract java.lang.Double getMinimumChargingRateKw();

    public static com.google.android.libraries.places.api.model.EVSearchOptions.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzy();
    }
}
