package io.sentry.android.replay;

import f6.C1116i;
import io.sentry.android.replay.capture.CaptureStrategy;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class ReplayIntegration$captureReplay$1 extends i implements Function1 {
    final /* synthetic */ ReplayIntegration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration$captureReplay$1(ReplayIntegration replayIntegration) {
        super(1);
        this.this$0 = replayIntegration;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Date) obj);
        return C1116i.f13008a;
    }

    public final void invoke(Date date) {
        CaptureStrategy captureStrategy;
        CaptureStrategy captureStrategy2;
        CaptureStrategy captureStrategy3;
        h.e(date, "newTimestamp");
        captureStrategy = this.this$0.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy3 = this.this$0.captureStrategy;
            Integer valueOf = captureStrategy3 != null ? Integer.valueOf(captureStrategy3.getCurrentSegment()) : null;
            h.b(valueOf);
            captureStrategy.setCurrentSegment(valueOf.intValue() + 1);
        }
        captureStrategy2 = this.this$0.captureStrategy;
        if (captureStrategy2 == null) {
            return;
        }
        captureStrategy2.setSegmentTimestamp(date);
    }
}
