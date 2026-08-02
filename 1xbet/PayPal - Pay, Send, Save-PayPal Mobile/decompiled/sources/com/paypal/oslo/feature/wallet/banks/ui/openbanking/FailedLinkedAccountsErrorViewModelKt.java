package com.paypal.oslo.feature.wallet.banks.ui.openbanking;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkAccountFailType;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsFailType;", "toFailedLinkedAccountsFailType", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkAccountFailType;)Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsFailType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FailedLinkedAccountsErrorViewModelKt {
    public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType toFailedLinkedAccountsFailType(com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType linkAccountFailType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAccountFailType, "");
        switch (com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModelKt.WhenMappings.$EnumSwitchMapping$0[linkAccountFailType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType.INSTRUMENT_SHARING_LIMIT_EXCEEDED;
            case 2:
                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType.RISK_DENIED;
            case 3:
                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType.BAD_INSTRUMENT;
            case 4:
                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType.USER_ACCOUNT_LIMITED;
            case 5:
                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType.TERMINAL;
            case 6:
                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType.ERROR_NOT_MAPPED;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.INSTRUMENT_SHARING_LIMIT_EXCEEDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.RISK_DENIED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.BAD_INSTRUMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.USER_ACCOUNT_LIMITED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.TERMINAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.ERROR_NOT_MAPPED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
