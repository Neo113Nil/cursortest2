package X;

import P.C0302l;
import P.C0315s;
import P.C0326x0;
import kotlin.jvm.internal.z;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6054a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f6055b = new StackTraceElement[0];

    /* renamed from: c, reason: collision with root package name */
    public static final k f6056c = new k(0, new long[0], new Object[0]);

    public static final int a(int i, int i5) {
        return i << (((i5 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(C0315s c0315s, i4.e eVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>", eVar);
        z.b(2, eVar);
        eVar.invoke(c0315s, 1);
    }

    public static final d d(int i, W3.c cVar, C0315s c0315s) {
        Object M5 = c0315s.M();
        if (M5 == C0302l.f4480a) {
            M5 = new d(i, cVar, true);
            c0315s.i0(M5);
        }
        d dVar = (d) M5;
        dVar.h(cVar);
        return dVar;
    }

    public static final boolean e(C0326x0 c0326x0, C0326x0 c0326x02) {
        if (c0326x0 == null) {
            return true;
        }
        if (c0326x0 instanceof C0326x0) {
            return !c0326x0.b() || c0326x0.equals(c0326x02) || kotlin.jvm.internal.l.a(c0326x0.f4577c, c0326x02.f4577c);
        }
        return false;
    }
}
