package com.instagram.common.viewpoint.core;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2609bV {
    public static long A0F;
    public static byte[] A0G;
    public static String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public InterfaceC2180Mr A00;
    public AbstractC2182Mt A01;
    public AbstractC3095jd A02;
    public XS A03;
    public InterfaceC2445Xh A04;
    public InterfaceC2608bU A05;
    public boolean A06;
    public final C2194Ng A07;
    public final C2930gi A08;
    public final VA A09;
    public final Y2 A0A;
    public final InterfaceC2471Yh A0B;
    public final C2875fp A0C;
    public final String A0D;
    public final boolean A0E;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, Byte.MIN_VALUE, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    static {
        A03();
        A0F = 0L;
    }

    public C2609bV(C2930gi c2930gi, String str, C2875fp c2875fp, Y2 y2, VA va, C2194Ng c2194Ng) {
        this(c2930gi, str, c2875fp, y2, va, c2194Ng, new C2129Ks());
    }

    public C2609bV(C2930gi c2930gi, String str, C2875fp c2875fp, Y2 y2, VA va, C2194Ng c2194Ng, InterfaceC2471Yh interfaceC2471Yh) {
        this.A0E = true;
        this.A08 = c2930gi;
        this.A0D = str;
        this.A0C = c2875fp;
        this.A0A = y2;
        this.A09 = va;
        this.A07 = c2194Ng;
        this.A0B = interfaceC2471Yh;
    }

    public C2609bV(C2930gi c2930gi, String str, C2875fp c2875fp, Y2 y2, VA va, C2194Ng c2194Ng, InterfaceC2471Yh interfaceC2471Yh, InterfaceC2445Xh interfaceC2445Xh) {
        this.A0E = true;
        this.A08 = c2930gi;
        this.A0D = str;
        this.A0C = c2875fp;
        this.A0A = y2;
        this.A09 = va;
        this.A07 = c2194Ng;
        this.A0B = interfaceC2471Yh;
        this.A04 = interfaceC2445Xh;
    }

    private EnumC2179Mq A00(String str, String str2, Map<String, String> map) {
        String A01 = A01(0, 22, 33);
        EnumC2179Mq actionOutcome = EnumC2179Mq.A09;
        try {
            YB.A0c(map, this.A02);
            Uri A00 = XB.A00(str2);
            if (this.A01 == null) {
                this.A01 = C2183Mu.A01(this.A08, this.A09, str, A00, new C2587b9(map).A03(this.A0C).A02(this.A0A).A05(), true, this.A06, this.A07);
                A02();
            }
            if (this.A01 instanceof AnonymousClass87) {
                ((AnonymousClass87) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                actionOutcome = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A06 && (this.A01 instanceof AnonymousClass85)) {
                    actionOutcome = EnumC2179Mq.A08;
                }
            }
            if (!(((this.A01 instanceof AnonymousClass84) || (this.A01 instanceof AnonymousClass87)) && YB.A0i(this.A08, actionOutcome, map)) && actionOutcome != EnumC2179Mq.A06) {
                if (this.A05 != null) {
                    this.A05.ADY();
                }
                this.A0B.A4j(this.A0D);
            }
        } catch (ActivityNotFoundException e) {
            Log.e(A01, A01(44, 20, 68) + str2, e);
        } catch (Exception e2) {
            Log.e(A01, A01(22, 22, 27), e2);
        }
        return actionOutcome;
    }

    private void A02() {
        if (this.A01 != null && this.A01.A0E() == null && this.A00 != null) {
            this.A01.A0F(this.A00);
        }
    }

    public static boolean A04(C2930gi c2930gi) {
        boolean A2w = C2380Up.A2w(c2930gi);
        int A07 = C2380Up.A07(c2930gi);
        long currentTimeMillis = System.currentTimeMillis() - A0F;
        if (A2w && A0F > 0 && currentTimeMillis < A07) {
            return true;
        }
        A0F = System.currentTimeMillis();
        return false;
    }

    public final EnumC2179Mq A05(String str, String str2, Map<String, String> extraData) {
        EnumC2179Mq enumC2179Mq = EnumC2179Mq.A09;
        new VI(str, this.A09).A04(VH.A0J, extraData);
        if (this.A0A.A09(this.A08)) {
            this.A09.AB6(str, extraData);
        } else {
            enumC2179Mq = A00(str, str2, extraData);
            if (this.A02 != null && this.A02.A29().A0L() != null && this.A04 != null) {
                XI.A07(this.A08.A02(), this.A02.A29().A0L(), this.A04);
            }
        }
        return enumC2179Mq;
    }

    public final InterfaceC2180Mr A06() {
        if (this.A01 != null) {
            InterfaceC2180Mr A0E = this.A01.A0E();
            String[] strArr = A0H;
            if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
            strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
            return A0E;
        }
        return null;
    }

    public final void A07(InterfaceC2180Mr interfaceC2180Mr) {
        this.A00 = interfaceC2180Mr;
        A02();
    }

    public final void A08(AbstractC3095jd abstractC3095jd) {
        this.A02 = abstractC3095jd;
    }

    public final void A09(XS xs) {
        this.A03 = xs;
    }

    public final void A0A(InterfaceC2445Xh interfaceC2445Xh) {
        this.A04 = interfaceC2445Xh;
    }

    public final void A0B(InterfaceC2608bU interfaceC2608bU) {
        this.A05 = interfaceC2608bU;
    }

    public final void A0C(boolean z) {
        this.A06 = z;
    }
}
