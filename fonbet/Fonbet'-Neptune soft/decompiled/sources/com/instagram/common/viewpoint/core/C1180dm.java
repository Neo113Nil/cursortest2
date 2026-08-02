package com.instagram.common.viewpoint.core;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.dm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1180dm extends AbstractRunnableC0840Vt {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ S7 A00;
    public final /* synthetic */ S8 A01;
    public final /* synthetic */ SF A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1180dm(SF sf, ArrayList arrayList, S8 s8, S7 s7, ArrayList arrayList2) {
        this.A02 = sf;
        this.A03 = arrayList;
        this.A01 = s8;
        this.A00 = s7;
        this.A04 = arrayList2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        AtomicBoolean A0D;
        SQ sq;
        Handler handler;
        SQ sq2;
        long j;
        long j2;
        long j3;
        long j4;
        A0D = SF.A0D(this.A03);
        sq = this.A02.A04;
        if (sq instanceof C1153dL) {
            sq2 = this.A02.A04;
            C1153dL c1153dL = (C1153dL) sq2;
            if (this.A01.A00 == -1) {
                boolean z = A0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z) {
                        LH A0F = c1153dL.A0F();
                        j4 = this.A02.A00;
                        A0F.A4h(XG.A01(j4));
                    } else {
                        LH A0F2 = c1153dL.A0F();
                        j3 = this.A02.A00;
                        A0F2.A4f(XG.A01(j3));
                    }
                }
                throw new RuntimeException();
            }
            if (A0D.get()) {
                LH A0F3 = c1153dL.A0F();
                j2 = this.A02.A00;
                long A01 = XG.A01(j2);
                S8 s8 = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    A0F3.A4i(A01, s8.A00);
                }
                throw new RuntimeException();
            }
            LH A0F4 = c1153dL.A0F();
            j = this.A02.A00;
            A0F4.A4g(XG.A01(j), this.A01.A00);
        }
        handler = this.A02.A02;
        handler.post(new C1181dn(this, A0D));
        SF.A0D(this.A04);
    }
}
