package com.microblink.blinkid.entities.ocrengine;

/* loaded from: classes9.dex */
public abstract class AbstractOCREngineOptions<T extends com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions<T>> implements android.os.Parcelable {
    private final java.lang.Object getHighSpeedVideoFpsRanges;
    public long llIIlIlIIl;

    public AbstractOCREngineOptions(long j, java.lang.Object obj) {
        this.llIIlIlIIl = j;
        this.getHighSpeedVideoFpsRanges = obj;
    }

    private static native int nativeGetMaxCharAlternatives(long j);

    private static native int nativeGetMaxCharsExpected(long j);

    private static native boolean nativeIsColorDropoutEnabled(long j);

    private static native void nativeSetColorDropoutEnabled(long j, boolean z);

    private static native void nativeSetMaxCharAlternatives(long j, int i);

    private static native void nativeSetMaxCharsExpected(long j, int i);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    protected final void finalize() {
        super.finalize();
        long j = this.llIIlIlIIl;
        if (j == 0 || this.getHighSpeedVideoFpsRanges != null) {
            return;
        }
        llIIlIlIIl(j);
        this.llIIlIlIIl = 0L;
    }

    public final int getMaximumAllowedCharRecognitionVariants() {
        return nativeGetMaxCharAlternatives(this.llIIlIlIIl);
    }

    public final int getMaximumCharsExpected() {
        return nativeGetMaxCharsExpected(this.llIIlIlIIl);
    }

    public final long getNativeContext() {
        return this.llIIlIlIIl;
    }

    public final boolean isColorDropoutEnabled() {
        return nativeIsColorDropoutEnabled(this.llIIlIlIIl);
    }

    protected abstract void llIIlIlIIl(long j);

    protected abstract void llIIlIlIIl(byte[] bArr);

    protected abstract byte[] llIIlIlIIl();

    public final T setColorDropoutEnabled(boolean z) {
        nativeSetColorDropoutEnabled(this.llIIlIlIIl, z);
        return this;
    }

    public final T setMaximumAllowedCharRecognitionVariants(int i) {
        nativeSetMaxCharAlternatives(this.llIIlIlIIl, i);
        return this;
    }

    public final T setMaximumCharsExpected(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Max chars expected must be >= 0");
        }
        nativeSetMaxCharsExpected(this.llIIlIlIIl, i);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        byte[] llIIlIlIIl = llIIlIlIIl();
        parcel.writeInt(llIIlIlIIl.length);
        parcel.writeByteArray(llIIlIlIIl);
    }

    public AbstractOCREngineOptions(long j, android.os.Parcel parcel) {
        this.llIIlIlIIl = j;
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        llIIlIlIIl(bArr);
    }
}
