package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class kj extends Button {
    public kj(Context context) {
        super(context);
        pcc();
    }

    private void pcc() {
        setId(com.bytedance.sdk.openadsdk.utils.nac.kx);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, rj.sf(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_browser_download_selector"));
        setText(com.bytedance.sdk.component.utils.tz.pcc(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
