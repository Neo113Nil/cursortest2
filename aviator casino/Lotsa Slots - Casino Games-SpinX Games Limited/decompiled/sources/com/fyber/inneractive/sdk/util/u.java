package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class u {
    public static java.lang.Float a(android.net.Uri uri) {
        java.io.InputStream openInputStream;
        int i;
        try {
            openInputStream = com.fyber.inneractive.sdk.config.IAConfigManager.N.u.f3614a.getApplicationContext().getContentResolver().openInputStream(uri);
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.b("%sFailed to retrieve image aspect ratio. Reason: %s", com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.util.u.class), e.getMessage());
        }
        if (openInputStream == null) {
            if (openInputStream != null) {
                openInputStream.close();
            }
            return null;
        }
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeStream(openInputStream, null, options);
            int i2 = options.outHeight;
            if (i2 <= 0 || (i = options.outWidth) <= 0) {
                openInputStream.close();
                return null;
            }
            java.lang.Float valueOf = java.lang.Float.valueOf(i / i2);
            openInputStream.close();
            return valueOf;
        } finally {
        }
    }

    public static java.lang.String b(android.net.Uri uri) {
        try {
            java.io.InputStream openInputStream = com.fyber.inneractive.sdk.config.IAConfigManager.N.u.f3614a.getApplicationContext().getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                if (openInputStream != null) {
                    openInputStream.close();
                }
                return null;
            }
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                android.graphics.BitmapFactory.decodeStream(openInputStream, null, options);
                java.lang.String str = options.outMimeType;
                openInputStream.close();
                return str;
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.b("%sFailed to retrieve image mime type. Reason: %s", com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.util.u.class), e.getMessage());
            return null;
        }
    }
}
