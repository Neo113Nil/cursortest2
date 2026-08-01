package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes4.dex */
public enum hc {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int oo;

    hc(int i) {
        this.oo = i;
    }

    public int pcc() {
        return this.oo;
    }

    public static hc pcc(int i) {
        if (i == 0) {
            return STATIC;
        }
        if (i == 1) {
            return RELATIVE;
        }
        if (i == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    public static hc pcc(String str) {
        str.hashCode();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }
}
