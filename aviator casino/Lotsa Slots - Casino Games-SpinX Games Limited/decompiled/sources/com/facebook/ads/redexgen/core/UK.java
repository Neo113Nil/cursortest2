package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class UK implements com.facebook.ads.Ad, com.facebook.ads.internal.api.NativeAdBaseApi, com.facebook.ads.internal.context.Repairable, com.facebook.ads.redexgen.core.InterfaceC1105Vi {
    public static com.facebook.ads.redexgen.core.C1042Sx A0o;
    public static byte[] A0p;
    public static java.lang.String[] A0q = {"0QrYY16WpsBKaBkyPEA33iBIoR05UhVT", "YnnsFrkLVth43aFbA8XanJ7Af1ELV", "Oxqa2FUUnPLQ7GUfsty3Y0efzjvyqNtk", "SIKP4BEcnF1kam64buW5uj4ZKlEjFxDR", "vEVPI6RQ4lovzpZyrpWOxFDddvUHwWNp", "NGWOmnzpb", "djSS0JJWnZq1rlBsvyeXY9GnDKzed", "NhvbMWoFDj5W6o0bWnGe4dztWB8buZER"};
    public static final java.lang.String A0r;
    public static final java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.UK>> A0s;
    public long A00;
    public android.graphics.drawable.Drawable A01;
    public android.view.View.OnTouchListener A02;
    public android.view.View A03;
    public android.view.View A04;
    public android.view.View A05;
    public android.view.View A06;
    public com.facebook.ads.AdClosedListener A07;
    public com.facebook.ads.NativeAdLayout A08;
    public com.facebook.ads.redexgen.core.NE A09;
    public com.facebook.ads.redexgen.core.C1807jj A0A;
    public com.facebook.ads.redexgen.core.C05067g A0B;
    public com.facebook.ads.redexgen.core.C1765iu A0C;
    public com.facebook.ads.redexgen.core.T3 A0D;
    public com.facebook.ads.redexgen.core.C1068Tx A0E;
    public com.facebook.ads.redexgen.core.VI A0F;
    public com.facebook.ads.redexgen.core.VW A0G;
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC1074Ud A0H;
    public com.facebook.ads.redexgen.core.InterfaceC1066Tv A0I;
    public com.facebook.ads.redexgen.core.C1100Vd A0J;
    public com.facebook.ads.redexgen.core.EnumC1101Ve A0K;
    public com.facebook.ads.redexgen.core.EnumC1111Vq A0L;
    public com.facebook.ads.redexgen.core.ZT A0M;
    public com.facebook.ads.redexgen.core.InterfaceC1198Zc A0N;
    public com.facebook.ads.redexgen.core.C1290b6 A0O;
    public com.facebook.ads.redexgen.core.C1420dC A0P;
    public com.facebook.ads.redexgen.core.C1484eF A0Q;
    public com.facebook.ads.redexgen.core.AbstractC1580fo A0R;
    public com.facebook.ads.redexgen.core.AbstractC1580fo A0S;
    public com.facebook.ads.redexgen.core.C1581fp A0T;
    public com.facebook.ads.redexgen.core.C1581fp A0U;
    public java.lang.String A0V;
    public java.lang.String A0W;
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1683hT> A0X;
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.AbstractC1580fo> A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public com.facebook.ads.redexgen.core.C1818ju A0e;
    public final com.facebook.ads.redexgen.core.C1042Sx A0f;
    public final com.facebook.ads.redexgen.core.C1636gi A0g;
    public final com.facebook.ads.redexgen.core.InterfaceC1097Va A0h;
    public final com.facebook.ads.redexgen.core.C1107Vk A0i;
    public final com.facebook.ads.redexgen.core.Y2 A0j;
    public final java.lang.String A0k;
    public final java.lang.String A0l;
    public final java.util.List<android.view.View> A0m;
    public volatile boolean A0n;

    public static java.lang.String A0W(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0p, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0e() {
        A0p = new byte[]{-32, com.google.common.base.Ascii.SUB, 38, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, -19, -14, -13, -16, com.google.common.base.Ascii.RS, -18, -15, -16, -24, -27, com.google.common.base.Ascii.SYN, -24, -26, -19, com.google.common.base.Ascii.ETB, -27, -74, -74, -71, -76, -70, -72, -29, -29, 38, 73, 5, 83, 84, 89, 5, 81, 84, 70, 73, 74, 73, -25, 10, -6, com.google.common.base.Ascii.VT, 19, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DC2, 7, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, -58, -51, -53, com.google.common.base.Ascii.EM, -51, -58, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.EM, -58, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, -58, 7, -58, com.google.common.base.Ascii.DC4, 7, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.VT, -58, 7, 10, -33, -37, -38, com.google.common.base.Ascii.SO, -3, 2, -2, 7, -4, -2, -25, -2, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, 8, com.google.common.base.Ascii.VT, 4, -27, 0, 8, com.google.common.base.Ascii.VT, 4, 3, -65, 19, com.google.common.base.Ascii.SO, -65, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, 0, 3, -65, -20, 4, 3, 8, 0, -51, -16, com.google.common.base.Ascii.VT, 19, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, -54, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, -54, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, 19, com.google.common.base.Ascii.CAN, -54, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SI, -54, -13, -18, -54, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ETB, -54, com.google.common.base.Ascii.FF, 19, com.google.common.base.Ascii.SO, -54, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 35, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, -54, -47, -49, com.google.common.base.Ascii.GS, -47, -23, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC4, 5, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 1, com.google.common.base.Ascii.FF, -64, 5, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, -50, -86, com.google.common.base.Ascii.RS, 67, 75, 54, 65, 62, 57, -11, 72, 58, 73, -11, 68, 59, -11, 56, 65, 62, 56, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 54, 55, 65, 58, -11, 75, 62, 58, 76, 72, 0, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CAN, 42, -45, com.google.common.base.Ascii.EM, 34, 37, -45, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SYN, 34, 33, -45, com.google.common.base.Ascii.FS, 38, -45, com.google.common.base.Ascii.FS, 38, -45, 32, com.google.common.base.Ascii.FS, 38, 38, com.google.common.base.Ascii.FS, 33, com.google.common.base.Ascii.SUB, -31, com.google.common.base.Ascii.GS, 53, 52, 57, 49, 38, 57, 53, 71, -16, 57, 67, -16, kotlin.io.encoding.Base64.padSymbol, 57, 67, 67, 57, 62, 55, -2, 51, 91, 89, 90, 6, 86, 88, 85, 92, 79, 74, 75, 6, 71, 6, 60, 79, 75, 93, 35, 54, 73, 62, 75, 58, -11, com.google.common.base.Ascii.SYN, 57, -11, 76, 54, 72, -11, 54, 65, 71, 58, 54, 57, 78, -11, 71, 58, 60, 62, 72, 73, 58, 71, 58, 57, -11, 76, 62, 73, kotlin.io.encoding.Base64.padSymbol, -11, 54, -11, 43, 62, 58, 76, 3, -11, com.google.common.base.Ascii.SYN, 74, 73, 68, -11, 74, 67, 71, 58, 60, 62, 72, 73, 58, 71, 62, 67, 60, -11, 54, 67, 57, -11, 69, 71, 68, 56, 58, 58, 57, 62, 67, 60, 3, -55, -36, -17, -28, -15, -32, -101, -36, -33, -101, -33, -32, -18, -17, -19, -22, -12, -32, -33, -39, -20, -1, -12, 1, -16, -85, -20, -17, -85, -9, -6, -20, -17, -85, -3, -16, -4, 0, -16, -2, -1, -16, -17, -22, -3, -7, com.google.common.base.Ascii.VT, -76, -11, 0, 6, -7, -11, -8, com.google.common.base.Ascii.CR, -76, 6, -7, -5, -3, 7, 8, -7, 6, -7, -8, -76, com.google.common.base.Ascii.VT, -3, 8, -4, -76, -11, -76, -30, -11, 8, -3, 10, -7, -43, -8, -62, -76, -43, 9, 8, 3, -76, 9, 2, 6, -7, -5, -3, 7, 8, -7, 6, -3, 2, -5, -76, -11, 2, -8, -76, 4, 6, 3, -9, -7, -7, -8, -3, 2, -5, -62, -1, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 32, -55, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, -55, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.CR, -55, 32, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.GS, 17, -55, com.google.common.base.Ascii.GS, 17, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.FS, -55, -9, 10, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SO, -22, com.google.common.base.Ascii.CR, 46, 49, -19, 58, 50, 49, 54, 46, -19, 65, 70, kotlin.io.encoding.Base64.padSymbol, 50, -19, 54, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, -19, 59, 60, 65, -19, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 66, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 60, 63, 65, 50, 49, -5, 54, 69, 62, 51, 52, 66, 67, 65, 62, 72, 81, 84, 70, 73, 38, 73, 69, 72, 58, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.SUB, kotlin.io.encoding.Base64.padSymbol, 1, 2, -7, 60, 58, 69, 69, 62, kotlin.io.encoding.Base64.padSymbol, -7, 70, 72, 75, 62, -7, 77, 65, 58, 71, -7, 72, 71, 60, 62, -27, -40, -21, -32, -19, -36};
        java.lang.String[] strArr = A0q;
        if (strArr[6].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        A0q[3] = "WbNUBB1XQVUYjPuN5kyqwH0pcEyoS9gz";
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c9, code lost:
    
        if (r6.A0S() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02cb, code lost:
    
        r12.A0R = new com.facebook.ads.redexgen.core.VE(r12);
        r12.A0T = new com.facebook.ads.redexgen.core.C1581fp(r13, 1, new java.lang.ref.WeakReference(r12.A0R), r12.A0g);
        r12.A0T.A0Y(false);
        r12.A0T.A0X(r6.A09());
        r12.A0T.A0U();
        r12.A0g.A0F().ACY();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02fe, code lost:
    
        r1 = new java.util.ArrayList(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0305, code lost:
    
        if (r12.A05 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0307, code lost:
    
        r7 = r12.A05;
        r4 = com.facebook.ads.redexgen.core.UK.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x031a, code lost:
    
        if (r4[2].charAt(3) == r4[7].charAt(3)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x031c, code lost:
    
        r4 = com.facebook.ads.redexgen.core.UK.A0q;
        r4[0] = "7BxfhPTBtrovnc2SNqJYjum2f5qDPcpL";
        r4[4] = "Q5pxYg7VFdMmLRDnYTITcnTwa1eIsVWj";
        r1.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x032b, code lost:
    
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0333, code lost:
    
        if (r2.hasNext() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0335, code lost:
    
        A1Q((android.view.View) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x033f, code lost:
    
        r0 = A13();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0343, code lost:
    
        if (r16 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0345, code lost:
    
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034b, code lost:
    
        if (r0.A1f() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x034d, code lost:
    
        A1Q(r13);
        r1.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0353, code lost:
    
        r7 = A00();
        r12.A0S = new com.facebook.ads.redexgen.core.C1092Uv(r12, r14, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0360, code lost:
    
        if ((r14 instanceof com.facebook.ads.internal.api.AdNativeComponentView) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0362, code lost:
    
        r12.A03 = ((com.facebook.ads.internal.api.AdNativeComponentView) r14).getAdContentsView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0370, code lost:
    
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(r12.A0g) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0372, code lost:
    
        r4 = A1H();
        r6 = A16().A0B();
        r5 = r12.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0380, code lost:
    
        if (r4 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0382, code lost:
    
        r4 = A0W(0, 0, 121);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x038a, code lost:
    
        r6.AKo(r5, r4, r12.A03 instanceof com.facebook.ads.redexgen.core.C1520eq, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0392, code lost:
    
        r12.A0U = new com.facebook.ads.redexgen.core.C1581fp(r12.A03, r7, A03(), true, new java.lang.ref.WeakReference(r12.A0S), r12.A0g);
        r12.A0U.A0Y(!A0r());
        r12.A0U.A0W(A01());
        r12.A0U.A0X(A02());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03ca, code lost:
    
        if ((r12.A03 instanceof com.facebook.ads.redexgen.core.C1280aw) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03cc, code lost:
    
        r5 = (com.facebook.ads.redexgen.core.C1280aw) r12.A03;
        r4 = com.facebook.ads.redexgen.core.UK.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03e2, code lost:
    
        if (r4[0].charAt(21) == r4[4].charAt(21)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03e4, code lost:
    
        com.facebook.ads.redexgen.core.UK.A0q[3] = "9jWMkBrIWAaQq3BshIoiK9kOFApm7Mnb";
        r5.A06(r12.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03f0, code lost:
    
        r12.A0A = new com.facebook.ads.redexgen.core.C1807jj(r12.A0g, new com.facebook.ads.redexgen.core.UY(r12, null), r12.A0U, r12.A0e);
        r12.A0A.A0H(r1);
        com.facebook.ads.redexgen.core.UK.A0s.put(r13, new java.lang.ref.WeakReference<>(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0418, code lost:
    
        if (com.facebook.ads.redexgen.core.C1086Up.A1C(r12.A0g) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x041a, code lost:
    
        r12.A0O = new com.facebook.ads.redexgen.core.C1290b6();
        r12.A0O.A0C(r12.A0k);
        r12.A0O.A0B(r12.A0g.getPackageName());
        r12.A0O.A0A(r12.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x043c, code lost:
    
        if (r12.A0e == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0448, code lost:
    
        if (r12.A0e.A0E().A03() <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x044a, code lost:
    
        r0 = r12.A0e.A0E();
        r12.A0O.A08(r0.A03(), r0.A04());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x045d, code lost:
    
        r4 = r12.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x046b, code lost:
    
        if (com.facebook.ads.redexgen.core.UK.A0q[3].charAt(5) == 'B') goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x046d, code lost:
    
        if (r4 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x046f, code lost:
    
        r12.A0O.A09(r12.A0E.A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x047a, code lost:
    
        r12.A04.getOverlay().add(r12.A0O);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0485, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0497, code lost:
    
        if (r12.A0B == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x049f, code lost:
    
        if (r12.A0B.A0J() == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04a1, code lost:
    
        r12.A0O.A09(r12.A0B.A0J().A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0486, code lost:
    
        r2 = com.facebook.ads.redexgen.core.UK.A0q;
        r2[6] = "iJInlaPqSCsodlo1snRpIwz9DPt1A";
        r2[1] = "DYzZZFtfMBLderHMiZZFXfgJZWHC0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0492, code lost:
    
        if (r4 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04b1, code lost:
    
        r12.A03 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x025e, code lost:
    
        if (r8 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0225, code lost:
    
        if (r8 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0227, code lost:
    
        android.util.Log.w(com.facebook.ads.redexgen.core.UK.A0r, A0W(283, 80, 101));
        unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0239, code lost:
    
        r8 = com.facebook.ads.redexgen.core.UK.A0s.containsKey(r13);
        r2 = com.facebook.ads.redexgen.core.UK.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024f, code lost:
    
        if (r2[6].length() == r2[1].length()) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0256, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0261, code lost:
    
        r2 = com.facebook.ads.redexgen.core.UK.A0q;
        r2[0] = "r1dCEV0W05obqeylsxysUOCLLtyqbDkO";
        r2[4] = "jsU6g8E1kSPqSuKqGJQzSRDrUMjHNr5E";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x026d, code lost:
    
        if (r8 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x027b, code lost:
    
        if (com.facebook.ads.redexgen.core.UK.A0s.get(r13).get() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x027d, code lost:
    
        android.util.Log.w(com.facebook.ads.redexgen.core.UK.A0r, A0W(com.ironsource.InterfaceC3141l1.a.b.f, 75, 36));
        com.facebook.ads.redexgen.core.UK.A0s.get(r13).get().unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x029d, code lost:
    
        r12.A0H = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1074Ud(r12, r12.A0g, null);
        r12.A04 = r13;
        r12.A06 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ad, code lost:
    
        if ((r13 instanceof android.view.ViewGroup) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02af, code lost:
    
        r12.A0M = new com.facebook.ads.redexgen.core.ZT(r12.A0g, new com.facebook.ads.redexgen.core.VG(r12));
        ((android.view.ViewGroup) r13).addView(r12.A0M);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0g(android.view.View view, android.view.View view2, java.util.List<android.view.View> list, boolean z) {
        if (!A0r()) {
            this.A0g.A0F().AHa();
        }
        if (view == null) {
            java.lang.String A0W = A0W(264, 19, 118);
            if (!A0r()) {
                this.A0g.A0F().AHZ(A0W);
            }
            throw new java.lang.IllegalArgumentException(A0W);
        }
        if (list == null || list.size() == 0) {
            java.lang.String A0W2 = A0W(180, 30, 101);
            if (!A0r()) {
                this.A0g.A0F().AHZ(A0W2);
            }
            throw new java.lang.IllegalArgumentException(A0W2);
        }
        com.facebook.ads.redexgen.core.C1818ju A0C = A0C();
        if (A0C == null) {
            java.lang.String A0W3 = A0W(29, 13, 117);
            if (!A0r()) {
                this.A0g.A0F().AHZ(A0W3);
            }
            android.util.Log.e(A0r, A0W3);
            com.facebook.ads.redexgen.core.C1108Vm c1108Vm = new com.facebook.ads.redexgen.core.C1108Vm(com.facebook.ads.internal.protocol.AdErrorType.NATIVE_AD_IS_NOT_LOADED, A0W3);
            A16().A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), c1108Vm.A03().getErrorCode(), c1108Vm.A04());
            if (!com.facebook.ads.redexgen.core.C1086Up.A2n(this.A0g) || this.A0I == null) {
                return;
            }
            this.A0I.ADp(c1108Vm);
            return;
        }
        java.lang.String str = this.A0W;
        if ((view instanceof android.widget.FrameLayout) && str != null) {
            A0h((android.widget.FrameLayout) view, str);
        }
        if (this.A08 != null) {
            com.facebook.ads.redexgen.core.C1665hB c1665hB = (com.facebook.ads.redexgen.core.C1665hB) this.A08.getNativeAdLayoutApi();
            c1665hB.A03();
            c1665hB.A02();
        }
        com.facebook.ads.redexgen.core.C1683hT c1683hT = this.A0X.get();
        if (c1683hT != null && A0C.A08() == 1) {
            c1683hT.A0E(com.facebook.ads.redexgen.core.YM.AN_INFO_ICON);
        }
        if (view2 != null) {
            boolean z2 = (view2 instanceof com.facebook.ads.internal.api.AdNativeComponentView) && ((com.facebook.ads.internal.api.AdNativeComponentView) view2).getAdContentsView() != null;
            boolean z3 = z && (view2 instanceof android.widget.ImageView);
            if (!z2 && !z3) {
                if (this.A0I != null) {
                    com.facebook.ads.redexgen.core.C1108Vm c1108Vm2 = new com.facebook.ads.redexgen.core.C1108Vm(com.facebook.ads.internal.protocol.AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0W(519, 31, 93));
                    A16().A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), c1108Vm2.A03().getErrorCode(), c1108Vm2.A04());
                    this.A0I.ADp(c1108Vm2);
                    return;
                }
                return;
            }
            android.view.View view3 = this.A04;
            if (A0q[3].charAt(5) != 'B') {
                java.lang.String[] strArr = A0q;
                strArr[6] = "BCYbWK19bS9ET6nCyqUucyCTxntwC";
                strArr[1] = "hUEQWKvNS0BeeCCeuSbrKV1BB6cqb";
            } else {
                A0q[3] = "VFOGhBJepBYKNQ0g15YaI4y2lFqguygQ";
            }
        } else {
            if (this.A0L != com.facebook.ads.redexgen.core.EnumC1111Vq.A06) {
                com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NO_MEDIAVIEW_IN_NATIVEBANNERAD;
                java.lang.String A0W4 = A0W(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 33, 67);
                com.facebook.ads.redexgen.core.C1108Vm c1108Vm3 = new com.facebook.ads.redexgen.core.C1108Vm(adErrorType, A0W4);
                A16().A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), c1108Vm3.A03().getErrorCode(), c1108Vm3.A04());
                if (this.A0I != null) {
                    this.A0I.ADp(c1108Vm3);
                }
                if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                    java.lang.String str2 = A0r;
                    if (A0q[3].charAt(5) == 'B') {
                        A0q[3] = "KISMvB3VNIc1t4pH9OUWIwxPU7abTBQu";
                        android.util.Log.e(str2, A0W4);
                        return;
                    } else {
                        java.lang.String[] strArr2 = A0q;
                        strArr2[2] = "I0o2CociGt9PfWtihtc1uzdPzn26Oc3b";
                        strArr2[7] = "DL9r7FwT46CQ5uSYOng5HfHjynm8xWWf";
                        android.util.Log.e(str2, A0W4);
                        return;
                    }
                }
                return;
            }
            com.facebook.ads.internal.protocol.AdErrorType adErrorType2 = com.facebook.ads.internal.protocol.AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
            java.lang.String A0W5 = A0W(243, 21, 96);
            com.facebook.ads.redexgen.core.C1108Vm c1108Vm4 = new com.facebook.ads.redexgen.core.C1108Vm(adErrorType2, A0W5);
            A16().A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), c1108Vm4.A03().getErrorCode(), c1108Vm4.A04());
            if (this.A0I != null) {
                this.A0I.ADp(c1108Vm4);
            }
            if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                return;
            }
            java.lang.String str3 = A0r;
            if (A0q[5].length() != 3) {
                java.lang.String[] strArr3 = A0q;
                strArr3[0] = "ymh7ZtbYw7oyMwS2HukMuI2t1Xj3fY7y";
                strArr3[4] = "GGURsKjIWyfUU1Vu9BOr0pf9u6pcVKo4";
                android.util.Log.e(str3, A0W5);
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    static {
        A0e();
        A0r = com.facebook.ads.redexgen.core.UK.class.getSimpleName();
        A0s = new java.util.WeakHashMap<>();
    }

    public UK(android.content.Context context, java.lang.String str, com.facebook.ads.redexgen.core.InterfaceC1097Va interfaceC1097Va, boolean z) {
        this.A0l = java.util.UUID.randomUUID().toString();
        this.A0L = com.facebook.ads.redexgen.core.EnumC1111Vq.A06;
        this.A0G = com.facebook.ads.redexgen.core.VW.A04;
        this.A09 = com.facebook.ads.redexgen.core.NE.A03;
        this.A0X = new java.lang.ref.WeakReference<>(null);
        this.A0m = new java.util.ArrayList();
        this.A0j = new com.facebook.ads.redexgen.core.Y2();
        this.A0d = false;
        this.A0c = false;
        this.A00 = -1L;
        this.A0Z = false;
        if (context instanceof com.facebook.ads.redexgen.core.C1636gi) {
            this.A0g = (com.facebook.ads.redexgen.core.C1636gi) context;
        } else if (!z) {
            this.A0g = com.facebook.ads.redexgen.core.C1009Rp.A04(context);
        } else {
            this.A0g = com.facebook.ads.redexgen.core.C1009Rp.A03(context);
        }
        this.A0g.A0O(this);
        this.A0k = str;
        this.A0h = interfaceC1097Va;
        if (A0o != null) {
            this.A0f = A0o;
        } else {
            this.A0f = new com.facebook.ads.redexgen.core.C1042Sx(this.A0g);
        }
        this.A05 = new android.view.View(context);
        this.A0i = new com.facebook.ads.redexgen.core.C1107Vk(this.A0g, this);
    }

    public UK(com.facebook.ads.redexgen.core.UK uk) {
        this((android.content.Context) uk.A0g, (java.lang.String) null, uk.A0h, true);
        this.A0E = uk.A0E;
        this.A0e = uk.A0e;
        this.A0C = uk.A0C;
        this.A0n = true;
        this.A05 = new android.view.View(this.A0g);
    }

    public UK(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1818ju c1818ju, com.facebook.ads.redexgen.core.C1068Tx c1068Tx, com.facebook.ads.redexgen.core.InterfaceC1097Va interfaceC1097Va) {
        this((android.content.Context) c1636gi, (java.lang.String) null, interfaceC1097Va, true);
        this.A0e = c1818ju;
        this.A0E = c1068Tx;
        this.A0n = true;
        this.A05 = new android.view.View(c1636gi);
    }

    public UK(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1818ju c1818ju, com.facebook.ads.redexgen.core.C1068Tx c1068Tx, com.facebook.ads.redexgen.core.InterfaceC1097Va interfaceC1097Va, com.facebook.ads.redexgen.core.C1765iu c1765iu) {
        this(c1636gi, c1818ju, c1068Tx, interfaceC1097Va);
        this.A0C = c1765iu;
    }

    private int A00() {
        if (this.A0E != null) {
            return this.A0E.A04();
        }
        if (this.A0B == null || this.A0B.A0J() == null) {
            return 1;
        }
        com.facebook.ads.redexgen.core.C1068Tx A0J = this.A0B.A0J();
        java.lang.String[] strArr = A0q;
        java.lang.String str = strArr[6];
        java.lang.String str2 = strArr[1];
        int length = str.length();
        int viewabilityThreshold = str2.length();
        if (length != viewabilityThreshold) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0q;
        strArr2[2] = "P5kYLn6xwAUrjDfDuw88TuaVt88D3vtD";
        strArr2[7] = "ZJzVQNISDO4cH7XUZ38T2d7bCdM1k8uN";
        return A0J.A04();
    }

    private int A01() {
        if (this.A0E != null) {
            return this.A0E.A07();
        }
        if (this.A0e != null) {
            return this.A0e.A0C();
        }
        if (this.A0B != null && this.A0B.A0J() != null) {
            return this.A0B.A0J().A07();
        }
        return 0;
    }

    private int A02() {
        if (this.A0E != null) {
            return this.A0E.A08();
        }
        if (this.A0e != null) {
            return this.A0e.A0D();
        }
        if (this.A0B != null && this.A0B.A0J() != null) {
            return this.A0B.A0J().A08();
        }
        return 1000;
    }

    private int A03() {
        if (this.A0E != null) {
            return this.A0E.A09();
        }
        com.facebook.ads.redexgen.core.C05067g c05067g = this.A0B;
        if (A0q[3].charAt(5) != 'B') {
            throw new java.lang.RuntimeException();
        }
        A0q[5] = "Xt";
        if (c05067g == null || this.A0B.A0J() == null) {
            return 0;
        }
        return this.A0B.A0J().A09();
    }

    public static android.graphics.drawable.Drawable A05(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.graphics.Bitmap bitmap, boolean z, java.lang.String str) {
        android.graphics.drawable.BitmapDrawable A00;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(c1636gi.getResources(), bitmap);
        if (z && (A00 = com.facebook.ads.redexgen.core.AbstractC1483eE.A00(c1636gi, str)) != null) {
            android.graphics.drawable.Drawable iconViewDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, A00});
            return iconViewDrawable;
        }
        return bitmapDrawable;
    }

    public static com.facebook.ads.NativeAdBase A0A(android.content.Context context, java.lang.String str, java.lang.String str2) throws com.facebook.ads.redexgen.core.C1109Vn {
        com.facebook.ads.redexgen.core.EnumC1111Vq A00 = com.facebook.ads.redexgen.core.C1115Vu.A00(str2);
        if (A00 != null) {
            com.facebook.ads.redexgen.core.EnumC1111Vq template = com.facebook.ads.redexgen.core.EnumC1111Vq.A05;
            if (A00 == template) {
                return new com.facebook.ads.NativeBannerAd(context, str);
            }
            com.facebook.ads.redexgen.core.EnumC1111Vq template2 = com.facebook.ads.redexgen.core.EnumC1111Vq.A06;
            if (A00 == template2) {
                return new com.facebook.ads.NativeAd(context, str);
            }
            throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, java.lang.String.format(java.util.Locale.US, A0W(42, 34, 54), A00));
        }
        throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, java.lang.String.format(java.util.Locale.US, A0W(114, 50, 58), str2));
    }

    private final com.facebook.ads.redexgen.core.C1818ju A0C() {
        com.facebook.ads.redexgen.core.C1818ju c1818ju = this.A0e;
        if (c1818ju != null && c1818ju.A0R()) {
            return c1818ju;
        }
        return null;
    }

    private com.facebook.ads.redexgen.core.C1806ji A0F() {
        return A0G(false);
    }

    private com.facebook.ads.redexgen.core.C1806ji A0G(boolean z) {
        if (this.A0e != null) {
            com.facebook.ads.redexgen.core.C1818ju c1818ju = this.A0e;
            if (A0q[3].charAt(5) == 'B') {
                java.lang.String[] strArr = A0q;
                strArr[0] = "rkQiEYXoMEhriwkmxTS9YqbekXjRctvV";
                strArr[4] = "aQIgqL6bCxVEsMgFZvYj1f08oAvgjHgO";
                if (c1818ju.A0R()) {
                    if (z) {
                        com.facebook.ads.redexgen.core.C1818ju c1818ju2 = this.A0e;
                        if (A0q[3].charAt(5) == 'B') {
                            A0q[3] = "EWl26Bqfon8mX0lHHC6z05409Pwx5AXq";
                            c1818ju2.A0I();
                        }
                    }
                    return this.A0e.A0E();
                }
            }
            throw new java.lang.RuntimeException();
        }
        return new com.facebook.ads.redexgen.core.C1806ji();
    }

    public static com.facebook.ads.redexgen.core.C1081Uk A0K() {
        return new com.facebook.ads.redexgen.core.C1081Uk();
    }

    public static com.facebook.ads.redexgen.core.UK A0L(com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof java.lang.reflect.Proxy) {
            return (com.facebook.ads.redexgen.core.UK) ((com.facebook.ads.redexgen.core.RZ) java.lang.reflect.Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (com.facebook.ads.redexgen.core.UK) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1098Vb getAdChoicesIcon() {
        return A0F().A0G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1099Vc getAdStarRating() {
        return A0F().A0J();
    }

    private com.facebook.ads.internal.protocol.AdPlacementType A0R() {
        if (this.A0L == com.facebook.ads.redexgen.core.EnumC1111Vq.A06) {
            return com.facebook.ads.internal.protocol.AdPlacementType.NATIVE;
        }
        return com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER;
    }

    private void A0a() {
        for (android.view.View view : this.A0m) {
            view.setOnClickListener(null);
            if (A0q[3].charAt(5) != 'B') {
                throw new java.lang.RuntimeException();
            }
            A0q[3] = "reBfvBMaH6BqwlxZ2WqAQZq3knZpIvyz";
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0m.clear();
    }

    private void A0b() {
        if (!android.text.TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            com.facebook.ads.redexgen.core.X6.A0O(new com.facebook.ads.redexgen.core.X6(), this.A0g, com.facebook.ads.redexgen.core.XB.A00(getAdChoicesLinkUrl()), A1H());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        this.A0j.A05();
        this.A0i.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d() {
        if (this.A0T != null) {
            this.A0T.A0V();
            this.A0g.A0F().ACZ();
            this.A0T = null;
        }
    }

    public static void A0f(android.graphics.drawable.Drawable drawable, android.widget.ImageView imageView) {
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (A0q[3].charAt(5) != 'B') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0q;
        strArr[6] = "LXDT52DRzEPuIKBbeK5QN38hLQjcy";
        strArr[1] = "Z1aNossC2MxjaxQyIIrn4vHalGw3J";
        imageView.setBackground(null);
    }

    private void A0h(android.widget.FrameLayout frameLayout, java.lang.String str) {
        if (this.A0Q != null) {
            frameLayout.removeView(this.A0Q);
        }
        this.A0Q = com.facebook.ads.redexgen.core.AbstractC1483eE.A01(com.facebook.ads.redexgen.core.C1009Rp.A03(this.A0g), str);
        if (this.A0Q != null) {
            frameLayout.addView(this.A0Q, new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0Q);
        }
    }

    private void A0i(com.facebook.ads.redexgen.core.C1818ju c1818ju, boolean z) {
        java.util.Iterator<com.facebook.ads.redexgen.core.UK> it;
        if (c1818ju == null) {
            return;
        }
        boolean equals = this.A0G.equals(com.facebook.ads.redexgen.core.VW.A04);
        java.lang.String A0W = A0W(596, 6, 7);
        if (equals) {
            com.facebook.ads.redexgen.core.C1806ji A0E = c1818ju.A0E();
            com.facebook.ads.redexgen.core.AbstractC1801jd A0F = A0E.A0F();
            if (A0F != null) {
                com.facebook.ads.redexgen.core.O0.A00(A0F, this.A0f, A0W);
            }
            java.lang.String A7O = c1818ju.A7O();
            if (A0q[3].charAt(5) != 'B') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0q;
            strArr[6] = "lK6BgrMvSH2F6L4J2jXYHYWLLMocG";
            strArr[1] = "r7RKa3WPMM0ePgLxUrWU6ktCTFHYt";
            if (!android.text.TextUtils.isEmpty(A7O)) {
                this.A0F = new com.facebook.ads.redexgen.core.VI(A7O, this.A0g.A0A());
                this.A0f.A0e(this.A0F);
            }
            if (A0E.A0I() != null) {
                com.facebook.ads.redexgen.core.C1040Sv c1040Sv = new com.facebook.ads.redexgen.core.C1040Sv(A0E.A0I().getUrl(), A0E.A0I().getHeight(), A0E.A0I().getWidth(), c1818ju.A0G(), A0W(596, 6, 7));
                c1040Sv.A01 = this.A0D;
                this.A0f.A0W();
                this.A0f.A0c(c1040Sv);
            }
            if (!this.A0L.equals(com.facebook.ads.redexgen.core.EnumC1111Vq.A05)) {
                if (A0E.A0H() != null) {
                    this.A0f.A0c(new com.facebook.ads.redexgen.core.C1040Sv(A0E.A0H().getUrl(), A0E.A0H().getHeight(), A0E.A0H().getWidth(), c1818ju.A0G(), A0W(596, 6, 7)));
                }
                if (c1818ju.A0H() != null) {
                    java.util.List<com.facebook.ads.redexgen.core.UK> A0H = c1818ju.A0H();
                    java.lang.String[] strArr2 = A0q;
                    java.lang.String clientToken = strArr2[2];
                    if (clientToken.charAt(3) != strArr2[7].charAt(3)) {
                        java.lang.String[] strArr3 = A0q;
                        strArr3[6] = "77gx94UEEewpboaJzdp5NkxYfy9yz";
                        strArr3[1] = "VW3IQGZLEm7XJQdY3dbeWOHCgy17v";
                        it = A0H.iterator();
                    } else {
                        java.lang.String[] strArr4 = A0q;
                        strArr4[0] = "SnanODICAbTvQWDZLrONkEMoieoDOxdU";
                        strArr4[4] = "rm0yXzoJreTTXaU8PcTY1VhnZxiHPX84";
                        it = A0H.iterator();
                    }
                    while (it.hasNext()) {
                        com.facebook.ads.redexgen.core.UK next = it.next();
                        if (next.getAdCoverImage() != null) {
                            this.A0f.A0c(new com.facebook.ads.redexgen.core.C1040Sv(next.getAdCoverImage().getUrl(), next.getAdCoverImage().getHeight(), next.getAdCoverImage().getWidth(), c1818ju.A0G(), A0W(596, 6, 7)));
                        }
                    }
                }
                java.lang.String A0e = A0E.A0e();
                if (!android.text.TextUtils.isEmpty(A0e)) {
                    this.A0f.A0b(new com.facebook.ads.redexgen.core.C1038St(A0e, c1818ju.A0G(), A0W(596, 6, 7), A0E.A0D()));
                }
            }
            if (A0F != null && A0F.A1g()) {
                com.facebook.ads.redexgen.core.C1038St cacheFileData = new com.facebook.ads.redexgen.core.C1038St(A0F.A0x(), A0F.A1D(), A0W);
                cacheFileData.A04 = true;
                cacheFileData.A03 = A0W(0, 5, 66);
                this.A0f.A0Y(cacheFileData);
            }
        }
        this.A0f.A0X(new com.facebook.ads.redexgen.core.VZ(this, c1818ju, z), new com.facebook.ads.redexgen.core.C1035Sq(c1818ju.A0G(), A0W));
    }

    private void A0j(com.facebook.ads.redexgen.core.NG ng) {
        if (this.A0e == null) {
            return;
        }
        this.A0e.A0K(ng);
    }

    public static void A0k(com.facebook.ads.internal.api.NativeAdImageApi nativeAdImageApi, android.widget.ImageView imageView, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        if (nativeAdImageApi != null && imageView != null) {
            new com.facebook.ads.redexgen.core.LM(imageView, c1636gi).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0n(com.facebook.ads.redexgen.core.InterfaceC1066Tv interfaceC1066Tv) {
        this.A0I = interfaceC1066Tv;
    }

    private final void A0o(java.lang.String str) {
        this.A0V = str;
    }

    private void A0p(java.util.List<android.view.View> list, android.view.View view) {
        if (this.A0h != null && this.A0h.AJx(view)) {
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A0p(list, viewGroup.getChildAt(i));
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A1D() == com.facebook.ads.redexgen.core.EnumC1102Vf.A05 || A1D() == com.facebook.ads.redexgen.core.EnumC1102Vf.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0r() {
        return A0F().A0j();
    }

    public final int A0y() {
        return A0F().A06();
    }

    public final int A0z() {
        return A0F().A07();
    }

    public final int A10() {
        if (this.A0e != null && !android.text.TextUtils.isEmpty(this.A0e.A0E().A0e())) {
            return this.A0e.A0E().A0A();
        }
        return -1;
    }

    public final long A11() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C1818ju A12() {
        return this.A0e;
    }

    public final com.facebook.ads.redexgen.core.AbstractC1801jd A13() {
        return A0F().A0F();
    }

    public final com.facebook.ads.redexgen.core.C1042Sx A14() {
        return this.A0f;
    }

    public final com.facebook.ads.redexgen.core.C1636gi A15() {
        return this.A0g;
    }

    public final com.facebook.ads.redexgen.core.C1636gi A16() {
        return this.A0g;
    }

    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC1074Ud A17() {
        return this.A0H;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A18, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1098Vb getAdCoverImage() {
        return A0F().A0H();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A19, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1098Vb getAdIcon() {
        return A0F().A0I();
    }

    public final com.facebook.ads.redexgen.core.InterfaceC1066Tv A1A() {
        return this.A0I;
    }

    public final com.facebook.ads.redexgen.core.C1100Vd A1B() {
        return this.A0J;
    }

    public final com.facebook.ads.redexgen.core.EnumC1101Ve A1C() {
        return this.A0K;
    }

    public final com.facebook.ads.redexgen.core.EnumC1102Vf A1D() {
        return A0F().A0K();
    }

    public final com.facebook.ads.redexgen.core.Y2 A1E() {
        return this.A0j;
    }

    public final com.facebook.ads.redexgen.core.C1227a5 A1F() {
        if (A13() == null || !A13().A2U()) {
            return null;
        }
        com.facebook.ads.redexgen.core.C1227a5 c1227a5 = new com.facebook.ads.redexgen.core.C1227a5(this.A0g, com.facebook.ads.redexgen.core.EnumC1244aM.A05);
        c1227a5.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.VY
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.UK.this.A1R(view);
            }
        });
        return c1227a5;
    }

    public final com.facebook.ads.redexgen.core.C1581fp A1G() {
        return this.A0U;
    }

    public final java.lang.String A1H() {
        if (this.A0e == null || !isAdLoaded()) {
            return null;
        }
        return this.A0e.A7O();
    }

    public final java.lang.String A1I() {
        return this.A0W;
    }

    public final java.lang.String A1J() {
        return A0G(true).A0Q();
    }

    public final java.lang.String A1K() {
        return A0G(true).A0R();
    }

    public final java.lang.String A1L() {
        return A0F().A0d();
    }

    public final java.lang.String A1M() {
        if (this.A0e == null || android.text.TextUtils.isEmpty(this.A0e.A0E().A0e())) {
            return null;
        }
        return this.A0f.A0T(this.A0e.A0E().A0e());
    }

    public final java.util.List<com.facebook.ads.redexgen.core.UK> A1N() {
        if (this.A0e == null || !isAdLoaded()) {
            return null;
        }
        return this.A0e.A0H();
    }

    public final void A1O() {
        if (!com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(this.A0g.A02()).A0O(this.A0g, false)) {
            A0b();
            if (A0q[5].length() == 3) {
                throw new java.lang.RuntimeException();
            }
            A0q[3] = "yREZ0BSYt8CSunaR9f1myx0zIAs3a5bO";
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1199Zd A01 = com.facebook.ads.redexgen.core.AbstractC1200Ze.A01(this.A0g, this.A0g.A0A(), A1H(), this.A08);
        if (A01 == null) {
            A0b();
            return;
        }
        ((com.facebook.ads.redexgen.core.C1665hB) this.A08.getNativeAdLayoutApi()).A05(A01);
        if (!com.facebook.ads.redexgen.core.C1086Up.A22(this.A0g)) {
            com.facebook.ads.redexgen.core.C1636gi A15 = A15();
            java.lang.String[] strArr = A0q;
            if (strArr[6].length() != strArr[1].length()) {
                A15.A0F().ABW();
                A01.setOnAdClosedListener(this.A07);
            } else {
                A0q[5] = "wIzlh5hd";
                A15.A0F().ABW();
                A01.setOnAdClosedListener(this.A07);
            }
        }
        A01.setAdReportingCallbackListener(this.A0N);
        A01.A0N();
    }

    public final void A1P(android.graphics.drawable.Drawable drawable) {
        this.A01 = drawable;
        A1o(drawable != null, true);
    }

    public final void A1Q(android.view.View view) {
        this.A0m.add(view);
        view.setOnClickListener(this.A0H);
        view.setOnTouchListener(this.A0H);
        if (com.facebook.ads.redexgen.core.C1086Up.A1C(view.getContext())) {
            view.setOnLongClickListener(this.A0H);
        }
    }

    public final /* synthetic */ void A1R(android.view.View view) {
        this.A0g.A0F().AAy(com.facebook.ads.redexgen.core.EnumC1244aM.A05.name().toLowerCase(java.util.Locale.US));
        A1O();
    }

    public final void A1S(android.view.View view, android.widget.ImageView imageView) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        A0p(arrayList, view);
        A0g(view, imageView, arrayList, true);
    }

    public final void A1T(android.view.View view, android.widget.ImageView imageView, java.util.List<android.view.View> clickableViews) {
        A0g(view, imageView, clickableViews, true);
    }

    public final void A1U(android.view.View view, com.facebook.ads.internal.api.AdNativeComponentView adNativeComponentView) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        A0p(arrayList, view);
        A0g(view, adNativeComponentView, arrayList, false);
    }

    public final void A1V(android.view.View view, com.facebook.ads.internal.api.AdNativeComponentView adNativeComponentView, java.util.List<android.view.View> clickableViews) {
        A0g(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1W(android.view.View view, com.facebook.ads.internal.api.AdNativeComponentView adNativeComponentView, java.util.List<android.view.View> clickableViews, boolean z) {
        A0g(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1X(android.view.View view, com.facebook.ads.internal.api.AdNativeComponentView adNativeComponentView, boolean z) {
        java.util.List<android.view.View> clickableViews = new java.util.ArrayList<>();
        A0p(clickableViews, view);
        A0g(view, adNativeComponentView, clickableViews, z);
    }

    public final void A1Y(com.facebook.ads.AdClosedListener adClosedListener) {
        A15().A0F().ABX();
        this.A07 = adClosedListener;
    }

    public final void A1Z(com.facebook.ads.MediaView mediaView) {
        if (mediaView != null) {
            this.A0c = true;
        }
    }

    public final void A1a(com.facebook.ads.MediaView mediaView) {
        if (mediaView != null) {
            this.A0d = true;
        }
    }

    public final void A1b(com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0n(new com.facebook.ads.redexgen.core.C04986y(nativeAdListener, nativeAdBase));
    }

    public final void A1c(com.facebook.ads.NativeAdLayout nativeAdLayout) {
        this.A08 = nativeAdLayout;
    }

    public final void A1d(com.facebook.ads.redexgen.core.C1818ju c1818ju) {
        A0i(c1818ju, true);
        if (this.A0I != null && c1818ju.A0H() != null) {
            com.facebook.ads.redexgen.core.C1116Vv c1116Vv = new com.facebook.ads.redexgen.core.C1116Vv(this);
            for (com.facebook.ads.redexgen.core.UK uk : c1818ju.A0H()) {
                if (A0q[3].charAt(5) != 'B') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0q;
                strArr[0] = "7JUEXy8BV6wMe69mvRG8Hisl1h58kfsH";
                strArr[4] = "Ag7M0cktqfZPxcWhbEyn8XCMGlxm5ALn";
                uk.A0j(c1116Vv);
            }
        }
    }

    public final void A1e(com.facebook.ads.redexgen.core.C1683hT c1683hT) {
        this.A0X = new java.lang.ref.WeakReference<>(c1683hT);
    }

    public final void A1f(com.facebook.ads.redexgen.core.VW vw, java.lang.String str, com.facebook.ads.redexgen.core.T3 t3) {
        if (str == null) {
            this.A0g.A0F().A3Q();
        } else {
            this.A0g.A0F().A3P();
        }
        this.A00 = java.lang.System.currentTimeMillis();
        boolean z = this.A0n;
        java.lang.String[] strArr = A0q;
        if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
            java.lang.String[] strArr2 = A0q;
            strArr2[0] = "knecuAJjZigTf7VsFCGhTGCW7dxKplKn";
            strArr2[4] = "uRrNlLGUJL1gxvEKewtOLFu1Ztix0dl1";
            if (z) {
                com.facebook.ads.AdSettings.IntegrationErrorMode A00 = com.facebook.ads.redexgen.core.OA.A00(this.A0g);
                java.lang.String A0W = A0W(566, 30, 105);
                com.facebook.ads.AdSettings.IntegrationErrorMode integrationErrorMode = com.facebook.ads.AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
                if (!integrationErrorMode.equals(A00)) {
                    com.facebook.ads.redexgen.core.C1108Vm c1108Vm = new com.facebook.ads.redexgen.core.C1108Vm(com.facebook.ads.internal.protocol.AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(566, 30, 105));
                    A16().A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), c1108Vm.A03().getErrorCode(), c1108Vm.A04());
                    if (this.A0I != null) {
                        this.A0I.ADp(c1108Vm);
                    } else {
                        android.util.Log.e(A0W(76, 17, 41), A0W);
                    }
                    com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A0W);
                    A16().A08().ABC(A0W(550, 3, 101), com.facebook.ads.redexgen.core.AbstractC1048Td.A0c, c1049Te);
                } else {
                    throw new com.facebook.ads.redexgen.core.OF(A0W);
                }
            }
            this.A0n = true;
            this.A0G = vw;
            if (vw.equals(com.facebook.ads.redexgen.core.VW.A05)) {
                com.facebook.ads.redexgen.core.NE ne = com.facebook.ads.redexgen.core.NE.A05;
                if (A0q[3].charAt(5) == 'B') {
                    A0q[3] = "N11XMBa1eBkGGouoRChlRsXEwEtHvHDZ";
                    this.A09 = ne;
                }
            }
            this.A0D = t3;
            com.facebook.ads.redexgen.core.O7 o7 = new com.facebook.ads.redexgen.core.O7(this.A0k, this.A0L, A0R(), null, 1, new com.facebook.ads.redexgen.core.C1755ij());
            o7.A05(vw);
            o7.A06(this.A0V);
            o7.A07(this.A0W);
            this.A0B = new com.facebook.ads.redexgen.core.C05067g(this.A0g, o7);
            this.A0B.A0S(new com.facebook.ads.redexgen.core.C1117Vw(this));
            this.A0B.A0W(str);
            return;
        }
        throw new java.lang.RuntimeException();
    }

    public final void A1g(com.facebook.ads.redexgen.core.C1100Vd c1100Vd) {
        this.A0J = c1100Vd;
    }

    public final void A1h(com.facebook.ads.redexgen.core.EnumC1101Ve enumC1101Ve) {
        this.A0K = enumC1101Ve;
    }

    public final void A1i(com.facebook.ads.redexgen.core.EnumC1111Vq enumC1111Vq) {
        if (!A0r()) {
            if (com.facebook.ads.redexgen.core.EnumC1111Vq.A05.equals(enumC1111Vq)) {
                this.A0g.A0F().A3T(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER.toString(), this.A0k);
            } else {
                this.A0g.A0F().A3T(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.toString(), this.A0k);
            }
        }
        this.A0L = enumC1111Vq;
    }

    public final void A1j(com.facebook.ads.redexgen.core.InterfaceC1198Zc interfaceC1198Zc) {
        this.A0N = interfaceC1198Zc;
    }

    public final void A1k(com.facebook.ads.redexgen.core.AbstractC1580fo abstractC1580fo) {
        this.A0Y = new java.lang.ref.WeakReference<>(abstractC1580fo);
    }

    public final void A1l(boolean z) {
        this.A0a = z;
    }

    public final void A1m(boolean z) {
        this.A0Z = z;
    }

    public final void A1n(boolean z) {
        this.A0b = z;
    }

    public final void A1o(boolean z, boolean z2) {
        java.lang.String A0W;
        if (z) {
            if (this.A0G.equals(com.facebook.ads.redexgen.core.VW.A05)) {
                boolean A0r2 = A0r();
                if (A0q[3].charAt(5) != 'B') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0q;
                strArr[6] = "maLBxQjysuwmJ75m3YPaJDHU5JlBu";
                strArr[1] = "hXXEi4DazsshJWFEyRiAh7tUxgC1d";
                if (!A0r2 && this.A0I != null) {
                    this.A0I.AEq();
                }
            }
            if (this.A0U != null) {
                this.A0U.A0U();
                this.A0i.A09();
                return;
            }
            return;
        }
        if (this.A0U != null) {
            com.facebook.ads.redexgen.core.C1818ju adapter = A12();
            if (adapter != null) {
                A0W = adapter.A0G();
            } else if (A0q[5].length() != 3) {
                java.lang.String[] strArr2 = A0q;
                strArr2[2] = "2ETmOz1YodPf8MKRGGB9YcIoy7FDTpAq";
                strArr2[7] = "k5VZ8yDbY0Zqj8FxkeEerY08JJe7M6tR";
                A0W = A0W(0, 0, 121);
            } else {
                java.lang.String[] strArr3 = A0q;
                strArr3[0] = "JjUCnZOckAfeDcKZajvIf0dyi7sruRRg";
                strArr3[4] = "GlO3j5qd4HFQ8L5mPWBpkp3onxgG8Q98";
                A0W = A0W(0, 0, 121);
            }
            this.A0i.A0C(this.A0g, A0W);
            this.A0U.A0V();
        }
        if (this.A0I != null && z2) {
            com.facebook.ads.redexgen.core.C1108Vm A01 = com.facebook.ads.redexgen.core.C1108Vm.A01(com.facebook.ads.internal.protocol.AdErrorType.BROKEN_MEDIA_ERROR, A0W(93, 21, 47));
            A16().A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), A01.A03().getErrorCode(), A01.A04());
            this.A0I.ADp(A01);
        }
    }

    public final boolean A1p() {
        return this.A0Z;
    }

    public final boolean A1q() {
        return A0F().A0h();
    }

    public final boolean A1r() {
        return A0F().A0g();
    }

    public final boolean A1s() {
        return this.A0L == com.facebook.ads.redexgen.core.EnumC1111Vq.A05;
    }

    public final boolean A1t() {
        return this.A08 == null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1105Vi
    public final int A7d() {
        android.view.View view = this.A06;
        if (view instanceof com.facebook.ads.internal.api.AdNativeComponentView) {
            android.view.View videoView = ((com.facebook.ads.internal.api.AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof com.facebook.ads.redexgen.core.C1520eq) {
                return ((com.facebook.ads.redexgen.core.C1520eq) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(com.facebook.ads.NativeAdBase nativeAdBase) {
        return new com.facebook.ads.redexgen.core.C1103Vg(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A0W(553, 7, 95), A0W(363, 19, 11), A0W(21, 8, 17));
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0g)) {
            A16().A0B().AKU(this.A03);
        }
        if (!A0r()) {
            this.A0g.A0F().A3U();
        }
        if (this.A0B != null) {
            this.A0B.A0Y(true);
            this.A0B.A0K();
            this.A0B = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0G.equals(com.facebook.ads.redexgen.core.VW.A05)) {
            this.A09 = com.facebook.ads.redexgen.core.NE.A04;
        }
        this.A0G = com.facebook.ads.redexgen.core.VW.A04;
        A0i(this.A0e, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdBodyText() {
        return A0G(true).A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdCallToAction() {
        return A0G(true).A0Z();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        return getAdChoicesIcon().getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdChoicesLinkUrl() {
        return A0F().A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdChoicesText() {
        return A0F().A0N();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdHeadline() {
        return A0G(true).A0O();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdLinkDescription() {
        return A0G(true).A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdSocialContext() {
        return A0G(true).A0T();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdTranslation() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdUntrimmedBodyText() {
        return A0G(true).A0X();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getAdvertiserName() {
        return A0G(true).A0Y();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        com.facebook.ads.redexgen.core.C1098Vb nativeAdImage;
        if (this.A0e == null || (nativeAdImage = this.A0e.A0E().A0H()) == null) {
            return 0.0f;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        if (height <= 0) {
            return 0.0f;
        }
        float f = width;
        float f2 = height;
        java.lang.String[] strArr = A0q;
        if (strArr[0].charAt(21) == strArr[4].charAt(21)) {
            throw new java.lang.RuntimeException();
        }
        A0q[3] = "OUTl4BjdLTzCi4kmpI6eA9pKBM08eKMp";
        return f / f2;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0l;
    }

    @Override // com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A0k;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final android.graphics.drawable.Drawable getPreloadedIconViewDrawable() {
        com.facebook.ads.redexgen.core.C1098Vb A0I;
        android.graphics.Bitmap A0N;
        com.facebook.ads.redexgen.core.C1818ju adapter = this.A0e;
        if (adapter != null && (A0I = A0F().A0I()) != null && (A0N = this.A0f.A0N(A0I.getUrl())) != null) {
            return A05(A16(), A0N, A1t(), A1I());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getPromotedTranslation() {
        return A0G(true).A0S();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final java.lang.String getSponsoredTranslation() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        return this.A0e != null && this.A0e.A0Q();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z = true;
        if (this.A0B != null) {
            com.facebook.ads.redexgen.core.C05067g c05067g = this.A0B;
            java.lang.String[] strArr = A0q;
            if (strArr[6].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0q;
            strArr2[2] = "gqyuy6F7WThaJUOfAsIyr4sziGGBhw0f";
            strArr2[7] = "L6lbko7Rv34huPFym8TvMBezY1vQkdWf";
            z = c05067g.A0Z();
        } else if (this.A0C != null) {
            z = this.A0C.A0A();
        }
        this.A0g.A0F().A5f(z);
        return z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        return this.A0e != null && this.A0e.A0R();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(13, 8, 68));
        A1f(com.facebook.ads.redexgen.core.VW.A00(com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL), null, new com.facebook.ads.redexgen.core.T3(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(com.facebook.ads.NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(5, 8, 76));
        ((com.facebook.ads.redexgen.core.C1103Vg) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        if (this.A05 != null) {
            this.A05.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        if (this.A04 != null) {
            this.A04.post(new com.facebook.ads.redexgen.core.C1118Vx(this));
        }
        java.lang.String str = A0W(164, 16, 48) + com.facebook.ads.redexgen.core.AbstractC1163Xt.A03(this.A0g, th);
        A16().A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A00), 2001, str);
        if (this.A0I != null) {
            this.A0I.ADp(new com.facebook.ads.redexgen.core.C1108Vm(2001, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0o(extraHints.getHints());
        this.A0W = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void unregisterView() {
        com.facebook.ads.redexgen.core.C1484eF c1484eF = this.A0Q;
        if (c1484eF != null) {
            android.view.ViewParent parent = c1484eF.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(c1484eF);
            }
            this.A0Q = null;
        }
        if (this.A04 == null || this.A06 == null) {
            return;
        }
        if (!A0r()) {
            com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = this.A0g.A0F();
            java.lang.String[] strArr = A0q;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0q[3] = "w9n8TBisrss8zAM8EiwpgeUnlq2PaQ6F";
                A0F.unregisterView();
            }
            throw new java.lang.RuntimeException();
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A0g)) {
            A16().A0B().AKU(this.A03);
        }
        if (A0s.containsKey(this.A04) && A0s.get(this.A04).get() == this) {
            android.view.View view = this.A04;
            java.lang.String[] strArr2 = A0q;
            if (strArr2[2].charAt(3) != strArr2[7].charAt(3)) {
                java.lang.String[] strArr3 = A0q;
                strArr3[6] = "1kkuB6xtwDeF3EtU3aavEsH64nQcK";
                strArr3[1] = "rb6NM7K87kMKFcLdVL5rugEXgDuZd";
                if ((view instanceof android.view.ViewGroup) && this.A0M != null) {
                    ((android.view.ViewGroup) this.A04).removeView(this.A0M);
                    this.A0M = null;
                }
                if (this.A0e != null) {
                    this.A0e.A0J();
                }
                if (this.A0O != null && com.facebook.ads.redexgen.core.C1086Up.A1C(this.A0g)) {
                    this.A0O.A07();
                    android.view.View view2 = this.A04;
                    java.lang.String[] strArr4 = A0q;
                    if (strArr4[2].charAt(3) == strArr4[7].charAt(3)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr5 = A0q;
                    strArr5[0] = "4gE9LeNlQroHqEeWf1EzJsbNX9PRfDme";
                    strArr5[4] = "TBDkrxJbHtSaZ13hkNs0RNY8SzE0jpKy";
                    view2.getOverlay().remove(this.A0O);
                }
                A0s.remove(this.A04);
                A0a();
                this.A04 = null;
                this.A06 = null;
                if (this.A0U != null) {
                    this.A0U.A0V();
                    this.A0U = null;
                }
                A0d();
                this.A0A = null;
                this.A0Z = false;
                return;
            }
            throw new java.lang.RuntimeException();
        }
        throw new java.lang.IllegalStateException(A0W(481, 38, 57));
    }
}
