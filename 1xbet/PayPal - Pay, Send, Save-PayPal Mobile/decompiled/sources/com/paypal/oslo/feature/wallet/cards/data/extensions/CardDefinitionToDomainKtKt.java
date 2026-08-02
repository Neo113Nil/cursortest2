package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\u0002\u0010\f\u001a\u0013\u0010\u0002\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u0002\u0010\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0002\u0010\u0012\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "toDomain", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$Logo;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage;", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$Logo;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage;", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$Capability;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardCapability;", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$Capability;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardCapability;", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$Operation;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperation;", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$Operation;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperation;", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$InputParameter;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationParameter;", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$InputParameter;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationParameter;", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$Policy;", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardPolicy;", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardDefinitionFragment$Policy;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardPolicy;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;", "toCardOperationName", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationName;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDefinitionToDomainKtKt {
    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment walletCardDefinitionFragment) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardDefinitionFragment, "");
        java.util.List<com.paypal.oslo.api.graphql.schema.type.CardProductClass> cardClassification = walletCardDefinitionFragment.getCardClassification();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(cardClassification, 10));
        java.util.Iterator<T> it = cardClassification.iterator();
        while (it.hasNext()) {
            arrayList4.add(com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toDomain((com.paypal.oslo.api.graphql.schema.type.CardProductClass) it.next()));
        }
        java.util.ArrayList arrayList5 = arrayList4;
        java.lang.Object userCountryCode = walletCardDefinitionFragment.getUserCountryCode();
        java.util.ArrayList arrayList6 = null;
        java.lang.String obj = userCountryCode != null ? userCountryCode.toString() : null;
        java.lang.Object issuerCountryCode = walletCardDefinitionFragment.getIssuerCountryCode();
        java.lang.String obj2 = issuerCountryCode != null ? issuerCountryCode.toString() : null;
        java.lang.Object currencyCode = walletCardDefinitionFragment.getCurrencyCode();
        java.lang.String obj3 = currencyCode != null ? currencyCode.toString() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand domain = com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDomainKtKt.toDomain(walletCardDefinitionFragment.getBrand());
        java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Issuer> issuers = walletCardDefinitionFragment.getIssuers();
        if (issuers != null) {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Issuer> list = issuers;
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList7.add(com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(((com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Issuer) it2.next()).getWalletCardIssuerFragment()));
            }
            arrayList = arrayList7;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Logo logo = walletCardDefinitionFragment.getLogo();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage domain2 = logo != null ? toDomain(logo) : null;
        java.lang.String bin = walletCardDefinitionFragment.getBin();
        java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Capability> capabilities = walletCardDefinitionFragment.getCapabilities();
        if (capabilities != null) {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Capability> list2 = capabilities;
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList8.add(toDomain((com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Capability) it3.next()));
            }
            arrayList2 = arrayList8;
        } else {
            arrayList2 = null;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Operation> operations = walletCardDefinitionFragment.getOperations();
        if (operations != null) {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Operation> list3 = operations;
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList9.add(toDomain((com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Operation) it4.next()));
            }
            arrayList3 = arrayList9;
        } else {
            arrayList3 = null;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Policy> policies = walletCardDefinitionFragment.getPolicies();
        if (policies != null) {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Policy> list4 = policies;
            java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            java.util.Iterator<T> it5 = list4.iterator();
            while (it5.hasNext()) {
                arrayList10.add(toDomain((com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Policy) it5.next()));
            }
            arrayList6 = arrayList10;
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition(arrayList5, obj, obj2, obj3, domain, arrayList, domain2, bin, arrayList2, arrayList3, arrayList6, walletCardDefinitionFragment.getNumberGroupingPattern());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Logo logo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logo, "");
        java.lang.Object baseCdnLinkPath = logo.getBaseCdnLinkPath();
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage(baseCdnLinkPath != null ? baseCdnLinkPath.toString() : null, logo.getMimeType(), logo.getHeight(), logo.getWidth());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardCapability toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Capability capability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capability, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.model.CardCapability(capability.getName(), capability.getMode());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Operation operation) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName = toCardOperationName(operation.getOperationName().name());
        java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.InputParameter> inputParameters = operation.getInputParameters();
        if (inputParameters != null) {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.InputParameter> list = inputParameters;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toDomain((com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.InputParameter) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.model.CardOperation(cardOperationName, arrayList);
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.InputParameter inputParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputParameter, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter(inputParameter.getName(), inputParameter.getMinimumLength(), inputParameter.getMaximumLength(), inputParameter.getRegex(), inputParameter.getRequired(), inputParameter.getLabelKey(), inputParameter.getGroup());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardPolicy toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardDefinitionFragment.Policy policy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policy, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.model.CardPolicy(policy.getName(), policy.getValue(), policy.getDescription());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName toCardOperationName(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName) obj).name(), str, true)) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName cardOperationName = (com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName) obj;
        return cardOperationName == null ? com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationName.UNKNOWN : cardOperationName;
    }
}
