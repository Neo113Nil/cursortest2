package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "UNKNOWN", "BANK", "CARD", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentType {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType BALANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType BANK;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType CARD;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType[] getHighSpeedVideoFpsRangesFor;

    private FundingInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType("UNKNOWN", 0);
        UNKNOWN = fundingInstrumentType;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType2 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType("BANK", 1);
        BANK = fundingInstrumentType2;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType3 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType("CARD", 2);
        CARD = fundingInstrumentType3;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType4 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 3);
        BALANCE = fundingInstrumentType4;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType[] fundingInstrumentTypeArr = {fundingInstrumentType, fundingInstrumentType2, fundingInstrumentType3, fundingInstrumentType4};
        getHighSpeedVideoFpsRangesFor = fundingInstrumentTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType) obj;
            return fundingInstrumentType == null ? com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.UNKNOWN : fundingInstrumentType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
