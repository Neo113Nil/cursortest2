package com.paypal.oslo.feature.subscriptions.shared.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/navigation/SuccessModalNavigationHandler;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType;", "type", "", "invoke", "(Lcom/paypal/oslo/feature/subscriptions/shared/success/SuccessModalType;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SuccessModalNavigationHandler {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;

    public SuccessModalNavigationHandler(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.Camera2StreamConfigurationMap = appNavigator;
    }

    public final void invoke(final com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler.$r8$lambda$POAF2oGeDDQtdFVjnRv9cRW4PN0(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.this, this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$POAF2oGeDDQtdFVjnRv9cRW4PN0(com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType successModalType, com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler successModalNavigationHandler, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (!(successModalType instanceof com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementUnlink) && !(successModalType instanceof com.paypal.oslo.feature.subscriptions.shared.success.SuccessModalType.AgreementCancel)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.subscriptions.shared.navigation.HubBackStackNavigatorKt.popToHubDestination$default(navigationScope, successModalNavigationHandler.Camera2StreamConfigurationMap, successModalType.getAgreementType(), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }
}
