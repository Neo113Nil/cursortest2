package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "", "index", "", "isItemVisible", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z", "scrollOffset", "numOfItemsForTeleport", "Landroidx/compose/ui/unit/Density;", "density", "", "animateScrollToItem", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutScrollScopeKt {
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(2500.0f);
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.unit.Dp.m8601constructorimpl(1500.0f);
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(50.0f);

    public static final boolean isItemVisible(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, int i) {
        return i <= lazyLayoutScrollScope.getLastVisibleItemIndex() && lazyLayoutScrollScope.getFirstVisibleItemIndex() <= i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[Catch: ItemFoundInScroll -> 0x01b8, TryCatch #4 {ItemFoundInScroll -> 0x01b8, blocks: (B:25:0x00e8, B:27:0x00ec, B:29:0x00f2, B:37:0x0119, B:42:0x015e), top: B:24:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r6v12, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01a6 -> B:21:0x01a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object animateScrollToItem(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2, int i3, androidx.compose.ui.unit.Density density, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$1;
        java.lang.Object coroutine_suspended;
        int i4;
        androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope2;
        boolean z;
        androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$12;
        int i5;
        int i6;
        final androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope3;
        float mo1418toPx0680j_4;
        float mo1418toPx0680j_42;
        float mo1418toPx0680j_43;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        androidx.compose.foundation.lazy.layout.ItemFoundInScroll itemFoundInScroll;
        androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$13;
        androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope4;
        int i7;
        float f;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        float f2;
        float f3;
        int i8;
        androidx.compose.animation.core.AnimationState copy$default;
        java.lang.Float boxFloat;
        kotlin.jvm.functions.Function1 function1;
        int i9;
        androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope5;
        int i10;
        androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope6;
        int calculateDistanceTo$default;
        float f4;
        final float f5;
        androidx.compose.animation.core.AnimationState animationState;
        java.lang.Float boxFloat2;
        boolean z2;
        kotlin.jvm.functions.Function1 function12;
        int i11 = i;
        if (continuation instanceof androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1) {
            lazyLayoutScrollScopeKt$animateScrollToItem$1 = (androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1) continuation;
            if ((lazyLayoutScrollScopeKt$animateScrollToItem$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                lazyLayoutScrollScopeKt$animateScrollToItem$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj = lazyLayoutScrollScopeKt$animateScrollToItem$1.getOutputMinFrameDurationlomOqCM;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i4 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getOutputStallDuration;
                if (i4 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (i11 < 0.0f) {
                        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
                    }
                    try {
                        mo1418toPx0680j_4 = density.mo1418toPx0680j_4(getHighSpeedVideoFpsRangesFor);
                        mo1418toPx0680j_42 = density.mo1418toPx0680j_4(getHighResolutionOutputSizeshNQ4ISI);
                        mo1418toPx0680j_43 = density.mo1418toPx0680j_4(getHighSpeedVideoFpsRanges);
                        booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                        booleanRef.element = true;
                        objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        objectRef.element = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e) {
                        e = e;
                        lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                        z = false;
                    }
                    if (isItemVisible(lazyLayoutScrollScope, i)) {
                        lazyLayoutScrollScope2 = lazyLayoutScrollScope;
                        z = false;
                        try {
                            throw new androidx.compose.foundation.lazy.layout.ItemFoundInScroll(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope2, i11, 0, 2, null), (androidx.compose.animation.core.AnimationState) objectRef.element);
                        } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e2) {
                            e = e2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                            i5 = i2;
                            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope7 = lazyLayoutScrollScope2;
                            i6 = i11;
                            lazyLayoutScrollScope3 = lazyLayoutScrollScope7;
                            copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) e.Camera2StreamConfigurationMap(), 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                            final float camera2StreamConfigurationMap = e.getCamera2StreamConfigurationMap() + i5;
                            final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
                            boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(camera2StreamConfigurationMap);
                            if (((java.lang.Number) copy$default.getVelocity()).floatValue() == 0.0f) {
                            }
                            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    kotlin.Unit highSpeedVideoSizes;
                                    highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.getHighSpeedVideoSizes(camera2StreamConfigurationMap, floatRef, lazyLayoutScrollScope3, (androidx.compose.animation.core.AnimationScope) obj2);
                                    return highSpeedVideoSizes;
                                }
                            };
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighSpeedVideoSizesFor = lazyLayoutScrollScope3;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputFormats = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.getInputFormats = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDurationlomOqCM = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighResolutionOutputSizeshNQ4ISI = i6;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.Camera2StreamConfigurationMap = i5;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDuration = 2;
                            if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, function1, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2, null) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                    }
                    try {
                        i7 = i11 > lazyLayoutScrollScope.getFirstVisibleItemIndex() ? 1 : 0;
                        kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                        intRef2.element = 1;
                        f = mo1418toPx0680j_4;
                        booleanRef2 = booleanRef;
                        intRef = intRef2;
                        i6 = i11;
                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                        objectRef2 = objectRef;
                        lazyLayoutScrollScope3 = lazyLayoutScrollScope;
                        i5 = i2;
                        f2 = mo1418toPx0680j_42;
                        f3 = mo1418toPx0680j_43;
                        i8 = i3;
                        if (booleanRef2.element) {
                        }
                    } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e3) {
                        itemFoundInScroll = e3;
                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                        lazyLayoutScrollScope4 = lazyLayoutScrollScope;
                        i5 = i2;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                        z = false;
                        int i12 = i11;
                        lazyLayoutScrollScope3 = lazyLayoutScrollScope4;
                        e = itemFoundInScroll;
                        i6 = i12;
                        copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) e.Camera2StreamConfigurationMap(), 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                        final float camera2StreamConfigurationMap2 = e.getCamera2StreamConfigurationMap() + i5;
                        final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                        boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(camera2StreamConfigurationMap2);
                        if (((java.lang.Number) copy$default.getVelocity()).floatValue() == 0.0f) {
                        }
                        function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoSizes;
                                highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.getHighSpeedVideoSizes(camera2StreamConfigurationMap2, floatRef2, lazyLayoutScrollScope3, (androidx.compose.animation.core.AnimationScope) obj2);
                                return highSpeedVideoSizes;
                            }
                        };
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighSpeedVideoSizesFor = lazyLayoutScrollScope3;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputFormats = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getInputFormats = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDurationlomOqCM = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighResolutionOutputSizeshNQ4ISI = i6;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.Camera2StreamConfigurationMap = i5;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDuration = 2;
                        if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, function1, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2, null) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i9 = lazyLayoutScrollScopeKt$animateScrollToItem$1.Camera2StreamConfigurationMap;
                    i10 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getHighResolutionOutputSizeshNQ4ISI;
                    lazyLayoutScrollScope5 = (androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope) lazyLayoutScrollScopeKt$animateScrollToItem$1.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    lazyLayoutScrollScope5.snapToItem(i10, i9);
                    return kotlin.Unit.INSTANCE;
                }
                int i13 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getInputSizeshNQ4ISI;
                float f6 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getHighSpeedVideoFpsRanges;
                float f7 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getHighSpeedVideoFpsRangesFor;
                float f8 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getHighSpeedVideoSizes;
                int i14 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getOutputMinFrameDuration;
                int i15 = lazyLayoutScrollScopeKt$animateScrollToItem$1.Camera2StreamConfigurationMap;
                int i16 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getHighResolutionOutputSizeshNQ4ISI;
                intRef = (kotlin.jvm.internal.Ref.IntRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.getOutputStallDurationlomOqCM;
                kotlin.jvm.internal.Ref.ObjectRef objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.getInputFormats;
                kotlin.jvm.internal.Ref.BooleanRef booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.getOutputFormats;
                androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope8 = (androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope) lazyLayoutScrollScopeKt$animateScrollToItem$1.getHighSpeedVideoSizesFor;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    i6 = i16;
                    i7 = i13;
                    i8 = i14;
                    booleanRef2 = booleanRef3;
                    f2 = f7;
                    f3 = f6;
                    lazyLayoutScrollScope3 = lazyLayoutScrollScope8;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                    i5 = i15;
                    f = f8;
                    objectRef2 = objectRef3;
                    try {
                        try {
                            intRef.element++;
                        } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e4) {
                            e = e4;
                            lazyLayoutScrollScope6 = lazyLayoutScrollScope3;
                        }
                    } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e5) {
                        e = e5;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                        z = false;
                    }
                } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e6) {
                    e = e6;
                    lazyLayoutScrollScope3 = lazyLayoutScrollScope8;
                    i6 = i16;
                    z = false;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                    i5 = i15;
                }
                if (booleanRef2.element && lazyLayoutScrollScope3.getItemCount() > 0) {
                    try {
                        calculateDistanceTo$default = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope3, i6, 0, 2, null) + i5;
                    } catch (androidx.compose.foundation.lazy.layout.ItemFoundInScroll e7) {
                        e = e7;
                        i11 = i6;
                        itemFoundInScroll = e;
                        lazyLayoutScrollScope4 = lazyLayoutScrollScope6;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                        z = false;
                        int i122 = i11;
                        lazyLayoutScrollScope3 = lazyLayoutScrollScope4;
                        e = itemFoundInScroll;
                        i6 = i122;
                        copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) e.Camera2StreamConfigurationMap(), 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                        final float camera2StreamConfigurationMap22 = e.getCamera2StreamConfigurationMap() + i5;
                        final kotlin.jvm.internal.Ref.FloatRef floatRef22 = new kotlin.jvm.internal.Ref.FloatRef();
                        boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(camera2StreamConfigurationMap22);
                        if (((java.lang.Number) copy$default.getVelocity()).floatValue() == 0.0f) {
                        }
                        function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoSizes;
                                highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.getHighSpeedVideoSizes(camera2StreamConfigurationMap22, floatRef22, lazyLayoutScrollScope3, (androidx.compose.animation.core.AnimationScope) obj2);
                                return highSpeedVideoSizes;
                            }
                        };
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighSpeedVideoSizesFor = lazyLayoutScrollScope3;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputFormats = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getInputFormats = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDurationlomOqCM = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighResolutionOutputSizeshNQ4ISI = i6;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.Camera2StreamConfigurationMap = i5;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDuration = 2;
                        if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, function1, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2, null) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (java.lang.Math.abs(calculateDistanceTo$default) < f) {
                        if (i7 != 0) {
                            f5 = f;
                            objectRef2.element = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                            final kotlin.jvm.internal.Ref.FloatRef floatRef3 = new kotlin.jvm.internal.Ref.FloatRef();
                            animationState = (androidx.compose.animation.core.AnimationState) objectRef2.element;
                            boxFloat2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(f5);
                            z2 = ((java.lang.Number) ((androidx.compose.animation.core.AnimationState) objectRef2.element).getVelocity()).floatValue() != 0.0f;
                            final boolean z3 = i7 == 0;
                            final androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope9 = lazyLayoutScrollScope3;
                            final int i17 = i6;
                            final kotlin.jvm.internal.Ref.BooleanRef booleanRef4 = booleanRef2;
                            final float f9 = f2;
                            final kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                            final int i18 = i8;
                            final int i19 = i5;
                            final kotlin.jvm.internal.Ref.ObjectRef objectRef4 = objectRef2;
                            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.this, i17, f5, floatRef3, booleanRef4, z3, f9, intRef3, i18, i19, objectRef4, (androidx.compose.animation.core.AnimationScope) obj2);
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            };
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighSpeedVideoSizesFor = lazyLayoutScrollScope3;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getOutputFormats = booleanRef2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getInputFormats = objectRef2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getOutputStallDurationlomOqCM = intRef;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighResolutionOutputSizeshNQ4ISI = i6;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.Camera2StreamConfigurationMap = i5;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getOutputMinFrameDuration = i8;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighSpeedVideoSizes = f;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighSpeedVideoFpsRangesFor = f2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighSpeedVideoFpsRanges = f3;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getInputSizeshNQ4ISI = i7;
                            lazyLayoutScrollScope6 = lazyLayoutScrollScope3;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.getOutputStallDuration = 1;
                            if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, !z2, function12, lazyLayoutScrollScopeKt$animateScrollToItem$13, 2, null) != coroutine_suspended) {
                                lazyLayoutScrollScope3 = lazyLayoutScrollScope6;
                                intRef.element++;
                                if (booleanRef2.element) {
                                    calculateDistanceTo$default = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope3, i6, 0, 2, null) + i5;
                                    if (java.lang.Math.abs(calculateDistanceTo$default) < f) {
                                        f4 = java.lang.Math.max(java.lang.Math.abs(calculateDistanceTo$default), f3);
                                        if (i7 == 0) {
                                            f4 = -f4;
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        f4 = -f;
                    }
                    f5 = f4;
                    objectRef2.element = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                    final kotlin.jvm.internal.Ref.FloatRef floatRef32 = new kotlin.jvm.internal.Ref.FloatRef();
                    animationState = (androidx.compose.animation.core.AnimationState) objectRef2.element;
                    boxFloat2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(f5);
                    if (((java.lang.Number) ((androidx.compose.animation.core.AnimationState) objectRef2.element).getVelocity()).floatValue() != 0.0f) {
                    }
                    if (i7 == 0) {
                    }
                    final androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope92 = lazyLayoutScrollScope3;
                    final int i172 = i6;
                    final kotlin.jvm.internal.Ref.BooleanRef booleanRef42 = booleanRef2;
                    final float f92 = f2;
                    final kotlin.jvm.internal.Ref.IntRef intRef32 = intRef;
                    final int i182 = i8;
                    final int i192 = i5;
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef42 = objectRef2;
                    function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.this, i172, f5, floatRef32, booleanRef42, z3, f92, intRef32, i182, i192, objectRef42, (androidx.compose.animation.core.AnimationScope) obj2);
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    };
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighSpeedVideoSizesFor = lazyLayoutScrollScope3;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getOutputFormats = booleanRef2;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getInputFormats = objectRef2;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getOutputStallDurationlomOqCM = intRef;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighResolutionOutputSizeshNQ4ISI = i6;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.Camera2StreamConfigurationMap = i5;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getOutputMinFrameDuration = i8;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighSpeedVideoSizes = f;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighSpeedVideoFpsRangesFor = f2;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getHighSpeedVideoFpsRanges = f3;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getInputSizeshNQ4ISI = i7;
                    lazyLayoutScrollScope6 = lazyLayoutScrollScope3;
                    lazyLayoutScrollScopeKt$animateScrollToItem$13.getOutputStallDuration = 1;
                    if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, !z2, function12, lazyLayoutScrollScopeKt$animateScrollToItem$13, 2, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
                copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) e.Camera2StreamConfigurationMap(), 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
                final float camera2StreamConfigurationMap222 = e.getCamera2StreamConfigurationMap() + i5;
                final kotlin.jvm.internal.Ref.FloatRef floatRef222 = new kotlin.jvm.internal.Ref.FloatRef();
                boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(camera2StreamConfigurationMap222);
                if (((java.lang.Number) copy$default.getVelocity()).floatValue() == 0.0f) {
                    z = true;
                }
                function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.getHighSpeedVideoSizes(camera2StreamConfigurationMap222, floatRef222, lazyLayoutScrollScope3, (androidx.compose.animation.core.AnimationScope) obj2);
                        return highSpeedVideoSizes;
                    }
                };
                lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighSpeedVideoSizesFor = lazyLayoutScrollScope3;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputFormats = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.getInputFormats = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDurationlomOqCM = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighResolutionOutputSizeshNQ4ISI = i6;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.Camera2StreamConfigurationMap = i5;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDuration = 2;
                if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, function1, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2, null) != coroutine_suspended) {
                    i9 = i5;
                    lazyLayoutScrollScope5 = lazyLayoutScrollScope3;
                    i10 = i6;
                    lazyLayoutScrollScope5.snapToItem(i10, i9);
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        lazyLayoutScrollScopeKt$animateScrollToItem$1 = new androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1(continuation);
        java.lang.Object obj2 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getOutputMinFrameDurationlomOqCM;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i4 = lazyLayoutScrollScopeKt$animateScrollToItem$1.getOutputStallDuration;
        if (i4 != 0) {
        }
        copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) e.Camera2StreamConfigurationMap(), 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
        final float camera2StreamConfigurationMap2222 = e.getCamera2StreamConfigurationMap() + i5;
        final kotlin.jvm.internal.Ref.FloatRef floatRef2222 = new kotlin.jvm.internal.Ref.FloatRef();
        boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(camera2StreamConfigurationMap2222);
        if (((java.lang.Number) copy$default.getVelocity()).floatValue() == 0.0f) {
        }
        function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.getHighSpeedVideoSizes(camera2StreamConfigurationMap2222, floatRef2222, lazyLayoutScrollScope3, (androidx.compose.animation.core.AnimationScope) obj22);
                return highSpeedVideoSizes;
            }
        };
        lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighSpeedVideoSizesFor = lazyLayoutScrollScope3;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputFormats = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.getInputFormats = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDurationlomOqCM = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.getHighResolutionOutputSizeshNQ4ISI = i6;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.Camera2StreamConfigurationMap = i5;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.getOutputStallDuration = 2;
        if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, function1, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2, null) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    private static final boolean getHighSpeedVideoSizes(boolean z, androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, int i, int i2) {
        if (z) {
            if (lazyLayoutScrollScope.getFirstVisibleItemIndex() > i) {
                return true;
            }
            return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() > i2;
        }
        if (lazyLayoutScrollScope.getFirstVisibleItemIndex() < i) {
            return true;
        }
        return lazyLayoutScrollScope.getFirstVisibleItemIndex() == i && lazyLayoutScrollScope.getFirstVisibleItemScrollOffset() < i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, int i, float f, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.BooleanRef booleanRef, boolean z, float f2, kotlin.jvm.internal.Ref.IntRef intRef, int i2, int i3, kotlin.jvm.internal.Ref.ObjectRef objectRef, androidx.compose.animation.core.AnimationScope animationScope) {
        float coerceAtLeast;
        if (!isItemVisible(lazyLayoutScrollScope, i)) {
            if (f > 0.0f) {
                coerceAtLeast = kotlin.ranges.RangesKt.coerceAtMost(((java.lang.Number) animationScope.getValue()).floatValue(), f);
            } else {
                coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(((java.lang.Number) animationScope.getValue()).floatValue(), f);
            }
            float f3 = coerceAtLeast - floatRef.element;
            float scrollBy = lazyLayoutScrollScope.scrollBy(f3);
            if (!isItemVisible(lazyLayoutScrollScope, i) && !getHighSpeedVideoSizes(z, lazyLayoutScrollScope, i, i3)) {
                if (f3 != scrollBy) {
                    animationScope.cancelAnimation();
                    booleanRef.element = false;
                    return kotlin.Unit.INSTANCE;
                }
                floatRef.element += f3;
                if (z) {
                    if (((java.lang.Number) animationScope.getValue()).floatValue() > f2) {
                        animationScope.cancelAnimation();
                    }
                } else if (((java.lang.Number) animationScope.getValue()).floatValue() < (-f2)) {
                    animationScope.cancelAnimation();
                }
                if (z) {
                    if (intRef.element >= 2 && i - lazyLayoutScrollScope.getLastVisibleItemIndex() > i2) {
                        lazyLayoutScrollScope.snapToItem(i - i2, 0);
                    }
                } else if (intRef.element >= 2 && lazyLayoutScrollScope.getFirstVisibleItemIndex() - i > i2) {
                    lazyLayoutScrollScope.snapToItem(i2 + i, 0);
                }
            }
        }
        if (getHighSpeedVideoSizes(z, lazyLayoutScrollScope, i, i3)) {
            lazyLayoutScrollScope.snapToItem(i, i3);
            booleanRef.element = false;
            animationScope.cancelAnimation();
            return kotlin.Unit.INSTANCE;
        }
        if (isItemVisible(lazyLayoutScrollScope, i)) {
            throw new androidx.compose.foundation.lazy.layout.ItemFoundInScroll(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope.calculateDistanceTo$default(lazyLayoutScrollScope, i, 0, 2, null), (androidx.compose.animation.core.AnimationState) objectRef.element);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(float f, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, androidx.compose.animation.core.AnimationScope animationScope) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = kotlin.ranges.RangesKt.coerceAtMost(((java.lang.Number) animationScope.getValue()).floatValue(), f);
        } else if (f < 0.0f) {
            f2 = kotlin.ranges.RangesKt.coerceAtLeast(((java.lang.Number) animationScope.getValue()).floatValue(), f);
        }
        float f3 = f2 - floatRef.element;
        if (f3 != lazyLayoutScrollScope.scrollBy(f3) || f2 != ((java.lang.Number) animationScope.getValue()).floatValue()) {
            animationScope.cancelAnimation();
        }
        floatRef.element += f3;
        return kotlin.Unit.INSTANCE;
    }
}
