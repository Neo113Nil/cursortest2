package io.sentry.android.replay;

import java.io.File;
import t6.i;

/* loaded from: classes2.dex */
public final class ReplayCache$ongoingSegmentFile$2 extends i implements s6.a {
    final /* synthetic */ ReplayCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayCache$ongoingSegmentFile$2(ReplayCache replayCache) {
        super(0);
        this.this$0 = replayCache;
    }

    @Override // s6.a
    public final File invoke() {
        if (this.this$0.getReplayCacheDir$sentry_android_replay_release() == null) {
            return null;
        }
        File file = new File(this.this$0.getReplayCacheDir$sentry_android_replay_release(), ReplayCache.ONGOING_SEGMENT);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }
}
