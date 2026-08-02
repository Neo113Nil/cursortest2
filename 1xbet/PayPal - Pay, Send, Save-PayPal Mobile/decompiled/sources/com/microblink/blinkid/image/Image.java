package com.microblink.blinkid.image;

/* loaded from: classes10.dex */
public class Image implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.image.Image> CREATOR = new com.microblink.blinkid.image.llIIlIlIIl();
    private final boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    private java.lang.Integer getHighSpeedVideoFpsRangesFor;
    private java.nio.ByteBuffer getHighSpeedVideoSizes;
    private java.lang.Integer getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private java.lang.Integer getOutputFormats;
    private com.microblink.blinkid.hardware.orientation.Orientation getOutputMinFrameDuration;

    Image(long j, boolean z) {
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = z;
    }

    private static native long deserialize(byte[] bArr);

    private static native long nativeClone(long j);

    private static native boolean nativeCopyPixelsToBitmap(long j, android.graphics.Bitmap bitmap);

    private static native void nativeDestruct(long j);

    private static native int nativeGetHeight(long j);

    private static native java.lang.String nativeGetImageName(long j);

    private static native int nativeGetImageOrientation(long j);

    private static native java.nio.ByteBuffer nativeGetPixelBuffer(long j);

    private static native int nativeGetRowStride(long j);

    private static native int nativeGetWidth(long j);

    private static native void nativeSetImageOrientation(long j, int i);

    private static native byte[] serialize(long j);

    public android.graphics.Bitmap convertToBitmap() {
        if (this.getHighSpeedVideoFpsRanges == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(getRawWidth(), getRawHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        if (nativeCopyPixelsToBitmap(this.getHighSpeedVideoFpsRanges, createBitmap)) {
            return createBitmap;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void dispose() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j != 0 && this.Camera2StreamConfigurationMap) {
            nativeDestruct(j);
        }
        this.getHighSpeedVideoFpsRanges = 0L;
    }

    protected final void finalize() {
        super.finalize();
        dispose();
    }

    public java.nio.ByteBuffer getBuffer() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = nativeGetPixelBuffer(j);
        }
        return this.getHighSpeedVideoSizes;
    }

    public int getHeight() {
        return getImageOrientation().isHorizontal() ? getRawHeight() : getRawWidth();
    }

    public com.microblink.blinkid.image.ImageFormat getImageFormat() {
        return com.microblink.blinkid.image.ImageFormat.BGRA_8888;
    }

    @java.lang.Deprecated
    public java.lang.String getImageName() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.getInputFormats == null) {
            this.getInputFormats = nativeGetImageName(j);
        }
        return this.getInputFormats;
    }

    public com.microblink.blinkid.hardware.orientation.Orientation getImageOrientation() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.getOutputMinFrameDuration == null) {
            this.getOutputMinFrameDuration = com.microblink.blinkid.hardware.orientation.Orientation.fromInt(nativeGetImageOrientation(j));
        }
        return this.getOutputMinFrameDuration;
    }

    public int getPixelStride() {
        if (this.getHighSpeedVideoFpsRanges != 0) {
            return 1;
        }
        throw new java.lang.IllegalStateException("Cannot use disposed image!");
    }

    public int getRawHeight() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(nativeGetHeight(j));
        }
        return this.getHighSpeedVideoFpsRangesFor.intValue();
    }

    public int getRawWidth() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = java.lang.Integer.valueOf(nativeGetWidth(j));
        }
        return this.getHighSpeedVideoSizesFor.intValue();
    }

    public int getRowStride() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.getOutputFormats == null) {
            this.getOutputFormats = java.lang.Integer.valueOf(nativeGetRowStride(j));
        }
        return this.getOutputFormats.intValue();
    }

    public int getWidth() {
        return getImageOrientation().isHorizontal() ? getRawWidth() : getRawHeight();
    }

    public boolean isDisposed() {
        return this.getHighSpeedVideoFpsRanges == 0;
    }

    public void setImageOrientation(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        this.getOutputMinFrameDuration = orientation;
        nativeSetImageOrientation(j, orientation.intValue());
    }

    public com.microblink.blinkid.image.InputImage toInputImage() {
        return com.microblink.blinkid.image.ImageBuilder.buildInputImageFromImage(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        byte[] serialize = serialize(j);
        parcel.writeInt(serialize.length);
        parcel.writeByteArray(serialize);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.microblink.blinkid.image.Image m10897clone() {
        long j = this.getHighSpeedVideoFpsRanges;
        if (j != 0) {
            return new com.microblink.blinkid.image.Image(nativeClone(j), true);
        }
        throw new java.lang.IllegalStateException("Cannot clone disposed image!");
    }

    protected Image(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRanges = 0L;
        this.Camera2StreamConfigurationMap = false;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        this.getHighSpeedVideoFpsRanges = deserialize(bArr);
        this.Camera2StreamConfigurationMap = true;
    }
}
