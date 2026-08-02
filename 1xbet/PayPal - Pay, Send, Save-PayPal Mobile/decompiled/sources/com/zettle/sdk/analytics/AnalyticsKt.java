package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\f\u001a\u00020\b*\u00020\u00078AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/commons/util/Log$Companion;", "Lcom/zettle/sdk/commons/util/Log;", "Analytics$delegate", "Lkotlin/Lazy;", "getAnalytics", "(Lcom/zettle/sdk/commons/util/Log$Companion;)Lcom/zettle/sdk/commons/util/Log;", "Analytics", "Lcom/zettle/sdk/commons/thread/EventsLoop$Companion;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "analyticsLoop$delegate", "getAnalyticsLoop", "(Lcom/zettle/sdk/commons/thread/EventsLoop$Companion;)Lcom/zettle/sdk/commons/thread/EventsLoop;", "analyticsLoop"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnalyticsKt {
    private static final kotlin.Lazy analyticsLoop$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.thread.EventsLoop>() { // from class: com.zettle.sdk.analytics.AnalyticsKt$analyticsLoop$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.commons.thread.EventsLoop invoke() {
            return com.zettle.sdk.commons.thread.EventsLoop.INSTANCE.create("analytics");
        }
    });
    private static final kotlin.Lazy Analytics$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.commons.util.Log>() { // from class: com.zettle.sdk.analytics.AnalyticsKt$Analytics$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.commons.util.Log invoke() {
            return com.zettle.sdk.commons.util.Log.INSTANCE.get("Analytics");
        }
    });

    public static final com.zettle.sdk.commons.thread.EventsLoop getAnalyticsLoop(com.zettle.sdk.commons.thread.EventsLoop.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return (com.zettle.sdk.commons.thread.EventsLoop) analyticsLoop$delegate.getValue();
    }

    public static final com.zettle.sdk.commons.util.Log getAnalytics(com.zettle.sdk.commons.util.Log.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return (com.zettle.sdk.commons.util.Log) Analytics$delegate.getValue();
    }
}
