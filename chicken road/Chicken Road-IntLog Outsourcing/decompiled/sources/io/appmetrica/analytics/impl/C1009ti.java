package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ti, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1009ti {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9321a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C1095x0 f9322b;

    public C1009ti(C1095x0 c1095x0) {
        this.f9322b = c1095x0;
    }

    public static C1009ti a() {
        return AbstractC0983si.f9260a;
    }

    public final C0802li a(Context context, String str) {
        C0802li c0802li = (C0802li) this.f9321a.get(str);
        if (c0802li == null) {
            synchronized (this.f9321a) {
                try {
                    c0802li = (C0802li) this.f9321a.get(str);
                    if (c0802li == null) {
                        IHandlerExecutor a6 = C0736j4.l().f8484c.a();
                        this.f9322b.getClass();
                        if (C1069w0.f9490e == null) {
                            ((G9) a6).f6828b.post(new RunnableC0957ri(this, context));
                        }
                        c0802li = new C0802li(context.getApplicationContext(), str, new C1095x0());
                        this.f9321a.put(str, c0802li);
                        c0802li.d(str);
                    }
                } finally {
                }
            }
        }
        return c0802li;
    }
}
