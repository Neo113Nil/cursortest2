package O1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1165a;

    /* renamed from: b, reason: collision with root package name */
    public long f1166b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f1167c;

    public a(V1.q source) {
        this.f1165a = 0;
        kotlin.jvm.internal.i.e(source, "source");
        this.f1167c = source;
        this.f1166b = 262144L;
    }

    public int a(int i2) {
        O1.a aVar = (O1.a) this.f1167c;
        if (aVar == null) {
            return i2 >= 64 ? java.lang.Long.bitCount(this.f1166b) : java.lang.Long.bitCount(this.f1166b & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return java.lang.Long.bitCount(this.f1166b & ((1 << i2) - 1));
        }
        return java.lang.Long.bitCount(this.f1166b) + aVar.a(i2 - 64);
    }

    public boolean b(int i2) {
        if (i2 < 64) {
            return (this.f1166b & (1 << i2)) != 0;
        }
        if (((O1.a) this.f1167c) == null) {
            this.f1167c = new O1.a();
        }
        return ((O1.a) this.f1167c).b(i2 - 64);
    }

    public I1.m c() {
        I1.l lVar = new I1.l(0);
        while (true) {
            java.lang.String o2 = ((V1.q) this.f1167c).o(this.f1166b);
            this.f1166b -= o2.length();
            if (o2.length() == 0) {
                return lVar.b();
            }
            int Q2 = y1.g.Q(o2, ':', 1, false, 4);
            if (Q2 != -1) {
                java.lang.String substring = o2.substring(0, Q2);
                kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                java.lang.String substring2 = o2.substring(Q2 + 1);
                kotlin.jvm.internal.i.d(substring2, "this as java.lang.String).substring(startIndex)");
                lVar.a(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                java.lang.String substring3 = o2.substring(1);
                kotlin.jvm.internal.i.d(substring3, "this as java.lang.String).substring(startIndex)");
                lVar.a("", substring3);
            } else {
                lVar.a("", o2);
            }
        }
    }

    public void d() {
        this.f1166b = 0L;
        O1.a aVar = (O1.a) this.f1167c;
        if (aVar != null) {
            aVar.d();
        }
    }

    public java.lang.String toString() {
        switch (this.f1165a) {
            case 1:
                if (((O1.a) this.f1167c) == null) {
                    return java.lang.Long.toBinaryString(this.f1166b);
                }
                return ((O1.a) this.f1167c).toString() + "xx" + java.lang.Long.toBinaryString(this.f1166b);
            default:
                return super.toString();
        }
    }

    public a() {
        this.f1165a = 1;
        this.f1166b = 0L;
    }
}
