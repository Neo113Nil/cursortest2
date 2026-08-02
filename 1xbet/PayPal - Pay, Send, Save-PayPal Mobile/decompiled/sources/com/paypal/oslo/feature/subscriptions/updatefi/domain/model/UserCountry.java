package com.paypal.oslo.feature.subscriptions.updatefi.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/UserCountry;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "US", "GB", "DE", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserCountry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry.Companion INSTANCE;
    public static final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry DE;
    public static final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry GB;
    public static final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry OTHER;
    public static final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry US;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private UserCountry(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry userCountry = new com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry("US", 0);
        US = userCountry;
        com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry userCountry2 = new com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry("GB", 1);
        GB = userCountry2;
        com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry userCountry3 = new com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry("DE", 2);
        DE = userCountry3;
        com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry userCountry4 = new com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry("OTHER", 3);
        OTHER = userCountry4;
        com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry[] userCountryArr = {userCountry, userCountry2, userCountry3, userCountry4};
        getHighSpeedVideoFpsRangesFor = userCountryArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(userCountryArr);
        INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/UserCountry$Companion;", "", "<init>", "()V", "", "countryCode", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/UserCountry;", "fromCountryCode", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/UserCountry;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry fromCountryCode(java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            int hashCode = countryCode.hashCode();
            if (hashCode != 2177) {
                if (hashCode != 2267) {
                    if (hashCode == 2718 && countryCode.equals("US")) {
                        return com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry.US;
                    }
                } else if (countryCode.equals("GB")) {
                    return com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry.GB;
                }
            } else if (countryCode.equals("DE")) {
                return com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry.DE;
            }
            return com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry.OTHER;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry[] values() {
        return (com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
