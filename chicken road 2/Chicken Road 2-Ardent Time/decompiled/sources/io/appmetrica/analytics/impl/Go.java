package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Go implements io.appmetrica.analytics.coreapi.internal.backport.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f4358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4359b = "WebView interface setup failed because of an exception.";

    public Go(java.lang.Throwable th) {
        this.f4358a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(java.lang.Object obj) {
        ((io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger) obj).error(this.f4358a, this.f4359b, new java.lang.Object[0]);
    }
}
