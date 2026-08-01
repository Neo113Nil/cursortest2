package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2163Ma implements InterfaceC2779eG {
    public static byte[] A01;
    public static String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ MW A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -24, -38, -25, -40, -31, -34, -40, -32};
    }

    static {
        A01();
    }

    public C2163Ma(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C2163Ma(MW mw, C2175Mm c2175Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void AEA() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void AEh() {
        C2202No c2202No;
        AtomicBoolean atomicBoolean;
        c2202No = this.A00.A0H;
        if (!c2202No.A0b()) {
            this.A00.A0N();
            return;
        }
        MW mw = this.A00;
        String[] strArr = A02;
        if (strArr[3].charAt(22) == strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A02[1] = "uysARHPfhmw6aS";
        atomicBoolean = mw.A0S;
        atomicBoolean.set(true);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void AFQ() {
        C2781eI c2781eI;
        C2930gi c2930gi;
        this.A00.AFA(false);
        c2781eI = this.A00.A0Q;
        c2781eI.A0E(8);
        c2930gi = this.A00.A0J;
        c2930gi.A0F().AFH();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void AGg() {
        InterfaceC2471Yh interfaceC2471Yh;
        interfaceC2471Yh = this.A00.A0O;
        interfaceC2471Yh.ADJ(15);
    }
}
