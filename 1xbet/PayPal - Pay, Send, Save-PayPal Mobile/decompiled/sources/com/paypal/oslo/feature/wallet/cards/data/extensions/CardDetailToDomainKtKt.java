package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\bH\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u001d\u0010\u0002\u001a\u00020\f*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\r\u001a\u001d\u0010\u0002\u001a\u00020\u0010*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardDetailQuery$Card;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "toDomain", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardDetailQuery$Card;)Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;", "toCardProductClass", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "(Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;)Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardDetailQuery$BillingAddress;", "addressId", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletCardDetailQuery$BillingAddress;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "reason", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetailError;", "toCardDetailError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetailError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDetailToDomainKtKt {
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail toDomain(com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.Card card) {
        java.util.List emptyList;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment = card.getWalletCardBasicInfoFragment();
        java.lang.String id = walletCardBasicInfoFragment.getId();
        java.lang.String lastNChars = walletCardBasicInfoFragment.getLastNChars();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand domain = com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDomainKtKt.toDomain(walletCardBasicInfoFragment.getBrand());
        com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.Issuer issuer = card.getIssuer();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer domain2 = (issuer == null || (walletCardIssuerFragment = issuer.getWalletCardIssuerFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardIssuerFragment);
        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = walletCardBasicInfoFragment.getProductClass();
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass domain3 = productClass != null ? toDomain(productClass) : null;
        java.lang.Object expirationDate = walletCardBasicInfoFragment.getExpirationDate();
        java.lang.String obj = expirationDate != null ? expirationDate.toString() : null;
        com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.CardArt cardArt = card.getCardArt();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt domain4 = (cardArt == null || (walletCardArtFragment = cardArt.getWalletCardArtFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardArtFragment);
        java.lang.String nickName = walletCardBasicInfoFragment.getNickName();
        com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.BillingAddress billingAddress = card.getBillingAddress();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress domain5 = billingAddress != null ? toDomain(billingAddress, card.getAddressId()) : null;
        java.lang.Object currencyCode = walletCardBasicInfoFragment.getCurrencyCode();
        java.lang.String obj2 = currencyCode != null ? currencyCode.toString() : null;
        com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.Status status = card.getStatus();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus domain6 = (status == null || (walletCardStatusInfoFragment = status.getWalletCardStatusInfoFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardStatusInfoFragment);
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.InstitutionImage> institutionImages = card.getInstitutionImages();
        if (institutionImages == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.InstitutionImage> list = institutionImages;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(((com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.InstitutionImage) it.next()).getWalletInstitutionImageFragment()));
            }
            emptyList = arrayList;
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail(id, lastNChars, domain, domain2, domain3, obj, domain4, nickName, domain5, obj2, domain6, emptyList);
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass toCardProductClass(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass) obj).name(), str, true)) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass = (com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass) obj;
        return cardProductClass == null ? com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.UNKNOWN : cardProductClass;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass toDomain(com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProductClass, "");
        return toCardProductClass(cardProductClass.name());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress toDomain(com.paypal.oslo.feature.wallet.graphql.GetWalletCardDetailQuery.BillingAddress billingAddress, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
        return com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(billingAddress.getWalletBillingAddressFragment(), str);
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus toDomain(com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStatus, "");
        switch (com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.WhenMappings.$EnumSwitchMapping$0[cardStatus.ordinal()]) {
            case 1:
                return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Active(str);
            case 2:
                return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Inactive(str);
            case 3:
                return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.OnHold(str);
            case 4:
                return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Blocked(str);
            case 5:
                return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Removed(str);
            case 6:
                return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Actionable(str);
            default:
                return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Unknown(str);
        }
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError toCardDetailError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()))).getExtensions();
        java.lang.Object obj = extensions != null ? extensions.get("code") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "INVALID_CARD_ID") ? com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError.InvalidCardId.INSTANCE : kotlin.jvm.internal.Intrinsics.areEqual(str, "CARD_NOT_FOUND") ? com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError.DataNotFound.INSTANCE : new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError.Server(graphQL.m11659getErrors1X0FAY(), ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()))).getMessage(), null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CardStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardStatus.INACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardStatus.ON_HOLD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardStatus.BLOCKED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardStatus.REMOVED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CardStatus.ACTIONABLE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
