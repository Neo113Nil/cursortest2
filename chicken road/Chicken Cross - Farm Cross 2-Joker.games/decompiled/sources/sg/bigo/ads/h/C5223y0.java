package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* renamed from: sg.bigo.ads.h.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5223y0 implements sg.bigo.ads.s0.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdImageView f12944a;
    public final /* synthetic */ RoundedFrameLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ sg.bigo.ads.P.c d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Y0 g;

    public C5223y0(Y0 y0, AdImageView adImageView, RoundedFrameLayout roundedFrameLayout, int i, sg.bigo.ads.P.c cVar, String str, int i2) {
        this.g = y0;
        this.f12944a = adImageView;
        this.b = roundedFrameLayout;
        this.c = i;
        this.d = cVar;
        this.e = str;
        this.f = i2;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, sg.bigo.ads.s0.y yVar) {
        this.g.L.a(this.d, 2, this.e, this.f, i, str);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, sg.bigo.ads.s0.y yVar) {
        ViewGroup.LayoutParams layoutParams;
        this.f12944a.setBackground(null);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0 && (layoutParams = this.b.getLayoutParams()) != null) {
            layoutParams.width = (width * this.c) / height;
        }
        this.f12944a.setScaleType(ImageView.ScaleType.FIT_XY);
        this.g.L.a(2, this.f, this.e, this.d);
    }
}
