package s4;

import e1.k;
import i4.C1265b;
import n4.AbstractC1472f;
import n4.C1473g;
import v4.l;

/* renamed from: s4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1596d implements InterfaceC1597e {

    /* renamed from: a, reason: collision with root package name */
    public final int f16158a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1472f f16159b;

    /* renamed from: c, reason: collision with root package name */
    public final C1265b f16160c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16161d;

    public C1596d(int i7, AbstractC1472f abstractC1472f, C1265b c1265b, String str) {
        this.f16158a = i7;
        this.f16159b = abstractC1472f;
        this.f16160c = c1265b;
        this.f16161d = str;
    }

    @Override // s4.InterfaceC1597e
    public final void a() {
        this.f16159b.d(this);
    }

    @Override // s4.InterfaceC1597e
    public final String toString() {
        C1265b c1265b = this.f16160c;
        l lVar = c1265b.f13985a;
        int i7 = this.f16158a;
        if (i7 == 5) {
            StringBuilder sb = new StringBuilder();
            C1473g c1473g = (C1473g) c1265b.f13986b.f1725d;
            if (i7 != 5) {
                c1473g = c1473g.C();
            }
            sb.append(c1473g);
            sb.append(": ");
            sb.append(k.r(i7));
            sb.append(": ");
            sb.append(lVar.f17186a.u(true));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        C1473g c1473g2 = (C1473g) c1265b.f13986b.f1725d;
        if (i7 != 5) {
            c1473g2 = c1473g2.C();
        }
        sb2.append(c1473g2);
        sb2.append(": ");
        sb2.append(k.r(i7));
        sb2.append(": { ");
        sb2.append(c1265b.f13986b.q());
        sb2.append(": ");
        sb2.append(lVar.f17186a.u(true));
        sb2.append(" }");
        return sb2.toString();
    }
}
