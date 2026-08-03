package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Eo implements io.appmetrica.analytics.coreapi.internal.backport.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4276a = "WebView interface setup is successful.";

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(java.lang.Object obj) {
        ((io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger) obj).info(this.f4276a, new java.lang.Object[0]);
    }
}
