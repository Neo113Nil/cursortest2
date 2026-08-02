package P0;

import K0.C0203h;
import a.AbstractC0444a;
import n.AbstractC2107A;

/* renamed from: P0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0203h f4621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4622b;

    public C0331a(C0203h c0203h, int i) {
        this.f4621a = c0203h;
        this.f4622b = i;
    }

    @Override // P0.g
    public final void a(h hVar) {
        int i = hVar.f4653n;
        boolean z3 = i != -1;
        C0203h c0203h = this.f4621a;
        if (z3) {
            hVar.f(i, hVar.f4654o, c0203h.f2829l);
        } else {
            hVar.f(hVar.f4651l, hVar.f4652m, c0203h.f2829l);
        }
        int i5 = hVar.f4651l;
        int i6 = hVar.f4652m;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.f4622b;
        int t5 = AbstractC0444a.t(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c0203h.f2829l.length(), 0, ((M0.e) hVar.f4655p).c());
        hVar.h(t5, t5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0331a)) {
            return false;
        }
        C0331a c0331a = (C0331a) obj;
        return kotlin.jvm.internal.l.a(this.f4621a.f2829l, c0331a.f4621a.f2829l) && this.f4622b == c0331a.f4622b;
    }

    public final int hashCode() {
        return (this.f4621a.f2829l.hashCode() * 31) + this.f4622b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f4621a.f2829l);
        sb.append("', newCursorPosition=");
        return AbstractC2107A.t(sb, this.f4622b, ')');
    }

    public C0331a(String str, int i) {
        this(new C0203h(str), i);
    }
}
