package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes.dex */
public final class L5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0712o f6205a;

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f6206b;

    /* renamed from: c, reason: collision with root package name */
    public Context f6207c;

    /* renamed from: d, reason: collision with root package name */
    public final K5 f6208d;

    public L5(C0712o c0712o) {
        this(c0712o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f6207c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f6205a.a(applicationContext);
            this.f6205a.registerListener(this.f6208d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f6207c = applicationContext;
        }
    }

    public L5(C0712o c0712o, IReporter iReporter) {
        this.f6205a = c0712o;
        this.f6206b = iReporter;
        this.f6208d = new K5(this);
    }

    public /* synthetic */ L5(C0712o c0712o, int i3) {
        this(c0712o, AbstractC0921w1.a());
    }

    public final synchronized Context a() {
        return this.f6207c;
    }
}
