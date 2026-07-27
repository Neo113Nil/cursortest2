package sg.bigo.ads.m;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes3.dex */
public final class u0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13101a;
    public final /* synthetic */ int b;
    public final /* synthetic */ RoundedImageView c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 f;

    public u0(y0 y0Var, int i, int i2, RoundedImageView roundedImageView, ViewGroup viewGroup, int i3) {
        this.f = y0Var;
        this.f13101a = i;
        this.b = i2;
        this.c = roundedImageView;
        this.d = viewGroup;
        this.e = i3;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < this.f13101a || height < this.b) {
            this.c.setScaleType(ImageView.ScaleType.FIT_CENTER);
            AbstractC4962t.a(this.c.getContext(), bitmap, new t0(this, bitmap));
        } else {
            this.c.setScaleType(ImageView.ScaleType.CENTER_CROP);
            sg.bigo.ads.K0.X.a(this.c, this.d, null, -1);
            this.c.setImageBitmap(bitmap);
            this.f.p();
        }
    }
}
