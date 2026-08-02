package D7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
final class w implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f6125a;

    /* synthetic */ w(x xVar) {
        this.f6125a = xVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        n nVar;
        x xVar = this.f6125a;
        nVar = xVar.f6128b;
        nVar.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        xVar.c().post(new u(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n nVar;
        x xVar = this.f6125a;
        nVar = xVar.f6128b;
        nVar.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        xVar.c().post(new v(this));
    }
}
