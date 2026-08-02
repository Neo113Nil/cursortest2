package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSResult> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSResult>() { // from class: com.daon.dmds.models.DMDSResult.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSResult createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSResult[] newArray(int i) {
            return new com.daon.dmds.models.DMDSResult[i];
        }
    };
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "DMDSResult";
    private com.daon.dmds.models.DMDSFace Camera2StreamConfigurationMap;
    private com.daon.dmds.models.DMDSDocument getHighSpeedVideoSizes;

    public DMDSResult() {
    }

    public void clearAllData() {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighResolutionOutputSizeshNQ4ISI, "clearAllData: ");
        com.daon.dmds.models.DMDSFace dMDSFace = this.Camera2StreamConfigurationMap;
        if (dMDSFace != null) {
            dMDSFace.clearAllData();
        }
        com.daon.dmds.models.DMDSDocument dMDSDocument = this.getHighSpeedVideoSizes;
        if (dMDSDocument != null) {
            dMDSDocument.clearAllData();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.daon.dmds.models.DMDSResult dMDSResult = (com.daon.dmds.models.DMDSResult) obj;
        return java.util.Objects.equals(this.getHighSpeedVideoSizes, dMDSResult.getHighSpeedVideoSizes) && java.util.Objects.equals(this.Camera2StreamConfigurationMap, dMDSResult.Camera2StreamConfigurationMap);
    }

    public com.daon.dmds.models.DMDSDocument getDocument() {
        return this.getHighSpeedVideoSizes;
    }

    public com.daon.dmds.models.DMDSFace getFace() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setDocument(com.daon.dmds.models.DMDSDocument dMDSDocument) {
        this.getHighSpeedVideoSizes = dMDSDocument;
    }

    public void setFace(com.daon.dmds.models.DMDSFace dMDSFace) {
        this.Camera2StreamConfigurationMap = dMDSFace;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSResult{, document='");
        sb.append(getDocument());
        sb.append("', face='");
        sb.append(getFace());
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.getHighSpeedVideoSizes, i);
        parcel.writeParcelable(this.Camera2StreamConfigurationMap, i);
    }

    public DMDSResult(com.daon.dmds.models.DMDSResult dMDSResult) {
        setDocument(dMDSResult.getDocument());
        setFace(dMDSResult.getFace());
    }

    protected DMDSResult(android.os.Parcel parcel) {
        this.getHighSpeedVideoSizes = (com.daon.dmds.models.DMDSDocument) parcel.readParcelable(com.daon.dmds.models.DMDSDocument.class.getClassLoader());
        this.Camera2StreamConfigurationMap = (com.daon.dmds.models.DMDSFace) parcel.readParcelable(com.daon.dmds.models.DMDSFace.class.getClassLoader());
    }
}
