package com.inmobi.media;

/* renamed from: com.inmobi.media.bk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2307bk extends android.net.ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "network");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.AbstractC2335ck.f5145a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "access$getTAG$p(...)");
        super.onAvailable(network);
        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "network");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.AbstractC2335ck.f5145a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "access$getTAG$p(...)");
        super.onLost(network);
        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(10, 4, "lost"));
    }
}
