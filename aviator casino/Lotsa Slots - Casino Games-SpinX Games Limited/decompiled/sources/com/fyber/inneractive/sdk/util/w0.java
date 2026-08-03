package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class w0 {
    public static java.lang.String a(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static android.graphics.Bitmap a(java.lang.String str) {
        try {
            byte[] decode = android.util.Base64.decode(str, 0);
            return android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("IAimageLoaderUtil failed stringToBitMap with %s", e.getMessage());
            return null;
        }
    }
}
