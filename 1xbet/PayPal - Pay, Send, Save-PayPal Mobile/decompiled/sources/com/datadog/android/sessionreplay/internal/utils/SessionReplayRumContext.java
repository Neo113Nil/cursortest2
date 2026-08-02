package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u0000 #2\u00020\u0001:\u0001#B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;", "", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, "sessionId", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "", "viewTimeOffsetMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/datadog/android/sessionreplay/internal/utils/SessionReplayRumContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "isNotValid$dd_sdk_android_session_replay_release", "()Z", "isValid$dd_sdk_android_session_replay_release", "toString", "Ljava/lang/String;", "getApplicationId", "getSessionId", "getViewId", "J", "getViewTimeOffsetMs", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SessionReplayRumContext {
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String applicationId;
    private final java.lang.String sessionId;
    private final java.lang.String viewId;
    private final long viewTimeOffsetMs;

    public SessionReplayRumContext(java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.applicationId = str;
        this.sessionId = str2;
        this.viewId = str3;
        this.viewTimeOffsetMs = j;
    }

    public /* synthetic */ SessionReplayRumContext(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? getHighSpeedVideoFpsRanges : str, (i & 2) != 0 ? getHighSpeedVideoFpsRanges : str2, (i & 4) != 0 ? getHighSpeedVideoFpsRanges : str3, (i & 8) != 0 ? 0L : j);
    }

    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String getViewId() {
        return this.viewId;
    }

    public final long getViewTimeOffsetMs() {
        return this.viewTimeOffsetMs;
    }

    public final boolean isNotValid$dd_sdk_android_session_replay_release() {
        return !isValid$dd_sdk_android_session_replay_release();
    }

    public final boolean isValid$dd_sdk_android_session_replay_release() {
        java.lang.String str = this.applicationId;
        java.lang.String str2 = getHighSpeedVideoFpsRanges;
        return (kotlin.jvm.internal.Intrinsics.areEqual(str, str2) || kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, str2) || kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, str2)) ? false : true;
    }

    static {
        java.lang.String obj = new java.util.UUID(0L, 0L).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        getHighSpeedVideoFpsRanges = obj;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.applicationId;
        java.lang.String str2 = this.sessionId;
        java.lang.String str3 = this.viewId;
        long j = this.viewTimeOffsetMs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionReplayRumContext(applicationId=");
        sb.append(str);
        sb.append(", sessionId=");
        sb.append(str2);
        sb.append(", viewId=");
        sb.append(str3);
        sb.append(", viewTimeOffsetMs=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.applicationId.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.viewId.hashCode()) * 31) + java.lang.Long.hashCode(this.viewTimeOffsetMs);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext)) {
            return false;
        }
        com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext sessionReplayRumContext = (com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.applicationId, sessionReplayRumContext.applicationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, sessionReplayRumContext.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, sessionReplayRumContext.viewId) && this.viewTimeOffsetMs == sessionReplayRumContext.viewTimeOffsetMs;
    }

    public final com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext copy(java.lang.String applicationId, java.lang.String sessionId, java.lang.String viewId, long viewTimeOffsetMs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        return new com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext(applicationId, sessionId, viewId, viewTimeOffsetMs);
    }

    /* renamed from: component4, reason: from getter */
    public final long getViewTimeOffsetMs() {
        return this.viewTimeOffsetMs;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getViewId() {
        return this.viewId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public static /* synthetic */ com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext copy$default(com.datadog.android.sessionreplay.internal.utils.SessionReplayRumContext sessionReplayRumContext, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = sessionReplayRumContext.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = sessionReplayRumContext.sessionId;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = sessionReplayRumContext.viewId;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            j = sessionReplayRumContext.viewTimeOffsetMs;
        }
        return sessionReplayRumContext.copy(str, str4, str5, j);
    }

    public SessionReplayRumContext() {
        this(null, null, null, 0L, 15, null);
    }
}
