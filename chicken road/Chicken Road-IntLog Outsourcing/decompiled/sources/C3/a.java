package C3;

import B.d;
import B0.t;
import G0.C0051a;
import M0.e;
import T4.l;
import T4.q;
import T4.s;
import T4.u;
import X4.o;
import X4.r;
import a3.AbstractC0186e;
import a3.C0182a;
import a3.InterfaceC0187f;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import kotlin.jvm.internal.i;
import x3.c;
import y3.AbstractC1571e;
import z3.InterfaceC1577b;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f386a;

    public /* synthetic */ a(c cVar) {
        this.f386a = cVar;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C0182a c0182a;
        int i2 = 1;
        int i3 = 0;
        AbstractC1571e abstractC1571e = (AbstractC1571e) obj;
        int intValue = ((Integer) obj2).intValue();
        c cVar = this.f386a;
        if (cVar.f12312b.get()) {
            return J3.c.f1362f;
        }
        t tVar = new t(((InterfaceC1577b) cVar.f12315e.f3212b).a(intValue));
        J3.c cVar2 = new J3.c();
        int a6 = abstractC1571e.a();
        x3.b bVar = new x3.b(cVar, cVar2, tVar, i3);
        x3.b bVar2 = new x3.b(cVar, cVar2, tVar, i2);
        B2.a aVar = (B2.a) cVar.f12314d;
        aVar.getClass();
        d dVar = new d();
        q url = (q) aVar.f241c;
        i.e(url, "url");
        dVar.f107c = url;
        ((Map) ((com.onesignal.otel.config.a) aVar.f242d).get()).forEach(new D3.a(i3, dVar));
        dVar.j("POST", new D3.d(abstractC1571e, a6, (s) aVar.f243e));
        C0182a a7 = C0182a.a();
        C0051a c0051a = V2.d.f3235a;
        Boolean bool = Boolean.TRUE;
        int i6 = 0;
        while (true) {
            Object[] objArr = a7.f3859a;
            if (i6 >= objArr.length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = c0051a;
                copyOf[copyOf.length - 1] = bool;
                c0182a = new C0182a(copyOf);
                break;
            }
            if (objArr[i6] == c0051a) {
                int i7 = i6 + 1;
                if (objArr[i7] != bool) {
                    Object[] objArr2 = (Object[]) objArr.clone();
                    objArr2[i7] = bool;
                    c0182a = new C0182a(objArr2);
                }
            } else {
                i6 += 2;
            }
        }
        a7 = c0182a;
        InterfaceC0187f b6 = AbstractC0186e.f3863b.b(a7);
        try {
            e eVar = new e(dVar);
            u uVar = (u) aVar.f240b;
            uVar.getClass();
            r rVar = new r(uVar, eVar);
            B0.e eVar2 = new B0.e(bVar2, i2, bVar);
            if (!rVar.f3593e.compareAndSet(false, true)) {
                throw new IllegalStateException("Already Executed");
            }
            d5.e eVar3 = d5.e.f5492a;
            rVar.f3594f = d5.e.f5492a.h();
            l lVar = uVar.f2960a;
            o oVar = new o(rVar, eVar2);
            lVar.getClass();
            l.d(lVar, oVar, null, null, 6);
            b6.close();
            return cVar2;
        } catch (Throwable th) {
            try {
                b6.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
