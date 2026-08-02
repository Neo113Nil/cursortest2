package J0;

import kotlin.Unit;
import m0.C7980b;
import m0.C8025y;
import org.jetbrains.annotations.NotNull;
import t0.C9713b;
import t0.s;

/* loaded from: classes8.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m0.T0<Z1.h> f13109a = new m0.T0<>(120, m0.G.a(), 2);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final m0.T0<Z1.h> f13110b = new m0.T0<>(150, new C8025y(0.4f, 0.0f, 0.6f, 1.0f), 2);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final m0.T0<Z1.h> f13111c = new m0.T0<>(120, new C8025y(0.4f, 0.0f, 0.6f, 1.0f), 2);

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        if ((r10 instanceof t0.C9717f) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        if ((r9 instanceof t0.C9717f) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull C7980b c7980b, float f7, t0.n nVar, t0.n nVar2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        m0.T0<Z1.h> t02;
        m0.T0<Z1.h> t03 = null;
        if (nVar2 != null) {
            boolean z11 = nVar2 instanceof s.b;
            t02 = f13109a;
            if (!z11) {
                if (!(nVar2 instanceof C9713b)) {
                    if (!(nVar2 instanceof t0.j)) {
                    }
                }
            }
            t03 = t02;
        } else if (nVar != null) {
            boolean z12 = nVar instanceof s.b;
            t02 = f13110b;
            if (!z12 && !(nVar instanceof C9713b)) {
                if (nVar instanceof t0.j) {
                    t03 = f13111c;
                }
            }
            t03 = t02;
        }
        m0.T0<Z1.h> t04 = t03;
        if (t04 != null) {
            Object f11 = C7980b.f(c7980b, Z1.h.a(f7), t04, null, cVar, 12);
            return f11 == Wc.a.COROUTINE_SUSPENDED ? f11 : Unit.f71690a;
        }
        Object m11 = c7980b.m(Z1.h.a(f7), cVar);
        return m11 == Wc.a.COROUTINE_SUSPENDED ? m11 : Unit.f71690a;
    }
}
