package com.bytedance.sdk.openadsdk.gm;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.gm.ork;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class vj extends com.bytedance.sdk.openadsdk.core.wh.vj implements View.OnClickListener, ork.gm {
    private final ork oo;
    private final int qf;
    private FilterWord vj;
    private StateListDrawable wh;
    public static FilterWord pcc = new FilterWord("100:1", "GOOD");
    public static FilterWord sf = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord gm = new FilterWord("100:3", "BAD");

    public vj(Context context, int i, ork orkVar) {
        super(context);
        this.qf = i;
        this.oo = orkVar;
        if (orkVar != null) {
            orkVar.pcc(this);
        }
        pcc(i);
        pcc();
        sf();
    }

    private void pcc(int i) {
        if (i == 1) {
            this.vj = pcc;
        } else if (i == 2) {
            this.vj = sf;
        } else {
            if (i != 3) {
                return;
            }
            this.vj = gm;
        }
    }

    private void pcc() {
        if (this.wh == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(rj.sf(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(rj.sf(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(rj.sf(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.wh = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.wh.addState(new int[0], gradientDrawable);
        }
        setBackground(this.wh);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    private void sf() {
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(getContext());
        kjVar.setTextSize(this.oo.vy() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, rj.sf(getContext(), 12.0f), 0, rj.sf(getContext(), this.oo.vy() ? 8.0f : 4.0f));
        addView(kjVar, layoutParams);
        pcc pccVar = new pcc(getContext());
        pccVar.setTextSize(this.oo.vy() ? 17 : 12);
        pccVar.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        pccVar.setMaxLines(1);
        pccVar.setSingleLine();
        pccVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, rj.sf(getContext(), 12.0f));
        addView(pccVar, layoutParams2);
        int i = this.qf;
        if (i == 1) {
            kjVar.setText("😍");
            pccVar.setText(tz.pcc(getContext(), "tt_good"));
        } else if (i == 2) {
            pccVar.setText(tz.pcc(getContext(), "tt_not_bad"));
            kjVar.setText("😐");
        } else {
            if (i != 3) {
                return;
            }
            pccVar.setText(tz.pcc(getContext(), "tt_bad"));
            kjVar.setText("😡");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.oo.pcc(ork.pcc);
        } else {
            this.oo.pcc(this.vj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.gm.ork.gm
    public void pcc(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.vj) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
