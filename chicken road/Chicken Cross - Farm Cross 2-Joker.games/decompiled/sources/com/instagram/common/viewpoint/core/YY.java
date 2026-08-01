package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class YY implements View.OnClickListener {
    public final /* synthetic */ C2200Nm A00;
    public final /* synthetic */ VI A01;
    public final /* synthetic */ YZ A02;
    public final /* synthetic */ InterfaceC2471Yh A03;
    public final /* synthetic */ String A04;

    public YY(YZ yz, VI vi, InterfaceC2471Yh interfaceC2471Yh, String str, C2200Nm c2200Nm) {
        this.A02 = yz;
        this.A01 = vi;
        this.A03 = interfaceC2471Yh;
        this.A04 = str;
        this.A00 = c2200Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2220Og c2220Og;
        C2930gi c2930gi;
        C2930gi c2930gi2;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(VH.A0A, null);
            c2220Og = this.A02.A02;
            c2930gi = this.A02.A03;
            if (c2220Og.A0O(c2930gi.A02(), true)) {
                this.A03.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                X6 x6 = new X6();
                c2930gi2 = this.A02.A03;
                X6.A0O(x6, c2930gi2, XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
