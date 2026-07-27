package D;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class P extends O {

    /* renamed from: n, reason: collision with root package name */
    public w.c f217n;

    /* renamed from: o, reason: collision with root package name */
    public w.c f218o;

    /* renamed from: p, reason: collision with root package name */
    public w.c f219p;

    public P(V v3, WindowInsets windowInsets) {
        super(v3, windowInsets);
        this.f217n = null;
        this.f218o = null;
        this.f219p = null;
    }

    @Override // D.T
    public w.c f() {
        Insets mandatorySystemGestureInsets;
        if (this.f218o == null) {
            mandatorySystemGestureInsets = this.f212c.getMandatorySystemGestureInsets();
            this.f218o = w.c.b(mandatorySystemGestureInsets);
        }
        return this.f218o;
    }

    @Override // D.T
    public w.c h() {
        Insets systemGestureInsets;
        if (this.f217n == null) {
            systemGestureInsets = this.f212c.getSystemGestureInsets();
            this.f217n = w.c.b(systemGestureInsets);
        }
        return this.f217n;
    }

    @Override // D.T
    public w.c j() {
        Insets tappableElementInsets;
        if (this.f219p == null) {
            tappableElementInsets = this.f212c.getTappableElementInsets();
            this.f219p = w.c.b(tappableElementInsets);
        }
        return this.f219p;
    }

    @Override // D.N, D.T
    public void p(w.c cVar) {
    }
}
