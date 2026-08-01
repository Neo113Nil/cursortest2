package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.qf;

/* loaded from: classes4.dex */
public interface IADLoader<R extends PAGRequest, L extends qf> {
    void loadAd(String str, R r, L l);
}
