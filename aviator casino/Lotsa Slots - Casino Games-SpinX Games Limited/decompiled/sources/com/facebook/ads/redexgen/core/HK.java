package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class HK {
    public static byte[] A02;
    public static final java.util.regex.Pattern A03;
    public int A00 = -1;
    public int A01 = -1;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 62, 69, 46, 51, 39, Byte.MAX_VALUE, 51, 120, 95, 51, 88, 67, 101, 38, 99, 62, 54, 69, 46, 51, 39, Byte.MAX_VALUE, 51, 120, 95, 51, 88, 67, 101, 38, 99, 55, 62, 54, 69, 46, 51, 39, Byte.MAX_VALUE, 51, 120, 95, 51, 88, 67, 101, 38, 99, 55, 40, 36, 38, 101, 42, 59, 59, 39, 46, 101, 34, com.google.common.base.Ascii.US, 62, 37, 46, 56, 86, 107, 74, 81, 108, 114, 111, 125};
    }

    static {
        A01();
        A03 = java.util.regex.Pattern.compile(A00(0, 50, 25));
    }

    private boolean A02(java.lang.String str) {
        java.util.regex.Matcher matcher = A03.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = java.lang.Integer.parseInt((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(matcher.group(1)), 16);
                int parseInt2 = java.lang.Integer.parseInt((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.A00 = parseInt;
                    this.A01 = parseInt2;
                    return true;
                }
                return false;
            } catch (java.lang.NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i) {
        int encoderPadding = i >> 12;
        int encoderDelay = i & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A05(com.facebook.ads.androidx.media3.common.Metadata metadata) {
        for (int i = 0; i < i; i++) {
            com.facebook.ads.androidx.media3.common.Metadata.Entry A032 = metadata.A03(i);
            boolean z = A032 instanceof com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame;
            java.lang.String A00 = A00(66, 8, 56);
            if (z) {
                com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame commentFrame = (com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame) A032;
                if (A00.equals(commentFrame.A00) && A02(commentFrame.A02)) {
                    return true;
                }
            } else if (A032 instanceof com.facebook.ads.androidx.media3.extractor.metadata.id3.InternalFrame) {
                com.facebook.ads.androidx.media3.extractor.metadata.id3.InternalFrame internalFrame = (com.facebook.ads.androidx.media3.extractor.metadata.id3.InternalFrame) A032;
                if (A00(50, 16, 76).equals(internalFrame.A01) && A00.equals(internalFrame.A00) && A02(internalFrame.A02)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
