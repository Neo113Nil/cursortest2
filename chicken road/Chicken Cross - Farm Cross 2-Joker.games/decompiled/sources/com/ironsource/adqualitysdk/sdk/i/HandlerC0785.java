package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒪ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class HandlerC0785 extends Handler {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0780 f2287;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0785(C0780 c0780, Looper looper) {
        super(looper);
        this.f2287 = c0780;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        AbstractC0782[] abstractC0782Arr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        C0780 c0780 = this.f2287;
        do {
            synchronized (c0780.f2281) {
                size = c0780.f2279.size();
                if (size <= 0) {
                    return;
                }
                abstractC0782Arr = new AbstractC0782[size];
                c0780.f2279.toArray(abstractC0782Arr);
                c0780.f2279.clear();
            }
        } while (size <= 0);
        AbstractC0782 abstractC0782 = abstractC0782Arr[0];
        throw null;
    }
}
