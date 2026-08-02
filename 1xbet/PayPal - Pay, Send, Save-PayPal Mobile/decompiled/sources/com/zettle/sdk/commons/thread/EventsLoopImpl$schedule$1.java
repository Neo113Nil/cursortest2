package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Handler;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/os/Handler;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class EventsLoopImpl$schedule$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<android.os.Handler, kotlin.Unit> {
    final /* synthetic */ java.util.concurrent.TimeUnit $Camera2StreamConfigurationMap;
    final /* synthetic */ long $getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $getHighSpeedVideoSizes;
    final /* synthetic */ com.zettle.sdk.commons.thread.EventsLoopImpl getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(android.os.Handler handler) {
        getHighSpeedVideoFpsRangesFor(handler);
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoFpsRangesFor(android.os.Handler handler) {
        kotlin.jvm.functions.Function0 function0;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        function0 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        long longValue = ((java.lang.Number) function0.invoke()).longValue();
        long millis = this.$Camera2StreamConfigurationMap.toMillis(this.$getHighSpeedVideoFpsRanges);
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.$getHighSpeedVideoSizes;
        android.os.Message obtain = android.os.Message.obtain(handler, new java.lang.Runnable() { // from class: com.zettle.sdk.commons.thread.EventsLoopImpl$schedule$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.zettle.sdk.commons.thread.EventsLoopImpl$schedule$1.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function0.this);
            }
        });
        com.zettle.sdk.commons.thread.EventsLoopImpl eventsLoopImpl = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str = this.$getHighSpeedVideoFpsRangesFor;
        i = eventsLoopImpl.getHighResolutionOutputSizeshNQ4ISI;
        if (i >= 22) {
            obtain.setAsynchronous(true);
        }
        obtain.obj = str;
        handler.sendMessageAtTime(obtain, longValue + millis);
    }

    public static /* synthetic */ void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventsLoopImpl$schedule$1(com.zettle.sdk.commons.thread.EventsLoopImpl eventsLoopImpl, java.util.concurrent.TimeUnit timeUnit, long j, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str) {
        super(1);
        this.getHighResolutionOutputSizeshNQ4ISI = eventsLoopImpl;
        this.$Camera2StreamConfigurationMap = timeUnit;
        this.$getHighSpeedVideoFpsRanges = j;
        this.$getHighSpeedVideoSizes = function0;
        this.$getHighSpeedVideoFpsRangesFor = str;
    }
}
