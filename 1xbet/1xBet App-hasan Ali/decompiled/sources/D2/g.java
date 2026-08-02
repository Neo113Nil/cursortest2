package D2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.internal.ads.C0568Cd;
import com.google.android.gms.internal.ads.C1489qs;
import com.google.android.gms.internal.ads.U4;
import f2.m;
import m2.C2088e;

/* loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f944b;

    public /* synthetic */ g(int i, Object obj) {
        this.f943a = i;
        this.f944b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f943a) {
            case 0:
                v3.e.m((v3.e) this.f944b, network, true);
                break;
            case 1:
            default:
                super.onAvailable(network);
                break;
            case 2:
                ((C0568Cd) this.f944b).f8021o.set(true);
                break;
            case 3:
                C1489qs.b((C1489qs) this.f944b, true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f943a) {
            case 1:
                synchronized (U4.class) {
                    ((U4) this.f944b).f11722l = networkCapabilities;
                }
                return;
            case 4:
                m.d().a(C2088e.f17989j, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                C2088e c2088e = (C2088e) this.f944b;
                c2088e.c(c2088e.f());
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f943a) {
            case 0:
                v3.e.m((v3.e) this.f944b, network, false);
                return;
            case 1:
                synchronized (U4.class) {
                    ((U4) this.f944b).f11722l = null;
                }
                return;
            case 2:
                ((C0568Cd) this.f944b).f8021o.set(false);
                return;
            case 3:
                C1489qs.b((C1489qs) this.f944b, false);
                return;
            default:
                m.d().a(C2088e.f17989j, "Network connection lost", new Throwable[0]);
                C2088e c2088e = (C2088e) this.f944b;
                c2088e.c(c2088e.f());
                return;
        }
    }
}
