package Ve;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class W1 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H3 f30238a;

    public W1(H3 h32) {
        this.f30238a = h32;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        ((R4) this.f30238a.u()).e0(Uo.f30144a);
    }
}
