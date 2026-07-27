package sg.bigo.ads.n0;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.Map;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.R;
import sg.bigo.ads.l0.AbstractC5291b;
import sg.bigo.ads.m0.AbstractC5348a;

/* renamed from: sg.bigo.ads.n0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5416a {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.O.e f13199a;
    public final Map b;
    public String c;
    public final String d;
    public final String e;
    public final String[] f;
    public final Context g;
    public View h;
    public final e i;

    public AbstractC5416a(sg.bigo.ads.O.e eVar, Map map, Context context, e eVar2) {
        this.g = context;
        this.f13199a = eVar;
        this.b = map;
        this.d = eVar.f12471a;
        this.e = eVar.d;
        this.f = eVar.c;
        this.i = eVar2;
    }

    public final boolean a() {
        boolean a2 = I.a((CharSequence) this.c);
        if (this.f13199a.b == 3) {
            String str = this.c;
            a2 = !(I.a((CharSequence) str) ? false : I.f12345a.matcher(str).matches());
        }
        a(a2 ? 3 : 1);
        return a2;
    }

    public abstract View b();

    public void a(int i) {
        boolean z = AbstractC5348a.f13109a;
        int i2 = z ? -12957095 : -2234903;
        int i3 = z ? -2431246 : -14275021;
        boolean z2 = false;
        if (i != 2) {
            if (i == 3) {
                i2 = -45718;
                z2 = true;
            }
            a(i2, i3, z2);
        }
        i2 = -16736769;
        i3 = i2;
        a(i2, i3, z2);
    }

    public final void a(int i, int i2, boolean z) {
        View view = this.h;
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.inter_form_edit_content);
        if (findViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(AbstractC4963u.a(this.g, 1), i);
            gradientDrawable.setCornerRadius(AbstractC4963u.a(this.g, 8));
            findViewById.setBackground(gradientDrawable);
        }
        TextView textView = (TextView) this.h.findViewById(R.id.inter_form_edit_warning);
        if (textView != null) {
            textView.setText(AbstractC5291b.a(this.g, R.string.bigo_ad_form_warning));
            textView.setVisibility(z ? 0 : 8);
        }
        TextView textView2 = (TextView) this.h.findViewById(R.id.inter_form_edit_title);
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }
}
