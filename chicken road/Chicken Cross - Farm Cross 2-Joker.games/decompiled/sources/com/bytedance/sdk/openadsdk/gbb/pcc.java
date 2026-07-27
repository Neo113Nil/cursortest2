package com.bytedance.sdk.openadsdk.gbb;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.utils.nac;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.sdk.openadsdk.core.wh.gm {
    private Context pcc;
    private kj sf;

    public pcc(Context context) {
        super(context);
        this.pcc = context;
        pcc();
    }

    private void pcc() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setId(nac.ywp);
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        this.sf = new kj(this.pcc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.sf.setLayoutParams(layoutParams);
        this.sf.setTextColor(Color.argb(166, 0, 0, 0));
        this.sf.setTextSize(16.0f);
        this.sf.setMaxLines(3);
        this.sf.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.sf);
    }

    public void setPrivacyText(String str) {
        try {
            if (this.sf == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.sf.setText(Html.fromHtml(str, 63));
        } catch (Exception e) {
            e.getMessage();
            this.sf.setText("You agree to the Terms of Use and Privacy Policy.");
        }
    }
}
