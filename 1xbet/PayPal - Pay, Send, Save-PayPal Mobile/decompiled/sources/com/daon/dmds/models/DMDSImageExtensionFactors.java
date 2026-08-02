package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSImageExtensionFactors implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSImageExtensionFactors> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSImageExtensionFactors>() { // from class: com.daon.dmds.models.DMDSImageExtensionFactors.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSImageExtensionFactors createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSImageExtensionFactors(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSImageExtensionFactors[] newArray(int i) {
            return new com.daon.dmds.models.DMDSImageExtensionFactors[i];
        }
    };
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;

    public DMDSImageExtensionFactors(float f, float f2, float f3, float f4) {
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighSpeedVideoFpsRanges = f3;
        this.getHighResolutionOutputSizeshNQ4ISI = f4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.daon.dmds.models.DMDSImageExtensionFactors dMDSImageExtensionFactors = (com.daon.dmds.models.DMDSImageExtensionFactors) obj;
            if (java.lang.Float.compare(dMDSImageExtensionFactors.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes) == 0 && java.lang.Float.compare(dMDSImageExtensionFactors.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor) == 0 && java.lang.Float.compare(dMDSImageExtensionFactors.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges) == 0 && java.lang.Float.compare(dMDSImageExtensionFactors.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI) == 0) {
                return true;
            }
        }
        return false;
    }

    public float getBottom() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getLeft() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public float getRight() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getTop() {
        return this.getHighSpeedVideoSizes;
    }

    public int hashCode() {
        float f = this.getHighSpeedVideoSizes;
        int floatToIntBits = f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0;
        float f2 = this.getHighSpeedVideoFpsRangesFor;
        int floatToIntBits2 = f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0;
        float f3 = this.getHighSpeedVideoFpsRanges;
        int floatToIntBits3 = f3 != 0.0f ? java.lang.Float.floatToIntBits(f3) : 0;
        float f4 = this.getHighResolutionOutputSizeshNQ4ISI;
        return (((((floatToIntBits * 31) + floatToIntBits2) * 31) + floatToIntBits3) * 31) + (f4 != 0.0f ? java.lang.Float.floatToIntBits(f4) : 0);
    }

    public boolean isEmpty() {
        return this.getHighSpeedVideoSizes == 0.0f && this.getHighSpeedVideoFpsRanges == 0.0f && this.getHighResolutionOutputSizeshNQ4ISI == 0.0f && this.getHighSpeedVideoFpsRangesFor == 0.0f;
    }

    public void setBottom(float f) {
        this.getHighSpeedVideoFpsRanges = f;
    }

    public void setLeft(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public void setRight(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public void setTop(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.getHighSpeedVideoSizes);
        parcel.writeFloat(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeFloat(this.getHighSpeedVideoFpsRanges);
        parcel.writeFloat(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    protected DMDSImageExtensionFactors(android.os.Parcel parcel) {
        this.getHighSpeedVideoSizes = parcel.readFloat();
        this.getHighSpeedVideoFpsRangesFor = parcel.readFloat();
        this.getHighSpeedVideoFpsRanges = parcel.readFloat();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readFloat();
    }
}
