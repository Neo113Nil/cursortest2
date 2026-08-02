package com.paypal.oslo.feature.settings.closeaccount.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/FooterPrimaryAction;", "", "<init>", "(Ljava/lang/String;I)V", "Continue", com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FooterPrimaryAction {
    private static final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction CloseAccount;
    public static final com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction Continue;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FooterPrimaryAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction footerPrimaryAction = new com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction("Continue", 0);
        Continue = footerPrimaryAction;
        com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction footerPrimaryAction2 = new com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction(com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.OPERATION_NAME, 1);
        CloseAccount = footerPrimaryAction2;
        com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction[] footerPrimaryActionArr = {footerPrimaryAction, footerPrimaryAction2};
        Camera2StreamConfigurationMap = footerPrimaryActionArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(footerPrimaryActionArr);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction[] values() {
        return (com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
