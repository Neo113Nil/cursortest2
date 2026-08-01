package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* loaded from: classes4.dex */
public class PAGBiddingRequest {
    private PAGBannerSize pcc = null;
    private String sf = null;
    private String gm = null;

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.pcc = pAGBannerSize;
    }

    public PAGBannerSize getBannerSize() {
        return this.pcc;
    }

    public void setSlotId(String str) {
        this.sf = str;
    }

    public String getSlotId() {
        return this.sf;
    }

    public String getAdxId() {
        return this.gm;
    }

    public void setAdxId(String str) {
        this.gm = str;
    }
}
