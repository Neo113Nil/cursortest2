package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroid/content/Context;", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "isPermissionGranted", "(Landroid/content/Context;Ljava/lang/String;)Z", "context", "Lcom/apollographql/apollo/network/NetworkObserver;", "networkObserver", "(Landroid/content/Context;)Lcom/apollographql/apollo/network/NetworkObserver;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkObserver_androidKt {
    public static final boolean isPermissionGranted(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return androidx.core.content.ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static final com.apollographql.apollo.network.NetworkObserver networkObserver(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("connectivity");
        if (!(systemService instanceof android.net.ConnectivityManager)) {
            return com.apollographql.apollo.network.NetworkObserverKt.getNoOpNetworkObserver();
        }
        if (!isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return com.apollographql.apollo.network.NetworkObserverKt.getNoOpNetworkObserver();
        }
        return new com.apollographql.apollo.network.AndroidNetworkObserver((android.net.ConnectivityManager) systemService);
    }
}
