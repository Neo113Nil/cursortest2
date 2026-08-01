package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.iu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3059iu implements WC {
    public static byte[] A0E;
    public static String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public OB A00;
    public C2361Tw A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final N6 A07;
    public final C2930gi A08;
    public final VA A09;
    public final EnumC2405Vq A0A;
    public final WD A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        YD.A02();
    }

    public C3059iu(C2930gi c2930gi, String str, EnumC2405Vq enumC2405Vq, AdSize adSize, int i) {
        this.A08 = c2930gi;
        this.A0D = str;
        this.A0A = enumC2405Vq;
        this.A06 = adSize;
        this.A04 = i;
        this.A0B = new WD(this.A08);
        this.A0B.A0R(this);
        this.A07 = new N6();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new Q9<C3059iu>(this) { // from class: com.facebook.ads.redexgen.X.7e
            {
                super(this);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
            public final void A07() {
                C2930gi c2930gi2;
                Handler handler;
                Runnable runnable;
                C3059iu A08 = A08();
                if (A08 == null) {
                    return;
                }
                c2930gi2 = A08.A08;
                if (YV.A02(c2930gi2)) {
                    A08.A07();
                    return;
                }
                handler = A08.A05;
                runnable = A08.A0C;
                handler.postDelayed(runnable, 5000L);
            }
        };
        this.A09 = c2930gi.A0A();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C3112ju> A04() {
        C2361Tw c2361Tw = this.A01;
        final ArrayList arrayList = new ArrayList(c2361Tw.A02());
        for (C2359Tu A04 = c2361Tw.A04(); A04 != null; A04 = c2361Tw.A04()) {
            N1 A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (A00 != null && A00.A8k() == AdPlacementType.NATIVE) {
                final C3112ju nativeAdapter = (C3112ju) A00;
                nativeAdapter.A0L(this.A08, new AbstractC3060iv() { // from class: com.facebook.ads.redexgen.X.7f
                    @Override // com.instagram.common.viewpoint.core.NG
                    public final void AEw(C3112ju c3112ju) {
                        arrayList.add(nativeAdapter);
                    }
                }, this.A09, new O8(A04.A04(), c2361Tw.A05(), this.A0D, c2361Tw.A05().A0C()), UK.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            this.A0B.A0Q(new WA(this.A08, this.A0D, this.A06 != null ? new C2451Xn(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new C2409Vu(this.A08, null, null, null), AbstractC2457Xt.A01(C2380Up.A0N(this.A08)), this.A02, null, new C3049ij()));
        } catch (C2403Vn e) {
            ADp(C2402Vm.A02(e));
        }
    }

    public final void A08(OB ob) {
        this.A00 = ob;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0I();
    }

    @Override // com.instagram.common.viewpoint.core.WC
    public final void ADp(C2402Vm c2402Vm) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.ADp(c2402Vm);
        }
    }

    @Override // com.instagram.common.viewpoint.core.WC
    public final void AG7(RG rg) {
        C2361Tw A00 = rg.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<C3112ju> A04 = A04();
            if (this.A00 != null) {
                boolean isEmpty = A04.isEmpty();
                String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (isEmpty) {
                    this.A00.ADp(C2402Vm.A01(AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.AEy(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 18));
    }
}
