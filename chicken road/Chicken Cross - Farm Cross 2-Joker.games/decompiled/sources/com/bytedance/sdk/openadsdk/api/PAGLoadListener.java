package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.qf;

/* loaded from: classes4.dex */
public interface PAGLoadListener<Ad> extends qf {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.qf
    void onError(int i, String str);
}
