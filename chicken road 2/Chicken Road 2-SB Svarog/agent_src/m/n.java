package m;

import android.graphics.Insets;
import android.view.WindowInsets;
import i.C0040a;

/* loaded from: classes.dex */
public class n extends l {

    /* renamed from: n, reason: collision with root package name */
    public C0040a f875n;

    /* renamed from: o, reason: collision with root package name */
    public C0040a f876o;

    /* renamed from: p, reason: collision with root package name */
    public C0040a f877p;

    public n(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
        this.f875n = null;
        this.f876o = null;
        this.f877p = null;
    }

    @Override // m.p
    public C0040a f() {
        Insets mandatorySystemGestureInsets;
        if (this.f876o == null) {
            mandatorySystemGestureInsets = this.f869c.getMandatorySystemGestureInsets();
            this.f876o = C0040a.b(mandatorySystemGestureInsets);
        }
        return this.f876o;
    }

    @Override // m.p
    public C0040a h() {
        Insets systemGestureInsets;
        if (this.f875n == null) {
            systemGestureInsets = this.f869c.getSystemGestureInsets();
            this.f875n = C0040a.b(systemGestureInsets);
        }
        return this.f875n;
    }

    @Override // m.p
    public C0040a j() {
        Insets tappableElementInsets;
        if (this.f877p == null) {
            tappableElementInsets = this.f869c.getTappableElementInsets();
            this.f877p = C0040a.b(tappableElementInsets);
        }
        return this.f877p;
    }

    @Override // m.k, m.p
    public void p(C0040a c0040a) {
    }
}
