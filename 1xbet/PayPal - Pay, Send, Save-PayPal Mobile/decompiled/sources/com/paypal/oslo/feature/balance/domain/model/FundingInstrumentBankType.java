package com.paypal.oslo.feature.balance.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentBankType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BUSINESS_CHECKING", "BUSINESS_SAVINGS", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "CUSTOM", "NORMAL", "SAVINGS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentBankType {
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType BUSINESS_CHECKING;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType BUSINESS_SAVINGS;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType CHECKING;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType CUSTOM;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType NORMAL;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType SAVINGS;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FundingInstrumentBankType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType("BUSINESS_CHECKING", 0);
        BUSINESS_CHECKING = fundingInstrumentBankType;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType2 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType("BUSINESS_SAVINGS", 1);
        BUSINESS_SAVINGS = fundingInstrumentBankType2;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType3 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType(com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, 2);
        CHECKING = fundingInstrumentBankType3;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType4 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType("CUSTOM", 3);
        CUSTOM = fundingInstrumentBankType4;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType5 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType("NORMAL", 4);
        NORMAL = fundingInstrumentBankType5;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType6 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType("SAVINGS", 5);
        SAVINGS = fundingInstrumentBankType6;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType7 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType("UNKNOWN", 6);
        UNKNOWN = fundingInstrumentBankType7;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType[] fundingInstrumentBankTypeArr = {fundingInstrumentBankType, fundingInstrumentBankType2, fundingInstrumentBankType3, fundingInstrumentBankType4, fundingInstrumentBankType5, fundingInstrumentBankType6, fundingInstrumentBankType7};
        getHighResolutionOutputSizeshNQ4ISI = fundingInstrumentBankTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentBankTypeArr);
        INSTANCE = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentBankType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentBankType;", "fromStringOrDefault", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentBankType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fromStringOrDefault(java.lang.String value) {
            java.lang.Object m23436constructorimpl;
            java.lang.String str = value;
            if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                return com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.UNKNOWN;
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.Companion companion2 = this;
                java.lang.String upperCase = value.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.valueOf(upperCase));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.UNKNOWN;
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = fundingInstrumentBankType;
            }
            return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType) m23436constructorimpl;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType[] values() {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
