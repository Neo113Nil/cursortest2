package s3;

import java.util.Objects;
import m2.AbstractC1286i;
import m2.C1278a;

/* loaded from: classes.dex */
public final class i extends AbstractC1286i {
    @Override // m2.AbstractC1286i
    public final Object b(V0.j jVar) {
        j5.i value = j5.i.f10496d;
        long z = jVar.z();
        j5.f fVar = null;
        String str = "";
        b bVar = null;
        while (true) {
            int f3 = ((C1278a) jVar.f3212b).f();
            if (f3 == -1) {
                break;
            }
            if (f3 == 1) {
                str = (String) AbstractC1286i.f11172o.b(jVar);
            } else if (f3 != 2) {
                jVar.O(f3);
            } else {
                bVar = (b) b.f11812j.b(jVar);
            }
        }
        j5.i unknownFields = jVar.D(z);
        kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
        if (unknownFields.a() > 0) {
            fVar = new j5.f();
            kotlin.jvm.internal.i.e(value, "value");
            fVar.G(value);
            value = j5.i.f10496d;
            fVar.G(unknownFields);
        }
        if (fVar != null) {
            value = fVar.o(fVar.f10495b);
        }
        return new j(str, bVar, value);
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e eVar, Object obj) {
        j jVar = (j) obj;
        if (!Objects.equals(jVar.f11833c, "")) {
            AbstractC1286i.f11172o.e(eVar, 1, jVar.f11833c);
        }
        b bVar = jVar.f11834d;
        if (!Objects.equals(bVar, null)) {
            b.f11812j.e(eVar, 2, bVar);
        }
        eVar.D(jVar.a());
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        int i2;
        j jVar = (j) obj;
        if (Objects.equals(jVar.f11833c, "")) {
            i2 = 0;
        } else {
            i2 = AbstractC1286i.f11172o.g(1, jVar.f11833c);
        }
        b bVar = jVar.f11834d;
        if (!Objects.equals(bVar, null)) {
            i2 += b.f11812j.g(2, bVar);
        }
        return jVar.a().a() + i2;
    }
}
