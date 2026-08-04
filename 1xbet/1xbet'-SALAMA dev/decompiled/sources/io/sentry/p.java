package io.sentry;

import io.sentry.clientreport.ClientReport;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14510c;

    public /* synthetic */ p(int i7, Object obj, Object obj2) {
        this.f14508a = i7;
        this.f14509b = obj;
        this.f14510c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14508a) {
            case 0:
                return SentryEnvelopeItem.lambda$fromEvent$3((ISerializer) this.f14509b, (SentryBaseEvent) this.f14510c);
            case 1:
                return SentryEnvelopeItem.lambda$fromUserFeedback$6((ISerializer) this.f14509b, (UserFeedback) this.f14510c);
            case 2:
                return SentryEnvelopeItem.lambda$fromClientReport$21((ISerializer) this.f14509b, (ClientReport) this.f14510c);
            case 3:
                return SentryEnvelopeItem.lambda$fromCheckIn$9((ISerializer) this.f14509b, (CheckIn) this.f14510c);
            case 4:
                return SentryEnvelopeItem.lambda$fromLogs$27((ISerializer) this.f14509b, (SentryLogEvents) this.f14510c);
            case 5:
                return SentryEnvelopeItem.lambda$fromSession$0((ISerializer) this.f14509b, (Session) this.f14510c);
            default:
                return SentryWrapper.lambda$wrapCallable$0((IScopes) this.f14509b, (Callable) this.f14510c);
        }
    }
}
