package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E5 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0575o f4249a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.IReporter f4250b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f4251c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.D5 f4252d;

    public E5(io.appmetrica.analytics.impl.C0575o c0575o) {
        this(c0575o, 0);
    }

    public final synchronized void a(android.content.Context context) {
        if (this.f4251c == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            this.f4249a.a(applicationContext);
            this.f4249a.registerListener(this.f4252d, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.RESUMED, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.PAUSED);
            this.f4251c = applicationContext;
        }
    }

    public E5(io.appmetrica.analytics.impl.C0575o c0575o, io.appmetrica.analytics.IReporter iReporter) {
        this.f4249a = c0575o;
        this.f4250b = iReporter;
        this.f4252d = new io.appmetrica.analytics.impl.D5(this);
    }

    public /* synthetic */ E5(io.appmetrica.analytics.impl.C0575o c0575o, int i2) {
        this(c0575o, io.appmetrica.analytics.impl.AbstractC0810x1.a());
    }

    public final synchronized android.content.Context a() {
        return this.f4251c;
    }
}
