package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes4.dex */
public enum gbb {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int oo;

    gbb(int i) {
        this.oo = i;
    }

    public int pcc() {
        return this.oo;
    }

    public static gbb pcc(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    public static gbb pcc(String str) {
        str.hashCode();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(str)));
        }
    }
}
