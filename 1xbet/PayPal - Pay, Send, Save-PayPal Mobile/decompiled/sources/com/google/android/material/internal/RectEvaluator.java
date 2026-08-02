package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class RectEvaluator implements android.animation.TypeEvaluator<android.graphics.Rect> {
    private final android.graphics.Rect rect;

    public RectEvaluator(android.graphics.Rect rect) {
        this.rect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public android.graphics.Rect evaluate(float f, android.graphics.Rect rect, android.graphics.Rect rect2) {
        this.rect.set(rect.left + ((int) ((rect2.left - rect.left) * f)), rect.top + ((int) ((rect2.top - rect.top) * f)), rect.right + ((int) ((rect2.right - rect.right) * f)), rect.bottom + ((int) ((rect2.bottom - rect.bottom) * f)));
        return this.rect;
    }
}
