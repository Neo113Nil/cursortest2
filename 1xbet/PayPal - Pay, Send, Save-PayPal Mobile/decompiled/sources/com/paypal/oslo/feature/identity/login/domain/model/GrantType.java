package com.paypal.oslo.feature.identity.login.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/GrantType;", "", "<init>", "(Ljava/lang/String;I)V", "PASSWORD", "PUBLIC_CREDENTIAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GrantType {
    private static final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.GrantType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.login.domain.model.GrantType PASSWORD;
    public static final com.paypal.oslo.feature.identity.login.domain.model.GrantType PUBLIC_CREDENTIAL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private GrantType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.login.domain.model.GrantType grantType = new com.paypal.oslo.feature.identity.login.domain.model.GrantType("PASSWORD", 0);
        PASSWORD = grantType;
        com.paypal.oslo.feature.identity.login.domain.model.GrantType grantType2 = new com.paypal.oslo.feature.identity.login.domain.model.GrantType("PUBLIC_CREDENTIAL", 1);
        PUBLIC_CREDENTIAL = grantType2;
        com.paypal.oslo.feature.identity.login.domain.model.GrantType[] grantTypeArr = {grantType, grantType2};
        Camera2StreamConfigurationMap = grantTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(grantTypeArr);
    }

    public static com.paypal.oslo.feature.identity.login.domain.model.GrantType[] values() {
        return (com.paypal.oslo.feature.identity.login.domain.model.GrantType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.identity.login.domain.model.GrantType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.login.domain.model.GrantType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.login.domain.model.GrantType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.login.domain.model.GrantType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
