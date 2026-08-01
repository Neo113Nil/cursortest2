package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class gpj extends com.bytedance.sdk.openadsdk.core.wh.gm {
    public gpj(Context context) {
        super(context);
        pcc();
    }

    private void pcc() {
        Context context = getContext();
        int sf = rj.sf(context, 12.0f);
        int sf2 = rj.sf(context, 10.0f);
        int sf3 = rj.sf(context, 24.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, rj.sf(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar.setId(520093720);
        ooVar.setClickable(true);
        ooVar.setFocusable(true);
        ooVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_leftbackicon_selector"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sf3, sf3);
        layoutParams.setMargins(sf, sf2, 0, sf2);
        layoutParams.gravity = (pcc(context) ? 5 : 3) | 16;
        addView(ooVar, layoutParams);
        if (pcc(context)) {
            ooVar.setImageResource(com.bytedance.sdk.component.utils.tz.oo(context, "tt_titlebar_forward"));
        }
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.gdh);
        ooVar2.setClickable(true);
        ooVar2.setFocusable(true);
        ooVar2.setImageResource(com.bytedance.sdk.component.utils.tz.oo(context, "tt_history_titlebar_delete"));
        ooVar2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(sf3, sf3);
        layoutParams2.setMargins(0, sf2, sf, sf2);
        layoutParams2.gravity = (pcc(context) ? 3 : 5) | 16;
        addView(ooVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar.setId(com.bytedance.sdk.openadsdk.utils.nac.vd);
        kjVar.setSingleLine(true);
        kjVar.setText(context.getString(com.bytedance.sdk.component.utils.tz.sf(context, "tt_history_title")));
        kjVar.setEllipsize(TextUtils.TruncateAt.END);
        kjVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface create = Build.VERSION.SDK_INT >= 28 ? Typeface.create(kjVar.getTypeface(), 500, false) : null;
        if (create != null) {
            kjVar.setTypeface(create);
        }
        kjVar.setGravity(17);
        kjVar.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        kjVar.setTextSize(1, 17.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        addView(kjVar, layoutParams3);
    }

    private boolean pcc(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (Character.getDirectionality(c) == 1 || Character.getDirectionality(c) == 2) {
                return true;
            }
        }
        return false;
    }
}
