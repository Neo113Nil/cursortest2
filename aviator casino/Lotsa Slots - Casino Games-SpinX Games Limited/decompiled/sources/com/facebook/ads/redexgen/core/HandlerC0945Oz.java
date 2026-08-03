package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Oz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class HandlerC0945Oz extends android.os.Handler {
    public final /* synthetic */ com.facebook.ads.redexgen.core.P2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0945Oz(com.facebook.ads.redexgen.core.P2 p2, android.os.Looper looper) {
        super(looper);
        this.A00 = p2;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        switch (message.what) {
            case 1:
                this.A00.A02();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
