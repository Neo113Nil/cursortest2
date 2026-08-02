package com.datadog.android.sessionreplay.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/SessionReplayRumContextProvider;", "Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;", "Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;", "<init>", "()V", "Lcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;", "getRumContext", "()Lcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;", "", "featureName", "", "", "context", "", "onContextUpdate", "(Ljava/lang/String;Ljava/util/Map;)V", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionReplayRumContextProvider implements com.datadog.android.sessionreplay.internal.utils.RumContextProvider, com.datadog.android.api.feature.FeatureContextUpdateReceiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.SessionReplayRumContextProvider.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.SessionReplayRumContextProvider.Companion(null);
    private static final java.lang.String NULL_UUID;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile java.util.Map<java.lang.String, ? extends java.lang.Object> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.emptyMap();

    @Override // com.datadog.android.sessionreplay.internal.utils.RumContextProvider
    public final com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext getRumContext() {
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = this.Camera2StreamConfigurationMap;
        java.lang.Object obj = map.get("application_id");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = NULL_UUID;
        }
        java.lang.String str2 = str;
        java.lang.Object obj2 = map.get("session_id");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str3 == null) {
            str3 = NULL_UUID;
        }
        java.lang.String str4 = str3;
        java.lang.Object obj3 = map.get("view_id");
        java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str5 == null) {
            str5 = NULL_UUID;
        }
        java.lang.String str6 = str5;
        java.lang.Object obj4 = map.get(com.datadog.android.rum.internal.domain.RumContext.VIEW_TIMESTAMP_OFFSET);
        java.lang.Long l = obj4 instanceof java.lang.Long ? (java.lang.Long) obj4 : null;
        return new com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext(str2, str4, str6, l != null ? l.longValue() : 0L);
    }

    @Override // com.datadog.android.api.feature.FeatureContextUpdateReceiver
    public final void onContextUpdate(java.lang.String featureName, java.util.Map<java.lang.String, ? extends java.lang.Object> context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(featureName, "rum")) {
            this.Camera2StreamConfigurationMap = context;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/SessionReplayRumContextProvider$Companion;", "", "<init>", "()V", "", "NULL_UUID", "Ljava/lang/String;", "getNULL_UUID", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getNULL_UUID() {
            return com.datadog.android.sessionreplay.internal.SessionReplayRumContextProvider.NULL_UUID;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.lang.String obj = new java.util.UUID(0L, 0L).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        NULL_UUID = obj;
    }
}
