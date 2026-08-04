package io.sentry.transport;

import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Enqueable;
import io.sentry.util.HintUtils;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements HintUtils.SentryConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Closeable f14538b;

    public /* synthetic */ b(Closeable closeable, int i7) {
        this.f14537a = i7;
        this.f14538b = closeable;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public final void accept(Object obj) {
        switch (this.f14537a) {
            case 0:
                ((AsyncHttpTransport) this.f14538b).lambda$send$0((Enqueable) obj);
                break;
            default:
                ((RateLimiter) this.f14538b).lambda$markHintWhenSendingFailed$2((DiskFlushNotification) obj);
                break;
        }
    }
}
