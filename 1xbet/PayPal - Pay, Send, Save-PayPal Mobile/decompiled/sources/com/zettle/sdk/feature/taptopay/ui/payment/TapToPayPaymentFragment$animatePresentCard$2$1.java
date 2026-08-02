package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentFragment$animatePresentCard$2$1;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "onAnimationEnd", "(Landroid/graphics/drawable/Drawable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayPaymentFragment$animatePresentCard$2$1 extends androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback {
    final /* synthetic */ androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment getHighSpeedVideoFpsRangesFor;

    TapToPayPaymentFragment$animatePresentCard$2$1(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment tapToPayPaymentFragment, androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
        this.getHighSpeedVideoFpsRangesFor = tapToPayPaymentFragment;
        this.Camera2StreamConfigurationMap = animatedVectorDrawableCompat;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView;
        super.onAnimationEnd(drawable);
        imageView = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
        if (imageView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.Camera2StreamConfigurationMap;
        imageView.postOnAnimation(new java.lang.Runnable() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$animatePresentCard$2$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentFragment$animatePresentCard$2$1.m23178$r8$lambda$d4wZylj_CYle3CgaMFZFi9T31s(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this);
            }
        });
    }

    /* renamed from: $r8$lambda$-d4wZylj_CYle3CgaMFZFi9T31s, reason: not valid java name */
    public static /* synthetic */ void m23178$r8$lambda$d4wZylj_CYle3CgaMFZFi9T31s(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVectorDrawableCompat, "");
        if (animatedVectorDrawableCompat.isRunning()) {
            return;
        }
        animatedVectorDrawableCompat.start();
    }
}
