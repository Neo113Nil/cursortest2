package androidx.compose.material.ripple;

/* compiled from: RippleAnimation.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\"\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0011\u0010#\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010&\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0006\u0010'\u001a\u00020\u0019J\u001f\u0010(\u001a\u00020\u0019*\u00020)2\u0006\u0010*\u001a\u00020+ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001eR\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 R\u0019\u0010!\u001a\u0004\u0018\u00010\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "origin", "Landroidx/compose/ui/geometry/Offset;", com.helpshift.proactive.InAppViewConstants.RADIUS, "Landroidx/compose/ui/unit/Dp;", "bounded", "", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedCenterPercent", "animatedRadiusPercent", "<set-?>", "finishRequested", "getFinishRequested", "()Z", "setFinishRequested", "(Z)V", "finishRequested$delegate", "Landroidx/compose/runtime/MutableState;", "finishSignalDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "finishedFadingIn", "getFinishedFadingIn", "setFinishedFadingIn", "finishedFadingIn$delegate", "F", "startRadius", "Ljava/lang/Float;", "targetCenter", "targetRadius", com.helpshift.proactive.InAppViewConstants.ANIMATE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fadeIn", "fadeOut", "finish", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "color", "Landroidx/compose/ui/graphics/Color;", "draw-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleAnimation {
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatedAlpha;
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatedCenterPercent;
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;

    /* renamed from: finishRequested$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState finishRequested;
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> finishSignalDeferred;

    /* renamed from: finishedFadingIn$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState finishedFadingIn;
    private androidx.compose.ui.geometry.Offset origin;
    private final float radius;
    private java.lang.Float startRadius;
    private androidx.compose.ui.geometry.Offset targetCenter;
    private java.lang.Float targetRadius;

    public /* synthetic */ RippleAnimation(androidx.compose.ui.geometry.Offset offset, float f, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(offset, f, z);
    }

    private RippleAnimation(androidx.compose.ui.geometry.Offset offset, float f, boolean z) {
        this.origin = offset;
        this.radius = f;
        this.bounded = z;
        this.animatedAlpha = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred((kotlinx.coroutines.Job) null);
        this.finishedFadingIn = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.finishRequested = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishedFadingIn() {
        return ((java.lang.Boolean) this.finishedFadingIn.getValue()).booleanValue();
    }

    private final void setFinishedFadingIn(boolean z) {
        this.finishedFadingIn.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishRequested() {
        return ((java.lang.Boolean) this.finishRequested.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z) {
        this.finishRequested.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object animate(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.ripple.RippleAnimation$animate$1 rippleAnimation$animate$1;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.compose.material.ripple.RippleAnimation rippleAnimation;
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred;
        if (continuation instanceof androidx.compose.material.ripple.RippleAnimation$animate$1) {
            rippleAnimation$animate$1 = (androidx.compose.material.ripple.RippleAnimation$animate$1) continuation;
            if ((rippleAnimation$animate$1.label & Integer.MIN_VALUE) != 0) {
                rippleAnimation$animate$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = rippleAnimation$animate$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rippleAnimation$animate$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    rippleAnimation$animate$1.L$0 = this;
                    rippleAnimation$animate$1.label = 1;
                    if (fadeIn(rippleAnimation$animate$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    rippleAnimation = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rippleAnimation = (androidx.compose.material.ripple.RippleAnimation) rippleAnimation$animate$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        rippleAnimation$animate$1.L$0 = null;
                        rippleAnimation$animate$1.label = 3;
                        if (rippleAnimation.fadeOut(rippleAnimation$animate$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    rippleAnimation = (androidx.compose.material.ripple.RippleAnimation) rippleAnimation$animate$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                rippleAnimation.setFinishedFadingIn(true);
                completableDeferred = rippleAnimation.finishSignalDeferred;
                rippleAnimation$animate$1.L$0 = rippleAnimation;
                rippleAnimation$animate$1.label = 2;
                if (completableDeferred.await(rippleAnimation$animate$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rippleAnimation$animate$1.L$0 = null;
                rippleAnimation$animate$1.label = 3;
                if (rippleAnimation.fadeOut(rippleAnimation$animate$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        rippleAnimation$animate$1 = new androidx.compose.material.ripple.RippleAnimation$animate$1(this, continuation);
        java.lang.Object obj2 = rippleAnimation$animate$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rippleAnimation$animate$1.label;
        if (i != 0) {
        }
        rippleAnimation.setFinishedFadingIn(true);
        completableDeferred = rippleAnimation.finishSignalDeferred;
        rippleAnimation$animate$1.L$0 = rippleAnimation;
        rippleAnimation$animate$1.label = 2;
        if (completableDeferred.await(rippleAnimation$animate$1) == coroutine_suspended) {
        }
        rippleAnimation$animate$1.L$0 = null;
        rippleAnimation$animate$1.label = 3;
        if (rippleAnimation.fadeOut(rippleAnimation$animate$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object fadeIn(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.material.ripple.RippleAnimation$fadeIn$2(this, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object fadeOut(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.material.ripple.RippleAnimation$fadeOut$2(this, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.complete(kotlin.Unit.INSTANCE);
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m1594draw4WTKRHQ(androidx.compose.ui.graphics.drawscope.DrawScope draw, long j) {
        java.lang.Float valueOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(draw, "$this$draw");
        if (this.startRadius == null) {
            this.startRadius = java.lang.Float.valueOf(androidx.compose.material.ripple.RippleAnimationKt.m1596getRippleStartRadiusuvyYCjk(draw.mo2592getSizeNHjbRc()));
        }
        if (this.targetRadius == null) {
            if (java.lang.Float.isNaN(this.radius)) {
                valueOf = java.lang.Float.valueOf(androidx.compose.material.ripple.RippleAnimationKt.m1595getRippleEndRadiuscSwnlzA(draw, this.bounded, draw.mo2592getSizeNHjbRc()));
            } else {
                valueOf = java.lang.Float.valueOf(draw.mo315toPx0680j_4(this.radius));
            }
            this.targetRadius = valueOf;
        }
        if (this.origin == null) {
            this.origin = androidx.compose.ui.geometry.Offset.m1860boximpl(draw.mo2591getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Size.m1940getWidthimpl(draw.mo2592getSizeNHjbRc()) / 2.0f, androidx.compose.ui.geometry.Size.m1937getHeightimpl(draw.mo2592getSizeNHjbRc()) / 2.0f));
        }
        float floatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        java.lang.Float f = this.startRadius;
        kotlin.jvm.internal.Intrinsics.checkNotNull(f);
        float floatValue2 = f.floatValue();
        java.lang.Float f2 = this.targetRadius;
        kotlin.jvm.internal.Intrinsics.checkNotNull(f2);
        float lerp = androidx.compose.ui.util.MathHelpersKt.lerp(floatValue2, f2.floatValue(), this.animatedRadiusPercent.getValue().floatValue());
        androidx.compose.ui.geometry.Offset offset = this.origin;
        kotlin.jvm.internal.Intrinsics.checkNotNull(offset);
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(offset.getPackedValue());
        androidx.compose.ui.geometry.Offset offset2 = this.targetCenter;
        kotlin.jvm.internal.Intrinsics.checkNotNull(offset2);
        float lerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(m1871getXimpl, androidx.compose.ui.geometry.Offset.m1871getXimpl(offset2.getPackedValue()), this.animatedCenterPercent.getValue().floatValue());
        androidx.compose.ui.geometry.Offset offset3 = this.origin;
        kotlin.jvm.internal.Intrinsics.checkNotNull(offset3);
        float m1872getYimpl = androidx.compose.ui.geometry.Offset.m1872getYimpl(offset3.getPackedValue());
        androidx.compose.ui.geometry.Offset offset4 = this.targetCenter;
        kotlin.jvm.internal.Intrinsics.checkNotNull(offset4);
        long Offset = androidx.compose.ui.geometry.OffsetKt.Offset(lerp2, androidx.compose.ui.util.MathHelpersKt.lerp(m1872getYimpl, androidx.compose.ui.geometry.Offset.m1872getYimpl(offset4.getPackedValue()), this.animatedCenterPercent.getValue().floatValue()));
        long m2112copywmQWz5c$default = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(j, androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (this.bounded) {
            float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(draw.mo2592getSizeNHjbRc());
            float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(draw.mo2592getSizeNHjbRc());
            int m2102getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2102getIntersectrtfAjoo();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = draw.getDrawContext();
            long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo2601clipRectN_I0leg(0.0f, 0.0f, m1940getWidthimpl, m1937getHeightimpl, m2102getIntersectrtfAjoo);
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(draw, m2112copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
            drawContext.getCanvas().restore();
            drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
            return;
        }
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(draw, m2112copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
    }
}
