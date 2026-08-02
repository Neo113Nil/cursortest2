package com.paypal.oslo.core.userstore.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/ProfileIntent;", "", "<init>", "(Ljava/lang/String;I)V", "LINK_ACCOUNT", "SWITCH_ACCOUNT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProfileIntent {
    public static final com.paypal.oslo.core.userstore.model.ProfileIntent LINK_ACCOUNT;
    public static final com.paypal.oslo.core.userstore.model.ProfileIntent SWITCH_ACCOUNT;
    private static final /* synthetic */ com.paypal.oslo.core.userstore.model.ProfileIntent[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ProfileIntent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent = new com.paypal.oslo.core.userstore.model.ProfileIntent("LINK_ACCOUNT", 0);
        LINK_ACCOUNT = profileIntent;
        com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent2 = new com.paypal.oslo.core.userstore.model.ProfileIntent("SWITCH_ACCOUNT", 1);
        SWITCH_ACCOUNT = profileIntent2;
        com.paypal.oslo.core.userstore.model.ProfileIntent[] profileIntentArr = {profileIntent, profileIntent2};
        getHighResolutionOutputSizeshNQ4ISI = profileIntentArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(profileIntentArr);
    }

    public static com.paypal.oslo.core.userstore.model.ProfileIntent[] values() {
        return (com.paypal.oslo.core.userstore.model.ProfileIntent[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.core.userstore.model.ProfileIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.userstore.model.ProfileIntent) java.lang.Enum.valueOf(com.paypal.oslo.core.userstore.model.ProfileIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.userstore.model.ProfileIntent> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
