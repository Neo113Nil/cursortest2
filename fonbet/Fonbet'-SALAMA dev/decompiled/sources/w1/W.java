package w1;

import K4.C0318e;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Looper;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class W extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f17567b;

    public /* synthetic */ W(Y y4, int i7) {
        this.f17566a = i7;
        this.f17567b = y4;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        switch (this.f17566a) {
            case 0:
                ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC1707i1.f17743c.getSystemService("connectivity");
                NetworkRequest build = new NetworkRequest.Builder().build();
                Y y4 = this.f17567b;
                if (y4.f17611M == null) {
                    y4.f17611M = new C0318e(y4, 4);
                }
                connectivityManager.registerNetworkCallback(build, y4.f17611M);
                break;
            case 1:
                Looper.prepare();
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC1707i1.f17743c.getSystemService("phone");
                Y y5 = this.f17567b;
                if (y5.f17612N == null) {
                    y5.f17612N = new V(y5);
                }
                telephonyManager.listen(y5.f17612N, 256);
                Looper.loop();
                break;
            case 2:
                Y y7 = this.f17567b;
                y7.f17600B = Y.l();
                int n2 = Y.n();
                y7.f17602D = n2;
                y7.h(new U(n2, y7.f17600B, y7.f17603E, y7.f17604F, y7.f17605G, y7.f17606H, y7.f17607I, y7.f17608J, y7.f17609K));
                break;
            default:
                Y y8 = this.f17567b;
                y8.getClass();
                boolean l7 = Y.l();
                int n7 = Y.n();
                if (y8.f17600B != l7 || y8.f17602D != n7 || y8.f17601C) {
                    y8.f17600B = l7;
                    y8.f17602D = n7;
                    y8.f17601C = false;
                    y8.h(new U(Y.n(), y8.f17600B, y8.f17603E, y8.f17604F, y8.f17605G, y8.f17606H, y8.f17607I, y8.f17608J, y8.f17609K));
                    break;
                }
                break;
        }
    }
}
