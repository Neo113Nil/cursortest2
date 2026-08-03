package androidx.compose.foundation.gestures;

/* compiled from: TransformableState.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0000\u001a\u00020\u00012K\u0010\u0002\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003\u001aZ\u0010\f\u001a\u00020\u00012K\u0010\u0002\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003H\u0007¢\u0006\u0002\u0010\r\u001a/\u0010\u000e\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a*\u0010\u0014\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086@¢\u0006\u0002\u0010\u0016\u001a*\u0010\u0017\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0086@¢\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001a\u0010\u001c\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001e\u001a\u00020\u000b*\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 H\u0086@¢\u0006\u0002\u0010!\u001a\u001a\u0010\"\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"TransformableState", "Landroidx/compose/foundation/gestures/TransformableState;", "onTransformation", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "", "rememberTransformableState", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TransformableState;", "animatePanBy", "offset", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "animatePanBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/TransformableState;JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateRotateBy", "degrees", "(Landroidx/compose/foundation/gestures/TransformableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateZoomBy", "zoomFactor", "panBy", "panBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/TransformableState;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rotateBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopTransformation", "terminationPriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/gestures/TransformableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "zoomBy", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformableStateKt {
    public static final androidx.compose.foundation.gestures.TransformableState TransformableState(kotlin.jvm.functions.Function3<? super java.lang.Float, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Float, kotlin.Unit> function3) {
        return new androidx.compose.foundation.gestures.DefaultTransformableState(function3);
    }

    public static final androidx.compose.foundation.gestures.TransformableState rememberTransformableState(kotlin.jvm.functions.Function3<? super java.lang.Float, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Float, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1681419281);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberTransformableState)117@5191L38,118@5241L80:TransformableState.kt#8bwon0");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1681419281, i, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:116)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function3, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = TransformableState(new kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.ui.geometry.Offset, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f, androidx.compose.ui.geometry.Offset offset, java.lang.Float f2) {
                    m429invoked4ec7I(f.floatValue(), offset.getPackedValue(), f2.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m429invoked4ec7I(float f, long j, float f2) {
                    rememberUpdatedState.getValue().invoke(java.lang.Float.valueOf(f), androidx.compose.ui.geometry.Offset.m1860boximpl(j), java.lang.Float.valueOf(f2));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.gestures.TransformableState transformableState = (androidx.compose.foundation.gestures.TransformableState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transformableState;
    }

    public static /* synthetic */ java.lang.Object animateZoomBy$default(androidx.compose.foundation.gestures.TransformableState transformableState, float f, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            animationSpec = new androidx.compose.animation.core.SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f, animationSpec, continuation);
    }

    public static final java.lang.Object animateZoomBy(androidx.compose.foundation.gestures.TransformableState transformableState, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("zoom value should be greater than 0".toString());
        }
        kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        floatRef.element = 1.0f;
        java.lang.Object transform$default = androidx.compose.foundation.gestures.TransformableState.CC.transform$default(transformableState, null, new androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3(floatRef, f, animationSpec, null), continuation, 1, null);
        return transform$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? transform$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object animateRotateBy$default(androidx.compose.foundation.gestures.TransformableState transformableState, float f, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            animationSpec = new androidx.compose.animation.core.SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f, animationSpec, continuation);
    }

    public static final java.lang.Object animateRotateBy(androidx.compose.foundation.gestures.TransformableState transformableState, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object transform$default = androidx.compose.foundation.gestures.TransformableState.CC.transform$default(transformableState, null, new androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2(new kotlin.jvm.internal.Ref.FloatRef(), f, animationSpec, null), continuation, 1, null);
        return transform$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? transform$default : kotlin.Unit.INSTANCE;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m427animatePanByubNVwUQ$default(androidx.compose.foundation.gestures.TransformableState transformableState, long j, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            animationSpec = new androidx.compose.animation.core.SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m426animatePanByubNVwUQ(transformableState, j, animationSpec, continuation);
    }

    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final java.lang.Object m426animatePanByubNVwUQ(androidx.compose.foundation.gestures.TransformableState transformableState, long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Ref.LongRef longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        java.lang.Object transform$default = androidx.compose.foundation.gestures.TransformableState.CC.transform$default(transformableState, null, new androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2(longRef, j, animationSpec, null), continuation, 1, null);
        return transform$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? transform$default : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object zoomBy(androidx.compose.foundation.gestures.TransformableState transformableState, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object transform$default = androidx.compose.foundation.gestures.TransformableState.CC.transform$default(transformableState, null, new androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2(f, null), continuation, 1, null);
        return transform$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? transform$default : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object rotateBy(androidx.compose.foundation.gestures.TransformableState transformableState, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object transform$default = androidx.compose.foundation.gestures.TransformableState.CC.transform$default(transformableState, null, new androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2(f, null), continuation, 1, null);
        return transform$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? transform$default : kotlin.Unit.INSTANCE;
    }

    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final java.lang.Object m428panByd4ec7I(androidx.compose.foundation.gestures.TransformableState transformableState, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object transform$default = androidx.compose.foundation.gestures.TransformableState.CC.transform$default(transformableState, null, new androidx.compose.foundation.gestures.TransformableStateKt$panBy$2(j, null), continuation, 1, null);
        return transform$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? transform$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object stopTransformation$default(androidx.compose.foundation.gestures.TransformableState transformableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, continuation);
    }

    public static final java.lang.Object stopTransformation(androidx.compose.foundation.gestures.TransformableState transformableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object transform = transformableState.transform(mutatePriority, new androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2(null), continuation);
        return transform == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? transform : kotlin.Unit.INSTANCE;
    }
}
