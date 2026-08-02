package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0018\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u001b\u001a\u00020\u0015*\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001e\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010 \u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u001dJ\u0011\u0010#\u001a\u00020!*\u00020\u0014¢\u0006\u0004\b\"\u0010\u0017J\u0013\u0010$\u001a\u00020\u0014*\u00020!H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u0013\u0010%\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\b%\u0010\u001aJ\u001b\u0010'\u001a\u00020!*\u00020!2\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u00020\u0014*\u00020\u0014¢\u0006\u0004\b)\u0010*J\u0011\u0010)\u001a\u00020\u0015*\u00020\u0015¢\u0006\u0004\b+\u0010\u001aJ#\u0010'\u001a\u00020\u0015*\u00020,2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b'\u0010/J\u0017\u00102\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u0010\u001aJ\u0017\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010\u001aJ \u00108\u001a\u0002052\u0006\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\nH\u0086@¢\u0006\u0004\b6\u00107J\u0018\u0010<\u001a\u00020!2\u0006\u00109\u001a\u00020!H\u0096@¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020\n¢\u0006\u0004\b=\u0010>JC\u00100\u001a\u0002052\b\b\u0002\u0010@\u001a\u00020?2'\u0010F\u001a#\b\u0001\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u0002050C\u0012\u0006\u0012\u0004\u0018\u00010D0A¢\u0006\u0002\bEH\u0086@¢\u0006\u0004\b0\u0010GJ?\u0010H\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010>R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010SR\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010$\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010YR\u0016\u0010\\\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010]R$\u0010^\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b^\u0010X\u001a\u0004\b^\u0010>R\u0016\u0010U\u001a\u00020-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010_R\u0016\u0010P\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010`\u001a\u00020b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010cR \u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010eR\u0014\u0010W\u001a\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010>"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollLogic;", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseDirection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/foundation/gestures/OnScrollChangedDispatcher;", "onScrollChangedDispatcher", "Lkotlin/Function0;", "isScrollableNodeAttached", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/foundation/gestures/OnScrollChangedDispatcher;Lkotlin/jvm/functions/Function0;)V", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "singleAxisOffset-MK-Hz9U", "(J)J", "singleAxisOffset", "toFloat-k-4lQ0M", "(J)F", "toFloat", "toSingleAxisDeltaFromAngle-k-4lQ0M", "toSingleAxisDeltaFromAngle", "Landroidx/compose/ui/unit/Velocity;", "toVelocity-adjELrA", "toVelocity", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(JF)J", "reverseIfNeeded", "(F)F", "reverseIfNeeded-MK-Hz9U", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "p1", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "scroll", "performRawScroll-MK-Hz9U", "performRawScroll", "initialVelocity", "isMouseWheel", "", "onScrollStopped-BMRW4eQ", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onScrollStopped", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFlingAnimation", "shouldScrollImmediately", "()Z", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Z", "isVertical", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "setScrollableState", "(Landroidx/compose/foundation/gestures/ScrollableState;)V", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/OverscrollEffect;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Landroidx/compose/foundation/gestures/Orientation;", "getOutputSizes", "Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getOutputMinFrameDuration", "Landroidx/compose/foundation/gestures/OnScrollChangedDispatcher;", "getInputFormats", "Lkotlin/jvm/functions/Function0;", "isFlinging", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1;", "Landroidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOutputStallDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollingLogic implements androidx.compose.foundation.gestures.ScrollLogic {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getOutputFormats = androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.FlingBehavior getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1 getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.OverscrollEffect getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> getOutputStallDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.ScrollScope getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.Orientation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.OnScrollChangedDispatcher getInputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean isFlinging;
    private androidx.compose.foundation.gestures.ScrollableState scrollableState;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, androidx.compose.foundation.gestures.OnScrollChangedDispatcher onScrollChangedDispatcher, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        androidx.compose.foundation.gestures.ScrollScope scrollScope;
        this.scrollableState = scrollableState;
        this.getHighSpeedVideoSizes = overscrollEffect;
        this.getHighSpeedVideoFpsRanges = flingBehavior;
        this.getHighSpeedVideoFpsRangesFor = orientation;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = nestedScrollDispatcher;
        this.getInputFormats = onScrollChangedDispatcher;
        this.getOutputMinFrameDuration = function0;
        scrollScope = androidx.compose.foundation.gestures.ScrollableKt.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = scrollScope;
        this.getInputSizeshNQ4ISI = new androidx.compose.foundation.gestures.NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollBy-OzD1aCk */
            public final long mo1490scrollByOzD1aCk(long offset, int source) {
                androidx.compose.foundation.gestures.ScrollScope scrollScope2;
                long highResolutionOutputSizeshNQ4ISI;
                scrollScope2 = androidx.compose.foundation.gestures.ScrollingLogic.this.getHighSpeedVideoSizesFor;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.ScrollingLogic.this.getHighResolutionOutputSizeshNQ4ISI(scrollScope2, offset, source);
                return highResolutionOutputSizeshNQ4ISI;
            }

            @Override // androidx.compose.foundation.gestures.NestedScrollScope
            /* renamed from: scrollByWithOverscroll-OzD1aCk */
            public final long mo1491scrollByWithOverscrollOzD1aCk(long offset, int source) {
                androidx.compose.foundation.OverscrollEffect overscrollEffect2;
                androidx.compose.foundation.gestures.ScrollScope scrollScope2;
                long highResolutionOutputSizeshNQ4ISI;
                boolean highSpeedVideoFpsRanges;
                int i;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> function1;
                androidx.compose.foundation.gestures.ScrollingLogic.this.getOutputFormats = source;
                overscrollEffect2 = androidx.compose.foundation.gestures.ScrollingLogic.this.getHighSpeedVideoSizes;
                if (overscrollEffect2 != null) {
                    highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.ScrollingLogic.this.getHighSpeedVideoFpsRanges();
                    if (highSpeedVideoFpsRanges) {
                        i = androidx.compose.foundation.gestures.ScrollingLogic.this.getOutputFormats;
                        function1 = androidx.compose.foundation.gestures.ScrollingLogic.this.getOutputStallDuration;
                        return overscrollEffect2.mo1266applyToScrollRhakbz0(offset, i, function1);
                    }
                }
                scrollScope2 = androidx.compose.foundation.gestures.ScrollingLogic.this.getHighSpeedVideoSizesFor;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.ScrollingLogic.this.getHighResolutionOutputSizeshNQ4ISI(scrollScope2, offset, source);
                return highResolutionOutputSizeshNQ4ISI;
            }
        };
        this.getOutputStallDuration = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.ui.geometry.Offset highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.gestures.ScrollingLogic.getHighSpeedVideoSizes(androidx.compose.foundation.gestures.ScrollingLogic.this, (androidx.compose.ui.geometry.Offset) obj);
                return highSpeedVideoSizes;
            }
        };
    }

    public final androidx.compose.foundation.gestures.ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final void setScrollableState(androidx.compose.foundation.gestures.ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: isFlinging, reason: from getter */
    public final boolean getIsFlinging() {
        return this.isFlinging;
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m1538toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        if (this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal) {
            return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m1536singleAxisOffsetMKHz9U(long j) {
        return this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.geometry.Offset.m5746copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : androidx.compose.ui.geometry.Offset.m5746copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m1537toFloatk4lQ0M(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m1540toVelocityadjELrA(float f) {
        if (f == 0.0f) {
            return androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
        }
        return this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.VelocityKt.Velocity(f, 0.0f) : androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Camera2StreamConfigurationMap(long j) {
        return this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m8839getXimpl(j) : androidx.compose.ui.unit.Velocity.m8840getYimpl(j);
    }

    private final long getHighSpeedVideoFpsRangesFor(long j) {
        return this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m8835copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : androidx.compose.ui.unit.Velocity.m8835copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighResolutionOutputSizeshNQ4ISI(long j, float f) {
        return this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m8835copyOhffZ5M$default(j, f, 0.0f, 2, null) : androidx.compose.ui.unit.Velocity.m8835copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    public final float reverseIfNeeded(float f) {
        return this.getHighResolutionOutputSizeshNQ4ISI ? f * (-1.0f) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m1535reverseIfNeededMKHz9U(long j) {
        return this.getHighResolutionOutputSizeshNQ4ISI ? androidx.compose.ui.geometry.Offset.m5759timestuRUvjQ(j, -1.0f) : j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Offset getHighSpeedVideoSizes(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, androidx.compose.ui.geometry.Offset offset) {
        return androidx.compose.ui.geometry.Offset.m5741boximpl(scrollingLogic.getHighResolutionOutputSizeshNQ4ISI(scrollingLogic.getHighSpeedVideoSizesFor, offset.m5762unboximpl(), scrollingLogic.getOutputFormats));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.ScrollScope scrollScope, long j, int i) {
        long m7110dispatchPreScrollOzD1aCk = this.Camera2StreamConfigurationMap.m7110dispatchPreScrollOzD1aCk(j, i);
        long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(j, m7110dispatchPreScrollOzD1aCk);
        long m1535reverseIfNeededMKHz9U = m1535reverseIfNeededMKHz9U(m1538toOffsettuRUvjQ(scrollScope.scrollBy(m1537toFloatk4lQ0M(m1535reverseIfNeededMKHz9U(m1536singleAxisOffsetMKHz9U(m5756minusMKHz9U))))));
        this.getInputFormats.mo1493dispatchScrollDeltaInfok4lQ0M(m1535reverseIfNeededMKHz9U);
        return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m7110dispatchPreScrollOzD1aCk, m1535reverseIfNeededMKHz9U), this.Camera2StreamConfigurationMap.m7108dispatchPostScrollDzOQY0M(m1535reverseIfNeededMKHz9U, androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(m5756minusMKHz9U, m1535reverseIfNeededMKHz9U), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: performRawScroll-MK-Hz9U */
    public final long mo1522performRawScrollMKHz9U(long scroll) {
        if (this.scrollableState.isScrollInProgress()) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        return getHighResolutionOutputSizeshNQ4ISI(scroll);
    }

    private final long getHighResolutionOutputSizeshNQ4ISI(long p0) {
        return m1538toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m1537toFloatk4lQ0M(p0)))));
    }

    /* renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final java.lang.Object m1534onScrollStoppedBMRW4eQ(long j, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        boolean Camera2StreamConfigurationMap;
        if (z) {
            Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.ScrollableKt.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
            if (!Camera2StreamConfigurationMap) {
                return kotlin.Unit.INSTANCE;
            }
        }
        long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(j);
        androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1(this, null);
        androidx.compose.foundation.OverscrollEffect overscrollEffect = this.getHighSpeedVideoSizes;
        if (overscrollEffect != null && getHighSpeedVideoFpsRanges()) {
            java.lang.Object mo1265applyToFlingBMRW4eQ = overscrollEffect.mo1265applyToFlingBMRW4eQ(highSpeedVideoFpsRangesFor, scrollingLogic$onScrollStopped$performFling$1, continuation);
            return mo1265applyToFlingBMRW4eQ == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo1265applyToFlingBMRW4eQ : kotlin.Unit.INSTANCE;
        }
        java.lang.Object invoke = scrollingLogic$onScrollStopped$performFling$1.invoke(androidx.compose.ui.unit.Velocity.m8830boximpl(highSpeedVideoFpsRangesFor), continuation);
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
        androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        int i;
        kotlin.jvm.internal.Ref.LongRef longRef;
        try {
            if (continuation instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) {
                scrollingLogic$doFlingAnimation$1 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) continuation;
                if ((scrollingLogic$doFlingAnimation$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    scrollingLogic$doFlingAnimation$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = scrollingLogic$doFlingAnimation$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = scrollingLogic$doFlingAnimation$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                        longRef2.element = j;
                        this.isFlinging = true;
                        androidx.compose.foundation.MutatePriority mutatePriority = androidx.compose.foundation.MutatePriority.Default;
                        kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.NestedScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> scrollingLogic$doFlingAnimation$2 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2(this, longRef2, j, null);
                        scrollingLogic$doFlingAnimation$1.getHighSpeedVideoFpsRangesFor = longRef2;
                        scrollingLogic$doFlingAnimation$1.getHighSpeedVideoSizes = 1;
                        if (scroll(mutatePriority, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        longRef = longRef2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        longRef = (kotlin.jvm.internal.Ref.LongRef) scrollingLogic$doFlingAnimation$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.isFlinging = false;
                    return androidx.compose.ui.unit.Velocity.m8830boximpl(longRef.element);
                }
            }
            if (i != 0) {
            }
            this.isFlinging = false;
            return androidx.compose.ui.unit.Velocity.m8830boximpl(longRef.element);
        } catch (java.lang.Throwable th) {
            this.isFlinging = false;
            throw th;
        }
        scrollingLogic$doFlingAnimation$1 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1(this, continuation);
        java.lang.Object obj2 = scrollingLogic$doFlingAnimation$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic$doFlingAnimation$1.getHighSpeedVideoSizes;
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        androidx.compose.foundation.OverscrollEffect overscrollEffect = this.getHighSpeedVideoSizes;
        return overscrollEffect != null && overscrollEffect.isInProgress();
    }

    public static /* synthetic */ java.lang.Object scroll$default(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return scrollingLogic.scroll(mutatePriority, function2, continuation);
    }

    public final java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.NestedScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll = this.scrollableState.scroll(mutatePriority, new androidx.compose.foundation.gestures.ScrollingLogic$scroll$2(this, function2, null), continuation);
        return scroll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : kotlin.Unit.INSTANCE;
    }

    public final boolean update(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean reverseDirection, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z;
        boolean z2 = true;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.scrollableState, scrollableState)) {
            z = false;
        } else {
            this.scrollableState = scrollableState;
            z = true;
        }
        this.getHighSpeedVideoSizes = overscrollEffect;
        if (this.getHighSpeedVideoFpsRangesFor != orientation) {
            this.getHighSpeedVideoFpsRangesFor = orientation;
            z = true;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != reverseDirection) {
            this.getHighResolutionOutputSizeshNQ4ISI = reverseDirection;
        } else {
            z2 = z;
        }
        this.getHighSpeedVideoFpsRanges = flingBehavior;
        this.Camera2StreamConfigurationMap = nestedScrollDispatcher;
        return z2;
    }

    public final boolean isVertical() {
        return this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Vertical;
    }

    /* renamed from: toSingleAxisDeltaFromAngle-k-4lQ0M, reason: not valid java name */
    public final float m1539toSingleAxisDeltaFromAnglek4lQ0M(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (((float) java.lang.Math.atan2(java.lang.Math.abs(java.lang.Float.intBitsToFloat(i)), java.lang.Math.abs(java.lang.Float.intBitsToFloat(i2)))) >= 0.7853981633974483d) {
            if (this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Vertical) {
                return java.lang.Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (this.getHighSpeedVideoFpsRangesFor == androidx.compose.foundation.gestures.Orientation.Horizontal) {
            return java.lang.Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
