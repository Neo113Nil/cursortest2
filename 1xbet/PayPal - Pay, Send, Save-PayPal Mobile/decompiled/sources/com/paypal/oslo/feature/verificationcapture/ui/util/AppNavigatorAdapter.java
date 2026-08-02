package com.paypal.oslo.feature.verificationcapture.ui.util;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0011\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/util/AppNavigatorAdapter;", "Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Landroidx/navigation3/runtime/NavKey;", "T", "destination", "", "navigate", "(Landroidx/navigation3/runtime/NavKey;)V", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "navigateForResult-qCNXlvQ", "(Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;)V", "navigateForResult", "popBackStack", "()V", "Lcom/paypal/oslo/core/navigation/result/NavResult;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "key", "result", "(Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/navigation/result/NavResult;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AppNavigatorAdapter implements com.paypal.oslo.feature.verificationcapture.ui.util.Navigator {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    public AppNavigatorAdapter(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.util.Navigator
    public final <T extends androidx.navigation3.runtime.NavKey> void navigate(final T destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter.$r8$lambda$JJAc3DsHHy7UvxvTEcdI1SLfbN0(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.util.Navigator
    /* renamed from: navigateForResult-qCNXlvQ */
    public final void mo20615navigateForResultqCNXlvQ(java.lang.String requestId, final androidx.navigation3.runtime.NavKey destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter.m20690$r8$lambda$UliVrFEz89_K37ItF8AiEs5GNQ(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.util.Navigator
    public final void popBackStack() {
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter.$r8$lambda$bslUYrMpb9YwOy6lNuCSAvEH3OA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.verificationcapture.ui.util.Navigator
    public final <T extends androidx.navigation3.runtime.NavKey, R extends com.paypal.oslo.core.navigation.result.NavResult> void popBackStack(T key, final R result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter.$r8$lambda$srcqmqkKshAbPwq6K3VqgZH6HcE(com.paypal.oslo.core.navigation.result.NavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JJAc3DsHHy7UvxvTEcdI1SLfbN0(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UliVrFEz89_K3-7ItF8AiEs5GNQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20690$r8$lambda$UliVrFEz89_K37ItF8AiEs5GNQ(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bslUYrMpb9YwOy6lNuCSAvEH3OA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$srcqmqkKshAbPwq6K3VqgZH6HcE(com.paypal.oslo.core.navigation.result.NavResult navResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(navResult);
        return kotlin.Unit.INSTANCE;
    }
}
