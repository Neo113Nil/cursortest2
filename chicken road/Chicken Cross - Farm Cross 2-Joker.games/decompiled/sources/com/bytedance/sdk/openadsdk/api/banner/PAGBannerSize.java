package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.openadsdk.utils.gm;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public final class PAGBannerSize {
    private int gm = 1;
    private int oo;
    private int pcc;
    private int sf;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.pcc = i;
        this.sf = i2;
    }

    public int getWidth() {
        return this.pcc;
    }

    public int getHeight() {
        return this.sf;
    }

    public int getType() {
        return this.gm;
    }

    public int getMaxHeight() {
        return this.oo;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        int pcc = gm.pcc(context, i, 0);
        if (pcc == gm.pcc) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, pcc);
        pAGBannerSize.gm = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int pcc = gm.pcc(context, 0);
        if (pcc == gm.pcc) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.oo = pcc;
        pAGBannerSize.gm = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.oo = i2;
        pAGBannerSize.gm = 3;
        return pAGBannerSize;
    }
}
