package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.fb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1291fb implements S7 {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", "S", "m77T1m6dtAhGTcgbhkAg"};
    public final List<C1449iN> A00;
    public final /* synthetic */ C1290fa A01;

    public C1291fb(C1290fa c1290fa, List<C1449iN> list) {
        this.A01 = c1290fa;
        this.A00 = list;
    }

    private void A00() {
        RO ro;
        RO ro2;
        RO ro3;
        C1153dL c1153dL;
        RO ro4;
        RO ro5;
        C1153dL c1153dL2;
        ro = this.A01.A00;
        ro.A05(true);
        ro2 = this.A01.A00;
        ro2.A02();
        ro3 = this.A01.A00;
        ro3.A03(0);
        Iterator<C1449iN> it = this.A00.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (hasNext) {
                C1449iN next = it.next();
                c1153dL = this.A01.A01;
                S3 A0K = C0696Qc.A0K();
                ro4 = this.A01.A00;
                C0696Qc c0696Qc = new C0696Qc(c1153dL, next, null, A0K, ro4.A01());
                if (c0696Qc.A0z() != null && c0696Qc.A0z().A0F() != null) {
                    ((AbstractC1394hL) c0696Qc.A0z().A0F()).A00(c0696Qc);
                }
                ro5 = this.A01.A00;
                c1153dL2 = this.A01.A01;
                ro5.A04(new NativeAd(c1153dL2, c0696Qc));
            } else {
                AbstractC0831Vk.A00(new C1292fc(this));
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACh() {
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACq() {
        A00();
    }
}
