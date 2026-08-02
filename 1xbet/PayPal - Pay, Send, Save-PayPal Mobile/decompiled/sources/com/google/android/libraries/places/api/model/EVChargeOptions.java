package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class EVChargeOptions implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.EVChargeOptions build();

        public abstract com.google.android.libraries.places.api.model.EVChargeOptions.Builder setConnectorAggregations(java.util.List<com.google.android.libraries.places.api.model.ConnectorAggregation> list);

        public abstract com.google.android.libraries.places.api.model.EVChargeOptions.Builder setConnectorCount(java.lang.Integer num);
    }

    public static com.google.android.libraries.places.api.model.EVChargeOptions newInstance(java.lang.Integer num, java.util.List<com.google.android.libraries.places.api.model.ConnectorAggregation> list) {
        com.google.android.libraries.places.api.model.zzw zzwVar = new com.google.android.libraries.places.api.model.zzw();
        zzwVar.setConnectorCount(num);
        zzwVar.setConnectorAggregations(list);
        return zzwVar.build();
    }

    public abstract java.util.List<com.google.android.libraries.places.api.model.ConnectorAggregation> getConnectorAggregations();

    public abstract java.lang.Integer getConnectorCount();
}
