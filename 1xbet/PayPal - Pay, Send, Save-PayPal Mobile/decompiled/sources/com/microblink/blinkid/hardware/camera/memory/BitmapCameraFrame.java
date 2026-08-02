package com.microblink.blinkid.hardware.camera.memory;

/* loaded from: classes10.dex */
public class BitmapCameraFrame implements com.microblink.blinkid.secured.lIllIlIlII {
    public long IlIllIlIIl;
    public final boolean IllIIIIllI;
    public android.graphics.RectF IllIIIllII;
    public com.microblink.blinkid.hardware.orientation.Orientation lIlIIIIlIl = com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT;
    public final long llIIIlllll;
    public android.graphics.Bitmap llIIlIlIIl;

    public BitmapCameraFrame(android.graphics.Bitmap bitmap, long j, boolean z) {
        if (bitmap == null) {
            throw new java.lang.NullPointerException("Cannot use null bitmap!");
        }
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
        if (config == config2) {
            this.llIIlIlIIl = bitmap;
        } else {
            android.graphics.Bitmap copy = bitmap.copy(config2, false);
            this.llIIlIlIIl = copy;
            if (copy == null) {
                throw new java.lang.UnsupportedOperationException("Provided bitmap is not in ARGB_8888 config, and automatic conversion into the ARGB_8888 is not supported by the device!");
            }
        }
        this.llIIIlllll = j;
        this.IllIIIIllI = z;
    }

    private static native long initializeNativeBitmapFrame(long j, android.graphics.Bitmap bitmap, int i, float f, float f2, float f3, float f4, boolean z);

    private static native void terminateNativeBitmapFrame(long j);

    private static native void updateNativeBitmapFrame(long j, android.graphics.Bitmap bitmap, int i, float f, float f2, float f3, float f4, boolean z);

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void IlIllIlIIl() {
        terminateNativeBitmapFrame(this.IlIllIlIIl);
        this.IlIllIlIIl = 0L;
        this.llIIlIlIIl = null;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final long IllIIIIllI() {
        return this.llIIIlllll;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void IllIIIllII() {
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final double llIIIlllll() {
        return -1.0d;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(android.graphics.RectF rectF) {
        this.IllIIIllII = rectF;
        com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(rectF);
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final boolean llIIlIlIIl(long j) {
        long j2 = this.IlIllIlIIl;
        if (j2 != 0) {
            android.graphics.Bitmap bitmap = this.llIIlIlIIl;
            int intValue = this.lIlIIIIlIl.intValue();
            android.graphics.RectF rectF = this.IllIIIllII;
            updateNativeBitmapFrame(j2, bitmap, intValue, rectF.left, rectF.top, rectF.width(), this.IllIIIllII.height(), this.IllIIIIllI);
        } else {
            android.graphics.Bitmap bitmap2 = this.llIIlIlIIl;
            int intValue2 = this.lIlIIIIlIl.intValue();
            android.graphics.RectF rectF2 = this.IllIIIllII;
            this.IlIllIlIIl = initializeNativeBitmapFrame(j, bitmap2, intValue2, rectF2.left, rectF2.top, rectF2.width(), this.IllIIIllII.height(), this.IllIIIIllI);
        }
        return this.IlIllIlIIl != 0;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final long llIIlIlIIl() {
        return this.IlIllIlIIl;
    }

    @Override // com.microblink.blinkid.secured.lIllIlIlII
    public final void llIIlIlIIl(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        this.lIlIIIIlIl = orientation;
    }
}
