package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public interface ShapeModifierContent extends com.airbnb.lottie.animation.content.Content {
    void addUpdateListener(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener animationListener);

    com.airbnb.lottie.model.content.ShapeData modifyShape(com.airbnb.lottie.model.content.ShapeData shapeData);
}
