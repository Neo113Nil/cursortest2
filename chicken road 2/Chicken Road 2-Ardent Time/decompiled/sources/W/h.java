package W;

/* loaded from: classes.dex */
public final class h extends W.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f1818a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1819b;

    /* renamed from: c, reason: collision with root package name */
    public final W.a f1820c;

    public h(java.lang.Object value, int i2, W.a aVar) {
        kotlin.jvm.internal.i.e(value, "value");
        B1.a.l(i2, "verificationMode");
        this.f1818a = value;
        this.f1819b = i2;
        this.f1820c = aVar;
    }

    @Override // W.g
    public final java.lang.Object a() {
        return this.f1818a;
    }

    @Override // W.g
    public final W.g d(java.lang.String str, s1.l lVar) {
        java.lang.Object obj = this.f1818a;
        return ((java.lang.Boolean) lVar.invoke(obj)).booleanValue() ? this : new W.f(obj, str, this.f1820c, this.f1819b);
    }
}
