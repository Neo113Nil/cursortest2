package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/NavigationBadgeProvider;", "", "", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/StateFlow;", "", "getBadgeCount", "()Lkotlinx/coroutines/flow/StateFlow;", "badgeCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NavigationBadgeProvider {
    kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getBadgeCount();

    java.lang.Object refresh(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
