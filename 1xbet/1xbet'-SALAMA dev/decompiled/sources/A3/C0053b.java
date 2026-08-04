package A3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: renamed from: A3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0053b extends A {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ IBinder f634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0055d f635y;

    public C0053b(ServiceConnectionC0055d serviceConnectionC0055d, IBinder iBinder) {
        this.f635y = serviceConnectionC0055d;
        this.f634x = iBinder;
    }

    @Override // A3.A
    public final void b() {
        ServiceConnectionC0055d serviceConnectionC0055d = this.f635y;
        IInterface iInterface = (IInterface) serviceConnectionC0055d.f638a.f648i.a(this.f634x);
        C0056e c0056e = serviceConnectionC0055d.f638a;
        c0056e.f652n = iInterface;
        z zVar = c0056e.f641b;
        zVar.b("linkToDeath", new Object[0]);
        try {
            c0056e.f652n.asBinder().linkToDeath(c0056e.f649k, 0);
        } catch (RemoteException e7) {
            zVar.a(e7, "linkToDeath failed", new Object[0]);
        }
        c0056e.f646g = false;
        Iterator it = c0056e.f643d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c0056e.f643d.clear();
    }
}
