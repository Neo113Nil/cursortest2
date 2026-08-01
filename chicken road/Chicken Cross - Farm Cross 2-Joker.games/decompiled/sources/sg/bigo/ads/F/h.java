package sg.bigo.ads.F;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public abstract class h {
    public static void a(ViewGroup viewGroup, View view, int i, int[] iArr) {
        int i2 = i - 1;
        if (i2 > 0 && iArr.length >= 2 && viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.inter_banner_click_img);
            View findViewById2 = viewGroup.findViewById(R.id.inter_banner_click_guide_contain);
            if (findViewById != null && findViewById2 != null) {
                viewGroup.postDelayed(new g(findViewById2, findViewById, iArr, viewGroup, i2), 0L);
            }
        }
        if (i2 == 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(AbstractC4954k.a(1));
            ofFloat.start();
        }
    }
}
