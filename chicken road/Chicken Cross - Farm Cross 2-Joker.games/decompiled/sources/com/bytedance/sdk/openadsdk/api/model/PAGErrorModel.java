package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes4.dex */
public class PAGErrorModel {
    private final int pcc;
    private final String sf;

    public PAGErrorModel(int i, String str) {
        this.pcc = i;
        this.sf = str;
    }

    public int getErrorCode() {
        return this.pcc;
    }

    public String getErrorMessage() {
        return this.sf;
    }
}
