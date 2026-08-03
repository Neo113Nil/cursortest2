package y;

/* loaded from: classes.dex */
public class M extends y.L {

    /* renamed from: n, reason: collision with root package name */
    public r.c f8442n;

    /* renamed from: o, reason: collision with root package name */
    public r.c f8443o;

    /* renamed from: p, reason: collision with root package name */
    public r.c f8444p;

    public M(y.Q q2, android.view.WindowInsets windowInsets) {
        super(q2, windowInsets);
        this.f8442n = null;
        this.f8443o = null;
        this.f8444p = null;
    }

    @Override // y.O
    public r.c f() {
        android.graphics.Insets mandatorySystemGestureInsets;
        if (this.f8443o == null) {
            mandatorySystemGestureInsets = this.f8436c.getMandatorySystemGestureInsets();
            this.f8443o = r.c.b(mandatorySystemGestureInsets);
        }
        return this.f8443o;
    }

    @Override // y.O
    public r.c h() {
        android.graphics.Insets systemGestureInsets;
        if (this.f8442n == null) {
            systemGestureInsets = this.f8436c.getSystemGestureInsets();
            this.f8442n = r.c.b(systemGestureInsets);
        }
        return this.f8442n;
    }

    @Override // y.O
    public r.c j() {
        android.graphics.Insets tappableElementInsets;
        if (this.f8444p == null) {
            tappableElementInsets = this.f8436c.getTappableElementInsets();
            this.f8444p = r.c.b(tappableElementInsets);
        }
        return this.f8444p;
    }

    @Override // y.K, y.O
    public void p(r.c cVar) {
    }
}
