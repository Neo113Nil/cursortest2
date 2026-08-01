package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* loaded from: classes3.dex */
public final class Q0 implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdImageView f13147a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ RoundedFrameLayout e;
    public final /* synthetic */ S0 f;

    public Q0(S0 s0, AdImageView adImageView, ViewGroup viewGroup, int i, boolean z, RoundedFrameLayout roundedFrameLayout) {
        this.f = s0;
        this.f13147a = adImageView;
        this.b = viewGroup;
        this.c = i;
        this.d = z;
        this.e = roundedFrameLayout;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        if (this.f.d.t) {
            return;
        }
        this.f13147a.setBackground(null);
        S0 s0 = this.f;
        ViewGroup viewGroup = this.b;
        int i = this.c;
        boolean z = this.d;
        s0.getClass();
        int a2 = AbstractC4963u.a(viewGroup.getContext(), 20);
        int width = (int) (((i * 1.0f) * bitmap.getWidth()) / bitmap.getHeight());
        sg.bigo.ads.U.r rVar = new sg.bigo.ads.U.r(width, i);
        if (z && width < AbstractC4963u.c(viewGroup.getContext()) - a2) {
            int i2 = i - a2;
            rVar = new sg.bigo.ads.U.r((int) (((i2 * 1.0f) * bitmap.getWidth()) / bitmap.getHeight()), i2);
        }
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        layoutParams.width = rVar.getWidth();
        layoutParams.height = rVar.getHeight();
        this.e.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f13147a.getLayoutParams();
        layoutParams2.width = rVar.getWidth();
        layoutParams2.height = rVar.getHeight();
        this.f13147a.setLayoutParams(layoutParams2);
        if (this.d) {
            this.f.a(this.b, bitmap, rVar, this.c);
        }
    }
}
