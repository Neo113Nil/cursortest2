package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class HZ {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"W2JHeYWWa9ELcHAI15RIxe4rxnXWWmwk", "jvlLQF6rExXNlz19WHgISGbwTL", "EBuySnurnPPVASsat8Xhk3v9TkFPfMa7", "RYPW7gHfiH7qYGvVsJs3ktsr8U93g5tm", "ZClNIsWZ1G8A3MTEGXpjjoEPMiXhgtof", "D5tWHlyJf58ulipH56j910ebLUAuxbL6", "RihQcpykaCTUXmmxq9jMexUaOMIMy6Jg", "Z9jj6O5eYN9H67mnhWcCV55A3djqvCt0"};
    public static final com.facebook.ads.redexgen.core.HZ A04;
    public final long A00;
    public final long A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 35);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{120, 116, 36, 59, 39, kotlin.io.encoding.Base64.padSymbol, 32, kotlin.io.encoding.Base64.padSymbol, 59, 58, 105, 58, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.FF, 4, 52, com.google.common.base.Ascii.DC2, 92, 37};
    }

    static {
        A01();
        A04 = new com.facebook.ads.redexgen.core.HZ(0L, 0L);
    }

    public HZ(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            java.lang.Class<?> cls = getClass();
            java.lang.Class<?> cls2 = obj.getClass();
            if (A03[2].charAt(20) != 'k') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[0] = "xxeEFU0wzywmupm5o82U4LrsfSXadp98";
            strArr[4] = "8tPKtjPFESzwuJv9uBTgFsWt41X19Dg4";
            if (cls == cls2) {
                com.facebook.ads.redexgen.core.HZ hz = (com.facebook.ads.redexgen.core.HZ) obj;
                return this.A01 == hz.A01 && this.A00 == hz.A00;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final java.lang.String toString() {
        return A00(11, 8, 66) + this.A01 + A00(0, 11, 119) + this.A00 + A00(19, 1, 91);
    }
}
