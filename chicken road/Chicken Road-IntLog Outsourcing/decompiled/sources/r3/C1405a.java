package r3;

import U.e;
import V0.j;
import j5.f;
import j5.i;
import m2.AbstractC1286i;
import m2.C1278a;
import n2.C1342d;
import t3.C1429d;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1405a extends AbstractC1286i {
    @Override // m2.AbstractC1286i
    public final Object b(j jVar) {
        f fVar;
        i value = i.f10496d;
        C1342d c1342d = new C1342d();
        long z = jVar.z();
        while (true) {
            int f3 = ((C1278a) jVar.f3212b).f();
            if (f3 == -1) {
                break;
            }
            if (f3 != 1) {
                jVar.O(f3);
            } else {
                c1342d.add((C1429d) C1429d.f11934f.b(jVar));
            }
        }
        i unknownFields = jVar.D(z);
        kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            fVar = new f();
            kotlin.jvm.internal.i.e(value, "value");
            fVar.G(value);
            value = i.f10496d;
            fVar.G(unknownFields);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            value = fVar.o(fVar.f10495b);
        }
        return new C1406b(c1342d, value);
    }

    @Override // m2.AbstractC1286i
    public final void d(e eVar, Object obj) {
        C1406b c1406b = (C1406b) obj;
        C1429d.f11934f.a().e(eVar, 1, c1406b.f11723c);
        eVar.D(c1406b.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        C1406b c1406b = (C1406b) obj;
        return c1406b.a().a() + C1429d.f11934f.a().g(1, c1406b.f11723c);
    }
}
