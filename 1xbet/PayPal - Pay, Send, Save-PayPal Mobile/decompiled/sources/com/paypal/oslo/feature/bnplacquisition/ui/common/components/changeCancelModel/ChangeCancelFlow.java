package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelFlow;", "", "<init>", "(Ljava/lang/String;I)V", "Change", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeCancelFlow {
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow Cancel;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow Change;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ChangeCancelFlow(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow changeCancelFlow = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow("Change", 0);
        Change = changeCancelFlow;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow changeCancelFlow2 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, 1);
        Cancel = changeCancelFlow2;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow[] changeCancelFlowArr = {changeCancelFlow, changeCancelFlow2};
        Camera2StreamConfigurationMap = changeCancelFlowArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(changeCancelFlowArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelFlow> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
