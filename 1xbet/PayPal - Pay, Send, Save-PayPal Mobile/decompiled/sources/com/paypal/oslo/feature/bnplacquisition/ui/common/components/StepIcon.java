package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/StepIcon;", "", "<init>", "(Ljava/lang/String;I)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Mobile", "Contactless"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StepIcon {
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon Card;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon Contactless;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon Mobile;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon None;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private StepIcon(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon stepIcon = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 0);
        None = stepIcon;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon stepIcon2 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, 1);
        Card = stepIcon2;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon stepIcon3 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon("Mobile", 2);
        Mobile = stepIcon3;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon stepIcon4 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon("Contactless", 3);
        Contactless = stepIcon4;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon[] stepIconArr = {stepIcon, stepIcon2, stepIcon3, stepIcon4};
        Camera2StreamConfigurationMap = stepIconArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(stepIconArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.ui.common.components.StepIcon> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
