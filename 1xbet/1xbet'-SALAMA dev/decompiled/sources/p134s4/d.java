package p134s4;

import p031e1.k;
import p063i4.b;
import p098n4.AbstractC0933f;
import p098n4.C0934g;
import v4.l;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0933f f16165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f16166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16167d;

    public d(int i7, AbstractC0933f abstractC0933f, b bVar, String str) {
        this.f16164a = i7;
        this.f16165b = abstractC0933f;
        this.f16166c = bVar;
        this.f16167d = str;
    }

    @Override // p134s4.e
    public final void a() {
        this.f16165b.d(this);
    }

    @Override // p134s4.e
    public final String toString() {
        b bVar = this.f16166c;
        l lVar = bVar.f13991a;
        int i7 = this.f16164a;
        if (i7 == 5) {
            StringBuilder sb = new StringBuilder();
            C0934g c0934gC = (C0934g) bVar.f13992b.f1725d;
            if (i7 != 5) {
                c0934gC = c0934gC.C();
            }
            sb.append(c0934gC);
            sb.append(": ");
            sb.append(k.r(i7));
            sb.append(": ");
            sb.append(lVar.f17192a.u(true));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        C0934g c0934gC2 = (C0934g) bVar.f13992b.f1725d;
        if (i7 != 5) {
            c0934gC2 = c0934gC2.C();
        }
        sb2.append(c0934gC2);
        sb2.append(": ");
        sb2.append(k.r(i7));
        sb2.append(": { ");
        sb2.append(bVar.f13992b.q());
        sb2.append(": ");
        sb2.append(lVar.f17192a.u(true));
        sb2.append(" }");
        return sb2.toString();
    }
}
