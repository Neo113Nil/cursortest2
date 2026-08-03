package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ge, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0718Ge extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.InterfaceC1178Yi {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"2u2dP7fJh3RTJE0f5j", "V84xfC9vRBWBw28ag3Wa", "AJ9OWsf0IOCB9JkMwpi03POlIdxFWB0O", "t4KHUJW6pNylT", "agpCzVGtSfjd9ImL9ArnGOWeGltiI7KT", "yQxi0n265GvpKMbNVeZVKXQg4YYx4N", "9gQlnw56", "rIoCFSW2UJYE3I7OlTOsSCWVSaoSra"};
    public static final android.widget.RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.C1318bY A03;
    public com.facebook.ads.redexgen.core.AbstractC0775Ij A04;
    public com.facebook.ads.redexgen.core.C1504ea A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.C1795jT A0A;
    public final com.facebook.ads.redexgen.core.InterfaceC1004Rk A0B;
    public final com.facebook.ads.redexgen.core.C1042Sx A0C;
    public final com.facebook.ads.redexgen.core.C1636gi A0D;
    public final com.facebook.ads.redexgen.core.VA A0E;
    public final com.facebook.ads.redexgen.core.VI A0F;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx A0G;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0H;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0I;
    public final com.facebook.ads.redexgen.core.ZU A0J;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.C1454dk> A0K;

    public static java.lang.String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 100);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0I() {
        A0L = new byte[]{-103, -24, -33, -103, -1, 34, -34};
    }

    static {
        A0I();
        A0N = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    public C0718Ge(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ZU zu, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1795jT c1795jT, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        super(c1636gi);
        android.widget.FrameLayout.LayoutParams layoutParams;
        this.A0K = new java.util.ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new com.facebook.ads.redexgen.core.C0722Gi(this);
        this.A0D = c1636gi;
        this.A0J = zu;
        this.A0E = va;
        this.A0A = c1795jT;
        this.A0C = c1042Sx;
        this.A0I = interfaceC1177Yh;
        this.A0F = new com.facebook.ads.redexgen.core.VI(this.A0A.A27(0).A2E(), this.A0E);
        this.A0G = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx(this);
        this.A0G.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A02);
        this.A05 = new com.facebook.ads.redexgen.core.C1504ea(this.A0D, this.A0J, this.A0A.A1G(), interfaceC1177Yh);
        this.A0H = A07();
        if (this.A0A.A1c()) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0u, com.facebook.ads.redexgen.core.XV.A0r, 0, 0);
        } else {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.A0H.getToolbarHeight());
        }
        addView(this.A0H, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (r4.A1L() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        r6.A0H.setToolbarActionMode(0);
        r6.A0D.A0F().A4x();
        r6.A04.A1G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d5, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if (r4.A1L() != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A00() {
        if (!this.A09) {
            if (this.A04 == null || !this.A04.A1M() || this.A0A.A22() != 1 || !this.A04.A1N()) {
                return 0;
            }
            A0X(false, this.A02);
            return 1;
        }
        if (this.A04 != null && this.A04.A1M() && this.A0A.A22() == 1 && !this.A04.A1N()) {
            return 0;
        }
        if (A0Y()) {
            com.facebook.ads.redexgen.core.AbstractC0775Ij abstractC0775Ij = this.A04;
            java.lang.String[] strArr = A0M;
            if (strArr[6].length() != strArr[3].length()) {
                java.lang.String[] strArr2 = A0M;
                strArr2[5] = "AFu5VcCLRWlCVSPev3Ny5pnjuJiPpe";
                strArr2[7] = "Nhy8N08k5Vw4Z8hL9UmI1FpStaZ0OS";
                if (abstractC0775Ij != null && (this.A04.A1M() || this.A0A.A22() == 2 || !this.A04.A1L())) {
                    if (!this.A0A.A2I()) {
                        this.A08 = true;
                    }
                    A0X(false, this.A02);
                    return 2;
                }
            }
            throw new java.lang.RuntimeException();
        }
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.AbstractC0775Ij abstractC0775Ij2 = this.A04;
            java.lang.String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                java.lang.String[] strArr4 = A0M;
                strArr4[2] = "s0FLaM76nMM9Qr7TZwL2usTxvSsXcmqy";
                strArr4[4] = "fT84jb4om2WjLoB8b8HhBoC0fCgiLofU";
            } else {
                java.lang.String[] strArr5 = A0M;
                strArr5[5] = "A7yRQ8ZNY7QUzDAYMeY8X6eQmfD57M";
                strArr5[7] = "dEOP0V0Fm3EsPKfzbtzpY8oiy2RB1y";
            }
            throw new java.lang.RuntimeException();
        }
        if (A0Z() && !A0a()) {
            A0H();
            java.lang.String[] strArr6 = A0M;
            if (strArr6[6].length() != strArr6[3].length()) {
                java.lang.String[] strArr7 = A0M;
                strArr7[6] = "ldx0hXy1";
                strArr7[3] = "A9K45C3zzpDFd";
                return 4;
            }
            throw new java.lang.RuntimeException();
        }
        if ((this.A04 instanceof com.facebook.ads.redexgen.core.C04555h) && A0Y()) {
            A0X(false, this.A02);
            return 5;
        }
        this.A0F.A04(com.facebook.ads.redexgen.core.VH.A07, null);
        A0M(4);
        return 6;
    }

    private int A01(int i) {
        if (this.A0A.A2I()) {
            com.facebook.ads.redexgen.core.C1795jT c1795jT = this.A0A;
            java.lang.String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[5] = "SFVCTE3Hv2F6eV4jkYzgVN3BuZvLlt";
            strArr2[7] = "be2ILDbetBMqGPrAeiZBpkZxeTc1wp";
            if (i < c1795jT.A2B().size() && i >= 0) {
                return this.A0A.A2B().get(i).intValue();
            }
        }
        return this.A0A.A0p();
    }

    public static /* synthetic */ int A03(com.facebook.ads.redexgen.core.C0718Ge c0718Ge, int i) {
        int i2 = c0718Ge.A01 + i;
        c0718Ge.A01 = i2;
        return i2;
    }

    private com.facebook.ads.redexgen.core.AbstractC1171Yb A07() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb pu;
        if (!this.A0A.A1c()) {
            pu = new com.facebook.ads.internal.view.FullScreenAdToolbar(this.A0D, this.A0I, this.A0F, 2, -1, false);
        } else {
            pu = new com.facebook.ads.redexgen.core.PU(this.A0D, this.A0A.A27(this.A00), 2);
        }
        pu.setFullscreen(true);
        pu.setToolbarListener(new com.facebook.ads.redexgen.core.C0719Gf(this));
        return pu;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.facebook.ads.redexgen.core.AbstractC0775Ij A0C(boolean z, int i) {
        boolean z2;
        com.facebook.ads.redexgen.core.C0721Gh c0721Gh = new com.facebook.ads.redexgen.core.C0721Gh(this, i);
        com.facebook.ads.redexgen.core.AbstractC1801jd A27 = this.A0A.A27(this.A00);
        if (A27.A2T()) {
            this.A0H.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1455dl(this));
        }
        if (this.A0A.A2F()) {
            int i2 = this.A00;
            java.lang.String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[0] = "c3gdOFv01Kz0ZnyucW";
            strArr2[1] = "uUEmXxf6IoafQfC48jcO";
            if (i2 > 0) {
                z2 = true;
                boolean z3 = !this.A0A.A2E() && this.A00 > 0;
                java.lang.String A29 = this.A0A.A29();
                if (!A0b(A27)) {
                    int A01 = A01(this.A00);
                    if (A01 == 0) {
                        setUnskippableSecondsComplete(true);
                    }
                    this.A0D.A0F().AJt(com.facebook.ads.redexgen.core.M5.A06);
                    this.A0D.A0F().AJL(this.A00);
                    this.A0D.A0F().A4v(A29);
                    return new com.facebook.ads.redexgen.core.C04555h(this.A0D, this.A0J, this.A00, this.A0E, A27, this.A0I, this.A0H, this.A0F, z2, z3, c0721Gh, A01, this.A0A.A23());
                }
                if (A27.A29().A0T()) {
                    this.A0D.A0F().AJt(com.facebook.ads.redexgen.core.M5.A07);
                    this.A0D.A0F().AJL(this.A00);
                    this.A0D.A0F().A4v(A29);
                    if (this.A0A.A1c()) {
                        return new com.facebook.ads.redexgen.core.AnonymousClass55(this.A0D, this.A0E, this.A0H, A27, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i, z2, z3, c0721Gh, A01(this.A00), this.A0A.A23());
                    }
                    return new com.facebook.ads.redexgen.core.C5F(this.A0D, this.A0E, this.A0H, A27, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i, z2, z3, c0721Gh, A01(this.A00), this.A0A.A23());
                }
                this.A0D.A0F().AJt(com.facebook.ads.redexgen.core.M5.A07);
                this.A0D.A0F().AJL(this.A00);
                this.A0D.A0F().A4v(A29);
                return new com.facebook.ads.redexgen.core.C5S(this.A0D, this.A0E, A27, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, this.A0H, this.A0A.A0p(), i, this.A0A.A22(), z, this.A0A.A24(), this.A0A.A2I(), z2, z3, c0721Gh, A01(this.A00), this.A0A.A23());
            }
        }
        z2 = false;
        if (this.A0A.A2E()) {
        }
        java.lang.String A292 = this.A0A.A29();
        if (!A0b(A27)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        int A00 = A00();
        if (A00 != 0) {
            this.A0D.A0F().A4y(A00);
        }
    }

    private void A0F() {
        if (this.A00 > 0 && !android.text.TextUtils.isEmpty(this.A0A.A27(this.A00 - 1).A2E())) {
            com.facebook.ads.redexgen.core.VA va = this.A0E;
            java.lang.String A2E = this.A0A.A27(this.A00 - 1).A2E();
            com.facebook.ads.redexgen.core.C1293b9 A03 = new com.facebook.ads.redexgen.core.C1293b9().A03(this.A04 != null ? this.A04.getAdViewabilityChecker() : null);
            com.facebook.ads.redexgen.core.AbstractC0775Ij abstractC0775Ij = this.A04;
            java.lang.String[] strArr = A0M;
            if (strArr[6].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[2] = "pDlFeLBfyToKKboIUgGc0hC9I32LVeJD";
            strArr2[4] = "3B6yIVnUpbF0PBycHqRFA1bh2UEjPzxQ";
            va.AB7(A2E, A03.A02(abstractC0775Ij != null ? this.A04.getTouchDataRecorder() : null).A05());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        if (this.A0H.getToolbarActionMode() == 8) {
            com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A0H;
            java.lang.String[] strArr = A0M;
            if (strArr[2].charAt(19) == strArr[4].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[2] = "ALooRHp0AOPErSNB2N5ax0GYeQeSWGkg";
            strArr2[4] = "Jojrpwo5bfgl2L1NDhbRQaPRUafbLI0W";
            abstractC1171Yb.setToolbarActionMode(2);
        }
        int i = this.A00 - 1;
        if (this.A0A.A2J(i)) {
            com.facebook.ads.redexgen.core.AbstractC1801jd A27 = this.A0A.A27(i);
            com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb2 = this.A0H;
            java.lang.String[] strArr3 = A0M;
            java.lang.String str = strArr3[2];
            java.lang.String str2 = strArr3[4];
            int charAt = str.charAt(19);
            int index = str2.charAt(19);
            if (charAt == index) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr4 = A0M;
            strArr4[0] = "SYmrADrPyc9xENaNAh";
            strArr4[1] = "82lRVJ32R9K27GgHKLOx";
            abstractC1171Yb2.setProgressSpinnerInvisible(!A27.A2S());
            A27.A2K(false);
            A27.A29().A0M(-1);
        }
    }

    private void A0H() {
        this.A0D.A0F().A4w();
        this.A07 = true;
        this.A03 = new com.facebook.ads.redexgen.core.C1318bY(this.A0D, this.A0A, this.A0E, this.A0I, this.A0H.getToolbarHeight(), this.A02);
        com.facebook.ads.redexgen.core.C1454dk c1454dk = null;
        java.util.Iterator<com.facebook.ads.redexgen.core.C1454dk> it = this.A0K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.facebook.ads.redexgen.core.C1454dk next = it.next();
            if (next.A00 == com.facebook.ads.redexgen.core.C1454dk.A06) {
                c1454dk = next;
                break;
            }
        }
        if (c1454dk != null) {
            A0N(this.A03, c1454dk);
        } else {
            boolean isEmpty = this.A0K.isEmpty();
            java.lang.String[] strArr = A0M;
            if (strArr[5].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[5] = "8vyvfMLKM55zirtuKFzVGEL0IOO7sZ";
            strArr2[7] = "ODibu6eYSRbNQzGgUnvrLUj83p1fS4";
            if (!isEmpty) {
                A0N(this.A03, this.A0K.get(0));
            }
        }
        A0W(true);
        if (this.A0H instanceof com.facebook.ads.internal.view.FullScreenAdToolbar) {
            ((com.facebook.ads.internal.view.FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
        }
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A04);
            this.A04.A1E();
            this.A04 = null;
        }
        com.facebook.ads.redexgen.core.YB.A0J(this.A03);
        com.facebook.ads.redexgen.core.YB.A0G(1102, this.A03);
        addView(this.A03, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0J() {
        this.A0G.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A03);
    }

    private synchronized void A0K() {
        this.A0I.A4j(this.A0J.A6l());
        this.A05.A06();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(float f) {
        float seenCurrentPosMS;
        float A01 = A01(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A2I() ? 0 : this.A01) + f;
        if (A01 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / A01;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A2I()) {
            this.A06 = false;
            this.A0H.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0H.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            setUnskippableSecondsComplete(true);
            this.A0H.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(int i) {
        this.A0D.A0F().A4t(i);
        setUnskippableSecondsComplete(true);
        A0K();
        A0F();
        this.A0D.A0F().AB0();
        this.A0I.A4j(this.A0J.A7w());
    }

    private void A0N(android.view.ViewGroup viewGroup, com.facebook.ads.redexgen.core.C1454dk c1454dk) {
        if (c1454dk.A00 == com.facebook.ads.redexgen.core.C1454dk.A06 && c1454dk.A03 != null) {
            com.facebook.ads.redexgen.core.AbstractC1337br.A00(this.A0D, viewGroup, c1454dk.A03);
        } else {
            int i = c1454dk.A01;
            java.lang.String[] strArr = A0M;
            if (strArr[0].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[5] = "6Qw2GncBlIK9qwoUetngT0jkAnHCQL";
            strArr2[7] = "iVxLMdIUnWJTFKOlNtOcmcGRsmSn6x";
            com.facebook.ads.redexgen.core.YB.A0N(viewGroup, i);
        }
        this.A0H.setFullscreen(c1454dk.A05);
        this.A0H.A0D(c1454dk.A02, c1454dk.A04);
    }

    private void A0O(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (this.A0H instanceof com.facebook.ads.internal.view.FullScreenAdToolbar) {
            if (A0b(abstractC1801jd) && this.A02 == 2) {
                ((com.facebook.ads.internal.view.FullScreenAdToolbar) this.A0H).setOnlyPageDetails(abstractC1801jd.A2C());
            } else {
                ((com.facebook.ads.internal.view.FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
            }
        }
    }

    private final void A0P(com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        c0998Re.A0A(this.A0B);
        int i = c0998Re.A05().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0X(this.A0A.A2D(), i);
        A0J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0W(boolean z) {
        boolean z2;
        boolean willShowCombinedEndCards;
        java.lang.String[] strArr;
        if (A0Z() && !A0Y()) {
            boolean A0a = A0a();
            java.lang.String[] strArr2 = A0M;
            if (strArr2[0].length() == strArr2[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr3 = A0M;
            strArr3[2] = "abX2oERzf98UggHhJlwc5xOu8ehA434Q";
            strArr3[4] = "mcfqurarHSiAo6r6yfyhrMyo3UPU5OrE";
            if (!A0a) {
                z2 = true;
                willShowCombinedEndCards = A0Y();
                if (willShowCombinedEndCards && !z2) {
                    setUnskippableSecondsComplete(true);
                    if (z) {
                        this.A0H.setToolbarActionMessage(A0D(0, 0, 85));
                    }
                    com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A0H;
                    java.lang.String[] strArr4 = A0M;
                    if (strArr4[6].length() == strArr4[3].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr5 = A0M;
                    strArr5[0] = "6hDdRvQvhZI2wvmWyf";
                    strArr5[1] = "dfELTL2TgrvtcbRt37j2";
                    abstractC1171Yb.setToolbarActionMode(0);
                    return;
                }
                com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb2 = this.A0H;
                strArr = A0M;
                if (strArr[0].length() == strArr[1].length()) {
                    java.lang.String[] strArr6 = A0M;
                    strArr6[2] = "JMDiVFyp4yY8WixxdBAiYWzIdfNljSYZ";
                    strArr6[4] = "DEcXsd0kn675y00aYcKTg0COR2JcG3d3";
                    abstractC1171Yb2.setToolbarActionMode(1);
                    return;
                }
                java.lang.String[] strArr7 = A0M;
                strArr7[6] = "uCb48oA3";
                strArr7[3] = "eCwSqnipc7icS";
                abstractC1171Yb2.setToolbarActionMode(1);
                return;
            }
        }
        z2 = false;
        willShowCombinedEndCards = A0Y();
        if (willShowCombinedEndCards) {
        }
        com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb22 = this.A0H;
        strArr = A0M;
        if (strArr[0].length() == strArr[1].length()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z, int i) {
        if (this.A04 != null) {
            this.A04.A1E();
            this.A04.removeAllViews();
            com.facebook.ads.redexgen.core.YB.A0J(this.A04);
        }
        if (this.A0A.A1c()) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A0H);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0u, com.facebook.ads.redexgen.core.XV.A0r, 0, 0);
            addView(this.A0H, layoutParams);
        }
        if (!A0Y()) {
            setUnskippableSecondsComplete(true);
            if (A0Z()) {
                A0H();
                return;
            }
            A0M(1);
            java.lang.String[] strArr = A0M;
            if (strArr[6].length() != strArr[3].length()) {
                java.lang.String[] strArr2 = A0M;
                strArr2[5] = "b6hirdpqFqEpTGRF7TvzfLNB23PEQW";
                strArr2[7] = "Y5Eb3FssofDa3ImZpKtnPvm2BrdUNN";
                return;
            }
        } else {
            if (this.A0A.A2I()) {
                setUnskippableSecondsComplete(false);
                this.A0H.setProgressImmediate(0.0f);
            }
            com.facebook.ads.redexgen.core.T1 A01 = this.A0D.A01();
            com.facebook.ads.redexgen.core.AbstractC1801jd A27 = this.A0A.A27(this.A00);
            java.lang.String[] strArr3 = A0M;
            if (strArr3[6].length() != strArr3[3].length()) {
                java.lang.String[] strArr4 = A0M;
                strArr4[0] = "SeXhCWKDArfU2xbUHE";
                strArr4[1] = "icHjaKCGoPIgSTYVXjnx";
                boolean isLoaded = A01.AAM(A27.A2E(), this.A0A.A28());
                if (!isLoaded) {
                    this.A0D.A0F().A4u();
                    A0M(2);
                    return;
                }
                com.facebook.ads.redexgen.core.AbstractC0775Ij A0C = A0C(z, i);
                this.A04 = A0C;
                com.facebook.ads.redexgen.core.AbstractC0775Ij abstractC0775Ij = this.A04;
                boolean isLoaded2 = this.A09;
                abstractC0775Ij.A1I(isLoaded2);
                setupToolbarForAd(A0C);
                addView(this.A04, 0, A0N);
                this.A00++;
                this.A04.A1H();
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    private boolean A0Y() {
        return this.A00 < this.A0A.A23();
    }

    private boolean A0Z() {
        return this.A0A.A22() == 2;
    }

    private final boolean A0a() {
        return this.A07;
    }

    public static boolean A0b(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        return android.text.TextUtils.isEmpty(abstractC1801jd.A29().A0H().A09());
    }

    public final void A0d() {
        A0X(false, this.A02);
    }

    public final boolean A0e() {
        boolean z = this.A00 < this.A0A.A23() && this.A0A.A2G();
        if (z) {
            this.A0D.A0F().AC1();
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A0I.A45(this, A0N);
        A0P(c0998Re);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        if (this.A04 != null) {
            this.A04.A1J(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        if (this.A04 != null) {
            this.A04.A1K(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
    }

    public com.facebook.ads.redexgen.core.AbstractC0775Ij getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public java.lang.String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof com.facebook.ads.redexgen.core.C04555h) {
            A0N(this.A04, this.A04.getFullScreenAdStyle());
            A0O(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A1E();
            this.A04 = null;
        }
        this.A0D.A01().A4z(this.A0A.A28());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
    }

    public void setServerSideRewardHandler(com.facebook.ads.redexgen.core.C1504ea c1504ea) {
        this.A05 = c1504ea;
    }

    public void setUnskippableSecondsComplete(boolean z) {
        this.A09 = z;
        if (this.A04 != null) {
            this.A04.A1I(this.A09);
        }
    }

    private void setupToolbarForAd(com.facebook.ads.redexgen.core.AbstractC0775Ij abstractC0775Ij) {
        if (this.A0H == null) {
            return;
        }
        this.A06 = true;
        com.facebook.ads.redexgen.core.AbstractC1801jd A27 = this.A0A.A27(this.A00);
        int A01 = A01(this.A00);
        if (this.A0H instanceof com.facebook.ads.internal.view.FullScreenAdToolbar) {
            ((com.facebook.ads.internal.view.FullScreenAdToolbar) this.A0H).A0G(this.A0D, A27.A22());
            ((com.facebook.ads.internal.view.FullScreenAdToolbar) this.A0H).A0F(A27.A2C(), A27.A2E(), A01);
        } else if (this.A0H instanceof com.facebook.ads.redexgen.core.PU) {
            ((com.facebook.ads.redexgen.core.PU) this.A0H).setInitialUnskippableSeconds(A01);
        }
        com.facebook.ads.redexgen.core.C1454dk fullScreenAdStyle = abstractC0775Ij.getFullScreenAdStyle();
        A0N(abstractC0775Ij, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0H.setToolbarActionMessage(A0D(4, 3, 90) + (this.A00 + 1) + A0D(0, 4, 21) + this.A0A.A23());
        if (this.A08) {
            this.A0H.setToolbarActionMode(1);
        }
        A0O(A27);
    }
}
