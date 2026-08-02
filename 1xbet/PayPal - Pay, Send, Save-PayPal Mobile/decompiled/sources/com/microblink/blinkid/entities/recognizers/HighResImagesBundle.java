package com.microblink.blinkid.entities.recognizers;

/* loaded from: classes9.dex */
public class HighResImagesBundle extends com.microblink.blinkid.intent.BaseIntentTransferable<com.microblink.blinkid.entities.recognizers.HighResImagesBundle> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.HighResImagesBundle> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.HighResImagesBundle>() { // from class: com.microblink.blinkid.entities.recognizers.HighResImagesBundle.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.HighResImagesBundle createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.recognizers.HighResImagesBundle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.HighResImagesBundle[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.HighResImagesBundle[i];
        }
    };
    private java.util.ArrayList getHighSpeedVideoFpsRangesFor;

    public HighResImagesBundle() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final java.lang.String IlIllIlIIl() {
        return "com.microblink.blinkid.intent.constants.HighResImages.id";
    }

    public void addImage(com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
        this.getHighSpeedVideoFpsRangesFor.add(highResImageWrapper);
    }

    public void clearImages() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    public java.util.List<com.microblink.blinkid.image.highres.HighResImageWrapper> getImages() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final void llIIlIlIIl(com.microblink.blinkid.intent.BaseIntentTransferable baseIntentTransferable) {
        this.getHighSpeedVideoFpsRangesFor = ((com.microblink.blinkid.entities.recognizers.HighResImagesBundle) baseIntentTransferable).getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((com.microblink.blinkid.image.highres.HighResImageWrapper[]) this.getHighSpeedVideoFpsRangesFor.toArray(new com.microblink.blinkid.image.highres.HighResImageWrapper[0]), i);
    }

    public HighResImagesBundle(android.content.Intent intent) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        loadFromIntent(intent);
    }

    @Override // com.microblink.blinkid.intent.BaseIntentTransferable
    public final android.os.Parcelable.Creator llIIlIlIIl() {
        return CREATOR;
    }

    HighResImagesBundle(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        super.llIIlIlIIl(parcel);
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.image.highres.HighResImageWrapper.class.getClassLoader());
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        for (android.os.Parcelable parcelable : readParcelableArray) {
            this.getHighSpeedVideoFpsRangesFor.add((com.microblink.blinkid.image.highres.HighResImageWrapper) parcelable);
        }
    }
}
