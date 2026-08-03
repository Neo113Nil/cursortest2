package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Fo implements io.appmetrica.analytics.coreapi.internal.backport.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4308a = "WebView interface setup failed because javascript is disabled for the WebView.";

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(java.lang.Object obj) {
        ((io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger) obj).warning(this.f4308a, new java.lang.Object[0]);
    }
}
