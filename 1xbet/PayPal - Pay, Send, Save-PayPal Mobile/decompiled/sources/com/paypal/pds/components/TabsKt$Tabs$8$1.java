package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.TabsKt$Tabs$8$1", f = "Tabs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class TabsKt$Tabs$8$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.ScrollState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    final /* synthetic */ int[] getHighSpeedVideoSizesFor;
    final /* synthetic */ int getInputFormats;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Integer> getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getOutputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getOutputMinFrameDuration;
    int getOutputSizes;
    private /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputStallDuration;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        intValue = this.getOutputMinFrameDuration.getIntValue();
        if (intValue == 0) {
            return kotlin.Unit.INSTANCE;
        }
        int i = this.getInputFormats + this.getHighSpeedVideoFpsRangesFor + this.Camera2StreamConfigurationMap;
        intValue2 = this.getOutputMinFrameDuration.getIntValue();
        if (i <= intValue2) {
            return kotlin.Unit.INSTANCE;
        }
        intValue3 = this.getOutputMinFrameDuration.getIntValue();
        intValue4 = this.getOutputMinFrameDuration.getIntValue();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.pds.components.TabsKt$Tabs$8$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, kotlin.ranges.RangesKt.coerceIn((int) (((this.getInputFormats + this.getHighSpeedVideoSizesFor[this.getHighSpeedVideoSizes]) + (this.getInputSizeshNQ4ISI.get(this.getHighSpeedVideoSizes).intValue() / 2.0f)) - (intValue4 / 2.0f)), 0, kotlin.ranges.RangesKt.coerceAtLeast(i - intValue3, 0)), this.getOutputFormats, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.TabsKt$Tabs$8$1$1", f = "Tabs.kt", i = {}, l = {257, 258}, m = "invokeSuspend", n = {}, nl = {258, 259}, s = {}, v = 2)
    /* renamed from: com.paypal.pds.components.TabsKt$Tabs$8$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.foundation.ScrollState getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r11.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11.getHighSpeedVideoFpsRangesFor), r11.getHighSpeedVideoSizes, null, null, r11, 12, null) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r11.Camera2StreamConfigurationMap.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11.getHighResolutionOutputSizeshNQ4ISI.getValue()), r11) != r0) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighSpeedVideoFpsRanges = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.pds.components.TabsKt$Tabs$8$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.pds.components.TabsKt$Tabs$8$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.foundation.ScrollState scrollState, int i, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, kotlin.coroutines.Continuation<? super com.paypal.pds.components.TabsKt$Tabs$8$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = animatable;
            this.getHighResolutionOutputSizeshNQ4ISI = scrollState;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = finiteAnimationSpec;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.TabsKt$Tabs$8$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.pds.components.TabsKt$Tabs$8$1 tabsKt$Tabs$8$1 = new com.paypal.pds.components.TabsKt$Tabs$8$1(this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats, continuation);
        tabsKt$Tabs$8$1.getOutputStallDuration = obj;
        return tabsKt$Tabs$8$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsKt$Tabs$8$1(int i, int i2, int i3, androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Integer> snapshotStateList, int i4, int[] iArr, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.foundation.ScrollState scrollState, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, kotlin.coroutines.Continuation<? super com.paypal.pds.components.TabsKt$Tabs$8$1> continuation) {
        super(2, continuation);
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.Camera2StreamConfigurationMap = i3;
        this.getInputSizeshNQ4ISI = snapshotStateList;
        this.getHighSpeedVideoSizes = i4;
        this.getHighSpeedVideoSizesFor = iArr;
        this.getOutputMinFrameDuration = mutableIntState;
        this.getHighSpeedVideoFpsRanges = animatable;
        this.getHighResolutionOutputSizeshNQ4ISI = scrollState;
        this.getOutputFormats = finiteAnimationSpec;
    }
}
