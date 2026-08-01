package com.bytedance.sdk.openadsdk.api.init;

/* loaded from: classes4.dex */
public class PAGBidError {
    private int pcc;
    private String sf;

    public PAGBidError(int i, String str) {
        this.pcc = i;
        this.sf = str;
    }

    public int getCode() {
        return this.pcc;
    }

    public String getMessage() {
        return this.sf;
    }
}
