package M7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes9.dex */
final class v implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f17527a;

    /* synthetic */ v(w wVar) {
        this.f17527a = wVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m mVar;
        w wVar = this.f17527a;
        mVar = wVar.f17530b;
        mVar.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        wVar.c().post(new t(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m mVar;
        w wVar = this.f17527a;
        mVar = wVar.f17530b;
        mVar.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        wVar.c().post(new u(this));
    }
}
