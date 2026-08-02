package com.microblink.blinkid.ocr;

/* loaded from: classes10.dex */
public class RectangleEvaluator implements android.animation.TypeEvaluator<com.microblink.blinkid.geometry.Rectangle> {
    @Override // android.animation.TypeEvaluator
    public com.microblink.blinkid.geometry.Rectangle evaluate(float f, com.microblink.blinkid.geometry.Rectangle rectangle, com.microblink.blinkid.geometry.Rectangle rectangle2) {
        float x = rectangle.getX();
        float x2 = rectangle2.getX();
        float y = rectangle.getY();
        float y2 = rectangle2.getY();
        float width = rectangle.getWidth();
        float width2 = rectangle2.getWidth();
        float height = rectangle.getHeight();
        return new com.microblink.blinkid.geometry.Rectangle(((x2 - x) * f) + x, ((y2 - y) * f) + y, ((width2 - width) * f) + width, ((rectangle2.getHeight() - height) * f) + height);
    }
}
