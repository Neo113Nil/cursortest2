package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/PreferenceType;", "", "<init>", "(Ljava/lang/String;I)V", "WALLET_PAYMENT_ONLINE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PreferenceType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType UNKNOWN;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType WALLET_PAYMENT_ONLINE;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PreferenceType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType preferenceType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType("WALLET_PAYMENT_ONLINE", 0);
        WALLET_PAYMENT_ONLINE = preferenceType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType preferenceType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType("UNKNOWN", 1);
        UNKNOWN = preferenceType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType[] preferenceTypeArr = {preferenceType, preferenceType2};
        getHighSpeedVideoFpsRanges = preferenceTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(preferenceTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.PreferenceType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
