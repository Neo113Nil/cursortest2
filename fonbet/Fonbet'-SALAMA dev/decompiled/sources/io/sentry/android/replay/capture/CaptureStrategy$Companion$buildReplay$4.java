package io.sentry.android.replay.capture;

import f6.C1116i;
import io.sentry.rrweb.RRWebEvent;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class CaptureStrategy$Companion$buildReplay$4 extends i implements Function1 {
    final /* synthetic */ List<RRWebEvent> $recordingPayload;
    final /* synthetic */ Date $segmentTimestamp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureStrategy$Companion$buildReplay$4(Date date, List<RRWebEvent> list) {
        super(1);
        this.$segmentTimestamp = date;
        this.$recordingPayload = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RRWebEvent) obj);
        return C1116i.f13008a;
    }

    public final void invoke(RRWebEvent rRWebEvent) {
        h.e(rRWebEvent, "event");
        if (rRWebEvent.getTimestamp() >= this.$segmentTimestamp.getTime()) {
            this.$recordingPayload.add(rRWebEvent);
        }
    }
}
