package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class MergePathsContent implements com.airbnb.lottie.animation.content.PathContent, com.airbnb.lottie.animation.content.GreedyContent {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.content.MergePaths getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.Path getHighSpeedVideoSizes = new android.graphics.Path();
    private final android.graphics.Path getInputSizeshNQ4ISI = new android.graphics.Path();
    private final android.graphics.Path getHighSpeedVideoFpsRangesFor = new android.graphics.Path();
    private final java.util.List<com.airbnb.lottie.animation.content.PathContent> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

    public MergePathsContent(com.airbnb.lottie.model.content.MergePaths mergePaths) {
        this.Camera2StreamConfigurationMap = mergePaths.getName();
        this.getHighResolutionOutputSizeshNQ4ISI = mergePaths;
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public void absorbContent(java.util.ListIterator<com.airbnb.lottie.animation.content.Content> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            com.airbnb.lottie.animation.content.Content previous = listIterator.previous();
            if (previous instanceof com.airbnb.lottie.animation.content.PathContent) {
                this.getHighSpeedVideoFpsRanges.add((com.airbnb.lottie.animation.content.PathContent) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
            this.getHighSpeedVideoFpsRanges.get(i).setContents(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public android.graphics.Path getPath() {
        this.getHighSpeedVideoFpsRangesFor.reset();
        if (this.getHighResolutionOutputSizeshNQ4ISI.isHidden()) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        int i = com.airbnb.lottie.animation.content.MergePathsContent.AnonymousClass1.getHighSpeedVideoFpsRangesFor[this.getHighResolutionOutputSizeshNQ4ISI.getMode().ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.size(); i2++) {
                this.getHighSpeedVideoFpsRangesFor.addPath(this.getHighSpeedVideoFpsRanges.get(i2).getPath());
            }
        } else if (i == 2) {
            getHighSpeedVideoSizes(android.graphics.Path.Op.UNION);
        } else if (i == 3) {
            getHighSpeedVideoSizes(android.graphics.Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            getHighSpeedVideoSizes(android.graphics.Path.Op.INTERSECT);
        } else if (i == 5) {
            getHighSpeedVideoSizes(android.graphics.Path.Op.XOR);
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: com.airbnb.lottie.animation.content.MergePathsContent$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.Camera2StreamConfigurationMap;
    }

    private void getHighSpeedVideoSizes(android.graphics.Path.Op op) {
        android.graphics.Matrix matrix;
        android.graphics.Matrix matrix2;
        this.getInputSizeshNQ4ISI.reset();
        this.getHighSpeedVideoSizes.reset();
        for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size > 0; size--) {
            com.airbnb.lottie.animation.content.PathContent pathContent = this.getHighSpeedVideoFpsRanges.get(size);
            if (pathContent instanceof com.airbnb.lottie.animation.content.ContentGroup) {
                com.airbnb.lottie.animation.content.ContentGroup contentGroup = (com.airbnb.lottie.animation.content.ContentGroup) pathContent;
                java.util.List<com.airbnb.lottie.animation.content.PathContent> highResolutionOutputSizeshNQ4ISI = contentGroup.getHighResolutionOutputSizeshNQ4ISI();
                for (int size2 = highResolutionOutputSizeshNQ4ISI.size() - 1; size2 >= 0; size2--) {
                    android.graphics.Path path = highResolutionOutputSizeshNQ4ISI.get(size2).getPath();
                    com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = contentGroup.getHighResolutionOutputSizeshNQ4ISI;
                    if (transformKeyframeAnimation != null) {
                        matrix2 = transformKeyframeAnimation.getMatrix();
                    } else {
                        contentGroup.getHighSpeedVideoFpsRangesFor.reset();
                        matrix2 = contentGroup.getHighSpeedVideoFpsRangesFor;
                    }
                    path.transform(matrix2);
                    this.getInputSizeshNQ4ISI.addPath(path);
                }
            } else {
                this.getInputSizeshNQ4ISI.addPath(pathContent.getPath());
            }
        }
        com.airbnb.lottie.animation.content.PathContent pathContent2 = this.getHighSpeedVideoFpsRanges.get(0);
        if (pathContent2 instanceof com.airbnb.lottie.animation.content.ContentGroup) {
            com.airbnb.lottie.animation.content.ContentGroup contentGroup2 = (com.airbnb.lottie.animation.content.ContentGroup) pathContent2;
            java.util.List<com.airbnb.lottie.animation.content.PathContent> highResolutionOutputSizeshNQ4ISI2 = contentGroup2.getHighResolutionOutputSizeshNQ4ISI();
            for (int i = 0; i < highResolutionOutputSizeshNQ4ISI2.size(); i++) {
                android.graphics.Path path2 = highResolutionOutputSizeshNQ4ISI2.get(i).getPath();
                com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation2 = contentGroup2.getHighResolutionOutputSizeshNQ4ISI;
                if (transformKeyframeAnimation2 != null) {
                    matrix = transformKeyframeAnimation2.getMatrix();
                } else {
                    contentGroup2.getHighSpeedVideoFpsRangesFor.reset();
                    matrix = contentGroup2.getHighSpeedVideoFpsRangesFor;
                }
                path2.transform(matrix);
                this.getHighSpeedVideoSizes.addPath(path2);
            }
        } else {
            this.getHighSpeedVideoSizes.set(pathContent2.getPath());
        }
        this.getHighSpeedVideoFpsRangesFor.op(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, op);
    }
}
