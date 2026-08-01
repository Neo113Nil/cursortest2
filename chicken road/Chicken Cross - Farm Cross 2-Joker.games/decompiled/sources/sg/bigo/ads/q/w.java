package sg.bigo.ads.q;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.s.C5458a;

/* loaded from: classes3.dex */
public final class w extends q {
    public w(C5458a c5458a, ArrayList arrayList, sg.bigo.ads.r.c cVar) {
        super(c5458a, arrayList, cVar);
    }

    @Override // sg.bigo.ads.q.q, sg.bigo.ads.q.x
    public final ArrayList a(C5430a c5430a) {
        if (this.b.size() != 1) {
            return super.a(c5430a);
        }
        View a2 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_word_icon, this.f13249a, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        FrameLayout frameLayout = new FrameLayout(this.d);
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        View a3 = AbstractC4944a.a(this.d, R.layout.bigo_ad_layout_word_icon_first_page, frameLayout, false);
        X.a(a3, frameLayout, layoutParams, -1);
        X.a(a2, frameLayout, layoutParams, -1);
        X.a(frameLayout, this.f13249a, new LinearLayout.LayoutParams(-1, AbstractC4963u.a(this.d, 32)), -1);
        AbstractC5140Q.a(a3, a2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        arrayList.add(a3);
        this.f = true;
        return arrayList;
    }

    @Override // sg.bigo.ads.q.x
    public final void a(TextView textView) {
        textView.setMaxWidth(AbstractC4963u.c(this.d) - AbstractC4963u.a(this.d, 60));
    }
}
