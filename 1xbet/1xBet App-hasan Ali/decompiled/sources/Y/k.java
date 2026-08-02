package Y;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import S3.C0416t;
import S3.L;
import W3.o;
import a.AbstractC0444a;
import i4.InterfaceC2015a;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final v3.g f6119a = new v3.g(13, new L(4), new C0416t(8));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object b(Object[] objArr, v3.g gVar, InterfaceC2015a interfaceC2015a, C0315s c0315s, int i, int i5) {
        Object[] objArr2;
        v3.g gVar2;
        final Object obj;
        Object f;
        long j5 = c0315s.f4531T;
        AbstractC0444a.k(36);
        final String l5 = Long.toString(j5, 36);
        l.e("toString(...)", l5);
        l.d("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>", gVar);
        final f fVar = (f) c0315s.j(h.f6114a);
        Object M5 = c0315s.M();
        Object obj2 = C0302l.f4480a;
        if (M5 == obj2) {
            Object c5 = (fVar == null || (f = fVar.f(l5)) == null) ? null : ((i4.c) gVar.f20440m).c(f);
            if (c5 == null) {
                c5 = interfaceC2015a.invoke();
            }
            objArr2 = objArr;
            gVar2 = gVar;
            Object bVar = new b(gVar2, fVar, l5, c5, objArr2);
            c0315s.i0(bVar);
            M5 = bVar;
        } else {
            objArr2 = objArr;
            gVar2 = gVar;
        }
        final b bVar2 = (b) M5;
        Object obj3 = Arrays.equals(objArr2, bVar2.f6103o) ? bVar2.f6102n : null;
        if (obj3 == null) {
            obj3 = interfaceC2015a.invoke();
        }
        boolean h3 = c0315s.h(bVar2) | ((((i & 112) ^ 48) > 32 && c0315s.h(gVar2)) || (i & 48) == 32) | c0315s.h(fVar) | c0315s.f(l5) | c0315s.h(obj3) | c0315s.h(objArr2);
        Object M6 = c0315s.M();
        if (h3 || M6 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final v3.g gVar3 = gVar2;
            Object obj4 = new InterfaceC2015a() { // from class: Y.a
                @Override // i4.InterfaceC2015a
                public final Object invoke() {
                    boolean z3;
                    b bVar3 = b.this;
                    f fVar2 = bVar3.f6100l;
                    f fVar3 = fVar;
                    boolean z5 = true;
                    if (fVar2 != fVar3) {
                        bVar3.f6100l = fVar3;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String str = bVar3.f6101m;
                    String str2 = l5;
                    if (l.a(str, str2)) {
                        z5 = z3;
                    } else {
                        bVar3.f6101m = str2;
                    }
                    bVar3.f6099k = gVar3;
                    bVar3.f6102n = obj;
                    bVar3.f6103o = objArr3;
                    e eVar = bVar3.f6104p;
                    if (eVar != null && z5) {
                        ((v3.e) eVar).Q();
                        bVar3.f6104p = null;
                        bVar3.b();
                    }
                    return o.f6046a;
                }
            };
            c0315s.i0(obj4);
            M6 = obj4;
        } else {
            obj = obj3;
        }
        AbstractC0329z.g((InterfaceC2015a) M6, c0315s);
        return obj;
    }

    public static final d c(C0315s c0315s) {
        c0315s.X(1967008021);
        Object[] objArr = new Object[0];
        v3.g gVar = d.f6106o;
        Object M5 = c0315s.M();
        if (M5 == C0302l.f4480a) {
            M5 = new B1.h(8);
            c0315s.i0(M5);
        }
        d dVar = (d) b(Arrays.copyOf(objArr, 0), gVar, (InterfaceC2015a) M5, c0315s, 3456, 0);
        dVar.f6109m = (f) c0315s.j(h.f6114a);
        c0315s.q(false);
        return dVar;
    }
}
