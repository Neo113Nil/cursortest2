package com.paypal.oslo.feature.identity.passwordrecovery.controller;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJL\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u001a\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010&R\u0018\u0010#\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010+R\u0018\u0010%\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/controller/PasswordRecoveryFlowCoordinator;", "", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/usecase/InitiatePasswordRecoveryUseCase;", "initiatePasswordRecoveryUseCase", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "navResultManager", "<init>", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/usecase/InitiatePasswordRecoveryUseCase;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/navigation/result/NavResultManager;)V", "", "publicCredential", "requestId", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "", "onError", "Lkotlin/Function0;", "onPasswordCreated", "initiatePasswordRecovery", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/usecase/InitiatePasswordRecoveryUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "getHighSpeedVideoSizesFor", "Ljava/lang/String;", "getInputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getOutputStallDurationlomOqCM", "getOutputFormats", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "getInputFormats", "Lkotlinx/coroutines/Job;", "Lkotlin/jvm/functions/Function0;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasswordRecoveryFlowCoordinator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.CoroutineScope getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.String getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> getOutputStallDurationlomOqCM;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.result.NavResultManager Camera2StreamConfigurationMap;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private java.lang.String getOutputFormats;
    public static final int $stable = 8;

    @javax.inject.Inject
    public PasswordRecoveryFlowCoordinator(com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase initiatePasswordRecoveryUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiatePasswordRecoveryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
        this.getHighSpeedVideoFpsRanges = initiatePasswordRecoveryUseCase;
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = navResultManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initiatePasswordRecovery(java.lang.String str, java.lang.String str2, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$initiatePasswordRecovery$1 passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1;
        int i;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        arrow.core.Either either;
        java.lang.String str3;
        java.lang.String str4 = str2;
        if (continuation instanceof com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$initiatePasswordRecovery$1) {
            passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1 = (com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$initiatePasswordRecovery$1) continuation;
            if ((passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Initiating password recovery flow (Stepup-based)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", str4)), null, 4, null);
                    kotlinx.coroutines.Job job = this.getHighSpeedVideoSizesFor;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    this.getHighSpeedVideoSizesFor = null;
                    kotlinx.coroutines.Job job2 = this.getInputFormats;
                    if (job2 != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    this.getInputFormats = null;
                    java.lang.String str5 = this.getOutputFormats;
                    if (str5 != null) {
                        this.Camera2StreamConfigurationMap.m11580cleanupRequestDpEMydE(str5);
                    }
                    java.lang.String str6 = this.getOutputMinFrameDuration;
                    if (str6 != null) {
                        this.Camera2StreamConfigurationMap.m11580cleanupRequestDpEMydE(str6);
                    }
                    this.getOutputFormats = null;
                    this.getOutputMinFrameDuration = null;
                    this.getInputSizeshNQ4ISI = coroutineScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = str;
                    this.getHighSpeedVideoFpsRangesFor = str4;
                    this.getOutputStallDurationlomOqCM = function0;
                    com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput initiatePasswordRecoveryInput = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput(str, str4, false, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.PASSWORD_RECOVERY);
                    com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase initiatePasswordRecoveryUseCase = this.getHighSpeedVideoFpsRanges;
                    passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighSpeedVideoSizes = str4;
                    passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                    function12 = function1;
                    passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.Camera2StreamConfigurationMap = function12;
                    passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                    passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiatePasswordRecoveryInput);
                    passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighSpeedVideoSizesFor = 1;
                    obj = initiatePasswordRecoveryUseCase.invoke(initiatePasswordRecoveryInput, passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function12 = (kotlin.jvm.functions.Function1) passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.Camera2StreamConfigurationMap;
                    str4 = (java.lang.String) passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Right) {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError passwordRecoveryError = (com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError) ((arrow.core.Either.Left) either).getValue();
                    if (!(passwordRecoveryError instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError) || (str3 = ((com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError) passwordRecoveryError).getMessage()) == null) {
                        str3 = "Failed to initiate password recovery";
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Password recovery initiation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", str4), kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(passwordRecoveryError.getClass()).getSimpleName())), null, null, 12, null);
                    function12.invoke(str3);
                } else {
                    com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryOutput initiatePasswordRecoveryOutput = (com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryOutput) ((arrow.core.Either.Right) either).getValue();
                    java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> availableChallenges = initiatePasswordRecoveryOutput.getChallengeResult().getAvailableChallenges();
                    if (availableChallenges.isEmpty()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Password recovery initiated with no challenges - routing to Stepup with empty list", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", this.getHighSpeedVideoFpsRangesFor)), null, 4, null);
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Password recovery initiated successfully - feeding to Stepup", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("challengeCount", java.lang.Integer.valueOf(availableChallenges.size())), kotlin.TuplesKt.to("challengeTypes", kotlin.collections.CollectionsKt.joinToString$default(availableChallenges, null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator.$r8$lambda$B3EDsolkxNYDs6D_nfb71zWx0Os((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) obj2);
                            }
                        }, 31, null))), null, 4, null);
                    }
                    com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = initiatePasswordRecoveryOutput.getChallengeResult();
                    java.lang.String m11594generateQDVFmTU = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
                    this.getOutputFormats = m11594generateQDVFmTU;
                    final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult copy$default = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult.copy$default(challengeResult, null, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext.copy$default(challengeResult.getChallengeContext(), com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.PASSWORD_RESET, null, null, 6, null), null, null, 13, null);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Navigating to StepupDestination", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("resultRequestId", m11594generateQDVFmTU), kotlin.TuplesKt.to("challengeCount", java.lang.Integer.valueOf(copy$default.getAvailableChallenges().size()))), null, 4, null);
                    this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(m11594generateQDVFmTU, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator.$r8$lambda$E8PHkKKkm0qCqCvehzB2ccID0Zg(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator.this, copy$default, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = this.getInputSizeshNQ4ISI;
                    this.getHighSpeedVideoSizesFor = coroutineScope2 != null ? kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupStepupResultListener$1(this, m11594generateQDVFmTU, null), 3, null) : null;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1 = new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$initiatePasswordRecovery$1(this, continuation);
        java.lang.Object obj2 = passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passwordRecoveryFlowCoordinator$initiatePasswordRecovery$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Right) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object initiatePasswordRecovery$default(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, java.lang.String str, java.lang.String str2, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        return passwordRecoveryFlowCoordinator.initiatePasswordRecovery(str, str2, coroutineScope, function1, function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, final java.lang.String str, final java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$navigateToCreatePassword$1 passwordRecoveryFlowCoordinator$navigateToCreatePassword$1;
        int i;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type;
        if (continuation instanceof com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$navigateToCreatePassword$1) {
            passwordRecoveryFlowCoordinator$navigateToCreatePassword$1 = (com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$navigateToCreatePassword$1) continuation;
            if ((passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighSpeedVideoSizes = challenge;
                    passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighSpeedVideoFpsRangesFor = str2;
                    passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.YieldKt.yield(passwordRecoveryFlowCoordinator$navigateToCreatePassword$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighSpeedVideoFpsRangesFor;
                    str = (java.lang.String) passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighResolutionOutputSizeshNQ4ISI;
                    challenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String m11594generateQDVFmTU = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
                this.getOutputMinFrameDuration = m11594generateQDVFmTU;
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[4];
                pairArr[0] = kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery");
                pairArr[1] = kotlin.TuplesKt.to("requestId", this.getHighSpeedVideoFpsRangesFor);
                pairArr[2] = kotlin.TuplesKt.to("hasChallenge", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(challenge != null));
                if (challenge != null || (type = challenge.getType()) == null || (r1 = type.name()) == null) {
                    java.lang.String str3 = "none";
                }
                pairArr[3] = kotlin.TuplesKt.to("challengeType", str3);
                com.paypal.android.logger.Logger.d$default(logger, "Navigating to Create Password screen", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(m11594generateQDVFmTU, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator.$r8$lambda$jNN3VcrK0WYdqJUFFscTdch8TeA(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator.this, challenge, str, str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
                Camera2StreamConfigurationMap(m11594generateQDVFmTU);
                return kotlin.Unit.INSTANCE;
            }
        }
        passwordRecoveryFlowCoordinator$navigateToCreatePassword$1 = new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$navigateToCreatePassword$1(this, continuation);
        java.lang.Object obj2 = passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passwordRecoveryFlowCoordinator$navigateToCreatePassword$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        java.lang.String m11594generateQDVFmTU2 = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.getOutputMinFrameDuration = m11594generateQDVFmTU2;
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.identity.LoggerKt.log;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[4];
        pairArr2[0] = kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery");
        pairArr2[1] = kotlin.TuplesKt.to("requestId", this.getHighSpeedVideoFpsRangesFor);
        pairArr2[2] = kotlin.TuplesKt.to("hasChallenge", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(challenge != null));
        if (challenge != null) {
        }
        java.lang.String str32 = "none";
        pairArr2[3] = kotlin.TuplesKt.to("challengeType", str32);
        com.paypal.android.logger.Logger.d$default(logger2, "Navigating to Create Password screen", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
        this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(m11594generateQDVFmTU2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator.$r8$lambda$jNN3VcrK0WYdqJUFFscTdch8TeA(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator.this, challenge, str, str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj22);
            }
        });
        Camera2StreamConfigurationMap(m11594generateQDVFmTU2);
        return kotlin.Unit.INSTANCE;
    }

    private final void Camera2StreamConfigurationMap(java.lang.String p0) {
        kotlinx.coroutines.CoroutineScope coroutineScope = this.getInputSizeshNQ4ISI;
        this.getInputFormats = coroutineScope != null ? kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$setupCreatePasswordResultListener$1(this, p0, null), 3, null) : null;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$B3EDsolkxNYDs6D_nfb71zWx0Os(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        return challenge.getType().name();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E8PHkKKkm0qCqCvehzB2ccID0Zg(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        java.lang.String str = passwordRecoveryFlowCoordinator.getHighSpeedVideoFpsRangesFor;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        navigationScope.push(new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(str, challengeResult, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) null, (com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jNN3VcrK0WYdqJUFFscTdch8TeA(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        java.lang.String str3 = passwordRecoveryFlowCoordinator.getHighResolutionOutputSizeshNQ4ISI;
        if (str3 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        java.lang.String str4 = passwordRecoveryFlowCoordinator.getHighSpeedVideoFpsRangesFor;
        if (str4 == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        navigationScope.push(new com.paypal.oslo.feature.identity.passwordrecovery.navigation.CreatePasswordDestination(str3, challenge, str4, str, str2));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$handleCreatePasswordNavResult(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult.Outcome outcome) {
        if (outcome instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult.Outcome.Success) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Create password completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", passwordRecoveryFlowCoordinator.getHighSpeedVideoFpsRangesFor)), null, 4, null);
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = passwordRecoveryFlowCoordinator.getOutputStallDurationlomOqCM;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (outcome instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryCreatePasswordNavResult.Outcome.UserCanceled) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Create password cancelled by user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", passwordRecoveryFlowCoordinator.getHighSpeedVideoFpsRangesFor)), null, 4, null);
        } else {
            if (outcome != null) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Create password returned unexpected result type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", passwordRecoveryFlowCoordinator.getHighSpeedVideoFpsRangesFor)), null, 4, null);
        }
    }

    public static final /* synthetic */ java.lang.Object access$handleStepupNavResult(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult passwordRecoveryStepUpNavResult, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome outcome = passwordRecoveryStepUpNavResult != null ? passwordRecoveryStepUpNavResult.getOutcome() : null;
        if (outcome instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery");
            pairArr[1] = kotlin.TuplesKt.to("requestId", passwordRecoveryFlowCoordinator.getHighSpeedVideoFpsRangesFor);
            com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success success = (com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success) outcome;
            pairArr[2] = kotlin.TuplesKt.to("hasChallenge", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(success.getCreatePasswordChallenge() != null));
            com.paypal.android.logger.Logger.d$default(logger, "Stepup flow completed successfully", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            java.lang.Object highResolutionOutputSizeshNQ4ISI = passwordRecoveryFlowCoordinator.getHighResolutionOutputSizeshNQ4ISI(success.getCreatePasswordChallenge(), success.getNonce(), success.getPartialToken(), continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
        }
        if (outcome instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Stepup flow cancelled by user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", passwordRecoveryFlowCoordinator.getHighSpeedVideoFpsRangesFor)), null, 4, null);
        } else if (outcome instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Stepup flow failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", passwordRecoveryFlowCoordinator.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("errorMessage", ((com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error) outcome).getErrorMessage())), null, 4, null);
        } else {
            if (outcome != null) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Stepup flow returned unexpected result type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "PasswordRecovery"), kotlin.TuplesKt.to("requestId", passwordRecoveryFlowCoordinator.getHighSpeedVideoFpsRangesFor)), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
