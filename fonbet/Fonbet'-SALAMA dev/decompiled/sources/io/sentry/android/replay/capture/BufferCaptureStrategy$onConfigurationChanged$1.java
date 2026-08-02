package io.sentry.android.replay.capture;

import f6.C1116i;
import io.sentry.android.replay.capture.CaptureStrategy;
import java.util.List;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class BufferCaptureStrategy$onConfigurationChanged$1 extends i implements Function1 {
    final /* synthetic */ BufferCaptureStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCaptureStrategy$onConfigurationChanged$1(BufferCaptureStrategy bufferCaptureStrategy) {
        super(1);
        this.this$0 = bufferCaptureStrategy;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CaptureStrategy.ReplaySegment) obj);
        return C1116i.f13008a;
    }

    public final void invoke(CaptureStrategy.ReplaySegment replaySegment) {
        List list;
        h.e(replaySegment, "segment");
        if (replaySegment instanceof CaptureStrategy.ReplaySegment.Created) {
            list = this.this$0.bufferedSegments;
            list.add(replaySegment);
            BufferCaptureStrategy bufferCaptureStrategy = this.this$0;
            bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
        }
    }
}
