package com.instagram.common.viewpoint.core;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.da, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1168da extends ContentObserver {
    public final C0362Dc A00;

    public C1168da(Handler handler, C0362Dc c0362Dc) {
        super(handler);
        this.A00 = c0362Dc;
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
