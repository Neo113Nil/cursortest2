package n4;

import i4.C1266c;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.C1595c;
import s4.C1596d;

/* renamed from: n4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1472f {

    /* renamed from: b, reason: collision with root package name */
    public N f15413b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15412a = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public boolean f15414c = false;

    public abstract AbstractC1472f a(s4.h hVar);

    public abstract C1596d b(C1595c c1595c, s4.h hVar);

    public abstract void c(C1266c c1266c);

    public abstract void d(C1596d c1596d);

    public abstract s4.h e();

    public abstract boolean f(AbstractC1472f abstractC1472f);

    public abstract boolean g(int i7);

    public final void h() {
        N n2;
        int i7 = 0;
        boolean z4 = true;
        if (!this.f15412a.compareAndSet(false, true) || (n2 = this.f15413b) == null) {
            return;
        }
        synchronized (n2.f15387a) {
            try {
                List list = (List) n2.f15387a.get(this);
                int i8 = 0;
                if (list != null) {
                    while (true) {
                        if (i8 >= list.size()) {
                            i8 = 0;
                            break;
                        } else {
                            if (list.get(i8) == this) {
                                list.remove(i8);
                                i8 = 1;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (list.isEmpty()) {
                        n2.f15387a.remove(this);
                    }
                }
                if (i8 == 0 && this.f15414c) {
                    z4 = false;
                }
                q4.k.c(z4);
                if (!e().c()) {
                    AbstractC1472f a2 = a(s4.h.a(e().f16172a));
                    List list2 = (List) n2.f15387a.get(a2);
                    if (list2 != null) {
                        while (true) {
                            if (i7 >= list2.size()) {
                                break;
                            }
                            if (list2.get(i7) == this) {
                                list2.remove(i7);
                                break;
                            }
                            i7++;
                        }
                        if (list2.isEmpty()) {
                            n2.f15387a.remove(a2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15413b = null;
    }
}
