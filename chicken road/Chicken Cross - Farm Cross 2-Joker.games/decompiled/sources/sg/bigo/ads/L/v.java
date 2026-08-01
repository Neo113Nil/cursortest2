package sg.bigo.ads.L;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.X;

/* loaded from: classes3.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12399a;
    public final /* synthetic */ w b;

    public v(w wVar, Bitmap bitmap) {
        this.b = wVar;
        this.f12399a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView;
        View findViewWithTag = this.b.f12400a.findViewWithTag("adview_background_main_tag");
        if (findViewWithTag instanceof ImageView) {
            imageView = (ImageView) findViewWithTag;
        } else {
            Context context = this.b.f12400a.getContext();
            if (context != null) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setTag("adview_background_main_tag");
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                X.a(imageView2, this.b.f12400a, null, 0);
                imageView = imageView2;
            } else {
                imageView = null;
            }
        }
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            AbstractC4962t.a(imageView.getContext(), this.f12399a, new u(imageView));
        }
    }
}
