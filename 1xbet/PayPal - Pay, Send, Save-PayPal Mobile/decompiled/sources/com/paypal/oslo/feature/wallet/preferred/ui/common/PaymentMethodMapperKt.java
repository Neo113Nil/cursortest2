package com.paypal.oslo.feature.wallet.preferred.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u0004\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\b\u001a-\u0010\u0013\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;", "bank", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "resolveBankDisplayName", "(Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;", "card", "resolveCardDisplayName", "(Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "resolveBankRawName", "(Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;)Ljava/lang/String;", "resolveCardRawName", "(Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;)Ljava/lang/String;", "resolveBankSecondaryText", "resolveCardSecondaryText", "name", "type", "lastNChars", "buildDisplayName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentMethodMapperKt {
    public static final com.paypal.oslo.core.commonui.utils.RefText resolveBankDisplayName(com.paypal.oslo.feature.wallet.common.model.BankAccountInfo bankAccountInfo) {
        com.paypal.oslo.core.commonui.utils.RefText stringRef;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountInfo, "");
        java.lang.String nickname = bankAccountInfo.getNickname();
        if (nickname == null) {
            nickname = bankAccountInfo.getIssuerName();
        }
        return (nickname == null || (stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(nickname)) == null) ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_bank_account, new java.lang.Object[0]) : stringRef;
    }

    public static final com.paypal.oslo.core.commonui.utils.RefText resolveCardDisplayName(com.paypal.oslo.feature.wallet.common.model.CardInfo cardInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
        java.lang.String nickName = cardInfo.getNickName();
        if (nickName == null) {
            nickName = cardInfo.getIssuerProductDescription();
        }
        if (nickName != null) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(nickName);
        }
        java.lang.String brand = cardInfo.getBrand();
        if (brand != null) {
            com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand fromName = com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.INSTANCE.fromName(brand);
            if (fromName == com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.UNKNOWN) {
                fromName = null;
            }
            com.paypal.oslo.core.commonui.utils.RefText displayName = fromName != null ? fromName.getDisplayName() : null;
            if (displayName != null) {
                return displayName;
            }
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_card, new java.lang.Object[0]);
    }

    public static final java.lang.String resolveBankRawName(com.paypal.oslo.feature.wallet.common.model.BankAccountInfo bankAccountInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountInfo, "");
        java.lang.String nickname = bankAccountInfo.getNickname();
        return nickname == null ? bankAccountInfo.getIssuerName() : nickname;
    }

    public static final java.lang.String resolveCardRawName(com.paypal.oslo.feature.wallet.common.model.CardInfo cardInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
        java.lang.String nickName = cardInfo.getNickName();
        return nickName == null ? cardInfo.getIssuerProductDescription() : nickName;
    }

    public static final com.paypal.oslo.core.commonui.utils.RefText resolveBankSecondaryText(com.paypal.oslo.feature.wallet.common.model.BankAccountInfo bankAccountInfo) {
        com.paypal.oslo.core.commonui.utils.RefText bankTypeResourceRef;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountInfo, "");
        java.lang.String type = bankAccountInfo.getType();
        return (type == null || (bankTypeResourceRef = com.paypal.oslo.feature.wallet.common.util.FundingInstrumentRefTextMapperKt.bankTypeResourceRef(type)) == null) ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_account, new java.lang.Object[0]) : bankTypeResourceRef;
    }

    public static final com.paypal.oslo.core.commonui.utils.RefText resolveCardSecondaryText(com.paypal.oslo.feature.wallet.common.model.CardInfo cardInfo) {
        com.paypal.oslo.core.commonui.utils.RefText cardProductClassResourceRef;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
        java.lang.String productClass = cardInfo.getProductClass();
        return (productClass == null || (cardProductClassResourceRef = com.paypal.oslo.feature.wallet.common.util.FundingInstrumentRefTextMapperKt.cardProductClassResourceRef(productClass)) == null) ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_card, new java.lang.Object[0]) : cardProductClassResourceRef;
    }

    public static final java.lang.String buildDisplayName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        if (str2 != null) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(str2);
        }
        if (str3 != null) {
            sb.append(" •••".concat(java.lang.String.valueOf(str3)));
        }
        return sb.toString();
    }
}
