package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/InputType;", "", "<init>", "(Ljava/lang/String;I)V", "NUMERIC", "TEXT", "EMAIL", "PHONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputType {
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType EMAIL;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType NUMERIC;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType PHONE;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType TEXT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private InputType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType("NUMERIC", 0);
        NUMERIC = inputType;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType2 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType("TEXT", 1);
        TEXT = inputType2;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType3 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType("EMAIL", 2);
        EMAIL = inputType3;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType4 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType("PHONE", 3);
        PHONE = inputType4;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType[] inputTypeArr = {inputType, inputType2, inputType3, inputType4};
        Camera2StreamConfigurationMap = inputTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(inputTypeArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
