package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes4.dex */
public class PAGImageItem {
    private final String gm;
    private float oo;
    private final int pcc;
    private final int sf;

    public PAGImageItem(int i, int i2, String str, float f) {
        this.pcc = i;
        this.sf = i2;
        this.gm = str;
        this.oo = f;
    }

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, 0.0f);
    }

    public int getHeight() {
        return this.pcc;
    }

    public int getWidth() {
        return this.sf;
    }

    public String getImageUrl() {
        return this.gm;
    }

    public float getDuration() {
        return this.oo;
    }
}
