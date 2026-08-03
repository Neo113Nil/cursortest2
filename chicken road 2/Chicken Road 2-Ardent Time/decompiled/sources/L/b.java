package L;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f972a;

    public b() {
        this.f972a = new java.util.LinkedHashMap();
    }

    public static L.b a(P.v vVar, int i2) {
        if (i2 == 0) {
            return new P.C0042o(vVar, 0);
        }
        if (i2 == 1) {
            return new P.C0042o(vVar, 1);
        }
        throw new java.lang.IllegalArgumentException("invalid orientation");
    }

    public abstract int b(android.view.View view);

    public abstract int c(android.view.View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public b(P.v vVar) {
        new android.graphics.Rect();
        this.f972a = vVar;
    }
}
