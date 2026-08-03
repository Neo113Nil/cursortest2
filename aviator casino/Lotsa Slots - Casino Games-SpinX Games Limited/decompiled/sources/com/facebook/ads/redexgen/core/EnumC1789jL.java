package com.facebook.ads.redexgen.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$Source;", "", "<init>", "(Ljava/lang/String;I)V", "PREALLOCATE", "RENDERER", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.jL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class EnumC1789jL {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"rZXWte666DrLsHPXoqDaJnENYxWgqi71", "qMs7Jpkjo6B4WXMo8buLNP4YVnGGOO84", "YRIecdWAq5cWjgqhOuL8Ww5BoTNcrIze", "AByNt8kh1UJ42iFdWHQ9AlvMpeOzBj1N", "TtlAFxYjvYaGMd2rBwLXiq144cixnhml", "0tQELiow6fswCTTeRUqvQMculdEzTfkG", "bUbYkP8pksg9sIq7o6TggR0molp8Rj4l", "BmPEJaYEGSD1ZlHIDmqiSE8I7JHRaK4U"};
    public static final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC0566Ac A02;
    public static final /* synthetic */ com.facebook.ads.redexgen.core.EnumC1789jL[] A03;
    public static final com.facebook.ads.redexgen.core.EnumC1789jL A04;
    public static final com.facebook.ads.redexgen.core.EnumC1789jL A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(16) == 'F') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[5] = "OpZAEcbarzEwXZVKbMNcbnzwzo5b5CZv";
            strArr[7] = "K81mqq1BRjiJt0SW846JOs7Zv9TlCW8P";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 73);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-6, -4, -17, -21, -10, -10, -7, -19, -21, -2, -17, -63, -76, -67, -77, -76, -63, -76, -63};
    }

    public static final /* synthetic */ com.facebook.ads.redexgen.core.EnumC1789jL[] A02() {
        com.facebook.ads.redexgen.core.EnumC1789jL[] enumC1789jLArr = new com.facebook.ads.redexgen.core.EnumC1789jL[2];
        com.facebook.ads.redexgen.core.EnumC1789jL enumC1789jL = A04;
        java.lang.String[] strArr = A01;
        if (strArr[5].charAt(11) == strArr[7].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        A01[4] = "Fkm6UCeGNRQRi4wWDBIOpvvd9TujRbQP";
        enumC1789jLArr[0] = enumC1789jL;
        enumC1789jLArr[1] = A05;
        return enumC1789jLArr;
    }

    static {
        A01();
        A04 = new com.facebook.ads.redexgen.core.EnumC1789jL(A00(0, 11, 97), 0);
        A05 = new com.facebook.ads.redexgen.core.EnumC1789jL(A00(11, 8, 38), 1);
        A03 = A02();
        A02 = com.facebook.ads.redexgen.core.AbstractC2213qd.A01(A03);
    }

    public EnumC1789jL(java.lang.String str, int i) {
    }

    public static com.facebook.ads.redexgen.core.EnumC1789jL valueOf(java.lang.String str) {
        return (com.facebook.ads.redexgen.core.EnumC1789jL) java.lang.Enum.valueOf(com.facebook.ads.redexgen.core.EnumC1789jL.class, str);
    }

    public static com.facebook.ads.redexgen.core.EnumC1789jL[] values() {
        return (com.facebook.ads.redexgen.core.EnumC1789jL[]) A03.clone();
    }
}
