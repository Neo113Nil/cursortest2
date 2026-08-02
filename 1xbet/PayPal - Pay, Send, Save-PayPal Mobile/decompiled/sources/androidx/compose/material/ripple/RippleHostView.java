package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 JK\u0010/\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0+¢\u0006\u0004\b-\u0010.J\r\u00100\u001a\u00020\t¢\u0006\u0004\b0\u0010\u0019J-\u00103\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u0019J\u0017\u00105\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b5\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u00109\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010=R\u0018\u00105\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "l", "t", "r", util.h.xy.cb.b.f1091, "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "refreshDrawableState", "()V", "p0", "getHighSpeedVideoFpsRanges", "(Z)V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "bounded", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "radius", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "addRipple-KOepWvA", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;ZJIJFLkotlin/jvm/functions/Function0;)V", "addRipple", "removeRipple", "setRippleProperties-biQXAtU", "(JIJF)V", "setRippleProperties", "disposeRipple", "getHighSpeedVideoSizes", "Landroidx/compose/material/ripple/UnprojectedRipple;", "getInputFormats", "Landroidx/compose/material/ripple/UnprojectedRipple;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Boolean;", "getHighResolutionOutputSizeshNQ4ISI", "", "Ljava/lang/Long;", "Ljava/lang/Runnable;", "getInputSizeshNQ4ISI", "Ljava/lang/Runnable;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleHostView extends android.view.View {
    private kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.Long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private androidx.compose.material.ripple.UnprojectedRipple getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Runnable getHighSpeedVideoSizes;
    public static final int $stable = 8;
    private static final int[] getHighSpeedVideoSizes = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = new int[0];

    @Override // android.view.View
    protected final void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    public RippleHostView(android.content.Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            disposeRipple();
        } else {
            super.draw(canvas);
        }
    }

    private final void getHighSpeedVideoFpsRanges(boolean p0) {
        androidx.compose.material.ripple.UnprojectedRipple unprojectedRipple = new androidx.compose.material.ripple.UnprojectedRipple(p0);
        setBackground(unprojectedRipple);
        this.getHighSpeedVideoFpsRanges = unprojectedRipple;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable who) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.Camera2StreamConfigurationMap;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m2857addRippleKOepWvA(androidx.compose.foundation.interaction.PressInteraction.Press interaction, boolean bounded, long size, int radius, long color, float alpha, kotlin.jvm.functions.Function0<kotlin.Unit> onInvalidateRipple) {
        if (this.getHighSpeedVideoFpsRanges == null || !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.valueOf(bounded), this.getHighResolutionOutputSizeshNQ4ISI)) {
            getHighSpeedVideoFpsRanges(bounded);
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Boolean.valueOf(bounded);
        }
        androidx.compose.material.ripple.UnprojectedRipple unprojectedRipple = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(unprojectedRipple);
        this.Camera2StreamConfigurationMap = onInvalidateRipple;
        m2858setRipplePropertiesbiQXAtU(size, radius, color, alpha);
        if (bounded) {
            unprojectedRipple.setHotspot(androidx.compose.ui.geometry.Offset.m5752getXimpl(interaction.getPressPosition()), androidx.compose.ui.geometry.Offset.m5753getYimpl(interaction.getPressPosition()));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        getHighSpeedVideoSizes(true);
    }

    public final void removeRipple() {
        getHighSpeedVideoSizes(false);
    }

    /* renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m2858setRipplePropertiesbiQXAtU(long size, int radius, long color, float alpha) {
        androidx.compose.material.ripple.UnprojectedRipple unprojectedRipple = this.getHighSpeedVideoFpsRanges;
        if (unprojectedRipple == null) {
            return;
        }
        unprojectedRipple.getHighSpeedVideoFpsRangesFor(radius);
        unprojectedRipple.Camera2StreamConfigurationMap(color, alpha);
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m5821getWidthimpl(size)), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m5818getHeightimpl(size)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }

    public final void disposeRipple() {
        this.Camera2StreamConfigurationMap = null;
        java.lang.Runnable runnable = this.getHighSpeedVideoSizes;
        if (runnable != null) {
            removeCallbacks(runnable);
            java.lang.Runnable runnable2 = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(runnable2);
            runnable2.run();
        } else {
            androidx.compose.material.ripple.UnprojectedRipple unprojectedRipple = this.getHighSpeedVideoFpsRanges;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(getHighResolutionOutputSizeshNQ4ISI);
            }
        }
        androidx.compose.material.ripple.UnprojectedRipple unprojectedRipple2 = this.getHighSpeedVideoFpsRanges;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    private final void getHighSpeedVideoSizes(boolean p0) {
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        java.lang.Runnable runnable = this.getHighSpeedVideoSizes;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        java.lang.Long l = this.getHighSpeedVideoFpsRangesFor;
        long longValue = l != null ? l.longValue() : 0L;
        if (!p0 && currentAnimationTimeMillis - longValue < 5) {
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: androidx.compose.material.ripple.RippleHostView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.material.ripple.RippleHostView.getHighSpeedVideoFpsRanges(androidx.compose.material.ripple.RippleHostView.this);
                }
            };
            this.getHighSpeedVideoSizes = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            int[] iArr = p0 ? getHighSpeedVideoSizes : getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.material.ripple.UnprojectedRipple unprojectedRipple = this.getHighSpeedVideoFpsRanges;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        }
        this.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(androidx.compose.material.ripple.RippleHostView rippleHostView) {
        androidx.compose.material.ripple.UnprojectedRipple unprojectedRipple = rippleHostView.getHighSpeedVideoFpsRanges;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(getHighResolutionOutputSizeshNQ4ISI);
        }
        rippleHostView.getHighSpeedVideoSizes = null;
    }
}
