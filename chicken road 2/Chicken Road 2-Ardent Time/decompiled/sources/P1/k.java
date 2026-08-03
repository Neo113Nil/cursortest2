package P1;

/* loaded from: classes.dex */
public final class k extends L1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1492g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, int i2) {
        super(str, true);
        this.f1490e = i2;
        this.f1491f = obj;
        this.f1492g = obj2;
    }

    @Override // L1.a
    public final long a() {
        long a2;
        P1.z[] zVarArr;
        int i2 = 0;
        switch (this.f1490e) {
            case 0:
                P1.r rVar = (P1.r) this.f1491f;
                rVar.f1512a.a(rVar, (P1.E) ((kotlin.jvm.internal.p) this.f1492g).f7960a);
                return -1L;
            case 1:
                try {
                    ((P1.r) this.f1491f).f1512a.b((P1.z) this.f1492g);
                } catch (java.io.IOException e2) {
                    Q1.n nVar = Q1.n.f1644a;
                    Q1.n nVar2 = Q1.n.f1644a;
                    java.lang.String h2 = kotlin.jvm.internal.i.h(((P1.r) this.f1491f).f1514c, "Http2Connection.Listener failure for ");
                    nVar2.getClass();
                    Q1.n.i(h2, 4, e2);
                    try {
                        ((P1.z) this.f1492g).c(P1.EnumC0054b.PROTOCOL_ERROR, e2);
                    } catch (java.io.IOException unused) {
                    }
                }
                return -1L;
            default:
                P1.m mVar = (P1.m) this.f1491f;
                P1.E e3 = (P1.E) this.f1492g;
                mVar.getClass();
                kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
                P1.r rVar2 = mVar.f1497b;
                synchronized (rVar2.f1533w) {
                    synchronized (rVar2) {
                        try {
                            P1.E e4 = rVar2.f1528q;
                            P1.E e5 = new P1.E();
                            e5.b(e4);
                            e5.b(e3);
                            pVar.f7960a = e5;
                            a2 = e5.a() - e4.a();
                            if (a2 != 0 && !rVar2.f1513b.isEmpty()) {
                                java.lang.Object[] array = rVar2.f1513b.values().toArray(new P1.z[0]);
                                if (array == null) {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
                                zVarArr = (P1.z[]) array;
                                P1.E e6 = (P1.E) pVar.f7960a;
                                kotlin.jvm.internal.i.e(e6, "<set-?>");
                                rVar2.f1528q = e6;
                                rVar2.f1521j.c(new P1.k(kotlin.jvm.internal.i.h(" onSettings", rVar2.f1514c), rVar2, pVar, i2), 0L);
                            }
                            zVarArr = null;
                            P1.E e62 = (P1.E) pVar.f7960a;
                            kotlin.jvm.internal.i.e(e62, "<set-?>");
                            rVar2.f1528q = e62;
                            rVar2.f1521j.c(new P1.k(kotlin.jvm.internal.i.h(" onSettings", rVar2.f1514c), rVar2, pVar, i2), 0L);
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        rVar2.f1533w.a((P1.E) pVar.f7960a);
                    } catch (java.io.IOException e7) {
                        rVar2.b(e7);
                    }
                }
                if (zVarArr != null) {
                    int length = zVarArr.length;
                    while (i2 < length) {
                        P1.z zVar = zVarArr[i2];
                        i2++;
                        synchronized (zVar) {
                            zVar.f1570f += a2;
                            if (a2 > 0) {
                                zVar.notifyAll();
                            }
                        }
                    }
                }
                return -1L;
        }
    }
}
