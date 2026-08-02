package F4;

import a3.AbstractC0467k;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends B4.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1597e;
    public final /* synthetic */ o f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1599h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, o oVar, int i, int i5, int i6) {
        super(str, true);
        this.f1597e = i6;
        this.f = oVar;
        this.f1598g = i;
        this.f1599h = i5;
    }

    @Override // B4.a
    public final long a() {
        switch (this.f1597e) {
            case 0:
                int i = this.f1598g;
                int i5 = this.f1599h;
                o oVar = this.f;
                oVar.getClass();
                try {
                    oVar.f1616G.k(i, i5, true);
                    return -1L;
                } catch (IOException e3) {
                    oVar.b(2, 2, e3);
                    return -1L;
                }
            case 1:
                A a5 = this.f.f1629u;
                int i6 = this.f1599h;
                a5.getClass();
                AbstractC0467k.A("errorCode", i6);
                synchronized (this.f) {
                    this.f.f1618I.remove(Integer.valueOf(this.f1598g));
                }
                return -1L;
            default:
                o oVar2 = this.f;
                try {
                    int i7 = this.f1598g;
                    int i8 = this.f1599h;
                    oVar2.getClass();
                    AbstractC0467k.A("statusCode", i8);
                    oVar2.f1616G.l(i7, i8);
                    return -1L;
                } catch (IOException e5) {
                    oVar2.b(2, 2, e5);
                    return -1L;
                }
        }
    }
}
