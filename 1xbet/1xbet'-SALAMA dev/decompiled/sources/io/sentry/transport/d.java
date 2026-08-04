package io.sentry.transport;

import io.sentry.SentryEnvelope;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.HintUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements HintUtils.SentryNullableConsumer, HintUtils.SentryHintFallback, HintUtils.SentryConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncHttpTransport.EnvelopeSender f14541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14542c;

    public /* synthetic */ d(AsyncHttpTransport.EnvelopeSender envelopeSender, Object obj, int i7) {
        this.f14540a = i7;
        this.f14541b = envelopeSender;
        this.f14542c = obj;
    }

    @Override // io.sentry.util.HintUtils.SentryNullableConsumer, io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        switch (this.f14540a) {
            case 0:
                this.f14541b.lambda$flush$2((SentryEnvelope) this.f14542c, obj);
                break;
            default:
                this.f14541b.lambda$run$0((TransportResult) this.f14542c, (SubmissionResult) obj);
                break;
        }
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(Object obj, Class cls) {
        this.f14541b.lambda$flush$4((SentryEnvelope) this.f14542c, obj, cls);
    }
}
