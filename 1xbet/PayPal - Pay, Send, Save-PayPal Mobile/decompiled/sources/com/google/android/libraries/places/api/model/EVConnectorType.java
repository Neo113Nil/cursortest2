package com.google.android.libraries.places.api.model;

/* loaded from: classes4.dex */
public enum EVConnectorType implements android.os.Parcelable {
    EV_CONNECTOR_TYPE_UNSPECIFIED,
    EV_CONNECTOR_TYPE_OTHER,
    EV_CONNECTOR_TYPE_J1772,
    EV_CONNECTOR_TYPE_TYPE_2,
    EV_CONNECTOR_TYPE_CHADEMO,
    EV_CONNECTOR_TYPE_CCS_COMBO_1,
    EV_CONNECTOR_TYPE_CCS_COMBO_2,
    EV_CONNECTOR_TYPE_TESLA,
    EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T,
    EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET,
    EV_CONNECTOR_TYPE_NACS;

    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.EVConnectorType> CREATOR = new android.os.Parcelable.Creator() { // from class: com.google.android.libraries.places.api.model.zzfu
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            return com.google.android.libraries.places.api.model.EVConnectorType.valueOf((java.lang.String) com.google.common.base.Preconditions.checkNotNull(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ java.lang.Object[] newArray(int i) {
            return new com.google.android.libraries.places.api.model.EVConnectorType[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
