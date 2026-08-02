package V0;

import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f5953c = new q(AbstractC2036a.H(0), AbstractC2036a.H(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f5954a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5955b;

    public q(long j5, long j6) {
        this.f5954a = j5;
        this.f5955b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return W0.o.a(this.f5954a, qVar.f5954a) && W0.o.a(this.f5955b, qVar.f5955b);
    }

    public final int hashCode() {
        return W0.o.d(this.f5955b) + (W0.o.d(this.f5954a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) W0.o.e(this.f5954a)) + ", restLine=" + ((Object) W0.o.e(this.f5955b)) + ')';
    }
}
