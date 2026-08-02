package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class NH {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public SF A00;
    public EnumC0942Zt A01 = EnumC0942Zt.A05;
    public ArrayList<C1064bt> A02 = new ArrayList<>();
    public final AbstractC0606Mo A03;
    public final NG A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, Ascii.ETB, 35, Ascii.FS, Ascii.ESC, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, Ascii.NAK, Ascii.CAN, 19, Ascii.CAN, Ascii.NAK, 40, Ascii.NAK, 19, Ascii.SYN, 41, 34, Ascii.CAN, 32, Ascii.EM, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, Ascii.DC2, Ascii.ETB, 16, Ascii.CAN, Ascii.GS, Ascii.DC4, 19, -16, 19, -13, 16, 35, 16, -15, 36, Ascii.GS, 19, Ascii.ESC, Ascii.DC4, Utf8.REPLACEMENT_BYTE, 68, 74, 59, 72, 73, 74, Utf8.REPLACEMENT_BYTE, 74, Utf8.REPLACEMENT_BYTE, 55, 66};
    }

    static {
        A06();
    }

    public NH(C1153dL c1153dL, NU nu, NG ng, String str) {
        JSONObject dataObject = nu.A03();
        this.A03 = A01(c1153dL, nu, str, dataObject);
        this.A04 = ng;
    }

    private AdError A00(C1153dL c1153dL, AbstractC1428hy abstractC1428hy) {
        if (abstractC1428hy == null || abstractC1428hy.A27().isEmpty()) {
            c1153dL.A08().AAy(A04(62, 3, 33), AbstractC0766Sv.A0Z, new C0767Sw(A04(5, 43, 20)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static AbstractC0606Mo A01(C1153dL c1153dL, NU nu, String str, JSONObject jSONObject) {
        AbstractC0606Mo abstractC0606Mo = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                abstractC0606Mo = C1426hw.A01(jSONObject, c1153dL, true);
                abstractC0606Mo.A1L(true);
                abstractC0606Mo.A1I(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (abstractC0606Mo == null) {
            abstractC0606Mo = AnonymousClass77.A00(jSONObject, c1153dL);
        }
        abstractC0606Mo.A1H(str);
        TF A01 = nu.A01();
        if (A01 != null) {
            abstractC0606Mo.A1D(A01.A06());
        }
        return abstractC0606Mo;
    }

    private SF A03(C1153dL c1153dL) {
        return this.A00 != null ? this.A00 : new SF(c1153dL);
    }

    private void A08(C1153dL c1153dL, AnonymousClass77 anonymousClass77) {
        NB playableData = anonymousClass77.A20().A0H().A07();
        A0B(playableData != null ? playableData.A0B() : EnumC0942Zt.A05);
        C1410hb c1410hb = new C1410hb(this);
        SF sf = new SF(c1153dL);
        boolean z = U7.A2A(c1153dL) && C0725Rf.A0A(anonymousClass77.A1C());
        if (z) {
            C0725Rf unifiedAssetsLoader = new C0725Rf(sf, anonymousClass77.A1C(), anonymousClass77.A0v(), anonymousClass77.A17(), z, new C1409ha(this));
            sf.A0e(new C0796Ua(anonymousClass77.A25(), c1153dL.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        NR.A02(c1153dL, anonymousClass77, true, c1410hb);
    }

    private void A09(C1153dL c1153dL, EnumSet<CacheFlag> enumSet, AbstractC1428hy abstractC1428hy, int i, NG ng) {
        boolean A1Y = abstractC1428hy.A1Y();
        SF A03 = A03(c1153dL);
        A03.A0e(new C0796Ua(abstractC1428hy.A25(), c1153dL.A0A()));
        boolean z = U7.A2A(c1153dL) && C0725Rf.A0A(abstractC1428hy.A1C());
        if (z) {
            new C0725Rf(A03, abstractC1428hy.A1C(), abstractC1428hy.A0v(), abstractC1428hy.A17(), z, new C1415hi(this, c1153dL, A1Y, abstractC1428hy, ng)).A0B();
            return;
        }
        String A04 = A04(96, 12, 117);
        if (A1Y) {
            SB sb = new SB(abstractC1428hy.A0s(), abstractC1428hy.A17(), A04);
            sb.A04 = true;
            sb.A03 = A04(0, 5, 78);
            A03.A0Y(sb);
        }
        A03.A0d(new SD(abstractC1428hy.A23().A01(), C1119cm.A04, C1119cm.A04, abstractC1428hy.A17(), A04(96, 12, 117)));
        boolean contains = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean A2s = U7.A2s(c1153dL, C1208eF.A03());
        for (C0607Mp adInfo : abstractC1428hy.A27()) {
            SD sd = new SD(adInfo.A0H().A08(), NN.A00(adInfo.A0H()), NN.A01(adInfo.A0H()), abstractC1428hy.A17(), A04(96, 12, 117));
            if (i2 == 0) {
                A03.A0c(sd);
            } else {
                A03.A0d(sd);
            }
            Iterator<String> it = adInfo.A0K().A02().iterator();
            while (it.hasNext()) {
                A03.A0d(new SD(it.next(), -1, -1, abstractC1428hy.A17(), A04(96, 12, 117)));
            }
            if (contains && !TextUtils.isEmpty(adInfo.A0H().A09())) {
                SB sb2 = new SB(adInfo.A0H().A09(), abstractC1428hy.A17(), A04(96, 12, 117), adInfo.A0H().A06());
                sb2.A04 = false;
                if (i2 == 0) {
                    if (A1Y && !A2s) {
                        A03.A0Y(sb2);
                    } else {
                        A03.A0b(sb2);
                    }
                } else if (A1Y && !A2s) {
                    A03.A0Z(sb2);
                } else {
                    A03.A0a(sb2);
                }
            }
            i2++;
        }
        A03.A0X(new C1413hg(this, c1153dL, A1Y, abstractC1428hy, ng), new S8(abstractC1428hy.A17(), A04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1153dL c1153dL, EnumSet<CacheFlag> enumSet, C1426hw c1426hw, AbstractC1428hy abstractC1428hy, int i, NG ng) {
        A09(c1153dL, enumSet, abstractC1428hy, i, new C1417hk(this, c1153dL, abstractC1428hy, c1426hw, i, ng, enumSet));
    }

    private void A0B(EnumC0942Zt enumC0942Zt) {
        this.A01 = enumC0942Zt;
    }

    private boolean A0C(C1153dL c1153dL, AbstractC1428hy abstractC1428hy) {
        AdError A00 = A00(c1153dL, abstractC1428hy);
        if (A00 != null) {
            this.A04.ACF(A00);
            return true;
        }
        return false;
    }

    public final AbstractC0606Mo A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        return com.instagram.common.viewpoint.core.EnumC0823Vb.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        return com.instagram.common.viewpoint.core.EnumC0823Vb.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC0823Vb A0E() {
        if (this.A03.A1T()) {
            return EnumC0823Vb.A04;
        }
        AbstractC1428hy abstractC1428hy = (AbstractC1428hy) this.A03;
        if (abstractC1428hy.A1Y()) {
            return EnumC0823Vb.A06;
        }
        if (abstractC1428hy.A27().size() > 1) {
            return EnumC0823Vb.A0A;
        }
        NB A07 = abstractC1428hy.A20().A0H().A07();
        if (A06[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM";
        strArr[3] = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx";
        if (A07 != null) {
            return EnumC0823Vb.A0C;
        }
        boolean A0L = A0L(abstractC1428hy);
        if (A06[0].length() != 2) {
            String[] strArr2 = A06;
            strArr2[1] = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ";
            strArr2[3] = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0";
        }
    }

    public final EnumC0942Zt A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1T()) {
            return ((C1426hw) this.A03).A20();
        }
        return ((AbstractC1428hy) this.A03).A25();
    }

    public final void A0H() {
        this.A04.AJm();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1F(rewardData);
        this.A03.A1J(str);
        if (A0D().A1T()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C1153dL c1153dL, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC0823Vb.A04) {
            C1426hw c1426hw = (C1426hw) this.A03;
            AbstractC1428hy A1w = c1426hw.A1w();
            if (A0C(c1153dL, A1w) || A1w == null) {
                return;
            }
            this.A04.AGo();
            A0A(c1153dL, enumSet, c1426hw, A1w, 0, this.A04);
            return;
        }
        AbstractC1428hy abstractC1428hy = (AbstractC1428hy) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1153dL, abstractC1428hy)) {
            return;
        }
        this.A04.AGo();
        if (A0E() == EnumC0823Vb.A0C) {
            AnonymousClass77 anonymousClass77 = (AnonymousClass77) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1153dL, anonymousClass77);
                return;
            } else {
                A08(c1153dL, anonymousClass77);
                return;
            }
        }
        A09(c1153dL, enumSet, (AnonymousClass77) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1P();
    }

    public final boolean A0L(AbstractC1428hy abstractC1428hy) {
        return !TextUtils.isEmpty(abstractC1428hy.A20().A0H().A09());
    }
}
