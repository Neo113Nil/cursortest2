package com.paypal.oslo.feature.wallet.me.ui.linked;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "Lcom/paypal/oslo/feature/wallet/me/ui/linked/LinkedItem;", "asLinkedItem", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;)Lcom/paypal/oslo/feature/wallet/me/ui/linked/LinkedItem;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "(Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;)Lcom/paypal/oslo/feature/wallet/me/ui/linked/LinkedItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinkedItemKtKt {
    public static final com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItem asLinkedItem(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount) {
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2;
        java.lang.String url;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccount, "");
        com.paypal.oslo.core.commonui.utils.RefText stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(bankAccount.getName());
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type = bankAccount.getType();
        java.lang.String last4 = bankAccount.getLast4();
        switch (com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItemKtKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_checking_bank_masked, last4);
                break;
            case 2:
                stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_savings_bank_masked, last4);
                break;
            case 3:
                stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_business_checking_masked, last4);
                break;
            case 4:
                stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_business_savings_masked, last4);
                break;
            case 5:
            case 6:
            case 7:
                stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_bank_masked, last4);
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.commonui.utils.RefText refText = stringResourceRef;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankImage image = bankAccount.getImage();
        com.paypal.oslo.core.commonui.utils.RefText stringRef2 = (image == null || (url = image.getUrl()) == null) ? null : com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(url);
        com.paypal.pds.core.Icon.Bank bank = com.paypal.pds.core.Icon.Bank.INSTANCE;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type2 = bankAccount.getType();
        java.lang.String last42 = bankAccount.getLast4();
        switch (com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItemKtKt.WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case 1:
                stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_checking_ending_in, last42);
                break;
            case 2:
                stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_savings_ending_in, last42);
                break;
            case 3:
                stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_business_checking_ending_in, last42);
                break;
            case 4:
                stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_business_savings_ending_in, last42);
                break;
            case 5:
            case 6:
            case 7:
                stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_bank_account_ending_in, last42);
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItem(stringRef, refText, stringRef2, bank, stringResourceRef2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItem asLinkedItem(com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail cardDetail) {
        com.paypal.oslo.core.commonui.utils.RefText displayName;
        java.lang.String issuerProductDescription;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass productClass;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass productClass2;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage thumbnailImage;
        java.lang.String standardCardImage2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetail, "");
        java.lang.String nickName = cardDetail.getNickName();
        com.paypal.oslo.core.commonui.utils.RefText refText = null;
        if (nickName != null) {
            if (kotlin.text.StringsKt.isBlank(nickName)) {
                nickName = null;
            }
            if (nickName != null) {
                displayName = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(nickName);
            }
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer = cardDetail.getIssuer();
        if (issuer != null && (issuerProductDescription = issuer.getIssuerProductDescription()) != null) {
            if (kotlin.text.StringsKt.isBlank(issuerProductDescription)) {
                issuerProductDescription = null;
            }
            if (issuerProductDescription != null) {
                displayName = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(issuerProductDescription);
                com.paypal.oslo.core.commonui.utils.RefText refText2 = displayName;
                productClass = cardDetail.getProductClass();
                java.lang.String lastNChars = cardDetail.getLastNChars();
                switch (productClass != null ? -1 : com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItemKtKt.WhenMappings.$EnumSwitchMapping$1[productClass.ordinal()]) {
                    case -1:
                    case 6:
                    case 7:
                    case 8:
                        stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_card_masked, lastNChars);
                        break;
                    case 0:
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                    case 1:
                        stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_credit_masked, lastNChars);
                        break;
                    case 2:
                        stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_debit_masked, lastNChars);
                        break;
                    case 3:
                    case 4:
                        stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_prepaid_masked, lastNChars);
                        break;
                    case 5:
                        stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_gift_masked, lastNChars);
                        break;
                }
                cardArt = cardDetail.getCardArt();
                if (cardArt != null && (thumbnailImage = cardArt.getThumbnailImage()) != null && (standardCardImage2 = thumbnailImage.getStandardCardImage2()) != null) {
                    refText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(standardCardImage2);
                }
                com.paypal.oslo.core.commonui.utils.RefText refText3 = refText;
                com.paypal.pds.core.Icon.Card card = com.paypal.pds.core.Icon.Card.INSTANCE;
                productClass2 = cardDetail.getProductClass();
                java.lang.String lastNChars2 = cardDetail.getLastNChars();
                switch (productClass2 != null ? com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItemKtKt.WhenMappings.$EnumSwitchMapping$1[productClass2.ordinal()] : -1) {
                    case -1:
                    case 6:
                    case 7:
                    case 8:
                        stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_card_ending_in, lastNChars2);
                        break;
                    case 0:
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                    case 1:
                        stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_credit_ending_in, lastNChars2);
                        break;
                    case 2:
                        stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_debit_ending_in, lastNChars2);
                        break;
                    case 3:
                    case 4:
                        stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_prepaid_ending_in, lastNChars2);
                        break;
                    case 5:
                        stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_gift_card_ending_in, lastNChars2);
                        break;
                }
                return new com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItem(refText2, stringResourceRef, refText3, card, stringResourceRef2);
            }
        }
        displayName = cardDetail.getBrand().getDisplayName();
        com.paypal.oslo.core.commonui.utils.RefText refText22 = displayName;
        productClass = cardDetail.getProductClass();
        java.lang.String lastNChars3 = cardDetail.getLastNChars();
        switch (productClass != null ? -1 : com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItemKtKt.WhenMappings.$EnumSwitchMapping$1[productClass.ordinal()]) {
        }
        cardArt = cardDetail.getCardArt();
        if (cardArt != null) {
            refText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(standardCardImage2);
        }
        com.paypal.oslo.core.commonui.utils.RefText refText32 = refText;
        com.paypal.pds.core.Icon.Card card2 = com.paypal.pds.core.Icon.Card.INSTANCE;
        productClass2 = cardDetail.getProductClass();
        java.lang.String lastNChars22 = cardDetail.getLastNChars();
        switch (productClass2 != null ? com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItemKtKt.WhenMappings.$EnumSwitchMapping$1[productClass2.ordinal()] : -1) {
        }
        return new com.paypal.oslo.feature.wallet.me.ui.linked.LinkedItem(refText22, stringResourceRef, refText32, card2, stringResourceRef2);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CUSTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.NORMAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.values().length];
            try {
                iArr2[com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.CREDIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.DEBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.PREPAID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.PAYPAL_PREPAID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.GIFT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.MIXED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.TOKENIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.UNKNOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
