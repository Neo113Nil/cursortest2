package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘧ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0909 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1002 f2547;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f2548 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Handler f2546 = new Handler(Looper.getMainLooper());

    /* renamed from: ﻛ, reason: contains not printable characters */
    public C0925 f2545 = new C0925(this);

    public C0909(InterfaceC1002 interfaceC1002) {
        this.f2547 = interfaceC1002;
        AbstractC0554 m5521 = AbstractC0554.m5521();
        C0925 c0925 = this.f2545;
        synchronized (m5521) {
            m5521.f1253.add(c0925);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5719() {
        this.f2546.removeCallbacksAndMessages(null);
        if (this.f2545 != null) {
            AbstractC0554 m5521 = AbstractC0554.m5521();
            C0925 c0925 = this.f2545;
            synchronized (m5521) {
                m5521.f1253.remove(c0925);
            }
            this.f2545 = null;
        }
    }
}
