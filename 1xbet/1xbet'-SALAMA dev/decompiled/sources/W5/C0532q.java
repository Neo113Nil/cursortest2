package W5;

import U5.AbstractC0457y;
import U5.C0450q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: W5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0532q extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7311c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0532q(M0 m7, C0450q c0450q) {
        super(c0450q, 0);
        this.f7312d = m7;
    }

    @Override // W5.D
    public final void c() {
        List list;
        switch (this.f7311c) {
            case 0:
                android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) this.f7312d;
                p036e6.b.c();
                try {
                    p036e6.c cVar = ((C0537s) tVar.f8078d).f7326b;
                    p036e6.b.a();
                    p036e6.b.f12742a.getClass();
                    if (((U5.l0) tVar.f8077c) == null) {
                        try {
                            ((AbstractC0457y) tVar.f8076b).j();
                        } catch (Throwable th) {
                            U5.l0 l0VarG = U5.l0.f6537f.f(th).g("Failed to call onReady.");
                            tVar.f8077c = l0VarG;
                            ((C0537s) tVar.f8078d).j.f(l0VarG);
                        }
                        break;
                    }
                    p036e6.b.f12742a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        p036e6.b.f12742a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 1:
                ((M0) this.f7312d).h();
                return;
            default:
                I i7 = (I) this.f7312d;
                i7.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (i7) {
                        try {
                            if (i7.f6821c.isEmpty()) {
                                i7.f6821c = null;
                                i7.f6820b = true;
                                return;
                            } else {
                                list = i7.f6821c;
                                i7.f6821c = arrayList;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0532q(M0 m7, I i7) {
        super(m7.f6866c, 0);
        this.f7312d = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0532q(android.support.v4.media.session.t tVar) {
        super(((C0537s) tVar.f8078d).f7330f, 0);
        this.f7312d = tVar;
    }
}
