package com.paypal.oslo.feature.directdeposit.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteAccountType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "SAVINGS", "CRYPTO_PYUSD", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SmartRouteAccountType {
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType BALANCE;
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType CRYPTO_PYUSD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType SAVINGS;
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType[] getHighSpeedVideoSizes;

    private SmartRouteAccountType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType smartRouteAccountType = new com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType("SAVINGS", 0);
        SAVINGS = smartRouteAccountType;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType smartRouteAccountType2 = new com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType("CRYPTO_PYUSD", 1);
        CRYPTO_PYUSD = smartRouteAccountType2;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType smartRouteAccountType3 = new com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 2);
        BALANCE = smartRouteAccountType3;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType smartRouteAccountType4 = new com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType("UNKNOWN", 3);
        UNKNOWN = smartRouteAccountType4;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType[] smartRouteAccountTypeArr = {smartRouteAccountType, smartRouteAccountType2, smartRouteAccountType3, smartRouteAccountType4};
        getHighSpeedVideoSizes = smartRouteAccountTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(smartRouteAccountTypeArr);
        INSTANCE = new com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteAccountType$Companion;", "", "<init>", "()V", "", "accountType", "Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteAccountType;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteAccountType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType fromString(java.lang.String accountType) {
            java.lang.String str;
            if (accountType != null) {
                str = accountType.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1704036199) {
                    if (hashCode != 122096063) {
                        if (hashCode == 378796732 && str.equals(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance)) {
                            return com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.BALANCE;
                        }
                    } else if (str.equals("CRYPTO_PYUSD")) {
                        return com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.CRYPTO_PYUSD;
                    }
                } else if (str.equals("SAVINGS")) {
                    return com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.SAVINGS;
                }
            }
            return com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.UNKNOWN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType[] values() {
        return (com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType) java.lang.Enum.valueOf(com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteAccountType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
