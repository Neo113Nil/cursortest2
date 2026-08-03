package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04003c extends com.facebook.ads.redexgen.core.AbstractC0656Dt {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0644Dh A00;

    public C04003c(com.facebook.ads.redexgen.core.C0644Dh c0644Dh) {
        this.A00 = c0644Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C0657Du c0657Du) {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        android.os.Handler handler;
        c0673Ek = this.A00.A01;
        if (c0673Ek == null || c0657Du.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new com.facebook.ads.redexgen.core.C1537f7(this));
    }
}
