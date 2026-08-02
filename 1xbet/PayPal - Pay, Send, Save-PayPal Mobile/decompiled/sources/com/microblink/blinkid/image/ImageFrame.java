package com.microblink.blinkid.image;

/* loaded from: classes10.dex */
public class ImageFrame implements com.microblink.blinkid.secured.lIllIlIlII {
    public long IlIllIlIIl = 0;
    public final long IllIIIllII;
    public final boolean llIIIlllll;
    public final com.microblink.blinkid.image.InputImage llIIlIlIIl;

    public ImageFrame(com.microblink.blinkid.image.InputImage inputImage, boolean z, long j) {
        if (inputImage == null) {
            throw new java.lang.NullPointerException("Image object cannot be null!");
        }
        this.llIIlIlIIl = inputImage;
        this.IllIIIllII = j;
        this.llIIIlllll = z;
    }

    private static native long nativeConstruct(long j, long j2, boolean z);

    private static native void nativeDestruct(long j);

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void IlIllIlIIl() {
        nativeDestruct(this.IlIllIlIIl);
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final long IllIIIIllI() {
        return this.IllIIIllII;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void IllIIIllII() {
        throw new java.lang.UnsupportedOperationException("Image frame should not be used in object pool.");
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final double llIIIlllll() {
        return -1.0d;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(android.graphics.RectF rectF) {
        throw new java.lang.UnsupportedOperationException("ImageFrame's ROI is obtained from image object!");
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final boolean llIIlIlIIl(long j) {
        long nativeConstruct = nativeConstruct(this.llIIlIlIIl.llIIIlllll, j, this.llIIIlllll);
        this.IlIllIlIIl = nativeConstruct;
        return nativeConstruct != 0;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final long llIIlIlIIl() {
        return this.IlIllIlIIl;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        throw new java.lang.UnsupportedOperationException("Orientation should be set to image object before creating Image frame");
    }
}
