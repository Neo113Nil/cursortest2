package H2;

import P.W;
import W3.o;
import java.io.IOException;
import java.util.ArrayList;
import p4.C2268h;
import y4.z;

/* loaded from: classes.dex */
public final class f implements y4.e, i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2286k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2287l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2288m;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f2286k = i;
        this.f2288m = obj;
        this.f2287l = obj2;
    }

    private final Object a(Object obj) {
        W w5 = (W) this.f2288m;
        Object obj2 = w5.f4412l;
        C2268h c2268h = (C2268h) this.f2287l;
        synchronized (obj2) {
            ((ArrayList) w5.f4413m).remove(c2268h);
        }
        return o.f6046a;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        long j5;
        switch (this.f2286k) {
            case 0:
                try {
                    ((C4.i) this.f2288m).cancel();
                } catch (Throwable unused) {
                }
                return o.f6046a;
            case 1:
                return a(obj);
            default:
                Z.j jVar = (Z.j) obj;
                synchronized (Z.l.f6208c) {
                    j5 = Z.l.f6210e;
                    Z.l.f6210e = 1 + j5;
                }
                return new Z.b(j5, jVar, (i4.c) this.f2288m, (i4.c) this.f2287l);
        }
    }

    @Override // y4.e
    public void k(z zVar) {
        ((C2268h) this.f2287l).resumeWith(zVar);
    }

    @Override // y4.e
    public void l(C4.i iVar, IOException iOException) {
        if (iVar.f888w) {
            return;
        }
        ((C2268h) this.f2287l).resumeWith(G4.l.p(iOException));
    }
}
