package F4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends B4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1595e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1596g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj, Object obj2, String str) {
        super(str, true);
        this.f1595e = i;
        this.f = obj;
        this.f1596g = obj2;
    }

    @Override // B4.a
    public final long a() {
        long a5;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f1595e) {
            case 0:
                o oVar = (o) this.f;
                oVar.f1619k.a(oVar, (B) ((kotlin.jvm.internal.w) this.f1596g).f17624k);
                return -1L;
            case 1:
                try {
                    ((o) this.f).f1619k.b((w) this.f1596g);
                } catch (IOException e3) {
                    G4.n nVar = G4.n.f2016a;
                    G4.n nVar2 = G4.n.f2016a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f).f1621m;
                    nVar2.getClass();
                    G4.n.i(4, str, e3);
                    try {
                        ((w) this.f1596g).c(2, e3);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                k kVar = (k) this.f;
                B b3 = (B) this.f1596g;
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                o oVar2 = (o) kVar.f1602m;
                synchronized (oVar2.f1616G) {
                    synchronized (oVar2) {
                        try {
                            B b5 = oVar2.f1610A;
                            B b6 = new B();
                            b6.b(b5);
                            b6.b(b3);
                            wVar.f17624k = b6;
                            a5 = b6.a() - b5.a();
                            if (a5 != 0 && !oVar2.f1620l.isEmpty()) {
                                wVarArr = (w[]) oVar2.f1620l.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                B b7 = (B) wVar.f17624k;
                                kotlin.jvm.internal.l.f("<set-?>", b7);
                                oVar2.f1610A = b7;
                                oVar2.f1628t.c(new i(i, oVar2, wVar, oVar2.f1621m + " onSettings"), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            B b72 = (B) wVar.f17624k;
                            kotlin.jvm.internal.l.f("<set-?>", b72);
                            oVar2.f1610A = b72;
                            oVar2.f1628t.c(new i(i, oVar2, wVar, oVar2.f1621m + " onSettings"), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f1616G.b((B) wVar.f17624k);
                    } catch (IOException e5) {
                        oVar2.b(2, 2, e5);
                    }
                }
                if (wVarArr2 != null) {
                    int length = wVarArr2.length;
                    while (i < length) {
                        w wVar2 = wVarArr2[i];
                        synchronized (wVar2) {
                            wVar2.f += a5;
                            if (a5 > 0) {
                                wVar2.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
