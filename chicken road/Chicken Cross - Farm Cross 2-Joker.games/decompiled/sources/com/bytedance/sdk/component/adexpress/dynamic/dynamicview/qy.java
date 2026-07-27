package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class qy extends wh {
    public qy(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.kj += 6;
        if (this.tmg.tsx()) {
            this.jr = new com.bytedance.sdk.component.adexpress.wh.pcc(context, this.tmg.qf(), this.tmg.vj(), 1, this.tmg.kj());
            ((com.bytedance.sdk.component.adexpress.wh.pcc) this.jr).setMaxLines(1);
        } else {
            this.jr = new TextView(context);
            ((TextView) this.jr).setIncludeFontPadding(false);
        }
        this.jr.setTag(Integer.valueOf(getClickArea()));
        addView(this.jr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        int i;
        double d;
        super.vy();
        if (TextUtils.isEmpty(getText())) {
            this.jr.setVisibility(4);
            return true;
        }
        if (this.tmg.tsx()) {
            vh();
            return true;
        }
        ((TextView) this.jr).setText(this.tmg.wh());
        ((TextView) this.jr).setTextDirection(5);
        this.jr.setTextAlignment(this.tmg.kj());
        ((TextView) this.jr).setTextColor(this.tmg.qf());
        ((TextView) this.jr).setTextSize(this.tmg.vj());
        if (!this.tmg.tz()) {
            ((TextView) this.jr).setMaxLines(1);
            ((TextView) this.jr).setGravity(17);
            ((TextView) this.jr).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int of = this.tmg.of();
            if (of > 0) {
                ((TextView) this.jr).setLines(of);
                ((TextView) this.jr).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        if (this.hc != null && this.hc.ork() != null) {
            if (com.bytedance.sdk.component.adexpress.oo.sf() && pcc() && (TextUtils.equals(this.hc.ork().sf(), "text_star") || TextUtils.equals(this.hc.ork().sf(), "score-count") || TextUtils.equals(this.hc.ork().sf(), "score-count-type-1") || TextUtils.equals(this.hc.ork().sf(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (TextUtils.equals(this.hc.ork().sf(), "score-count") || TextUtils.equals(this.hc.ork().sf(), "score-count-type-2")) {
                try {
                    try {
                        i = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i = -1;
                }
                if (i < 0) {
                    if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                        setVisibility(8);
                        return true;
                    }
                    this.jr.setVisibility(0);
                }
                if (TextUtils.equals(this.hc.ork().sf(), "score-count-type-2")) {
                    ((TextView) this.jr).setText(String.format(new DecimalFormat("(###,###,###)").format(i), Integer.valueOf(i)));
                    ((TextView) this.jr).setGravity(17);
                    return true;
                }
                pcc((TextView) this.jr, i, getContext(), "tt_comment_num");
            } else if (TextUtils.equals(this.hc.ork().sf(), "text_star")) {
                try {
                    d = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d = -1.0d;
                }
                if (d < 0.0d || d > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                        setVisibility(8);
                        return true;
                    }
                    this.jr.setVisibility(0);
                }
                ((TextView) this.jr).setIncludeFontPadding(false);
                ((TextView) this.jr).setText(String.format("%.1f", Double.valueOf(d)));
            } else if (TextUtils.equals("privacy-detail", this.hc.ork().sf())) {
                ((TextView) this.jr).setText("Permission list | Privacy policy");
            } else if (TextUtils.equals(this.hc.ork().sf(), "development-name")) {
                ((TextView) this.jr).setText(com.bytedance.sdk.component.utils.tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_text_privacy_development") + getText());
            } else if (TextUtils.equals(this.hc.ork().sf(), "app-version")) {
                ((TextView) this.jr).setText(com.bytedance.sdk.component.utils.tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.jr).setText(getText());
            }
            this.jr.setTextAlignment(this.tmg.kj());
            ((TextView) this.jr).setGravity(this.tmg.vy());
            if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                ork();
            }
        }
        return true;
    }

    private boolean pcc() {
        return (this.gbb == null || this.gbb.getRenderRequest() == null || this.gbb.getRenderRequest().ork() == 4) ? false : true;
    }

    private void ork() {
        int pcc;
        if (TextUtils.equals(this.hc.ork().sf(), "source") || TextUtils.equals(this.hc.ork().sf(), "title") || TextUtils.equals(this.hc.ork().sf(), "text_star")) {
            int[] sf = com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf(this.tmg.wh(), this.tmg.vj(), true);
            int pcc2 = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), this.tmg.sf());
            int pcc3 = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), this.tmg.gm());
            int pcc4 = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), this.tmg.oo());
            int pcc5 = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), this.tmg.pcc());
            int min = Math.min(pcc2, pcc5);
            if (TextUtils.equals(this.hc.ork().sf(), "source") && (pcc = ((this.kj - ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), this.tmg.vj()))) - pcc2) - pcc5) > 1 && pcc <= min * 2) {
                int i = pcc / 2;
                this.jr.setPadding(pcc3, pcc2 - i, pcc4, pcc5 - (pcc - i));
                return;
            }
            int i2 = (((sf[1] + pcc2) + pcc5) - this.kj) - 2;
            if (i2 <= 1) {
                return;
            }
            if (i2 <= min * 2) {
                int i3 = i2 / 2;
                this.jr.setPadding(pcc3, pcc2 - i3, pcc4, pcc5 - (i2 - i3));
            } else if (i2 > pcc2 + pcc5) {
                final int i4 = (i2 - pcc2) - pcc5;
                this.jr.setPadding(pcc3, 0, pcc4, 0);
                if (i4 <= ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), 1.0f)) + 1) {
                    ((TextView) this.jr).setTextSize(this.tmg.vj() - 1.0f);
                } else if (i4 <= (((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.jr).setTextSize(this.tmg.vj() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qy.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = qy.this.jr.getLayoutParams();
                                layoutParams.height = qy.this.kj + i4;
                                qy.this.jr.setLayoutParams(layoutParams);
                                qy.this.jr.setTranslationY(-i4);
                                ViewGroup viewGroup = (ViewGroup) qy.this.jr.getParent();
                                ViewGroup viewGroup2 = viewGroup;
                                viewGroup.setClipChildren(false);
                                ViewGroup viewGroup3 = (ViewGroup) qy.this.jr.getParent().getParent();
                                ViewGroup viewGroup4 = viewGroup3;
                                viewGroup3.setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (pcc2 > pcc5) {
                this.jr.setPadding(pcc3, pcc2 - (i2 - min), pcc4, pcc5 - min);
            } else {
                this.jr.setPadding(pcc3, pcc2 - min, pcc4, pcc5 - (i2 - min));
            }
        }
        if (TextUtils.equals(this.hc.ork().sf(), "fillButton")) {
            this.jr.setTextAlignment(2);
            ((TextView) this.jr).setGravity(17);
        }
    }

    public String getText() {
        String wh = this.tmg.wh();
        if (TextUtils.isEmpty(wh)) {
            if (!com.bytedance.sdk.component.adexpress.oo.sf() && TextUtils.equals(this.hc.ork().sf(), "text_star")) {
                wh = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.oo.sf() && TextUtils.equals(this.hc.ork().sf(), "score-count")) {
                wh = "6870";
            }
        }
        return (TextUtils.equals(this.hc.ork().sf(), "title") || TextUtils.equals(this.hc.ork().sf(), "subtitle")) ? wh.replace("\n", "") : wh;
    }

    public void pcc(TextView textView, int i, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.tz.pcc(context, str), Integer.valueOf(i)) + ")");
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    private void vh() {
        if (this.jr instanceof com.bytedance.sdk.component.adexpress.wh.pcc) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.wh.pcc) this.jr).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.wh.pcc) this.jr).setTextColor(this.tmg.qf());
            ((com.bytedance.sdk.component.adexpress.wh.pcc) this.jr).setTextSize(this.tmg.vj());
            ((com.bytedance.sdk.component.adexpress.wh.pcc) this.jr).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.wh.pcc) this.jr).setAnimationType(this.tmg.rj());
            ((com.bytedance.sdk.component.adexpress.wh.pcc) this.jr).setAnimationDuration(this.tmg.kun() * 1000);
            ((com.bytedance.sdk.component.adexpress.wh.pcc) this.jr).pcc();
        }
    }
}
