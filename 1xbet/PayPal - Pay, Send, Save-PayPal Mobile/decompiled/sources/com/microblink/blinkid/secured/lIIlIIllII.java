package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class lIIlIIllII {
    public static final void IlIllIlIIl(int i, float[] fArr) {
        if (i == 1) {
            float f = fArr[1];
            float f2 = fArr[0];
            fArr[0] = f;
            fArr[1] = 1.0f - f2;
            return;
        }
        if (i == 8) {
            float f3 = fArr[0];
            float f4 = fArr[1];
            fArr[0] = 1.0f - f3;
            fArr[1] = 1.0f - f4;
            return;
        }
        if (i != 9) {
            return;
        }
        float f5 = fArr[1];
        float f6 = fArr[0];
        fArr[0] = 1.0f - f5;
        fArr[1] = f6;
    }

    public static final void llIIlIlIIl(android.graphics.RectF rectF) {
        if (rectF.left < 0.0f) {
            rectF.left = 0.0f;
        }
        if (rectF.left > 1.0f) {
            rectF.left = 1.0f;
        }
        if (rectF.top < 0.0f) {
            rectF.top = 0.0f;
        }
        if (rectF.top > 1.0f) {
            rectF.top = 1.0f;
        }
        if (rectF.right < 0.0f) {
            rectF.right = 0.0f;
        }
        if (rectF.right > 1.0f) {
            rectF.right = 1.0f;
        }
        if (rectF.bottom < 0.0f) {
            rectF.bottom = 0.0f;
        }
        if (rectF.bottom > 1.0f) {
            rectF.bottom = 1.0f;
        }
    }

    public static final void llIIlIlIIl(int i, float[] fArr) {
        if (i == 1) {
            float f = fArr[1];
            float f2 = fArr[0];
            fArr[0] = 1.0f - f;
            fArr[1] = f2;
            return;
        }
        if (i == 8) {
            float f3 = fArr[0];
            float f4 = fArr[1];
            fArr[0] = 1.0f - f3;
            fArr[1] = 1.0f - f4;
            return;
        }
        if (i != 9) {
            return;
        }
        float f5 = fArr[1];
        float f6 = fArr[0];
        fArr[0] = f5;
        fArr[1] = 1.0f - f6;
    }

    public static boolean llIIlIlIIl(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getApplicationContext().getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels < displayMetrics.heightPixels;
    }
}
