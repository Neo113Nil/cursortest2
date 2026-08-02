package com.google.android.material.motion;

/* loaded from: classes8.dex */
public abstract class MaterialBackAnimationHelper<V extends android.view.View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final java.lang.String TAG = "MaterialBackHelper";
    private androidx.view.BackEventCompat backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;
    private final android.animation.TimeInterpolator progressInterpolator;
    protected final V view;

    public MaterialBackAnimationHelper(V v) {
        this.view = v;
        android.content.Context context = v.getContext();
        this.progressInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(context, com.google.android.material.R.attr.motionEasingStandardDecelerateInterpolator, androidx.core.view.animation.PathInterpolatorCompat.create(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = com.google.android.material.motion.MotionUtils.resolveThemeDuration(context, com.google.android.material.R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = com.google.android.material.motion.MotionUtils.resolveThemeDuration(context, com.google.android.material.R.attr.motionDurationShort3, 150);
        this.cancelDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(context, com.google.android.material.R.attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f) {
        return this.progressInterpolator.getInterpolation(f);
    }

    protected void onStartBackProgress(androidx.view.BackEventCompat backEventCompat) {
        this.backEvent = backEventCompat;
    }

    protected androidx.view.BackEventCompat onUpdateBackProgress(androidx.view.BackEventCompat backEventCompat) {
        androidx.view.BackEventCompat backEventCompat2 = this.backEvent;
        this.backEvent = backEventCompat;
        return backEventCompat2;
    }

    public androidx.view.BackEventCompat onHandleBackInvoked() {
        androidx.view.BackEventCompat backEventCompat = this.backEvent;
        this.backEvent = null;
        return backEventCompat;
    }

    protected androidx.view.BackEventCompat onCancelBackProgress() {
        androidx.view.BackEventCompat backEventCompat = this.backEvent;
        this.backEvent = null;
        return backEventCompat;
    }
}
