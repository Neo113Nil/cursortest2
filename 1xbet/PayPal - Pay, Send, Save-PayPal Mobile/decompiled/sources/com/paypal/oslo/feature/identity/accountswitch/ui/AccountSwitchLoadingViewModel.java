package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\u0006\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/AccountSwitchLoadingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/SwitchAccountUseCase;", "switchAccountUseCase", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UpdateTokenUseCase;", "updateTokenUseCase", "Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/ProcessStepupUseCase;", "processStepupUseCase", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "<init>", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/SwitchAccountUseCase;Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UpdateTokenUseCase;Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/ProcessStepupUseCase;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "", "targetId", "", "targetType", "targetName", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "stepUpRequestId", "", "switchAccount-1z4cvM0", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "switchAccount", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "p0", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;", "p1", "", "p2", "p3", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;Ljava/util/List;Ljava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "onStepUpAuthenticationSuccess", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/SwitchAccountUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UpdateTokenUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/stepup/domain/usecase/ProcessStepupUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/navigation/AppNavigator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountSwitchLoadingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AccountSwitchLoadingViewModel(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase switchAccountUseCase, com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase updateTokenUseCase, com.paypal.oslo.feature.identity.stepup.domain.usecase.ProcessStepupUseCase processStepupUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(switchAccountUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTokenUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processStepupUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighSpeedVideoSizes = switchAccountUseCase;
        this.getHighSpeedVideoFpsRangesFor = updateTokenUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = processStepupUseCase;
        this.Camera2StreamConfigurationMap = appNavigator;
    }

    /* renamed from: switchAccount-1z4cvM0, reason: not valid java name */
    public final void m15000switchAccount1z4cvM0(java.lang.String targetId, int targetType, java.lang.String targetName, java.lang.String stepUpRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpRequestId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$switchAccount$1(this, targetId, targetType, targetName, stepUpRequestId, null), 3, null);
    }

    private final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge p0, final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext p1, final java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> p2, final java.lang.String p3) {
        switch (com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.WhenMappings.$EnumSwitchMapping$0[p0.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (p0.getType() != com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP) {
                    p2 = kotlin.collections.CollectionsKt.emptyList();
                }
                this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(p3, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.m14998$r8$lambda$sqmyIs5Qb2SVX4ejnDFcu7umm4(p3, p0, p1, p2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                break;
            case 6:
                this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(p3, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.$r8$lambda$o91pNQtayIWeHGb7Xws_YreEeiQ(p3, p0, p1, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                break;
            default:
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Unsupported challenge type for account switch step-up", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("challengeType", p0.getType().name())), null, null, 12, null);
                break;
        }
    }

    public final void onStepUpAuthenticationSuccess(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Step-up authentication succeeded, completing account switch", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$onStepUpAuthenticationSuccess$1(this, token, null), 3, null);
    }

    /* renamed from: $r8$lambda$CUl2HbV3NDlz6br-IMDj_V5r_io, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14997$r8$lambda$CUl2HbV3NDlz6brIMDj_V5r_io(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(str, challengeResult, (com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType) null, (com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_euny8tM9xwkIrCNLmXL8qQxdS4(java.lang.String str, int i, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination(str, i, str2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o91pNQtayIWeHGb7Xws_YreEeiQ(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.navigation.StepupSecurityQuestionDestination(str, challenge, challengeContext, (java.util.List) null, false, false, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qRV38XDAGqbB8ZbkVPoDIrOZhOs(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceStack(navKey);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sqmyIs5Qb2SVX4ejnDFcu7umm-4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14998$r8$lambda$sqmyIs5Qb2SVX4ejnDFcu7umm4(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, java.util.List list, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.identity.challenges.stepupotp.navigation.StepupOtpVerificationDestination(str, challenge, challengeContext, list, true, false));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: access$handleSwitchAccountResult-aILpJJk, reason: not valid java name */
    public static final /* synthetic */ void m14999access$handleSwitchAccountResultaILpJJk(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel, com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult switchAccountResult, final java.lang.String str, final int i, final java.lang.String str2, final java.lang.String str3) {
        if (switchAccountResult instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult.Success) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Account switched successfully without step-up", null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(accountSwitchLoadingViewModel), null, null, new com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$handleSwitchAccountResult$1(accountSwitchLoadingViewModel, switchAccountResult, null), 3, null);
            return;
        }
        if (!(switchAccountResult instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult.StepUpRequired)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Step-up authentication required for account switch", null, null, 6, null);
        com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult.StepUpRequired stepUpRequired = (com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult.StepUpRequired) switchAccountResult;
        com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult invoke = accountSwitchLoadingViewModel.getHighResolutionOutputSizeshNQ4ISI.invoke(stepUpRequired.getChallengeResult());
        if (invoke instanceof com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "No eligible step-up challenges available", null, null, null, 14, null);
            accountSwitchLoadingViewModel.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.$r8$lambda$_euny8tM9xwkIrCNLmXL8qQxdS4(str, i, str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        if (invoke instanceof com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge) {
            accountSwitchLoadingViewModel.Camera2StreamConfigurationMap(((com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge) invoke).getChallengeData().getSelectedChallenge(), stepUpRequired.getChallengeResult().getChallengeContext(), stepUpRequired.getChallengeResult().getAvailableChallenges(), str3);
            return;
        }
        if (invoke instanceof com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Auto-resolving with silent authentication", null, null, 6, null);
            accountSwitchLoadingViewModel.Camera2StreamConfigurationMap(((com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth) invoke).getChallengeData().getSelectedChallenge(), stepUpRequired.getChallengeResult().getChallengeContext(), stepUpRequired.getChallengeResult().getAvailableChallenges(), str3);
            return;
        }
        if (!(invoke instanceof com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices multipleChoices = (com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices) invoke;
        if (multipleChoices.getChallengeDataList().isEmpty()) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "ProcessStepupUseCase returned MultipleChoices with empty list", null, null, null, 14, null);
            accountSwitchLoadingViewModel.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.$r8$lambda$_euny8tM9xwkIrCNLmXL8qQxdS4(str, i, str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Multiple challenges available, navigating to Stepup selection screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("challengeCount", java.lang.Integer.valueOf(multipleChoices.getChallengeDataList().size()))), null, 4, null);
        final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = stepUpRequired.getChallengeResult();
        accountSwitchLoadingViewModel.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(str3, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.m14997$r8$lambda$CUl2HbV3NDlz6brIMDj_V5r_io(str3, challengeResult, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static final /* synthetic */ void access$logSwitchAccountError(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel, com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError dataResultError, java.lang.String str) {
        if (dataResultError instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.NoInternet) {
            com.paypal.oslo.feature.identity.LoggerKt.log.w("Switch account failed due to network connectivity", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "NoInternet")), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("targetId", str)));
            return;
        }
        if (dataResultError instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.HttpError) {
            com.paypal.oslo.feature.identity.LoggerKt.log.w("Switch account failed with HTTP error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "HttpError")), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("targetId", str)));
            return;
        }
        if (dataResultError instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.GraphQLError) {
            com.paypal.oslo.feature.identity.LoggerKt.log.w("Switch account failed with GraphQL error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "GraphQLError")), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("targetId", str)));
            return;
        }
        if (dataResultError instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.AccountDataError) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Switch account failed due to account data error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "AccountDataError")), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("targetId", str)), null, 8, null);
            return;
        }
        if (!(dataResultError instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("errorType", "Unknown");
        com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.Unknown unknown = (com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError.Unknown) dataResultError;
        pairArr[1] = kotlin.TuplesKt.to("errorMessage", unknown.getMessage());
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(unknown.getCause().getClass()).getSimpleName();
        pairArr[2] = kotlin.TuplesKt.to("causeType", simpleName != null ? simpleName : "Unknown");
        com.paypal.android.logger.Logger.e$default(logger, "Switch account failed with unexpected error", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("targetId", str)), null, 8, null);
    }

    public static final /* synthetic */ void access$navigateToHome(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel, boolean z) {
        final androidx.navigation3.runtime.NavKey navKey = z ? com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination.INSTANCE : com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(navKey.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "Unknown";
        }
        com.paypal.android.logger.Logger.i$default(logger, "Account switch completed, navigating to home destination", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("destination", simpleName)), null, 4, null);
        accountSwitchLoadingViewModel.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.$r8$lambda$qRV38XDAGqbB8ZbkVPoDIrOZhOs(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SMS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.WHATSAPP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.IVR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.AUTHENTICATOR_APP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.SECURITY_QUESTION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
