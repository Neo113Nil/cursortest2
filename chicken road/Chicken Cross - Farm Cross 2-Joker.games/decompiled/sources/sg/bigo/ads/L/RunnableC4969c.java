package sg.bigo.ads.L;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.K0.X;

/* renamed from: sg.bigo.ads.L.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4969c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12380a;
    public final /* synthetic */ int b;

    public RunnableC4969c(ViewGroup viewGroup, int i) {
        this.f12380a = viewGroup;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView;
        View findViewWithTag = this.f12380a.findViewWithTag("adview_background_main_tag");
        if (findViewWithTag instanceof ImageView) {
            imageView = (ImageView) findViewWithTag;
        } else {
            Context context = this.f12380a.getContext();
            if (context != null) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setTag("adview_background_main_tag");
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                X.a(imageView2, this.f12380a, null, 0);
                imageView = imageView2;
            } else {
                imageView = null;
            }
        }
        if (imageView != null) {
            imageView.setBackgroundColor(this.b);
        }
    }
}
