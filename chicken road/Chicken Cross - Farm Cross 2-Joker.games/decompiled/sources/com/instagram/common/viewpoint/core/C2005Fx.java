package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2005Fx extends AbstractC2874fo {
    public final /* synthetic */ C4U A00;

    public C2005Fx(C4U c4u) {
        this.A00 = c4u;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2874fo
    public final void A03() {
        Y2 y2;
        Y2 y22;
        String str;
        C2875fp c2875fp;
        Y2 y23;
        AbstractC3095jd abstractC3095jd;
        VA va;
        String str2;
        AbstractC3095jd abstractC3095jd2;
        C2930gi c2930gi;
        C2930gi c2930gi2;
        AbstractC3095jd abstractC3095jd3;
        AbstractC3095jd abstractC3095jd4;
        y2 = this.A00.A04;
        if (!y2.A07()) {
            C4U c4u = this.A00;
            y22 = this.A00.A04;
            c4u.setImpressionRecordingFlag(y22);
            str = this.A00.A08;
            if (!TextUtils.isEmpty(str)) {
                C2587b9 c2587b9 = new C2587b9();
                c2875fp = this.A00.A07;
                C2587b9 A03 = c2587b9.A03(c2875fp);
                y23 = this.A00.A04;
                C2587b9 A02 = A03.A02(y23);
                abstractC3095jd = this.A00.A0D;
                Map<String, String> A05 = A02.A04(abstractC3095jd.A0z()).A05();
                va = this.A00.A0F;
                str2 = this.A00.A08;
                va.ABJ(str2, A05);
                abstractC3095jd2 = this.A00.A0D;
                C2194Ng A2A = abstractC3095jd2.A2A();
                c2930gi = this.A00.A0E;
                C2194Ng.A07(A2A, c2930gi);
                c2930gi2 = this.A00.A0E;
                c2930gi2.A0F().A3L();
                abstractC3095jd3 = this.A00.A0D;
                String A0y = abstractC3095jd3.A0y();
                abstractC3095jd4 = this.A00.A0D;
                AbstractC2214Oa.A02(A0y, AbstractC2450Xm.A00(abstractC3095jd4.A10()));
            }
        }
    }
}
