package com.zettle.sdk.common.ui.transitions;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/common/ui/transitions/ReverseInterpolator;", "Landroid/view/animation/Interpolator;", "delegate", "<init>", "(Landroid/view/animation/Interpolator;)V", "", "input", "getInterpolation", "(F)F", "getHighSpeedVideoFpsRanges", "Landroid/view/animation/Interpolator;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReverseInterpolator implements android.view.animation.Interpolator {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.view.animation.Interpolator getHighSpeedVideoSizes;

    public ReverseInterpolator(android.view.animation.Interpolator interpolator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interpolator, "");
        this.getHighSpeedVideoSizes = interpolator;
    }

    public /* synthetic */ ReverseInterpolator(android.view.animation.AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.view.animation.AccelerateDecelerateInterpolator() : accelerateDecelerateInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float input) {
        return 1.0f - this.getHighSpeedVideoSizes.getInterpolation(input);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReverseInterpolator() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
