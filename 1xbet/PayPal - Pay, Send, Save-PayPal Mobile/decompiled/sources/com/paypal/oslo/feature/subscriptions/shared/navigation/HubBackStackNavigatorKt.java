package com.paypal.oslo.feature.subscriptions.shared.navigation;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator$NavigationScope;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;", "result", "", "popToHubDestination", "(Lcom/paypal/oslo/core/navigation/AppNavigator$NavigationScope;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;)V", "Landroidx/navigation3/runtime/NavKey;", "toHubDestination", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Landroidx/navigation3/runtime/NavKey;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HubBackStackNavigatorKt {
    public static /* synthetic */ void popToHubDestination$default(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult agreementUpdatedNavResult, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            agreementUpdatedNavResult = new com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult(true, false, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        popToHubDestination(navigationScope, appNavigator, agreementType, agreementUpdatedNavResult);
    }

    public static final void popToHubDestination(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult agreementUpdatedNavResult) {
        java.lang.String str;
        androidx.navigation3.runtime.NavKey navKey;
        androidx.navigation3.runtime.NavKey navKey2;
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementUpdatedNavResult, "");
        java.util.List<androidx.navigation3.runtime.NavKey> backStack = appNavigator.getBackStack();
        java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator = backStack.listIterator(backStack.size());
        while (true) {
            str = null;
            if (!listIterator.hasPrevious()) {
                navKey = null;
                break;
            }
            navKey = listIterator.previous();
            androidx.navigation3.runtime.NavKey navKey3 = navKey;
            if ((navKey3 instanceof com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination) || (navKey3 instanceof com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination)) {
                break;
            }
        }
        androidx.navigation3.runtime.NavKey navKey4 = navKey;
        java.util.List<androidx.navigation3.runtime.NavKey> backStack2 = appNavigator.getBackStack();
        java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator2 = backStack2.listIterator(backStack2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                navKey2 = null;
                break;
            } else {
                navKey2 = listIterator2.previous();
                if (navKey2 instanceof com.paypal.oslo.feature.home.api.navigation.HomeDestination) {
                    break;
                }
            }
        }
        androidx.navigation3.runtime.NavKey navKey5 = navKey2;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        java.lang.String simpleName = (navKey4 == null || (cls2 = navKey4.getClass()) == null) ? null : cls2.getSimpleName();
        if (simpleName == null) {
            simpleName = "";
        }
        pairArr[0] = kotlin.TuplesKt.to("hubDestination", simpleName);
        if (navKey5 != null && (cls = navKey5.getClass()) != null) {
            str = cls.getSimpleName();
        }
        pairArr[1] = kotlin.TuplesKt.to("homeDestination", str != null ? str : "");
        pairArr[2] = kotlin.TuplesKt.to("agreementType", agreementType.getClass().getSimpleName());
        java.util.List<androidx.navigation3.runtime.NavKey> backStack3 = appNavigator.getBackStack();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(backStack3, 10));
        java.util.Iterator<T> it = backStack3.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.navigation3.runtime.NavKey) it.next()).getClass().getSimpleName());
        }
        pairArr[3] = kotlin.TuplesKt.to("backStack", arrayList.toString());
        com.paypal.android.logger.Logger.i$default(logger, "popToHubDestination", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        navigationScope.setResult(agreementUpdatedNavResult);
        if (navKey4 != null) {
            navigationScope.popTo(navKey4);
        } else if (navKey5 != null) {
            navigationScope.popTo(navKey5);
            navigationScope.push(toHubDestination(agreementType));
        } else {
            com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System(null, "No Hub or Home found in back stack when trying to pop to hub after agreement update", null, 5, null), "Failed to pop to hub after agreement update", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi(agreementType), null, null, null, 28, null);
            navigationScope.goBack();
        }
    }

    public static final androidx.navigation3.runtime.NavKey toHubDestination(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (agreementType instanceof com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business) {
            return new com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
