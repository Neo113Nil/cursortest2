package sg.bigo.ads.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.U0.n;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.d1.AbstractC5068d;
import sg.bigo.ads.d1.C5067c;
import sg.bigo.ads.d1.ViewOnClickListenerC5066b;

/* loaded from: classes3.dex */
public class AdOptionsView extends sg.bigo.ads.N.a {
    public AdOptionsView(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.N.a
    public final AbstractC5068d a() {
        return new C5067c(this);
    }

    public AdOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(sg.bigo.ads.P.c cVar, String str) {
        C5067c c5067c = (C5067c) getViewImpl();
        if (cVar == null) {
            c5067c.getClass();
            return;
        }
        c5067c.f12728a.removeAllViews();
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        n nVar = bVar.p;
        AdImageView adImageView = new AdImageView(c5067c.f12728a.getContext());
        adImageView.setIconTag(true);
        String str2 = nVar != null ? nVar.f12577a : "";
        adImageView.setOnClickListener(new ViewOnClickListenerC5066b(c5067c, nVar != null ? nVar.b : "", str, nVar != null ? nVar.d : "", nVar != null ? nVar.e : "", nVar != null ? nVar.g : "", nVar != null ? nVar.h : ""));
        if (TextUtils.isEmpty(str2)) {
            c5067c.f12728a.setVisibility(8);
            return;
        }
        adImageView.a(str2, bVar.T);
        adImageView.setLayoutParams(new FrameLayout.LayoutParams(AbstractC4963u.a(c5067c.f12728a.getContext(), 16), AbstractC4963u.a(c5067c.f12728a.getContext(), 16), 17));
        adImageView.setTag("ad_options_real_view");
        X.a(adImageView, c5067c.f12728a, null, -1);
    }

    public AdOptionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
