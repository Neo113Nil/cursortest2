package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\b"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/AnimatedDrawableUtil;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "restartDrawableAnimation", "(Landroid/graphics/drawable/Drawable;)V", "", "resId", "Landroid/content/Context;", "context", "Landroid/widget/ImageView;", "drawableHolder", "Lkotlin/Function0;", "onAnimationComplete", "setAndAnimateDrawable", "(ILandroid/content/Context;Landroid/widget/ImageView;Lkotlin/jvm/functions/Function0;)V", "unregisterDrawableAnimationCallbacks"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnimatedDrawableUtil {
    public static final com.miteksystems.misnap.workflow.util.AnimatedDrawableUtil INSTANCE = new com.miteksystems.misnap.workflow.util.AnimatedDrawableUtil();

    @kotlin.jvm.JvmStatic
    public static final void setAndAnimateDrawable(int i, android.content.Context context, android.widget.ImageView imageView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "");
        setAndAnimateDrawable$default(i, context, imageView, null, 8, null);
    }

    @kotlin.jvm.JvmStatic
    public static final void setAndAnimateDrawable(int resId, android.content.Context context, android.widget.ImageView drawableHolder, kotlin.jvm.functions.Function0<kotlin.Unit> onAnimationComplete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawableHolder, "");
        android.graphics.drawable.Drawable drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(context, resId);
        if (drawable instanceof android.graphics.drawable.AnimatedVectorDrawable) {
            drawableHolder.setImageDrawable(drawable);
            android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable = (android.graphics.drawable.AnimatedVectorDrawable) drawable;
            animatedVectorDrawable.start();
            if (onAnimationComplete != null) {
                animatedVectorDrawable.registerAnimationCallback(new com.miteksystems.misnap.workflow.util.AnimatedDrawableUtil.a(drawable, onAnimationComplete));
                return;
            }
            return;
        }
        boolean z = drawable instanceof androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
        drawableHolder.setImageDrawable(drawable);
        if (!z) {
            if (onAnimationComplete != null) {
                onAnimationComplete.invoke();
            }
        } else {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) drawable;
            animatedVectorDrawableCompat.start();
            if (onAnimationComplete != null) {
                animatedVectorDrawableCompat.registerAnimationCallback(new com.miteksystems.misnap.workflow.util.AnimatedDrawableUtil.b(drawable, onAnimationComplete));
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void unregisterDrawableAnimationCallbacks(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        if (drawable instanceof androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) {
            ((androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) drawable).clearAnimationCallbacks();
        } else if (drawable instanceof android.graphics.drawable.AnimatedVectorDrawable) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    public static /* synthetic */ void setAndAnimateDrawable$default(int i, android.content.Context context, android.widget.ImageView imageView, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        setAndAnimateDrawable(i, context, imageView, function0);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/AnimatedDrawableUtil$a;", "Landroid/graphics/drawable/Animatable2$AnimationCallback;", "Landroid/graphics/drawable/Drawable;", "_drawable", "", "onAnimationEnd", "(Landroid/graphics/drawable/Drawable;)V"}, k = 1, mv = {1, 8, 0})
    public static final class a extends android.graphics.drawable.Animatable2.AnimationCallback {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.graphics.drawable.Drawable getHighSpeedVideoSizes;

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public final void onAnimationEnd(android.graphics.drawable.Drawable _drawable) {
            super.onAnimationEnd(_drawable);
            ((android.graphics.drawable.AnimatedVectorDrawable) this.getHighSpeedVideoSizes).clearAnimationCallbacks();
            this.getHighSpeedVideoFpsRanges.invoke();
        }

        a(android.graphics.drawable.Drawable drawable, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            this.getHighSpeedVideoSizes = drawable;
            this.getHighSpeedVideoFpsRanges = function0;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/AnimatedDrawableUtil$b;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "Landroid/graphics/drawable/Drawable;", "_drawable", "", "onAnimationEnd", "(Landroid/graphics/drawable/Drawable;)V"}, k = 1, mv = {1, 8, 0})
    public static final class b extends androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.graphics.drawable.Drawable getHighSpeedVideoSizes;

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(android.graphics.drawable.Drawable _drawable) {
            super.onAnimationEnd(_drawable);
            ((androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) this.getHighSpeedVideoSizes).clearAnimationCallbacks();
            this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        }

        b(android.graphics.drawable.Drawable drawable, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            this.getHighSpeedVideoSizes = drawable;
            this.getHighResolutionOutputSizeshNQ4ISI = function0;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void restartDrawableAnimation(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        if (drawable instanceof androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) drawable;
            animatedVectorDrawableCompat.stop();
            animatedVectorDrawableCompat.start();
        } else if (drawable instanceof android.graphics.drawable.AnimatedVectorDrawable) {
            android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable = (android.graphics.drawable.AnimatedVectorDrawable) drawable;
            animatedVectorDrawable.stop();
            animatedVectorDrawable.start();
        }
    }

    private AnimatedDrawableUtil() {
    }
}
