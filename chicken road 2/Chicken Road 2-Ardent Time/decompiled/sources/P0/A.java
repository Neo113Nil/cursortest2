package P0;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1311a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1312b;

    public A(java.lang.String str, boolean z2) {
        this.f1312b = str;
        this.f1311a = z2;
    }

    public void a(boolean z2) {
        if (this.f1311a) {
            throw new java.lang.IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f1311a = true;
        K.a aVar = (K.a) this.f1312b;
        int i2 = aVar.f939b - 1;
        aVar.f939b = i2;
        boolean z3 = z2 | aVar.f940c;
        aVar.f940c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        ((I0.b) aVar.f942e).I((android.view.KeyEvent) aVar.f941d);
    }

    public A(K.a aVar) {
        this.f1312b = aVar;
        this.f1311a = false;
    }
}
