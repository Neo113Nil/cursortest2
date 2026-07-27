package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes4.dex */
public class PAGRewardItem {
    private final int pcc;
    private final String sf;

    public PAGRewardItem(int i, String str) {
        this.pcc = i;
        this.sf = str;
    }

    public int getRewardAmount() {
        return this.pcc;
    }

    public String getRewardName() {
        return this.sf;
    }
}
