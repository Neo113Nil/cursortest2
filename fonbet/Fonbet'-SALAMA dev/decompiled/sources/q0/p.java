package q0;

import android.os.IBinder;
import android.os.Messenger;
import e3.C1023h;
import n1.C1450e;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1450e f15763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1023h f15764c;

    public /* synthetic */ p(C1023h c1023h, C1450e c1450e, int i7) {
        this.f15762a = i7;
        this.f15764c = c1023h;
        this.f15763b = c1450e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15762a) {
            case 0:
                h hVar = (h) ((s) this.f15764c.f12667a).f15781e.remove(((Messenger) this.f15763b.f15308b).getBinder());
                if (hVar != null) {
                    ((Messenger) hVar.f15742d.f15308b).getBinder().unlinkToDeath(hVar, 0);
                    break;
                }
                break;
            default:
                IBinder binder = ((Messenger) this.f15763b.f15308b).getBinder();
                h hVar2 = (h) ((s) this.f15764c.f12667a).f15781e.remove(binder);
                if (hVar2 != null) {
                    binder.unlinkToDeath(hVar2, 0);
                    break;
                }
                break;
        }
    }
}
