package A1;

/* loaded from: classes.dex */
public final class L implements C0 {

    /* renamed from: a, reason: collision with root package name */
    public L f112a;

    /* renamed from: b, reason: collision with root package name */
    public L f113b;

    public final void a(long j, float[] fArr) {
        L l7 = this.f113b;
        if (l7 != null) {
            l7.a(j, fArr);
        }
    }

    public final void b() {
        L l7 = this.f113b;
        if (l7 != null) {
            l7.b();
        }
    }

    @Override // A1.C0
    public final void c(int i7, Object obj) {
        if (i7 == 7) {
            this.f112a = (L) obj;
        } else if (i7 == 8) {
            this.f113b = (L) obj;
        } else if (i7 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void d(long j, long j3) {
        L l7 = this.f112a;
        if (l7 != null) {
            l7.d(j, j3);
        }
    }
}
