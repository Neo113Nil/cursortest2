package com.paypal.oslo.feature.wallet.banks.ui.openbanking;

/* renamed from: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0443FailedLinkedAccountsErrorViewModel_Factory {
    public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel get(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list) {
        return newInstance(list);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.openbanking.C0443FailedLinkedAccountsErrorViewModel_Factory create() {
        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.C0443FailedLinkedAccountsErrorViewModel_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel newInstance(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list) {
        return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel(list);
    }

    /* renamed from: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.C0443FailedLinkedAccountsErrorViewModel_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.C0443FailedLinkedAccountsErrorViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
