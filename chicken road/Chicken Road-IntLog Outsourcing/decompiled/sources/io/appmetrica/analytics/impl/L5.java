package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes.dex */
public final class L5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0861o f7060a;

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f7061b;

    /* renamed from: c, reason: collision with root package name */
    public Context f7062c;

    /* renamed from: d, reason: collision with root package name */
    public final K5 f7063d;

    public L5(C0861o c0861o) {
        this(c0861o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f7062c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f7060a.a(applicationContext);
            this.f7060a.registerListener(this.f7063d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f7062c = applicationContext;
        }
    }

    public L5(C0861o c0861o, IReporter iReporter) {
        this.f7060a = c0861o;
        this.f7061b = iReporter;
        this.f7063d = new K5(this);
    }

    public /* synthetic */ L5(C0861o c0861o, int i2) {
        this(c0861o, AbstractC1070w1.a());
    }

    public final synchronized Context a() {
        return this.f7062c;
    }
}
