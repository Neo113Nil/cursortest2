package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1", f = "EndlessScrollPaginationTrigger.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, nl = {96}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ double Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.lazy.LazyListState lazyListState = this.getHighSpeedVideoFpsRangesFor;
            this.getInputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.debounce(kotlinx.coroutines.flow.FlowKt.drop(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.LazyListState.this);
                }
            })), 1), this.getHighSpeedVideoFpsRanges), new com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1$2", f = "EndlessScrollPaginationTrigger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ double getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean booleanValue;
            kotlin.Pair pair = (kotlin.Pair) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            int intValue = ((java.lang.Number) pair.component1()).intValue();
            int intValue2 = ((java.lang.Number) pair.component2()).intValue();
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor.getValue()).booleanValue();
            if (!booleanValue || intValue2 == 0) {
                return kotlin.Unit.INSTANCE;
            }
            if (intValue >= ((int) (this.getHighSpeedVideoFpsRanges * intValue2))) {
                com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt.access$EndlessScrollPaginationTrigger$lambda$4(this.getHighSpeedVideoSizes).invoke();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer> pair, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1.AnonymousClass2) create(pair, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1.AnonymousClass2 anonymousClass2 = new com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
            anonymousClass2.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(double d, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = d;
            this.getHighSpeedVideoFpsRangesFor = state;
            this.getHighSpeedVideoSizes = state2;
        }
    }

    public static /* synthetic */ kotlin.Pair getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.LazyListState lazyListState) {
        androidx.compose.foundation.lazy.LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        int totalItemsCount = layoutInfo.getTotalItemsCount();
        androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo = (androidx.compose.foundation.lazy.LazyListItemInfo) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) layoutInfo.getVisibleItemsInfo());
        return kotlin.TuplesKt.to(java.lang.Integer.valueOf((lazyListItemInfo != null ? lazyListItemInfo.getIndex() : 0) + 1), java.lang.Integer.valueOf(totalItemsCount));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1(long j, androidx.compose.foundation.lazy.LazyListState lazyListState, double d, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoFpsRangesFor = lazyListState;
        this.Camera2StreamConfigurationMap = d;
        this.getHighSpeedVideoSizes = state;
        this.getHighResolutionOutputSizeshNQ4ISI = state2;
    }
}
