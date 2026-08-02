package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14501b;

    public /* synthetic */ o(Object obj, int i7) {
        this.f14500a = i7;
        this.f14501b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Integer lambda$fromSession$1;
        byte[] bytes;
        Integer lambda$fromEvent$4;
        byte[] bytes2;
        Integer lambda$fromUserFeedback$7;
        byte[] bytes3;
        Integer lambda$fromProfileChunk$16;
        Integer lambda$fromReplay$25;
        byte[] bytes4;
        Integer lambda$fromClientReport$22;
        byte[] bytes5;
        Integer lambda$fromCheckIn$10;
        byte[] bytes6;
        Integer lambda$fromLogs$28;
        byte[] bytes7;
        byte[] bytes8;
        Integer lambda$fromAttachment$13;
        byte[] bytes9;
        Integer lambda$fromProfilingTrace$19;
        byte[] bytes10;
        Void lambda$updateCache$1;
        switch (this.f14500a) {
            case 0:
                lambda$fromSession$1 = SentryEnvelopeItem.lambda$fromSession$1((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromSession$1;
            case 1:
                bytes = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes;
            case 2:
                lambda$fromEvent$4 = SentryEnvelopeItem.lambda$fromEvent$4((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromEvent$4;
            case 3:
                bytes2 = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes2;
            case 4:
                lambda$fromUserFeedback$7 = SentryEnvelopeItem.lambda$fromUserFeedback$7((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromUserFeedback$7;
            case 5:
                bytes3 = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes3;
            case 6:
                lambda$fromProfileChunk$16 = SentryEnvelopeItem.lambda$fromProfileChunk$16((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromProfileChunk$16;
            case 7:
                lambda$fromReplay$25 = SentryEnvelopeItem.lambda$fromReplay$25((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromReplay$25;
            case 8:
                bytes4 = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes4;
            case 9:
                lambda$fromClientReport$22 = SentryEnvelopeItem.lambda$fromClientReport$22((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromClientReport$22;
            case 10:
                bytes5 = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes5;
            case 11:
                lambda$fromCheckIn$10 = SentryEnvelopeItem.lambda$fromCheckIn$10((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromCheckIn$10;
            case 12:
                bytes6 = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes6;
            case 13:
                lambda$fromLogs$28 = SentryEnvelopeItem.lambda$fromLogs$28((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromLogs$28;
            case 14:
                bytes7 = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes7;
            case 15:
                bytes8 = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes8;
            case 16:
                lambda$fromAttachment$13 = SentryEnvelopeItem.lambda$fromAttachment$13((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromAttachment$13;
            case 17:
                bytes9 = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes9;
            case 18:
                lambda$fromProfilingTrace$19 = SentryEnvelopeItem.lambda$fromProfilingTrace$19((SentryEnvelopeItem.CachedItem) this.f14501b);
                return lambda$fromProfilingTrace$19;
            case 19:
                bytes10 = ((SentryEnvelopeItem.CachedItem) this.f14501b).getBytes();
                return bytes10;
            default:
                lambda$updateCache$1 = ((HostnameCache) this.f14501b).lambda$updateCache$1();
                return lambda$updateCache$1;
        }
    }
}
