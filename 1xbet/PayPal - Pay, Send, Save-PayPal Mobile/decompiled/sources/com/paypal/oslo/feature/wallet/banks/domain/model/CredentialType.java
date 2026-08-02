package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;", "", "<init>", "(Ljava/lang/String;I)V", "PERMANENT", "TEMPORARY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CredentialType {
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType PERMANENT;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType TEMPORARY;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CredentialType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType = new com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType("PERMANENT", 0);
        PERMANENT = credentialType;
        com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType2 = new com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType("TEMPORARY", 1);
        TEMPORARY = credentialType2;
        com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType[] credentialTypeArr = {credentialType, credentialType2};
        getHighSpeedVideoFpsRangesFor = credentialTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(credentialTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
