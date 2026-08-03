package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0869Ma implements com.facebook.ads.redexgen.core.InterfaceC1485eG {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.MW A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 114);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -24, -38, -25, -40, -31, -34, -40, -32};
    }

    static {
        A01();
    }

    public C0869Ma(com.facebook.ads.redexgen.core.MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C0869Ma(com.facebook.ads.redexgen.core.MW mw, com.facebook.ads.redexgen.core.C0881Mm c0881Mm) {
        this(mw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void AEA() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void AEh() {
        com.facebook.ads.redexgen.core.C0908No c0908No;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        c0908No = this.A00.A0H;
        if (!c0908No.A0b()) {
            this.A00.A0N();
            return;
        }
        com.facebook.ads.redexgen.core.MW mw = this.A00;
        java.lang.String[] strArr = A02;
        if (strArr[3].charAt(22) == strArr[0].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        A02[1] = "uysARHPfhmw6aS";
        atomicBoolean = mw.A0S;
        atomicBoolean.set(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void AFQ() {
        com.facebook.ads.redexgen.core.C1487eI c1487eI;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        this.A00.AFA(false);
        c1487eI = this.A00.A0Q;
        c1487eI.A0E(8);
        c1636gi = this.A00.A0J;
        c1636gi.A0F().AFH();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void AGg() {
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        interfaceC1177Yh = this.A00.A0O;
        interfaceC1177Yh.ADJ(15);
    }
}
