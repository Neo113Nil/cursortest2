package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncomePeriod;", "", "<init>", "(Ljava/lang/String;I)V", "ANNUAL", "MONTHLY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIIncomePeriod {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod ANNUAL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod MONTHLY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod[] getHighSpeedVideoFpsRangesFor;

    private CLIIncomePeriod(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod cLIIncomePeriod = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod("ANNUAL", 0);
        ANNUAL = cLIIncomePeriod;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod cLIIncomePeriod2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod("MONTHLY", 1);
        MONTHLY = cLIIncomePeriod2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod[] cLIIncomePeriodArr = {cLIIncomePeriod, cLIIncomePeriod2};
        getHighSpeedVideoFpsRangesFor = cLIIncomePeriodArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cLIIncomePeriodArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncomePeriod> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
