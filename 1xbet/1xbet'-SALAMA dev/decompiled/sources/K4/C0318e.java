package K4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import p155w1.F0;
import p155w1.Y;

/* JADX INFO: renamed from: K4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0318e extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4011b;

    public /* synthetic */ C0318e(Object obj, int i7) {
        this.f4010a = i7;
        this.f4011b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f4010a) {
            case 0:
                ((F0) this.f4011b).D(true);
                break;
            case 1:
                ((V5.a) this.f4011b).f6675d.t();
                break;
            case 2:
            default:
                super.onAvailable(network);
                break;
            case 3:
                p084l5.b bVar = (p084l5.b) this.f4011b;
                bVar.getClass();
                bVar.f15039c.post(new p084l5.a(bVar, 0));
                break;
            case 4:
                Y y4 = (Y) this.f4011b;
                y4.d(new com.flurry.android.marketing.messaging.notification.b(6, y4, null));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z4) {
        switch (this.f4010a) {
            case 1:
                if (!z4) {
                    ((V5.a) this.f4011b).f6675d.t();
                }
                break;
            default:
                super.onBlockedStatusChanged(network, z4);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f4010a) {
            case 2:
                p023d1.n.d().b(p072k1.e.f14675i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                p072k1.e eVar = (p072k1.e) this.f4011b;
                eVar.c(eVar.f());
                break;
            case 3:
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
            case 4:
                Y y4 = (Y) this.f4011b;
                y4.d(new com.flurry.android.marketing.messaging.notification.b(6, y4, null));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.f4010a) {
            case 0:
                ((F0) this.f4011b).D(false);
                break;
            case 1:
            default:
                super.onLost(network);
                break;
            case 2:
                p023d1.n.d().b(p072k1.e.f14675i, "Network connection lost", new Throwable[0]);
                p072k1.e eVar = (p072k1.e) this.f4011b;
                eVar.c(eVar.f());
                break;
            case 3:
                p084l5.b bVar = (p084l5.b) this.f4011b;
                bVar.getClass();
                bVar.f15039c.post(new p084l5.a(bVar, 1));
                break;
            case 4:
                Y y4 = (Y) this.f4011b;
                y4.d(new com.flurry.android.marketing.messaging.notification.b(6, y4, null));
                break;
        }
    }
}
