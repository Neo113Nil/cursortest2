package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class VG implements US {
    public static US A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1127cu A00;
    public final InterfaceC0779Tj A01;
    public final UR A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{50, 119, 100, 119, 124, 102, 60, 54, 3, 3, Ascii.DC2, Ascii.SUB, 7, 3, Ascii.RS, Ascii.EM, 16, 87, 3, Ascii.CAN, 87, Ascii.ESC, Ascii.CAN, 16, 87, Ascii.SYN, Ascii.EM, 87, Ascii.RS, Ascii.EM, 1, Ascii.SYN, Ascii.ESC, Ascii.RS, 19, 87, 66, 100, 119, 117, 115, 87, 85, 94, 85, 66, 89, 83, Ascii.GS, 16, Ascii.EM, Ascii.FF};
    }

    static {
        A03();
        A05 = VG.class.getSimpleName();
        A06 = false;
    }

    public VG(C1127cu c1127cu) {
        UQ dispatchCallback;
        this.A00 = c1127cu;
        if (U9.A0T(c1127cu)) {
            this.A01 = AbstractC0778Th.A00(c1127cu);
            dispatchCallback = UX.A00(c1127cu, this.A01);
        } else {
            C6J A01 = AbstractC0778Th.A01(c1127cu);
            dispatchCallback = UX.A01(c1127cu, A01);
            this.A01 = A01;
        }
        this.A02 = new VJ(c1127cu, dispatchCallback);
        XU.A08.execute(new VI(this));
        A04(c1127cu);
    }

    public static synchronized US A01(C1127cu c1127cu) {
        US us;
        synchronized (VG.class) {
            if (A03 == null) {
                A03 = new VG(c1127cu);
            }
            us = A03;
        }
        return us;
    }

    public static synchronized void A04(C1127cu c1127cu) {
        synchronized (VG.class) {
            if (A06) {
                return;
            }
            c1127cu.A04().ACE();
            A06 = true;
        }
    }

    private void A05(UP up) {
        if (!up.A0A()) {
            Log.e(A05, A02(7, 29, 55) + up.A06() + A02(0, 7, 82));
        } else {
            A06(up);
            this.A01.AKL(up, new VH(this, up));
        }
    }

    private void A06(UP up) {
        switch (up.A06()) {
            case A0Q:
            case A0K:
            case A07:
            case A0J:
            case A0R:
            case A0T:
            case A0U:
                C0767Sw c0767Sw = new C0767Sw(new Exception(A02(36, 5, 86)));
                c0767Sw.A05(1);
                try {
                    c0767Sw.A07(new JSONObject().put(A02(48, 4, 41), up.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A08().AAz(A02(41, 7, 112), AbstractC0766Sv.A1H, c0767Sw);
                break;
        }
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AAp(String str, Map<String, String> data) {
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A04).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AAr(String str, Map<String, String> data) {
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A06).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AAs(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A07).A06(AbstractC0798Uc.A0A(str, UZ.A0I)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AAt(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A08).A06(AbstractC0798Uc.A0A(str, UZ.A06)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AAx(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0B).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AB1(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0C).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AB5(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0D).A06(AbstractC0798Uc.A0A(str, UZ.A0T)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AB6(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0E).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AB7(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0F).A06(AbstractC0798Uc.A0A(str, UZ.A0V)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AB8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0K).A06(AbstractC0798Uc.A0A(str, UZ.A0W)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABH(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0H).A06(AbstractC0798Uc.A0A(str, UZ.A0X)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABJ(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0J).A06(AbstractC0798Uc.A0A(str, UZ.A0a)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABK(String str, Map<String, String> data, String str2, UU uu) {
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(uu).A02(UV.A00(str2)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABL(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        UP adEvent = new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABP(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0N).A06(AbstractC0798Uc.A0A(str, UZ.A0i)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABQ(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0O).A06(AbstractC0798Uc.A0A(str, UZ.A0j)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABS(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A01(UU.A04).A02(UV.A0P).A06(AbstractC0798Uc.A0A(str, UZ.A0k)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABT(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0G).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABX(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0Q).A06(AbstractC0798Uc.A0A(str, UZ.A0o)).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABY(String str, Map<String, String> data) {
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0V).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void ABa(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0W).A07(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.US
    public final void AGF(String str) {
        new AsyncTaskC1252ex(this.A00).execute(str);
    }
}
