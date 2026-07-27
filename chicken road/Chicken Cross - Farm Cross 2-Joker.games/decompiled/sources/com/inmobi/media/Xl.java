package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xl extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        ConcurrentHashMap concurrentHashMap = Yl.f6978a;
        Intrinsics.checkNotNullExpressionValue("Yl", "access$getTAG$p(...)");
        super.onAvailable(network);
        ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        ConcurrentHashMap concurrentHashMap = Yl.f6978a;
        Intrinsics.checkNotNullExpressionValue("Yl", "access$getTAG$p(...)");
        super.onLost(network);
        ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(10, 4, "lost"));
    }
}
