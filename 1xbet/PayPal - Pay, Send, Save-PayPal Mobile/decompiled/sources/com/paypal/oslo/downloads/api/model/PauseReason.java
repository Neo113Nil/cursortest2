package com.paypal.oslo.downloads.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/downloads/api/model/PauseReason;", "", "<init>", "(Ljava/lang/String;I)V", "USER_REQUESTED", "NETWORK_LOST", "WAITING_FOR_WIFI", "LOW_BATTERY", "INSUFFICIENT_STORAGE", "SYSTEM_RESTRICTION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PauseReason {
    public static final com.paypal.oslo.downloads.api.model.PauseReason INSUFFICIENT_STORAGE;
    public static final com.paypal.oslo.downloads.api.model.PauseReason LOW_BATTERY;
    public static final com.paypal.oslo.downloads.api.model.PauseReason NETWORK_LOST;
    public static final com.paypal.oslo.downloads.api.model.PauseReason SYSTEM_RESTRICTION;
    public static final com.paypal.oslo.downloads.api.model.PauseReason USER_REQUESTED;
    public static final com.paypal.oslo.downloads.api.model.PauseReason WAITING_FOR_WIFI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.downloads.api.model.PauseReason[] getHighSpeedVideoSizes;

    private PauseReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.downloads.api.model.PauseReason pauseReason = new com.paypal.oslo.downloads.api.model.PauseReason("USER_REQUESTED", 0);
        USER_REQUESTED = pauseReason;
        com.paypal.oslo.downloads.api.model.PauseReason pauseReason2 = new com.paypal.oslo.downloads.api.model.PauseReason("NETWORK_LOST", 1);
        NETWORK_LOST = pauseReason2;
        com.paypal.oslo.downloads.api.model.PauseReason pauseReason3 = new com.paypal.oslo.downloads.api.model.PauseReason("WAITING_FOR_WIFI", 2);
        WAITING_FOR_WIFI = pauseReason3;
        com.paypal.oslo.downloads.api.model.PauseReason pauseReason4 = new com.paypal.oslo.downloads.api.model.PauseReason("LOW_BATTERY", 3);
        LOW_BATTERY = pauseReason4;
        com.paypal.oslo.downloads.api.model.PauseReason pauseReason5 = new com.paypal.oslo.downloads.api.model.PauseReason("INSUFFICIENT_STORAGE", 4);
        INSUFFICIENT_STORAGE = pauseReason5;
        com.paypal.oslo.downloads.api.model.PauseReason pauseReason6 = new com.paypal.oslo.downloads.api.model.PauseReason("SYSTEM_RESTRICTION", 5);
        SYSTEM_RESTRICTION = pauseReason6;
        com.paypal.oslo.downloads.api.model.PauseReason[] pauseReasonArr = {pauseReason, pauseReason2, pauseReason3, pauseReason4, pauseReason5, pauseReason6};
        getHighSpeedVideoSizes = pauseReasonArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(pauseReasonArr);
    }

    public static com.paypal.oslo.downloads.api.model.PauseReason[] values() {
        return (com.paypal.oslo.downloads.api.model.PauseReason[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.downloads.api.model.PauseReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.downloads.api.model.PauseReason) java.lang.Enum.valueOf(com.paypal.oslo.downloads.api.model.PauseReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.downloads.api.model.PauseReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
