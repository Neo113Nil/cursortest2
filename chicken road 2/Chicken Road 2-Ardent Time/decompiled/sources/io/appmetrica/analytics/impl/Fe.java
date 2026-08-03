package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Fe implements io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final java.lang.Object apply(java.lang.Object obj) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) obj;
        if (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(23)) {
            return io.appmetrica.analytics.impl.Ge.a(connectivityManager);
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? io.appmetrica.analytics.coreapi.internal.system.NetworkType.OFFLINE : (io.appmetrica.analytics.coreapi.internal.system.NetworkType) io.appmetrica.analytics.impl.Ge.f4329a.a(java.lang.Integer.valueOf(activeNetworkInfo.getType()));
    }
}
