package C7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
class r extends D7.i {

    /* renamed from: e, reason: collision with root package name */
    final D7.n f4453e;

    /* renamed from: f, reason: collision with root package name */
    final TaskCompletionSource f4454f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ u f4455g;

    r(u uVar, D7.n nVar, TaskCompletionSource taskCompletionSource) {
        this.f4455g = uVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f4453e = nVar;
        this.f4454f = taskCompletionSource;
    }

    @Override // D7.j
    public void a(Bundle bundle) throws RemoteException {
        this.f4455g.f4459a.u(this.f4454f);
        this.f4453e.d("onCompleteUpdate", new Object[0]);
    }

    @Override // D7.j
    public void k(Bundle bundle) throws RemoteException {
        this.f4455g.f4459a.u(this.f4454f);
        this.f4453e.d("onRequestInfo", new Object[0]);
    }
}
