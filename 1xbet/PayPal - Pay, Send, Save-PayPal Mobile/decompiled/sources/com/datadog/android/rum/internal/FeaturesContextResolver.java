package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/FeaturesContextResolver;", "", "<init>", "()V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", "resolveViewHasReplay", "(Lcom/datadog/android/api/context/DatadogContext;Ljava/lang/String;)Z", "", "resolveViewRecordsCount", "(Lcom/datadog/android/api/context/DatadogContext;Ljava/lang/String;)J", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeaturesContextResolver {
    public static final java.lang.String HAS_REPLAY_KEY = "has_replay";
    public static final java.lang.String VIEW_RECORDS_COUNT_KEY = "records_count";

    public final boolean resolveViewHasReplay(com.datadog.android.api.context.DatadogContext datadogContext, java.lang.String viewId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        java.util.Map<java.lang.String, java.lang.Object> map = datadogContext.getFeaturesContext().get("session-replay");
        if (map == null) {
            return false;
        }
        java.lang.Object obj = map.get(viewId);
        java.util.Map map2 = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.Object obj2 = map2 != null ? map2.get("has_replay") : null;
        java.lang.Boolean bool = obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final long resolveViewRecordsCount(com.datadog.android.api.context.DatadogContext datadogContext, java.lang.String viewId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        java.util.Map<java.lang.String, java.lang.Object> map = datadogContext.getFeaturesContext().get("session-replay");
        if (map == null) {
            return 0L;
        }
        java.lang.Object obj = map.get(viewId);
        java.util.Map map2 = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.Object obj2 = map2 != null ? map2.get("records_count") : null;
        java.lang.Long l = obj2 instanceof java.lang.Long ? (java.lang.Long) obj2 : null;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
