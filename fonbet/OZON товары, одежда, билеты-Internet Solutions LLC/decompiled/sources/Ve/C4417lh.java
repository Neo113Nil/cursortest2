package Ve;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.lh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4417lh extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4592rj f31531a;

    public C4417lh(C4592rj c4592rj) {
        this.f31531a = c4592rj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        ((C4194dp) this.f31531a.u()).e0(Tc.f30034a);
    }
}
