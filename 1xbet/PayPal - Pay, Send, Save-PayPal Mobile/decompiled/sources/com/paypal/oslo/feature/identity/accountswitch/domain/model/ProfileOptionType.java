package com.paypal.oslo.feature.identity.accountswitch.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/ProfileOptionType;", "", "<init>", "(Ljava/lang/String;I)V", "ADD_PROFILE", "UNLINK_PROFILE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProfileOptionType {
    public static final com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType ADD_PROFILE;
    public static final com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType UNLINK_PROFILE;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ProfileOptionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType profileOptionType = new com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType("ADD_PROFILE", 0);
        ADD_PROFILE = profileOptionType;
        com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType profileOptionType2 = new com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType("UNLINK_PROFILE", 1);
        UNLINK_PROFILE = profileOptionType2;
        com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType[] profileOptionTypeArr = {profileOptionType, profileOptionType2};
        getHighResolutionOutputSizeshNQ4ISI = profileOptionTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(profileOptionTypeArr);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType[] values() {
        return (com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
