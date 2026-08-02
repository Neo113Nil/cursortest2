package io.sentry.transport;

import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Enqueable;
import io.sentry.util.HintUtils;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements HintUtils.SentryConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Closeable f14532b;

    public /* synthetic */ b(Closeable closeable, int i7) {
        this.f14531a = i7;
        this.f14532b = closeable;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public final void accept(Object obj) {
        switch (this.f14531a) {
            case 0:
                ((AsyncHttpTransport) this.f14532b).lambda$send$0((Enqueable) obj);
                break;
            default:
                ((RateLimiter) this.f14532b).lambda$markHintWhenSendingFailed$2((DiskFlushNotification) obj);
                break;
        }
    }
}
