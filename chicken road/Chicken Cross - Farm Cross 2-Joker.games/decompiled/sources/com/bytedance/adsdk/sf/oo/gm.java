package com.bytedance.adsdk.sf.oo;

/* loaded from: classes4.dex */
public enum gm {
    JSON(".json"),
    ZIP(".zip");

    public final String gm;

    gm(String str) {
        this.gm = str;
    }

    public String pcc() {
        return ".temp" + this.gm;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.gm;
    }
}
