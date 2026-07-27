package sg.bigo.ads.m;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.h.AbstractC5144a1;

/* renamed from: sg.bigo.ads.m.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5299C implements sg.bigo.ads.K0.W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5144a1 f13062a;
    public final /* synthetic */ C5301E b;

    public C5299C(C5301E c5301e, AbstractC5144a1 abstractC5144a1) {
        this.b = c5301e;
        this.f13062a = abstractC5144a1;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        int a2;
        int i;
        int i2;
        float a3;
        int i3;
        int i4;
        sg.bigo.ads.U.r a4 = this.b.a(this.f13062a);
        int width = rect.width();
        int height = rect.height();
        if (width == 0 || height == 0 || (i3 = a4.f12567a) == 0 || (i4 = a4.b) == 0 || width * i4 != height * i3) {
            a2 = AbstractC4963u.a(this.b.u.getContext(), 20);
            int i5 = a2 * 2;
            sg.bigo.ads.U.r a5 = sg.bigo.ads.U.r.a(a4.f12567a, a4.b, rect.width() - i5, rect.height() - i5);
            i = a5.f12567a;
            i2 = a5.b;
            a3 = AbstractC4963u.a(this.b.u.getContext(), 8);
        } else {
            i2 = -1;
            a3 = 0.0f;
            a2 = 0;
            i = -1;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.u.getLayoutParams();
        marginLayoutParams.setMargins(a2, a2, a2, a2);
        marginLayoutParams.width = i;
        marginLayoutParams.height = i2;
        this.b.u.requestLayout();
        this.b.u.setCornerRadius(a3);
    }
}
