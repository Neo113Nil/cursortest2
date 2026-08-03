package Z0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1909c;

    public /* synthetic */ j(int i2, java.lang.Object obj, java.lang.Object obj2) {
        this.f1907a = i2;
        this.f1909c = obj;
        this.f1908b = obj2;
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        switch (this.f1907a) {
            case 0:
                android.util.Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((R0.g) this.f1908b).a(((a1.l) ((I0.b) ((x0.e) this.f1909c).f8410c).f659d).f(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((R0.g) this.f1908b).a(null);
    }

    public final void c(java.lang.Object obj) {
        switch (this.f1907a) {
            case 0:
                ((Z0.k) this.f1909c).f1911b = (byte[]) this.f1908b;
                break;
            default:
                ((R0.g) this.f1908b).a(((a1.l) ((I0.b) ((x0.e) this.f1909c).f8410c).f659d).a(obj));
                break;
        }
    }
}
