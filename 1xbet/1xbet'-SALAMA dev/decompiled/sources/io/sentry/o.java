package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14507b;

    public /* synthetic */ o(Object obj, int i7) {
        this.f14506a = i7;
        this.f14507b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14506a) {
            case 0:
                return SentryEnvelopeItem.lambda$fromSession$1((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 1:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            case 2:
                return SentryEnvelopeItem.lambda$fromEvent$4((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 3:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            case 4:
                return SentryEnvelopeItem.lambda$fromUserFeedback$7((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 5:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            case 6:
                return SentryEnvelopeItem.lambda$fromProfileChunk$16((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 7:
                return SentryEnvelopeItem.lambda$fromReplay$25((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 8:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            case 9:
                return SentryEnvelopeItem.lambda$fromClientReport$22((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 10:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            case 11:
                return SentryEnvelopeItem.lambda$fromCheckIn$10((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 12:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            case 13:
                return SentryEnvelopeItem.lambda$fromLogs$28((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 14:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            case 15:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            case 16:
                return SentryEnvelopeItem.lambda$fromAttachment$13((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 17:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            case 18:
                return SentryEnvelopeItem.lambda$fromProfilingTrace$19((SentryEnvelopeItem.CachedItem) this.f14507b);
            case 19:
                return ((SentryEnvelopeItem.CachedItem) this.f14507b).getBytes();
            default:
                return ((HostnameCache) this.f14507b).lambda$updateCache$1();
        }
    }
}
