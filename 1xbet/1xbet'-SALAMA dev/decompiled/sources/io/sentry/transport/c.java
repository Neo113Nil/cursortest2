package io.sentry.transport;

import io.sentry.hints.DiskFlushNotification;
import io.sentry.util.HintUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements HintUtils.SentryConsumer, HintUtils.SentryHintFallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AsyncHttpTransport.EnvelopeSender f14539a;

    public /* synthetic */ c(AsyncHttpTransport.EnvelopeSender envelopeSender) {
        this.f14539a = envelopeSender;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        this.f14539a.lambda$flush$1((DiskFlushNotification) obj);
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(Object obj, Class cls) {
        this.f14539a.lambda$flush$6(obj, cls);
    }
}
