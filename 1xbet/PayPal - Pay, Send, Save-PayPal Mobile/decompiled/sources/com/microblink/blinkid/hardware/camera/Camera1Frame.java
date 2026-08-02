package com.microblink.blinkid.hardware.camera;

/* loaded from: classes10.dex */
public class Camera1Frame extends com.microblink.blinkid.secured.llIIlIIIll {
    public double IlIllIlllI;
    public com.microblink.blinkid.secured.IlIIIIIlll lllIIIlIlI;
    public com.microblink.blinkid.secured.lIllIIlIIl lllIlIlIIl;

    public Camera1Frame(int i, int i2, int i3, com.microblink.blinkid.secured.IlIIIIIlll ilIIIIIlll, com.microblink.blinkid.secured.lIllIIlIIl lilliiliil) {
        super(i, i2, i3);
        this.IlIllIlllI = -1.0d;
        this.lllIlIlIIl = lilliiliil;
        this.lllIIIlIlI = ilIIIIIlll;
    }

    private static native long initializeNativeCamera1Frame(long j, int i, int i2, byte[] bArr, boolean z, boolean z2, int i3, float f, float f2, float f3, float f4);

    private static native double nativeGetCamera1FrameQuality(long j);

    private static native void terminateNativeCamera1Frame(long j);

    private static native void updateNativeCamera1Frame(long j, int i, int i2, byte[] bArr, boolean z, boolean z2, int i3, float f, float f2, float f3, float f4);

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void IlIllIlIIl() {
        com.microblink.blinkid.secured.IlIIIIIlll ilIIIIIlll = this.lllIIIlIlI;
        if (ilIIIIIlll != null) {
            com.microblink.blinkid.secured.IlIlIlIIlI ilIlIlIIlI = ilIIIIIlll.llIIlIlIIl;
            synchronized (ilIlIlIIlI) {
                com.microblink.blinkid.util.Log.v(this, "Finalizing frame ID: {}", java.lang.Long.valueOf(this.lIIIIIllll));
                com.microblink.blinkid.secured.lIllIIlIIl lilliiliil = this.lllIlIlIIl;
                if (lilliiliil != null) {
                    lilliiliil.llIIlIlIIl(this);
                }
                this.lIlIIIIlIl = null;
                this.IIlIIIllIl = null;
                int i = ilIlIlIIlI.llIIIlllll;
                if (i < ilIlIlIIlI.llIIlIlIIl) {
                    int i2 = i + 1;
                    ilIlIlIIlI.llIIIlllll = i2;
                    ilIlIlIIlI.IllIIIllII[i2] = this;
                }
            }
        }
    }

    @Override // com.microblink.blinkid.secured.llIIlIIIll, com.microblink.blinkid.secured.lIllIlIlII
    public final void IllIIIllII() {
        this.lIlIIIIlIl = null;
        this.IIlIIIllIl = null;
        this.IlIllIlllI = -1.0d;
    }

    public final void lIlIIIIlIl() {
        com.microblink.blinkid.util.Log.v(this, "Disposing frame ID: {}", java.lang.Long.valueOf(this.lIIIIIllll));
        this.llIIlIlIIl = null;
        this.lIlIIIIlIl = null;
        this.IIlIIIllIl = null;
        terminateNativeCamera1Frame(this.llIIlIIlll);
        this.llIIlIIlll = 0L;
        this.lllIlIlIIl = null;
        this.lllIIIlIlI = null;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final double llIIIlllll() {
        if (this.IlIllIlllI < 0.0d) {
            long j = this.llIIlIIlll;
            if (j == 0) {
                throw new java.lang.IllegalStateException("Prior calling getFrameQuality make sure you have initialized native part of frame");
            }
            this.IlIllIlllI = nativeGetCamera1FrameQuality(j);
        }
        return this.IlIllIlllI;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final boolean llIIlIlIIl(long j) {
        long j2 = this.llIIlIIlll;
        if (j2 != 0) {
            int i = this.IlIllIlIIl;
            int i2 = this.IllIIIllII;
            byte[] bArr = this.llIIlIlIIl;
            boolean z = this.llIIIlllll;
            boolean z2 = this.IllIIIIllI;
            int intValue = this.IIlIIIllIl.intValue();
            android.graphics.RectF rectF = this.lIlIIIIlIl;
            updateNativeCamera1Frame(j2, i, i2, bArr, z, z2, intValue, rectF.left, rectF.top, rectF.width(), this.lIlIIIIlIl.height());
            return true;
        }
        int i3 = this.IlIllIlIIl;
        int i4 = this.IllIIIllII;
        byte[] bArr2 = this.llIIlIlIIl;
        boolean z3 = this.llIIIlllll;
        boolean z4 = this.IllIIIIllI;
        int intValue2 = this.IIlIIIllIl.intValue();
        android.graphics.RectF rectF2 = this.lIlIIIIlIl;
        long initializeNativeCamera1Frame = initializeNativeCamera1Frame(j, i3, i4, bArr2, z3, z4, intValue2, rectF2.left, rectF2.top, rectF2.width(), this.lIlIIIIlIl.height());
        this.llIIlIIlll = initializeNativeCamera1Frame;
        return initializeNativeCamera1Frame != 0;
    }
}
