package io.sentry.android.replay;

import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;
import t6.p;

/* loaded from: classes2.dex */
public final class ReplayCache$rotate$1 extends i implements Function1 {
    final /* synthetic */ p $screen;
    final /* synthetic */ long $until;
    final /* synthetic */ ReplayCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayCache$rotate$1(long j, ReplayCache replayCache, p pVar) {
        super(1);
        this.$until = j;
        this.this$0 = replayCache;
        this.$screen = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ReplayFrame replayFrame) {
        h.e(replayFrame, "it");
        if (replayFrame.getTimestamp() < this.$until) {
            this.this$0.deleteFile(replayFrame.getScreenshot());
            return Boolean.TRUE;
        }
        p pVar = this.$screen;
        if (pVar.f16472a == null) {
            pVar.f16472a = replayFrame.getScreen();
        }
        return Boolean.FALSE;
    }
}
