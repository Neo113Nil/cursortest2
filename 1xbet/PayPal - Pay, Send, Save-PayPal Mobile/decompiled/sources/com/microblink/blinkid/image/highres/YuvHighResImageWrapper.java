package com.microblink.blinkid.image.highres;

/* loaded from: classes10.dex */
class YuvHighResImageWrapper implements com.microblink.blinkid.image.highres.HighResImageWrapper {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.image.highres.YuvHighResImageWrapper> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.image.highres.YuvHighResImageWrapper>() { // from class: com.microblink.blinkid.image.highres.YuvHighResImageWrapper.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.image.highres.YuvHighResImageWrapper createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.image.highres.YuvHighResImageWrapper((com.microblink.blinkid.image.Image) parcel.readParcelable(com.microblink.blinkid.image.Image.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.image.highres.YuvHighResImageWrapper[] newArray(int i) {
            return new com.microblink.blinkid.image.highres.YuvHighResImageWrapper[i];
        }
    };
    private com.microblink.blinkid.image.Image getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes = false;

    YuvHighResImageWrapper(com.microblink.blinkid.secured.IlIllIlllI ilIllIlllI, com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.image.ImageBuilder.buildInputImageFromCamera2Image(ilIllIlllI.llIIlIlIIl, orientation, com.microblink.blinkid.geometry.Rectangle.getDefaultROI()).llIIIlllll();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.microblink.blinkid.image.highres.HighResImageWrapper
    public void dispose() {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        com.microblink.blinkid.image.Image image = this.getHighSpeedVideoFpsRangesFor;
        if (image != null) {
            image.dispose();
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    @Override // com.microblink.blinkid.image.highres.HighResImageWrapper
    public com.microblink.blinkid.image.Image getImage() {
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.microblink.blinkid.image.highres.HighResImageWrapper
    public void saveToFile(java.io.File file) throws java.io.IOException {
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        android.graphics.Bitmap convertToBitmap = this.getHighSpeedVideoFpsRangesFor.convertToBitmap();
        if (convertToBitmap != null) {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            convertToBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.image.Image image;
        if (this.getHighSpeedVideoSizes || (image = this.getHighSpeedVideoFpsRangesFor) == null) {
            return;
        }
        parcel.writeParcelable(image, i);
    }

    YuvHighResImageWrapper(com.microblink.blinkid.image.Image image) {
        this.getHighSpeedVideoFpsRangesFor = image;
    }
}
