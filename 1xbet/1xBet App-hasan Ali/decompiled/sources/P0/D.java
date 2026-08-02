package P0;

import K0.C0203h;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final C0203h f4618a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4619b;

    public D(C0203h c0203h, q qVar) {
        this.f4618a = c0203h;
        this.f4619b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d5 = (D) obj;
        return kotlin.jvm.internal.l.a(this.f4618a, d5.f4618a) && kotlin.jvm.internal.l.a(this.f4619b, d5.f4619b);
    }

    public final int hashCode() {
        return this.f4619b.hashCode() + (this.f4618a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f4618a) + ", offsetMapping=" + this.f4619b + ')';
    }
}
