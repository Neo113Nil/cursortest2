package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.pK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3431pK implements C4W {
    public Message A00;
    public C3430pJ A01;

    public C3431pK() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C3430pJ.A01(this);
    }

    public final C3431pK A01(Message message, C3430pJ c3430pJ) {
        this.A00 = message;
        this.A01 = c3430pJ;
        return this;
    }

    public final void A02() {
        ((Message) AbstractC17143y.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) AbstractC17143y.A01(this.A00));
        A00();
        return success;
    }
}
