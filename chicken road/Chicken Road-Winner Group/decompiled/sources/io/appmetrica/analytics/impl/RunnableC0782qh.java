package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0782qh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8165a;

    /* renamed from: b, reason: collision with root package name */
    public final W5 f8166b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f8167c;

    /* renamed from: d, reason: collision with root package name */
    public final C0562i4 f8168d;

    public RunnableC0782qh(Context context, W5 w5, Bundle bundle, C0562i4 c0562i4) {
        this.f8165a = context;
        this.f8166b = w5;
        this.f8167c = bundle;
        this.f8168d = c0562i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            P3 a3 = P3.a(this.f8165a, this.f8167c);
            if (a3 == null) {
                return;
            }
            X3 a4 = X3.a(a3);
            C0602jj v3 = C0878ua.f8414H.v();
            v3.a(a3.f6383b.getAppVersion(), a3.f6383b.getAppBuildNumber());
            v3.a(a3.f6383b.getDeviceType());
            C0924w4 c0924w4 = new C0924w4(new C0451dm(a3), new C0898v4(a3.f6383b, AbstractC0698nb.c(a3.f6382a.f5992a.getAsString("PROCESS_CFG_CLIDS"))), a3.f6382a.f5993b);
            this.f8168d.a(a4, c0924w4).a(this.f8166b, c0924w4);
        } catch (Throwable th) {
            Vj vj = AbstractC0861tj.f8372a;
            String str = "Exception during processing event with type: " + this.f8166b.f6778d + " (" + this.f8166b.f6779e + "): " + th.getMessage();
            vj.getClass();
            vj.a(new C0887uj(str, th));
        }
    }
}
