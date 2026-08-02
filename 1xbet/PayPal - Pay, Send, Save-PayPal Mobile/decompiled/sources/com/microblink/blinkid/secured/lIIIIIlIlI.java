package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIIIIIlIlI {
    public final int IlIllIlIIl;
    public final int IllIIIllII;
    public final android.graphics.Bitmap llIIlIlIIl;

    public lIIIIIlIlI(android.graphics.Bitmap bitmap, int i, int i2) {
        this.llIIlIlIIl = bitmap;
        this.IlIllIlIIl = i;
        this.IllIIIllII = i2;
    }

    public static com.microblink.blinkid.secured.lIIIIIlIlI llIIlIlIIl(com.microblink.blinkid.image.Image image, int i) {
        android.graphics.Bitmap convertToBitmap = image.convertToBitmap();
        com.microblink.blinkid.hardware.orientation.Orientation imageOrientation = image.getImageOrientation();
        return new com.microblink.blinkid.secured.lIIIIIlIlI(convertToBitmap, imageOrientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT ? 1 : imageOrientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE ? 6 : imageOrientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT ? 3 : imageOrientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT ? 8 : 0, i);
    }
}
