package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 42\u00020\u0001:\u00045674B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00190\u0014H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001a\u0010\u001fJJ\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0086@¢\u0006\u0004\b!\u0010\"J,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020#H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b'\u0010)JF\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0082@¢\u0006\u0004\b-\u0010.R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00101R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00102R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00103"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/AutoReloadFlowOrchestrator;", "", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/GetAutoReloadSetupDetailsUseCase;", "getAutoReloadSetupDetailsUseCase", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SetupAutoReloadUseCase;", "setupAutoReloadUseCase", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/DeactivateAutoReloadUseCase;", "deactivateAutoReloadUseCase", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase;", "saveDistributionConfigurationUseCase", "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/usecase/GetAutoReloadSetupDetailsUseCase;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SetupAutoReloadUseCase;Lcom/paypal/oslo/feature/smartroute/domain/usecase/DeactivateAutoReloadUseCase;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase;)V", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "skipSave", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowStep;", "", "onStepProgress", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadFlowError;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/AutoReloadFlowOrchestrator$FlowResult;", "executeSetupFlow", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/AutoReloadFlowOrchestrator$ValidatedSetupDetails;", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "", "p1", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "balanceId", "executeDeactivateFlow", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/AutoReloadFlowOrchestrator$DeactivateRollbackParams;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lcom/paypal/oslo/feature/smartroute/domain/usecase/AutoReloadFlowOrchestrator$DeactivateRollbackParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;)Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p2", "p3", "p4", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/GetAutoReloadSetupDetailsUseCase;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SetupAutoReloadUseCase;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/DeactivateAutoReloadUseCase;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase;", "Companion", "ValidatedSetupDetails", "DeactivateRollbackParams", "FlowResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoReloadFlowOrchestrator {
    public static final int $stable = 0;
    public static final java.lang.String DEFAULT_CURRENCY = "USD";
    public static final java.lang.String DEFAULT_RELOAD_AMOUNT = "25.00";
    public static final java.lang.String DEFAULT_THRESHOLD_AMOUNT = "25.00";
    private final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AutoReloadFlowOrchestrator(com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase getAutoReloadSetupDetailsUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase setupAutoReloadUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase deactivateAutoReloadUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase saveDistributionConfigurationUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAutoReloadSetupDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupAutoReloadUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivateAutoReloadUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saveDistributionConfigurationUseCase, "");
        this.getHighSpeedVideoFpsRanges = getAutoReloadSetupDetailsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = setupAutoReloadUseCase;
        this.getHighSpeedVideoSizes = deactivateAutoReloadUseCase;
        this.Camera2StreamConfigurationMap = saveDistributionConfigurationUseCase;
    }

    public static /* synthetic */ java.lang.Object executeSetupFlow$default(com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return autoReloadFlowOrchestrator.executeSetupFlow(distributionConfiguration, z, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeSetupFlow(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, boolean z, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError, com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult>> continuation) {
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeSetupFlow$1 autoReloadFlowOrchestrator$executeSetupFlow$1;
        int i;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration2;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep, kotlin.Unit> function12;
        boolean z2;
        arrow.core.Either either;
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.ValidatedSetupDetails validatedSetupDetails;
        java.lang.String str;
        java.math.BigDecimal bigDecimal;
        java.lang.String str2;
        com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.InsufficientSavingsBalance insufficientSavingsBalance;
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest autoReloadSetupRequest;
        java.math.BigDecimal bigDecimal2;
        java.lang.Object obj;
        java.lang.Object invoke;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        arrow.core.Either either2;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeSetupFlow$1) {
            autoReloadFlowOrchestrator$executeSetupFlow$1 = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeSetupFlow$1) continuation;
            if ((autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.smartroute.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP);
                    pairArr[1] = kotlin.TuplesKt.to("hasExistingConfig", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(distributionConfiguration.getAutoReloadThresholdAmount() != null));
                    pairArr[2] = kotlin.TuplesKt.to("skipSave", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                    pairArr[3] = kotlin.TuplesKt.to("status", distributionConfiguration.getStatus().name());
                    com.paypal.android.logger.Logger.i$default(logger, "Starting auto-reload setup flow", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    function1.invoke(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.FETCH_SETUP_DETAILS);
                    distributionConfiguration2 = distributionConfiguration;
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoSizes = distributionConfiguration2;
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputMinFrameDurationlomOqCM = z;
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputSizeshNQ4ISI = 1;
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(autoReloadFlowOrchestrator$executeSetupFlow$1);
                    if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                        function12 = function1;
                        z2 = z;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z3 = autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputMinFrameDurationlomOqCM;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return obj2;
                    }
                    boolean z4 = autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest autoReloadSetupRequest2 = (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest) autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputMinFrameDuration;
                    java.math.BigDecimal bigDecimal3 = (java.math.BigDecimal) autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputFormats;
                    java.lang.String str7 = (java.lang.String) autoReloadFlowOrchestrator$executeSetupFlow$1.getInputSizeshNQ4ISI;
                    str6 = (java.lang.String) autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoSizesFor;
                    java.lang.String str8 = (java.lang.String) autoReloadFlowOrchestrator$executeSetupFlow$1.getInputFormats;
                    str5 = (java.lang.String) autoReloadFlowOrchestrator$executeSetupFlow$1.Camera2StreamConfigurationMap;
                    str3 = (java.lang.String) autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoFpsRangesFor;
                    validatedSetupDetails = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.ValidatedSetupDetails) autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) autoReloadFlowOrchestrator$executeSetupFlow$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration3 = (com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration) autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    obj = "step";
                    str = str7;
                    str4 = str8;
                    invoke = obj2;
                    bigDecimal2 = bigDecimal3;
                    distributionConfiguration2 = distributionConfiguration3;
                    autoReloadSetupRequest = autoReloadSetupRequest2;
                    z2 = z4;
                    function12 = function13;
                    either2 = (arrow.core.Either) invoke;
                    if (either2 instanceof arrow.core.Either.Right) {
                        if (either2 instanceof arrow.core.Either.Left) {
                            com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError autoReloadError = (com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError) ((arrow.core.Either.Left) either2).getValue();
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Auto-reload setup failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj, "SETUP_AUTO_RELOAD")), null, 4, null);
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.SetupFailed(autoReloadError.getMessage()));
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (z2) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Setup flow completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP)), null, 4, null);
                        copy = r24.copy((r30 & 1) != 0 ? r24.status : null, (r30 & 2) != 0 ? r24.savingsPercentage : 0.0f, (r30 & 4) != 0 ? r24.cryptoPercentage : 0.0f, (r30 & 8) != 0 ? r24.cryptoApyRate : null, (r30 & 16) != 0 ? r24.cryptoOptInStatus : null, (r30 & 32) != 0 ? r24.savingsApy : null, (r30 & 64) != 0 ? r24.autoReloadEnabled : true, (r30 & 128) != 0 ? r24.autoReloadThresholdAmount : null, (r30 & 256) != 0 ? r24.autoReloadAmount : null, (r30 & 512) != 0 ? r24.autoReloadCurrency : null, (r30 & 1024) != 0 ? r24.autoReloadFinancialInstrumentId : null, (r30 & 2048) != 0 ? r24.version : null, (r30 & 4096) != 0 ? r24.savingsEligibilityStatus : null, (r30 & 8192) != 0 ? distributionConfiguration2.pyusdEligibilityStatus : null);
                        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult(copy, getHighSpeedVideoFpsRanges(copy)));
                    }
                    function12.invoke(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.UPDATE_SMART_ROUTE);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionConfiguration2);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validatedSetupDetails);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal2);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadSetupRequest);
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputMinFrameDurationlomOqCM = z2;
                    autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputSizeshNQ4ISI = 3;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(distributionConfiguration2, str3, autoReloadFlowOrchestrator$executeSetupFlow$1);
                    return highResolutionOutputSizeshNQ4ISI2 == coroutine_suspended ? coroutine_suspended : highResolutionOutputSizeshNQ4ISI2;
                }
                z2 = autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputMinFrameDurationlomOqCM;
                function12 = (kotlin.jvm.functions.Function1) autoReloadFlowOrchestrator$executeSetupFlow$1.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration4 = (com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration) autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj2);
                highResolutionOutputSizeshNQ4ISI = obj2;
                distributionConfiguration2 = distributionConfiguration4;
                either = (arrow.core.Either) highResolutionOutputSizeshNQ4ISI;
                if (either instanceof arrow.core.Either.Right) {
                    if (either instanceof arrow.core.Either.Left) {
                        return arrow.core.EitherKt.left((com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError) ((arrow.core.Either.Left) either).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                validatedSetupDetails = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.ValidatedSetupDetails) ((arrow.core.Either.Right) either).getValue();
                java.lang.String str9 = validatedSetupDetails.Camera2StreamConfigurationMap;
                java.lang.String str10 = validatedSetupDetails.getHighSpeedVideoFpsRanges;
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Setup details fetched successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP), kotlin.TuplesKt.to("step", "FETCH_SETUP_DETAILS")), null, 4, null);
                java.lang.String autoReloadThresholdAmount = distributionConfiguration2.getAutoReloadThresholdAmount();
                if (autoReloadThresholdAmount == null) {
                    autoReloadThresholdAmount = "25.00";
                }
                java.lang.String autoReloadAmount = distributionConfiguration2.getAutoReloadAmount();
                if (autoReloadAmount == null) {
                    autoReloadAmount = "25.00";
                }
                java.lang.String autoReloadCurrency = distributionConfiguration2.getAutoReloadCurrency();
                if (autoReloadCurrency == null) {
                    autoReloadCurrency = "USD";
                }
                str = autoReloadCurrency;
                java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(autoReloadAmount);
                if (bigDecimalOrNull == null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Invalid reload amount format during setup validation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP), kotlin.TuplesKt.to("invalidReloadAmount", autoReloadAmount)), null, 4, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.SetupFailed("Invalid reload amount format: ".concat(java.lang.String.valueOf(autoReloadAmount))));
                }
                java.math.BigDecimal bigDecimal4 = validatedSetupDetails.getHighSpeedVideoFpsRangesFor;
                if (bigDecimal4 == null || bigDecimal4.compareTo(bigDecimalOrNull) >= 0) {
                    bigDecimal = bigDecimalOrNull;
                    str2 = autoReloadAmount;
                    insufficientSavingsBalance = null;
                } else {
                    bigDecimal = bigDecimalOrNull;
                    str2 = autoReloadAmount;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Insufficient savings balance for auto-reload", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("savingsBalance", bigDecimal4), kotlin.TuplesKt.to("reloadAmount", bigDecimalOrNull)), null, 4, null);
                    insufficientSavingsBalance = new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.InsufficientSavingsBalance("Insufficient savings balance");
                }
                if (insufficientSavingsBalance != null) {
                    return arrow.core.EitherKt.left(insufficientSavingsBalance);
                }
                function12.invoke(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.SETUP_AUTO_RELOAD);
                bigDecimal2 = bigDecimal;
                java.lang.String str11 = str2;
                obj = "step";
                autoReloadSetupRequest = new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest(str9, str10, autoReloadThresholdAmount, str11, str);
                com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase setupAutoReloadUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoSizes = distributionConfiguration2;
                autoReloadFlowOrchestrator$executeSetupFlow$1.getHighResolutionOutputSizeshNQ4ISI = function12;
                autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validatedSetupDetails);
                autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoFpsRangesFor = str9;
                autoReloadFlowOrchestrator$executeSetupFlow$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str10);
                autoReloadFlowOrchestrator$executeSetupFlow$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadThresholdAmount);
                autoReloadFlowOrchestrator$executeSetupFlow$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str11);
                autoReloadFlowOrchestrator$executeSetupFlow$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal2);
                autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadSetupRequest);
                autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputMinFrameDurationlomOqCM = z2;
                autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputSizeshNQ4ISI = 2;
                invoke = setupAutoReloadUseCase.invoke(autoReloadSetupRequest, autoReloadFlowOrchestrator$executeSetupFlow$1);
                if (invoke != coroutine_suspended) {
                    str3 = str9;
                    str4 = autoReloadThresholdAmount;
                    str5 = str10;
                    str6 = str11;
                    either2 = (arrow.core.Either) invoke;
                    if (either2 instanceof arrow.core.Either.Right) {
                    }
                }
                return coroutine_suspended;
            }
        }
        autoReloadFlowOrchestrator$executeSetupFlow$1 = new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeSetupFlow$1(this, continuation);
        java.lang.Object obj22 = autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadFlowOrchestrator$executeSetupFlow$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) highResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError, com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.ValidatedSetupDetails>> continuation) {
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1 autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1) {
            autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1 = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1) continuation;
            if ((autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase getAutoReloadSetupDetailsUseCase = this.getHighSpeedVideoFpsRanges;
                    autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getAutoReloadSetupDetailsUseCase.invoke(autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails autoReloadSetupDetails = (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails) ((arrow.core.Either.Right) either).getValue();
                    java.lang.String balanceId = autoReloadSetupDetails.getBalanceId();
                    java.lang.String moneyboxId = autoReloadSetupDetails.getMoneyboxId();
                    if (balanceId == null) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.FetchSetupDetailsFailed("Balance ID not found"));
                    }
                    if (moneyboxId == null) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.FetchSetupDetailsFailed("Moneybox ID not found"));
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.ValidatedSetupDetails(balanceId, moneyboxId, autoReloadSetupDetails.getSavingsBalance()));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.FetchSetupDetailsFailed(((com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue()).getMessage()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1 = new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1(this, continuation);
        java.lang.Object obj2 = autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadFlowOrchestrator$fetchAndValidateSetupDetails$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/AutoReloadFlowOrchestrator$ValidatedSetupDetails;", "", "", "p0", "p1", "Ljava/math/BigDecimal;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/math/BigDecimal;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class ValidatedSetupDetails {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.lang.String Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final java.math.BigDecimal getHighSpeedVideoFpsRangesFor;

        public ValidatedSetupDetails(java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = str2;
            this.getHighSpeedVideoFpsRangesFor = bigDecimal;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.Camera2StreamConfigurationMap;
            java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            java.math.BigDecimal bigDecimal = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidatedSetupDetails(Camera2StreamConfigurationMap=");
            sb.append(str);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(str2);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(bigDecimal);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.Camera2StreamConfigurationMap.hashCode();
            int hashCode2 = this.getHighSpeedVideoFpsRanges.hashCode();
            java.math.BigDecimal bigDecimal = this.getHighSpeedVideoFpsRangesFor;
            return (((hashCode * 31) + hashCode2) * 31) + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.ValidatedSetupDetails)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.ValidatedSetupDetails validatedSetupDetails = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.ValidatedSetupDetails) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, validatedSetupDetails.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, validatedSetupDetails.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, validatedSetupDetails.getHighSpeedVideoFpsRangesFor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r9 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError, com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult>> continuation) {
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveAndHandleRollback$1 autoReloadFlowOrchestrator$saveAndHandleRollback$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveAndHandleRollback$1) {
            autoReloadFlowOrchestrator$saveAndHandleRollback$1 = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveAndHandleRollback$1) continuation;
            if ((autoReloadFlowOrchestrator$saveAndHandleRollback$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                autoReloadFlowOrchestrator$saveAndHandleRollback$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = autoReloadFlowOrchestrator$saveAndHandleRollback$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadFlowOrchestrator$saveAndHandleRollback$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase saveDistributionConfigurationUseCase = this.Camera2StreamConfigurationMap;
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionConfiguration);
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.getHighSpeedVideoFpsRangesFor = str;
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.getInputSizeshNQ4ISI = 1;
                    obj = saveDistributionConfigurationUseCase.invoke(distributionConfiguration, autoReloadFlowOrchestrator$saveAndHandleRollback$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = autoReloadFlowOrchestrator$saveAndHandleRollback$1.getHighSpeedVideoSizes;
                        int i3 = autoReloadFlowOrchestrator$saveAndHandleRollback$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    str = (java.lang.String) autoReloadFlowOrchestrator$saveAndHandleRollback$1.getHighSpeedVideoFpsRangesFor;
                    distributionConfiguration = (com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration) autoReloadFlowOrchestrator$saveAndHandleRollback$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult saveResult = (com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Setup flow completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP)), null, 4, null);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult(saveResult.getConfiguration(), saveResult.getToastMessage()));
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.smartroute.domain.error.DistributionError distributionError = (com.paypal.oslo.feature.smartroute.domain.error.DistributionError) ((arrow.core.Either.Left) either).getValue();
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionConfiguration);
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionError);
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.Camera2StreamConfigurationMap = 0;
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.getHighSpeedVideoSizes = 0;
                    autoReloadFlowOrchestrator$saveAndHandleRollback$1.getInputSizeshNQ4ISI = 2;
                    obj = getHighSpeedVideoFpsRanges(str, autoReloadFlowOrchestrator$saveAndHandleRollback$1);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        autoReloadFlowOrchestrator$saveAndHandleRollback$1 = new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveAndHandleRollback$1(this, continuation);
        java.lang.Object obj2 = autoReloadFlowOrchestrator$saveAndHandleRollback$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadFlowOrchestrator$saveAndHandleRollback$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public static /* synthetic */ java.lang.Object executeDeactivateFlow$default(com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, java.lang.String str, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return autoReloadFlowOrchestrator.executeDeactivateFlow(distributionConfiguration, str, z, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeDeactivateFlow(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, java.lang.String str, boolean z, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError, com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult>> continuation) {
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeDeactivateFlow$1 autoReloadFlowOrchestrator$executeDeactivateFlow$1;
        int i;
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.DeactivateRollbackParams deactivateRollbackParams;
        boolean z2;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration2;
        java.lang.String str2;
        arrow.core.Either either;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep, kotlin.Unit> function12 = function1;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeDeactivateFlow$1) {
            autoReloadFlowOrchestrator$executeDeactivateFlow$1 = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeDeactivateFlow$1) continuation;
            if ((autoReloadFlowOrchestrator$executeDeactivateFlow$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                autoReloadFlowOrchestrator$executeDeactivateFlow$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = autoReloadFlowOrchestrator$executeDeactivateFlow$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadFlowOrchestrator$executeDeactivateFlow$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Starting auto-reload deactivate flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "DEACTIVATE"), kotlin.TuplesKt.to("skipSave", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)), kotlin.TuplesKt.to("status", distributionConfiguration.getStatus().name())), null, 4, null);
                    java.lang.String autoReloadThresholdAmount = distributionConfiguration.getAutoReloadThresholdAmount();
                    java.lang.String str3 = autoReloadThresholdAmount == null ? "25.00" : autoReloadThresholdAmount;
                    java.lang.String autoReloadAmount = distributionConfiguration.getAutoReloadAmount();
                    java.lang.String str4 = autoReloadAmount == null ? "25.00" : autoReloadAmount;
                    java.lang.String autoReloadCurrency = distributionConfiguration.getAutoReloadCurrency();
                    if (autoReloadCurrency == null) {
                        autoReloadCurrency = "USD";
                    }
                    deactivateRollbackParams = new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.DeactivateRollbackParams(str, str3, str4, autoReloadCurrency, distributionConfiguration.getAutoReloadFinancialInstrumentId());
                    function12.invoke(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.DEACTIVATE_AUTO_RELOAD);
                    com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase deactivateAutoReloadUseCase = this.getHighSpeedVideoSizes;
                    autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoSizes = distributionConfiguration;
                    autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    autoReloadFlowOrchestrator$executeDeactivateFlow$1.Camera2StreamConfigurationMap = function12;
                    autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoFpsRangesFor = deactivateRollbackParams;
                    z2 = z;
                    autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoFpsRanges = z2;
                    autoReloadFlowOrchestrator$executeDeactivateFlow$1.getOutputFormats = 1;
                    obj = deactivateAutoReloadUseCase.invoke(str, autoReloadFlowOrchestrator$executeDeactivateFlow$1);
                    if (obj != coroutine_suspended) {
                        distributionConfiguration2 = distributionConfiguration;
                        str2 = str;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                boolean z4 = autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoFpsRanges;
                deactivateRollbackParams = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.DeactivateRollbackParams) autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) autoReloadFlowOrchestrator$executeDeactivateFlow$1.Camera2StreamConfigurationMap;
                str2 = (java.lang.String) autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration3 = (com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration) autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                distributionConfiguration2 = distributionConfiguration3;
                z2 = z4;
                function12 = function13;
                com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration4 = distributionConfiguration2;
                either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Right) {
                    if (either instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError autoReloadError = (com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue();
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Auto-reload deactivation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("step", "DEACTIVATE_AUTO_RELOAD")), null, 4, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.DeactivateFailed(autoReloadError.getMessage()));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (z2) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Deactivate flow completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "DEACTIVATE")), null, 4, null);
                    copy = distributionConfiguration4.copy((r30 & 1) != 0 ? distributionConfiguration4.status : null, (r30 & 2) != 0 ? distributionConfiguration4.savingsPercentage : 0.0f, (r30 & 4) != 0 ? distributionConfiguration4.cryptoPercentage : 0.0f, (r30 & 8) != 0 ? distributionConfiguration4.cryptoApyRate : null, (r30 & 16) != 0 ? distributionConfiguration4.cryptoOptInStatus : null, (r30 & 32) != 0 ? distributionConfiguration4.savingsApy : null, (r30 & 64) != 0 ? distributionConfiguration4.autoReloadEnabled : false, (r30 & 128) != 0 ? distributionConfiguration4.autoReloadThresholdAmount : null, (r30 & 256) != 0 ? distributionConfiguration4.autoReloadAmount : null, (r30 & 512) != 0 ? distributionConfiguration4.autoReloadCurrency : null, (r30 & 1024) != 0 ? distributionConfiguration4.autoReloadFinancialInstrumentId : null, (r30 & 2048) != 0 ? distributionConfiguration4.version : null, (r30 & 4096) != 0 ? distributionConfiguration4.savingsEligibilityStatus : null, (r30 & 8192) != 0 ? distributionConfiguration4.pyusdEligibilityStatus : null);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult(copy, getHighSpeedVideoFpsRanges(copy)));
                }
                function12.invoke(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.UPDATE_SMART_ROUTE);
                autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionConfiguration4);
                autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                autoReloadFlowOrchestrator$executeDeactivateFlow$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deactivateRollbackParams);
                autoReloadFlowOrchestrator$executeDeactivateFlow$1.getHighSpeedVideoFpsRanges = z2;
                autoReloadFlowOrchestrator$executeDeactivateFlow$1.getOutputFormats = 2;
                java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(distributionConfiguration4, deactivateRollbackParams, autoReloadFlowOrchestrator$executeDeactivateFlow$1);
                return Camera2StreamConfigurationMap == coroutine_suspended ? coroutine_suspended : Camera2StreamConfigurationMap;
            }
        }
        autoReloadFlowOrchestrator$executeDeactivateFlow$1 = new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$executeDeactivateFlow$1(this, continuation);
        java.lang.Object obj2 = autoReloadFlowOrchestrator$executeDeactivateFlow$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadFlowOrchestrator$executeDeactivateFlow$1.getOutputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration42 = distributionConfiguration2;
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Right) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        if (r12 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ef, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r12 != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.DeactivateRollbackParams deactivateRollbackParams, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError, com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult>> continuation) {
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveOrRollbackDeactivation$1 autoReloadFlowOrchestrator$saveOrRollbackDeactivation$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveOrRollbackDeactivation$1) {
            autoReloadFlowOrchestrator$saveOrRollbackDeactivation$1 = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveOrRollbackDeactivation$1) continuation;
            if ((autoReloadFlowOrchestrator$saveOrRollbackDeactivation$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                autoReloadFlowOrchestrator$saveOrRollbackDeactivation$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveOrRollbackDeactivation$1 autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12 = autoReloadFlowOrchestrator$saveOrRollbackDeactivation$1;
                java.lang.Object obj = autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase saveDistributionConfigurationUseCase = this.Camera2StreamConfigurationMap;
                    autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionConfiguration);
                    autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighResolutionOutputSizeshNQ4ISI = deactivateRollbackParams;
                    autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getOutputMinFrameDuration = 1;
                    obj = saveDistributionConfigurationUseCase.invoke(distributionConfiguration, autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighSpeedVideoFpsRanges;
                        int i3 = autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    deactivateRollbackParams = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.DeactivateRollbackParams) autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighResolutionOutputSizeshNQ4ISI;
                    distributionConfiguration = (com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration) autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult saveResult = (com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Deactivate flow completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "DEACTIVATE")), null, 4, null);
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult(saveResult.getConfiguration(), saveResult.getToastMessage()));
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.smartroute.domain.error.DistributionError distributionError = (com.paypal.oslo.feature.smartroute.domain.error.DistributionError) ((arrow.core.Either.Left) either).getValue();
                java.lang.String str = deactivateRollbackParams.getHighSpeedVideoSizes;
                java.lang.String str2 = deactivateRollbackParams.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str3 = deactivateRollbackParams.getHighSpeedVideoFpsRanges;
                java.lang.String str4 = deactivateRollbackParams.getHighSpeedVideoFpsRangesFor;
                java.lang.String str5 = deactivateRollbackParams.Camera2StreamConfigurationMap;
                autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionConfiguration);
                autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deactivateRollbackParams);
                autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionError);
                autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighSpeedVideoFpsRangesFor = 0;
                autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getHighSpeedVideoFpsRanges = 0;
                autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12.getOutputMinFrameDuration = 2;
                obj = getHighSpeedVideoSizes(str, str2, str3, str4, str5, autoReloadFlowOrchestrator$saveOrRollbackDeactivation$12);
            }
        }
        autoReloadFlowOrchestrator$saveOrRollbackDeactivation$1 = new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveOrRollbackDeactivation$1(this, continuation);
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$saveOrRollbackDeactivation$1 autoReloadFlowOrchestrator$saveOrRollbackDeactivation$122 = autoReloadFlowOrchestrator$saveOrRollbackDeactivation$1;
        java.lang.Object obj2 = autoReloadFlowOrchestrator$saveOrRollbackDeactivation$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadFlowOrchestrator$saveOrRollbackDeactivation$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/AutoReloadFlowOrchestrator$DeactivateRollbackParams;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class DeactivateRollbackParams {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRangesFor;
        final java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.lang.String Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        public DeactivateRollbackParams(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.getHighSpeedVideoSizes = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
            this.getHighSpeedVideoFpsRanges = str3;
            this.getHighSpeedVideoFpsRangesFor = str4;
            this.Camera2StreamConfigurationMap = str5;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.getHighSpeedVideoSizes;
            java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
            java.lang.String str4 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str5 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeactivateRollbackParams(getHighSpeedVideoSizes=");
            sb.append(str);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(str2);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(str3);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(str4);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.getHighSpeedVideoSizes.hashCode();
            int hashCode2 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
            int hashCode3 = this.getHighSpeedVideoFpsRanges.hashCode();
            int hashCode4 = this.getHighSpeedVideoFpsRangesFor.hashCode();
            java.lang.String str = this.Camera2StreamConfigurationMap;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.DeactivateRollbackParams)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.DeactivateRollbackParams deactivateRollbackParams = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.DeactivateRollbackParams) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, deactivateRollbackParams.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, deactivateRollbackParams.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, deactivateRollbackParams.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, deactivateRollbackParams.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, deactivateRollbackParams.Camera2StreamConfigurationMap);
        }
    }

    private static com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration p0) {
        int i = com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.WhenMappings.$EnumSwitchMapping$0[p0.getStatus().ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SettingsSaved.INSTANCE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteTurnedOff.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError, com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult>> continuation) {
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performSetupRollback$1 autoReloadFlowOrchestrator$performSetupRollback$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performSetupRollback$1) {
            autoReloadFlowOrchestrator$performSetupRollback$1 = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performSetupRollback$1) continuation;
            if ((autoReloadFlowOrchestrator$performSetupRollback$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                autoReloadFlowOrchestrator$performSetupRollback$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = autoReloadFlowOrchestrator$performSetupRollback$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadFlowOrchestrator$performSetupRollback$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Initiating rollback: deactivating auto-reload", null, null, 6, null);
                    com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase deactivateAutoReloadUseCase = this.getHighSpeedVideoSizes;
                    autoReloadFlowOrchestrator$performSetupRollback$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    autoReloadFlowOrchestrator$performSetupRollback$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = deactivateAutoReloadUseCase.invoke(str, autoReloadFlowOrchestrator$performSetupRollback$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Rollback completed, Smart Route update had failed", null, null, 6, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.UpdateSmartRouteFailed("Smart Route update failed", true));
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError autoReloadError = (com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Rollback failed: could not deactivate auto-reload", null, null, null, 14, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.RollbackFailed("Rollback failed: ".concat(java.lang.String.valueOf(autoReloadError.getMessage())), com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.DEACTIVATE_AUTO_RELOAD));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        autoReloadFlowOrchestrator$performSetupRollback$1 = new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performSetupRollback$1(this, continuation);
        java.lang.Object obj2 = autoReloadFlowOrchestrator$performSetupRollback$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadFlowOrchestrator$performSetupRollback$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError, com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult>> continuation) {
        com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performDeactivateRollback$1 autoReloadFlowOrchestrator$performDeactivateRollback$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performDeactivateRollback$1) {
            autoReloadFlowOrchestrator$performDeactivateRollback$1 = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performDeactivateRollback$1) continuation;
            if ((autoReloadFlowOrchestrator$performDeactivateRollback$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                autoReloadFlowOrchestrator$performDeactivateRollback$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = autoReloadFlowOrchestrator$performDeactivateRollback$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadFlowOrchestrator$performDeactivateRollback$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Initiating rollback: re-enabling auto-reload", null, null, 6, null);
                    com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest autoReloadSetupRequest = new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest(str, str5 == null ? str : str5, str2, str3, str4);
                    com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase setupAutoReloadUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    autoReloadFlowOrchestrator$performDeactivateRollback$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    autoReloadFlowOrchestrator$performDeactivateRollback$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    autoReloadFlowOrchestrator$performDeactivateRollback$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    autoReloadFlowOrchestrator$performDeactivateRollback$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    autoReloadFlowOrchestrator$performDeactivateRollback$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                    autoReloadFlowOrchestrator$performDeactivateRollback$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadSetupRequest);
                    autoReloadFlowOrchestrator$performDeactivateRollback$1.getHighSpeedVideoSizesFor = 1;
                    obj = setupAutoReloadUseCase.invoke(autoReloadSetupRequest, autoReloadFlowOrchestrator$performDeactivateRollback$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Rollback completed, Smart Route update had failed", null, null, 6, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.UpdateSmartRouteFailed("Smart Route update failed", true));
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError autoReloadError = (com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Rollback failed: could not re-enable auto-reload", null, null, null, 14, null);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError.RollbackFailed("Rollback failed: ".concat(java.lang.String.valueOf(autoReloadError.getMessage())), com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep.SETUP_AUTO_RELOAD));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        autoReloadFlowOrchestrator$performDeactivateRollback$1 = new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator$performDeactivateRollback$1(this, continuation);
        java.lang.Object obj2 = autoReloadFlowOrchestrator$performDeactivateRollback$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadFlowOrchestrator$performDeactivateRollback$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/AutoReloadFlowOrchestrator$FlowResult;", "", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "toastMessage", "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "component2", "()Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "copy", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;)Lcom/paypal/oslo/feature/smartroute/domain/usecase/AutoReloadFlowOrchestrator$FlowResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "getConfiguration", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "getToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FlowResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration configuration;
        private final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage;

        public FlowResult(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionConfiguration, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
            this.configuration = distributionConfiguration;
            this.toastMessage = toastMessage;
        }

        public final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getConfiguration() {
            return this.configuration;
        }

        public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage getToastMessage() {
            return this.toastMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration = this.configuration;
            com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage = this.toastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowResult(configuration=");
            sb.append(distributionConfiguration);
            sb.append(", toastMessage=");
            sb.append(toastMessage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.configuration.hashCode() * 31) + this.toastMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult flowResult = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, flowResult.configuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, flowResult.toastMessage);
        }

        public final com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult copy(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration configuration, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
            return new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult(configuration, toastMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage getToastMessage() {
            return this.toastMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getConfiguration() {
            return this.configuration;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult copy$default(com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult flowResult, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                distributionConfiguration = flowResult.configuration;
            }
            if ((i & 2) != 0) {
                toastMessage = flowResult.toastMessage;
            }
            return flowResult.copy(distributionConfiguration, toastMessage);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
