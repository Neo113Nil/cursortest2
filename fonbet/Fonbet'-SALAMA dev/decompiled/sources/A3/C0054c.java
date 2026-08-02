package A3;

/* renamed from: A3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054c extends A {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f636x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f637y;

    public /* synthetic */ C0054c(Object obj, int i7) {
        this.f636x = i7;
        this.f637y = obj;
    }

    @Override // A3.A
    public final void b() {
        switch (this.f636x) {
            case 0:
                ServiceConnectionC0055d serviceConnectionC0055d = (ServiceConnectionC0055d) this.f637y;
                C0056e c0056e = serviceConnectionC0055d.f638a;
                c0056e.f641b.b("unlinkToDeath", new Object[0]);
                c0056e.f652n.asBinder().unlinkToDeath(c0056e.f649k, 0);
                C0056e c0056e2 = serviceConnectionC0055d.f638a;
                c0056e2.f652n = null;
                c0056e2.f646g = false;
                return;
            default:
                synchronized (((C0056e) this.f637y).f645f) {
                    try {
                        if (((C0056e) this.f637y).f650l.get() > 0 && ((C0056e) this.f637y).f650l.decrementAndGet() > 0) {
                            ((C0056e) this.f637y).f641b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C0056e c0056e3 = (C0056e) this.f637y;
                        if (c0056e3.f652n != null) {
                            c0056e3.f641b.b("Unbind from service.", new Object[0]);
                            C0056e c0056e4 = (C0056e) this.f637y;
                            c0056e4.f640a.unbindService(c0056e4.f651m);
                            C0056e c0056e5 = (C0056e) this.f637y;
                            c0056e5.f646g = false;
                            c0056e5.f652n = null;
                            c0056e5.f651m = null;
                        }
                        ((C0056e) this.f637y).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
