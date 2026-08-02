package U5;

import a.AbstractC0603a;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: U5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0441h implements P.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6497a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6498b;

    /* renamed from: c, reason: collision with root package name */
    public int f6499c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6500d;

    public C0441h(C0437d c0437d, int i7, boolean z4) {
        this.f6497a = 0;
        p3.f.k(c0437d, "callOptions");
        this.f6500d = c0437d;
        this.f6499c = i7;
        this.f6498b = z4;
    }

    @Override // P.c0
    public void a() {
        this.f6498b = true;
    }

    @Override // P.c0
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f6498b = false;
    }

    @Override // P.c0
    public void c() {
        if (this.f6498b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f6500d;
        actionBarContextView.f8203f = null;
        super/*android.view.View*/.setVisibility(this.f6499c);
    }

    public String toString() {
        switch (this.f6497a) {
            case 0:
                D3.j u02 = AbstractC0603a.u0(this);
                u02.a((C0437d) this.f6500d, "callOptions");
                u02.e("previousAttempts", String.valueOf(this.f6499c));
                u02.c("isTransparentRetry", this.f6498b);
                return u02.toString();
            default:
                return super.toString();
        }
    }

    public C0441h(ActionBarContextView actionBarContextView) {
        this.f6497a = 1;
        this.f6500d = actionBarContextView;
        this.f6498b = false;
    }
}
