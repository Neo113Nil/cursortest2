package io.sentry.transport;

import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.HintUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements HintUtils.SentryConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14543a;

    public /* synthetic */ e(int i7) {
        this.f14543a = i7;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public final void accept(Object obj) {
        switch (this.f14543a) {
            case 0:
                ((Retryable) obj).setRetry(true);
                break;
            case 1:
                ((Retryable) obj).setRetry(true);
                break;
            case 2:
                ((SubmissionResult) obj).setResult(false);
                break;
            default:
                ((SubmissionResult) obj).setResult(false);
                break;
        }
    }
}
