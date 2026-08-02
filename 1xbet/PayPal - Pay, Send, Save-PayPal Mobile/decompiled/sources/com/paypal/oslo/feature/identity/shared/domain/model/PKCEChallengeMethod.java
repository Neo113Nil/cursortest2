package com.paypal.oslo.feature.identity.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEChallengeMethod;", "", "<init>", "(Ljava/lang/String;)V", com.paypal.oslo.feature.identity.sso.data.mapper.PKCEChallengeMethodMapper.S256_STRING}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PKCEChallengeMethod {
    public static final com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod S256;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PKCEChallengeMethod(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod pKCEChallengeMethod = new com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod(com.paypal.oslo.feature.identity.sso.data.mapper.PKCEChallengeMethodMapper.S256_STRING);
        S256 = pKCEChallengeMethod;
        com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod[] pKCEChallengeMethodArr = {pKCEChallengeMethod};
        getHighSpeedVideoFpsRanges = pKCEChallengeMethodArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(pKCEChallengeMethodArr);
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod[] values() {
        return (com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
