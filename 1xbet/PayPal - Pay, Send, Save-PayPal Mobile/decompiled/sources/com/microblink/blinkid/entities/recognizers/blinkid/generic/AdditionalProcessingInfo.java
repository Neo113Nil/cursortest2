package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class AdditionalProcessingInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo[i];
        }
    };
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[] getHighSpeedVideoSizes;

    private AdditionalProcessingInfo(com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr, com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr2, com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr3, com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[] imageExtractionTypeArr) {
        this.getHighSpeedVideoFpsRangesFor = fieldTypeArr;
        this.getHighSpeedVideoFpsRanges = fieldTypeArr2;
        this.Camera2StreamConfigurationMap = fieldTypeArr3;
        this.getHighSpeedVideoSizes = imageExtractionTypeArr;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo createFromNative(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr = new com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            fieldTypeArr[i] = com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values()[iArr[i]];
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr2 = new com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[iArr2.length];
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            fieldTypeArr2[i2] = com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values()[iArr2[i2]];
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr3 = new com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[iArr3.length];
        for (int i3 = 0; i3 < iArr3.length; i3++) {
            fieldTypeArr3[i3] = com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values()[iArr3[i3]];
        }
        com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[] imageExtractionTypeArr = new com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[iArr4.length];
        for (int i4 = 0; i4 < iArr4.length; i4++) {
            imageExtractionTypeArr[i4] = com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType.values()[iArr4[i4]];
        }
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.AdditionalProcessingInfo(fieldTypeArr, fieldTypeArr2, fieldTypeArr3, imageExtractionTypeArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] getExtraPresentFields() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[] getImageExtractionFailures() {
        return this.getHighSpeedVideoSizes;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] getInvalidCharacterFields() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] getMissingMandatoryFields() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isEmpty() {
        return this.getHighSpeedVideoFpsRangesFor.length == 0 && this.getHighSpeedVideoFpsRanges.length == 0 && this.Camera2StreamConfigurationMap.length == 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingMandatoryFields: ");
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoFpsRangesFor));
        sb.append("\nInvalidCharacterFields: ");
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoFpsRanges));
        sb.append("\nExtraPresentFields: ");
        sb.append(java.util.Arrays.toString(this.Camera2StreamConfigurationMap));
        sb.append("\nImageExtractionFailures: ");
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoSizes));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr2;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr3;
        int[] iArr = new int[this.getHighSpeedVideoFpsRangesFor.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            fieldTypeArr = this.getHighSpeedVideoFpsRangesFor;
            if (i3 >= fieldTypeArr.length) {
                break;
            }
            iArr[i3] = fieldTypeArr[i3].ordinal();
            i3++;
        }
        parcel.writeInt(fieldTypeArr.length);
        parcel.writeIntArray(iArr);
        int[] iArr2 = new int[this.getHighSpeedVideoFpsRanges.length];
        int i4 = 0;
        while (true) {
            fieldTypeArr2 = this.getHighSpeedVideoFpsRanges;
            if (i4 >= fieldTypeArr2.length) {
                break;
            }
            iArr2[i4] = fieldTypeArr2[i4].ordinal();
            i4++;
        }
        parcel.writeInt(fieldTypeArr2.length);
        parcel.writeIntArray(iArr2);
        int[] iArr3 = new int[this.Camera2StreamConfigurationMap.length];
        int i5 = 0;
        while (true) {
            fieldTypeArr3 = this.Camera2StreamConfigurationMap;
            if (i5 >= fieldTypeArr3.length) {
                break;
            }
            iArr3[i5] = fieldTypeArr3[i5].ordinal();
            i5++;
        }
        parcel.writeInt(fieldTypeArr3.length);
        parcel.writeIntArray(iArr3);
        int[] iArr4 = new int[this.getHighSpeedVideoSizes.length];
        while (true) {
            com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[] imageExtractionTypeArr = this.getHighSpeedVideoSizes;
            if (i2 >= imageExtractionTypeArr.length) {
                parcel.writeInt(imageExtractionTypeArr.length);
                parcel.writeIntArray(iArr4);
                return;
            } else {
                iArr4[i2] = imageExtractionTypeArr[i2].ordinal();
                i2++;
            }
        }
    }

    protected AdditionalProcessingInfo(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr = new com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[readInt];
        for (int i = 0; i < readInt; i++) {
            fieldTypeArr[i] = com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values()[iArr[i]];
        }
        this.getHighSpeedVideoFpsRangesFor = fieldTypeArr;
        int readInt2 = parcel.readInt();
        int[] iArr2 = new int[readInt2];
        parcel.readIntArray(iArr2);
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr2 = new com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            fieldTypeArr2[i2] = com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values()[iArr2[i2]];
        }
        this.getHighSpeedVideoFpsRanges = fieldTypeArr2;
        int readInt3 = parcel.readInt();
        int[] iArr3 = new int[readInt3];
        parcel.readIntArray(iArr3);
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr3 = new com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[readInt3];
        for (int i3 = 0; i3 < readInt3; i3++) {
            fieldTypeArr3[i3] = com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values()[iArr3[i3]];
        }
        this.Camera2StreamConfigurationMap = fieldTypeArr3;
        int readInt4 = parcel.readInt();
        int[] iArr4 = new int[readInt4];
        parcel.readIntArray(iArr4);
        com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[] imageExtractionTypeArr = new com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[readInt4];
        for (int i4 = 0; i4 < readInt4; i4++) {
            imageExtractionTypeArr[i4] = com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType.values()[iArr4[i4]];
        }
        this.getHighSpeedVideoSizes = imageExtractionTypeArr;
    }
}
