package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8Q, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8Q {
    public static final android.media.AudioAttributes A00 = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int A00(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            android.media.AudioFormat.Builder sampleRate = new android.media.AudioFormat.Builder().setEncoding(i).setSampleRate(i2);
            int channelCount = com.facebook.ads.redexgen.core.C5C.A01(i3);
            android.media.AudioFormat audioFormat = sampleRate.setChannelMask(channelCount).build();
            if (android.media.AudioTrack.isDirectPlaybackSupported(audioFormat, A00)) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public static int[] A01() {
        com.facebook.ads.redexgen.core.AbstractC2088oX abstractC2088oX;
        com.facebook.ads.redexgen.core.C2K A01 = com.facebook.ads.redexgen.core.BP.A01();
        abstractC2088oX = com.facebook.ads.redexgen.core.C8R.A06;
        com.facebook.ads.redexgen.core.C4C it = abstractC2088oX.keySet().iterator();
        while (it.hasNext()) {
            int encoding = ((java.lang.Integer) it.next()).intValue();
            if (android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(encoding).setSampleRate(48000).build(), A00)) {
                A01.A04(java.lang.Integer.valueOf(encoding));
            }
        }
        A01.A04(2);
        return com.facebook.ads.redexgen.core.AbstractC0580As.A0B(A01.A05());
    }
}
