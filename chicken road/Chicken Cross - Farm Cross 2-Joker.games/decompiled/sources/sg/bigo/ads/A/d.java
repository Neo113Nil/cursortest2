package sg.bigo.ads.A;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.U0.g;
import sg.bigo.ads.h.C5181k0;
import sg.bigo.ads.h.C5190n0;

/* loaded from: classes3.dex */
public final class d extends e {
    public d(C5190n0 c5190n0, Context context, C5181k0 c5181k0) {
        super(c5190n0, context, c5181k0);
    }

    @Override // sg.bigo.ads.A.e
    public final void a(WebView webView, View view, g gVar) {
        int i = gVar != null ? gVar.f12571a : 0;
        int i2 = gVar != null ? gVar.b : 0;
        Context context = this.f12210a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
        if (i <= 0 || i2 <= 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            return;
        }
        int c = AbstractC4963u.c(context);
        int i3 = context.getResources().getDisplayMetrics().heightPixels;
        if (i > i2) {
            layoutParams.width = -1;
            layoutParams.height = (int) (((i2 * 1.0f) / i) * c);
        } else {
            layoutParams.width = (int) (((i * 1.0f) / i2) * i3);
            layoutParams.height = -1;
        }
        layoutParams.gravity = 17;
    }
}
