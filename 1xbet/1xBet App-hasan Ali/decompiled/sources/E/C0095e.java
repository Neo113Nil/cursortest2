package E;

import P.C0302l;
import P.C0315s;

/* renamed from: E.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095e extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public static final C0095e f1135l = new C0095e(3);

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        b0.p pVar = (b0.p) obj;
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        c0315s.X(-2126899193);
        long j5 = ((I.W) c0315s.j(I.X.f2457a)).f2455a;
        b0.m mVar = b0.m.f7161k;
        boolean e3 = c0315s.e(j5);
        Object M5 = c0315s.M();
        if (e3 || M5 == C0302l.f4480a) {
            M5 = new C0093d(0, j5);
            c0315s.i0(M5);
        }
        b0.p c5 = pVar.c(androidx.compose.ui.draw.a.b(mVar, (i4.c) M5));
        c0315s.q(false);
        return c5;
    }
}
