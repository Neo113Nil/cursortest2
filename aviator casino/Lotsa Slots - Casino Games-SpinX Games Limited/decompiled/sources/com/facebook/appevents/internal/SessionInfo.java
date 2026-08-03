package com.facebook.appevents.internal;

/* compiled from: SessionInfo.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$R \u0010\b\u001a\u0004\u0018\u00010\u00038FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/facebook/appevents/internal/SessionInfo;", "", "sessionStartTime", "", "sessionLastEventTime", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "Ljava/util/UUID;", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "diskRestoreTime", "getDiskRestoreTime", "()Ljava/lang/Long;", "setDiskRestoreTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "<set-?>", "", "interruptionCount", "getInterruptionCount", "()I", "getSessionId", "()Ljava/util/UUID;", "setSessionId", "(Ljava/util/UUID;)V", "getSessionLastEventTime", "setSessionLastEventTime", "sessionLength", "getSessionLength", "()J", "getSessionStartTime", "sourceApplicationInfo", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "getSourceApplicationInfo", "()Lcom/facebook/appevents/internal/SourceApplicationInfo;", "setSourceApplicationInfo", "(Lcom/facebook/appevents/internal/SourceApplicationInfo;)V", "incrementInterruptionCount", "", "writeSessionToDisk", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.internal.SessionInfo.Companion INSTANCE = new com.facebook.appevents.internal.SessionInfo.Companion(null);
    private static final java.lang.String INTERRUPTION_COUNT_KEY = "com.facebook.appevents.SessionInfo.interruptionCount";
    private static final java.lang.String LAST_SESSION_INFO_END_KEY = "com.facebook.appevents.SessionInfo.sessionEndTime";
    private static final java.lang.String LAST_SESSION_INFO_START_KEY = "com.facebook.appevents.SessionInfo.sessionStartTime";
    private static final java.lang.String SESSION_ID_KEY = "com.facebook.appevents.SessionInfo.sessionId";
    private java.lang.Long diskRestoreTime;
    private int interruptionCount;
    private java.util.UUID sessionId;
    private java.lang.Long sessionLastEventTime;
    private final java.lang.Long sessionStartTime;
    private com.facebook.appevents.internal.SourceApplicationInfo sourceApplicationInfo;

    public SessionInfo(java.lang.Long l, java.lang.Long l2) {
        this(l, l2, null, 4, null);
    }

    @kotlin.jvm.JvmStatic
    public static final void clearSavedSessionFromDisk() {
        INSTANCE.clearSavedSessionFromDisk();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.appevents.internal.SessionInfo getStoredSessionInfo() {
        return INSTANCE.getStoredSessionInfo();
    }

    public SessionInfo(java.lang.Long l, java.lang.Long l2, java.util.UUID sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionStartTime = l;
        this.sessionLastEventTime = l2;
        this.sessionId = sessionId;
    }

    public final java.lang.Long getSessionStartTime() {
        return this.sessionStartTime;
    }

    public final java.lang.Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    public final void setSessionLastEventTime(java.lang.Long l) {
        this.sessionLastEventTime = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SessionInfo(java.lang.Long l, java.lang.Long l2, java.util.UUID uuid, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, uuid);
        if ((i & 4) != 0) {
            uuid = java.util.UUID.randomUUID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
    }

    public final java.util.UUID getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(java.util.UUID uuid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.sessionId = uuid;
    }

    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    public final void setDiskRestoreTime(java.lang.Long l) {
        this.diskRestoreTime = l;
    }

    public final java.lang.Long getDiskRestoreTime() {
        java.lang.Long l = this.diskRestoreTime;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    public final com.facebook.appevents.internal.SourceApplicationInfo getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    public final void setSourceApplicationInfo(com.facebook.appevents.internal.SourceApplicationInfo sourceApplicationInfo) {
        this.sourceApplicationInfo = sourceApplicationInfo;
    }

    public final void incrementInterruptionCount() {
        this.interruptionCount++;
    }

    public final long getSessionLength() {
        java.lang.Long l;
        if (this.sessionStartTime == null || (l = this.sessionLastEventTime) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.sessionStartTime.longValue();
        }
        throw new java.lang.IllegalStateException("Required value was null.".toString());
    }

    public final void writeSessionToDisk() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext()).edit();
        java.lang.Long l = this.sessionStartTime;
        edit.putLong(LAST_SESSION_INFO_START_KEY, l == null ? 0L : l.longValue());
        java.lang.Long l2 = this.sessionLastEventTime;
        edit.putLong(LAST_SESSION_INFO_END_KEY, l2 != null ? l2.longValue() : 0L);
        edit.putInt(INTERRUPTION_COUNT_KEY, this.interruptionCount);
        edit.putString(SESSION_ID_KEY, this.sessionId.toString());
        edit.apply();
        com.facebook.appevents.internal.SourceApplicationInfo sourceApplicationInfo = this.sourceApplicationInfo;
        if (sourceApplicationInfo == null || sourceApplicationInfo == null) {
            return;
        }
        sourceApplicationInfo.writeSourceApplicationInfoToDisk();
    }

    /* compiled from: SessionInfo.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/internal/SessionInfo$Companion;", "", "()V", "INTERRUPTION_COUNT_KEY", "", "LAST_SESSION_INFO_END_KEY", "LAST_SESSION_INFO_START_KEY", "SESSION_ID_KEY", "clearSavedSessionFromDisk", "", "getStoredSessionInfo", "Lcom/facebook/appevents/internal/SessionInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.appevents.internal.SessionInfo getStoredSessionInfo() {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext());
            long j = defaultSharedPreferences.getLong(com.facebook.appevents.internal.SessionInfo.LAST_SESSION_INFO_START_KEY, 0L);
            long j2 = defaultSharedPreferences.getLong(com.facebook.appevents.internal.SessionInfo.LAST_SESSION_INFO_END_KEY, 0L);
            java.lang.String string = defaultSharedPreferences.getString(com.facebook.appevents.internal.SessionInfo.SESSION_ID_KEY, null);
            if (j == 0 || j2 == 0 || string == null) {
                return null;
            }
            com.facebook.appevents.internal.SessionInfo sessionInfo = new com.facebook.appevents.internal.SessionInfo(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), null, 4, null);
            sessionInfo.interruptionCount = defaultSharedPreferences.getInt(com.facebook.appevents.internal.SessionInfo.INTERRUPTION_COUNT_KEY, 0);
            sessionInfo.setSourceApplicationInfo(com.facebook.appevents.internal.SourceApplicationInfo.INSTANCE.getStoredSourceApplicatioInfo());
            sessionInfo.setDiskRestoreTime(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.util.UUID fromString = java.util.UUID.fromString(string);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "fromString(sessionIDStr)");
            sessionInfo.setSessionId(fromString);
            return sessionInfo;
        }

        @kotlin.jvm.JvmStatic
        public final void clearSavedSessionFromDisk() {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext()).edit();
            edit.remove(com.facebook.appevents.internal.SessionInfo.LAST_SESSION_INFO_START_KEY);
            edit.remove(com.facebook.appevents.internal.SessionInfo.LAST_SESSION_INFO_END_KEY);
            edit.remove(com.facebook.appevents.internal.SessionInfo.INTERRUPTION_COUNT_KEY);
            edit.remove(com.facebook.appevents.internal.SessionInfo.SESSION_ID_KEY);
            edit.apply();
            com.facebook.appevents.internal.SourceApplicationInfo.INSTANCE.clearSavedSourceApplicationInfoFromDisk();
        }
    }
}
