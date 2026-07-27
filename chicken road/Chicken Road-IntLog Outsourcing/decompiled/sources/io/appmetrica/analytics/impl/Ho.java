package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Ho implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f6897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6898b = "WebView interface setup failed because of an exception.";

    public Ho(Throwable th) {
        this.f6897a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.f6897a, this.f6898b, new Object[0]);
    }
}
