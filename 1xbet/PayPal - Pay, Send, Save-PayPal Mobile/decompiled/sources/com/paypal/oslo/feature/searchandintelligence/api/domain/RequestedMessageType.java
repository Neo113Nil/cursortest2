package com.paypal.oslo.feature.searchandintelligence.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u000b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;IZZ)V", "isVisibleInUi", "Z", "()Z", "shouldSendToBackend", "getShouldSendToBackend", "Companion", "USER_SILENT_REMOTE", "USER_VISIBLE_REMOTE", "USER_VISIBLE_LOCAL", "AGENT_VISIBLE_LOCAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequestedMessageType {
    public static final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType AGENT_VISIBLE_LOCAL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType USER_SILENT_REMOTE;
    public static final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType USER_VISIBLE_LOCAL;
    public static final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType USER_VISIBLE_REMOTE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType[] getHighSpeedVideoFpsRangesFor;
    private final boolean isVisibleInUi;
    private final boolean shouldSendToBackend;

    private RequestedMessageType(java.lang.String str, int i, boolean z, boolean z2) {
        this.isVisibleInUi = z;
        this.shouldSendToBackend = z2;
    }

    /* renamed from: isVisibleInUi, reason: from getter */
    public final boolean getIsVisibleInUi() {
        return this.isVisibleInUi;
    }

    public final boolean getShouldSendToBackend() {
        return this.shouldSendToBackend;
    }

    static {
        com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType = new com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType("USER_SILENT_REMOTE", 0, false, true);
        USER_SILENT_REMOTE = requestedMessageType;
        com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType2 = new com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType("USER_VISIBLE_REMOTE", 1, true, true);
        USER_VISIBLE_REMOTE = requestedMessageType2;
        com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType3 = new com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType("USER_VISIBLE_LOCAL", 2, true, false);
        USER_VISIBLE_LOCAL = requestedMessageType3;
        com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType requestedMessageType4 = new com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType("AGENT_VISIBLE_LOCAL", 3, true, false);
        AGENT_VISIBLE_LOCAL = requestedMessageType4;
        com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType[] requestedMessageTypeArr = {requestedMessageType, requestedMessageType2, requestedMessageType3, requestedMessageType4};
        getHighSpeedVideoFpsRangesFor = requestedMessageTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(requestedMessageTypeArr);
        INSTANCE = new com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType$Companion;", "", "<init>", "()V", "", androidx.core.app.NotificationCompat.GROUP_KEY_SILENT, "sendToBackend", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "user", "(ZZ)Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;", "agent", "()Lcom/paypal/oslo/feature/searchandintelligence/api/domain/RequestedMessageType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType user(boolean silent, boolean sendToBackend) {
            if (silent && sendToBackend) {
                return com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.USER_SILENT_REMOTE;
            }
            if (!silent && sendToBackend) {
                return com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.USER_VISIBLE_REMOTE;
            }
            if (!silent && !sendToBackend) {
                return com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.USER_VISIBLE_LOCAL;
            }
            throw new java.lang.IllegalStateException("Silent local user messages are not supported".toString());
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType agent() {
            return com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.AGENT_VISIBLE_LOCAL;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType[] values() {
        return (com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType) java.lang.Enum.valueOf(com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
