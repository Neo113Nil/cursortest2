package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012\u001a\u001c\u0010\u0016\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\"&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u00188\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0018\u0010!\u001a\u00020\u0005*\u00020\b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u001a\u0010$\u001a\u00020#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u001a\u0010)\u001a\u00020(8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "scrollable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/ui/geometry/Offset;", "p0", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/gestures/ScrollingLogic;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerType;", "CanDragCalculation", "Lkotlin/jvm/functions/Function1;", "getCanDragCalculation", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/foundation/gestures/ScrollScope;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/gestures/ScrollScope;", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/gestures/FlingBehavior;)Z", "Landroidx/compose/ui/MotionDurationScale;", "DefaultScrollMotionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "getDefaultScrollMotionDurationScale", "()Landroidx/compose/ui/MotionDurationScale;", "Landroidx/compose/ui/unit/Density;", "UnityDensity", "Landroidx/compose/ui/unit/Density;", "getUnityDensity", "()Landroidx/compose/ui/unit/Density;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableKt {
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> CanDragCalculation = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.ScrollableKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            boolean highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.ScrollableKt.getHighSpeedVideoFpsRanges((androidx.compose.ui.input.pointer.PointerType) obj);
            return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
        }
    };
    private static final androidx.compose.foundation.gestures.ScrollScope getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.gestures.ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public final float scrollBy(float pixels) {
            return pixels;
        }
    };
    private static final androidx.compose.ui.MotionDurationScale DefaultScrollMotionDurationScale = new androidx.compose.ui.MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // androidx.compose.ui.MotionDurationScale
        public final float getScaleFactor() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final /* bridge */ <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.MotionDurationScale.DefaultImpls.fold(this, r, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final /* bridge */ <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) androidx.compose.ui.MotionDurationScale.DefaultImpls.get(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public final /* bridge */ kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
            return androidx.compose.ui.MotionDurationScale.DefaultImpls.minusKey(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final /* bridge */ kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
            return androidx.compose.ui.MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
        }
    };
    private static final androidx.compose.ui.unit.Density UnityDensity = new androidx.compose.ui.unit.Density() { // from class: androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1
        @Override // androidx.compose.ui.unit.Density
        /* renamed from: getDensity */
        public final float getGetHighResolutionOutputSizeshNQ4ISI() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: getFontScale */
        public final float getGetHighSpeedVideoFpsRangesFor() {
            return 1.0f;
        }
    };

    public static /* synthetic */ androidx.compose.ui.Modifier scrollable$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z3, z2, (i & 16) != 0 ? null : flingBehavior, (i & 32) != 0 ? null : mutableInteractionSource);
    }

    public static final androidx.compose.ui.Modifier scrollable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        return scrollable$default(modifier, scrollableState, orientation, null, z, z2, flingBehavior, mutableInteractionSource, null, 128, null);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier scrollable$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec, int i, java.lang.Object obj) {
        return scrollable(modifier, scrollableState, orientation, overscrollEffect, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : flingBehavior, (i & 64) != 0 ? null : mutableInteractionSource, (i & 128) != 0 ? null : bringIntoViewSpec);
    }

    public static final androidx.compose.ui.Modifier scrollable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean z, boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        return modifier.then(new androidx.compose.foundation.gestures.ScrollableElement(scrollableState, orientation, overscrollEffect, z, z2, flingBehavior, mutableInteractionSource, bringIntoViewSpec));
    }

    public static final kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> getCanDragCalculation() {
        return CanDragCalculation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.input.pointer.PointerType pointerType) {
        return !(pointerType == null ? false : androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(pointerType.getGetHighResolutionOutputSizeshNQ4ISI(), androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7304getMouseT8wyACA()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.FlingBehavior flingBehavior) {
        return !(flingBehavior instanceof androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior);
    }

    public static final androidx.compose.ui.MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    public static final androidx.compose.ui.unit.Density getUnityDensity() {
        return UnityDensity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoSizes(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> continuation) {
        androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 scrollableKt$semanticsScrollBy$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        if (continuation instanceof androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1) {
            scrollableKt$semanticsScrollBy$1 = (androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1) continuation;
            if ((scrollableKt$semanticsScrollBy$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                scrollableKt$semanticsScrollBy$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = scrollableKt$semanticsScrollBy$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollableKt$semanticsScrollBy$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                    androidx.compose.foundation.MutatePriority mutatePriority = androidx.compose.foundation.MutatePriority.Default;
                    androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2(scrollingLogic, j, floatRef, null);
                    scrollableKt$semanticsScrollBy$1.Camera2StreamConfigurationMap = scrollingLogic;
                    scrollableKt$semanticsScrollBy$1.getHighSpeedVideoFpsRangesFor = floatRef;
                    scrollableKt$semanticsScrollBy$1.getHighSpeedVideoFpsRanges = 1;
                    if (scrollingLogic.scroll(mutatePriority, scrollableKt$semanticsScrollBy$2, scrollableKt$semanticsScrollBy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.FloatRef floatRef2 = (kotlin.jvm.internal.Ref.FloatRef) scrollableKt$semanticsScrollBy$1.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic2 = (androidx.compose.foundation.gestures.ScrollingLogic) scrollableKt$semanticsScrollBy$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    floatRef = floatRef2;
                    scrollingLogic = scrollingLogic2;
                }
                return androidx.compose.ui.geometry.Offset.m5741boximpl(scrollingLogic.m1538toOffsettuRUvjQ(floatRef.element));
            }
        }
        scrollableKt$semanticsScrollBy$1 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1(continuation);
        java.lang.Object obj2 = scrollableKt$semanticsScrollBy$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollableKt$semanticsScrollBy$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return androidx.compose.ui.geometry.Offset.m5741boximpl(scrollingLogic.m1538toOffsettuRUvjQ(floatRef.element));
    }
}
