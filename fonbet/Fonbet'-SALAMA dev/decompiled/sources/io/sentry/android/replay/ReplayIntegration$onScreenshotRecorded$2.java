package io.sentry.android.replay;

import android.graphics.Bitmap;
import f6.C1116i;
import kotlin.jvm.functions.Function2;
import t6.h;
import t6.i;
import t6.p;

/* loaded from: classes2.dex */
public final class ReplayIntegration$onScreenshotRecorded$2 extends i implements Function2 {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ p $screen;
    final /* synthetic */ ReplayIntegration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration$onScreenshotRecorded$2(Bitmap bitmap, p pVar, ReplayIntegration replayIntegration) {
        super(2);
        this.$bitmap = bitmap;
        this.$screen = pVar;
        this.this$0 = replayIntegration;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ReplayCache) obj, ((Number) obj2).longValue());
        return C1116i.f13008a;
    }

    public final void invoke(ReplayCache replayCache, long j) {
        h.e(replayCache, "$this$onScreenshotRecorded");
        replayCache.addFrame$sentry_android_replay_release(this.$bitmap, j, (String) this.$screen.f16472a);
        this.this$0.checkCanRecord();
    }
}
