package P;

/* renamed from: P.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280a {

    /* renamed from: a, reason: collision with root package name */
    public int f4439a;

    public C0280a(int i) {
        this.f4439a = i;
    }

    public final boolean a() {
        return this.f4439a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return L1.a.o(sb, this.f4439a, " }");
    }
}
