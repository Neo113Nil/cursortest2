package io.sentry.android.replay;

import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayCache;
import io.sentry.protocol.SentryId;
import java.io.File;
import t6.i;

/* loaded from: classes2.dex */
public final class ReplayCache$replayCacheDir$2 extends i implements s6.a {
    final /* synthetic */ ReplayCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayCache$replayCacheDir$2(ReplayCache replayCache) {
        super(0);
        this.this$0 = replayCache;
    }

    @Override // s6.a
    public final File invoke() {
        SentryOptions sentryOptions;
        SentryId sentryId;
        ReplayCache.Companion companion = ReplayCache.Companion;
        sentryOptions = this.this$0.options;
        sentryId = this.this$0.replayId;
        return companion.makeReplayCacheDir(sentryOptions, sentryId);
    }
}
