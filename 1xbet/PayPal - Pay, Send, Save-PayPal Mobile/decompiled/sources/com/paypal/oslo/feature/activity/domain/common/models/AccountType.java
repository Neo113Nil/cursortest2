package com.paypal.oslo.feature.activity.domain.common.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/AccountType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BUSINESS", "PREMIER", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AccountType {
    public static final com.paypal.oslo.feature.activity.domain.common.models.AccountType BUSINESS;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.common.models.AccountType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.activity.domain.common.models.AccountType PERSONAL;
    public static final com.paypal.oslo.feature.activity.domain.common.models.AccountType PREMIER;
    public static final com.paypal.oslo.feature.activity.domain.common.models.AccountType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.AccountType[] getHighSpeedVideoFpsRanges;

    private AccountType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType = new com.paypal.oslo.feature.activity.domain.common.models.AccountType("BUSINESS", 0);
        BUSINESS = accountType;
        com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType2 = new com.paypal.oslo.feature.activity.domain.common.models.AccountType("PREMIER", 1);
        PREMIER = accountType2;
        com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType3 = new com.paypal.oslo.feature.activity.domain.common.models.AccountType(com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, 2);
        PERSONAL = accountType3;
        com.paypal.oslo.feature.activity.domain.common.models.AccountType accountType4 = new com.paypal.oslo.feature.activity.domain.common.models.AccountType("UNKNOWN", 3);
        UNKNOWN = accountType4;
        com.paypal.oslo.feature.activity.domain.common.models.AccountType[] accountTypeArr = {accountType, accountType2, accountType3, accountType4};
        getHighSpeedVideoFpsRanges = accountTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(accountTypeArr);
        INSTANCE = new com.paypal.oslo.feature.activity.domain.common.models.AccountType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/AccountType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/activity/domain/common/models/AccountType;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/common/models/AccountType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.AccountType fromString(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            if (kotlin.text.StringsKt.isBlank(value)) {
                return com.paypal.oslo.feature.activity.domain.common.models.AccountType.UNKNOWN;
            }
            java.lang.String lowerCase = value.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1146830912) {
                if (hashCode != -318452628) {
                    if (hashCode == 443164224 && lowerCase.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UserProfileConstants.KEY_ACCOUNT_TYPE_PERSONAL)) {
                        return com.paypal.oslo.feature.activity.domain.common.models.AccountType.PERSONAL;
                    }
                } else if (lowerCase.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UserProfileConstants.KEY_ACCOUNT_TYPE_PREMIER)) {
                    return com.paypal.oslo.feature.activity.domain.common.models.AccountType.PREMIER;
                }
            } else if (lowerCase.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UserProfileConstants.KEY_ACCOUNT_TYPE_BUSINESS)) {
                return com.paypal.oslo.feature.activity.domain.common.models.AccountType.BUSINESS;
            }
            return com.paypal.oslo.feature.activity.domain.common.models.AccountType.UNKNOWN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.activity.domain.common.models.AccountType[] values() {
        return (com.paypal.oslo.feature.activity.domain.common.models.AccountType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.activity.domain.common.models.AccountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.activity.domain.common.models.AccountType) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.domain.common.models.AccountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.domain.common.models.AccountType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
