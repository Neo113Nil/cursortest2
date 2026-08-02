package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class ConnectorAggregation implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.ConnectorAggregation build();

        public abstract java.time.Instant getAvailabilityLastUpdateTime();

        public abstract java.lang.Integer getAvailableCount();

        public abstract java.lang.Integer getOutOfServiceCount();

        public abstract com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setAvailabilityLastUpdateTime(java.time.Instant instant);

        public abstract com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setAvailableCount(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setCount(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setMaxChargeRateKw(java.lang.Double d);

        public abstract com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setOutOfServiceCount(java.lang.Integer num);

        public abstract com.google.android.libraries.places.api.model.ConnectorAggregation.Builder setType(com.google.android.libraries.places.api.model.EVConnectorType eVConnectorType);
    }

    public static com.google.android.libraries.places.api.model.ConnectorAggregation.Builder builder(com.google.android.libraries.places.api.model.EVConnectorType eVConnectorType, java.lang.Double d, java.lang.Integer num) {
        com.google.android.libraries.places.api.model.zzo zzoVar = new com.google.android.libraries.places.api.model.zzo();
        zzoVar.setType(eVConnectorType);
        zzoVar.setMaxChargeRateKw(d);
        zzoVar.setCount(num);
        return zzoVar;
    }

    public abstract java.time.Instant getAvailabilityLastUpdateTime();

    public abstract java.lang.Integer getAvailableCount();

    public abstract java.lang.Integer getCount();

    public abstract java.lang.Double getMaxChargeRateKw();

    public abstract java.lang.Integer getOutOfServiceCount();

    public abstract com.google.android.libraries.places.api.model.EVConnectorType getType();
}
