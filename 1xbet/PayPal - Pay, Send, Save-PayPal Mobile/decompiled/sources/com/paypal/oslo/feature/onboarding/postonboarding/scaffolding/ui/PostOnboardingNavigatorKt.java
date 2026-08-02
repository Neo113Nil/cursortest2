package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator$NavigationScope;", "", "Landroidx/navigation3/runtime/NavKey;", "backStack", "destination", "", "popPostOnboardingDestinations", "(Lcom/paypal/oslo/core/navigation/AppNavigator$NavigationScope;Ljava/util/List;Landroidx/navigation3/runtime/NavKey;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostOnboardingNavigatorKt {
    public static /* synthetic */ void popPostOnboardingDestinations$default(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope, java.util.List list, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            navKey = null;
        }
        popPostOnboardingDestinations(navigationScope, list, navKey);
    }

    public static final void popPostOnboardingDestinations(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope, java.util.List<? extends androidx.navigation3.runtime.NavKey> list, androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list) instanceof com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDestination) {
            androidx.navigation3.runtime.NavKey[] navKeyArr = new androidx.navigation3.runtime.NavKey[1];
            if (navKey == null) {
                navKey = com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE;
            }
            navKeyArr[0] = navKey;
            navigationScope.replaceStack(navKeyArr);
            return;
        }
        if (kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list) instanceof com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDestination) {
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDestination.class));
        }
        if (navKey != null) {
            navigationScope.pushIfNotCurrent(navKey);
        }
    }
}
