package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class RecognitionModeFilter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter[i];
        }
    };
    public final boolean enableBarcodeId;
    public final boolean enableFullDocumentRecognition;
    public final boolean enableMrzId;
    public final boolean enableMrzPassport;
    public final boolean enableMrzVisa;
    public final boolean enablePhotoId;

    public RecognitionModeFilter() {
        this(true, true, true, true, true, true);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByte(this.enableMrzId ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableMrzVisa ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableMrzPassport ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enablePhotoId ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableBarcodeId ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableFullDocumentRecognition ? (byte) 1 : (byte) 0);
    }

    public RecognitionModeFilter(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enableMrzId = z;
        this.enableMrzPassport = z3;
        this.enableMrzVisa = z2;
        this.enablePhotoId = z4;
        this.enableBarcodeId = z5;
        this.enableFullDocumentRecognition = z6;
    }

    protected RecognitionModeFilter(android.os.Parcel parcel) {
        this.enableMrzId = parcel.readByte() != 0;
        this.enableMrzVisa = parcel.readByte() != 0;
        this.enableMrzPassport = parcel.readByte() != 0;
        this.enablePhotoId = parcel.readByte() != 0;
        this.enableBarcodeId = parcel.readByte() != 0;
        this.enableFullDocumentRecognition = parcel.readByte() != 0;
    }
}
