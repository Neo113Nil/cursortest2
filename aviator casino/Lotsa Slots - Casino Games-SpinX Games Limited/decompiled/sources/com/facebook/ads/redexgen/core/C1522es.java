package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.es, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1522es extends android.database.ContentObserver {
    public final com.facebook.ads.redexgen.core.EF A00;

    public C1522es(android.os.Handler handler, com.facebook.ads.redexgen.core.EF ef) {
        super(handler);
        this.A00 = ef;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0f();
    }
}
