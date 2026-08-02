package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSFace implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSFace> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSFace>() { // from class: com.daon.dmds.models.DMDSFace.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSFace createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSFace(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSFace[] newArray(int i) {
            return new com.daon.dmds.models.DMDSFace[i];
        }
    };
    private android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI;
    private com.daon.dmds.models.DMDSFaceResultQuality getHighSpeedVideoFpsRanges;

    public DMDSFace(android.graphics.Bitmap bitmap, com.daon.dmds.models.DMDSFaceResultQuality dMDSFaceResultQuality) {
        this.getHighResolutionOutputSizeshNQ4ISI = bitmap;
        this.getHighSpeedVideoFpsRanges = dMDSFaceResultQuality;
    }

    public void clearAllData() {
        android.graphics.Bitmap bitmap = this.getHighResolutionOutputSizeshNQ4ISI;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.getHighResolutionOutputSizeshNQ4ISI.recycle();
        }
        if (this.getHighSpeedVideoFpsRanges != null) {
            this.getHighSpeedVideoFpsRanges = null;
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
        com.daon.dmds.models.DMDSFace dMDSFace = (com.daon.dmds.models.DMDSFace) obj;
        return java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, dMDSFace.getHighResolutionOutputSizeshNQ4ISI) && java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, dMDSFace.getHighSpeedVideoFpsRanges);
    }

    public android.graphics.Bitmap getFaceImage() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.daon.dmds.models.DMDSFaceResultQuality getQualityData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.getHighSpeedVideoFpsRanges.getGlobalScore());
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        int faceRotation = this.getHighSpeedVideoFpsRanges.getFaceRotation();
        com.daon.dmds.models.DMDSFaceResultQuality dMDSFaceResultQuality = this.getHighSpeedVideoFpsRanges;
        return (((i * 31) + faceRotation) * 31) + (dMDSFaceResultQuality != null ? dMDSFaceResultQuality.hashCode() : 0);
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRanges = (com.daon.dmds.models.DMDSFaceResultQuality) parcel.readParcelable(com.daon.dmds.models.DMDSFaceResultQuality.class.getClassLoader());
        com.daon.dmds.utils.DataTransferHelper.getInstance().pickFaceImage(this);
    }

    public void setFaceImage(android.graphics.Bitmap bitmap) {
        this.getHighResolutionOutputSizeshNQ4ISI = bitmap;
    }

    public void setQualityData(com.daon.dmds.models.DMDSFaceResultQuality dMDSFaceResultQuality) {
        this.getHighSpeedVideoFpsRanges = dMDSFaceResultQuality;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DMDSFace{faceImage=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", qualityScore=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.getHighSpeedVideoFpsRanges, i);
        com.daon.dmds.utils.DataTransferHelper.getInstance().setFaceImage(this);
    }

    protected DMDSFace(android.os.Parcel parcel) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRanges = (com.daon.dmds.models.DMDSFaceResultQuality) parcel.readParcelable(com.daon.dmds.models.DMDSFaceResultQuality.class.getClassLoader());
        com.daon.dmds.utils.DataTransferHelper.getInstance().pickFaceImage(this);
    }
}
