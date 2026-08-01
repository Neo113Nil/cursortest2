package sg.bigo.ads.v;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f13348a;
    public final TextView b;
    public final ImageView c;
    public final boolean d;

    public k(Context context, boolean z) {
        LinearLayout linearLayout = (LinearLayout) AbstractC4944a.a(context, R.layout.bigo_ad_layout_more, null, false);
        this.f13348a = linearLayout;
        this.b = (TextView) linearLayout.findViewById(R.id.bigo_ad_more_txt);
        this.c = (ImageView) linearLayout.findViewById(R.id.bigo_ad_more_img);
        this.d = z;
        int a2 = AbstractC4963u.a(context, 20);
        if (z) {
            linearLayout.setPadding(a2, 0, 0, 0);
        } else {
            linearLayout.setPadding(0, 0, a2, 0);
        }
        a(true);
    }

    public final void a(boolean z) {
        ImageView imageView;
        int i;
        if (z) {
            this.b.setTextColor(-1);
            imageView = this.c;
            i = this.d ? R.drawable.bigo_ad_ic_right_round_white : R.drawable.bigo_ad_ic_left_round_white;
        } else {
            this.b.setTextColor(-14275021);
            imageView = this.c;
            i = this.d ? R.drawable.bigo_ad_ic_right_round_black : R.drawable.bigo_ad_ic_left_round_black;
        }
        imageView.setImageResource(i);
    }
}
