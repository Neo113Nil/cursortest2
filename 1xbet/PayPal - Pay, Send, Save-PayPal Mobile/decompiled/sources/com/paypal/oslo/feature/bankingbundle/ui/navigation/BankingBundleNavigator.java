package com.paypal.oslo.feature.bankingbundle.ui.navigation;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fJ\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\fJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u0015J\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/navigation/BankingBundleNavigator;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;", "flowIntent", "", "navigateToInitialScreen", "(Lcom/paypal/oslo/feature/bankingbundle/api/navigation/BankingBundleFlowIntent;)V", "navigateBack", "()V", "Lcom/paypal/oslo/feature/bankingbundle/api/navigation/result/BankingBundleFlowNavResult;", "result", "setResultAndCloseFlow", "(Lcom/paypal/oslo/feature/bankingbundle/api/navigation/result/BankingBundleFlowNavResult;)V", "completeWithSuccess", "", "reason", "completeWithFailure", "(Ljava/lang/String;)V", "navigateToAcceptMoneyChoice", "navigateToStandaloneLanding", "navigateToBenefitsComparison", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "launchOneOnboarding-DpEMydE", "launchOneOnboarding", "userFirstName", "navigateToSuccessSheet", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankingBundleNavigator {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public BankingBundleNavigator(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }

    public final void navigateToInitialScreen(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent flowIntent) {
        final java.lang.Object standaloneLandingDestination;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowIntent, "");
        if (flowIntent instanceof com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Standalone) {
            standaloneLandingDestination = new com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "false");
        } else if (flowIntent instanceof com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.AcceptMoney) {
            standaloneLandingDestination = com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination.INSTANCE;
        } else {
            if (!(flowIntent instanceof com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom custom = (com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleFlowIntent.Custom) flowIntent;
            if (custom.getSkipLanding()) {
                standaloneLandingDestination = com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination.INSTANCE;
            } else {
                standaloneLandingDestination = new com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, java.lang.String.valueOf(custom.getSkipSuccess()));
            }
        }
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.m12265$r8$lambda$GPXM_sWpuvCjcTNkeHO89Uc7pg(standaloneLandingDestination, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateBack() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.m12263$r8$lambda$C_RFexAneu9Lbl3TmqrZqdfryM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void setResultAndCloseFlow(final com.paypal.oslo.feature.bankingbundle.api.navigation.result.BankingBundleFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.m12261$r8$lambda$0c0ApCpc2pVEwyYms9gJuGdESw(com.paypal.oslo.feature.bankingbundle.api.navigation.result.BankingBundleFlowNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void completeWithSuccess() {
        setResultAndCloseFlow(com.paypal.oslo.feature.bankingbundle.api.navigation.result.BankingBundleFlowNavResult.Success.INSTANCE);
    }

    public final void completeWithFailure(java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        setResultAndCloseFlow(new com.paypal.oslo.feature.bankingbundle.api.navigation.result.BankingBundleFlowNavResult.Failure(reason));
    }

    public final void navigateToAcceptMoneyChoice() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.$r8$lambda$w0KMrPwvqGf745aeYAvUYLP2mbo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToStandaloneLanding() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.$r8$lambda$xOUcHuu6PwCCOy8F110YmEHdiGs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToBenefitsComparison() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.m12264$r8$lambda$ElNWHVKHKvbl9h0PMcgHfVo3iw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: launchOneOnboarding-DpEMydE, reason: not valid java name */
    public final void m12266launchOneOnboardingDpEMydE(java.lang.String requestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.$r8$lambda$sFjZ7H3PKRcWHO0eKricPSaBrP0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToSuccessSheet(final java.lang.String userFirstName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userFirstName, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator.m12262$r8$lambda$2AgQKiHK9d37EbScycvQawa7Ec(userFirstName, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$0c0ApCpc2pVEwyYms-9gJuGdESw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12261$r8$lambda$0c0ApCpc2pVEwyYms9gJuGdESw(com.paypal.oslo.feature.bankingbundle.api.navigation.result.BankingBundleFlowNavResult bankingBundleFlowNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(bankingBundleFlowNavResult);
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDestination.class));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2AgQ-KiHK9d37EbScycvQawa7Ec, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12262$r8$lambda$2AgQKiHK9d37EbScycvQawa7Ec(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDestination.class));
        navigationScope.push(new com.paypal.oslo.feature.bankingbundle.ui.SuccessSheetDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$C_RFexAneu-9Lbl3TmqrZqdfryM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12263$r8$lambda$C_RFexAneu9Lbl3TmqrZqdfryM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ElNWH-VKHKvbl9h0PMcgHfVo3iw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12264$r8$lambda$ElNWHVKHKvbl9h0PMcgHfVo3iw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.bankingbundle.api.navigation.BenefitsComparisonDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GPXM_s-WpuvCjcTNkeHO89Uc7pg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12265$r8$lambda$GPXM_sWpuvCjcTNkeHO89Uc7pg(java.lang.Object obj, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop((androidx.navigation3.runtime.NavKey) obj);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sFjZ7H3PKRcWHO0eKricPSaBrP0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination(new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle(null, 1, null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w0KMrPwvqGf745aeYAvUYLP2mbo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(com.paypal.oslo.feature.bankingbundle.api.navigation.AcceptMoneyChoiceDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xOUcHuu6PwCCOy8F110YmEHdiGs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "false"));
        return kotlin.Unit.INSTANCE;
    }
}
