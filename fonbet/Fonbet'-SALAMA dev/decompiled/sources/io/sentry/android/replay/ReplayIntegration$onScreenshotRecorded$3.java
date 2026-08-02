package io.sentry.android.replay;

import f6.C1116i;
import java.io.File;
import kotlin.jvm.functions.Function2;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class ReplayIntegration$onScreenshotRecorded$3 extends i implements Function2 {
    final /* synthetic */ long $frameTimestamp;
    final /* synthetic */ File $screenshot;
    final /* synthetic */ ReplayIntegration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration$onScreenshotRecorded$3(File file, long j, ReplayIntegration replayIntegration) {
        super(2);
        this.$screenshot = file;
        this.$frameTimestamp = j;
        this.this$0 = replayIntegration;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ReplayCache) obj, ((Number) obj2).longValue());
        return C1116i.f13008a;
    }

    public final void invoke(ReplayCache replayCache, long j) {
        h.e(replayCache, "$this$onScreenshotRecorded");
        ReplayCache.addFrame$default(replayCache, this.$screenshot, this.$frameTimestamp, null, 4, null);
        this.this$0.checkCanRecord();
    }
}
