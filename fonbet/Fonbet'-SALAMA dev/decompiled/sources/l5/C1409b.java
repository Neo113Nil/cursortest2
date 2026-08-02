package l5;

import A5.h;
import A5.i;
import K4.C0318e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: l5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1409b extends BroadcastReceiver implements i {

    /* renamed from: a, reason: collision with root package name */
    public final u1.c f15031a;

    /* renamed from: b, reason: collision with root package name */
    public h f15032b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f15033c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public C0318e f15034d;

    public C1409b(Context context, u1.c cVar) {
        this.f15031a = cVar;
    }

    @Override // A5.i
    public final void b() {
        C0318e c0318e = this.f15034d;
        if (c0318e != null) {
            ((ConnectivityManager) this.f15031a.f16591b).unregisterNetworkCallback(c0318e);
            this.f15034d = null;
        }
    }

    @Override // A5.i
    public final void c(Object obj, h hVar) {
        this.f15032b = hVar;
        C0318e c0318e = new C0318e(this, 3);
        this.f15034d = c0318e;
        ((ConnectivityManager) this.f15031a.f16591b).registerDefaultNetworkCallback(c0318e);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h hVar = this.f15032b;
        if (hVar != null) {
            hVar.c(this.f15031a.h());
        }
    }
}
