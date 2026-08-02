package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchFundingInstruments$1", f = "ChangeFiViewModel.kt", i = {}, l = {112, 119, 120}, m = "invokeSuspend", n = {}, nl = {113, 120, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ChangeFiViewModel$fetchFundingInstruments$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.access$fetchMakeAPaymentFundingInstruments(r6.Camera2StreamConfigurationMap, r6.getHighSpeedVideoFpsRanges, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.access$fetchAutopayFundingInstruments(r6.Camera2StreamConfigurationMap, r6.getHighSpeedVideoFpsRanges, r6.getHighSpeedVideoSizes, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper changeFiMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            list = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            if (list.isEmpty()) {
                changeFiMapper = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = changeFiMapper.toUiModel(this.Camera2StreamConfigurationMap.getArgs(), this);
            }
            if (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchFundingInstruments$1.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.getArgs().getFlowType().ordinal()] != 1) {
                this.getHighSpeedVideoFpsRangesFor = 2;
            } else {
                this.getHighSpeedVideoFpsRangesFor = 3;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel changeFiHalfSheetUiModel = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel) obj;
        if (changeFiHalfSheetUiModel != null) {
            this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDataLoaded(changeFiHalfSheetUiModel));
            return kotlin.Unit.INSTANCE;
        }
        if (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchFundingInstruments$1.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.getArgs().getFlowType().ordinal()] != 1) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchFundingInstruments$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType.MAKE_A_PAYMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchFundingInstruments$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeFiViewModel$fetchFundingInstruments$1(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchFundingInstruments$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = changeFiViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = creditProductIdentifier;
    }
}
