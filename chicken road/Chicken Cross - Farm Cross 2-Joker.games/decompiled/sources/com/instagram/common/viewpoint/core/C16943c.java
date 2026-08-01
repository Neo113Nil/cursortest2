package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C16943c extends AbstractC1950Dt {
    public final /* synthetic */ C1938Dh A00;

    public C16943c(C1938Dh c1938Dh) {
        this.A00 = c1938Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1951Du c1951Du) {
        C1967Ek c1967Ek;
        Handler handler;
        c1967Ek = this.A00.A01;
        if (c1967Ek == null || c1951Du.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C2831f7(this));
    }
}
