package v1;

import A5.h;
import A5.i;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import p145u1.j;
import p145u1.k;
import p155w1.AbstractC0997i0;
import p155w1.C1013m0;
import p155w1.C1046w0;
import p155w1.C1055z0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17077a;

    @Override // A5.i
    public final void b() {
        int i7 = this.f17077a;
    }

    @Override // A5.i
    public final void c(Object obj, h hVar) {
        switch (this.f17077a) {
            case 0:
                if (e.f17083y == null) {
                    j jVar = new j(1);
                    j.f16707b = hVar;
                    e.f17083y = jVar;
                    p145u1.c cVarG = p145u1.c.g();
                    j jVar2 = e.f17083y;
                    cVarG.getClass();
                    ((C1046w0) cVarG.f16597b).i(jVar2, C1055z0.f17948d);
                    return;
                }
                return;
            case 1:
                C1013m0.f17797c = hVar;
                String str = C1013m0.f17800f;
                if (str != null) {
                    C1013m0.k(str);
                    return;
                }
                return;
            default:
                if (e.f17084z == null) {
                    d dVar = new d();
                    d.f17080a = hVar;
                    e.f17084z = dVar;
                    Set set = k.f16709a;
                    synchronized (set) {
                        try {
                            if (set.contains(dVar)) {
                                AbstractC0997i0.o(3, "The listener is already registered");
                                return;
                            }
                            set.add(dVar);
                            if (k.f16710b) {
                                new Handler(Looper.getMainLooper()).post(new c(3, k.f16711c));
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
