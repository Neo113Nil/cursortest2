package P0;

import K0.C0203h;
import a.AbstractC0444a;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class u implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0203h f4675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4676b;

    public u(String str, int i) {
        this.f4675a = new C0203h(str);
        this.f4676b = i;
    }

    @Override // P0.g
    public final void a(h hVar) {
        int i = hVar.f4653n;
        boolean z3 = i != -1;
        C0203h c0203h = this.f4675a;
        if (z3) {
            hVar.f(i, hVar.f4654o, c0203h.f2829l);
            String str = c0203h.f2829l;
            if (str.length() > 0) {
                hVar.g(i, str.length() + i);
            }
        } else {
            int i5 = hVar.f4651l;
            hVar.f(i5, hVar.f4652m, c0203h.f2829l);
            String str2 = c0203h.f2829l;
            if (str2.length() > 0) {
                hVar.g(i5, str2.length() + i5);
            }
        }
        int i6 = hVar.f4651l;
        int i7 = hVar.f4652m;
        int i8 = i6 == i7 ? i7 : -1;
        int i9 = this.f4676b;
        int t5 = AbstractC0444a.t(i9 > 0 ? (i8 + i9) - 1 : (i8 + i9) - c0203h.f2829l.length(), 0, ((M0.e) hVar.f4655p).c());
        hVar.h(t5, t5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.l.a(this.f4675a.f2829l, uVar.f4675a.f2829l) && this.f4676b == uVar.f4676b;
    }

    public final int hashCode() {
        return (this.f4675a.f2829l.hashCode() * 31) + this.f4676b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f4675a.f2829l);
        sb.append("', newCursorPosition=");
        return AbstractC2107A.t(sb, this.f4676b, ')');
    }
}
