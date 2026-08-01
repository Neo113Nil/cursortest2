package sg.bigo.ads.l0;

import android.view.View;
import sg.bigo.ads.L0.A;
import sg.bigo.ads.common.view.Indicator;

/* renamed from: sg.bigo.ads.l0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5295f implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5296g f13057a;

    public C5295f(C5296g c5296g) {
        this.f13057a = c5296g;
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(int i) {
        Indicator indicator;
        int i2;
        this.f13057a.d.setNum(i);
        if (i > 1) {
            indicator = this.f13057a.d;
            i2 = 0;
        } else {
            indicator = this.f13057a.d;
            i2 = 4;
        }
        indicator.setVisibility(i2);
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(int i, int i2) {
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(View view, int i, float f) {
        Indicator indicator = this.f13057a.d;
        if (i == indicator.k) {
            indicator.j = (-f) * 2.0f;
            indicator.invalidate();
        }
    }

    @Override // sg.bigo.ads.L0.A
    public final void a(View view, int i) {
        Indicator indicator = this.f13057a.d;
        if (indicator.k != i) {
            indicator.k = i;
            indicator.j = 0.0f;
            indicator.invalidate();
        }
    }
}
