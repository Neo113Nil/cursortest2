package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.6c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01966c {
    public static String[] A0B = {"ytES6GjYCCZeLRsctY", "", "JAF1Tg0UjyffIggj5BNMmxVlRkgdhjMr", "rlk3ZCySajOx3", "MCGN0v", "", "6TmcGiXQ57FFOBCo2j", "Z1k2a4cknNke6aCh8ssxRFJ66FmodiBm"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C6Y A04;
    public C6Y A05;
    public C6Y A06;
    public Object A07;
    public boolean A08;
    public final C1801oN A09 = new C1801oN();
    public final C1799oL A0A = new C1799oL();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1677mL A06(Timeline timeline, Object obj, long j, long j2, C1801oN c1801oN) {
        timeline.A0J(obj, c1801oN);
        int A08 = c1801oN.A08(j);
        return A08 == -1 ? new C1677mL(obj, j2) : new C1677mL(obj, A08, c1801oN.A05(A08), j2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C6Z A0I(Timeline timeline, C6Z c6z) {
        long j = c6z.A01;
        boolean A08 = A08(timeline, c6z.A04, j);
        boolean A09 = A09(timeline, c6z.A04, A08);
        timeline.A0J(c6z.A04.A04, this.A09);
        return new C6Z(c6z.A04, c6z.A03, j, c6z.A02, c6z.A04.A00() ? this.A09.A0E(c6z.A04.A00, c6z.A04.A01) : j == Long.MIN_VALUE ? this.A09.A0A() : j, A08, A09);
    }

    private long A00(Timeline timeline, Object obj) {
        int oldFrontPeriodIndex;
        int holderWindowIndex = timeline.A0J(obj, this.A09).A00;
        if (this.A07 != null && (oldFrontPeriodIndex = timeline.A0A(this.A07)) != -1) {
            int windowIndex = timeline.A0H(oldFrontPeriodIndex, this.A09).A00;
            if (windowIndex == holderWindowIndex) {
                return this.A03;
            }
        }
        for (C6Y mediaPeriodHolder = A0D(); mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.A0I()) {
            if (mediaPeriodHolder.A08.equals(obj)) {
                return mediaPeriodHolder.A00.A04.A03;
            }
        }
        for (C6Y A0D = A0D(); A0D != null; A0D = A0D.A0I()) {
            int A0A = timeline.A0A(A0D.A08);
            if (A0A != -1) {
                int windowIndex2 = timeline.A0H(A0A, this.A09).A00;
                if (windowIndex2 == holderWindowIndex) {
                    return A0D.A00.A04.A03;
                }
            }
        }
        long j = this.A02;
        this.A02 = 1 + j;
        return j;
    }

    private C6Z A01(Timeline timeline, C6Y c6y, long j) {
        long j2;
        C01966c c01966c = this;
        C6Z c6z = c6y.A00;
        if (c6z.A07) {
            int A0A = timeline.A0A(c6z.A04.A04);
            C1801oN c1801oN = c01966c.A09;
            C1799oL c1799oL = c01966c.A0A;
            int currentPeriodIndex = c01966c.A01;
            int A09 = timeline.A09(A0A, c1801oN, c1799oL, currentPeriodIndex, c01966c.A08);
            if (A09 == -1) {
                return null;
            }
            int i = timeline.A0I(A09, c01966c.A09, true).A00;
            Object obj = c01966c.A09.A04;
            long j3 = c6z.A04.A03;
            if (timeline.A0K(i, c01966c.A0A).A00 == A09) {
                Pair<Object, Long> defaultPosition = timeline.A0F(c01966c.A0A, c01966c.A09, i, -9223372036854775807L, Math.max(0L, (c6y.A0B() + c6z.A00) - j));
                if (defaultPosition == null) {
                    return null;
                }
                obj = defaultPosition.first;
                j2 = ((Long) defaultPosition.second).longValue();
                C6Y A0I = c6y.A0I();
                if (A0I != null && A0I.A08.equals(obj)) {
                    j3 = A0I.A00.A04.A03;
                    c01966c = this;
                } else {
                    c01966c = this;
                    j3 = c01966c.A02;
                    long startPositionUs = 1 + j3;
                    String[] strArr = A0B;
                    if (strArr[6].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    A0B[0] = "5yy5YdDharfiXP";
                    c01966c.A02 = startPositionUs;
                }
            } else {
                j2 = 0;
            }
            return A02(timeline, A06(timeline, obj, j2, j3, c01966c.A09), j2, j2);
        }
        C1677mL c1677mL = c6z.A04;
        timeline.A0J(c1677mL.A04, c01966c.A09);
        if (c1677mL.A00()) {
            int i2 = c1677mL.A00;
            int A04 = c01966c.A09.A04(i2);
            if (A04 != -1) {
                int A06 = c01966c.A09.A06(i2, c1677mL.A01);
                if (A06 < A04) {
                    if (!c01966c.A09.A0I(i2, A06)) {
                        return null;
                    }
                    return A03(timeline, c1677mL.A04, i2, A06, c6z.A02, c1677mL.A03);
                }
                return A04(timeline, c1677mL.A04, c6z.A02, c1677mL.A03);
            }
            String[] strArr2 = A0B;
            if (strArr2[5].length() != strArr2[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0B;
            strArr3[5] = "";
            strArr3[1] = "";
            return null;
        }
        if (c6z.A01 != Long.MIN_VALUE) {
            int A08 = c01966c.A09.A08(c6z.A01);
            if (A08 == -1) {
                return A04(timeline, c1677mL.A04, c6z.A01, c1677mL.A03);
            }
            int A05 = c01966c.A09.A05(A08);
            if (!c01966c.A09.A0I(A08, A05)) {
                return null;
            }
            return A03(timeline, c1677mL.A04, A08, A05, c6z.A01, c1677mL.A03);
        }
        int A03 = c01966c.A09.A03();
        if (A03 == 0) {
            return null;
        }
        int i3 = A03 - 1;
        if (A0B[7].charAt(7) == 'k') {
            A0B[0] = "u0JZC9rSowd61rcMlDOlOE";
            if (c01966c.A09.A0D(i3) != Long.MIN_VALUE) {
                return null;
            }
        } else if (c01966c.A09.A0D(i3) != Long.MIN_VALUE) {
            return null;
        }
        if (c01966c.A09.A0H(i3)) {
            return null;
        }
        int A052 = c01966c.A09.A05(i3);
        if (!c01966c.A09.A0I(i3, A052)) {
            return null;
        }
        return A03(timeline, c1677mL.A04, i3, A052, c01966c.A09.A0A(), c1677mL.A03);
    }

    private C6Z A02(Timeline timeline, C1677mL c1677mL, long j, long j2) {
        timeline.A0J(c1677mL.A04, this.A09);
        if (c1677mL.A00()) {
            if (!this.A09.A0I(c1677mL.A00, c1677mL.A01)) {
                return null;
            }
            return A03(timeline, c1677mL.A04, c1677mL.A00, c1677mL.A01, j, c1677mL.A03);
        }
        return A04(timeline, c1677mL.A04, j2, c1677mL.A03);
    }

    private C6Z A03(Timeline timeline, Object obj, int i, int i2, long startPositionUs, long j) {
        long j2;
        C1677mL c1677mL = new C1677mL(obj, i, i2, j);
        boolean A08 = A08(timeline, c1677mL, Long.MIN_VALUE);
        boolean A09 = A09(timeline, c1677mL, A08);
        long A0E = timeline.A0J(c1677mL.A04, this.A09).A0E(c1677mL.A00, c1677mL.A01);
        if (i2 == this.A09.A05(i)) {
            C1801oN c1801oN = this.A09;
            if (A0B[0].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[6] = "btiW32P1CxlKUaykVb";
            strArr[4] = "aD0NnH";
            j2 = c1801oN.A09();
        } else {
            j2 = 0;
        }
        return new C6Z(c1677mL, j2, Long.MIN_VALUE, startPositionUs, A0E, A08, A09);
    }

    private C6Z A04(Timeline timeline, Object obj, long j, long j2) {
        long A0D;
        long j3;
        C1677mL c1677mL = new C1677mL(obj, j2);
        timeline.A0J(c1677mL.A04, this.A09);
        int A07 = this.A09.A07(j);
        if (A07 == -1) {
            A0D = Long.MIN_VALUE;
        } else {
            C1801oN c1801oN = this.A09;
            String[] strArr = A0B;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "hcjC8Oe5bspAHclLrN";
            strArr2[4] = "7U4c4Z";
            A0D = c1801oN.A0D(A07);
        }
        boolean isLastInTimeline = A08(timeline, c1677mL, A0D);
        boolean A09 = A09(timeline, c1677mL, isLastInTimeline);
        if (A0D == Long.MIN_VALUE) {
            j3 = this.A09.A0A();
        } else {
            j3 = A0D;
        }
        return new C6Z(c1677mL, j, A0D, -9223372036854775807L, j3, isLastInTimeline, A09);
    }

    private C6Z A05(C02176x c02176x) {
        return A02(c02176x.A03, c02176x.A05, c02176x.A01, c02176x.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r2[5].length() == r2[1].length()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r3.A00 = A0I(r13, r3.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (A0N() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        r2 = com.instagram.common.viewpoint.core.C01966c.A0B;
        r2[6] = "90zfs8gzmg4UDoZfId";
        r2[4] = "a4jnrj";
        r3.A00 = A0I(r13, r3.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r4 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return true;
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A07(Timeline timeline) {
        C6Y nextMediaPeriodHolder = A0D();
        if (nextMediaPeriodHolder == null) {
            return true;
        }
        int A0A = timeline.A0A(nextMediaPeriodHolder.A08);
        if (A0B[3].length() != 26) {
            A0B[0] = "XXauRi";
            while (true) {
                A0A = timeline.A09(A0A, this.A09, this.A0A, this.A01, this.A08);
                while (lastValidPeriodHolder != null && !nextMediaPeriodHolder.A00.A07) {
                    nextMediaPeriodHolder = nextMediaPeriodHolder.A0I();
                }
                C6Y A0I = nextMediaPeriodHolder.A0I();
                if (A0A == -1 || A0I == null || timeline.A0A(A0I.A08) != A0A) {
                    break;
                }
                nextMediaPeriodHolder = A0I;
                if (A0B[7].charAt(7) != 'k') {
                    break;
                }
                A0B[2] = "Cr1P4n0WQ70sIc2hdXVlmIoPdJb3W1mn";
            }
        }
        throw new RuntimeException();
    }

    private boolean A08(Timeline timeline, C1677mL c1677mL, long j) {
        int adGroupCount = timeline.A0J(c1677mL.A04, this.A09).A03();
        if (adGroupCount == 0) {
            return true;
        }
        int i = adGroupCount - 1;
        boolean A00 = c1677mL.A00();
        if (this.A09.A0D(i) != Long.MIN_VALUE) {
            return !A00 && j == Long.MIN_VALUE;
        }
        int lastAdGroupIndex = this.A09.A04(i);
        if (lastAdGroupIndex == -1) {
            return false;
        }
        if (((A00 && c1677mL.A00 == i && c1677mL.A01 == lastAdGroupIndex + (-1)) ? 1 : 0) == 0) {
            return !A00 && this.A09.A05(i) == lastAdGroupIndex;
        }
        return true;
    }

    private boolean A09(Timeline timeline, C1677mL c1677mL, boolean z) {
        int A0A = timeline.A0A(c1677mL.A04);
        return !timeline.A0K(timeline.A0H(A0A, this.A09).A00, this.A0A).A0D && timeline.A0O(A0A, this.A09, this.A0A, this.A01, this.A08) && z;
    }

    private boolean A0A(C6Y c6y, C6Z c6z) {
        C6Z c6z2 = c6y.A00;
        return c6z2.A03 == c6z.A03 && c6z2.A01 == c6z.A01 && c6z2.A04.equals(c6z.A04);
    }

    public final C6Y A0B() {
        if (this.A05 != null) {
            if (this.A05 == this.A06) {
                C6Y c6y = this.A05;
                if (A0B[3].length() == 26) {
                    throw new RuntimeException();
                }
                A0B[2] = "cSlSOVjTMxyZvCYIIsIM7Z4RVriFSMIi";
                this.A06 = c6y.A0I();
            }
            this.A05.A0M();
            this.A05 = this.A05.A0I();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
            }
        } else {
            this.A05 = this.A04;
            this.A06 = this.A04;
        }
        C6Y c6y2 = this.A05;
        if (A0B[0].length() != 8) {
            A0B[7] = "hdbErrckm1X5j4dXkt1ObCB8O8NcABpS";
            return c6y2;
        }
        A0B[3] = "prScRK6qkOjWt";
        return c6y2;
    }

    public final C6Y A0C() {
        C3M.A08((this.A06 == null || this.A06.A0I() == null) ? false : true);
        this.A06 = this.A06.A0I();
        return this.A06;
    }

    public final C6Y A0D() {
        return A0N() ? this.A05 : this.A04;
    }

    public final C6Y A0E() {
        return this.A04;
    }

    public final C6Y A0F() {
        return this.A05;
    }

    public final C6Y A0G() {
        return this.A06;
    }

    public final C6Z A0H(long j, C02176x c02176x) {
        if (this.A04 == null) {
            return A05(c02176x);
        }
        return A01(c02176x.A03, this.A04, j);
    }

    public final InterfaceC1678mM A0J(C7D[] c7dArr, long j, EK ek, EO eo, CL cl, C6Z c6z, EL el) {
        long A0B2;
        if (this.A04 != null) {
            A0B2 = this.A04.A0B() + this.A04.A00.A00;
        } else {
            A0B2 = c6z.A03 + j;
        }
        C6Y c6y = new C6Y(c7dArr, A0B2, ek, eo, cl, c6z, el);
        if (this.A04 != null) {
            C3M.A08(A0N());
            this.A04.A0Q(c6y);
        }
        this.A07 = null;
        this.A04 = c6y;
        this.A00++;
        return c6y.A07;
    }

    public final C1677mL A0K(Timeline timeline, Object obj, long j) {
        return A06(timeline, obj, j, A00(timeline, obj), this.A09);
    }

    public final void A0L(long j) {
        if (this.A04 != null) {
            this.A04.A0P(j);
        }
    }

    public final void A0M(boolean z) {
        C6Y A0D = A0D();
        if (A0D != null) {
            this.A07 = z ? A0D.A08 : null;
            this.A03 = A0D.A00.A04.A03;
            A0D.A0M();
            A0S(A0D);
        } else if (!z) {
            this.A07 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0N() {
        return this.A05 != null;
    }

    public final boolean A0O() {
        if (this.A04 != null) {
            if (!this.A04.A00.A05 && this.A04.A0R()) {
                long j = this.A04.A00.A00;
                if (A0B[2].charAt(6) == 'F') {
                    throw new RuntimeException();
                }
                A0B[3] = "WQJhcBpqvfFlde6mvMcdcISTeYvrM";
                if (j == -9223372036854775807L || this.A00 >= 100) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A0P(Timeline timeline, int i) {
        this.A01 = i;
        return A07(timeline);
    }

    public final boolean A0Q(Timeline timeline, C1677mL c1677mL, long j) {
        int A0A = timeline.A0A(c1677mL.A04);
        C6Y c6y = null;
        for (C6Y A0D = A0D(); A0D != null; A0D = A0D.A0I()) {
            if (c6y == null) {
                A0D.A00 = A0I(timeline, A0D.A00);
            } else {
                if (A0A != -1) {
                    boolean equals = A0D.A08.equals(timeline.A0M(A0A));
                    if (A0B[3].length() == 26) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0B;
                    strArr[6] = "ytUDxXblB5dYuzkyb9";
                    strArr[4] = "n5GR8r";
                    if (equals) {
                        C6Z A01 = A01(timeline, c6y, j);
                        if (A01 == null) {
                            return true ^ A0S(c6y);
                        }
                        A0D.A00 = A0I(timeline, A0D.A00);
                        if (!A0A(A0D, A01)) {
                            return true ^ A0S(c6y);
                        }
                    }
                }
                return true ^ A0S(c6y);
            }
            if (A0D.A00.A07) {
                A0A = timeline.A09(A0A, this.A09, this.A0A, this.A01, this.A08);
            }
            c6y = A0D;
        }
        return true;
    }

    public final boolean A0R(Timeline timeline, boolean z) {
        this.A08 = z;
        return A07(timeline);
    }

    public final boolean A0S(C6Y c6y) {
        C3M.A08(c6y != null);
        boolean z = false;
        this.A04 = c6y;
        while (c6y.A0I() != null) {
            c6y = c6y.A0I();
            if (c6y == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c6y.A0M();
            this.A00--;
        }
        this.A04.A0Q(null);
        return z;
    }

    public final boolean A0T(InterfaceC1678mM interfaceC1678mM) {
        return this.A04 != null && this.A04.A07 == interfaceC1678mM;
    }
}
