package com.paypal.oslo.feature.subscriptions.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentLabel;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST", "BACKUP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentLabel {
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel BACKUP;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel FIRST;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel[] getHighResolutionOutputSizeshNQ4ISI;

    private FundingInstrumentLabel(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel fundingInstrumentLabel = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel("FIRST", 0);
        FIRST = fundingInstrumentLabel;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel fundingInstrumentLabel2 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel("BACKUP", 1);
        BACKUP = fundingInstrumentLabel2;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel[] fundingInstrumentLabelArr = {fundingInstrumentLabel, fundingInstrumentLabel2};
        getHighResolutionOutputSizeshNQ4ISI = fundingInstrumentLabelArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentLabelArr);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel[] values() {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentLabel> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
