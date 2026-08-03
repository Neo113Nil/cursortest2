package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ef, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0668Ef {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"XChyMIA3IiBLGVc4JUcuiIFhw0olIHd5", "L1RbhyPLCDSvJWoCYJVALOKwr45Jj", "4i4NfCjlBic1LnGuByjRmO6XDD8s", "fp6arCeubKdlGGxkl3wydgWAbBMIIbeF", "pgUH6rfDE1GExBA3fVJRXk8gj61UjiI1", "O5JAn4ITNRkPEp9cAHFgOejRoj0rukGX", "JccK1QqImqh6kMtQx4F4QpK5m5M4", "faWXzGQd6eAsmBqhrITpsBscnTY0oqi8"};
    public android.media.Spatializer.OnSpatializerStateChangedListener A00;
    public android.os.Handler A01;
    public final android.media.Spatializer A02;
    public final boolean A03;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{101, 113, 96, 109, 107, 88, 76, 93, 80, 86, com.google.common.base.Ascii.SYN, 92, 88, 90, 10, com.google.common.base.Ascii.DC4, 83, 86, 90};
    }

    static {
        A02();
    }

    public C0668Ef(android.media.Spatializer spatializer) {
        this.A02 = spatializer;
        this.A03 = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static com.facebook.ads.redexgen.core.C0668Ef A00(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService(A01(0, 5, 33));
        if (audioManager == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C0668Ef(audioManager.getSpatializer());
    }

    public final void A03(com.facebook.ads.redexgen.core.C05539h c05539h, android.os.Looper looper) {
        if (this.A00 != null || this.A01 != null) {
            return;
        }
        this.A00 = new com.facebook.ads.redexgen.core.C0667Ee(this, c05539h);
        this.A01 = new android.os.Handler(looper);
        android.media.Spatializer spatializer = this.A02;
        android.os.Handler handler = this.A01;
        java.util.Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new com.facebook.ads.redexgen.core.C9N(handler), this.A00);
    }

    public final boolean A04() {
        return this.A02.isAvailable();
    }

    public final boolean A05() {
        return this.A02.isEnabled();
    }

    public final boolean A06() {
        return this.A03;
    }

    public final boolean A07(com.facebook.ads.redexgen.core.C2202qQ c2202qQ, com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        int i;
        if (A01(5, 14, 28).equals(c2196qI.A0W) && c2196qI.A06 == 16) {
            i = 12;
        } else {
            i = c2196qI.A06;
        }
        android.media.AudioFormat.Builder encoding = new android.media.AudioFormat.Builder().setEncoding(2);
        int linearChannelCount = com.facebook.ads.redexgen.core.C5C.A01(i);
        android.media.AudioFormat.Builder channelMask = encoding.setChannelMask(linearChannelCount);
        if (c2196qI.A0G != -1) {
            int linearChannelCount2 = c2196qI.A0G;
            channelMask.setSampleRate(linearChannelCount2);
        }
        android.media.Spatializer spatializer = this.A02;
        android.media.AudioAttributes audioAttributes = c2202qQ.A01().A00;
        android.media.AudioFormat build = channelMask.build();
        if (A05[1].length() != 29) {
            throw new java.lang.RuntimeException();
        }
        A05[5] = "fxex8oBXLxgy8X4V5eG1x3lhnMHn34Gl";
        return spatializer.canBeSpatialized(audioAttributes, build);
    }
}
