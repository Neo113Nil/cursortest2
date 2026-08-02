package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YF implements View.OnClickListener {
    public final /* synthetic */ N9 A00;
    public final /* synthetic */ C0796Ua A01;
    public final /* synthetic */ InterfaceC0884Xn A02;
    public final /* synthetic */ YG A03;
    public final /* synthetic */ String A04;

    public YF(YG yg, C0796Ua c0796Ua, InterfaceC0884Xn interfaceC0884Xn, String str, N9 n9) {
        this.A03 = yg;
        this.A01 = c0796Ua;
        this.A02 = interfaceC0884Xn;
        this.A04 = str;
        this.A00 = n9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O2 o2;
        C1153dL c1153dL;
        C1153dL c1153dL2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A04(UZ.A0A, null);
            o2 = this.A03.A01;
            c1153dL = this.A03.A02;
            if (o2.A0O(c1153dL.A02(), true)) {
                this.A02.AAf(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                WN wn = new WN();
                c1153dL2 = this.A03.A02;
                WN.A0O(wn, c1153dL2, WQ.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
