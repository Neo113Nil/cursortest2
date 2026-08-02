package v1;

import A5.h;
import A5.i;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import u1.j;
import u1.k;
import w1.AbstractC1706i0;
import w1.C1722m0;
import w1.C1755w0;
import w1.C1764z0;

/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17071a;

    @Override // A5.i
    public final void b() {
        int i7 = this.f17071a;
    }

    @Override // A5.i
    public final void c(Object obj, h hVar) {
        switch (this.f17071a) {
            case 0:
                if (e.f17077y == null) {
                    j jVar = new j(1);
                    j.f16701b = hVar;
                    e.f17077y = jVar;
                    u1.c g3 = u1.c.g();
                    j jVar2 = e.f17077y;
                    g3.getClass();
                    ((C1755w0) g3.f16591b).i(jVar2, C1764z0.f17942d);
                    return;
                }
                return;
            case 1:
                C1722m0.f17791c = hVar;
                String str = C1722m0.f17794f;
                if (str != null) {
                    C1722m0.k(str);
                    return;
                }
                return;
            default:
                if (e.f17078z == null) {
                    d dVar = new d();
                    d.f17074a = hVar;
                    e.f17078z = dVar;
                    Set set = k.f16703a;
                    synchronized (set) {
                        try {
                            if (set.contains(dVar)) {
                                AbstractC1706i0.o(3, "The listener is already registered");
                                return;
                            }
                            set.add(dVar);
                            if (k.f16704b) {
                                new Handler(Looper.getMainLooper()).post(new c(3, k.f16705c));
                            }
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
        }
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
