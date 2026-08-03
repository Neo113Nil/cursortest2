package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1896lD implements com.facebook.ads.redexgen.core.H1 {
    public static java.lang.String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final com.facebook.ads.redexgen.core.C04434v A00;
    public final com.facebook.ads.redexgen.core.AnonymousClass53 A01;

    public C1896lD(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53) {
        this.A01 = anonymousClass53;
        this.A00 = new com.facebook.ads.redexgen.core.C04434v();
    }

    private com.facebook.ads.redexgen.core.C0739Gz A00(com.facebook.ads.redexgen.core.C04434v c04434v, long scrValue, long scrTimeUs) {
        int A00;
        int i = -1;
        int i2 = -1;
        long j = -9223372036854775807L;
        while (c04434v.A07() >= 4) {
            A00 = com.facebook.ads.redexgen.core.C1895lC.A00(c04434v.A0l(), c04434v.A09());
            if (A00 != 442) {
                c04434v.A0g(1);
            } else {
                c04434v.A0g(4);
                long A06 = com.facebook.ads.redexgen.core.L6.A06(c04434v);
                if (A06 != -9223372036854775807L) {
                    long A062 = this.A01.A06(A06);
                    if (A062 > scrValue) {
                        if (j == -9223372036854775807L) {
                            return com.facebook.ads.redexgen.core.C0739Gz.A04(A062, scrTimeUs);
                        }
                        return com.facebook.ads.redexgen.core.C0739Gz.A03(i + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + A062;
                    if (lastScrTimeUsInRange > scrValue) {
                        return com.facebook.ads.redexgen.core.C0739Gz.A03(c04434v.A09() + scrTimeUs);
                    }
                    j = A062;
                    i = c04434v.A09();
                }
                A01(c04434v);
                i2 = c04434v.A09();
            }
        }
        if (j != -9223372036854775807L) {
            return com.facebook.ads.redexgen.core.C0739Gz.A05(j, i2 + scrTimeUs);
        }
        return com.facebook.ads.redexgen.core.C0739Gz.A03;
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A01(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int packStuffingLength;
        int packStuffingLength2;
        int systemHeaderLength = c04434v.A0A();
        if (c04434v.A07() < 10) {
            c04434v.A0f(systemHeaderLength);
            return;
        }
        c04434v.A0g(9);
        int limit = c04434v.A0I();
        int packStuffingLength3 = limit & 7;
        int limit2 = c04434v.A07();
        if (limit2 < packStuffingLength3) {
            c04434v.A0f(systemHeaderLength);
            return;
        }
        c04434v.A0g(packStuffingLength3);
        int limit3 = c04434v.A07();
        if (limit3 < 4) {
            c04434v.A0f(systemHeaderLength);
            return;
        }
        byte[] A0l = c04434v.A0l();
        int limit4 = c04434v.A09();
        packStuffingLength = com.facebook.ads.redexgen.core.C1895lC.A00(A0l, limit4);
        if (packStuffingLength == 443) {
            c04434v.A0g(4);
            int packStuffingLength4 = c04434v.A0M();
            int limit5 = c04434v.A07();
            if (limit5 < packStuffingLength4) {
                c04434v.A0f(systemHeaderLength);
                return;
            }
            c04434v.A0g(packStuffingLength4);
        }
        while (limit >= 4) {
            byte[] A0l2 = c04434v.A0l();
            int limit6 = c04434v.A09();
            packStuffingLength2 = com.facebook.ads.redexgen.core.C1895lC.A00(A0l2, limit6);
            if (packStuffingLength2 == 442 || packStuffingLength2 == 441 || (packStuffingLength2 >>> 8) != 1) {
                return;
            }
            c04434v.A0g(4);
            if (c04434v.A07() < 2) {
                c04434v.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c04434v.A0M();
            int packStuffingLength5 = c04434v.A0A();
            int limit7 = c04434v.A09();
            c04434v.A0f(java.lang.Math.min(packStuffingLength5, limit7 + nextStartCode));
        }
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AFs() {
        this.A00.A0i(com.facebook.ads.redexgen.core.C5C.A07);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final com.facebook.ads.redexgen.core.C0739Gz AIw(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, long j) throws java.io.IOException {
        long A8n = interfaceC1987ms.A8n();
        int min = (int) java.lang.Math.min(20000L, interfaceC1987ms.A8O() - A8n);
        this.A00.A0d(min);
        interfaceC1987ms.AGt(this.A00.A0l(), 0, min);
        return A00(this.A00, j, A8n);
    }
}
