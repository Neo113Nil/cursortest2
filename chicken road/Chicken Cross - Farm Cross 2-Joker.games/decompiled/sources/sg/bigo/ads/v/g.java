package sg.bigo.ads.v;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.R;
import sg.bigo.ads.h.X;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13347a;
    public final View b;
    public final boolean c;
    public final LinearLayout d;
    public final TextView e;
    public final ImageView f;
    public final LinearLayout g;
    public final TextView h;
    public final ImageView i;
    public final X j;
    public final String k;

    public g(Context context, X x, String str, boolean z) {
        this.f13347a = context;
        View a2 = AbstractC4944a.a(context, R.layout.bigo_ad_layout_ic_item, null, false);
        this.b = a2;
        this.c = z;
        LinearLayout linearLayout = (LinearLayout) a2.findViewById(R.id.bigo_ad_ic_title_layout);
        this.d = linearLayout;
        this.e = (TextView) a2.findViewById(R.id.bigo_ad_ic_title_txt);
        this.f = (ImageView) a2.findViewById(R.id.bigo_ad_ic_title_iv);
        linearLayout.setTag(26);
        LinearLayout linearLayout2 = (LinearLayout) a2.findViewById(R.id.bigo_ad_ic_desc_layout);
        this.g = linearLayout2;
        this.h = (TextView) a2.findViewById(R.id.bigo_ad_ic_desc_txt);
        this.i = (ImageView) a2.findViewById(R.id.bigo_ad_ic_desc_iv);
        linearLayout2.setTag(26);
        this.j = x;
        this.k = str;
        a();
    }

    public void a() {
        if (this.j.b == 0) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setText(this.j.b);
            if (this.c) {
                this.e.setTextColor(-1);
            }
        }
        if (this.j.c == 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.f.setImageResource(this.j.c);
        }
        if (this.j.d == 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.h.setText(this.j.d);
            if (this.c) {
                this.h.setTextColor(I.a(-1, "#9AFFFFFF"));
            }
        }
        if (this.j.e == 0) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            this.i.setImageResource(this.j.e);
        }
    }
}
