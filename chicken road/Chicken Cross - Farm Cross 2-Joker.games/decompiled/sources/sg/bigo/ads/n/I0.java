package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.h.AbstractC5164f1;

/* loaded from: classes3.dex */
public class I0 extends S0 {
    public int G;

    public I0(sg.bigo.ads.C.l lVar) {
        super(lVar);
    }

    @Override // sg.bigo.ads.n.S0
    public final void a(ViewGroup viewGroup, sg.bigo.ads.U.r rVar) {
        View findViewById = viewGroup.findViewById(R.id.bigo_ad_mask_vertical);
        int i = rVar.b / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.height = i + 5;
        marginLayoutParams.topMargin = i;
        findViewById.setLayoutParams(marginLayoutParams);
        ((GradientDrawable) findViewById.getBackground()).setColors(h() == 1 ? new int[]{ViewCompat.MEASURED_SIZE_MASK, -1} : new int[]{2105636, ViewCompat.MEASURED_STATE_MASK});
        int c = AbstractC4963u.c(viewGroup.getContext());
        View findViewById2 = viewGroup.findViewById(R.id.bigo_ad_mask_horizontal);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        int i2 = c / 3;
        marginLayoutParams2.width = i2;
        marginLayoutParams2.height = rVar.b;
        marginLayoutParams2.leftMargin = i2;
        findViewById2.setLayoutParams(marginLayoutParams2);
        ((GradientDrawable) findViewById2.getBackground()).setColors(x());
        if (this instanceof T0) {
            return;
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_media_blur_bg);
        View findViewById3 = viewGroup.findViewById(R.id.iv_media_blur_bg_mask);
        if (imageView == null || findViewById3 == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
        marginLayoutParams3.leftMargin = i2;
        marginLayoutParams4.leftMargin = i2;
        imageView.setLayoutParams(marginLayoutParams3);
        findViewById3.setLayoutParams(marginLayoutParams4);
    }

    @Override // sg.bigo.ads.n.S0
    public final void c(ViewGroup viewGroup) {
        sg.bigo.ads.U.r a2 = AbstractC5164f1.a(this.d);
        int round = Math.round(AbstractC4963u.c(viewGroup.getContext()) * 0.666f);
        this.G = round;
        int i = (int) (((round * 1.0f) * a2.b) / a2.f12567a);
        sg.bigo.ads.U.r rVar = new sg.bigo.ads.U.r(round, i);
        ViewGroup.LayoutParams layoutParams = this.C.getLayoutParams();
        layoutParams.width = round;
        layoutParams.height = i;
        this.C.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.bigo_ad_material_container);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams2.topMargin = AbstractC4963u.a(viewGroup.getContext(), 16) + (i / 2);
        linearLayout.setLayoutParams(layoutParams2);
        a(viewGroup, rVar);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.inter_star);
        float a3 = (sg.bigo.ads.C.x.a(4, "key") * 0.5f) + 4.5f;
        Bitmap a4 = AbstractC4962t.a(viewGroup.getContext(), a3, R.drawable.bigo_ad_ic_star_white, R.drawable.bigo_ad_ic_star_normal_white, R.drawable.bigo_ad_ic_star_half_white, false);
        if (h() == 1) {
            a4 = AbstractC4962t.a(viewGroup.getContext(), a3, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half, false);
        }
        imageView.setImageBitmap(a4);
        int i2 = this.G;
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_title);
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            layoutParams3.width = i2;
            textView.setLayoutParams(layoutParams3);
        }
    }

    @Override // sg.bigo.ads.n.S0
    public final int w() {
        return this.G;
    }

    public int[] x() {
        return h() == 1 ? new int[]{-1, ViewCompat.MEASURED_SIZE_MASK} : new int[]{ViewCompat.MEASURED_STATE_MASK, 2105636};
    }
}
