package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIOperation;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.ACCEPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DECLINE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIOperation {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation ACCEPT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation DECLINE;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation[] getHighSpeedVideoFpsRanges;

    private CLIOperation(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation cLIOperation = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.ACCEPT, 0);
        ACCEPT = cLIOperation;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation cLIOperation2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DECLINE, 1);
        DECLINE = cLIOperation2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation[] cLIOperationArr = {cLIOperation, cLIOperation2};
        getHighSpeedVideoFpsRanges = cLIOperationArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cLIOperationArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIOperation> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
