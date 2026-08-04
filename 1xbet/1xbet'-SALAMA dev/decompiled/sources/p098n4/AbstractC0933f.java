package p098n4;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p120q4.k;
import p134s4.c;
import p134s4.d;
import p134s4.h;

/* JADX INFO: renamed from: n4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0933f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public N f15419b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15418a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15420c = false;

    public abstract AbstractC0933f a(h hVar);

    public abstract d b(c cVar, h hVar);

    public abstract void c(p063i4.c cVar);

    public abstract void d(d dVar);

    public abstract h e();

    public abstract boolean f(AbstractC0933f abstractC0933f);

    public abstract boolean g(int i7);

    public final void h() {
        N n2;
        boolean z4 = true;
        if (!this.f15418a.compareAndSet(false, true) || (n2 = this.f15419b) == null) {
            return;
        }
        synchronized (n2.f15393a) {
            try {
                List list = (List) n2.f15393a.get(this);
                int i7 = 0;
                if (list != null) {
                    while (true) {
                        if (i7 >= list.size()) {
                            i7 = 0;
                            break;
                        } else {
                            if (list.get(i7) == this) {
                                list.remove(i7);
                                i7 = 1;
                                break;
                            }
                            i7++;
                        }
                    }
                    if (list.isEmpty()) {
                        n2.f15393a.remove(this);
                    }
                }
                if (i7 == 0 && this.f15420c) {
                    z4 = false;
                }
                k.c(z4);
                if (!e().c()) {
                    AbstractC0933f abstractC0933fA = a(h.a(e().f16178a));
                    List list2 = (List) n2.f15393a.get(abstractC0933fA);
                    if (list2 != null) {
                        for (int i8 = 0; i8 < list2.size(); i8++) {
                            if (list2.get(i8) == this) {
                                list2.remove(i8);
                                break;
                            }
                        }
                        if (list2.isEmpty()) {
                            n2.f15393a.remove(abstractC0933fA);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15419b = null;
    }
}
