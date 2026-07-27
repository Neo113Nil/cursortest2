package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZR implements TA {
    public static ZR A07;
    public static byte[] A08;
    public InterfaceC2160Lx A00;
    public T1 A01;
    public T9 A02;
    public TP A03;
    public U7 A04;
    public VM A05;
    public CY A06;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, Base64.padSymbol, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, Base64.padSymbol, Ascii.FS, -13, -19, 32, Ascii.ESC, -15, Ascii.FS, Ascii.SI, Ascii.SUB, Ascii.EM, Ascii.FS, Ascii.RS, -3, Ascii.SI, Ascii.GS, Ascii.GS, 19, Ascii.EM, Ascii.CAN, -18, Ascii.VT, Ascii.RS, Ascii.VT, -13, Ascii.CAN, 19, Ascii.RS, 19, Ascii.VT, Ascii.SYN, 19, 36, Ascii.SI, Ascii.SO};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C2926ge c2926ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c2926ge);
        this.A06 = A05(c2926ge, this.A03, A03(c2926ge));
        A09(c2926ge, A00(c2926ge, this.A06));
        A0A(c2926ge, this.A06);
        A0B(c2926ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static SR A00(C2926ge c2926ge, CY cy) {
        if (!C2380Up.A1r(c2926ge) || cy == null) {
            return null;
        }
        return SS.A00().A00(cy);
    }

    public static TP A01(C2926ge c2926ge) {
        return TQ.A00().A00(c2926ge, new C2629bp());
    }

    public static synchronized ZR A02() {
        ZR zr;
        synchronized (ZR.class) {
            if (A07 == null) {
                A07 = new ZR();
            }
            zr = A07;
        }
        return zr;
    }

    public static InterfaceC2881fv A03(C2926ge c2926ge) {
        if (!C2380Up.A1n(c2926ge)) {
            return null;
        }
        return C2899gD.A01(c2926ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.TA
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized CY A9F() {
        return this.A06;
    }

    public static CY A05(C2926ge c2926ge, TP tp, InterfaceC2881fv interfaceC2881fv) {
        if (!C2380Up.A2m(c2926ge) || interfaceC2881fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC2922ga.A00().A00(c2926ge, tp, interfaceC2881fv, WI.A04(c2926ge), new ZW(new WA(c2926ge, A06(0, 0, 9), null, EnumC2405Vq.A08, 0, new C2409Vu(), AbstractC2457Xt.A01(C2380Up.A0N(c2926ge)), null, null, new C3049ij()), c2926ge), C2920gY.A00().A00());
    }

    public static void A08() {
        AbstractC2413Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C2926ge c2926ge, SR sr) {
        if (!C2380Up.A1r(c2926ge) || sr == null) {
            return;
        }
        SP.A00().A00(sr, c2926ge);
    }

    public static void A0A(C2926ge c2926ge, CY cy) {
        if (!C2380Up.A0m(c2926ge) || cy == null) {
            return;
        }
        new C2325Sm(c2926ge, cy, new C2326Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C2926ge c2926ge, CY cy) {
        if (cy == null) {
            return;
        }
        AbstractC2384Ut.A00(c2926ge, cy);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final VA A6n(C2926ge c2926ge) {
        return WW.A01(c2926ge);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized T9 A74(T8 t8) {
        if (this.A02 == null) {
            this.A02 = new C2496Zg(this);
        }
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C2931gj();
        }
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TP A7l(T8 t8) {
        if (this.A03 == null) {
            this.A03 = A01(t8.A02());
        }
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized InterfaceC2341Tc A7n(T8 t8) {
        return new C2824f0(t8);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TB A7x(final T8 t8) {
        return new AbstractC2628bo(t8) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.instagram.common.viewpoint.core.TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC1930Cz.A09();
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ACP() {
                U2.A06(C2303Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ACn() {
                U2.A07(C2303Rp.A09(super.A00));
            }

            @Override // com.instagram.common.viewpoint.core.TB
            public final void ADI(C2926ge c2926ge) {
                OP.A01(c2926ge);
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized InterfaceC2160Lx A8C(T8 t8) {
        if (!C2380Up.A13(t8)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC2161Ly.A00().A00(new C2592bE(t8));
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized TD A8y(T8 t8) {
        return new C2566ao(t8);
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final C2926ge A8z(Context context) {
        C2926ge sdkContext = T7.A00();
        if (sdkContext == null) {
            C2926ge sdkContext2 = new C2926ge(context, this);
            T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized VM A90(C2926ge c2926ge) {
        if (this.A05 == null) {
            this.A05 = new XP(c2926ge);
        }
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.TA
    public final synchronized U7 A96() {
        if (this.A04 == null) {
            this.A04 = new U7();
            A08();
        }
        return this.A04;
    }
}
