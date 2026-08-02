package X5;

import W5.D;
import e6.AbstractC1053b;
import e6.C1052a;

/* loaded from: classes2.dex */
public final class a extends D {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f7480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i7) {
        super(cVar, 1);
        this.f7479c = i7;
        switch (i7) {
            case 1:
                this.f7480d = cVar;
                super(cVar, 1);
                AbstractC1053b.b();
                break;
            default:
                this.f7480d = cVar;
                AbstractC1053b.b();
                break;
        }
    }

    @Override // W5.D
    public final void b() {
        c cVar;
        int i7;
        c cVar2;
        switch (this.f7479c) {
            case 0:
                N6.d dVar = new N6.d();
                AbstractC1053b.c();
                try {
                    C1052a c1052a = AbstractC1053b.f12736a;
                    c1052a.getClass();
                    synchronized (this.f7480d.f7487a) {
                        N6.d dVar2 = this.f7480d.f7488b;
                        dVar.m(dVar2, dVar2.a());
                        cVar = this.f7480d;
                        cVar.f7492f = false;
                        i7 = cVar.f7486D;
                    }
                    cVar.f7495z.m(dVar, dVar.f4797b);
                    synchronized (this.f7480d.f7487a) {
                        this.f7480d.f7486D -= i7;
                    }
                    c1052a.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        AbstractC1053b.f12736a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                N6.d dVar3 = new N6.d();
                AbstractC1053b.c();
                try {
                    C1052a c1052a2 = AbstractC1053b.f12736a;
                    c1052a2.getClass();
                    synchronized (this.f7480d.f7487a) {
                        N6.d dVar4 = this.f7480d.f7488b;
                        dVar3.m(dVar4, dVar4.f4797b);
                        cVar2 = this.f7480d;
                        cVar2.f7493x = false;
                    }
                    cVar2.f7495z.m(dVar3, dVar3.f4797b);
                    this.f7480d.f7495z.flush();
                    c1052a2.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        AbstractC1053b.f12736a.getClass();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
