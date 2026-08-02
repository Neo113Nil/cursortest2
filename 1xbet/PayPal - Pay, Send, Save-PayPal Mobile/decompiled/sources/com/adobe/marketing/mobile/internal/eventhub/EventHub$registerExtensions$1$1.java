package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHubError;", "p0", "", "Camera2StreamConfigurationMap", "(Lcom/adobe/marketing/mobile/internal/eventhub/EventHubError;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class EventHub$registerExtensions$1$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.internal.eventhub.EventHubError, kotlin.Unit> {
    final /* synthetic */ java.util.concurrent.atomic.AtomicInteger $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Set<java.lang.Class<? extends com.adobe.marketing.mobile.Extension>> $getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.adobe.marketing.mobile.internal.eventhub.EventHub getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.adobe.marketing.mobile.internal.eventhub.EventHubError eventHubError) {
        Camera2StreamConfigurationMap(eventHubError);
        return kotlin.Unit.INSTANCE;
    }

    public final void Camera2StreamConfigurationMap(com.adobe.marketing.mobile.internal.eventhub.EventHubError eventHubError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHubError, "");
        if (this.$getHighResolutionOutputSizeshNQ4ISI.incrementAndGet() == this.$getHighSpeedVideoFpsRanges.size()) {
            this.getHighSpeedVideoSizes.start();
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.$getHighSpeedVideoFpsRangesFor;
            if (function0 != null) {
                com.adobe.marketing.mobile.internal.eventhub.EventHub.access$executeCompletionHandler(this.getHighSpeedVideoSizes, new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$registerExtensions$1$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.adobe.marketing.mobile.internal.eventhub.EventHub$registerExtensions$1$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0.this);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EventHub$registerExtensions$1$1(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.Set<? extends java.lang.Class<? extends com.adobe.marketing.mobile.Extension>> set, com.adobe.marketing.mobile.internal.eventhub.EventHub eventHub, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(1);
        this.$getHighResolutionOutputSizeshNQ4ISI = atomicInteger;
        this.$getHighSpeedVideoFpsRanges = set;
        this.getHighSpeedVideoSizes = eventHub;
        this.$getHighSpeedVideoFpsRangesFor = function0;
    }
}
