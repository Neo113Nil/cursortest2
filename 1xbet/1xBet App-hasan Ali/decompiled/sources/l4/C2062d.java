package l4;

/* renamed from: l4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2062d extends C2060b {

    /* renamed from: n, reason: collision with root package name */
    public static final C2062d f17858n = new C2062d(1, 0, 1);

    @Override // l4.C2060b
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2062d)) {
            return false;
        }
        if (isEmpty() && ((C2062d) obj).isEmpty()) {
            return true;
        }
        C2062d c2062d = (C2062d) obj;
        if (this.f17851k == c2062d.f17851k) {
            return this.f17852l == c2062d.f17852l;
        }
        return false;
    }

    @Override // l4.C2060b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f17851k * 31) + this.f17852l;
    }

    @Override // l4.C2060b
    public final boolean isEmpty() {
        return this.f17851k > this.f17852l;
    }

    @Override // l4.C2060b
    public final String toString() {
        return this.f17851k + ".." + this.f17852l;
    }
}
