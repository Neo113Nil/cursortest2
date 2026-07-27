package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.So, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2327So {
    public static byte[] A03;
    public static final AtomicBoolean A04;
    public C2926ge A00;
    public String A01;
    public final C2449Xl A02 = new C2449Xl(300000000000L, new C2937gp(this));

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-56, -43, -56, -45, -42, -50, -86, -95, -80, -77, -85, -82, -89, -69, -80, -75, -84, -95, -64, -78, -64, -64, -74, -68, -69, -52, -63, -74, -70, -78};
    }

    static {
        A04();
        A04 = new AtomicBoolean(false);
    }

    public static UD A00(C2926ge c2926ge) {
        if (C2380Up.A1B(c2926ge)) {
            return UE.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12));
        }
        return UE.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C2926ge c2926ge;
        synchronized (this) {
            c2926ge = this.A00;
        }
        if (c2926ge == null) {
            return;
        }
        String A05 = UG.A00().A01(c2926ge, true).A05(A00(c2926ge));
        synchronized (this) {
            this.A01 = A05;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized String A06(C2926ge c2926ge) {
        this.A00 = c2926ge;
        this.A00.A08().ACP();
        this.A00.A04().ADI(c2926ge);
        if (this.A00.A07().AJw() || ((A04.get() && C2380Up.A21(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A04.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
