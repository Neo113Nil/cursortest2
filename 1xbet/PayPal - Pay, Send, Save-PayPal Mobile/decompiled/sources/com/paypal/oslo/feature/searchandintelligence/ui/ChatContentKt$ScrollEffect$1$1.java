package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1", f = "ChatContent.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ChatContentKt$ScrollEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1$1", f = "ChatContent.kt", i = {0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", n = {"effect", "effect", "totalItems"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 270}, s = {"L$0", "L$0", "I$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        
            if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r8.getHighSpeedVideoFpsRangesFor, kotlin.ranges.RangesKt.coerceIn(((com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect.ScrollToPin) r0).getTargetIndex(), 0, r9 - 1), 0, r8, 2, null) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(200, r8) != r1) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect chatUiEffect = (com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect) this.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (!(chatUiEffect instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect.ScrollToPin)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!this.getHighResolutionOutputSizeshNQ4ISI.getValue().booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                this.Camera2StreamConfigurationMap = chatUiEffect;
                this.getHighSpeedVideoSizes = 1;
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
            if (!this.getHighResolutionOutputSizeshNQ4ISI.getValue().booleanValue()) {
                return kotlin.Unit.INSTANCE;
            }
            int totalItemsCount = this.getHighSpeedVideoFpsRangesFor.getLayoutInfo().getTotalItemsCount();
            if (totalItemsCount <= 0) {
                return kotlin.Unit.INSTANCE;
            }
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(chatUiEffect);
            this.getHighSpeedVideoFpsRanges = totalItemsCount;
            this.getHighSpeedVideoSizes = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect chatUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1.AnonymousClass1) create(chatUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = state;
            this.getHighSpeedVideoFpsRangesFor = lazyListState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChatContentKt$ScrollEffect$1$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> flow, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ScrollEffect$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = flow;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoSizes = lazyListState;
    }
}
