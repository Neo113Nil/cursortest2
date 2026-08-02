package com.paypal.oslo.feature.inappcheckout.navigation.coordinator;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\nJ\u001d\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\fJ\u0017\u0010&\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020%¢\u0006\u0004\b&\u0010'J7\u0010/\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010,¢\u0006\u0004\b/\u00100J?\u00103\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010,¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\fJ5\u0010:\u001a\u00020\b*\u0002052\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020,2\b\u00109\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b=\u0010>J#\u0010B\u001a\u00020\b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010A\u001a\u00020?¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\b¢\u0006\u0004\bD\u0010\fJ\u001d\u0010I\u001a\u00020\b2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u001d\u0010O\u001a\u00020\b2\u0006\u0010L\u001a\u00020K2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010P"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "authenticationXOResponse", "", "navigateToOneShot", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "navigateToMockSelection", "()V", "navigateToRyp", "navigateToInstantVault", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "navigateToAddCard-DpEMydE", "(Ljava/lang/String;)V", "navigateToAddCard", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;", "updateCardParams", "navigateToUpdateCard-qCNXlvQ", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;)V", "navigateToUpdateCard", "response", "navigateToEConsent", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "entity", "navigateToEConsentForResult-qCNXlvQ", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)V", "navigateToEConsentForResult", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;", "nativeInAppWebViewData", "navigateToNativeInAppWebView", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/NativeInAppWebViewData;)V", "navigateToWebFlow", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "navigateToSuccess", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "errorScreenType", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "", "errorAction", "returnUrl", "navigateToError", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Ljava/lang/String;Ljava/lang/String;)V", "navigateToErrorForResult-uMTlDqM", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Ljava/lang/String;Ljava/lang/String;)V", "navigateToErrorForResult", "navigateBackWithResult", "Lcom/paypal/oslo/core/navigation/AppNavigator$NavigationScope;", "p0", "p1", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/navigation/AppNavigator$NavigationScope;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Ljava/lang/String;Ljava/lang/String;)V", "buyerInfoEntity", "navigateToProfile", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;)V", "", "cardSavedSuccessfully", "billingAddressAdded", "navigateBack", "(Ljava/lang/Boolean;Z)V", "navigateToPayPalHomeScreen", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "navigateToFallbackFlow", "(Landroid/content/Context;Landroid/net/Uri;)V", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "checkoutAuthenticationContext", "navigateToCheckoutAuthentication-hN0UB1M", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Ljava/lang/String;)V", "navigateToCheckoutAuthentication", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutCoordinator {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public InAppCheckoutCoordinator(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }

    public final void navigateToOneShot(final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$N5PiQpiPd67DqAQkMvZ1TBr71yM(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToMockSelection() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$4jH6HRoCexLiJ75q2OHiFqqJTQs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToRyp(final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$_Oo8XV3O18wnBtKCUO0tttG0fiQ(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToInstantVault(final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationXOResponse, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.m15463$r8$lambda$YRPVPvpn9iwuKeCBCPmLpVoAMs(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: navigateToAddCard-DpEMydE, reason: not valid java name */
    public final void m15466navigateToAddCardDpEMydE(java.lang.String requestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$hEVk7hSZhPmh8bJpO6KK4DnGzqA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: navigateToUpdateCard-qCNXlvQ, reason: not valid java name */
    public final void m15470navigateToUpdateCardqCNXlvQ(java.lang.String requestId, final com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardParams, "");
        this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$ShTlJ1EaBV1zvzL6kvxpFHKV7nQ(com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToEConsent(final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$3aF2O9L_vfRMYQcA67UjguL5rps(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: navigateToEConsentForResult-qCNXlvQ, reason: not valid java name */
    public final void m15468navigateToEConsentForResultqCNXlvQ(java.lang.String requestId, final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
        this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.result.InAppCheckoutNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.m15461$r8$lambda$Mcjlqj5Q1QLrEyL1O0dDMOkHA(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToNativeInAppWebView(final com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeInAppWebViewData, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.m15464$r8$lambda$ao66npeGhj4KzyjY8jr8OA6Zi8(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToWebFlow() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$Chgt8YZxOyCm3y0jiqbWL17LmN4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ void navigateToSuccess$default(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            thanksScreenData = new com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        inAppCheckoutCoordinator.navigateToSuccess(thanksScreenData);
    }

    public final void navigateToSuccess(final com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$Oz9QiyMY3AzQH_5sDmX2jpTZJnA(com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ void navigateToError$default(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            errorScreenType = com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        inAppCheckoutCoordinator.navigateToError(errorScreenType, checkoutLogger, str, str2);
    }

    public final void navigateToError(final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger logger, final java.lang.String errorAction, final java.lang.String returnUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.m15459$r8$lambda$3XzHTvezMCA5wrzv_VKWBMqe58(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, errorScreenType, logger, errorAction, returnUrl, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: navigateToErrorForResult-uMTlDqM$default, reason: not valid java name */
    public static /* synthetic */ void m15465navigateToErrorForResultuMTlDqM$default(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, java.lang.String str, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            errorScreenType = com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE;
        }
        inAppCheckoutCoordinator.m15469navigateToErrorForResultuMTlDqM(str, errorScreenType, checkoutLogger, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    /* renamed from: navigateToErrorForResult-uMTlDqM, reason: not valid java name */
    public final void m15469navigateToErrorForResultuMTlDqM(java.lang.String requestId, final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger logger, final java.lang.String errorAction, final java.lang.String returnUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.result.InAppCheckoutNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.m15460$r8$lambda$FleuSwthExQARzrSv5JaFN0gvE(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, errorScreenType, logger, errorAction, returnUrl, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateBackWithResult() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$gNJE_59BbSg2BQEOyGEYh3dVq2E((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, java.lang.String str, java.lang.String str2) {
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext provideBusinessFlowContext = checkoutLogger.provideBusinessFlowContext();
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext provideMerchantContext = checkoutLogger.provideMerchantContext();
        if (com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.WhenMappings.$EnumSwitchMapping$0[errorScreenType.ordinal()] == 1) {
            java.lang.String id = provideMerchantContext.getId();
            java.lang.String name2 = provideMerchantContext.getName();
            java.lang.String name3 = provideBusinessFlowContext.getName();
            java.lang.String attemptId = provideBusinessFlowContext.getAttemptId();
            navigationScope.replaceTop(new com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination(errorScreenType, id, name2, name3, attemptId == null ? "UNKNOWN" : attemptId, str, str2));
            return;
        }
        java.lang.String id2 = provideMerchantContext.getId();
        java.lang.String name4 = provideMerchantContext.getName();
        java.lang.String name5 = provideBusinessFlowContext.getName();
        java.lang.String attemptId2 = provideBusinessFlowContext.getAttemptId();
        if (attemptId2 == null) {
            attemptId2 = "UNKNOWN";
        }
        navigationScope.push(new com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination(errorScreenType, id2, name4, name5, attemptId2, str, str2));
    }

    public final void navigateToProfile(final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity) {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.m15462$r8$lambda$QyNGjdhxUMNKzFSA7TLabe4uHs(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ void navigateBack$default(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, java.lang.Boolean bool, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        inAppCheckoutCoordinator.navigateBack(bool, z);
    }

    public final void navigateBack(final java.lang.Boolean cardSavedSuccessfully, final boolean billingAddressAdded) {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$fkwiV92yFc51UKg6uGxd7s9WdfU(cardSavedSuccessfully, billingAddressAdded, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToPayPalHomeScreen() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$3jnAUQvlBv40To_lL2iSg1lOCoo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void navigateToFallbackFlow(android.content.Context context, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        context.startActivity(com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackIntentFactory.INSTANCE.buildIntent(context, uri, true));
        navigateToPayPalHomeScreen();
    }

    /* renamed from: navigateToCheckoutAuthentication-hN0UB1M, reason: not valid java name */
    public final void m15467navigateToCheckoutAuthenticationhN0UB1M(final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, java.lang.String requestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(requestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.$r8$lambda$pXBQg9UKgwZv3MvKHM5eI4jcHRA(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$3XzHTvezMCA5w-rzv_VKWBMqe58, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15459$r8$lambda$3XzHTvezMCA5wrzv_VKWBMqe58(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (str == null) {
            str = com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.ERROR_SCREEN_UNKNOWN;
        }
        getHighResolutionOutputSizeshNQ4ISI(navigationScope, errorScreenType, checkoutLogger, str, str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3aF2O9L_vfRMYQcA67UjguL5rps(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.inappcheckout.navigation.route.EConsentDestination(new com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ContinueToRyp(authenticationXOResponse)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3jnAUQvlBv40To_lL2iSg1lOCoo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceStack(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4jH6HRoCexLiJ75q2OHiFqqJTQs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.inappcheckout.api.navigation.MockSelectionDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Chgt8YZxOyCm3y0jiqbWL17LmN4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.inappcheckout.navigation.route.WebFlowDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FleuSwthEx-QARzrSv5JaFN0gvE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15460$r8$lambda$FleuSwthExQARzrSv5JaFN0gvE(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (str == null) {
            str = com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.ERROR_SCREEN_UNKNOWN;
        }
        getHighResolutionOutputSizeshNQ4ISI(navigationScope, errorScreenType, checkoutLogger, str, str2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Mcj-lqj5Q1QLrEyL1O0dDMOkH-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15461$r8$lambda$Mcjlqj5Q1QLrEyL1O0dDMOkHA(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.inappcheckout.navigation.route.EConsentDestination(new com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ReturnWithResult(buyerInfoEntity)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N5PiQpiPd67DqAQkMvZ1TBr71yM(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.inappcheckout.navigation.route.OneShotDestination(authenticationXOResponse));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Oz9QiyMY3AzQH_5sDmX2jpTZJnA(com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.inappcheckout.navigation.route.ThanksDestination(thanksScreenData));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QyNGjdhxUMNKzFSA7T-Labe4uHs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15462$r8$lambda$QyNGjdhxUMNKzFSA7TLabe4uHs(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.inappcheckout.navigation.route.ProfileDestination(buyerInfoEntity));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ShTlJ1EaBV1zvzL6kvxpFHKV7nQ(com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.inappcheckout.navigation.route.UpdateCardDestination(updateCardParams));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YRPVPvpn9iwuKeCBCPmLpVoAM-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15463$r8$lambda$YRPVPvpn9iwuKeCBCPmLpVoAMs(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.inappcheckout.navigation.route.InstantVaultDestination(authenticationXOResponse));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_Oo8XV3O18wnBtKCUO0tttG0fiQ(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.inappcheckout.navigation.route.RypDestination(authenticationXOResponse));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ao66npeGhj4KzyjY8jr8OA6Z-i8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15464$r8$lambda$ao66npeGhj4KzyjY8jr8OA6Zi8(com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.inappcheckout.navigation.route.NativeInAppWebViewDestination(nativeInAppWebViewData));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fkwiV92yFc51UKg6uGxd7s9WdfU(java.lang.Boolean bool, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (bool != null) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.inappcheckout.ui.card.navigation.result.CardSavedNavResult(bool.booleanValue(), z));
        } else {
            navigationScope.goBack();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gNJE_59BbSg2BQEOyGEYh3dVq2E(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(com.paypal.oslo.feature.inappcheckout.navigation.result.InAppCheckoutNavResult.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hEVk7hSZhPmh8bJpO6KK4DnGzqA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.inappcheckout.navigation.route.AddCardDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pXBQg9UKgwZv3MvKHM5eI4jcHRA(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.identity.api.navigation.CheckoutAuthenticationDestination(checkoutAuthenticationContext));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
