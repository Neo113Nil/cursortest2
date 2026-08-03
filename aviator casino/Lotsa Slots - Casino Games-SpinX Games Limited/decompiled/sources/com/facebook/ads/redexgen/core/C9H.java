package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9H, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9H {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"rRI8qFzkORd3qFRWXYKq4VZ7aOLIEK5J", "8iww", "9Fk01UJleHjJYWOvUCOjDovINy", "Tv7H9N81DtUxkF43CmkgrLrGhTLdsXix", "nBkKdwNSwO57UCO3SoKJGDMTXuqjBDbM", "lOXwNuIjFjHmQAdnwK2N8OZR9kPb", "lPFUJhDD1cvxNL1LCxfPRC2f3Pky1Kvn", "6r"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final com.facebook.ads.redexgen.core.C2196qI A07;
    public final boolean A08;
    public final com.facebook.ads.redexgen.core.InterfaceC04063k[] A09;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{5, 36, 39, 32, 52, 45, 53, 0, 52, 37, 40, 46, com.google.common.base.Ascii.DC2, 40, 47, 42, 40, 63, 35, 38, 46, com.google.common.base.Ascii.VT, 63, 46, 35, 37, com.google.common.base.Ascii.RS, 56, 43, 41, 33, 112, 106, 57, 62, 43, 62, 47, 119, 111, 46, 102, 106, 43, 63, 46, 35, 37, com.google.common.base.Ascii.RS, 56, 43, 41, 33, com.google.common.base.Ascii.VT, 38, 38, 37, 41, 43, 62, 47, 46, 100, 45, 47, 62, 98, 99, 119, 111, 46};
    }

    static {
        A07();
    }

    public C9H(com.facebook.ads.redexgen.core.C2196qI c2196qI, int i, int i2, int i3, int i4, int i5, int i6, int i7, com.facebook.ads.redexgen.core.InterfaceC04063k[] interfaceC04063kArr, boolean z) {
        this.A07 = c2196qI;
        this.A01 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A00 = i7;
        this.A09 = interfaceC04063kArr;
        this.A08 = z;
    }

    public static android.media.AudioAttributes A00() {
        return new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public static android.media.AudioAttributes A01(com.facebook.ads.redexgen.core.C2202qQ c2202qQ, boolean z) {
        if (z) {
            return A00();
        }
        return c2202qQ.A01().A00;
    }

    private android.media.AudioTrack A02(com.facebook.ads.redexgen.core.C2202qQ c2202qQ, int i) {
        int A04 = com.facebook.ads.redexgen.core.C5C.A04(c2202qQ.A05);
        if (i != 0) {
            return new android.media.AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1, i);
        }
        return new android.media.AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1);
    }

    private android.media.AudioTrack A03(boolean z, com.facebook.ads.redexgen.core.C2202qQ c2202qQ, int i) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 29) {
            return A05(z, c2202qQ, i);
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 21) {
            return A04(z, c2202qQ, i);
        }
        android.media.AudioTrack A02 = A02(c2202qQ, i);
        java.lang.String[] strArr = A0B;
        if (strArr[5].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0B;
        strArr2[5] = "QYyaIvQJX9uBRZ92y0XmWMx9BnIt";
        strArr2[7] = "OM";
        return A02;
    }

    private android.media.AudioTrack A04(boolean z, com.facebook.ads.redexgen.core.C2202qQ c2202qQ, int i) {
        android.media.AudioFormat A0D;
        android.media.AudioAttributes A01 = A01(c2202qQ, z);
        A0D = com.facebook.ads.redexgen.core.C2077oM.A0D(this.A06, this.A02, this.A03);
        return new android.media.AudioTrack(A01, A0D, this.A00, 1, i);
    }

    private android.media.AudioTrack A05(boolean z, com.facebook.ads.redexgen.core.C2202qQ c2202qQ, int i) {
        android.media.AudioFormat A0D;
        A0D = com.facebook.ads.redexgen.core.C2077oM.A0D(this.A06, this.A02, this.A03);
        android.media.AudioAttributes audioTrackAttributes = A01(c2202qQ, z);
        android.media.AudioTrack.Builder audioFormat = new android.media.AudioTrack.Builder().setAudioAttributes(audioTrackAttributes).setAudioFormat(A0D);
        boolean z2 = true;
        android.media.AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i);
        if (this.A04 != 1) {
            z2 = false;
        }
        android.media.AudioTrack build = sessionId.setOffloadedPlayback(z2).build();
        java.lang.String[] strArr = A0B;
        if (strArr[4].length() == strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A0B[1] = "btQ69Jh";
        return build;
    }

    public final long A08(long j) {
        return (1000000 * j) / this.A06;
    }

    public final long A09(long j) {
        return (1000000 * j) / this.A07.A0G;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D23918943: Monitor the audio track usage through audioTrackAllocated")
    public final android.media.AudioTrack A0A(boolean z, com.facebook.ads.redexgen.core.C2202qQ c2202qQ, int i) throws com.facebook.ads.redexgen.core.C05438t {
        try {
            android.media.AudioTrack A03 = A03(z, c2202qQ, i);
            com.facebook.ads.redexgen.core.C2077oM.A0M().incrementAndGet();
            int state = A03.getState();
            if (state == 1) {
                return A03;
            }
            try {
                A03.release();
                com.facebook.ads.redexgen.core.C2077oM.A0M().decrementAndGet();
            } catch (java.lang.Exception e) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A08(A06(0, 16, 69), java.lang.String.format(A06(16, 55, 78), java.lang.Integer.valueOf(state), java.lang.Integer.valueOf(com.facebook.ads.redexgen.core.C2077oM.A0M().get())), e);
            }
            throw new com.facebook.ads.redexgen.core.C05438t(state, this.A06, this.A02, this.A00, this.A07, A0D(), null, com.facebook.ads.redexgen.core.C2077oM.A0M().get());
        } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e2) {
            throw new com.facebook.ads.redexgen.core.C05438t(0, this.A06, this.A02, this.A00, this.A07, A0D(), e2, com.facebook.ads.redexgen.core.C2077oM.A0M().get());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.8r] */
    public final com.facebook.ads.redexgen.core.C05418r A0B() {
        final int i = this.A03;
        final int i2 = this.A06;
        final int i3 = this.A02;
        final boolean z = this.A08;
        final boolean z2 = this.A04 == 1;
        final int i4 = this.A00;
        return new java.lang.Object(i, i2, i3, z, z2, i4) { // from class: com.facebook.ads.redexgen.X.8r
            public final int A00;
            public final int A01;
            public final int A02;
            public final int A03;
            public final boolean A04;
            public final boolean A05;

            {
                this.A02 = i;
                this.A03 = i2;
                this.A01 = i3;
                this.A05 = z;
                this.A04 = z2;
                this.A00 = i4;
            }
        };
    }

    public final com.facebook.ads.redexgen.core.C9H A0C(int i) {
        return new com.facebook.ads.redexgen.core.C9H(this.A07, this.A01, this.A04, this.A05, this.A06, this.A02, this.A03, i, this.A09, this.A08);
    }

    public final boolean A0D() {
        return this.A04 == 1;
    }

    public final boolean A0E(com.facebook.ads.redexgen.core.C9H c9h) {
        return c9h.A04 == this.A04 && c9h.A03 == this.A03 && c9h.A06 == this.A06 && c9h.A02 == this.A02 && c9h.A05 == this.A05;
    }
}
