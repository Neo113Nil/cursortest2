package A3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: A3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0055d implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0056e f638a;

    public /* synthetic */ ServiceConnectionC0055d(C0056e c0056e) {
        this.f638a = c0056e;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0056e c0056e = this.f638a;
        c0056e.f641b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c0056e.a().post(new C0053b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0056e c0056e = this.f638a;
        c0056e.f641b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c0056e.a().post(new C0054c(this, 0));
    }
}
