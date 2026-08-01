package sg.bigo.ads.H;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.X;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12317a;
    public final /* synthetic */ p b;

    public m(p pVar, ViewGroup viewGroup) {
        this.b = pVar;
        this.f12317a = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View findViewWithTag = this.f12317a.findViewWithTag("adview_background_main_tag");
        if (findViewWithTag instanceof ImageView) {
            this.b.r = (o) findViewWithTag;
        } else {
            Context context = this.f12317a.getContext();
            if (context != null) {
                this.b.r = new o(context, this.f12317a);
                this.b.r.setTag("adview_background_main_tag");
                this.b.r.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                X.a(this.b.r, this.f12317a, null, 0);
                this.b.a(context, this.f12317a);
            }
        }
        o oVar = this.b.r;
        if (oVar != null) {
            oVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Bitmap a2 = p.a(this.b);
            if (a2 != null) {
                AbstractC4962t.a(this.b.r.getContext(), a2, new l(this));
            }
        }
    }
}
