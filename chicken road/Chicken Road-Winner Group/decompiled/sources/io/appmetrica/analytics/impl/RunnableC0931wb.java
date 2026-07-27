package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0931wb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f8559a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f8560b;

    public RunnableC0931wb(Handler handler, Q2 q22) {
        this.f8559a = new WeakReference(handler);
        this.f8560b = new WeakReference(q22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f8559a.get();
        Q2 q22 = (Q2) this.f8560b.get();
        if (handler == null || q22 == null) {
            return;
        }
        boolean f = q22.f6442b.f();
        if (!f) {
            PublicLogger publicLogger = q22.f6443c;
            Set set = D9.f5834a;
            EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
            U3 u3 = new U3("", "", 3, 0, publicLogger);
            Bi bi = q22.f6447h;
            Kh kh = q22.f6442b;
            bi.getClass();
            bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        }
        if (f) {
            return;
        }
        C0905vb.a(handler, q22, this);
    }
}
