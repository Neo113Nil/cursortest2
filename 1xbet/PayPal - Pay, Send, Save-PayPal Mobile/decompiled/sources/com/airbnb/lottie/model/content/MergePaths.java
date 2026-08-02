package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class MergePaths implements com.airbnb.lottie.model.content.ContentModel {
    private final boolean Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.content.MergePaths.MergePathsMode getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static com.airbnb.lottie.model.content.MergePaths.MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public MergePaths(java.lang.String str, com.airbnb.lottie.model.content.MergePaths.MergePathsMode mergePathsMode, boolean z) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = mergePathsMode;
        this.Camera2StreamConfigurationMap = z;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.airbnb.lottie.model.content.MergePaths.MergePathsMode getMode() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isHidden() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        if (!lottieDrawable.isFeatureFlagEnabled(com.airbnb.lottie.LottieFeatureFlag.MergePathsApi19)) {
            com.airbnb.lottie.utils.Logger.warning("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new com.airbnb.lottie.animation.content.MergePathsContent(this);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MergePaths{mode=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
