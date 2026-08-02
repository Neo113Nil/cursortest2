package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "", "registerDefaultNetworkCallbackCompat", "(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkApi24 {
    public static final void registerDefaultNetworkCallbackCompat(android.net.ConnectivityManager connectivityManager, android.net.ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCallback, "");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
