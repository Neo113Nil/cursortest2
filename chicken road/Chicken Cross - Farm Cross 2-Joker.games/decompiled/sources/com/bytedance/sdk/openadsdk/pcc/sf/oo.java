package com.bytedance.sdk.openadsdk.pcc.sf;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class oo implements PAGNativeAdData {
    private final pcc pcc;

    public oo(pcc pccVar) {
        this.pcc = pccVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.gm();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.oo();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.vj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.wh();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.qf();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.ork();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        if (of.vj(this.pcc.pcc)) {
            return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo;
        }
        return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.vh();
        }
        return null;
    }
}
