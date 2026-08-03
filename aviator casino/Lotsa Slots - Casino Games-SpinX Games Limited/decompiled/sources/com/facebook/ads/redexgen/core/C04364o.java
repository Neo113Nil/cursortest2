package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04364o extends android.content.BroadcastReceiver {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04374p A00;

    public C04364o(com.facebook.ads.redexgen.core.C04374p c04374p) {
        this.A00 = c04374p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        int A00;
        A00 = com.facebook.ads.redexgen.core.C04374p.A00(context);
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 31 && A00 == 5) {
            com.facebook.ads.redexgen.core.C04344m.A02(context, this.A00);
        } else {
            this.A00.A07(A00);
        }
    }
}
