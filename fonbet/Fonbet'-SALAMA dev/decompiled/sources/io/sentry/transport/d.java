package io.sentry.transport;

import io.sentry.SentryEnvelope;
import io.sentry.hints.SubmissionResult;
import io.sentry.transport.AsyncHttpTransport;
import io.sentry.util.HintUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements HintUtils.SentryNullableConsumer, HintUtils.SentryHintFallback, HintUtils.SentryConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncHttpTransport.EnvelopeSender f14535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14536c;

    public /* synthetic */ d(AsyncHttpTransport.EnvelopeSender envelopeSender, Object obj, int i7) {
        this.f14534a = i7;
        this.f14535b = envelopeSender;
        this.f14536c = obj;
    }

    @Override // io.sentry.util.HintUtils.SentryNullableConsumer, io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        switch (this.f14534a) {
            case 0:
                this.f14535b.lambda$flush$2((SentryEnvelope) this.f14536c, obj);
                break;
            default:
                this.f14535b.lambda$run$0((TransportResult) this.f14536c, (SubmissionResult) obj);
                break;
        }
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(Object obj, Class cls) {
        this.f14535b.lambda$flush$4((SentryEnvelope) this.f14536c, obj, cls);
    }
}
