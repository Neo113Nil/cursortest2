package com.paypal.oslo.feature.searchandintelligence.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/CloseChatReason;", "", "<init>", "(Ljava/lang/String;I)V", "USER_REQUEST", "INACTIVITY", "COMPLETED", "ERROR", "LOGOUT", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseChatReason {
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason COMPLETED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason ERROR;
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason INACTIVITY;
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason LOGOUT;
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason OTHER;
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason USER_REQUEST;
    private static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason[] getHighResolutionOutputSizeshNQ4ISI;

    private CloseChatReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason closeChatReason = new com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason("USER_REQUEST", 0);
        USER_REQUEST = closeChatReason;
        com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason closeChatReason2 = new com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason("INACTIVITY", 1);
        INACTIVITY = closeChatReason2;
        com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason closeChatReason3 = new com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason("COMPLETED", 2);
        COMPLETED = closeChatReason3;
        com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason closeChatReason4 = new com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason("ERROR", 3);
        ERROR = closeChatReason4;
        com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason closeChatReason5 = new com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason("LOGOUT", 4);
        LOGOUT = closeChatReason5;
        com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason closeChatReason6 = new com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason("OTHER", 5);
        OTHER = closeChatReason6;
        com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason[] closeChatReasonArr = {closeChatReason, closeChatReason2, closeChatReason3, closeChatReason4, closeChatReason5, closeChatReason6};
        getHighResolutionOutputSizeshNQ4ISI = closeChatReasonArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(closeChatReasonArr);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason[] values() {
        return (com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
