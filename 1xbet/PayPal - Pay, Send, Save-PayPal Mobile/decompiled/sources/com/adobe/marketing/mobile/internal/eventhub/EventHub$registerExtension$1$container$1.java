package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHubError;", "p0", "", "getHighSpeedVideoFpsRanges", "(Lcom/adobe/marketing/mobile/internal/eventhub/EventHubError;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class EventHub$registerExtension$1$container$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.internal.eventhub.EventHubError, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.internal.eventhub.EventHubError, kotlin.Unit> $Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.Class<? extends com.adobe.marketing.mobile.Extension> $getHighSpeedVideoSizes;
    final /* synthetic */ com.adobe.marketing.mobile.internal.eventhub.EventHub getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.adobe.marketing.mobile.internal.eventhub.EventHubError eventHubError) {
        getHighSpeedVideoFpsRanges(eventHubError);
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoFpsRanges(final com.adobe.marketing.mobile.internal.eventhub.EventHubError eventHubError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHubError, "");
        java.util.concurrent.ExecutorService access$getEventHubExecutor = com.adobe.marketing.mobile.internal.eventhub.EventHub.access$getEventHubExecutor(this.getHighResolutionOutputSizeshNQ4ISI);
        final kotlin.jvm.functions.Function1<com.adobe.marketing.mobile.internal.eventhub.EventHubError, kotlin.Unit> function1 = this.$Camera2StreamConfigurationMap;
        final com.adobe.marketing.mobile.internal.eventhub.EventHub eventHub = this.getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.Class<? extends com.adobe.marketing.mobile.Extension> cls = this.$getHighSpeedVideoSizes;
        access$getEventHubExecutor.submit(new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$registerExtension$1$container$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.adobe.marketing.mobile.internal.eventhub.EventHub$registerExtension$1$container$1.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, eventHub, cls, eventHubError);
            }
        });
    }

    public static /* synthetic */ void getHighSpeedVideoSizes(final kotlin.jvm.functions.Function1 function1, com.adobe.marketing.mobile.internal.eventhub.EventHub eventHub, java.lang.Class cls, final com.adobe.marketing.mobile.internal.eventhub.EventHubError eventHubError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHub, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHubError, "");
        if (function1 != null) {
            com.adobe.marketing.mobile.internal.eventhub.EventHub.access$executeCompletionHandler(eventHub, new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.eventhub.EventHub$registerExtension$1$container$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.adobe.marketing.mobile.internal.eventhub.EventHub$registerExtension$1$container$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1.this, eventHubError);
                }
            });
        }
        com.adobe.marketing.mobile.internal.eventhub.EventHub.access$extensionPostRegistration(eventHub, cls, eventHubError);
    }

    public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1 function1, com.adobe.marketing.mobile.internal.eventhub.EventHubError eventHubError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventHubError, "");
        function1.invoke(eventHubError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EventHub$registerExtension$1$container$1(com.adobe.marketing.mobile.internal.eventhub.EventHub eventHub, kotlin.jvm.functions.Function1<? super com.adobe.marketing.mobile.internal.eventhub.EventHubError, kotlin.Unit> function1, java.lang.Class<? extends com.adobe.marketing.mobile.Extension> cls) {
        super(1);
        this.getHighResolutionOutputSizeshNQ4ISI = eventHub;
        this.$Camera2StreamConfigurationMap = function1;
        this.$getHighSpeedVideoSizes = cls;
    }
}
