package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$createAutoReload$2", f = "ReviewViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ReviewViewModel$createAutoReload$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.access$executeUpdateFlow(r5.getHighResolutionOutputSizeshNQ4ISI, r5.Camera2StreamConfigurationMap, r5.getHighSpeedVideoFpsRanges, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.access$executeCreateFlow(r5.getHighResolutionOutputSizeshNQ4ISI, r5.Camera2StreamConfigurationMap, r5.getHighSpeedVideoFpsRanges, r5) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i2 = com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$createAutoReload$2.WhenMappings.$EnumSwitchMapping$0[this.getHighResolutionOutputSizeshNQ4ISI.getFlowType().ordinal()];
            if (i2 == 1) {
                this.getHighSpeedVideoFpsRangesFor = 1;
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$createAutoReload$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.CREATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.UPDATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$createAutoReload$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$createAutoReload$2(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$createAutoReload$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = reviewViewModel;
        this.Camera2StreamConfigurationMap = reviewUiStateStore;
        this.getHighSpeedVideoFpsRanges = reviewReloadStrategy;
    }
}
