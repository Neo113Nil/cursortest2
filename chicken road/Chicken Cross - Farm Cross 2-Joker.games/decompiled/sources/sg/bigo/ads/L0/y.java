package sg.bigo.ads.L0;

import android.view.View;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes3.dex */
public final class y implements A {

    /* renamed from: a, reason: collision with root package name */
    public final ViewFlow f12420a;
    public A b;
    public int c = 0;

    public y(ViewFlow viewFlow) {
        this.f12420a = viewFlow;
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(int i) {
        this.f12420a.post(new w(this, i));
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(View view, int i, float f) {
        this.f12420a.post(new u(this, view, i, f));
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(View view, int i) {
        this.f12420a.post(new v(this, view, i));
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(int i, int i2) {
        this.f12420a.post(new x(this, i, i2));
    }
}
