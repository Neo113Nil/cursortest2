package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinator$launchSafe$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startProvisioning$$inlined$launchSafe$1", f = "SetupFlowCoordinator.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {898, 899, 936}, m = "invokeSuspend", n = {"$completion", "domainCardType", "$i$a$-launchSafe-SetupFlowCoordinator$startProvisioning$1", "$completion", "domainCardType", "setAsDefault", "$i$a$-launchSafe-SetupFlowCoordinator$startProvisioning$1", "$completion", "domainCardType", "setAsDefault", "flowEntryPoint", "cardInfo", "clientMetadataId", "$i$a$-launchSafe-SetupFlowCoordinator$startProvisioning$1"}, nl = {899, 900, 939}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, v = 2)
/* loaded from: classes15.dex */
public final class SetupFlowCoordinator$startProvisioning$$inlined$launchSafe$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getOutputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3 A[Catch: Exception -> 0x018b, CancellationException -> 0x01df, TryCatch #2 {CancellationException -> 0x01df, Exception -> 0x018b, blocks: (B:8:0x002d, B:15:0x0048, B:17:0x00ad, B:19:0x00b3, B:20:0x00c9, B:22:0x00d5, B:23:0x00dc, B:25:0x00e4, B:26:0x0118, B:28:0x0138, B:29:0x013f, B:34:0x0100, B:36:0x00bc, B:38:0x00c0, B:39:0x0184, B:40:0x0189, B:42:0x005c, B:44:0x008e, B:48:0x0067), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5 A[Catch: Exception -> 0x018b, CancellationException -> 0x01df, TryCatch #2 {CancellationException -> 0x01df, Exception -> 0x018b, blocks: (B:8:0x002d, B:15:0x0048, B:17:0x00ad, B:19:0x00b3, B:20:0x00c9, B:22:0x00d5, B:23:0x00dc, B:25:0x00e4, B:26:0x0118, B:28:0x0138, B:29:0x013f, B:34:0x0100, B:36:0x00bc, B:38:0x00c0, B:39:0x0184, B:40:0x0189, B:42:0x005c, B:44:0x008e, B:48:0x0067), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4 A[Catch: Exception -> 0x018b, CancellationException -> 0x01df, TryCatch #2 {CancellationException -> 0x01df, Exception -> 0x018b, blocks: (B:8:0x002d, B:15:0x0048, B:17:0x00ad, B:19:0x00b3, B:20:0x00c9, B:22:0x00d5, B:23:0x00dc, B:25:0x00e4, B:26:0x0118, B:28:0x0138, B:29:0x013f, B:34:0x0100, B:36:0x00bc, B:38:0x00c0, B:39:0x0184, B:40:0x0189, B:42:0x005c, B:44:0x008e, B:48:0x0067), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0138 A[Catch: Exception -> 0x018b, CancellationException -> 0x01df, TryCatch #2 {CancellationException -> 0x01df, Exception -> 0x018b, blocks: (B:8:0x002d, B:15:0x0048, B:17:0x00ad, B:19:0x00b3, B:20:0x00c9, B:22:0x00d5, B:23:0x00dc, B:25:0x00e4, B:26:0x0118, B:28:0x0138, B:29:0x013f, B:34:0x0100, B:36:0x00bc, B:38:0x00c0, B:39:0x0184, B:40:0x0189, B:42:0x005c, B:44:0x008e, B:48:0x0067), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100 A[Catch: Exception -> 0x018b, CancellationException -> 0x01df, TryCatch #2 {CancellationException -> 0x01df, Exception -> 0x018b, blocks: (B:8:0x002d, B:15:0x0048, B:17:0x00ad, B:19:0x00b3, B:20:0x00c9, B:22:0x00d5, B:23:0x00dc, B:25:0x00e4, B:26:0x0118, B:28:0x0138, B:29:0x013f, B:34:0x0100, B:36:0x00bc, B:38:0x00c0, B:39:0x0184, B:40:0x0189, B:42:0x005c, B:44:0x008e, B:48:0x0067), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc A[Catch: Exception -> 0x018b, CancellationException -> 0x01df, TryCatch #2 {CancellationException -> 0x01df, Exception -> 0x018b, blocks: (B:8:0x002d, B:15:0x0048, B:17:0x00ad, B:19:0x00b3, B:20:0x00c9, B:22:0x00d5, B:23:0x00dc, B:25:0x00e4, B:26:0x0118, B:28:0x0138, B:29:0x013f, B:34:0x0100, B:36:0x00bc, B:38:0x00c0, B:39:0x0184, B:40:0x0189, B:42:0x005c, B:44:0x008e, B:48:0x0067), top: B:2:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.ResolveDefaultCardUseCase resolveDefaultCardUseCase;
        java.lang.Object invoke;
        java.lang.Object obj2;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault;
        com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase generateRiskDataUseCase;
        java.lang.Object invoke2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType2;
        java.lang.Object obj3;
        arrow.core.Either either;
        java.lang.String str;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo defaultCardInfo;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase;
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> invoke3;
        kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> flowCollector;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputSizeshNQ4ISI;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(" failed");
            logger.e(sb.toString(), e2);
            this.getOutputMinFrameDurationlomOqCM.getStateHolder().cacheErrorState(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.class), new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.ErrorState.Tokenization(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.GENERIC_ERROR, null, null, 0));
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowNavigator navigator = this.getOutputMinFrameDurationlomOqCM.getNavigator();
            com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization tokenization = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.SetupFlowNavStep.Error.Tokenization.INSTANCE;
            java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str3);
            sb2.append(" failed");
            navigator.navigate(tokenization, sb2.toString());
        }
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startProvisioning$$inlined$launchSafe$1 setupFlowCoordinator$startProvisioning$$inlined$launchSafe$1 = this;
            cardType = com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toCardType(this.Camera2StreamConfigurationMap.getType());
            resolveDefaultCardUseCase = this.getOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setupFlowCoordinator$startProvisioning$$inlined$launchSafe$1);
            this.getHighSpeedVideoFpsRangesFor = cardType;
            this.getHighSpeedVideoSizes = 0;
            this.getInputSizeshNQ4ISI = 1;
            invoke = resolveDefaultCardUseCase.invoke(cardType, this);
            if (invoke != coroutine_suspended) {
                obj2 = setupFlowCoordinator$startProvisioning$$inlined$launchSafe$1;
                i = 0;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            i = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault2 = (com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault) this.getOutputMinFrameDuration;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj4 = (kotlin.coroutines.Continuation) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            cardType2 = cardType3;
            obj3 = obj4;
            setAsDefault = setAsDefault2;
            invoke2 = obj;
            either = (arrow.core.Either) invoke2;
            if (!(either instanceof arrow.core.Either.Right)) {
                str = (java.lang.String) ((arrow.core.Either.Right) either).getValue();
            } else {
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = null;
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint = !this.getOutputSizeshNQ4ISI.getStateHolder().getPpdcCardCreated() ? com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint.NFC_PROVISIONING_WITH_PRODUCT_ONBOARDING : null;
            payLaterData = this.Camera2StreamConfigurationMap.getPayLaterData();
            if (payLaterData == null) {
                defaultCardInfo = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo(cardType2, this.Camera2StreamConfigurationMap.getBrand(), this.getOutputSizeshNQ4ISI.getStateHolder().getCardDescription(), com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toPayLaterData(payLaterData));
            } else {
                defaultCardInfo = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DefaultCardInfo(cardType2, this.Camera2StreamConfigurationMap.getBrand(), this.getOutputSizeshNQ4ISI.getStateHolder().getCardDescription());
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = defaultCardInfo;
            payPalAddCardUseCase = this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            java.lang.String id = this.Camera2StreamConfigurationMap.getId();
            java.lang.String cvv = this.getOutputSizeshNQ4ISI.getStateHolder().getCvv();
            com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection = this.Camera2StreamConfigurationMap.getCardArtCollection();
            invoke3 = payPalAddCardUseCase.invoke(id, cardType2, cvv, setAsDefault, cardArtCollection == null ? com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toCardArtCollection(cardArtCollection) : null, str, cardInfo, flowEntryPoint);
            final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator = this.getOutputSizeshNQ4ISI;
            flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startProvisioning$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj5, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.access$processAddCardState(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.this, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState) obj5);
                    return kotlin.Unit.INSTANCE;
                }
            };
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardType2);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setAsDefault);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowEntryPoint);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardInfo);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getHighSpeedVideoSizes = i;
            this.getInputSizeshNQ4ISI = 3;
            if (invoke3.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        i = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType) this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj5 = (kotlin.coroutines.Continuation) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        obj2 = obj5;
        cardType = cardType4;
        invoke = obj;
        setAsDefault = (com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault) invoke;
        generateRiskDataUseCase = this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
        this.getHighSpeedVideoFpsRangesFor = cardType;
        this.getOutputMinFrameDuration = setAsDefault;
        this.getHighSpeedVideoSizes = i;
        this.getInputSizeshNQ4ISI = 2;
        invoke2 = generateRiskDataUseCase.invoke(this);
        if (invoke2 != coroutine_suspended) {
            cardType2 = cardType;
            obj3 = obj2;
            either = (arrow.core.Either) invoke2;
            if (!(either instanceof arrow.core.Either.Right)) {
            }
            if (!this.getOutputSizeshNQ4ISI.getStateHolder().getPpdcCardCreated()) {
            }
            payLaterData = this.Camera2StreamConfigurationMap.getPayLaterData();
            if (payLaterData == null) {
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo2 = defaultCardInfo;
            payPalAddCardUseCase = this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            java.lang.String id2 = this.Camera2StreamConfigurationMap.getId();
            java.lang.String cvv2 = this.getOutputSizeshNQ4ISI.getStateHolder().getCvv();
            com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection2 = this.Camera2StreamConfigurationMap.getCardArtCollection();
            invoke3 = payPalAddCardUseCase.invoke(id2, cardType2, cvv2, setAsDefault, cardArtCollection2 == null ? com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toCardArtCollection(cardArtCollection2) : null, str, cardInfo2, flowEntryPoint);
            final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator2 = this.getOutputSizeshNQ4ISI;
            flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startProvisioning$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj52, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.access$processAddCardState(com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator.this, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState) obj52);
                    return kotlin.Unit.INSTANCE;
                }
            };
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardType2);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setAsDefault);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowEntryPoint);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardInfo2);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getHighSpeedVideoSizes = i;
            this.getInputSizeshNQ4ISI = 3;
            if (invoke3.collect(flowCollector, this) == coroutine_suspended) {
            }
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startProvisioning$$inlined$launchSafe$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator$startProvisioning$$inlined$launchSafe$1(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDurationlomOqCM, continuation, this.Camera2StreamConfigurationMap, this.getOutputSizeshNQ4ISI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupFlowCoordinator$startProvisioning$$inlined$launchSafe$1(java.lang.String str, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator2) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getOutputMinFrameDurationlomOqCM = setupFlowCoordinator;
        this.Camera2StreamConfigurationMap = setupCardInfo;
        this.getOutputSizeshNQ4ISI = setupFlowCoordinator2;
    }
}
