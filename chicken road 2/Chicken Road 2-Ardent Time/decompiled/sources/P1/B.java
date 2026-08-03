package P1;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final int f1434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1435b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f1436c;

    public B(int i2, java.lang.String str, double d2, double d3, double d4, double d5, int i3, int i4, java.nio.ByteBuffer byteBuffer) {
        this.f1434a = i2;
        this.f1436c = str;
        this.f1435b = i3;
    }

    public void a() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new F0.a(11, this));
    }

    public void b(android.graphics.Typeface typeface) {
        int i2;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f1436c;
        h.C0160s c0160s = (h.C0160s) weakReference.get();
        if (c0160s == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28 && (i2 = this.f1434a) != -1) {
            typeface = android.graphics.Typeface.create(typeface, i2, (this.f1435b & 2) != 0);
        }
        c0160s.f3247a.post(new D0.f(weakReference, typeface, 5, false));
    }

    public B() {
        this.f1436c = new P1.B[256];
        this.f1434a = 0;
        this.f1435b = 0;
    }

    public B(int i2, int i3) {
        this.f1436c = null;
        this.f1434a = i2;
        int i4 = i3 & 7;
        this.f1435b = i4 == 0 ? 8 : i4;
    }

    public B(h.C0160s c0160s, int i2, int i3) {
        this.f1436c = new java.lang.ref.WeakReference(c0160s);
        this.f1434a = i2;
        this.f1435b = i3;
    }
}
