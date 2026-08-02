package com.datadog.android.rum.internal.domain;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0018\b\u0080\b\u0018\u0000 N2\u00020\u0001:\u0001NB©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b,\u0010-J²\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001b\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000106¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b<\u0010\u001aR\u001a\u0010\u0016\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b\u0006\u0010#R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b?\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010-R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010+R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\bD\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bE\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\bF\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\bG\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010 R\u001a\u0010\u0015\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bJ\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bM\u0010\u001a"}, d2 = {"Lcom/datadog/android/rum/internal/domain/RumContext;", "", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, "sessionId", "", "isSessionActive", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "viewName", "viewUrl", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "sessionState", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "sessionStartReason", "Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "viewType", "syntheticsTestId", "syntheticsResultId", "", "viewTimestamp", "viewTimestampOffset", "hasReplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;Lcom/datadog/android/rum/internal/domain/scope/RumViewType;Ljava/lang/String;Ljava/lang/String;JJZ)V", "component1", "()Ljava/lang/String;", "component10", "()Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "component11", "component12", "component13", "()J", "component14", "component15", "()Z", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "component9", "()Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;Lcom/datadog/android/rum/internal/domain/scope/RumViewType;Ljava/lang/String;Ljava/lang/String;JJZ)Lcom/datadog/android/rum/internal/domain/RumContext;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toMap", "()Ljava/util/Map;", "toString", "Ljava/lang/String;", "getActionId", "getApplicationId", "Z", "getHasReplay", "getSessionId", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "getSessionStartReason", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "getSessionState", "getSyntheticsResultId", "getSyntheticsTestId", "getViewId", "getViewName", "J", "getViewTimestamp", "getViewTimestampOffset", "Lcom/datadog/android/rum/internal/domain/scope/RumViewType;", "getViewType", "getViewUrl", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RumContext {
    public static final java.lang.String ACTION_ID = "action_id";
    public static final java.lang.String APPLICATION_ID = "application_id";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.RumContext.Companion INSTANCE = new com.datadog.android.rum.internal.domain.RumContext.Companion(null);
    public static final java.lang.String HAS_REPLAY = "view_has_replay";
    private static final java.lang.String NULL_UUID;
    public static final java.lang.String SESSION_ACTIVE = "session_active";
    public static final java.lang.String SESSION_ID = "session_id";
    public static final java.lang.String SESSION_START_REASON = "session_start_reason";
    public static final java.lang.String SESSION_STATE = "session_state";
    public static final java.lang.String SYNTHETICS_RESULT_ID = "synthetics_result_id";
    public static final java.lang.String SYNTHETICS_TEST_ID = "synthetics_test_id";
    public static final java.lang.String VIEW_ID = "view_id";
    public static final java.lang.String VIEW_NAME = "view_name";
    public static final java.lang.String VIEW_TIMESTAMP = "view_timestamp";
    public static final java.lang.String VIEW_TIMESTAMP_OFFSET = "view_timestamp_offset";
    public static final java.lang.String VIEW_TYPE = "view_type";
    public static final java.lang.String VIEW_URL = "view_url";
    private final java.lang.String actionId;
    private final java.lang.String applicationId;
    private final boolean hasReplay;
    private final boolean isSessionActive;
    private final java.lang.String sessionId;
    private final com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason sessionStartReason;
    private final com.datadog.android.rum.internal.domain.scope.RumSessionScope.State sessionState;
    private final java.lang.String syntheticsResultId;
    private final java.lang.String syntheticsTestId;
    private final java.lang.String viewId;
    private final java.lang.String viewName;
    private final long viewTimestamp;
    private final long viewTimestampOffset;
    private final com.datadog.android.rum.internal.domain.scope.RumViewType viewType;
    private final java.lang.String viewUrl;

    public RumContext(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.datadog.android.rum.internal.domain.scope.RumSessionScope.State state, com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason, com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType, java.lang.String str7, java.lang.String str8, long j, long j2, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumViewType, "");
        this.applicationId = str;
        this.sessionId = str2;
        this.isSessionActive = z;
        this.viewId = str3;
        this.viewName = str4;
        this.viewUrl = str5;
        this.actionId = str6;
        this.sessionState = state;
        this.sessionStartReason = startReason;
        this.viewType = rumViewType;
        this.syntheticsTestId = str7;
        this.syntheticsResultId = str8;
        this.viewTimestamp = j;
        this.viewTimestampOffset = j2;
        this.hasReplay = z2;
    }

    public /* synthetic */ RumContext(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.datadog.android.rum.internal.domain.scope.RumSessionScope.State state, com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason, com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType, java.lang.String str7, java.lang.String str8, long j, long j2, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NULL_UUID : str, (i & 2) != 0 ? NULL_UUID : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.NOT_TRACKED : state, (i & 256) != 0 ? com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.USER_APP_LAUNCH : startReason, (i & 512) != 0 ? com.datadog.android.rum.internal.domain.scope.RumViewType.NONE : rumViewType, (i & 1024) != 0 ? null : str7, (i & 2048) == 0 ? str8 : null, (i & 4096) != 0 ? 0L : j, (i & 8192) == 0 ? j2 : 0L, (i & 16384) == 0 ? z2 : false);
    }

    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final boolean isSessionActive() {
        return this.isSessionActive;
    }

    public final java.lang.String getViewId() {
        return this.viewId;
    }

    public final java.lang.String getViewName() {
        return this.viewName;
    }

    public final java.lang.String getViewUrl() {
        return this.viewUrl;
    }

    public final java.lang.String getActionId() {
        return this.actionId;
    }

    public final com.datadog.android.rum.internal.domain.scope.RumSessionScope.State getSessionState() {
        return this.sessionState;
    }

    public final com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason getSessionStartReason() {
        return this.sessionStartReason;
    }

    public final com.datadog.android.rum.internal.domain.scope.RumViewType getViewType() {
        return this.viewType;
    }

    public final java.lang.String getSyntheticsTestId() {
        return this.syntheticsTestId;
    }

    public final java.lang.String getSyntheticsResultId() {
        return this.syntheticsResultId;
    }

    public final long getViewTimestamp() {
        return this.viewTimestamp;
    }

    public final long getViewTimestampOffset() {
        return this.viewTimestampOffset;
    }

    public final boolean getHasReplay() {
        return this.hasReplay;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toMap() {
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("application_id", this.applicationId), kotlin.TuplesKt.to("session_id", this.sessionId), kotlin.TuplesKt.to(SESSION_ACTIVE, java.lang.Boolean.valueOf(this.isSessionActive)), kotlin.TuplesKt.to(SESSION_STATE, this.sessionState.getAsString()), kotlin.TuplesKt.to(SESSION_START_REASON, this.sessionStartReason.getAsString()), kotlin.TuplesKt.to("view_id", this.viewId), kotlin.TuplesKt.to(VIEW_NAME, this.viewName), kotlin.TuplesKt.to(VIEW_URL, this.viewUrl), kotlin.TuplesKt.to("view_type", this.viewType.getAsString()), kotlin.TuplesKt.to("action_id", this.actionId), kotlin.TuplesKt.to(SYNTHETICS_TEST_ID, this.syntheticsTestId), kotlin.TuplesKt.to(SYNTHETICS_RESULT_ID, this.syntheticsResultId), kotlin.TuplesKt.to(VIEW_TIMESTAMP, java.lang.Long.valueOf(this.viewTimestamp)), kotlin.TuplesKt.to(HAS_REPLAY, java.lang.Boolean.valueOf(this.hasReplay)), kotlin.TuplesKt.to(VIEW_TIMESTAMP_OFFSET, java.lang.Long.valueOf(this.viewTimestampOffset)));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/domain/RumContext$Companion;", "", "<init>", "()V", "", "", "featureContext", "Lcom/datadog/android/rum/internal/domain/RumContext;", "fromFeatureContext", "(Ljava/util/Map;)Lcom/datadog/android/rum/internal/domain/RumContext;", "ACTION_ID", "Ljava/lang/String;", "APPLICATION_ID", "HAS_REPLAY", "NULL_UUID", "getNULL_UUID", "()Ljava/lang/String;", "SESSION_ACTIVE", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.SESSION_ID, "SESSION_START_REASON", "SESSION_STATE", "SYNTHETICS_RESULT_ID", "SYNTHETICS_TEST_ID", "VIEW_ID", "VIEW_NAME", "VIEW_TIMESTAMP", "VIEW_TIMESTAMP_OFFSET", "VIEW_TYPE", "VIEW_URL"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getNULL_UUID() {
            return com.datadog.android.rum.internal.domain.RumContext.NULL_UUID;
        }

        public final com.datadog.android.rum.internal.domain.RumContext fromFeatureContext(java.util.Map<java.lang.String, ? extends java.lang.Object> featureContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureContext, "");
            java.lang.Object obj = featureContext.get("application_id");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            java.lang.Object obj2 = featureContext.get("session_id");
            java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.Object obj3 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.SESSION_ACTIVE);
            java.lang.Boolean bool = obj3 instanceof java.lang.Boolean ? (java.lang.Boolean) obj3 : null;
            com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.Companion companion = com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.Companion;
            java.lang.Object obj4 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.SESSION_STATE);
            com.datadog.android.rum.internal.domain.scope.RumSessionScope.State fromString = companion.fromString(obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null);
            com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.Companion companion2 = com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.Companion;
            java.lang.Object obj5 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.SESSION_START_REASON);
            com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason fromString2 = companion2.fromString(obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null);
            java.lang.Object obj6 = featureContext.get("view_id");
            java.lang.String str3 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
            java.lang.Object obj7 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.VIEW_NAME);
            java.lang.String str4 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
            java.lang.Object obj8 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.VIEW_URL);
            java.lang.String str5 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
            com.datadog.android.rum.internal.domain.scope.RumViewType.Companion companion3 = com.datadog.android.rum.internal.domain.scope.RumViewType.INSTANCE;
            java.lang.Object obj9 = featureContext.get("view_type");
            com.datadog.android.rum.internal.domain.scope.RumViewType fromString3 = companion3.fromString(obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null);
            java.lang.Object obj10 = featureContext.get("action_id");
            java.lang.String str6 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
            java.lang.Object obj11 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.SYNTHETICS_TEST_ID);
            java.lang.String str7 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
            java.lang.Object obj12 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.SYNTHETICS_RESULT_ID);
            java.lang.String str8 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
            java.lang.Object obj13 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.HAS_REPLAY);
            java.lang.Boolean bool2 = obj13 instanceof java.lang.Boolean ? (java.lang.Boolean) obj13 : null;
            boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
            java.lang.Object obj14 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.VIEW_TIMESTAMP);
            java.lang.Long l = obj14 instanceof java.lang.Long ? (java.lang.Long) obj14 : null;
            long longValue = l != null ? l.longValue() : 0L;
            java.lang.Object obj15 = featureContext.get(com.datadog.android.rum.internal.domain.RumContext.VIEW_TIMESTAMP_OFFSET);
            java.lang.Long l2 = obj15 instanceof java.lang.Long ? (java.lang.Long) obj15 : null;
            long longValue2 = l2 != null ? l2.longValue() : 0L;
            if (str == null) {
                str = getNULL_UUID();
            }
            if (str2 == null) {
                str2 = getNULL_UUID();
            }
            java.lang.String str9 = str2;
            boolean booleanValue2 = bool != null ? bool.booleanValue() : false;
            if (fromString == null) {
                fromString = com.datadog.android.rum.internal.domain.scope.RumSessionScope.State.NOT_TRACKED;
            }
            com.datadog.android.rum.internal.domain.scope.RumSessionScope.State state = fromString;
            if (fromString2 == null) {
                fromString2 = com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason.USER_APP_LAUNCH;
            }
            return new com.datadog.android.rum.internal.domain.RumContext(str, str9, booleanValue2, str3, str4, str5, str6, state, fromString2, fromString3 == null ? com.datadog.android.rum.internal.domain.scope.RumViewType.NONE : fromString3, str7, str8, longValue, longValue2, booleanValue);
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

    public final java.lang.String toString() {
        java.lang.String str = this.applicationId;
        java.lang.String str2 = this.sessionId;
        boolean z = this.isSessionActive;
        java.lang.String str3 = this.viewId;
        java.lang.String str4 = this.viewName;
        java.lang.String str5 = this.viewUrl;
        java.lang.String str6 = this.actionId;
        com.datadog.android.rum.internal.domain.scope.RumSessionScope.State state = this.sessionState;
        com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason startReason = this.sessionStartReason;
        com.datadog.android.rum.internal.domain.scope.RumViewType rumViewType = this.viewType;
        java.lang.String str7 = this.syntheticsTestId;
        java.lang.String str8 = this.syntheticsResultId;
        long j = this.viewTimestamp;
        long j2 = this.viewTimestampOffset;
        boolean z2 = this.hasReplay;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RumContext(applicationId=");
        sb.append(str);
        sb.append(", sessionId=");
        sb.append(str2);
        sb.append(", isSessionActive=");
        sb.append(z);
        sb.append(", viewId=");
        sb.append(str3);
        sb.append(", viewName=");
        sb.append(str4);
        sb.append(", viewUrl=");
        sb.append(str5);
        sb.append(", actionId=");
        sb.append(str6);
        sb.append(", sessionState=");
        sb.append(state);
        sb.append(", sessionStartReason=");
        sb.append(startReason);
        sb.append(", viewType=");
        sb.append(rumViewType);
        sb.append(", syntheticsTestId=");
        sb.append(str7);
        sb.append(", syntheticsResultId=");
        sb.append(str8);
        sb.append(", viewTimestamp=");
        sb.append(j);
        sb.append(", viewTimestampOffset=");
        sb.append(j2);
        sb.append(", hasReplay=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.applicationId.hashCode();
        int hashCode2 = this.sessionId.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isSessionActive);
        java.lang.String str = this.viewId;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.viewName;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.viewUrl;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.actionId;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        int hashCode8 = this.sessionState.hashCode();
        int hashCode9 = this.sessionStartReason.hashCode();
        int hashCode10 = this.viewType.hashCode();
        java.lang.String str5 = this.syntheticsTestId;
        int hashCode11 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.syntheticsResultId;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.viewTimestamp)) * 31) + java.lang.Long.hashCode(this.viewTimestampOffset)) * 31) + java.lang.Boolean.hashCode(this.hasReplay);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.domain.RumContext)) {
            return false;
        }
        com.datadog.android.rum.internal.domain.RumContext rumContext = (com.datadog.android.rum.internal.domain.RumContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.applicationId, rumContext.applicationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, rumContext.sessionId) && this.isSessionActive == rumContext.isSessionActive && kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, rumContext.viewId) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewName, rumContext.viewName) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewUrl, rumContext.viewUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionId, rumContext.actionId) && this.sessionState == rumContext.sessionState && this.sessionStartReason == rumContext.sessionStartReason && this.viewType == rumContext.viewType && kotlin.jvm.internal.Intrinsics.areEqual(this.syntheticsTestId, rumContext.syntheticsTestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.syntheticsResultId, rumContext.syntheticsResultId) && this.viewTimestamp == rumContext.viewTimestamp && this.viewTimestampOffset == rumContext.viewTimestampOffset && this.hasReplay == rumContext.hasReplay;
    }

    public final com.datadog.android.rum.internal.domain.RumContext copy(java.lang.String applicationId, java.lang.String sessionId, boolean isSessionActive, java.lang.String viewId, java.lang.String viewName, java.lang.String viewUrl, java.lang.String actionId, com.datadog.android.rum.internal.domain.scope.RumSessionScope.State sessionState, com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason sessionStartReason, com.datadog.android.rum.internal.domain.scope.RumViewType viewType, java.lang.String syntheticsTestId, java.lang.String syntheticsResultId, long viewTimestamp, long viewTimestampOffset, boolean hasReplay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStartReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewType, "");
        return new com.datadog.android.rum.internal.domain.RumContext(applicationId, sessionId, isSessionActive, viewId, viewName, viewUrl, actionId, sessionState, sessionStartReason, viewType, syntheticsTestId, syntheticsResultId, viewTimestamp, viewTimestampOffset, hasReplay);
    }

    /* renamed from: component9, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumSessionScope.StartReason getSessionStartReason() {
        return this.sessionStartReason;
    }

    /* renamed from: component8, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumSessionScope.State getSessionState() {
        return this.sessionState;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getActionId() {
        return this.actionId;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getViewUrl() {
        return this.viewUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getViewName() {
        return this.viewName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getViewId() {
        return this.viewId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSessionActive() {
        return this.isSessionActive;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getHasReplay() {
        return this.hasReplay;
    }

    /* renamed from: component14, reason: from getter */
    public final long getViewTimestampOffset() {
        return this.viewTimestampOffset;
    }

    /* renamed from: component13, reason: from getter */
    public final long getViewTimestamp() {
        return this.viewTimestamp;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getSyntheticsResultId() {
        return this.syntheticsResultId;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getSyntheticsTestId() {
        return this.syntheticsTestId;
    }

    /* renamed from: component10, reason: from getter */
    public final com.datadog.android.rum.internal.domain.scope.RumViewType getViewType() {
        return this.viewType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public RumContext() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, 0L, 0L, false, 32767, null);
    }
}
