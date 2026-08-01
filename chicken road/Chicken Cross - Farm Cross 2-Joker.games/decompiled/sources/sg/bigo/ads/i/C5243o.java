package sg.bigo.ads.i;

import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.R;
import sg.bigo.ads.h.F2;
import sg.bigo.ads.h.H2;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.i.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5243o {

    /* renamed from: a, reason: collision with root package name */
    public final F2 f12990a;
    public C5236h b;

    public C5243o(F2 f2) {
        this.f12990a = f2;
    }

    public final ViewGroup a(int i, String str) {
        ViewGroup viewGroup;
        View findViewById;
        H2 h2 = (H2) this.f12990a.f12819a.get();
        ViewGroup viewGroup2 = h2 == null ? null : h2.m;
        if (viewGroup2 == null) {
            AbstractC5496a.a("PlayablePagePresenter", str.concat("nativeAdView is null"));
            return null;
        }
        H2 h22 = (H2) this.f12990a.f12819a.get();
        int d0 = h22 == null ? -1 : h22.d0();
        if (d0 != 0 && d0 != 10 && d0 != 4) {
            AbstractC5496a.a("PlayablePagePresenter", str + "current page not main/midpage/loading, cur=" + d0);
            return null;
        }
        H2 h23 = (H2) this.f12990a.f12819a.get();
        if (h23 != null) {
            h23.l(5);
        }
        H2 h24 = (H2) this.f12990a.f12819a.get();
        if (h24 != null) {
            h24.O0();
        }
        H2 h25 = (H2) this.f12990a.f12819a.get();
        if (h25 != null && (viewGroup = h25.m) != null && (findViewById = viewGroup.findViewById(R.id.inter_layout_end_page)) != null) {
            findViewById.setVisibility(8);
        }
        AbstractC4944a.a(viewGroup2.getContext(), R.layout.bigo_ad_activity_interstitial_rich_video_empty_end, viewGroup2, true);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.inter_layout_end_page);
        if (viewGroup3 == null) {
            AbstractC5496a.a("PlayablePagePresenter", str.concat("playContainer is null"));
            return null;
        }
        ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(R.id.inter_end_page);
        if (viewGroup4 == null) {
            AbstractC5496a.a("PlayablePagePresenter", str.concat("playableSlot is null"));
            return null;
        }
        H2 h26 = (H2) this.f12990a.f12819a.get();
        sg.bigo.ads.q.o oVar = h26 != null ? h26.L : null;
        if (oVar != null) {
            oVar.a(viewGroup3, 4);
        }
        viewGroup2.setTag(19);
        return viewGroup4;
    }
}
