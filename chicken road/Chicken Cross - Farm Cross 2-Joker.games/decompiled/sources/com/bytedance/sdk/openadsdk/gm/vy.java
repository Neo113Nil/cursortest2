package com.bytedance.sdk.openadsdk.gm;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.gm.ork;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.List;

/* loaded from: classes4.dex */
public class vy extends com.bytedance.sdk.openadsdk.core.wh.gm implements ork.gm, ork.oo, ork.pcc, ork.sf {
    private FilterWord gbb;
    private int gm;
    private int hc;
    private View kj;
    private final ork oo;
    private com.bytedance.sdk.openadsdk.core.wh.oo ork;
    wh pcc;
    private vh qf;
    private int sf;
    private int tmg;
    private com.bytedance.sdk.openadsdk.core.wh.kj vh;
    private com.bytedance.sdk.openadsdk.core.wh.kj vj;
    private View vy;
    private TextView wh;

    public vy(Context context, ork orkVar) {
        this(context, orkVar, null);
    }

    public vy(Context context, ork orkVar, List<FilterWord> list) {
        super(context);
        this.oo = orkVar;
        orkVar.pcc((ork.gm) this);
        orkVar.pcc((ork.sf) this);
        orkVar.pcc((ork.oo) this);
        orkVar.pcc((ork.pcc) this);
        gm();
        pcc(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        sf(list);
    }

    private void gm() {
        if (this.tmg > 0) {
            return;
        }
        this.tmg = rj.gm(getContext());
        int vj = rj.vj(getContext());
        this.hc = vj;
        this.oo.pcc(this.tmg, vj);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.gm, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.tmg == 0) {
                gm();
            }
            layoutParams.width = Math.min(this.tmg, this.hc) - (rj.sf(getContext(), 16.0f) * 2);
        }
    }

    private void pcc(Context context) {
        this.gm = rj.sf(context, 8.0f);
        this.sf = rj.sf(context, 20.0f);
        int sf = rj.sf(context, 56.0f);
        int sf2 = rj.sf(context, 30.0f);
        int sf3 = rj.sf(context, 12.0f);
        if (oo()) {
            sf3 = this.sf;
        }
        if (!oo()) {
            sf = sf2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, rj.sf(getContext(), 98.0f));
        view.setBackground(tz.gm(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.gm);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        int sf4 = rj.sf(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(sf4, sf4);
        layoutParams3.setMargins(0, sf3, sf3, 0);
        layoutParams3.gravity = 8388661;
        ooVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_titlebar_close_seletor"));
        addView(ooVar, layoutParams3);
        ooVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gm.vy.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                vy.this.oo.vj();
            }
        });
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        this.ork = ooVar2;
        ooVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gm.vy.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                vy.this.sf();
            }
        });
        this.ork.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(sf4, sf4);
        layoutParams4.setMargins(sf3, sf3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable pcc = com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_leftbackicon_selector");
        pcc.setAutoMirrored(true);
        this.ork.setImageDrawable(pcc);
        addView(this.ork, layoutParams4);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(sf3, sf, sf3, sf3);
        vjVar.setOrientation(1);
        addView(vjVar, layoutParams5);
        View gm = gm(context);
        this.kj = gm;
        vjVar.addView(gm);
        View oo = oo(context);
        this.vy = oo;
        vjVar.addView(oo);
        com.bytedance.sdk.openadsdk.core.wh.kj sf5 = sf(context);
        this.vj = sf5;
        vjVar.addView(sf5);
    }

    private com.bytedance.sdk.openadsdk.core.wh.kj sf(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = oo() ? this.sf : rj.sf(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.gm);
        int rgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(rgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.gm);
        gradientDrawable2.setColor(rgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i = this.gm;
        kjVar.setPadding(0, i, 0, i);
        kjVar.setGravity(17);
        kjVar.setBackground(stateListDrawable);
        kjVar.setTextColor(-1);
        kjVar.setTextSize(16.0f);
        kjVar.setText(tz.pcc(context, "tt_suggestion_commit"));
        kjVar.setEnabled(false);
        kjVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gm.vy.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                vy.this.oo.oo();
            }
        });
        kjVar.setLayoutParams(layoutParams);
        return kjVar;
    }

    private View gm(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        vjVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(tz.pcc(context, "tt_like_this_ad"));
        textView.setTextSize(oo() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        vjVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(tz.pcc(context, "tt_feel_hint"));
        textView2.setTextSize(oo() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (oo()) {
            layoutParams2.topMargin = rj.sf(context, 4.0f);
        }
        vjVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar2 = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int sf = rj.sf(context, 16.0f);
        int sf2 = rj.sf(context, 12.0f);
        int sf3 = rj.sf(context, 8.0f);
        if (oo()) {
            layoutParams3.topMargin = sf;
            layoutParams3.bottomMargin = sf;
        } else {
            layoutParams3.topMargin = sf2;
            layoutParams3.bottomMargin = sf3;
        }
        vjVar.addView(vjVar2, layoutParams3);
        vjVar2.addView(new vj(context, 1, this.oo));
        vj vjVar3 = new vj(context, 2, this.oo);
        ViewGroup.LayoutParams layoutParams4 = vjVar3.getLayoutParams();
        boolean z = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = sf;
        layoutParams7.rightMargin = sf;
        vjVar2.addView(vjVar3, layoutParams5);
        vjVar2.addView(new vj(context, 3, this.oo));
        vh vhVar = new vh(context);
        this.qf = vhVar;
        vjVar.addView(vhVar);
        this.wh = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!oo()) {
            sf = sf3;
        }
        layoutParams8.topMargin = sf;
        this.wh.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.wh.setPadding(sf2, sf3, sf2, sf3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(sf3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.wh.setBackground(gradientDrawable);
        this.wh.setText(tz.pcc(context, "tt_report_this_ad"));
        this.wh.setTextSize(oo() ? 14 : 12);
        Drawable gm = tz.gm(context, "tt_report_ad_arrow");
        gm.setBounds(0, 0, sf2, sf2);
        this.wh.setCompoundDrawables(null, null, gm, null);
        this.wh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gm.vy.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                vy.this.pcc();
            }
        });
        vjVar.addView(this.wh, layoutParams8);
        return vjVar;
    }

    private boolean oo() {
        if (this.tmg == 0) {
            gm();
        }
        return this.tmg < this.hc;
    }

    private View oo(Context context) {
        int sf;
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setOrientation(1);
        if (!oo()) {
            sf = rj.sf(context, 200.0f);
        } else {
            sf = rj.sf(context, 358.0f);
        }
        vjVar.setLayoutParams(new LinearLayout.LayoutParams(-1, sf));
        TextView textView = new TextView(context);
        textView.setText(tz.pcc(context, "tt_select_reason"));
        textView.setTextSize(oo() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = rj.sf(context, oo() ? 24.0f : 4.0f);
        vjVar.addView(textView, layoutParams);
        wh whVar = new wh(context, this.oo);
        this.pcc = whVar;
        vjVar.addView(whVar);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.vh = kjVar;
        kjVar.setId(nac.lr);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = oo() ? this.sf : rj.sf(context, 6.0f);
        layoutParams2.gravity = 17;
        this.vh.setLayoutParams(layoutParams2);
        this.vh.setFocusable(false);
        this.vh.setHint(tz.pcc(context, "tt_add_bad_reason"));
        this.vh.setHintTextColor(Color.parseColor("#57000000"));
        this.vh.setTextColor(Color.rgb(22, 24, 35));
        this.vh.setTextSize(15.0f);
        this.vh.setGravity(GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK);
        this.vh.setVisibility(0);
        this.vh.setPadding(0, rj.sf(context, 15.0f), 0, rj.sf(context, 14.0f));
        this.vh.setEllipsize(TextUtils.TruncateAt.END);
        this.vh.setSingleLine();
        this.vh.setMaxLines(1);
        this.vh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.gm.vy.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                vy.this.oo.wh();
            }
        });
        vjVar.addView(this.vh, layoutParams2);
        vjVar.addView(new vh(context, Color.argb(128, 0, 0, 0)));
        vjVar.setVisibility(8);
        return vjVar;
    }

    private void sf(List<FilterWord> list) {
        this.pcc.pcc(list);
    }

    public void pcc() {
        View view = this.vy;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.kj;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = this.ork;
        if (ooVar != null) {
            ooVar.setVisibility(0);
        }
        ork orkVar = this.oo;
        if (orkVar == null || !orkVar.gm()) {
            return;
        }
        this.gbb = this.oo.sf();
    }

    public void sf() {
        View view = this.vy;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.kj;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = this.ork;
        if (ooVar != null) {
            ooVar.setVisibility(8);
        }
        ork orkVar = this.oo;
        if (orkVar != null) {
            FilterWord filterWord = this.gbb;
            if (filterWord != null) {
                orkVar.pcc(filterWord);
            } else {
                orkVar.pcc(ork.pcc);
            }
            this.oo.gm(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gm.ork.gm
    public void pcc(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.vj != null && TextUtils.isEmpty(this.oo.qf())) {
            this.vj.setEnabled(!ork.pcc.equals(filterWord));
        }
        if (vj.pcc.equals(filterWord) || vj.sf.equals(filterWord)) {
            this.wh.setVisibility(8);
            this.qf.setVisibility(8);
        }
        if (vj.gm.equals(filterWord) || ork.pcc.equals(filterWord)) {
            this.wh.setVisibility(0);
            this.qf.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gm.ork.sf
    public void pcc(int i) {
        if (ork.gm == i) {
            this.gbb = null;
            sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gm.ork.oo
    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar;
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = this.vh;
        if (kjVar2 != null) {
            kjVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            ork orkVar = this.oo;
            if (orkVar == null || (kjVar = this.vj) == null) {
                return;
            }
            kjVar.setEnabled(orkVar.gm());
            return;
        }
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar3 = this.vj;
        if (kjVar3 != null) {
            kjVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gm.ork.pcc
    public void pcc(List<FilterWord> list) {
        sf(list);
    }
}
