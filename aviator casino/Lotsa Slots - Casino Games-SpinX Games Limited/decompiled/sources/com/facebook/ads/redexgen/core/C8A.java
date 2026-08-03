package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8A, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8A {
    public static java.lang.String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public com.facebook.ads.redexgen.core.C2044no A00;
    public com.facebook.ads.redexgen.core.C2044no A01;
    public com.facebook.ads.redexgen.core.C2044no A02;
    public com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2044no> A03 = com.facebook.ads.redexgen.core.BP.A03();
    public com.facebook.ads.redexgen.core.AbstractC2088oX<com.facebook.ads.redexgen.core.C2044no, com.facebook.ads.androidx.media3.common.Timeline> A04 = com.facebook.ads.redexgen.core.AbstractC2088oX.A04();
    public final com.facebook.ads.redexgen.core.C2163pl A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.redexgen.core.C2044no A00(com.facebook.ads.redexgen.core.InterfaceC03993b interfaceC03993b, com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2044no> bp, com.facebook.ads.redexgen.core.C2044no c2044no, com.facebook.ads.redexgen.core.C2163pl c2163pl) {
        int i;
        int i2;
        com.facebook.ads.androidx.media3.common.Timeline A7g = interfaceC03993b.A7g();
        int A7c = interfaceC03993b.A7c();
        java.lang.Object A0M = A7g.A0N() ? null : A7g.A0M(A7c);
        if (!interfaceC03993b.AAd()) {
            boolean A0N = A7g.A0N();
            java.lang.String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new java.lang.RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (!A0N) {
                i = A7g.A0H(A7c, c2163pl).A07(com.facebook.ads.redexgen.core.C5C.A0O(interfaceC03993b.A7e()) - c2163pl.A0C());
                for (i2 = 0; i2 < bp.size(); i2++) {
                    com.facebook.ads.redexgen.core.C2044no c2044no2 = bp.get(i2);
                    if (A04(c2044no2, A0M, interfaceC03993b.AAd(), interfaceC03993b.A7Y(), interfaceC03993b.A7Z(), i)) {
                        return c2044no2;
                    }
                }
                if (bp.isEmpty() && c2044no != null) {
                    if (!A04(c2044no, A0M, interfaceC03993b.AAd(), interfaceC03993b.A7Y(), interfaceC03993b.A7Z(), i)) {
                        return c2044no;
                    }
                }
                return null;
            }
        }
        i = -1;
        while (i2 < bp.size()) {
        }
        if (bp.isEmpty()) {
            if (!A04(c2044no, A0M, interfaceC03993b.AAd(), interfaceC03993b.A7Y(), interfaceC03993b.A7Z(), i)) {
            }
        }
        return null;
    }

    public C8A(com.facebook.ads.redexgen.core.C2163pl c2163pl) {
        this.A05 = c2163pl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(com.facebook.ads.androidx.media3.common.Timeline timeline) {
        com.facebook.ads.redexgen.core.C2086oV<com.facebook.ads.redexgen.core.C2044no, com.facebook.ads.androidx.media3.common.Timeline> A03 = com.facebook.ads.redexgen.core.AbstractC2088oX.A03();
        if (this.A03.isEmpty()) {
            A03(A03, this.A01, timeline);
            com.facebook.ads.redexgen.core.C2044no c2044no = this.A02;
            com.facebook.ads.redexgen.core.C2044no c2044no2 = this.A01;
            if (A06[4].length() == 25) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!com.facebook.ads.redexgen.core.CB.A01(c2044no, c2044no2)) {
                A03(A03, this.A02, timeline);
            }
            if (!com.facebook.ads.redexgen.core.CB.A01(this.A00, this.A01) && !com.facebook.ads.redexgen.core.CB.A01(this.A00, this.A02)) {
                A03(A03, this.A00, timeline);
            }
        } else {
            for (int i = 0; i < this.A03.size(); i++) {
                A03(A03, this.A03.get(i), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(A03, this.A00, timeline);
            }
        }
        this.A04 = A03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(com.facebook.ads.redexgen.core.C2086oV<com.facebook.ads.redexgen.core.C2044no, com.facebook.ads.androidx.media3.common.Timeline> c2086oV, com.facebook.ads.redexgen.core.C2044no c2044no, com.facebook.ads.androidx.media3.common.Timeline timeline) {
        if (c2044no == null) {
            return;
        }
        if (timeline.A0A(c2044no.A04) != -1) {
            c2086oV.A05(c2044no, timeline);
            return;
        }
        com.facebook.ads.androidx.media3.common.Timeline existingTimeline = this.A04.get(c2044no);
        if (existingTimeline == null) {
            return;
        }
        c2086oV.A05(c2044no, existingTimeline);
    }

    public static boolean A04(com.facebook.ads.redexgen.core.C2044no c2044no, java.lang.Object obj, boolean z, int i, int i2, int i3) {
        if (c2044no.A04.equals(obj)) {
            return (z && c2044no.A00 == i && c2044no.A01 == i2) || (!z && c2044no.A00 == -1 && c2044no.A02 == i3);
        }
        return false;
    }

    public final com.facebook.ads.androidx.media3.common.Timeline A05(com.facebook.ads.redexgen.core.C2044no c2044no) {
        return this.A04.get(c2044no);
    }

    public final com.facebook.ads.redexgen.core.C2044no A06() {
        return this.A00;
    }

    public final void A07(com.facebook.ads.redexgen.core.InterfaceC03993b interfaceC03993b) {
        this.A00 = A00(interfaceC03993b, this.A03, this.A01, this.A05);
        A02(interfaceC03993b.A7g());
    }
}
