package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2208Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C2336Sx A00;
    public EnumC2591bD A01 = EnumC2591bD.A05;
    public ArrayList<C2714dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC2207Nt A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, Ascii.ETB, 35, Ascii.FS, Ascii.ESC, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, Ascii.NAK, Ascii.CAN, 19, Ascii.CAN, Ascii.NAK, 40, Ascii.NAK, 19, Ascii.SYN, 41, 34, Ascii.CAN, 32, Ascii.EM, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, Ascii.DC2, Ascii.ETB, Ascii.DLE, Ascii.CAN, Ascii.GS, Ascii.DC4, 19, -16, 19, -13, Ascii.DLE, 35, Ascii.DLE, -15, 36, Ascii.GS, 19, Ascii.ESC, Ascii.DC4, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C2208Nu(C2930gi c2930gi, O8 o8, InterfaceC2207Nt interfaceC2207Nt, String str) {
        JSONObject dataObject = o8.A03();
        this.A03 = A01(c2930gi, o8, str, dataObject);
        this.A04 = interfaceC2207Nt;
    }

    private AdError A00(C2930gi c2930gi, AbstractC3095jd abstractC3095jd) {
        if (abstractC3095jd == null || abstractC3095jd.A2G().isEmpty()) {
            c2930gi.A08().ABC(A04(62, 3, 33), AbstractC2342Td.A0Z, new C2343Te(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static NQ A01(C2930gi c2930gi, O8 o8, String str, JSONObject jSONObject) {
        NQ nq = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nq = C3089jT.A01(jSONObject, c2930gi, true);
                nq.A1Q(true);
                nq.A1N(A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
            } catch (JSONException unused) {
            }
        }
        if (nq == null) {
            nq = C18077n.A00(jSONObject, c2930gi);
        }
        nq.A1M(str);
        C2362Tx A01 = o8.A01();
        if (A01 != null) {
            nq.A1I(A01.A06());
        }
        return nq;
    }

    private C2336Sx A03(C2930gi c2930gi) {
        return this.A00 != null ? this.A00 : new C2336Sx(c2930gi);
    }

    private void A08(C2930gi c2930gi, C18077n c18077n) {
        C2202No playableData = c18077n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC2591bD.A05);
        C3075jC c3075jC = new C3075jC(this);
        C2336Sx c2336Sx = new C2336Sx(c2930gi);
        boolean z = C2380Up.A2H(c2930gi) && SN.A0A(c18077n.A1H());
        if (z) {
            SN unifiedAssetsLoader = new SN(c2336Sx, c18077n.A1H(), c18077n.A10(), c18077n.A1D(), z, new C3074jB(this));
            c2336Sx.A0e(new VI(c18077n.A2E(), c2930gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c2930gi, c18077n, true, c3075jC);
    }

    private void A09(C2930gi c2930gi, EnumSet<CacheFlag> enumSet, AbstractC3095jd abstractC3095jd, int i, InterfaceC2207Nt interfaceC2207Nt) {
        boolean isDSL = abstractC3095jd.A1g();
        C2336Sx A03 = A03(c2930gi);
        A03.A0e(new VI(abstractC3095jd.A2E(), c2930gi.A0A()));
        boolean z = C2380Up.A2H(c2930gi) && SN.A0A(abstractC3095jd.A1H());
        if (z) {
            new SN(A03, abstractC3095jd.A1H(), abstractC3095jd.A10(), abstractC3095jd.A1D(), z, new C3078jF(this, c2930gi, isDSL, abstractC3095jd, interfaceC2207Nt)).A0B();
            return;
        }
        String A04 = A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        if (isDSL) {
            C2332St c2332St = new C2332St(abstractC3095jd.A0x(), abstractC3095jd.A1D(), A04);
            c2332St.A04 = true;
            c2332St.A03 = A04(0, 5, 78);
            A03.A0Y(c2332St);
        }
        A03.A0d(new C2334Sv(abstractC3095jd.A2C().A01(), C2767e4.A04, C2767e4.A04, abstractC3095jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean A30 = C2380Up.A30(c2930gi, C2857fX.A03());
        for (NR nr : abstractC3095jd.A2G()) {
            C2334Sv c2334Sv = new C2334Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC3095jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
            if (i2 == 0) {
                A03.A0c(c2334Sv);
            } else {
                A03.A0d(c2334Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                A03.A0d(new C2334Sv(it.next(), -1, -1, abstractC3095jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C2332St c2332St2 = new C2332St(nr.A0H().A09(), abstractC3095jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), nr.A0H().A06());
                c2332St2.A04 = false;
                if (i2 == 0) {
                    if (isDSL && !A30) {
                        A03.A0Y(c2332St2);
                    } else {
                        A03.A0b(c2332St2);
                    }
                } else if (isDSL && !A30) {
                    A03.A0Z(c2332St2);
                } else {
                    A03.A0a(c2332St2);
                }
            }
            i2++;
        }
        if (abstractC3095jd.A1W() && !TextUtils.isEmpty(abstractC3095jd.A11())) {
            A03.A0d(new C2334Sv(abstractC3095jd.A11(), C2244Pe.A0A, C2244Pe.A0A, abstractC3095jd.A1D(), A04(96, 12, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)));
        }
        O0.A00(abstractC3095jd, A03, A04);
        A03.A0X(new C3076jD(this, c2930gi, isDSL, abstractC3095jd, interfaceC2207Nt), new C2329Sq(abstractC3095jd.A1D(), A04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C2930gi c2930gi, EnumSet<CacheFlag> enumSet, C3089jT c3089jT, AbstractC3095jd abstractC3095jd, int i, InterfaceC2207Nt interfaceC2207Nt) {
        A09(c2930gi, enumSet, abstractC3095jd, i, new C3080jH(this, c2930gi, abstractC3095jd, c3089jT, i, interfaceC2207Nt, enumSet));
    }

    private void A0B(EnumC2591bD enumC2591bD) {
        this.A01 = enumC2591bD;
    }

    private boolean A0C(C2930gi c2930gi, AbstractC3095jd abstractC3095jd) {
        AdError A00 = A00(c2930gi, abstractC3095jd);
        if (A00 != null) {
            this.A04.ACo(A00);
            return true;
        }
        return false;
    }

    public final NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return com.instagram.common.viewpoint.core.WK.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WK A0E() {
        if (this.A03.A1b()) {
            return WK.A04;
        }
        AbstractC3095jd abstractC3095jd = (AbstractC3095jd) this.A03;
        if (abstractC3095jd.A1g()) {
            return WK.A06;
        }
        if (abstractC3095jd.A2G().size() > 1) {
            return WK.A0A;
        }
        C2202No A07 = abstractC3095jd.A29().A0H().A07();
        if (A06[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM";
        strArr[3] = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx";
        if (A07 != null) {
            if (!abstractC3095jd.A1n()) {
                boolean A1u = abstractC3095jd.A1u();
                if (A06[0].length() != 2) {
                    String[] strArr2 = A06;
                    strArr2[1] = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ";
                    strArr2[3] = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0";
                }
            }
            return WK.A0E;
        }
        boolean A0L = A0L(abstractC3095jd);
        if (A06[0].length() == 2) {
            throw new RuntimeException();
        }
        A06[0] = "iDu";
        if (A0L) {
            return WK.A0D;
        }
        return WK.A0B;
    }

    public final EnumC2591bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C3089jT) this.A03).A2A();
        }
        return ((AbstractC3095jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C2930gi c2930gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C3089jT c3089jT = (C3089jT) this.A03;
            AbstractC3095jd A26 = c3089jT.A26();
            if (A0C(c2930gi, A26) || A26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c2930gi, enumSet, c3089jT, A26, 0, this.A04);
            return;
        }
        AbstractC3095jd abstractC3095jd = (AbstractC3095jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c2930gi, abstractC3095jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C18077n c18077n = (C18077n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c2930gi, c18077n);
                return;
            } else {
                A08(c2930gi, c18077n);
                return;
            }
        }
        A09(c2930gi, enumSet, (C18077n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC3095jd abstractC3095jd) {
        return !TextUtils.isEmpty(abstractC3095jd.A29().A0H().A09());
    }
}
