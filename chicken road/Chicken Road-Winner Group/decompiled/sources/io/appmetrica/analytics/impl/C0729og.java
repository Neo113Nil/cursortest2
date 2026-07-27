package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729og implements InterfaceC0625kg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8000a;

    /* renamed from: b, reason: collision with root package name */
    public final Bi f8001b;

    /* renamed from: c, reason: collision with root package name */
    public final C0366af f8002c;

    /* renamed from: d, reason: collision with root package name */
    public final R7 f8003d;

    /* renamed from: e, reason: collision with root package name */
    public final C0936wg f8004e;
    public final Handler f;

    public C0729og(Bi bi, C0366af c0366af, Handler handler) {
        this(bi, c0366af, handler, c0366af.s());
    }

    public final void a() {
        if (this.f8000a) {
            return;
        }
        Bi bi = this.f8001b;
        ResultReceiverC0987yg resultReceiverC0987yg = new ResultReceiverC0987yg(this.f, this);
        bi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC0987yg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", "", 4098, 0, anonymousInstance);
        u3.f6786m = bundle;
        M4 m4 = bi.f5772a;
        bi.a(Bi.a(u3, m4), m4, 1, (Map) null);
    }

    public C0729og(Bi bi, C0366af c0366af, Handler handler, boolean z3) {
        this(bi, c0366af, handler, z3, new R7(z3), new C0936wg());
    }

    public C0729og(Bi bi, C0366af c0366af, Handler handler, boolean z3, R7 r7, C0936wg c0936wg) {
        this.f8001b = bi;
        this.f8002c = c0366af;
        this.f8000a = z3;
        this.f8003d = r7;
        this.f8004e = c0936wg;
        this.f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0625kg
    public final void a(C0832sg c0832sg) {
        String str = c0832sg == null ? null : c0832sg.f8308a;
        if (this.f8000a) {
            return;
        }
        synchronized (this) {
            R7 r7 = this.f8003d;
            this.f8004e.getClass();
            r7.f6500d = C0936wg.a(str);
            r7.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            R7 r7 = this.f8003d;
            r7.f6499c = deferredDeeplinkParametersListener;
            if (r7.f6497a) {
                r7.a(1);
            } else {
                r7.a();
            }
            this.f8002c.u();
        } catch (Throwable th) {
            this.f8002c.u();
            throw th;
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            R7 r7 = this.f8003d;
            r7.f6498b = deferredDeeplinkListener;
            if (r7.f6497a) {
                r7.a(1);
            } else {
                r7.a();
            }
            this.f8002c.u();
        } catch (Throwable th) {
            this.f8002c.u();
            throw th;
        }
    }
}
