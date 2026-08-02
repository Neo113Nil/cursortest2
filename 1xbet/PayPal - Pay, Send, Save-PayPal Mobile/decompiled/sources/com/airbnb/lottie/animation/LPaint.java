package com.airbnb.lottie.animation;

/* loaded from: classes7.dex */
public class LPaint extends android.graphics.Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(android.os.LocaleList localeList) {
    }

    public LPaint() {
    }

    public LPaint(int i) {
        super(i);
    }

    public LPaint(android.graphics.PorterDuff.Mode mode) {
        setXfermode(new android.graphics.PorterDuffXfermode(mode));
    }

    public LPaint(int i, android.graphics.PorterDuff.Mode mode) {
        super(i);
        setXfermode(new android.graphics.PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            setColor((com.airbnb.lottie.utils.MiscUtils.clamp(i, 0, 255) << 24) | (getColor() & 16777215));
        } else {
            super.setAlpha(com.airbnb.lottie.utils.MiscUtils.clamp(i, 0, 255));
        }
    }
}
