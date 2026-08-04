package p084l5;

import A5.h;
import A5.i;
import K4.C0318e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import p145u1.c;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends BroadcastReceiver implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f15038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f15039c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0318e f15040d;

    public b(Context context, c cVar) {
        this.f15037a = cVar;
    }

    @Override // A5.i
    public final void b() {
        C0318e c0318e = this.f15040d;
        if (c0318e != null) {
            ((ConnectivityManager) this.f15037a.f16597b).unregisterNetworkCallback(c0318e);
            this.f15040d = null;
        }
    }

    @Override // A5.i
    public final void c(Object obj, h hVar) {
        this.f15038b = hVar;
        C0318e c0318e = new C0318e(this, 3);
        this.f15040d = c0318e;
        ((ConnectivityManager) this.f15037a.f16597b).registerDefaultNetworkCallback(c0318e);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h hVar = this.f15038b;
        if (hVar != null) {
            hVar.c(this.f15037a.h());
        }
    }
}
