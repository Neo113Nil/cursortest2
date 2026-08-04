package p155w1;

import K4.C0318e;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Looper;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f17573b;

    public /* synthetic */ W(Y y4, int i7) {
        this.f17572a = i7;
        this.f17573b = y4;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f17572a) {
            case 0:
                ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC0998i1.f17749c.getSystemService("connectivity");
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
                Y y4 = this.f17573b;
                if (y4.f17617M == null) {
                    y4.f17617M = new C0318e(y4, 4);
                }
                connectivityManager.registerNetworkCallback(networkRequestBuild, y4.f17617M);
                break;
            case 1:
                Looper.prepare();
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC0998i1.f17749c.getSystemService("phone");
                Y y5 = this.f17573b;
                if (y5.f17618N == null) {
                    y5.f17618N = new V(y5);
                }
                telephonyManager.listen(y5.f17618N, 256);
                Looper.loop();
                break;
            case 2:
                Y y7 = this.f17573b;
                y7.f17606B = Y.l();
                int iN = Y.n();
                y7.f17608D = iN;
                y7.h(new U(iN, y7.f17606B, y7.f17609E, y7.f17610F, y7.f17611G, y7.f17612H, y7.f17613I, y7.f17614J, y7.f17615K));
                break;
            default:
                Y y8 = this.f17573b;
                y8.getClass();
                boolean zL = Y.l();
                int iN2 = Y.n();
                if (y8.f17606B != zL || y8.f17608D != iN2 || y8.f17607C) {
                    y8.f17606B = zL;
                    y8.f17608D = iN2;
                    y8.f17607C = false;
                    y8.h(new U(Y.n(), y8.f17606B, y8.f17609E, y8.f17610F, y8.f17611G, y8.f17612H, y8.f17613I, y8.f17614J, y8.f17615K));
                }
                break;
        }
    }
}
