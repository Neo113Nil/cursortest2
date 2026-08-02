package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Handler;", "p0", "", "Camera2StreamConfigurationMap", "(Landroid/os/Handler;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class EventsLoopImpl$post$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<android.os.Handler, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.commons.thread.EventsLoopImpl Camera2StreamConfigurationMap;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(android.os.Handler handler) {
        Camera2StreamConfigurationMap(handler);
        return kotlin.Unit.INSTANCE;
    }

    public final void Camera2StreamConfigurationMap(android.os.Handler handler) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.$getHighResolutionOutputSizeshNQ4ISI;
        android.os.Message obtain = android.os.Message.obtain(handler, new java.lang.Runnable() { // from class: com.zettle.sdk.commons.thread.EventsLoopImpl$post$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.zettle.sdk.commons.thread.EventsLoopImpl$post$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0.this);
            }
        });
        i = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
        if (i >= 22) {
            obtain.setAsynchronous(true);
        }
        obtain.sendToTarget();
    }

    public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventsLoopImpl$post$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.zettle.sdk.commons.thread.EventsLoopImpl eventsLoopImpl) {
        super(1);
        this.$getHighResolutionOutputSizeshNQ4ISI = function0;
        this.Camera2StreamConfigurationMap = eventsLoopImpl;
    }
}
