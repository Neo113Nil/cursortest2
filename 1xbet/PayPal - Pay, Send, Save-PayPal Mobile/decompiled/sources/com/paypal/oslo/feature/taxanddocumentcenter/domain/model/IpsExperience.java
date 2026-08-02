package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/IpsExperience;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, "MERCHANT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IpsExperience {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience CONSUMER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience MERCHANT;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private IpsExperience(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience ipsExperience = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience(com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, 0);
        CONSUMER = ipsExperience;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience ipsExperience2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience("MERCHANT", 1);
        MERCHANT = ipsExperience2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience[] ipsExperienceArr = {ipsExperience, ipsExperience2};
        getHighSpeedVideoFpsRanges = ipsExperienceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(ipsExperienceArr);
        INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/IpsExperience$Companion;", "", "<init>", "()V", "", "accountType", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/IpsExperience;", "fromAccountType", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/IpsExperience;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience fromAccountType(java.lang.String accountType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
            if (kotlin.text.StringsKt.equals(accountType, "BUSINESS", true)) {
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience.MERCHANT;
            }
            return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience.CONSUMER;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.IpsExperience> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
