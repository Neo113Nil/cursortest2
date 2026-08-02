package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/CryptoDetailsPollingData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$invoke$1", f = "PollCryptoDetailsUseCase.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {80, 80, 86, 89, 89}, m = "invokeSuspend", n = {"$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode", "$this$flow", "resolvedCurrencyCode"}, nl = {80, 84, 89, 89, 91}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class PollCryptoDetailsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
    
        if (r7.emit(r2, r13) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r8.emit(r14, r13) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00e6 -> B:14:0x0099). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.String str2;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider;
        java.lang.String str3;
        java.lang.Object access$fetchAllData;
        java.lang.Object obj2;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager;
        kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            str = this.getHighSpeedVideoSizes;
            if (str == null) {
                currencyProvider = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
                str = currencyProvider.getCurrencyCode();
            }
            if (this.getHighSpeedVideoFpsRanges) {
                this.getOutputMinFrameDuration = flowCollector3;
                this.getHighResolutionOutputSizeshNQ4ISI = str;
                this.getHighSpeedVideoSizesFor = flowCollector3;
                this.getInputSizeshNQ4ISI = 1;
                java.lang.Object access$fetchAllData2 = com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase.access$fetchAllData(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, str, this);
                if (access$fetchAllData2 != coroutine_suspended) {
                    flowCollector = flowCollector3;
                    str2 = str;
                    obj = access$fetchAllData2;
                }
                return coroutine_suspended;
            }
            if (!kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        java.lang.String str4 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str3 = str4;
                        this.getOutputMinFrameDuration = flowCollector3;
                        this.getHighResolutionOutputSizeshNQ4ISI = str3;
                        this.getHighSpeedVideoSizesFor = flowCollector3;
                        this.getInputSizeshNQ4ISI = 4;
                        access$fetchAllData = com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase.access$fetchAllData(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, str3, this);
                        if (access$fetchAllData != coroutine_suspended) {
                            obj2 = access$fetchAllData;
                            str = str3;
                            flowCollector2 = flowCollector3;
                            this.getOutputMinFrameDuration = flowCollector3;
                            this.getHighResolutionOutputSizeshNQ4ISI = str;
                            this.getHighSpeedVideoSizesFor = null;
                            this.getInputSizeshNQ4ISI = 5;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 4) {
                        kotlinx.coroutines.flow.FlowCollector flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
                        java.lang.String str5 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        obj2 = obj;
                        str = str5;
                        flowCollector2 = flowCollector4;
                        this.getOutputMinFrameDuration = flowCollector3;
                        this.getHighResolutionOutputSizeshNQ4ISI = str;
                        this.getHighSpeedVideoSizesFor = null;
                        this.getInputSizeshNQ4ISI = 5;
                    } else if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                str2 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                str = str2;
                if (!kotlinx.coroutines.JobKt.isActive(getGetInputFormats())) {
                    dynamicConfigurationManager = this.getOutputFormats.Camera2StreamConfigurationMap;
                    this.getOutputMinFrameDuration = flowCollector3;
                    this.getHighResolutionOutputSizeshNQ4ISI = str;
                    this.getInputSizeshNQ4ISI = 3;
                    if (kotlinx.coroutines.DelayKt.delay(dynamicConfigurationManager.getDetailsPricePollingIntervalMs(), this) != coroutine_suspended) {
                        str3 = str;
                        this.getOutputMinFrameDuration = flowCollector3;
                        this.getHighResolutionOutputSizeshNQ4ISI = str3;
                        this.getHighSpeedVideoSizesFor = flowCollector3;
                        this.getInputSizeshNQ4ISI = 4;
                        access$fetchAllData = com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase.access$fetchAllData(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, str3, this);
                        if (access$fetchAllData != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlinx.coroutines.flow.FlowCollector flowCollector5 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
            java.lang.String str6 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector5;
            str2 = str6;
        }
        this.getOutputMinFrameDuration = flowCollector3;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoSizesFor = null;
        this.getInputSizeshNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$invoke$1 pollCryptoDetailsUseCase$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$invoke$1(this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        pollCryptoDetailsUseCase$invoke$1.getOutputMinFrameDuration = obj;
        return pollCryptoDetailsUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollCryptoDetailsUseCase$invoke$1(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetailsUseCase, boolean z, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getOutputFormats = pollCryptoDetailsUseCase;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.Camera2StreamConfigurationMap = priceTimeRange;
    }
}
