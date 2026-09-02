package x;

import U0.l;

/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6769a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6770b;

    /* renamed from: c, reason: collision with root package name */
    public final C0856a f6771c;

    public h(Object value, int i2, C0856a c0856a) {
        kotlin.jvm.internal.j.e(value, "value");
        C0.g.i(i2, "verificationMode");
        this.f6769a = value;
        this.f6770b = i2;
        this.f6771c = c0856a;
    }

    @Override // x.g
    public final Object a() {
        return this.f6769a;
    }

    @Override // x.g
    public final g d(String str, l lVar) {
        Object obj = this.f6769a;
        return ((Boolean) lVar.invoke(obj)).booleanValue() ? this : new f(obj, str, this.f6771c, this.f6770b);
    }
}
