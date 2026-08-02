package com.microblink.blinkid.image.highres;

/* loaded from: classes10.dex */
class JpegHighResImageWrapper implements com.microblink.blinkid.image.highres.HighResImageWrapper {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.image.highres.JpegHighResImageWrapper> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.image.highres.JpegHighResImageWrapper>() { // from class: com.microblink.blinkid.image.highres.JpegHighResImageWrapper.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.image.highres.JpegHighResImageWrapper createFromParcel(android.os.Parcel parcel) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            return new com.microblink.blinkid.image.highres.JpegHighResImageWrapper(bArr, parcel.readInt(), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.image.highres.JpegHighResImageWrapper[] newArray(int i) {
            return new com.microblink.blinkid.image.highres.JpegHighResImageWrapper[i];
        }
    };
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.image.Image getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    /* synthetic */ JpegHighResImageWrapper(byte[] bArr, int i, byte b) {
        this(bArr, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.microblink.blinkid.image.highres.HighResImageWrapper
    public void dispose() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        com.microblink.blinkid.image.Image image = this.getHighSpeedVideoFpsRangesFor;
        if (image != null) {
            image.dispose();
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        this.getHighSpeedVideoFpsRanges = null;
    }

    @Override // com.microblink.blinkid.image.highres.HighResImageWrapper
    public com.microblink.blinkid.image.Image getImage() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.image.ImageBuilder.buildImageFromJpegBytes(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.microblink.blinkid.image.highres.HighResImageWrapper
    public void saveToFile(java.io.File file) throws java.io.IOException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        java.nio.channels.FileChannel channel = new java.io.FileOutputStream(file, false).getChannel();
        channel.write(java.nio.ByteBuffer.wrap(this.getHighSpeedVideoFpsRanges));
        channel.close();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        parcel.writeInt(this.getHighSpeedVideoFpsRanges.length);
        parcel.writeByteArray(this.getHighSpeedVideoFpsRanges);
        parcel.writeInt(this.getHighSpeedVideoSizes);
    }

    JpegHighResImageWrapper(byte[] bArr, com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this(bArr, orientation.intValue());
    }

    private JpegHighResImageWrapper(byte[] bArr, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = bArr;
        this.getHighSpeedVideoSizes = i;
    }
}
