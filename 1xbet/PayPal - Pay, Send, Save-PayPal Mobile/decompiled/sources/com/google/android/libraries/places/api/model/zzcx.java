package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcx implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzcy((com.google.android.libraries.places.api.model.EVConnectorType) parcel.readParcelable(com.google.android.libraries.places.api.model.ConnectorAggregation.class.getClassLoader()), java.lang.Double.valueOf(parcel.readDouble()), java.lang.Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? java.lang.Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? java.lang.Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? (java.time.Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzcy[i];
    }

    zzcx() {
    }
}
