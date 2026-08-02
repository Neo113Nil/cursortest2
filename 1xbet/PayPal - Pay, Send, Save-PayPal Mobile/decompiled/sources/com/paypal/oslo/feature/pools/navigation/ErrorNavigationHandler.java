package com.paypal.oslo.feature.pools.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pools/navigation/ErrorNavigationHandler;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "handleDismiss", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "handlePrimaryAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorNavigationHandler {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ErrorNavigationHandler() {
    }

    public final void handleDismiss(com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler.$r8$lambda$BpQjNjfHHGYy5MWNBzEb_7mwqQY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void handlePrimaryAction(com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pools.navigation.ErrorNavigationHandler.$r8$lambda$y_qrvIr_5uluI_c5n9XbGuioDhU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BpQjNjfHHGYy5MWNBzEb_7mwqQY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.pools.shared.ui.error.navigation.result.ErrorActionNavResult(com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.DISMISS));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y_qrvIr_5uluI_c5n9XbGuioDhU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.pools.shared.ui.error.navigation.result.ErrorActionNavResult(com.paypal.oslo.feature.pools.shared.ui.error.ErrorAction.RETRY));
        return kotlin.Unit.INSTANCE;
    }
}
