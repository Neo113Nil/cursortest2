package sg.bigo.ads.n;

import android.view.View;
import sg.bigo.ads.R;
import sg.bigo.ads.h.F1;

/* loaded from: classes3.dex */
public final class S extends F1 {
    public S(sg.bigo.ads.C.l lVar) {
        super(lVar);
    }

    @Override // sg.bigo.ads.h.F1
    public final void a(View view) {
        View findViewById = view.findViewById(R.id.inter_ad_tag_layout);
        if (findViewById == null) {
            return;
        }
        this.e.a(findViewById, 0);
    }
}
