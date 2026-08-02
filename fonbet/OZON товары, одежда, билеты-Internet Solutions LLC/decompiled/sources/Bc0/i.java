package Bc0;

import Sc.r;
import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;
import xe.C10737n;

/* loaded from: classes3.dex */
public final class i extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f3539a;

    i(C10737n c10737n) {
        this.f3539a = c10737n;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        C10737n c10737n = this.f3539a;
        if (c10737n.isActive()) {
            r.Companion companion = r.INSTANCE;
            c10737n.resumeWith(network);
        }
    }
}
