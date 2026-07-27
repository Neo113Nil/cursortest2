package sg.bigo.ads.n;

import android.widget.RelativeLayout;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;

/* renamed from: sg.bigo.ads.n.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5361G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5362H f13134a;

    public RunnableC5361G(RunnableC5362H runnableC5362H) {
        this.f13134a = runnableC5362H;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IconListView iconListView = this.f13134a.b.T;
        if (iconListView != null) {
            ((RelativeLayout.LayoutParams) iconListView.getLayoutParams()).width = (this.f13134a.b.D.getMeasuredWidth() - this.f13134a.b.D.getPaddingLeft()) - this.f13134a.b.D.getPaddingRight();
            this.f13134a.b.T.requestLayout();
        }
        RunnableC5362H runnableC5362H = this.f13134a;
        runnableC5362H.b.D.post(runnableC5362H.f13135a);
    }
}
