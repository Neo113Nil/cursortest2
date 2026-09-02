package n;

import android.graphics.Insets;
import android.view.WindowInsets;
import j.C0774a;

/* renamed from: n.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0800n extends C0798l {

    /* renamed from: n, reason: collision with root package name */
    public C0774a f6165n;

    /* renamed from: o, reason: collision with root package name */
    public C0774a f6166o;

    /* renamed from: p, reason: collision with root package name */
    public C0774a f6167p;

    public C0800n(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
        this.f6165n = null;
        this.f6166o = null;
        this.f6167p = null;
    }

    @Override // n.C0802p
    public C0774a f() {
        Insets mandatorySystemGestureInsets;
        if (this.f6166o == null) {
            mandatorySystemGestureInsets = this.f6159c.getMandatorySystemGestureInsets();
            this.f6166o = C0774a.b(mandatorySystemGestureInsets);
        }
        return this.f6166o;
    }

    @Override // n.C0802p
    public C0774a h() {
        Insets systemGestureInsets;
        if (this.f6165n == null) {
            systemGestureInsets = this.f6159c.getSystemGestureInsets();
            this.f6165n = C0774a.b(systemGestureInsets);
        }
        return this.f6165n;
    }

    @Override // n.C0802p
    public C0774a j() {
        Insets tappableElementInsets;
        if (this.f6167p == null) {
            tappableElementInsets = this.f6159c.getTappableElementInsets();
            this.f6167p = C0774a.b(tappableElementInsets);
        }
        return this.f6167p;
    }

    @Override // n.C0797k, n.C0802p
    public void p(C0774a c0774a) {
    }
}
