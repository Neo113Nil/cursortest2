package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes4.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize pcc;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.pcc = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.pcc;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.pcc = pAGBannerSize;
    }
}
