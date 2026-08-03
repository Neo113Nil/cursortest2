package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Y6 {
    public static java.lang.String[] A00 = {"AGgEj", "LH3rgKkNmktwVHG5nPeK3WsWN7516Jzs", "CK3U371aKg", "MTDWSiS44OE4PV9OKyjdrXQDz2py4IOF", "ej0x21azMZ2lcGnVvFT8lesJnsiudKto", "2BAFbYQr8kMnD6mhXZkfB", "qOS", "n1iHeVYqIlmDLMhT9hH5ssiOIOX1l9w9"};

    public static com.facebook.ads.redexgen.core.EnumC1523et A00(com.facebook.ads.VideoStartReason videoStartReason) {
        switch (videoStartReason) {
            case AUTO_STARTED:
                com.facebook.ads.redexgen.core.EnumC1523et enumC1523et = com.facebook.ads.redexgen.core.EnumC1523et.A02;
                if (A00[2].length() != 10) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A00;
                strArr[5] = "lDchC145wsMmgVMbBHFb3";
                strArr[0] = "IYy0G";
                return enumC1523et;
            case NOT_STARTED:
                return com.facebook.ads.redexgen.core.EnumC1523et.A03;
            case USER_STARTED:
                return com.facebook.ads.redexgen.core.EnumC1523et.A04;
            default:
                return com.facebook.ads.redexgen.core.EnumC1523et.A03;
        }
    }
}
