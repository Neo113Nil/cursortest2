package com.paypal.oslo.feature.identity.passkey.management.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyDeletionState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "DELETING", "SUCCESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyDeletionState {
    private static final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState DELETING;
    public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState IDLE;
    public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState SUCCESS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PasskeyDeletionState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState passkeyDeletionState = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState("IDLE", 0);
        IDLE = passkeyDeletionState;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState passkeyDeletionState2 = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState("DELETING", 1);
        DELETING = passkeyDeletionState2;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState passkeyDeletionState3 = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState("SUCCESS", 2);
        SUCCESS = passkeyDeletionState3;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState[] passkeyDeletionStateArr = {passkeyDeletionState, passkeyDeletionState2, passkeyDeletionState3};
        Camera2StreamConfigurationMap = passkeyDeletionStateArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(passkeyDeletionStateArr);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState[] values() {
        return (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyDeletionState> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
