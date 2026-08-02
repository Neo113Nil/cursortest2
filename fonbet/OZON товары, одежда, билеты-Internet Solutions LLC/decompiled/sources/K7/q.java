package K7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes9.dex */
final class q implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f15311a;

    /* synthetic */ q(r rVar) {
        this.f15311a = rVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h hVar;
        r rVar = this.f15311a;
        hVar = rVar.f15314b;
        hVar.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        rVar.c().post(new o(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        h hVar;
        r rVar = this.f15311a;
        hVar = rVar.f15314b;
        hVar.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        rVar.c().post(new p(this));
    }
}
