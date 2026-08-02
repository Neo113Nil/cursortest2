package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020!0(8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010.\u001a\u0004\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010-R\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00100\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00103\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00105\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00109"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternalImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/RetrievePaymentUseCase;", "retrievePaymentUseCase", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase;", "checkRefundableUseCase", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase;", "submitRefundUseCase", "Lkotlinx/coroutines/CoroutineScope;", "zettleScope", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/meta/PlatformInfo;", "platformInfo", "Lcom/zettle/sdk/core/os/LocationData;", "lastLocation", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "merchantConfig", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalytics;", "refundAnalytics", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/RetrievePaymentUseCase;Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase;Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase;Lkotlinx/coroutines/CoroutineScope;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalytics;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action;", "action", "", "dispatchAction", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Action;)V", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "Ljava/util/Currency;", "getHighSpeedVideoFpsRangesFor", "(Lcom/zettle/sdk/core/user/userconfig/UserConfig;)Ljava/util/Currency;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundInternal$Effects;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/meta/AppInfo;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase;", "Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/zettle/sdk/core/os/LocationData;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "getInputSizeshNQ4ISI", "Lcom/zettle/sdk/meta/PlatformInfo;", "getInputFormats", "getHighSpeedVideoSizesFor", "Lcom/zettle/sdk/feature/taptopay/core/refunds/analytics/RefundAnalytics;", "getOutputMinFrameDuration", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/RetrievePaymentUseCase;", "getOutputFormats", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundInternalImpl implements com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.merchant.MerchantConfig getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.SharedFlow<com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.core.os.LocationData Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalytics getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.PlatformInfo getInputFormats;
    private final com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase getHighSpeedVideoSizesFor;

    public RefundInternalImpl(com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase retrievePaymentUseCase, com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase checkRefundableUseCase, com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase submitRefundUseCase, kotlinx.coroutines.CoroutineScope coroutineScope, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData locationData, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalytics refundAnalytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrievePaymentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkRefundableUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitRefundUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundAnalytics, "");
        this.getHighSpeedVideoSizesFor = retrievePaymentUseCase;
        this.getHighSpeedVideoFpsRanges = checkRefundableUseCase;
        this.getOutputFormats = submitRefundUseCase;
        this.getOutputMinFrameDuration = coroutineScope;
        this.getHighResolutionOutputSizeshNQ4ISI = appInfo;
        this.getInputFormats = platformInfo;
        this.Camera2StreamConfigurationMap = locationData;
        this.getHighSpeedVideoFpsRangesFor = merchantConfig;
        this.getInputSizeshNQ4ISI = refundAnalytics;
        kotlinx.coroutines.flow.MutableSharedFlow<com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.effects = MutableSharedFlow$default;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal
    public final kotlinx.coroutines.flow.SharedFlow<com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects> getEffects() {
        return this.effects;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal
    public final void dispatchAction(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (!(action instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action.DoRefund)) {
            if (action instanceof com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action.RetrievePaymentInfo) {
                final java.lang.String paymentReferenceId = ((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action.RetrievePaymentInfo) action).getPaymentReferenceId();
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getOutputMinFrameDuration, null, null, new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$preRetrievePaymentInfo$1(this, null), 3, null);
                this.getHighSpeedVideoFpsRangesFor.getUserConfigAsync(new kotlin.jvm.functions.Function1<kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$preRetrievePaymentInfo$2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig> result) {
                        Camera2StreamConfigurationMap(result.getCamera2StreamConfigurationMap());
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
                    
                        r2 = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.getHighSpeedVideoFpsRangesFor((com.zettle.sdk.core.user.userconfig.UserConfig) r4);
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void Camera2StreamConfigurationMap(java.lang.Object obj) {
                        kotlinx.coroutines.CoroutineScope coroutineScope;
                        java.util.Currency highSpeedVideoFpsRangesFor;
                        com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this;
                        java.lang.String str = paymentReferenceId;
                        if (kotlin.Result.m23442isSuccessimpl(obj) && highSpeedVideoFpsRangesFor != null) {
                            com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.access$retrievePaymentInfo(refundInternalImpl, str, highSpeedVideoFpsRangesFor);
                        }
                        com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl2 = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this;
                        if (kotlin.Result.m23439exceptionOrNullimpl(obj) != null) {
                            coroutineScope = refundInternalImpl2.getOutputMinFrameDuration;
                            com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(coroutineScope, new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$preRetrievePaymentInfo$2$2$1(refundInternalImpl2, null));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                return;
            }
            return;
        }
        com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action.DoRefund doRefund = (com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Action.DoRefund) action;
        final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload = doRefund.getCardPaymentPayload();
        java.lang.Long amount = doRefund.getAmount();
        java.lang.String refundReferenceId = doRefund.getRefundReferenceId();
        java.lang.String transactionId = cardPaymentPayload.getTransactionId();
        long amount2 = cardPaymentPayload.getAmount();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Do refund for transaction : ");
        sb.append(transactionId);
        sb.append(" - amount : ");
        sb.append(amount2);
        com.zettle.sdk.core.log.LogKt.debug(this, sb.toString());
        this.getOutputFormats.invoke(cardPaymentPayload, amount, refundReferenceId, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.Camera2StreamConfigurationMap, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result result) {
                getHighSpeedVideoFpsRanges(result);
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1$1", f = "RefundInternalImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int Camera2StreamConfigurationMap;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload getHighSpeedVideoFpsRanges;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result getHighSpeedVideoSizes;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.Camera2StreamConfigurationMap;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.String transactionId = this.getHighSpeedVideoFpsRanges.getTransactionId();
                        long amount = this.getHighSpeedVideoFpsRanges.getAmount();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Success to refund transaction : ");
                        sb.append(transactionId);
                        sb.append(" - amount : ");
                        sb.append(amount);
                        com.zettle.sdk.core.log.LogKt.debug(refundInternalImpl, sb.toString());
                        mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                        this.Camera2StreamConfigurationMap = 1;
                        if (mutableSharedFlow.emit(new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefunded(((com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result.Success) this.getHighSpeedVideoSizes).getPayload()), this) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                    return new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl, com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result result, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1.AnonymousClass1> continuation) {
                    super(1, continuation);
                    this.getHighSpeedVideoFpsRangesFor = refundInternalImpl;
                    this.getHighSpeedVideoFpsRanges = cardPaymentPayload;
                    this.getHighSpeedVideoSizes = result;
                }
            }

            public final void getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result result) {
                kotlinx.coroutines.CoroutineScope coroutineScope;
                kotlinx.coroutines.CoroutineScope coroutineScope2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                if (result instanceof com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result.Success) {
                    coroutineScope2 = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this.getOutputMinFrameDuration;
                    com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(coroutineScope2, new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1.AnonymousClass1(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this, cardPaymentPayload, result, null));
                } else if (result instanceof com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result.Failed) {
                    coroutineScope = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this.getOutputMinFrameDuration;
                    com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(coroutineScope, new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1.AnonymousClass2(result, com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this, null));
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1$2", f = "RefundInternalImpl.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result Camera2StreamConfigurationMap;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl getHighSpeedVideoFpsRangesFor;
                int getHighSpeedVideoSizes;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighSpeedVideoSizes;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason reason = ((com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result.Failed) this.Camera2StreamConfigurationMap).getReason();
                        com.zettle.sdk.core.log.LogKt.debug(this.getHighSpeedVideoFpsRangesFor, "Failed to refund reason : ".concat(java.lang.String.valueOf(reason)));
                        mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                        this.getHighSpeedVideoSizes = 1;
                        if (mutableSharedFlow.emit(new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentRefundFailed(reason), this) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                    return new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result result, com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$doRefund$1.AnonymousClass2> continuation) {
                    super(1, continuation);
                    this.Camera2StreamConfigurationMap = result;
                    this.getHighSpeedVideoFpsRangesFor = refundInternalImpl;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Currency getHighSpeedVideoFpsRangesFor(com.zettle.sdk.core.user.userconfig.UserConfig userConfig) {
        try {
            return java.util.Currency.getInstance(userConfig.getCurrency().name());
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public static final /* synthetic */ void access$checkIfPaymentRefundable(final com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl, com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload) {
        com.zettle.sdk.core.log.LogKt.debug(refundInternalImpl, "Check if payment refundable ".concat(java.lang.String.valueOf(cardPaymentPayload.getTransactionId())));
        refundInternalImpl.getHighSpeedVideoFpsRanges.invoke(cardPaymentPayload, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result result) {
                getHighSpeedVideoFpsRangesFor(result);
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1$1", f = "RefundInternalImpl.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result Camera2StreamConfigurationMap;
                int getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.zettle.sdk.core.log.LogKt.debug(this.getHighSpeedVideoFpsRangesFor, "Success check if payment refundable ".concat(java.lang.String.valueOf(((com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result.Success) this.Camera2StreamConfigurationMap).getCardPaymentPayload().getIsRefundable())));
                        mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                        this.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (mutableSharedFlow.emit(new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieved(((com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result.Success) this.Camera2StreamConfigurationMap).getCardPaymentPayload()), this) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                    return new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl, com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result result, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1.AnonymousClass1> continuation) {
                    super(1, continuation);
                    this.getHighSpeedVideoFpsRangesFor = refundInternalImpl;
                    this.Camera2StreamConfigurationMap = result;
                }
            }

            public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result result) {
                kotlinx.coroutines.CoroutineScope coroutineScope;
                kotlinx.coroutines.CoroutineScope coroutineScope2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                if (result instanceof com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result.Success) {
                    coroutineScope2 = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this.getOutputMinFrameDuration;
                    com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(coroutineScope2, new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1.AnonymousClass1(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this, result, null));
                } else if (result instanceof com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result.Failed) {
                    coroutineScope = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this.getOutputMinFrameDuration;
                    com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(coroutineScope, new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1.AnonymousClass2(result, com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this, null));
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1$2", f = "RefundInternalImpl.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl getHighSpeedVideoFpsRanges;
                int getHighSpeedVideoSizes;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighSpeedVideoSizes;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason reason = ((com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result.Failed) this.getHighResolutionOutputSizeshNQ4ISI).getReason();
                        com.zettle.sdk.core.log.LogKt.debug(this.getHighSpeedVideoFpsRanges, "Failed check if payment refundable reason : ".concat(java.lang.String.valueOf(reason)));
                        mutableSharedFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                        this.getHighSpeedVideoSizes = 1;
                        if (mutableSharedFlow.emit(new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieveFailed(reason), this) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                    return new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result result, com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$checkIfPaymentRefundable$1.AnonymousClass2> continuation) {
                    super(1, continuation);
                    this.getHighResolutionOutputSizeshNQ4ISI = result;
                    this.getHighSpeedVideoFpsRanges = refundInternalImpl;
                }
            }

            {
                super(1);
            }
        });
    }

    public static final /* synthetic */ void access$retrievePaymentInfo(final com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl, final java.lang.String str, java.util.Currency currency) {
        com.zettle.sdk.core.log.LogKt.debug(refundInternalImpl, "Start retrieve payment info ".concat(java.lang.String.valueOf(str)));
        refundInternalImpl.getHighSpeedVideoSizesFor.invoke(str, currency, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result result) {
                getHighSpeedVideoFpsRangesFor(result);
                return kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1$1", f = "RefundInternalImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result getHighSpeedVideoFpsRanges;
                int getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl getHighSpeedVideoSizes;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.getHighSpeedVideoFpsRangesFor != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.log.LogKt.debug(this.getHighSpeedVideoSizes, "Success retrieve payment info ".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap)));
                    com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.access$checkIfPaymentRefundable(this.getHighSpeedVideoSizes, ((com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Success) this.getHighSpeedVideoFpsRanges).getCardPaymentPayload());
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                    return new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl, java.lang.String str, com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result result, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1.AnonymousClass1> continuation) {
                    super(1, continuation);
                    this.getHighSpeedVideoSizes = refundInternalImpl;
                    this.Camera2StreamConfigurationMap = str;
                    this.getHighSpeedVideoFpsRanges = result;
                }
            }

            public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result result) {
                kotlinx.coroutines.CoroutineScope coroutineScope;
                kotlinx.coroutines.CoroutineScope coroutineScope2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                if (result instanceof com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Success) {
                    coroutineScope2 = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this.getOutputMinFrameDuration;
                    com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(coroutineScope2, new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1.AnonymousClass1(com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this, str, result, null));
                } else if (result instanceof com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Failed) {
                    coroutineScope = com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this.getOutputMinFrameDuration;
                    com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(coroutineScope, new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1.AnonymousClass2(result, com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl.this, null));
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1$2", f = "RefundInternalImpl.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int Camera2StreamConfigurationMap;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl getHighSpeedVideoSizes;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.Camera2StreamConfigurationMap;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason reason = ((com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Failed) this.getHighResolutionOutputSizeshNQ4ISI).getReason();
                        com.zettle.sdk.core.log.LogKt.debug(this.getHighSpeedVideoSizes, "Failed retrieve payment info reason : ".concat(java.lang.String.valueOf(reason)));
                        mutableSharedFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                        this.Camera2StreamConfigurationMap = 1;
                        if (mutableSharedFlow.emit(new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternal.Effects.PaymentInfoRetrieveFailed(reason), this) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                    return new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result result, com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl$retrievePaymentInfo$1.AnonymousClass2> continuation) {
                    super(1, continuation);
                    this.getHighResolutionOutputSizeshNQ4ISI = result;
                    this.getHighSpeedVideoSizes = refundInternalImpl;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }
}
