package x3;

import B0.o;
import B0.t;
import L3.k;
import L3.n;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.logging.Level;
import n2.AbstractC1341c;
import v3.C1497a;
import z3.AbstractC1576a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f12307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J3.c f12308c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f12309d;

    public /* synthetic */ b(c cVar, J3.c cVar2, t tVar, int i2) {
        this.f12306a = i2;
        this.f12307b = cVar;
        this.f12308c = cVar2;
        this.f12309d = tVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte[] bArr;
        String str;
        String r5;
        switch (this.f12306a) {
            case 0:
                D3.c cVar = (D3.c) obj;
                c cVar2 = this.f12307b;
                n nVar = cVar2.f12311a;
                int i2 = cVar.f441b.f3018d;
                Long valueOf = Long.valueOf(i2);
                t tVar = this.f12309d;
                tVar.f208c = valueOf;
                J3.c cVar3 = this.f12308c;
                AbstractC1576a abstractC1576a = (AbstractC1576a) tVar.f207b;
                if (i2 >= 200 && i2 < 300) {
                    Q2.a d6 = Q2.c.d(k.f1509f, valueOf);
                    if (abstractC1576a.f12464a) {
                        throw new IllegalStateException("Recording already ended");
                    }
                    abstractC1576a.f12464a = true;
                    abstractC1576a.a(d6, null);
                    cVar3.e();
                    return;
                }
                String valueOf2 = String.valueOf(i2);
                Long l2 = (Long) tVar.f208c;
                Q2.a d7 = l2 != null ? Q2.c.d(k.f1509f, l2) : Q2.a.f2475d;
                if (abstractC1576a.f12464a) {
                    throw new IllegalStateException("Recording already ended");
                }
                abstractC1576a.f12464a = true;
                if (valueOf2 == null || valueOf2.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                abstractC1576a.a(d7, valueOf2);
                try {
                    if (cVar.f440a == null) {
                        cVar.f440a = cVar.f442c.a();
                    }
                    bArr = cVar.f440a;
                } catch (IOException e3) {
                    nVar.a(Level.FINE, "Unable to obtain response body", e3);
                    bArr = null;
                }
                String str2 = cVar.f441b.f3017c;
                if (bArr != null) {
                    try {
                        r5 = AbstractC1341c.r(bArr);
                    } catch (IOException unused) {
                        str = "Unable to parse response body, HTTP status message: ";
                    }
                    nVar.a(Level.WARNING, "Failed to export " + cVar2.f12313c + "s. Server responded with HTTP status code " + i2 + ". Error message: " + r5, null);
                    cVar3.a(new C1497a(null));
                    return;
                }
                str = "Response body missing, HTTP status message: ";
                r5 = o.i(str, str2);
                nVar.a(Level.WARNING, "Failed to export " + cVar2.f12313c + "s. Server responded with HTTP status code " + i2 + ". Error message: " + r5, null);
                cVar3.a(new C1497a(null));
                return;
            default:
                Throwable th = (Throwable) obj;
                c cVar4 = this.f12307b;
                t tVar2 = this.f12309d;
                String name = th.getClass().getName();
                Long l6 = (Long) tVar2.f208c;
                Q2.a d8 = l6 != null ? Q2.c.d(k.f1509f, l6) : Q2.a.f2475d;
                AbstractC1576a abstractC1576a2 = (AbstractC1576a) tVar2.f207b;
                if (abstractC1576a2.f12464a) {
                    throw new IllegalStateException("Recording already ended");
                }
                abstractC1576a2.f12464a = true;
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("The export failed but no failure reason was provided");
                }
                abstractC1576a2.a(d8, name);
                cVar4.f12311a.a(Level.SEVERE, "Failed to export " + cVar4.f12313c + "s. The request could not be executed. Full error message: " + th.getMessage(), th);
                this.f12308c.a(new C1497a(th));
                return;
        }
    }
}
