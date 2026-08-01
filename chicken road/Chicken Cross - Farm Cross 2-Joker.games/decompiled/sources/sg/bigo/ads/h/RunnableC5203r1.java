package sg.bigo.ads.h;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: sg.bigo.ads.h.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5203r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12921a;
    public final /* synthetic */ int b;
    public final /* synthetic */ F1 c;

    public RunnableC5203r1(F1 f1, ViewGroup viewGroup, int i) {
        this.c = f1;
        this.f12921a = viewGroup;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View findViewWithTag = this.f12921a.findViewWithTag("adview_background_main_tag");
        if (findViewWithTag instanceof ImageView) {
            this.c.h = (ImageView) findViewWithTag;
        } else {
            Context context = this.f12921a.getContext();
            if (context != null) {
                this.c.h = new ImageView(context);
                this.c.h.setTag("adview_background_main_tag");
                this.c.h.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                sg.bigo.ads.K0.X.a(this.c.h, this.f12921a, null, 0);
            }
        }
        ImageView imageView = this.c.h;
        if (imageView != null) {
            imageView.setBackgroundColor(this.b);
        }
    }
}
