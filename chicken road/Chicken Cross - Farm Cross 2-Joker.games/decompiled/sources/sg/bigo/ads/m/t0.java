package sg.bigo.ads.m;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes3.dex */
public final class t0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13100a;
    public final /* synthetic */ u0 b;

    public t0(u0 u0Var, Bitmap bitmap) {
        this.b = u0Var;
        this.f13100a = bitmap;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(this.b.d.getContext());
        roundedFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, this.b.b));
        roundedFrameLayout.setCornerRadius(this.b.e);
        sg.bigo.ads.K0.X.a(roundedFrameLayout, this.b.d, null, -1);
        RoundedImageView roundedImageView = new RoundedImageView(this.b.d.getContext());
        roundedImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.b.b));
        roundedImageView.setImageBitmap((Bitmap) obj);
        roundedImageView.setCornerRadius(this.b.e);
        roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundedImageView.setTag(9);
        sg.bigo.ads.K0.X.a(roundedImageView, roundedFrameLayout, null, -1);
        int a2 = AbstractC4963u.a(this.b.d.getContext(), 10);
        this.b.c.setImageBitmap(this.f13100a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.c.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        layoutParams.setMargins(a2, a2, a2, a2);
        this.b.c.setLayoutParams(layoutParams);
        sg.bigo.ads.K0.X.a(this.b.c, roundedFrameLayout, null, -1);
        this.b.f.p();
    }
}
