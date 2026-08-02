package androidx.transition;

/* loaded from: classes7.dex */
class Styleable {
    static final int[] getOutputFormats = {android.R.attr.targetClass, android.R.attr.targetId, android.R.attr.excludeId, android.R.attr.excludeClass, android.R.attr.targetName, android.R.attr.excludeName};
    static final int[] getInputFormats = {android.R.attr.fromScene, android.R.attr.toScene, android.R.attr.transition};
    static final int[] getOutputMinFrameDuration = {android.R.attr.interpolator, android.R.attr.duration, android.R.attr.startDelay, android.R.attr.matchOrder};
    static final int[] Camera2StreamConfigurationMap = {android.R.attr.resizeClip};
    static final int[] getOutputStallDuration = {android.R.attr.transitionVisibilityMode};
    static final int[] getHighSpeedVideoFpsRanges = {android.R.attr.fadingMode};
    static final int[] getHighSpeedVideoFpsRangesFor = {android.R.attr.reparent, android.R.attr.reparentWithOverlay};
    static final int[] getHighSpeedVideoSizesFor = {android.R.attr.slideEdge};
    static final int[] getInputSizeshNQ4ISI = {android.R.attr.transitionOrdering};
    static final int[] getHighResolutionOutputSizeshNQ4ISI = {android.R.attr.minimumHorizontalAngle, android.R.attr.minimumVerticalAngle, android.R.attr.maximumAngle};
    static final int[] getHighSpeedVideoSizes = {android.R.attr.patternPathData};

    interface ArcMotion {
    }

    interface ChangeBounds {
    }

    interface ChangeTransform {
    }

    interface Fade {
    }

    interface PatternPathMotion {
    }

    interface Slide {
    }

    interface Transition {
    }

    interface TransitionManager {
    }

    interface TransitionSet {
    }

    interface TransitionTarget {
    }

    interface VisibilityTransition {
    }

    private Styleable() {
    }
}
