package io.sentry.android.replay.capture;

import f6.C1116i;
import io.sentry.IScopes;
import io.sentry.android.replay.capture.CaptureStrategy;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class SessionCaptureStrategy$onConfigurationChanged$1 extends i implements Function1 {
    final /* synthetic */ SessionCaptureStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCaptureStrategy$onConfigurationChanged$1(SessionCaptureStrategy sessionCaptureStrategy) {
        super(1);
        this.this$0 = sessionCaptureStrategy;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CaptureStrategy.ReplaySegment) obj);
        return C1116i.f13008a;
    }

    public final void invoke(CaptureStrategy.ReplaySegment replaySegment) {
        IScopes iScopes;
        h.e(replaySegment, "segment");
        if (replaySegment instanceof CaptureStrategy.ReplaySegment.Created) {
            CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) replaySegment;
            iScopes = this.this$0.scopes;
            CaptureStrategy.ReplaySegment.Created.capture$default(created, iScopes, null, 2, null);
            SessionCaptureStrategy sessionCaptureStrategy = this.this$0;
            sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
            this.this$0.setSegmentTimestamp(created.getReplay().getTimestamp());
        }
    }
}
