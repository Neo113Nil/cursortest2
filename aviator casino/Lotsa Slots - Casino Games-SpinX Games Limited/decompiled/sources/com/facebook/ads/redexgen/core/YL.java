package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class YL {
    public static java.lang.String[] A00 = {"0dslaS9HQNor4584P2qJWDauGUJuCUyD", "hmu58uVtuBegxtguAmxWdcC", "RnpWwwftYVF7ZcI60v", "9ipL7H1AQ7hrzmKFvXE", "pZ3KzhX3bLT6KZ2Vo7aJYVVuuWb7wszV", "0AfAa8bIuU", "cY7ucT44sLUlO9uXsqd9BA7lLs0feoWz", "ELBhZY2lRpRyd6u07AMv4seAD2bUSLiq"};

    public static android.graphics.Bitmap A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.graphics.Bitmap bitmap, int i) throws android.renderscript.RSRuntimeException {
        android.renderscript.RenderScript renderScript = null;
        android.renderscript.Allocation allocation = null;
        android.renderscript.Allocation output = null;
        android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlur = null;
        try {
            renderScript = android.renderscript.RenderScript.create(c1636gi);
            renderScript.setMessageHandler(new android.renderscript.RenderScript.RSMessageHandler());
            allocation = android.renderscript.Allocation.createFromBitmap(renderScript, bitmap, android.renderscript.Allocation.MipmapControl.MIPMAP_NONE, 1);
            output = android.renderscript.Allocation.createTyped(renderScript, allocation.getType());
            scriptIntrinsicBlur = android.renderscript.ScriptIntrinsicBlur.create(renderScript, android.renderscript.Element.U8_4(renderScript));
            scriptIntrinsicBlur.setInput(allocation);
            scriptIntrinsicBlur.setRadius(i);
            scriptIntrinsicBlur.forEach(output);
            output.copyTo(bitmap);
            return bitmap;
        } finally {
            if (renderScript != null) {
                renderScript.destroy();
            }
            if (allocation != null) {
                allocation.destroy();
            }
            if (output != null) {
                output.destroy();
            }
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.destroy();
            }
        }
    }

    public static android.graphics.Bitmap A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.graphics.Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth() / i2;
        int height = bitmap.getHeight() / i2;
        if (width != 0 && height != 0) {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.scale(1.0f / i2, 1.0f / i2);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setFlags(3);
            paint.setColorFilter(new android.graphics.PorterDuffColorFilter(0, android.graphics.PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            try {
                createBitmap = A00(c1636gi, createBitmap, i);
                if (i2 != 1) {
                    int height2 = bitmap.getWidth();
                    int width2 = bitmap.getHeight();
                    android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(createBitmap, height2, width2, true);
                    if (A00[0].charAt(31) == 121) {
                        throw new java.lang.RuntimeException();
                    }
                    A00[7] = "0rCXq5ZtodXnzNKgqAgAvAA6fcN2Rviw";
                    createBitmap.recycle();
                    return createScaledBitmap;
                }
                return createBitmap;
            } catch (android.renderscript.RSRuntimeException unused) {
                return new com.facebook.ads.redexgen.core.Q5().A02(createBitmap, i);
            }
        }
        return null;
    }
}
