package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class NP implements InterfaceC2779eG {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ NO A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.EM, Ascii.ETB, 9, Ascii.SYN, 7, Ascii.DLE, Ascii.CR, 7, Ascii.SI};
    }

    static {
        A01();
    }

    public NP(NO no) {
        this.A00 = no;
    }

    public /* synthetic */ NP(NO no, OV ov) {
        this(no);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void AEA() {
        boolean z;
        AbstractC3095jd abstractC3095jd;
        InterfaceC2471Yh interfaceC2471Yh;
        ZU zu;
        VA va;
        AbstractC3095jd abstractC3095jd2;
        C2781eI c2781eI;
        C2781eI c2781eI2;
        C2930gi c2930gi;
        ZU zu2;
        AbstractC3095jd abstractC3095jd3;
        AbstractC3095jd abstractC3095jd4;
        C2930gi c2930gi2;
        AbstractC3095jd abstractC3095jd5;
        AbstractC3095jd abstractC3095jd6;
        C2930gi c2930gi3;
        C2202No c2202No;
        C2930gi c2930gi4;
        C2930gi c2930gi5;
        z = this.A00.A0f;
        if (!z) {
            abstractC3095jd = this.A00.A0O;
            if (!TextUtils.isEmpty(abstractC3095jd.A2E())) {
                va = this.A00.A0S;
                abstractC3095jd2 = this.A00.A0O;
                String A2E = abstractC3095jd2.A2E();
                C2587b9 c2587b9 = new C2587b9();
                c2781eI = this.A00.A0B;
                C2587b9 A03 = c2587b9.A03(c2781eI.getViewabilityChecker());
                c2781eI2 = this.A00.A0B;
                va.ABJ(A2E, A03.A02(c2781eI2.getTouchDataRecorder()).A05());
                c2930gi = this.A00.A0R;
                C2426Wl A00 = C2426Wl.A00(c2930gi);
                zu2 = this.A00.A0X;
                String A8l = zu2.A8l();
                abstractC3095jd3 = this.A00.A0O;
                A00.A0E(A8l, abstractC3095jd3.A2E());
                abstractC3095jd4 = this.A00.A0O;
                C2194Ng A2A = abstractC3095jd4.A2A();
                c2930gi2 = this.A00.A0R;
                C2194Ng.A07(A2A, c2930gi2);
                abstractC3095jd5 = this.A00.A0O;
                String A0y = abstractC3095jd5.A0y();
                abstractC3095jd6 = this.A00.A0O;
                AbstractC2214Oa.A02(A0y, AbstractC2450Xm.A00(abstractC3095jd6.A10()));
                c2930gi3 = this.A00.A0R;
                c2930gi3.A0F().A3L();
                c2202No = this.A00.A0P;
                if (c2202No.A0c()) {
                    c2930gi4 = this.A00.A0R;
                    c2930gi4.A0F().AES();
                }
            }
            NO no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC2471Yh = no.A0W;
            zu = this.A00.A0X;
            interfaceC2471Yh.A4j(zu.A8G());
            return;
        }
        c2930gi5 = this.A00.A0R;
        c2930gi5.A0F().AET();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void AEh() {
        InterfaceC2471Yh interfaceC2471Yh;
        ZU zu;
        interfaceC2471Yh = this.A00.A0W;
        zu = this.A00.A0X;
        interfaceC2471Yh.A4j(zu.A81());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void AFQ() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2779eG
    public final void AGg() {
        InterfaceC2471Yh interfaceC2471Yh;
        interfaceC2471Yh = this.A00.A0W;
        interfaceC2471Yh.ADJ(15);
    }
}
