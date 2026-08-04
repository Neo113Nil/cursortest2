package p117q0;

import android.os.IBinder;
import android.os.Messenger;
import p033e3.h;
import p096n1.e;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f15770c;

    public /* synthetic */ p(h hVar, e eVar, int i7) {
        this.f15768a = i7;
        this.f15770c = hVar;
        this.f15769b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15768a) {
            case 0:
                h hVar = (h) ((s) this.f15770c.f12673a).f15787e.remove(((Messenger) this.f15769b.f15314b).getBinder());
                if (hVar != null) {
                    ((Messenger) hVar.f15748d.f15314b).getBinder().unlinkToDeath(hVar, 0);
                }
                break;
            default:
                IBinder binder = ((Messenger) this.f15769b.f15314b).getBinder();
                h hVar2 = (h) ((s) this.f15770c.f12673a).f15787e.remove(binder);
                if (hVar2 != null) {
                    binder.unlinkToDeath(hVar2, 0);
                }
                break;
        }
    }
}
