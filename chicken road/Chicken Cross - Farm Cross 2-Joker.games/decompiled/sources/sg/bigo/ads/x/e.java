package sg.bigo.ads.x;

import android.graphics.Rect;
import android.view.View;
import sg.bigo.ads.K0.W;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class e implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f13370a;

    public e(k kVar) {
        this.f13370a = kVar;
    }

    @Override // sg.bigo.ads.K0.W
    public final void a(View view, Rect rect, Rect rect2) {
        if (this.f13370a.c == null || view == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.inter_ad_tag_layout);
        View findViewById2 = view.findViewById(R.id.inter_options);
        this.f13370a.c.a(findViewById, 1);
        this.f13370a.c.a(findViewById2, 1);
    }
}
