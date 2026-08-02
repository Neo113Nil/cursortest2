package io.sentry.android.replay.capture;

import f6.C1116i;
import io.sentry.IScopes;
import io.sentry.android.replay.capture.CaptureStrategy;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class BufferCaptureStrategy$captureReplay$2 extends i implements Function1 {
    final /* synthetic */ Function1 $onSegmentSent;
    final /* synthetic */ BufferCaptureStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCaptureStrategy$captureReplay$2(BufferCaptureStrategy bufferCaptureStrategy, Function1 function1) {
        super(1);
        this.this$0 = bufferCaptureStrategy;
        this.$onSegmentSent = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CaptureStrategy.ReplaySegment) obj);
        return C1116i.f13008a;
    }

    public final void invoke(CaptureStrategy.ReplaySegment replaySegment) {
        List list;
        IScopes iScopes;
        h.e(replaySegment, "segment");
        BufferCaptureStrategy bufferCaptureStrategy = this.this$0;
        list = bufferCaptureStrategy.bufferedSegments;
        bufferCaptureStrategy.capture(list);
        if (replaySegment instanceof CaptureStrategy.ReplaySegment.Created) {
            CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) replaySegment;
            iScopes = this.this$0.scopes;
            CaptureStrategy.ReplaySegment.Created.capture$default(created, iScopes, null, 2, null);
            Function1 function1 = this.$onSegmentSent;
            Date timestamp = created.getReplay().getTimestamp();
            h.d(timestamp, "segment.replay.timestamp");
            function1.invoke(timestamp);
        }
    }
}
