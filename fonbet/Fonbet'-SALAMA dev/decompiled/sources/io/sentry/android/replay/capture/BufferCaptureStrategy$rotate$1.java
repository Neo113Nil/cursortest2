package io.sentry.android.replay.capture;

import io.sentry.android.replay.capture.CaptureStrategy;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;
import t6.n;

/* loaded from: classes2.dex */
public final class BufferCaptureStrategy$rotate$1 extends i implements Function1 {
    final /* synthetic */ long $bufferLimit;
    final /* synthetic */ n $removed;
    final /* synthetic */ BufferCaptureStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCaptureStrategy$rotate$1(long j, BufferCaptureStrategy bufferCaptureStrategy, n nVar) {
        super(1);
        this.$bufferLimit = j;
        this.this$0 = bufferCaptureStrategy;
        this.$removed = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CaptureStrategy.ReplaySegment.Created created) {
        h.e(created, "it");
        if (created.getReplay().getTimestamp().getTime() >= this.$bufferLimit) {
            return Boolean.FALSE;
        }
        this.this$0.setCurrentSegment(r0.getCurrentSegment() - 1);
        this.this$0.deleteFile(created.getReplay().getVideoFile());
        this.$removed.f16470a = true;
        return Boolean.TRUE;
    }
}
