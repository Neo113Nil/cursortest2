package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class CompoundTrimPathContent {
    final java.util.List<com.airbnb.lottie.animation.content.TrimPathContent> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();

    public void apply(android.graphics.Path path) {
        for (int size = this.getHighSpeedVideoFpsRangesFor.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.utils.Utils.applyTrimPathIfNeeded(path, this.getHighSpeedVideoFpsRangesFor.get(size));
        }
    }
}
