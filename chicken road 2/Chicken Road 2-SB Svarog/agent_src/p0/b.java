package p0;

import a.AbstractC0018a;
import g0.n;
import java.util.ArrayList;
import m0.AbstractC0062t;
import m0.C0054k;
import m0.H;
import m0.I;
import o0.q;
import o0.r;
import r0.u;
import w.j;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final Y.i f1107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1109d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1110e;

    /* renamed from: f, reason: collision with root package name */
    public final j f1111f;

    public b(j jVar, Y.i iVar, int i2, int i3) {
        this.f1107b = iVar;
        this.f1108c = i2;
        this.f1109d = i3;
        this.f1110e = jVar;
        this.f1111f = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r rVar, Y.d dVar) {
        a aVar;
        int i2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i3 = aVar.f1106h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f1106h = i3 - Integer.MIN_VALUE;
                Object obj = aVar.f1104f;
                i2 = aVar.f1106h;
                W.g gVar = W.g.f394a;
                if (i2 != 0) {
                    AbstractC0018a.C(obj);
                    aVar.f1103e = rVar;
                    aVar.f1106h = 1;
                    Object g2 = this.f1110e.g(rVar, aVar);
                    Z.a aVar2 = Z.a.f411b;
                    if (g2 != aVar2) {
                        g2 = gVar;
                    }
                    if (g2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = aVar.f1103e;
                    AbstractC0018a.C(obj);
                }
                if (((q) rVar).f1096e.p()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return gVar;
            }
        }
        aVar = new a(this, (a0.b) dVar);
        Object obj2 = aVar.f1104f;
        i2 = aVar.f1106h;
        W.g gVar2 = W.g.f394a;
        if (i2 != 0) {
        }
        if (((q) rVar).f1096e.p()) {
        }
    }

    @Override // p0.c
    public Object b(d dVar, Y.d dVar2) {
        Object c0054k;
        Object C2;
        H h2;
        q0.c cVar = new q0.c(dVar, this, null);
        Y.i iVar = ((a0.b) dVar2).f419c;
        g0.h.b(iVar);
        u uVar = new u(iVar, (a0.f) dVar2);
        try {
            n.a(2, cVar);
            c0054k = cVar.g(uVar, uVar);
        } catch (Throwable th) {
            c0054k = new C0054k(th, false);
        }
        Z.a aVar = Z.a.f411b;
        if (c0054k == aVar || (C2 = uVar.C(c0054k)) == AbstractC0062t.f947d) {
            C2 = aVar;
        } else {
            if (C2 instanceof C0054k) {
                throw ((C0054k) C2).f934a;
            }
            I i2 = C2 instanceof I ? (I) C2 : null;
            if (i2 != null && (h2 = i2.f894a) != null) {
                C2 = h2;
            }
        }
        return C2 == aVar ? C2 : W.g.f394a;
    }

    public final String c() {
        ArrayList arrayList = new ArrayList(4);
        Y.j jVar = Y.j.f410b;
        Y.i iVar = this.f1107b;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f1108c;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f1109d;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + X.e.H(arrayList, null, null, null, 62) + ']';
    }

    public final String toString() {
        return "block[" + this.f1110e + "] -> " + c();
    }
}
