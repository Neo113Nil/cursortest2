package K4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import k1.C1333e;
import l5.C1409b;
import l5.RunnableC1408a;
import w1.F0;
import w1.Y;

/* renamed from: K4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0318e extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4010a;

    /* renamed from: b, reason: collision with root package name */
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
                C1409b c1409b = (C1409b) this.f4011b;
                c1409b.getClass();
                c1409b.f15033c.post(new RunnableC1408a(c1409b, 0));
                break;
            case 4:
                r3.d(new com.flurry.android.marketing.messaging.notification.b(6, (Y) this.f4011b, null));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z4) {
        switch (this.f4010a) {
            case 1:
                if (!z4) {
                    ((V5.a) this.f4011b).f6675d.t();
                    break;
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
                d1.n.d().b(C1333e.f14669i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                C1333e c1333e = (C1333e) this.f4011b;
                c1333e.c(c1333e.f());
                break;
            case 3:
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
            case 4:
                r4.d(new com.flurry.android.marketing.messaging.notification.b(6, (Y) this.f4011b, null));
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
                d1.n.d().b(C1333e.f14669i, "Network connection lost", new Throwable[0]);
                C1333e c1333e = (C1333e) this.f4011b;
                c1333e.c(c1333e.f());
                break;
            case 3:
                C1409b c1409b = (C1409b) this.f4011b;
                c1409b.getClass();
                c1409b.f15033c.post(new RunnableC1408a(c1409b, 1));
                break;
            case 4:
                r4.d(new com.flurry.android.marketing.messaging.notification.b(6, (Y) this.f4011b, null));
                break;
        }
    }
}
