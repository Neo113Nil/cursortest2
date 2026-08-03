package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ho {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f4398a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f4399b;

    public final synchronized void a(io.appmetrica.analytics.coreapi.internal.backport.Consumer consumer) {
        try {
            io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4399b;
            if (publicLogger == null) {
                this.f4398a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
