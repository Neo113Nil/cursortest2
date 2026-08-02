package C9;

import D9.j;
import h9.EnumC6876a;
import h9.h;
import h9.m;
import h9.o;
import h9.q;
import h9.r;
import h9.s;
import java.util.ArrayList;
import java.util.EnumMap;
import o9.C8660b;
import o9.C8663e;

/* loaded from: classes9.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    private static final q[] f4503a = new q[0];

    private static int b(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return 0;
        }
        return (int) Math.abs(sVar.b() - sVar2.b());
    }

    private static int c(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(sVar.b() - sVar2.b());
    }

    @Override // h9.o
    public final q a(h9.c cVar, EnumMap enumMap) throws m, h, h9.d {
        q qVar;
        ArrayList arrayList = new ArrayList();
        F9.b a11 = F9.a.a(cVar);
        for (s[] sVarArr : a11.b()) {
            C8660b a12 = a11.a();
            s sVar = sVarArr[4];
            C8663e b11 = j.b(a12, sVar, sVarArr[5], sVarArr[6], sVarArr[7], Math.min(Math.min(c(sVarArr[0], sVar), (c(sVarArr[6], sVarArr[2]) * 17) / 18), Math.min(c(sVarArr[1], sVarArr[5]), (c(sVarArr[7], sVarArr[3]) * 17) / 18)), Math.max(Math.max(b(sVarArr[0], sVarArr[4]), (b(sVarArr[6], sVarArr[2]) * 17) / 18), Math.max(b(sVarArr[1], sVarArr[5]), (b(sVarArr[7], sVarArr[3]) * 17) / 18)));
            q qVar2 = new q(b11.g(), b11.d(), sVarArr, EnumC6876a.PDF_417);
            qVar2.h(r.ERROR_CORRECTION_LEVEL, b11.b());
            c cVar2 = (c) b11.c();
            if (cVar2 != null) {
                qVar2.h(r.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(qVar2);
        }
        q[] qVarArr = (q[]) arrayList.toArray(f4503a);
        if (qVarArr.length == 0 || (qVar = qVarArr[0]) == null) {
            throw m.a();
        }
        return qVar;
    }

    @Override // h9.o
    public final void reset() {
    }
}
