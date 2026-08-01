package sg.bigo.ads.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.E1.k;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.d1.AbstractC5068d;
import sg.bigo.ads.d1.s;
import sg.bigo.ads.d1.u;
import sg.bigo.ads.r1.n;
import sg.bigo.ads.r1.q;

/* loaded from: classes3.dex */
public class MediaView extends sg.bigo.ads.N.a {
    public MediaView(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.N.a
    public final AbstractC5068d a() {
        return new s(this);
    }

    public final void destroy() {
        s sVar = (s) getViewImpl();
        AdImageView adImageView = sVar.c;
        if (adImageView != null) {
            adImageView.setImageBitmap(null);
            sVar.c.c.c.clear();
            sVar.c = null;
        }
        q qVar = sVar.b;
        if (qVar != null) {
            qVar.destroy();
            sVar.b = null;
        }
        k kVar = sVar.i;
        if (kVar != null) {
            kVar.destroy();
            sVar.i = null;
        }
    }

    public View getImage() {
        return ((s) getViewImpl()).c;
    }

    public VideoController getVideoController() {
        return ((s) getViewImpl()).f;
    }

    public void setImageBlurBorder(boolean z) {
        ((s) getViewImpl()).h = z;
    }

    public void setMediaAreaClickable(boolean z) {
        ((s) getViewImpl()).e = Boolean.valueOf(z);
    }

    public void setOnAdClickListener(u uVar) {
        ((s) getViewImpl()).j = uVar;
    }

    public void setOtherClickAreaClick(boolean z) {
        ((s) getViewImpl()).d = Boolean.valueOf(z);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(Bitmap bitmap) {
        ((s) getViewImpl()).h = false;
        s sVar = (s) getViewImpl();
        if (bitmap == null) {
            sVar.getClass();
            return;
        }
        int a2 = AbstractC4963u.a(sVar.f12728a.getContext(), 10);
        int a3 = AbstractC4963u.a(sVar.f12728a.getContext(), 4);
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(sVar.f12728a.getContext());
        roundedFrameLayout.setCornerRadius(a3);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = (width == height && sVar.f12728a.getWidth() <= sVar.f12728a.getHeight()) || width > height;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z ? -1 : -2, z ? -2 : -1, 17);
        layoutParams.setMargins(a2, a2, a2, a2);
        roundedFrameLayout.setLayoutParams(layoutParams);
        AdImageView adImageView = new AdImageView(sVar.f12728a.getContext());
        adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        X.a(adImageView, roundedFrameLayout, null, -1);
        X.a(roundedFrameLayout, sVar.f12728a, null, -1);
        adImageView.setBlurBorder(sVar.h);
        adImageView.setImageBitmap(bitmap);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(String str) {
        s sVar = (s) getViewImpl();
        sVar.getClass();
        n nVar = new n(sVar.f12728a.getContext(), 0, 0, sg.bigo.ads.R.b.a(1), null);
        nVar.setClickable(sVar.g);
        sVar.a(nVar);
        nVar.o = str;
        nVar.s = 0;
        sVar.f = new sg.bigo.ads.d1.q(nVar);
        sVar.b = nVar;
    }
}
