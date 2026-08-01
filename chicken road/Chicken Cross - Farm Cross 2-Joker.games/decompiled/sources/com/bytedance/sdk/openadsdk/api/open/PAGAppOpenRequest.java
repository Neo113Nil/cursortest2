package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes4.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int pcc;

    public int getTimeout() {
        return this.pcc;
    }

    public void setTimeout(int i) {
        this.pcc = i;
    }
}
