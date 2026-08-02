package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1", f = "EndlessScrollPaginationTrigger.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, nl = {59}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.ScrollState Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ double getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.ScrollState scrollState = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.debounce(kotlinx.coroutines.flow.FlowKt.drop(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    int value;
                    value = androidx.compose.foundation.ScrollState.this.getValue();
                    return java.lang.Integer.valueOf(value);
                }
            })), 1), this.getHighResolutionOutputSizeshNQ4ISI), new com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "index", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1$2", f = "EndlessScrollPaginationTrigger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> Camera2StreamConfigurationMap;
        final /* synthetic */ double getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.ScrollState getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoSizes;
        int getInputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean booleanValue;
            int i = this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getInputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoSizes.getValue()).booleanValue();
            if (!booleanValue) {
                return kotlin.Unit.INSTANCE;
            }
            if (i - (this.getHighResolutionOutputSizeshNQ4ISI * this.getHighSpeedVideoFpsRangesFor.getMaxValue()) > 0.0d) {
                com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt.access$EndlessScrollPaginationTrigger$lambda$0(this.Camera2StreamConfigurationMap).invoke();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1.AnonymousClass2) create(java.lang.Integer.valueOf(num.intValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1.AnonymousClass2 anonymousClass2 = new com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass2.getHighSpeedVideoFpsRanges = ((java.lang.Number) obj).intValue();
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(androidx.compose.foundation.ScrollState scrollState, double d, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = scrollState;
            this.getHighResolutionOutputSizeshNQ4ISI = d;
            this.getHighSpeedVideoSizes = state;
            this.Camera2StreamConfigurationMap = state2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1(long j, androidx.compose.foundation.ScrollState scrollState, double d, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = scrollState;
        this.getHighSpeedVideoSizes = d;
        this.getHighSpeedVideoFpsRangesFor = state;
        this.getHighSpeedVideoFpsRanges = state2;
    }
}
