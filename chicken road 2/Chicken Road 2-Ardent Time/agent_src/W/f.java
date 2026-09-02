package W;

/* loaded from: classes.dex */
public final class f extends W.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f1814a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1815b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1816c;

    /* renamed from: d, reason: collision with root package name */
    public final W.j f1817d;

    public f(java.lang.Object value, java.lang.String str, W.a aVar, int i2) {
        java.util.Collection collection;
        kotlin.jvm.internal.i.e(value, "value");
        B1.a.l(i2, "verificationMode");
        this.f1814a = value;
        this.f1815b = str;
        this.f1816c = i2;
        java.lang.String message = W.g.b(value, str);
        kotlin.jvm.internal.i.e(message, "message");
        W.j jVar = new W.j(message);
        java.lang.StackTraceElement[] stackTrace = jVar.getStackTrace();
        kotlin.jvm.internal.i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.g(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collection = i1.C0199r.f3325a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = i1.AbstractC0189h.S(stackTrace);
            } else if (length == 1) {
                collection = u0.AbstractC0995a.q(stackTrace[length2 - 1]);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    arrayList.add(stackTrace[i3]);
                }
                collection = arrayList;
            }
        }
        jVar.setStackTrace((java.lang.StackTraceElement[]) collection.toArray(new java.lang.StackTraceElement[0]));
        this.f1817d = jVar;
    }

    @Override // W.g
    public final java.lang.Object a() {
        int b2 = H.j.b(this.f1816c);
        if (b2 == 0) {
            throw this.f1817d;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                return null;
            }
            throw new E1.A();
        }
        java.lang.String message = W.g.b(this.f1814a, this.f1815b);
        kotlin.jvm.internal.i.e(message, "message");
        android.util.Log.d("f", message);
        return null;
    }

    @Override // W.g
    public final W.g d(java.lang.String str, s1.l lVar) {
        return this;
    }
}
