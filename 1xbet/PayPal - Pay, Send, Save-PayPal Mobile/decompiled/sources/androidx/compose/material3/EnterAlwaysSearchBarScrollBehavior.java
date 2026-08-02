package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001b\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR$\u0010$\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001a\u0010,\u001a\u00020(8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/material3/EnterAlwaysSearchBarScrollBehavior;", "Landroidx/compose/material3/SearchBarScrollBehavior;", "", "p0", "p1", "Lkotlin/Function0;", "", "p2", "p3", "Landroidx/compose/animation/core/AnimationSpec;", "p4", "Landroidx/compose/animation/core/DecayAnimationSpec;", "p5", "<init>", "(FFLkotlin/jvm/functions/Function0;ZLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;)V", "Landroidx/compose/ui/Modifier;", "searchBarScrollBehavior", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "()Lkotlin/jvm/functions/Function0;", "Z", "getHighSpeedVideoSizes", "()Z", "getHighSpeedVideoSizesFor", "Landroidx/compose/animation/core/AnimationSpec;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/DecayAnimationSpec;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/runtime/MutableFloatState;", "getScrollOffset", "()F", "setScrollOffset", "(F)V", "getInputFormats", "getOutputMinFrameDuration", "getScrollOffsetLimit", "setScrollOffsetLimit", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getOutputFormats", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class EnterAlwaysSearchBarScrollBehavior implements androidx.compose.material3.SearchBarScrollBehavior {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.Companion INSTANCE = new androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getOutputFormats = new androidx.compose.ui.input.nestedscroll.NestedScrollConnection() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$nestedScrollConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public final long mo1754onPreScrollOzD1aCk(long available, int source) {
            if (!androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this.getHighResolutionOutputSizeshNQ4ISI().invoke().booleanValue()) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }
            float scrollOffset = androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this.getScrollOffset();
            androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this;
            enterAlwaysSearchBarScrollBehavior.setScrollOffset(enterAlwaysSearchBarScrollBehavior.getScrollOffset() + java.lang.Float.intBitsToFloat((int) (4294967295L & available)));
            if (!androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this.getGetHighSpeedVideoSizes() && scrollOffset != androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this.getScrollOffset()) {
                return androidx.compose.ui.geometry.Offset.m5746copydBAh8RU$default(available, 0.0f, 0.0f, 2, null);
            }
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
            if (!androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this.getHighResolutionOutputSizeshNQ4ISI().invoke().booleanValue()) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }
            if (androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this.getGetHighSpeedVideoSizes()) {
                int i = (int) (available & 4294967295L);
                if (java.lang.Float.intBitsToFloat(i) > 0.0f) {
                    androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior = androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this;
                    enterAlwaysSearchBarScrollBehavior.setScrollOffset(enterAlwaysSearchBarScrollBehavior.getScrollOffset() + java.lang.Float.intBitsToFloat(i));
                    return androidx.compose.ui.geometry.Offset.m5746copydBAh8RU$default(available, 0.0f, 0.0f, 2, null);
                }
            }
            if (!androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this.getGetHighSpeedVideoSizes()) {
                androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior2 = androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this;
                enterAlwaysSearchBarScrollBehavior2.setScrollOffset(enterAlwaysSearchBarScrollBehavior2.getScrollOffset() + java.lang.Float.intBitsToFloat((int) (consumed & 4294967295L)));
            }
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            return !androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this.getHighResolutionOutputSizeshNQ4ISI().invoke().booleanValue() ? androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M()) : androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.getHighSpeedVideoSizes(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this, androidx.compose.ui.unit.Velocity.m8840getYimpl(j2), continuation);
        }
    };

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getHighSpeedVideoSizesFor;

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object getHighSpeedVideoSizes(final androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, float f, kotlin.coroutines.Continuation continuation) {
        androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 enterAlwaysSearchBarScrollBehavior$settleSearchBar$1;
        int i;
        float scrollOffset;
        final kotlin.jvm.internal.Ref.FloatRef floatRef;
        float f2;
        kotlin.jvm.internal.Ref.FloatRef floatRef2;
        androidx.compose.animation.core.AnimationState AnimationState$default;
        java.lang.Float boxFloat;
        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec;
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.internal.Ref.FloatRef floatRef3;
        if (continuation instanceof androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1) {
            enterAlwaysSearchBarScrollBehavior$settleSearchBar$1 = (androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1) continuation;
            if ((enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    scrollOffset = enterAlwaysSearchBarScrollBehavior.getScrollOffsetLimit() == 0.0f ? 0.0f : enterAlwaysSearchBarScrollBehavior.getScrollOffset() / enterAlwaysSearchBarScrollBehavior.getScrollOffsetLimit();
                    if (scrollOffset < 0.01f || scrollOffset == 1.0f) {
                        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M());
                    }
                    floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                    floatRef.element = f;
                    if (java.lang.Math.abs(f) > 1.0f) {
                        final kotlin.jvm.internal.Ref.FloatRef floatRef4 = new kotlin.jvm.internal.Ref.FloatRef();
                        androidx.compose.animation.core.AnimationState AnimationState$default2 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec = enterAlwaysSearchBarScrollBehavior.Camera2StreamConfigurationMap;
                        kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef.this, enterAlwaysSearchBarScrollBehavior, floatRef, (androidx.compose.animation.core.AnimationScope) obj2);
                            }
                        };
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.Camera2StreamConfigurationMap = floatRef;
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoFpsRangesFor = scrollOffset;
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoFpsRanges = 1;
                        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(AnimationState$default2, decayAnimationSpec, false, function12, enterAlwaysSearchBarScrollBehavior$settleSearchBar$1, 2, null) != coroutine_suspended) {
                            f2 = scrollOffset;
                            floatRef2 = floatRef;
                        }
                        return coroutine_suspended;
                    }
                    if (enterAlwaysSearchBarScrollBehavior.getScrollOffsetLimit() < enterAlwaysSearchBarScrollBehavior.getScrollOffset() && enterAlwaysSearchBarScrollBehavior.getScrollOffset() < 0.0f) {
                        AnimationState$default = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(enterAlwaysSearchBarScrollBehavior.getScrollOffset(), 0.0f, 0L, 0L, false, 30, null);
                        boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(scrollOffset >= 0.5f ? 0.0f : enterAlwaysSearchBarScrollBehavior.getScrollOffsetLimit());
                        animationSpec = enterAlwaysSearchBarScrollBehavior.getHighResolutionOutputSizeshNQ4ISI;
                        function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this, (androidx.compose.animation.core.AnimationScope) obj2);
                            }
                        };
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.Camera2StreamConfigurationMap = floatRef;
                        enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoFpsRanges = 2;
                        if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec, false, function1, enterAlwaysSearchBarScrollBehavior$settleSearchBar$1, 4, null) != coroutine_suspended) {
                            floatRef3 = floatRef;
                            floatRef = floatRef3;
                        }
                        return coroutine_suspended;
                    }
                    return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, floatRef.element));
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef3 = (kotlin.jvm.internal.Ref.FloatRef) enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    floatRef = floatRef3;
                    return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, floatRef.element));
                }
                f2 = enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoFpsRangesFor;
                floatRef2 = (kotlin.jvm.internal.Ref.FloatRef) enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                scrollOffset = f2;
                floatRef = floatRef2;
                if (enterAlwaysSearchBarScrollBehavior.getScrollOffsetLimit() < enterAlwaysSearchBarScrollBehavior.getScrollOffset()) {
                    AnimationState$default = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(enterAlwaysSearchBarScrollBehavior.getScrollOffset(), 0.0f, 0L, 0L, false, 30, null);
                    boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(scrollOffset >= 0.5f ? 0.0f : enterAlwaysSearchBarScrollBehavior.getScrollOffsetLimit());
                    animationSpec = enterAlwaysSearchBarScrollBehavior.getHighResolutionOutputSizeshNQ4ISI;
                    function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this, (androidx.compose.animation.core.AnimationScope) obj2);
                        }
                    };
                    enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.Camera2StreamConfigurationMap = floatRef;
                    enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoFpsRanges = 2;
                    if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec, false, function1, enterAlwaysSearchBarScrollBehavior$settleSearchBar$1, 4, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, floatRef.element));
            }
        }
        enterAlwaysSearchBarScrollBehavior$settleSearchBar$1 = new androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1(enterAlwaysSearchBarScrollBehavior, continuation);
        java.lang.Object obj2 = enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = enterAlwaysSearchBarScrollBehavior$settleSearchBar$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        scrollOffset = f2;
        floatRef = floatRef2;
        if (enterAlwaysSearchBarScrollBehavior.getScrollOffsetLimit() < enterAlwaysSearchBarScrollBehavior.getScrollOffset()) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.VelocityKt.Velocity(0.0f, floatRef.element));
    }

    public EnterAlwaysSearchBarScrollBehavior(float f, float f2, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, boolean z, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec) {
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = animationSpec;
        this.Camera2StreamConfigurationMap = decayAnimationSpec;
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.getHighSpeedVideoSizesFor = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public final float getScrollOffset() {
        return this.getHighSpeedVideoFpsRanges.getFloatValue();
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public final void setScrollOffset(float f) {
        this.getHighSpeedVideoFpsRanges.setFloatValue(kotlin.ranges.RangesKt.coerceIn(f, getScrollOffsetLimit(), 0.0f));
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public final float getScrollOffsetLimit() {
        return this.getHighSpeedVideoSizesFor.getFloatValue();
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public final void setScrollOffsetLimit(float f) {
        this.getHighSpeedVideoSizesFor.setFloatValue(f);
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    public final androidx.compose.ui.Modifier searchBarScrollBehavior(androidx.compose.ui.Modifier modifier) {
        androidx.compose.ui.Modifier draggable;
        draggable = androidx.compose.foundation.gestures.DraggableKt.draggable(modifier, androidx.compose.foundation.gestures.DraggableKt.DraggableState(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.getHighSpeedVideoSizes(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this, ((java.lang.Float) obj).floatValue());
            }
        }), androidx.compose.foundation.gestures.Orientation.Vertical, (r20 & 4) != 0 ? true : this.getHighSpeedVideoFpsRangesFor.invoke().booleanValue(), (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap : null, (r20 & 64) != 0 ? androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor : new androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2(this, null), (r20 & 128) != 0 ? false : false);
        return androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(androidx.compose.ui.layout.LayoutModifierKt.layout(androidx.compose.ui.draw.ClipKt.clipToBounds(draggable), new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.Camera2StreamConfigurationMap(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        }), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.this, (androidx.compose.ui.unit.IntSize) obj);
            }
        });
    }

    @Override // androidx.compose.material3.SearchBarScrollBehavior
    /* renamed from: getNestedScrollConnection, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getGetOutputFormats() {
        return this.getOutputFormats;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u00030\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/material3/EnterAlwaysSearchBarScrollBehavior$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "", "canScroll", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/EnterAlwaysSearchBarScrollBehavior;", "Saver", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior, ?> Saver(final kotlin.jvm.functions.Function0<java.lang.Boolean> canScroll, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> snapAnimationSpec, final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> flingAnimationSpec) {
            return androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.util.List listOf;
                    listOf = kotlin.collections.CollectionsKt.listOf(java.lang.Float.valueOf(r2.getScrollOffset()), java.lang.Float.valueOf(r2.getScrollOffsetLimit()), java.lang.Boolean.valueOf(((androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior) obj2).getGetHighSpeedVideoSizes()));
                    return listOf;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.Companion.$r8$lambda$NBXJrlLSdMNSbSrsrvn0OKLADbo(kotlin.jvm.functions.Function0.this, snapAnimationSpec, flingAnimationSpec, (java.util.List) obj);
                }
            });
        }

        public static /* synthetic */ androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior $r8$lambda$NBXJrlLSdMNSbSrsrvn0OKLADbo(kotlin.jvm.functions.Function0 function0, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, java.util.List list) {
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            float floatValue = ((java.lang.Float) obj).floatValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            float floatValue2 = ((java.lang.Float) obj2).floatValue();
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
            return new androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior(floatValue, floatValue2, function0, ((java.lang.Boolean) obj3).booleanValue(), animationSpec, decayAnimationSpec);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, kotlin.jvm.internal.Ref.FloatRef floatRef2, androidx.compose.animation.core.AnimationScope animationScope) {
        float floatValue = ((java.lang.Number) animationScope.getValue()).floatValue() - floatRef.element;
        float scrollOffset = enterAlwaysSearchBarScrollBehavior.getScrollOffset();
        enterAlwaysSearchBarScrollBehavior.setScrollOffset(scrollOffset + floatValue);
        float abs = java.lang.Math.abs(scrollOffset - enterAlwaysSearchBarScrollBehavior.getScrollOffset());
        floatRef.element = ((java.lang.Number) animationScope.getValue()).floatValue();
        floatRef2.element = ((java.lang.Number) animationScope.getVelocity()).floatValue();
        if (java.lang.Math.abs(floatValue - abs) > 0.5f) {
            animationScope.cancelAnimation();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable placeable, int i, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, i, 0.0f, (kotlin.jvm.functions.Function1) null, 12, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, androidx.compose.animation.core.AnimationScope animationScope) {
        enterAlwaysSearchBarScrollBehavior.setScrollOffset(((java.lang.Number) animationScope.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult Camera2StreamConfigurationMap(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(constraints.getGetHighSpeedVideoFpsRangesFor());
        final int roundToInt = kotlin.math.MathKt.roundToInt(enterAlwaysSearchBarScrollBehavior.getScrollOffset());
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), kotlin.ranges.RangesKt.coerceAtLeast(mo7353measureBRTryo0.getHeight() + roundToInt, 0), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.this, roundToInt, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, float f) {
        enterAlwaysSearchBarScrollBehavior.setScrollOffset(enterAlwaysSearchBarScrollBehavior.getScrollOffset() + f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, androidx.compose.ui.unit.IntSize intSize) {
        enterAlwaysSearchBarScrollBehavior.setScrollOffsetLimit(-((int) (intSize.m8776unboximpl() & 4294967295L)));
        return kotlin.Unit.INSTANCE;
    }
}
