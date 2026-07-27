package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class Q1 extends AbstractRunnableC2417Wc {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ YR A01;

    public Q1(YR yr, DialogInterface dialogInterface) {
        this.A01 = yr;
        this.A00 = dialogInterface;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        InterfaceC2881fv interfaceC2881fv;
        InterfaceC2881fv interfaceC2881fv2;
        C2926ge c2926ge;
        Map<? extends String, ? extends String> A02;
        interfaceC2881fv = this.A01.A01.A02;
        if (interfaceC2881fv != null) {
            interfaceC2881fv2 = this.A01.A01.A02;
            c2926ge = this.A01.A01.A00;
            String A03 = WI.A03(c2926ge);
            C2895g9 c2895g9 = new C2895g9();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC2881fv2.AGx(A03, c2895g9.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
