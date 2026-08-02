package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IllllIIlll extends com.microblink.blinkid.secured.IIlIlIIlII {
    public final android.content.Context lIlIIIIlIl;

    public IllllIIlll(android.content.Context context, com.microblink.blinkid.secured.IlIIIIIllI ilIIIIIllI, com.microblink.blinkid.secured.lIIIIllllI liiiilllli, com.microblink.blinkid.secured.IIIlIIIllI iIIlIIIllI, com.microblink.blinkid.secured.IIIIIIlIII iIIIIIlIII) {
        super(liiiilllli, ilIIIIIllI, iIIlIIIllI, iIIIIIlIII);
        this.lIlIIIIlIl = context;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0057: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:17:0x0057 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.io.BufferedInputStream IlIllIlIIl(com.microblink.blinkid.secured.lIIIIIlIlI liiiiilili) {
        java.io.File file;
        java.io.File file2;
        java.io.File file3 = null;
        try {
            try {
                file = java.io.File.createTempFile("tmp_image", com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
                try {
                    java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
                    android.graphics.Bitmap bitmap = liiiiilili.llIIlIlIIl;
                    android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
                    com.microblink.blinkid.secured.IlIIIIIllI ilIIIIIllI = this.IllIIIllII;
                    bitmap.compress(compressFormat, 95, bufferedOutputStream);
                    bufferedOutputStream.close();
                    android.media.ExifInterface exifInterface = new android.media.ExifInterface(file.getAbsolutePath());
                    exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, java.lang.Integer.toString(liiiiilili.IlIllIlIIl));
                    exifInterface.saveAttributes();
                    java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
                    file.delete();
                    return bufferedInputStream;
                } catch (java.lang.Exception e) {
                    e = e;
                    e.printStackTrace();
                    if (file != null) {
                        file.delete();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                file3 = file2;
                if (file3 != null) {
                    file3.delete();
                }
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            file = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (file3 != null) {
            }
            throw th;
        }
    }

    @Override // com.microblink.blinkid.secured.IIlIlIIlII
    public final boolean llIIlIlIIl(com.microblink.blinkid.secured.lIIIIIlIlI liiiiilili) {
        try {
            java.io.BufferedInputStream IlIllIlIIl = IlIllIlIIl(liiiiilili);
            final javax.crypto.SecretKey llIIlIlIIl = com.microblink.blinkid.secured.lIIllIIlIl.llIIlIlIIl();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            com.microblink.blinkid.secured.lIIllIIlIl.llIIlIlIIl(IlIllIlIIl, llIIlIlIIl, byteArrayOutputStream);
            java.lang.String encodeToString = android.util.Base64.encodeToString(com.microblink.blinkid.secured.lIIllIIlIl.llIIlIlIIl(this.lIlIIIIlIl, llIIlIlIIl), 2);
            this.IllIIIIllI.IllIIIllII = new com.microblink.blinkid.secured.llIlllIIIl() { // from class: com.microblink.blinkid.secured.IllllIIlll$$ExternalSyntheticLambda0
                @Override // com.microblink.blinkid.secured.llIlllIIIl
                public final java.lang.String llIIlIlIIl(java.lang.String str) {
                    return com.microblink.blinkid.secured.IllllIIlll.this.llIIlIlIIl(llIIlIlIIl, str);
                }
            };
            com.microblink.blinkid.secured.IIIIlIlIll llIIlIlIIl2 = com.microblink.blinkid.secured.IIIIlIlIll.llIIlIlIIl("https://data.microblink.com/enc");
            llIIlIlIIl2.llIIlIlIIl().setConnectTimeout(20000);
            llIIlIlIIl2.llIIlIlIIl(encodeToString, byteArrayOutputStream.toByteArray(), this.IllIIIIllI.llIIlIlIIl(liiiiilili.IllIIIllII).entrySet());
            if (this.IlIllIlIIl != null) {
                return false;
            }
            return llIIlIlIIl2.IlIllIlIIl() == 201;
        } catch (com.microblink.blinkid.secured.llllIIIllI | java.io.IOException | java.security.GeneralSecurityException e) {
            this.IlIllIlIIl = e;
            return false;
        }
    }

    public final java.lang.String llIIlIlIIl(javax.crypto.SecretKey secretKey, java.lang.String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            java.security.PublicKey publicKey = com.microblink.blinkid.secured.lIIllIIlIl.llIIlIlIIl;
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            com.microblink.blinkid.secured.lIIllIIlIl.llIIlIlIIl(new java.io.ByteArrayInputStream(bytes), secretKey, byteArrayOutputStream);
            return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (java.io.IOException | java.security.GeneralSecurityException e) {
            this.IlIllIlIIl = e;
            return "";
        }
    }
}
