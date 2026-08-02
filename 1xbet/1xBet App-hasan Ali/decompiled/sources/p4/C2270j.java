package p4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: p4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2270j extends X {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18798o;

    /* renamed from: p, reason: collision with root package name */
    public final C2268h f18799p;

    public /* synthetic */ C2270j(C2268h c2268h, int i) {
        this.f18798o = i;
        this.f18799p = c2268h;
    }

    @Override // p4.X
    public final boolean k() {
        switch (this.f18798o) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p4.X
    public final void l(Throwable th) {
        switch (this.f18798o) {
            case 0:
                b0 j5 = j();
                C2268h c2268h = this.f18799p;
                Throwable p5 = c2268h.p(j5);
                if (c2268h.w()) {
                    u4.f fVar = (u4.f) c2268h.f18795n;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u4.f.f20086r;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        H3.g gVar = u4.a.f20077c;
                        if (kotlin.jvm.internal.l.a(obj, gVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, gVar, p5)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != gVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c2268h.g(p5);
                if (!c2268h.w()) {
                    c2268h.n();
                    break;
                }
                break;
            default:
                this.f18799p.resumeWith(W3.o.f6046a);
                break;
        }
    }
}
