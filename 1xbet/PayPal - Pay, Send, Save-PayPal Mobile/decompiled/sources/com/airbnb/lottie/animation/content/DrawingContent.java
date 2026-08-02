package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public interface DrawingContent extends com.airbnb.lottie.animation.content.Content {
    void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow);

    void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z);
}
