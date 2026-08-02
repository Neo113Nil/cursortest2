package com.microblink.blinkid.image.highres;

/* loaded from: classes10.dex */
public interface HighResImageWrapper extends android.os.Parcelable {

    public static final class Factory {
        public static com.microblink.blinkid.image.highres.HighResImageWrapper createFromFrame(com.microblink.blinkid.secured.lIllIlIlII lillililii, com.microblink.blinkid.hardware.orientation.Orientation orientation) {
            if (orientation == null || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
                throw new java.lang.IllegalArgumentException("Image orientation cannot be null nor unknown");
            }
            if (lillililii instanceof com.microblink.blinkid.secured.IlIllIlllI) {
                com.microblink.blinkid.secured.IlIllIlllI ilIllIlllI = (com.microblink.blinkid.secured.IlIllIlllI) lillililii;
                int format = ilIllIlllI.llIIlIlIIl.getFormat();
                if (format == 35) {
                    return new com.microblink.blinkid.image.highres.YuvHighResImageWrapper(ilIllIlllI, orientation);
                }
                if (format == 256) {
                    java.nio.ByteBuffer buffer = ilIllIlllI.llIIlIlIIl.getPlanes()[0].getBuffer();
                    byte[] bArr = new byte[buffer.capacity()];
                    buffer.get(bArr);
                    return new com.microblink.blinkid.image.highres.JpegHighResImageWrapper(bArr, orientation);
                }
            } else if (lillililii instanceof com.microblink.blinkid.secured.llIIlIIIll) {
                return new com.microblink.blinkid.image.highres.JpegHighResImageWrapper(((com.microblink.blinkid.secured.llIIlIIIll) lillililii).llIIlIlIIl, orientation);
            }
            throw new java.lang.IllegalArgumentException("Camera image must be in YUV_420_888 or JPEG format. Other formats are not supported!");
        }
    }

    void dispose();

    com.microblink.blinkid.image.Image getImage();

    void saveToFile(java.io.File file) throws java.io.IOException;
}
