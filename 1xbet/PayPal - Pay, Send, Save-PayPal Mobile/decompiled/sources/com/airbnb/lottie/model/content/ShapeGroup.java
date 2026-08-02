package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class ShapeGroup implements com.airbnb.lottie.model.content.ContentModel {
    private final java.util.List<com.airbnb.lottie.model.content.ContentModel> Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;

    public ShapeGroup(java.lang.String str, java.util.List<com.airbnb.lottie.model.content.ContentModel> list, boolean z) {
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRanges = z;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.List<com.airbnb.lottie.model.content.ContentModel> getItems() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isHidden() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.ContentGroup(lottieDrawable, baseLayer, this, lottieComposition);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShapeGroup{name='");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("' Shapes: ");
        sb.append(java.util.Arrays.toString(this.Camera2StreamConfigurationMap.toArray()));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
