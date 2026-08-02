package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.7B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7B extends AbstractC1436iA {
    public static SF A0D;
    public static byte[] A0E;
    public static String[] A0F = {"g9SdUg6XNSnvVCS02jX19aczyGq48qDV", "lGSQ9LsgX83H3UqklEPZgAjaPEKabNT0", "y0oXMo4BXc2on8MNFvJxgBv", "Ulfd9L14l0ScyK0QB689zsPu0EZ5wfqr", "W3xKKEfUMxBXJmvfztSkCM8j4ls7Vw3H", "lNYBpqeQZYlfeCveDiVEAZh", "rx8", "elj"};
    public long A00;
    public InterfaceC0600Mh A01;
    public C0601Mi A02;
    public AbstractC0606Mo A03;
    public C1153dL A04;
    public EnumC0823Vb A05;
    public C1064bt A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0E = new byte[]{-98, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, 1, -2, 3, -16, 3, -8, -2, -3, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, 1, 6, -1, 7, Ascii.FF, 3, 2, -33, 2, -30, -1, Ascii.DC2, -1, -32, 19, Ascii.FF, 2, 10, 3, Ascii.GS, Ascii.NAK, Ascii.DC4, Ascii.EM, 17, 36, Ascii.EM, Ascii.US, Ascii.RS, -12, 17, 36, 17, 16, Ascii.FF, 1, 3, 5, Ascii.CR, 5, Ascii.SO, Ascii.DC4, -23, 4, -68, -66, -79, -80, -79, -78, -75, -70, -79, -80, -101, -66, -75, -79, -70, -64, -83, -64, -75, -69, -70, -105, -79, -59, -17, -30, -18, -14, -30, -16, -15, -47, -26, -22, -30, -2, -15, 3, -19, -2, -16, -33, -15, -2, 2, -15, -2, -31, -34, -40, -13, -26, -8, -30, -13, -27, -26, -27, -41, -22, -27, -26, -16, -62, -27, -59, -30, -11, -30, -61, -10, -17, -27, -19, -26, Ascii.FS, Ascii.SI, 33, Ascii.VT, Ascii.FS, Ascii.SO, Ascii.SI, Ascii.SO, 9, 32, 19, Ascii.SO, Ascii.SI, Ascii.EM, -61, -68, -73, -65, -61, -77, -105, -78, -4, -17, -21, -3, -38, -1, -10, -21};
    }

    static {
        A09();
    }

    private void A07() {
        OO.A00(this.A04).A06(this.A02, this.A02.A00());
    }

    private void A08() {
        if (this.A02 != null) {
            try {
                OO.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A0A(Intent intent) {
        int i = super.A00;
        String A05 = A05(77, 24, 25);
        if (i != -1 && Settings.System.getInt(this.A04.getContentResolver(), A05(1, 22, 92), 0) != 1) {
            int i2 = super.A00;
            String[] strArr = A0F;
            if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "RWC7frN5DjKRH0uo4BJmLzj";
            strArr2[2] = "FPcb0UYEDF6wwONX6Ty9E2F";
            intent.putExtra(A05, i2);
            return;
        }
        C1153dL c1153dL = this.A04;
        String[] strArr3 = A0F;
        if (strArr3[7].length() == strArr3[6].length()) {
            String[] strArr4 = A0F;
            strArr4[5] = "O4w3do1khQsKhsE3USwlJ7C";
            strArr4[2] = "rALKIAVwphrvKmHx0hqaLzY";
            if (U7.A0h(c1153dL)) {
                return;
            }
        } else if (U7.A0h(c1153dL)) {
            return;
        }
        intent.putExtra(A05, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(final C1153dL c1153dL, final C1426hw c1426hw, final int i) {
        if (i >= c1426hw.A1u()) {
            return;
        }
        final AnonymousClass73 anonymousClass73 = (AnonymousClass73) c1426hw.A1x(i);
        A0D = new SF(c1153dL);
        A0D.A0e(new C0796Ua(anonymousClass73.A25(), c1153dL.A0A()));
        NS.A02(c1153dL, A0D, anonymousClass73);
        final boolean z = i == 0;
        A0D.A0X(new AbstractC1403hU(z) { // from class: com.facebook.ads.redexgen.X.7C
            @Override // com.instagram.common.viewpoint.core.AbstractC1403hU
            public final void A00() {
                InterfaceC0600Mh interfaceC0600Mh;
                interfaceC0600Mh = C7B.this.A01;
                interfaceC0600Mh.AF7(C7B.this, AdError.CACHE_ERROR);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1403hU
            public final void A01(boolean z2) {
                AtomicBoolean atomicBoolean;
                InterfaceC0600Mh interfaceC0600Mh;
                C7B.A0D = null;
                if (z2) {
                    c1153dL.A01().AIU(anonymousClass73.A25(), c1426hw.A1y());
                }
                if (i == 0) {
                    atomicBoolean = C7B.this.A0C;
                    atomicBoolean.set(true);
                    interfaceC0600Mh = C7B.this.A01;
                    interfaceC0600Mh.AF4(C7B.this);
                }
                C7B.this.A0C(c1153dL, c1426hw, i + 1);
            }
        }, new S8(anonymousClass73.A17(), A05(Opcodes.DCMPG, 14, 119), i));
    }

    private void A0D(boolean z) {
        if (this.A05 == EnumC0823Vb.A0F) {
            A0F(z);
            return;
        }
        if (this.A05 == EnumC0823Vb.A0H) {
            A0G(z);
        } else if (this.A05 == EnumC0823Vb.A0G) {
            A0E(z);
        } else {
            A0G(z);
        }
    }

    private void A0E(boolean z) {
        SF sf = new SF(this.A04);
        boolean z2 = U7.A2A(this.A04) && C0725Rf.A0A(this.A03.A1C());
        if (z2) {
            C0725Rf unifiedAssetsLoader = new C0725Rf(sf, this.A03.A1C(), this.A03.A0v(), this.A03.A17(), z2, new C1444iI(this));
            sf.A0e(new C0796Ua(((AbstractC1428hy) this.A03).A25(), this.A04.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        NR.A02(this.A04, (AbstractC1428hy) this.A03, z, new C1443iH(this));
    }

    private void A0F(boolean z) {
        SF sf = new SF(this.A04);
        sf.A0e(new C0796Ua(((AbstractC1428hy) this.A03).A25(), this.A04.A0A()));
        NS.A03(this.A04, sf, (AnonymousClass73) this.A03);
        sf.A0X(new C1448iM(this), new S8(this.A03.A17(), A05(Opcodes.DCMPG, 14, 119)));
    }

    private void A0G(boolean z) {
        boolean z2 = false;
        if (this.A03.A1T()) {
            C1426hw c1426hw = (C1426hw) this.A03;
            for (int i = 0; i < c1426hw.A1u(); i++) {
                if (TextUtils.isEmpty(c1426hw.A1x(i).A20().A0H().A09())) {
                    this.A01.AF7(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0C(this.A04, c1426hw, 0);
            return;
        }
        SF sf = new SF(this.A04);
        sf.A0e(new C0796Ua(((AbstractC1428hy) this.A03).A25(), this.A04.A0A()));
        if (U7.A2A(this.A04) && C0725Rf.A0A(this.A03.A1C())) {
            z2 = true;
        }
        boolean A1Y = this.A03.A1Y();
        if (z2) {
            C0725Rf unifiedAssetsLoader = new C0725Rf(sf, this.A03.A1C(), this.A03.A0v(), this.A03.A17(), z2, new C1446iK(this, A1Y));
            unifiedAssetsLoader.A0B();
            return;
        }
        AnonymousClass73 anonymousClass73 = (AnonymousClass73) this.A03;
        if (TextUtils.isEmpty(anonymousClass73.A20().A0H().A09())) {
            if (this.A05 == EnumC0823Vb.A0I) {
                this.A04.A0F().ADm();
            }
            this.A01.AF7(this, AdError.INTERNAL_ERROR);
        } else {
            NS.A02(this.A04, sf, anonymousClass73);
            sf.A0X(new C7E(this, z, A1Y, anonymousClass73, this), new S8(anonymousClass73.A17(), A05(Opcodes.DCMPG, 14, 119)));
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1436iA
    public final int A0H() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A03.A0m();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1436iA
    public final AbstractC0606Mo A0I() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1436iA
    public final boolean A0J() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A1E(super.A01);
        String A03 = C1150dI.A03(super.A02, this.A0B, this.A07);
        this.A03.A1F(super.A02);
        this.A03.A1J(A03);
        AdActivityIntent A05 = WB.A05(this.A04);
        A05.putExtra(A05(Opcodes.FRETURN, 8, 83), this.A05);
        A05.putExtra(A05(127, 25, 78), this.A03);
        A05.putExtra(A05(34, 19, 107), this.A03);
        A05.putExtra(A05(Opcodes.IF_ACMPNE, 8, 27), this.A0B);
        if (A03 != null) {
            A05.putExtra(A05(112, 15, 89), A03);
        }
        A05.putExtra(A05(66, 11, 109), this.A0A);
        A05.putExtra(A05(101, 11, 74), this.A00);
        if (this.A09 != null) {
            A05.putExtra(A05(53, 13, 125), this.A09);
        }
        A0A(A05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            A05.setFlags(A05.getFlags() | 268435456);
        }
        ActivityUtils.A03(this.A04);
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!WB.A0I(this.A04, A05)) {
                    this.A04.A0F().AHS();
                    if (this.A01 != null) {
                        this.A01.AF7(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            WB.A0B(this.A04, A05);
            return true;
        } catch (W9 e) {
            String[] strArr = A0F;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[7] = "zr3";
            strArr2[6] = "zCM";
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            this.A04.A08().AAy(A05(23, 11, 50), AbstractC0766Sv.A01, new C0767Sw(th));
            return true;
        }
    }

    public final void A0K(C1153dL c1153dL, InterfaceC0600Mh interfaceC0600Mh, NU nu, boolean z, String str, String str2) {
        String A05;
        this.A0C.set(false);
        this.A04 = c1153dL;
        this.A01 = interfaceC0600Mh;
        this.A0A = nu.A02();
        this.A00 = nu.A00();
        this.A09 = str2;
        if (this.A0A != null) {
            String str3 = this.A0A;
            String A052 = A05(0, 1, 12);
            String[] strArr = A0F;
            if (strArr[7].length() == strArr[6].length()) {
                String[] strArr2 = A0F;
                strArr2[7] = "x5W";
                strArr2[6] = "dMK";
                A05 = str3.split(A052)[0];
            }
            throw new RuntimeException();
        }
        A05 = A05(0, 0, 100);
        this.A07 = A05;
        this.A03 = AbstractC0606Mo.A03(nu.A03(), this.A04);
        this.A03.A1H(str);
        this.A03.A1D(nu.A01().A06());
        if (this.A03.A1T()) {
            this.A08 = ((C1426hw) this.A03).A20();
        } else {
            this.A08 = ((AbstractC1428hy) this.A03).A25();
        }
        if (this.A03.A1Y()) {
            this.A05 = EnumC0823Vb.A08;
            if (this.A03.A1P()) {
                this.A04.A0F().AJ9(LT.A08);
            } else {
                this.A04.A0F().AJ9(LT.A0A);
            }
        } else {
            switch (this.A03.A0l()) {
                case 0:
                    this.A05 = EnumC0823Vb.A0H;
                    this.A04.A0F().AJ9(LT.A0D);
                    break;
                case 1:
                    this.A05 = EnumC0823Vb.A0G;
                    this.A04.A0F().AJ9(LT.A0C);
                    break;
                case 2:
                    this.A05 = EnumC0823Vb.A05;
                    this.A04.A0F().AJ9(LT.A05);
                    break;
                case 3:
                    this.A05 = EnumC0823Vb.A0F;
                    this.A04.A0F().AJ9(LT.A04);
                    break;
                case 4:
                    this.A05 = EnumC0823Vb.A0I;
                    this.A04.A0F().AJ9(LT.A0E);
                    break;
            }
        }
        if (U7.A0v(c1153dL)) {
            AbstractC0606Mo abstractC0606Mo = this.A03;
            String[] strArr3 = A0F;
            if (strArr3[4].charAt(19) != strArr3[0].charAt(19)) {
                String[] strArr4 = A0F;
                strArr4[4] = "c2SjyVfNFMTSQhwflPzyjFy3Fjr2snH4";
                strArr4[0] = "k4vT1WhZbJ1Mlr1eks5fTJscMmdnfo8D";
                if (abstractC0606Mo.A1T()) {
                    C1426hw c1426hw = (C1426hw) this.A03;
                    for (int A1u = c1426hw.A1u() - 1; A1u >= 0; A1u--) {
                        AbstractC1428hy A1x = c1426hw.A1x(A1u);
                        if (ML.A06(this.A04, ML.A01(c1153dL, A1x.A1C(), A1x.A25()), c1153dL.A0A())) {
                            this.A04.A0F().A4u();
                            c1426hw.A22(A1u);
                            return;
                        }
                    }
                    if (c1426hw.A1u() == 0) {
                        this.A01.AF7(this, AdError.NO_FILL);
                        return;
                    }
                } else if (ML.A06(this.A04, ML.A01(c1153dL, nu.A03(), ((AbstractC1428hy) this.A03).A25()), c1153dL.A0A())) {
                    this.A04.A0F().A4u();
                    this.A01.AF7(this, AdError.NO_FILL);
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A02 = new C0601Mi(this.A0B, this, interfaceC0600Mh);
        A07();
        A0D(z);
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final String A7G() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final boolean AJa() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final void onDestroy() {
        A08();
    }
}
