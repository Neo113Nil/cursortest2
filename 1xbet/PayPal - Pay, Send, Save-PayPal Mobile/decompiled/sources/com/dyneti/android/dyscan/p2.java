package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class p2 implements okhttp3.Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        android.net.TrafficStats.setThreadStatsTag(371371);
        try {
            return chain.proceed(chain.request());
        } finally {
            android.net.TrafficStats.clearThreadStatsTag();
        }
    }
}
