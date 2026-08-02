package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IlIllIlllI implements com.microblink.blinkid.secured.lIllIlIlII {
    public final com.microblink.blinkid.secured.IIIllIlIIl IlIllIlIIl;
    public boolean IllIIIIllI;
    public com.microblink.blinkid.secured.IllIllIlll IllIIIllII;
    public com.microblink.blinkid.hardware.orientation.Orientation lIIIIIllll;
    public android.graphics.RectF lIlIIIIlIl;
    public boolean llIIIlllll;
    public android.media.Image llIIlIlIIl;
    public long lllIIIlIlI;
    public long llIIlIIlll = 0;
    public double IIlIIIllIl = -1.0d;

    public IlIllIlllI(com.microblink.blinkid.secured.IIIllIlIIl iIIllIlIIl) {
        this.IlIllIlIIl = iIIllIlIIl;
    }

    public abstract double IlIllIlIIl(long j);

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void IlIllIlIIl() {
        com.microblink.blinkid.secured.IIllIllIIl iIllIllIIl = this.IlIllIlIIl.llIIlIlIIl;
        synchronized (iIllIllIIl) {
            com.microblink.blinkid.util.Log.v(this, "Finalizing frame ID: {}", java.lang.Long.valueOf(this.lllIIIlIlI));
            android.media.Image image = this.llIIlIlIIl;
            if (image != null) {
                this.IllIIIllII.llIIlIlIIl(image);
                this.IllIIIllII = null;
            }
            int i = iIllIllIIl.llIIIlllll;
            if (i < iIllIllIIl.llIIlIlIIl) {
                int i2 = i + 1;
                iIllIllIIl.llIIIlllll = i2;
                iIllIllIIl.IllIIIllII[i2] = this;
            }
        }
    }

    public abstract void IlIllIlIIl(long j, int i, int i2, boolean z, boolean z2, int i3, float f, float f2, float f3, float f4, java.nio.ByteBuffer byteBuffer, int i4, int i5, java.nio.ByteBuffer byteBuffer2, int i6, int i7, java.nio.ByteBuffer byteBuffer3, int i8, int i9);

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final long IllIIIIllI() {
        return this.lllIIIlIlI;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void IllIIIllII() {
        this.llIIlIlIIl = null;
        this.IllIIIllII = null;
        this.lIlIIIIlIl = null;
        this.lIIIIIllll = null;
        this.IIlIIIllIl = -1.0d;
    }

    public abstract void IllIIIllII(long j);

    public final void finalize() {
        com.microblink.blinkid.util.Log.v(this, "Disposing frame ID: {}", java.lang.Long.valueOf(this.lllIIIlIlI));
        IllIIIllII(this.llIIlIIlll);
        this.llIIlIIlll = 0L;
        super.finalize();
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final double llIIIlllll() {
        if (this.IIlIIIllIl < 0.0d) {
            long j = this.llIIlIIlll;
            if (j == 0) {
                throw new java.lang.IllegalStateException("Prior calling getFrameQuality make sure you have initialized native part of frame");
            }
            this.IIlIIIllIl = IlIllIlIIl(j);
        }
        return this.IIlIIIllIl;
    }

    public abstract long llIIlIlIIl(long j, int i, int i2, boolean z, boolean z2, int i3, float f, float f2, float f3, float f4, java.nio.ByteBuffer byteBuffer, int i4, int i5, java.nio.ByteBuffer byteBuffer2, int i6, int i7, java.nio.ByteBuffer byteBuffer3, int i8, int i9);

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(android.graphics.RectF rectF) {
        this.lIlIIIIlIl = rectF;
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(rectF);
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this.lIIIIIllll = orientation;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final boolean llIIlIlIIl(long j) {
        long j2 = this.llIIlIIlll;
        if (j2 != 0) {
            int width = this.llIIlIlIIl.getWidth();
            int height = this.llIIlIlIIl.getHeight();
            boolean z = this.llIIIlllll;
            boolean z2 = this.IllIIIIllI;
            int intValue = this.lIIIIIllll.intValue();
            android.graphics.RectF rectF = this.lIlIIIIlIl;
            IlIllIlIIl(j2, width, height, z, z2, intValue, rectF.left, rectF.top, rectF.width(), this.lIlIIIIlIl.height(), this.llIIlIlIIl.getPlanes()[0].getBuffer(), this.llIIlIlIIl.getPlanes()[0].getRowStride(), this.llIIlIlIIl.getPlanes()[0].getPixelStride(), this.llIIlIlIIl.getPlanes()[1].getBuffer(), this.llIIlIlIIl.getPlanes()[1].getRowStride(), this.llIIlIlIIl.getPlanes()[1].getPixelStride(), this.llIIlIlIIl.getPlanes()[2].getBuffer(), this.llIIlIlIIl.getPlanes()[2].getRowStride(), this.llIIlIlIIl.getPlanes()[2].getPixelStride());
            return true;
        }
        int width2 = this.llIIlIlIIl.getWidth();
        int height2 = this.llIIlIlIIl.getHeight();
        boolean z3 = this.llIIIlllll;
        boolean z4 = this.IllIIIIllI;
        int intValue2 = this.lIIIIIllll.intValue();
        android.graphics.RectF rectF2 = this.lIlIIIIlIl;
        long llIIlIlIIl = llIIlIlIIl(j, width2, height2, z3, z4, intValue2, rectF2.left, rectF2.top, rectF2.width(), this.lIlIIIIlIl.height(), this.llIIlIlIIl.getPlanes()[0].getBuffer(), this.llIIlIlIIl.getPlanes()[0].getRowStride(), this.llIIlIlIIl.getPlanes()[0].getPixelStride(), this.llIIlIlIIl.getPlanes()[1].getBuffer(), this.llIIlIlIIl.getPlanes()[1].getRowStride(), this.llIIlIlIIl.getPlanes()[1].getPixelStride(), this.llIIlIlIIl.getPlanes()[2].getBuffer(), this.llIIlIlIIl.getPlanes()[2].getRowStride(), this.llIIlIlIIl.getPlanes()[2].getPixelStride());
        this.llIIlIIlll = llIIlIlIIl;
        return llIIlIlIIl != 0;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final long llIIlIlIIl() {
        return this.llIIlIIlll;
    }
}
