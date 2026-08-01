package sg.bigo.ads.A;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import sg.bigo.ads.U0.g;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.h.C5181k0;
import sg.bigo.ads.h.C5190n0;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12210a;
    public final InterstitialAd b;
    public final C5181k0 c;

    public e(C5190n0 c5190n0, Context context, C5181k0 c5181k0) {
        this.c = c5181k0;
        this.f12210a = context;
    }

    public void a(WebView webView, View view, g gVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
    }
}
