package com.microblink.blinkid.image;

/* loaded from: classes10.dex */
public class InputImage {
    public java.lang.Integer IlIllIlIIl;
    public final boolean IllIIIIllI;
    public android.graphics.Rect IllIIIllII;
    public java.lang.Object lIlIIIIlIl;
    public long llIIIlllll;
    public java.lang.Integer llIIlIlIIl;

    public InputImage(long j, boolean z) {
        this.llIIIlllll = j;
        this.IllIIIIllI = z;
    }

    private static native void nativeDestruct(long j);

    private static native int nativeGetHeight(long j);

    private static native void nativeGetRoi(long j, int[] iArr);

    private static native int nativeGetWidth(long j);

    private static native com.microblink.blinkid.image.Image nativeToImage(long j);

    public final android.graphics.Rect IlIllIlIIl() {
        long j = this.llIIIlllll;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.IllIIIllII == null) {
            int[] iArr = new int[4];
            nativeGetRoi(j, iArr);
            this.IllIIIllII = new android.graphics.Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        return this.IllIIIllII;
    }

    public final int IllIIIllII() {
        long j = this.llIIIlllll;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.llIIlIlIIl == null) {
            this.llIIlIlIIl = java.lang.Integer.valueOf(nativeGetWidth(j));
        }
        return this.llIIlIlIIl.intValue();
    }

    public final void finalize() {
        super.finalize();
        long j = this.llIIIlllll;
        if (j != 0 && this.IllIIIIllI) {
            nativeDestruct(j);
        }
        this.llIIIlllll = 0L;
    }

    public final com.microblink.blinkid.image.Image llIIIlllll() {
        long j = this.llIIIlllll;
        if (j != 0) {
            return nativeToImage(j);
        }
        throw new java.lang.IllegalStateException("Cannot use disposed image!");
    }

    public final int llIIlIlIIl() {
        long j = this.llIIIlllll;
        if (j == 0) {
            throw new java.lang.IllegalStateException("Cannot use disposed image!");
        }
        if (this.IlIllIlIIl == null) {
            this.IlIllIlIIl = java.lang.Integer.valueOf(nativeGetHeight(j));
        }
        return this.IlIllIlIIl.intValue();
    }
}
