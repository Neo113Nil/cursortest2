package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0860ti {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8370a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C0946x0 f8371b;

    public C0860ti(C0946x0 c0946x0) {
        this.f8371b = c0946x0;
    }

    public static C0860ti a() {
        return AbstractC0834si.f8312a;
    }

    public final C0653li a(Context context, String str) {
        C0653li c0653li;
        C0653li c0653li2 = (C0653li) this.f8370a.get(str);
        if (c0653li2 != null) {
            return c0653li2;
        }
        synchronized (this.f8370a) {
            try {
                c0653li = (C0653li) this.f8370a.get(str);
                if (c0653li == null) {
                    IHandlerExecutor a3 = C0587j4.l().f7572c.a();
                    this.f8371b.getClass();
                    if (C0920w0.f8534e == null) {
                        ((G9) a3).f5983b.post(new RunnableC0808ri(this, context));
                    }
                    c0653li = new C0653li(context.getApplicationContext(), str, new C0946x0());
                    this.f8370a.put(str, c0653li);
                    c0653li.d(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0653li;
    }
}
