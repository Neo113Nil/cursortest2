package io.sentry;

import io.sentry.clientreport.ClientReport;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14504c;

    public /* synthetic */ p(int i7, Object obj, Object obj2) {
        this.f14502a = i7;
        this.f14503b = obj;
        this.f14504c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte[] lambda$fromEvent$3;
        byte[] lambda$fromUserFeedback$6;
        byte[] lambda$fromClientReport$21;
        byte[] lambda$fromCheckIn$9;
        byte[] lambda$fromLogs$27;
        byte[] lambda$fromSession$0;
        Object lambda$wrapCallable$0;
        switch (this.f14502a) {
            case 0:
                lambda$fromEvent$3 = SentryEnvelopeItem.lambda$fromEvent$3((ISerializer) this.f14503b, (SentryBaseEvent) this.f14504c);
                return lambda$fromEvent$3;
            case 1:
                lambda$fromUserFeedback$6 = SentryEnvelopeItem.lambda$fromUserFeedback$6((ISerializer) this.f14503b, (UserFeedback) this.f14504c);
                return lambda$fromUserFeedback$6;
            case 2:
                lambda$fromClientReport$21 = SentryEnvelopeItem.lambda$fromClientReport$21((ISerializer) this.f14503b, (ClientReport) this.f14504c);
                return lambda$fromClientReport$21;
            case 3:
                lambda$fromCheckIn$9 = SentryEnvelopeItem.lambda$fromCheckIn$9((ISerializer) this.f14503b, (CheckIn) this.f14504c);
                return lambda$fromCheckIn$9;
            case 4:
                lambda$fromLogs$27 = SentryEnvelopeItem.lambda$fromLogs$27((ISerializer) this.f14503b, (SentryLogEvents) this.f14504c);
                return lambda$fromLogs$27;
            case 5:
                lambda$fromSession$0 = SentryEnvelopeItem.lambda$fromSession$0((ISerializer) this.f14503b, (Session) this.f14504c);
                return lambda$fromSession$0;
            default:
                lambda$wrapCallable$0 = SentryWrapper.lambda$wrapCallable$0((IScopes) this.f14503b, (Callable) this.f14504c);
                return lambda$wrapCallable$0;
        }
    }
}
