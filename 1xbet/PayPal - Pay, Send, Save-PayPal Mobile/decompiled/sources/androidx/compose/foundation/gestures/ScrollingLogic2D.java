package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u0012\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0012\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010 JA\u0010\u0012\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020!2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0$\u0012\u0006\u0012\u0004\u0018\u00010%0\"¢\u0006\u0002\b&H\u0086@¢\u0006\u0004\b\u0012\u0010'J/\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010(R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00100R$\u00103\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b2\u0010 R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u00104R\u0016\u0010.\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00106\u001a\u0002088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00109R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010;"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic2D;", "Landroidx/compose/foundation/gestures/ScrollLogic;", "Landroidx/compose/foundation/gestures/Scrollable2DState;", "p0", "Landroidx/compose/foundation/OverscrollEffect;", "p1", "Landroidx/compose/foundation/gestures/FlingBehavior;", "p2", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "p3", "Lkotlin/Function0;", "", "p4", "<init>", "(Landroidx/compose/foundation/gestures/Scrollable2DState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/gestures/Scroll2DScope;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/gestures/Scroll2DScope;JI)J", "getHighSpeedVideoSizes", "(J)Z", "Landroidx/compose/ui/unit/Velocity;", "Camera2StreamConfigurationMap", "performRawScroll-MK-Hz9U", "(J)J", "performRawScroll", "getHighSpeedVideoFpsRanges", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFlingAnimation-QWom1Mo", "doFlingAnimation", "()Z", "Landroidx/compose/foundation/MutatePriority;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/gestures/Scrollable2DState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Z", "Landroidx/compose/foundation/gestures/Scrollable2DState;", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Lkotlin/jvm/functions/Function0;", "Z", "isFlinging", "getInputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getInputFormats", "getOutputFormats", "Landroidx/compose/foundation/gestures/Scroll2DScope;", "Landroidx/compose/foundation/gestures/ScrollingLogic2D$nestedScrollScope$1;", "Landroidx/compose/foundation/gestures/ScrollingLogic2D$nestedScrollScope$1;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScrollingLogic2D implements androidx.compose.foundation.gestures.ScrollLogic {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getInputFormats = androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.FlingBehavior getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public androidx.compose.foundation.gestures.Scrollable2DState Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.OverscrollEffect getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollingLogic2D$nestedScrollScope$1 getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.Scroll2DScope getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getHighSpeedVideoSizes;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic2D$nestedScrollScope$1] */
    public ScrollingLogic2D(androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        androidx.compose.foundation.gestures.Scroll2DScope scroll2DScope;
        this.Camera2StreamConfigurationMap = scrollable2DState;
        this.getHighSpeedVideoFpsRanges = overscrollEffect;
        this.getHighResolutionOutputSizeshNQ4ISI = flingBehavior;
        this.getHighSpeedVideoSizes = nestedScrollDispatcher;
        this.getHighSpeedVideoFpsRangesFor = function0;
        scroll2DScope = androidx.compose.foundation.gestures.Scrollable2DKt.getHighSpeedVideoFpsRangesFor;
        this.getOutputMinFrameDuration = scroll2DScope;
        this.getOutputFormats = new androidx.compose.foundation.gestures.NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic2D$nestedScrollScope$1
            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollBy-OzD1aCk */
            public final long mo1490scrollByOzD1aCk(long offset, int source) {
                androidx.compose.foundation.gestures.Scroll2DScope scroll2DScope2;
                long highSpeedVideoFpsRangesFor;
                scroll2DScope2 = androidx.compose.foundation.gestures.ScrollingLogic2D.this.getOutputMinFrameDuration;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.ScrollingLogic2D.this.getHighSpeedVideoFpsRangesFor(scroll2DScope2, offset, source);
                return highSpeedVideoFpsRangesFor;
            }

            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollByWithOverscroll-OzD1aCk */
            public final long mo1491scrollByWithOverscrollOzD1aCk(long offset, int source) {
                androidx.compose.foundation.OverscrollEffect overscrollEffect2;
                androidx.compose.foundation.gestures.Scroll2DScope scroll2DScope2;
                long highSpeedVideoFpsRangesFor;
                int i;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> function1;
                androidx.compose.foundation.gestures.ScrollingLogic2D.this.getInputFormats = source;
                overscrollEffect2 = androidx.compose.foundation.gestures.ScrollingLogic2D.this.getHighSpeedVideoFpsRanges;
                if (overscrollEffect2 == null || !androidx.compose.foundation.gestures.ScrollingLogic2D.this.getHighSpeedVideoSizes(offset)) {
                    scroll2DScope2 = androidx.compose.foundation.gestures.ScrollingLogic2D.this.getOutputMinFrameDuration;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.ScrollingLogic2D.this.getHighSpeedVideoFpsRangesFor(scroll2DScope2, offset, source);
                    return highSpeedVideoFpsRangesFor;
                }
                i = androidx.compose.foundation.gestures.ScrollingLogic2D.this.getInputFormats;
                function1 = androidx.compose.foundation.gestures.ScrollingLogic2D.this.getHighSpeedVideoSizesFor;
                return overscrollEffect2.mo1266applyToScrollRhakbz0(offset, i, function1);
            }
        };
        this.getHighSpeedVideoSizesFor = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.ScrollingLogic2D$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.ui.geometry.Offset Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.ScrollingLogic2D.Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.ScrollingLogic2D.this, (androidx.compose.ui.geometry.Offset) obj);
                return Camera2StreamConfigurationMap;
            }
        };
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: isFlinging, reason: from getter */
    public final boolean getGetInputSizeshNQ4ISI() {
        return this.getInputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Offset Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.ScrollingLogic2D scrollingLogic2D, androidx.compose.ui.geometry.Offset offset) {
        return androidx.compose.ui.geometry.Offset.m5741boximpl(scrollingLogic2D.getHighSpeedVideoFpsRangesFor(scrollingLogic2D.getOutputMinFrameDuration, offset.m5762unboximpl(), scrollingLogic2D.getInputFormats));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.Scroll2DScope scroll2DScope, long j, int i) {
        long m7110dispatchPreScrollOzD1aCk = this.getHighSpeedVideoSizes.m7110dispatchPreScrollOzD1aCk(j, i);
        long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(j, m7110dispatchPreScrollOzD1aCk);
        long mo1438scrollByMKHz9U = scroll2DScope.mo1438scrollByMKHz9U(m5756minusMKHz9U);
        return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m7110dispatchPreScrollOzD1aCk, mo1438scrollByMKHz9U), this.getHighSpeedVideoSizes.m7108dispatchPostScrollDzOQY0M(mo1438scrollByMKHz9U, androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(m5756minusMKHz9U, mo1438scrollByMKHz9U), i));
    }

    public final boolean getHighSpeedVideoSizes(long p0) {
        return this.Camera2StreamConfigurationMap.mo1436canScrollk4lQ0M(p0);
    }

    private boolean Camera2StreamConfigurationMap(long p0) {
        androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState = this.Camera2StreamConfigurationMap;
        float m8839getXimpl = androidx.compose.ui.unit.Velocity.m8839getXimpl(p0);
        return scrollable2DState.mo1436canScrollk4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(androidx.compose.ui.unit.Velocity.m8840getYimpl(p0)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m8839getXimpl) << 32)));
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: performRawScroll-MK-Hz9U */
    public final long mo1522performRawScrollMKHz9U(long p0) {
        if (this.Camera2StreamConfigurationMap.isScrollInProgress()) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        return getHighSpeedVideoFpsRanges(p0);
    }

    private final long getHighSpeedVideoFpsRanges(long p0) {
        return this.Camera2StreamConfigurationMap.mo1437dispatchRawDeltaMKHz9U(p0);
    }

    public final java.lang.Object getHighSpeedVideoFpsRangesFor(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new androidx.compose.foundation.gestures.ScrollingLogic2D$onScrollStopped$performFling$1(this, null);
        androidx.compose.foundation.OverscrollEffect overscrollEffect = this.getHighSpeedVideoFpsRanges;
        if (overscrollEffect != null && Camera2StreamConfigurationMap(j)) {
            java.lang.Object mo1265applyToFlingBMRW4eQ = overscrollEffect.mo1265applyToFlingBMRW4eQ(j, scrollingLogic2D$onScrollStopped$performFling$1, continuation);
            return mo1265applyToFlingBMRW4eQ == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo1265applyToFlingBMRW4eQ : kotlin.Unit.INSTANCE;
        }
        java.lang.Object invoke = scrollingLogic2D$onScrollStopped$performFling$1.invoke(androidx.compose.ui.unit.Velocity.m8830boximpl(j), continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: doFlingAnimation-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1521doFlingAnimationQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1 scrollingLogic2D$doFlingAnimation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        try {
            if (continuation instanceof androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1) {
                scrollingLogic2D$doFlingAnimation$1 = (androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1) continuation;
                if ((scrollingLogic2D$doFlingAnimation$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    scrollingLogic2D$doFlingAnimation$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = scrollingLogic2D$doFlingAnimation$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = scrollingLogic2D$doFlingAnimation$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                        longRef2.element = j;
                        this.getInputSizeshNQ4ISI = true;
                        androidx.compose.foundation.MutatePriority mutatePriority = androidx.compose.foundation.MutatePriority.Default;
                        kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.NestedScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> scrollingLogic2D$doFlingAnimation$2 = new androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2(this, j, longRef2, null);
                        scrollingLogic2D$doFlingAnimation$1.Camera2StreamConfigurationMap = longRef2;
                        scrollingLogic2D$doFlingAnimation$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (getHighSpeedVideoFpsRangesFor(mutatePriority, scrollingLogic2D$doFlingAnimation$2, scrollingLogic2D$doFlingAnimation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        longRef = longRef2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        longRef = (kotlin.jvm.internal.Ref.LongRef) scrollingLogic2D$doFlingAnimation$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.getInputSizeshNQ4ISI = false;
                    return androidx.compose.ui.unit.Velocity.m8830boximpl(longRef.element);
                }
            }
            if (i != 0) {
            }
            this.getInputSizeshNQ4ISI = false;
            return androidx.compose.ui.unit.Velocity.m8830boximpl(longRef.element);
        } catch (java.lang.Throwable th) {
            this.getInputSizeshNQ4ISI = false;
            throw th;
        }
        scrollingLogic2D$doFlingAnimation$1 = new androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1(this, continuation);
        java.lang.Object obj2 = scrollingLogic2D$doFlingAnimation$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic2D$doFlingAnimation$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoSizes(float f, long j) {
        float highSpeedVideoFpsRanges;
        float highSpeedVideoFpsRanges2;
        float highSpeedVideoFpsRanges3;
        highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.Scrollable2DKt.getHighSpeedVideoFpsRanges(j);
        if (!java.lang.Float.isNaN(highSpeedVideoFpsRanges)) {
            highSpeedVideoFpsRanges2 = androidx.compose.foundation.gestures.Scrollable2DKt.getHighSpeedVideoFpsRanges(j);
            float abs = java.lang.Math.abs(((float) java.lang.Math.cos(highSpeedVideoFpsRanges2)) * f);
            float signum = java.lang.Math.signum(androidx.compose.ui.unit.Velocity.m8839getXimpl(j));
            highSpeedVideoFpsRanges3 = androidx.compose.foundation.gestures.Scrollable2DKt.getHighSpeedVideoFpsRanges(j);
            float abs2 = java.lang.Math.abs(((float) java.lang.Math.sin(highSpeedVideoFpsRanges3)) * f);
            float signum2 = java.lang.Math.signum(androidx.compose.ui.unit.Velocity.m8840getYimpl(j));
            return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(abs2 * signum2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(abs * signum) << 32));
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighResolutionOutputSizeshNQ4ISI(float f, long j) {
        float highSpeedVideoFpsRanges;
        float highSpeedVideoFpsRanges2;
        float highSpeedVideoFpsRanges3;
        highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.Scrollable2DKt.getHighSpeedVideoFpsRanges(j);
        if (!java.lang.Float.isNaN(highSpeedVideoFpsRanges)) {
            highSpeedVideoFpsRanges2 = androidx.compose.foundation.gestures.Scrollable2DKt.getHighSpeedVideoFpsRanges(j);
            float abs = java.lang.Math.abs(((float) java.lang.Math.cos(highSpeedVideoFpsRanges2)) * f);
            float signum = java.lang.Math.signum(androidx.compose.ui.unit.Velocity.m8839getXimpl(j));
            highSpeedVideoFpsRanges3 = androidx.compose.foundation.gestures.Scrollable2DKt.getHighSpeedVideoFpsRanges(j);
            return androidx.compose.ui.unit.VelocityKt.Velocity(abs * signum, java.lang.Math.abs(((float) java.lang.Math.sin(highSpeedVideoFpsRanges3)) * f) * java.lang.Math.signum(androidx.compose.ui.unit.Velocity.m8840getYimpl(j)));
        }
        return androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, f);
    }

    public final boolean Camera2StreamConfigurationMap() {
        if (this.Camera2StreamConfigurationMap.isScrollInProgress()) {
            return true;
        }
        androidx.compose.foundation.OverscrollEffect overscrollEffect = this.getHighSpeedVideoFpsRanges;
        return overscrollEffect != null && overscrollEffect.isInProgress();
    }

    public final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.NestedScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll = this.Camera2StreamConfigurationMap.scroll(mutatePriority, new androidx.compose.foundation.gestures.ScrollingLogic2D$scroll$2(this, function2, null), continuation);
        return scroll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : kotlin.Unit.INSTANCE;
    }

    public final boolean Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.Scrollable2DState p0, androidx.compose.foundation.OverscrollEffect p1, androidx.compose.foundation.gestures.FlingBehavior p2, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher p3) {
        boolean z;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, p0)) {
            z = false;
        } else {
            this.Camera2StreamConfigurationMap = p0;
            z = true;
        }
        this.getHighSpeedVideoFpsRanges = p1;
        this.getHighResolutionOutputSizeshNQ4ISI = p2;
        this.getHighSpeedVideoSizes = p3;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRangesFor(long j) {
        return (float) java.lang.Math.sqrt(((float) java.lang.Math.pow(java.lang.Float.intBitsToFloat((int) (j >> 32)), 2.0d)) + ((float) java.lang.Math.pow(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), 2.0d)));
    }
}
