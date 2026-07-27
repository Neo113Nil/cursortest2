package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.8A, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8A {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C3338no A00;
    public C3338no A01;
    public C3338no A02;
    public BP<C3338no> A03 = BP.A03();
    public AbstractC3382oX<C3338no, Timeline> A04 = AbstractC3382oX.A04();
    public final C3457pl A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3338no A00(InterfaceC16933b interfaceC16933b, BP<C3338no> bp, C3338no c3338no, C3457pl c3457pl) {
        int i;
        int i2;
        Timeline A7g = interfaceC16933b.A7g();
        int A7c = interfaceC16933b.A7c();
        Object A0M = A7g.A0N() ? null : A7g.A0M(A7c);
        if (!interfaceC16933b.AAd()) {
            boolean A0N = A7g.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (!A0N) {
                i = A7g.A0H(A7c, c3457pl).A07(C5C.A0O(interfaceC16933b.A7e()) - c3457pl.A0C());
                for (i2 = 0; i2 < bp.size(); i2++) {
                    C3338no c3338no2 = bp.get(i2);
                    if (A04(c3338no2, A0M, interfaceC16933b.AAd(), interfaceC16933b.A7Y(), interfaceC16933b.A7Z(), i)) {
                        return c3338no2;
                    }
                }
                if (bp.isEmpty() && c3338no != null) {
                    if (!A04(c3338no, A0M, interfaceC16933b.AAd(), interfaceC16933b.A7Y(), interfaceC16933b.A7Z(), i)) {
                        return c3338no;
                    }
                }
                return null;
            }
        }
        i = -1;
        while (i2 < bp.size()) {
        }
        if (bp.isEmpty()) {
            if (!A04(c3338no, A0M, interfaceC16933b.AAd(), interfaceC16933b.A7Y(), interfaceC16933b.A7Z(), i)) {
            }
        }
        return null;
    }

    public C8A(C3457pl c3457pl) {
        this.A05 = c3457pl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C3380oV<C3338no, Timeline> A03 = AbstractC3382oX.A03();
        if (this.A03.isEmpty()) {
            A03(A03, this.A01, timeline);
            C3338no c3338no = this.A02;
            C3338no c3338no2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!CB.A01(c3338no, c3338no2)) {
                A03(A03, this.A02, timeline);
            }
            if (!CB.A01(this.A00, this.A01) && !CB.A01(this.A00, this.A02)) {
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
    private void A03(C3380oV<C3338no, Timeline> c3380oV, C3338no c3338no, Timeline timeline) {
        if (c3338no == null) {
            return;
        }
        if (timeline.A0A(c3338no.A04) != -1) {
            c3380oV.A05(c3338no, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c3338no);
        if (existingTimeline == null) {
            return;
        }
        c3380oV.A05(c3338no, existingTimeline);
    }

    public static boolean A04(C3338no c3338no, Object obj, boolean z, int i, int i2, int i3) {
        if (c3338no.A04.equals(obj)) {
            return (z && c3338no.A00 == i && c3338no.A01 == i2) || (!z && c3338no.A00 == -1 && c3338no.A02 == i3);
        }
        return false;
    }

    public final Timeline A05(C3338no c3338no) {
        return this.A04.get(c3338no);
    }

    public final C3338no A06() {
        return this.A00;
    }

    public final void A07(InterfaceC16933b interfaceC16933b) {
        this.A00 = A00(interfaceC16933b, this.A03, this.A01, this.A05);
        A02(interfaceC16933b.A7g());
    }
}
