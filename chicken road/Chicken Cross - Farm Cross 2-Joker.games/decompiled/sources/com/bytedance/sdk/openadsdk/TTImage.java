package com.bytedance.sdk.openadsdk;

/* loaded from: classes4.dex */
public class TTImage {
    private final String gm;
    private double oo;
    private final int pcc;
    private final int sf;

    public TTImage(int i, int i2, String str, double d) {
        this.pcc = i;
        this.sf = i2;
        this.gm = str;
        this.oo = d;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, 0.0d);
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

    public double getDuration() {
        return this.oo;
    }

    public boolean isValid() {
        String str;
        return this.pcc > 0 && this.sf > 0 && (str = this.gm) != null && str.length() > 0;
    }
}
