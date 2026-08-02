package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n*\u00060\bj\u0002`\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBankAccountComponent;", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedBanksProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBankAccountComponent;)Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedBanksProduct;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item3;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "asBankAccount", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item3;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "asBankAccountType", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;)Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$InstitutionImage;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankImage;", "asBankImage", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$InstitutionImage;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankImage;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BankAccountComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBankAccountComponent onBankAccountComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBankAccountComponent, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Wallet2 wallet = onBankAccountComponent.getWallet();
        if (wallet == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item3> items = wallet.getBankAccounts().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(asBankAccount((com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item3) it.next()));
        }
        return new com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedBanksProduct(true, arrayList);
    }

    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount asBankAccount(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item3 item3) {
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.InstitutionImage institutionImage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item3, "");
        java.lang.String id = item3.getId();
        java.lang.String nickname = item3.getNickname();
        java.lang.String name2 = (nickname == null || nickname.length() == 0) ? item3.getIssuer().getName() : item3.getNickname();
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType asBankAccountType = asBankAccountType(item3.getType());
        java.lang.String lastNChars = item3.getLastNChars();
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.InstitutionImage> institutionImages = item3.getInstitutionImages();
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount(id, name2, asBankAccountType, lastNChars, (institutionImages == null || (institutionImage = (com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.InstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages)) == null) ? null : asBankImage(institutionImage), (java.lang.String) null, (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmationDetails) null, 96, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType asBankAccountType(com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        switch (com.paypal.oslo.feature.wallet.me.data.repository.BankAccountComponentMapperKtKt.WhenMappings.$EnumSwitchMapping$0[bankAccountType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_CHECKING;
            case 2:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_SAVINGS;
            case 3:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
            case 4:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CUSTOM;
            case 5:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.NORMAL;
            case 6:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS;
            default:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN;
        }
    }

    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankImage asBankImage(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.InstitutionImage institutionImage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutionImage, "");
        if (institutionImage.getUrl() == null) {
            return null;
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankImage(institutionImage.getUrl().toString(), "", "");
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CUSTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.NORMAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
