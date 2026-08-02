package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public abstract class j {
    public static void a(android.graphics.Canvas canvas, com.dyneti.android.dyscan.l lVar, android.graphics.Paint paint, float f, float f2, float f3, float f4) {
        float f5 = 0.005f * f4;
        boolean z = f3 < f4;
        float f6 = 454.0f / f4;
        float f7 = f3 * f6;
        float f8 = (720.0f - f3) / 2.0f;
        float f9 = lVar.f3318a;
        float f10 = ((f9 * 720.0f) - f8) / f7;
        float f11 = lVar.c;
        float f12 = f11 / f6;
        float f13 = lVar.b;
        float f14 = ((720.0f * f13) - f8) / f7;
        float f15 = lVar.d;
        float f16 = f15 / f6;
        if (z) {
            f9 = f10;
        }
        if (z) {
            f11 = f12;
        }
        if (z) {
            f13 = f14;
        }
        if (z) {
            f15 = f16;
        }
        canvas.drawRect(new android.graphics.RectF((f9 * f3) + f, ((f11 * f4) + f2) - f5, (f13 * f3) + f, (f15 * f4) + f2 + f5), paint);
    }

    public static byte[] a(android.graphics.Bitmap bitmap) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
