package K;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f938a;

    /* renamed from: b, reason: collision with root package name */
    public int f939b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f940c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f941d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f942e;

    public /* synthetic */ a() {
        this.f938a = 2;
    }

    public K.a a() {
        if (((o0.h) this.f941d) != null) {
            return new K.a(this, (m0.d[]) this.f942e, this.f940c, this.f939b);
        }
        throw new java.lang.IllegalArgumentException("execute parameter required");
    }

    public java.lang.String toString() {
        switch (this.f938a) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
                if (this.f939b >= 0) {
                    sb.append(" #");
                    sb.append(this.f939b);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a(K.a aVar, m0.d[] dVarArr, boolean z2, int i2) {
        this.f938a = 3;
        this.f942e = aVar;
        this.f941d = dVarArr;
        boolean z3 = false;
        if (dVarArr != null && z2) {
            z3 = true;
        }
        this.f940c = z3;
        this.f939b = i2;
    }

    public a(I0.b bVar) {
        this.f938a = 0;
        bVar.getClass();
        this.f941d = new java.util.ArrayList();
        this.f939b = -1;
        this.f942e = bVar;
    }

    public a(I0.b bVar, android.view.KeyEvent keyEvent) {
        this.f938a = 1;
        this.f942e = bVar;
        this.f939b = ((P0.B[]) bVar.f657b).length;
        this.f940c = false;
        this.f941d = keyEvent;
    }
}
