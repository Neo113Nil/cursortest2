package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/WalletOperation;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSE_BROWSER", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY_NOW, "LOYALTY_SIGNUP", "MERCHANT_SIGNUP", "PAYMENT_PROVISIONING", "WEB_CHECKOUT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalletOperation {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation CLOSE_BROWSER;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation LOYALTY_SIGNUP;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation MERCHANT_SIGNUP;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation PAYMENT_PROVISIONING;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation PAY_NOW;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation WEB_CHECKOUT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private WalletOperation(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation walletOperation = new com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation("CLOSE_BROWSER", 0);
        CLOSE_BROWSER = walletOperation;
        com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation walletOperation2 = new com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY_NOW, 1);
        PAY_NOW = walletOperation2;
        com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation walletOperation3 = new com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation("LOYALTY_SIGNUP", 2);
        LOYALTY_SIGNUP = walletOperation3;
        com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation walletOperation4 = new com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation("MERCHANT_SIGNUP", 3);
        MERCHANT_SIGNUP = walletOperation4;
        com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation walletOperation5 = new com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation("PAYMENT_PROVISIONING", 4);
        PAYMENT_PROVISIONING = walletOperation5;
        com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation walletOperation6 = new com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation("WEB_CHECKOUT", 5);
        WEB_CHECKOUT = walletOperation6;
        com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation[] walletOperationArr = {walletOperation, walletOperation2, walletOperation3, walletOperation4, walletOperation5, walletOperation6};
        Camera2StreamConfigurationMap = walletOperationArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(walletOperationArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.WalletOperation> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
