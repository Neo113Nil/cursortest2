package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseStatus;", "", "<init>", "(Ljava/lang/String;I)V", "FULL_APPROVAL", "PARTIAL_APPROVAL", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIIncreaseStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus FULL_APPROVAL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus PARTIAL_APPROVAL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus[] getHighSpeedVideoFpsRanges;

    private CLIIncreaseStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus cLIIncreaseStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus("FULL_APPROVAL", 0);
        FULL_APPROVAL = cLIIncreaseStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus cLIIncreaseStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus("PARTIAL_APPROVAL", 1);
        PARTIAL_APPROVAL = cLIIncreaseStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus cLIIncreaseStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus("UNKNOWN", 2);
        UNKNOWN = cLIIncreaseStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus[] cLIIncreaseStatusArr = {cLIIncreaseStatus, cLIIncreaseStatus2, cLIIncreaseStatus3};
        getHighSpeedVideoFpsRanges = cLIIncreaseStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cLIIncreaseStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
