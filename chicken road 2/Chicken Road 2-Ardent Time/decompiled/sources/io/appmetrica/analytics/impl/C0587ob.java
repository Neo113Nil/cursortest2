package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587ob {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f6579a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.I2 f6580b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.RunnableC0613pb f6581c;

    public C0587ob(android.os.Handler handler, io.appmetrica.analytics.impl.I2 i2) {
        this.f6579a = handler;
        this.f6580b = i2;
        this.f6581c = new io.appmetrica.analytics.impl.RunnableC0613pb(handler, i2);
    }

    public static void a(android.os.Handler handler, io.appmetrica.analytics.impl.I2 i2, java.lang.Runnable runnable) {
        handler.removeCallbacks(runnable, i2.f4404b.f4368b.getApiKey());
        handler.postAtTime(runnable, i2.f4404b.f4368b.getApiKey(), android.os.SystemClock.uptimeMillis() + (((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(i2.f4404b.f4368b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
