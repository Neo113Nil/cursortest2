package e1;

import A.k;
import b1.AbstractC0030s;
import b1.C0023k;
import b1.G;
import b1.H;
import d1.q;
import d1.r;
import g1.t;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final M0.i f978a;

    /* renamed from: b, reason: collision with root package name */
    public final int f979b;

    /* renamed from: c, reason: collision with root package name */
    public final int f980c;

    /* renamed from: d, reason: collision with root package name */
    public final k f981d;

    /* renamed from: e, reason: collision with root package name */
    public final k f982e;

    public b(k kVar, M0.i iVar, int i2, int i3) {
        this.f978a = iVar;
        this.f979b = i2;
        this.f980c = i3;
        this.f981d = kVar;
        this.f982e = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r rVar, M0.d dVar) {
        a aVar;
        int i2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i3 = aVar.f977g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f977g = i3 - Integer.MIN_VALUE;
                Object obj = aVar.f975e;
                N0.a aVar2 = N0.a.f260a;
                i2 = aVar.f977g;
                K0.i iVar = K0.i.f206a;
                if (i2 != 0) {
                    V.a.C(obj);
                    aVar.f974d = rVar;
                    aVar.f977g = 1;
                    Object invoke = this.f981d.invoke(rVar, aVar);
                    if (invoke != aVar2) {
                        invoke = iVar;
                    }
                    if (invoke == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = aVar.f974d;
                    V.a.C(obj);
                }
                if (((q) rVar).f948d.p()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return iVar;
            }
        }
        aVar = new a(this, (O0.b) dVar);
        Object obj2 = aVar.f975e;
        N0.a aVar22 = N0.a.f260a;
        i2 = aVar.f977g;
        K0.i iVar2 = K0.i.f206a;
        if (i2 != 0) {
        }
        if (((q) rVar).f948d.p()) {
        }
    }

    @Override // e1.c
    public Object b(d dVar, M0.d dVar2) {
        Object c0023k;
        Object B2;
        G g2;
        f1.c cVar = new f1.c(dVar, this, null);
        M0.i iVar = ((O0.b) dVar2).f277b;
        j.b(iVar);
        t tVar = new t(iVar, (O0.g) dVar2);
        try {
            p.a(2, cVar);
            c0023k = cVar.invoke(tVar, tVar);
        } catch (Throwable th) {
            c0023k = new C0023k(th, false);
        }
        N0.a aVar = N0.a.f260a;
        if (c0023k == aVar || (B2 = tVar.B(c0023k)) == AbstractC0030s.f683d) {
            B2 = aVar;
        } else {
            if (B2 instanceof C0023k) {
                throw ((C0023k) B2).f668a;
            }
            H h2 = B2 instanceof H ? (H) B2 : null;
            if (h2 != null && (g2 = h2.f628a) != null) {
                B2 = g2;
            }
        }
        return B2 == aVar ? B2 : K0.i.f206a;
    }

    public final String c() {
        ArrayList arrayList = new ArrayList(4);
        M0.j jVar = M0.j.f226a;
        M0.i iVar = this.f978a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f979b;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f980c;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + L0.d.T(arrayList, ", ", null, null, null, 62) + ']';
    }

    public final String toString() {
        return "block[" + this.f981d + "] -> " + c();
    }
}
