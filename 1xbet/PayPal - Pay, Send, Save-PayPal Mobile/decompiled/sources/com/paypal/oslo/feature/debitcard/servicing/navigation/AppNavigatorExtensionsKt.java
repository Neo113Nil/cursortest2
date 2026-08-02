package com.paypal.oslo.feature.debitcard.servicing.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator;", "Landroidx/navigation3/runtime/NavKey;", "destinationToRemove", "targetDestination", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "result", "", "popUntilInclusiveAndNavigateTo", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/navigation/result/NavResult;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AppNavigatorExtensionsKt {
    public static /* synthetic */ void popUntilInclusiveAndNavigateTo$default(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2, com.paypal.oslo.core.navigation.result.NavResult navResult, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            navResult = null;
        }
        popUntilInclusiveAndNavigateTo(appNavigator, navKey, navKey2, navResult);
    }

    public static final void popUntilInclusiveAndNavigateTo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.NavKey navKey, final androidx.navigation3.runtime.NavKey navKey2, final com.paypal.oslo.core.navigation.result.NavResult navResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey2, "");
        final int lastIndexOf = appNavigator.getBackStack().lastIndexOf(navKey);
        if (lastIndexOf == -1) {
            throw new java.lang.IllegalArgumentException("destination was not found in the backstack".toString());
        }
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.navigation.AppNavigatorExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.servicing.navigation.AppNavigatorExtensionsKt.m14323$r8$lambda$106oonjOoWyPJyoVTUFcQjnRTM(com.paypal.oslo.core.navigation.result.NavResult.this, lastIndexOf, appNavigator, navKey2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$106oonjOo-WyPJyoVTUFcQjnRTM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14323$r8$lambda$106oonjOoWyPJyoVTUFcQjnRTM(com.paypal.oslo.core.navigation.result.NavResult navResult, int i, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (navResult != null) {
            navigationScope.setResult(navResult);
        }
        if (i == 0) {
            navigationScope.popTo((androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.first((java.util.List) appNavigator.getBackStack()));
        } else {
            navigationScope.popTo(appNavigator.getBackStack().get(i - 1));
        }
        navigationScope.pushIfNotCurrent(navKey);
        return kotlin.Unit.INSTANCE;
    }
}
