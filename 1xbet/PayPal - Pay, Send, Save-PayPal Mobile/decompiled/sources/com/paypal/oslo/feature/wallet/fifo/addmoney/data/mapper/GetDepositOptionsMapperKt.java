package com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError;", "toBalanceDepositSelectionError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionError;", "Lcom/paypal/oslo/feature/wallet/graphql/GetDepositOptionsQuery$DepositOptions;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionCategories;", "toBalanceDepositSelectionCategories", "(Lcom/paypal/oslo/feature/wallet/graphql/GetDepositOptionsQuery$DepositOptions;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionCategories;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;)Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "Lcom/paypal/oslo/api/graphql/schema/type/DepositType;", "toGraphQLDepositType", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;)Lcom/paypal/oslo/api/graphql/schema/type/DepositType;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;", "toGraphQLTransferSpeed", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DepositOptionsInput;", "toDepositOptionsGraphQLInput", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionRequest;)Lcom/paypal/oslo/api/graphql/schema/type/DepositOptionsInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetDepositOptionsMapperKt {
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError toBalanceDepositSelectionError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Network.NetworkFailure.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError.Business.Error(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.ErrorMapperKt.m21255getIssueGZgkXh4(graphQL.m11659getErrors1X0FAY()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x036b, code lost:
    
        if (r0 == null) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories toBalanceDepositSelectionCategories(com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.DepositOptions depositOptions) {
        com.paypal.oslo.feature.wallet.common.domain.model.Money money;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType;
        java.lang.Object obj;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument.Card card;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardInstitutionImage1 cardInstitutionImage1;
        java.lang.Object url;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.PrimaryImage1 primaryImage;
        java.lang.Object baseCdnLinkPath;
        com.paypal.oslo.api.graphql.schema.type.CardStatus value;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage1 bankAccountInstitutionImage1;
        java.lang.Object url2;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus value2;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Plan plan;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.PaymentDelivery paymentDelivery;
        com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed speed;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed2;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2;
        int i;
        java.util.ArrayList arrayList2;
        java.lang.String str;
        java.util.ArrayList arrayList3;
        java.lang.Object currencyCode;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument depositInstrument;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass2;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardInstitutionImage cardInstitutionImage;
        java.lang.Object url3;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage2;
        java.lang.Object baseCdnLinkPath2;
        com.paypal.oslo.api.graphql.schema.type.CardStatus value3;
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage bankAccountInstitutionImage;
        java.lang.Object url4;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus value4;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositOptions, "");
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.OnMoney onMoney = depositOptions.getAmount().getOnMoney();
        if (onMoney != null) {
            money = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney.getCurrencyCode().toString(), onMoney.getValue());
        } else {
            money = new com.paypal.oslo.feature.wallet.common.domain.model.Money("USD", "0.00");
        }
        com.paypal.oslo.feature.wallet.common.domain.model.Money money3 = money;
        com.paypal.oslo.api.graphql.schema.type.DepositType type = depositOptions.getType();
        int i2 = 2;
        int i3 = 1;
        if (type != null) {
            int i4 = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
            if (i4 == 1) {
                depositType = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.MANUAL_TOPUP;
            } else if (i4 == 2) {
                depositType = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.ADD_FUNDS;
            } else if (i4 == 3) {
                depositType = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.UNKNOWN;
            } else {
                depositType = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.UNKNOWN;
            }
        }
        depositType = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.MANUAL_TOPUP;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType2 = depositType;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Option> options = depositOptions.getOptions();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Option option : options) {
            int i5 = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.WhenMappings.$EnumSwitchMapping$2[option.getPlan().getPaymentDelivery().getSpeed().ordinal()];
            if (i5 == i3) {
                transferSpeed2 = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT;
            } else if (i5 == i2) {
                transferSpeed2 = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD;
            } else {
                transferSpeed2 = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD;
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed3 = transferSpeed2;
            com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.OnMoney2 onMoney2 = option.getPlan().getAmountsBreakdown().getTotalFee().getOnMoney();
            if (onMoney2 != null) {
                money2 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney2.getCurrencyCode().toString(), onMoney2.getValue());
            } else {
                money2 = new com.paypal.oslo.feature.wallet.common.domain.model.Money("USD", "0.00");
            }
            java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> tags = option.getTags();
            if (tags != null) {
                java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> list = tags;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.TransferTag) it.next()).getRawValue(), com.paypal.oslo.api.graphql.schema.type.TransferTag.MOST_RECENTLY_USED.toString())) {
                            i = i3;
                            break;
                        }
                    }
                }
            }
            i = 0;
            java.lang.String id = option.getPlan().getId();
            boolean z = (option.getPlan().isDefault() || i != 0) ? i3 : 0;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.FundingSource> fundingSources = option.getPlan().getFundingSources();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingSources, 10));
            for (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.FundingSource fundingSource : fundingSources) {
                java.lang.String rawValue = fundingSource.getType().getRawValue();
                com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Instrument instrument = fundingSource.getInstrument();
                if (instrument.getOnBankAccount() == null) {
                    if (instrument.getOnCard() == null) {
                        depositInstrument = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument.Unknown.INSTANCE;
                    } else {
                        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.OnCard onCard = instrument.getOnCard();
                        java.lang.String id2 = onCard.getId();
                        java.lang.String rawValue2 = onCard.getBrand().getRawValue();
                        java.lang.String lastNChars = onCard.getLastNChars();
                        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = onCard.getProductClass();
                        if (productClass == null || (cardProductClass2 = com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toDomain(productClass)) == null) {
                            cardProductClass2 = com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.UNKNOWN;
                        }
                        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass3 = cardProductClass2;
                        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardStatus cardStatus = onCard.getCardStatus();
                        java.lang.String rawValue3 = (cardStatus == null || (value3 = cardStatus.getValue()) == null) ? null : value3.getRawValue();
                        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardIssuer cardIssuer = onCard.getCardIssuer();
                        java.lang.String name2 = cardIssuer != null ? cardIssuer.getName() : null;
                        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardArt cardArt = onCard.getCardArt();
                        java.lang.String obj2 = (cardArt == null || (primaryImage2 = cardArt.getPrimaryImage()) == null || (baseCdnLinkPath2 = primaryImage2.getBaseCdnLinkPath()) == null) ? null : baseCdnLinkPath2.toString();
                        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardInstitutionImage> cardInstitutionImages = onCard.getCardInstitutionImages();
                        depositInstrument = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument.Card(id2, rawValue2, lastNChars, cardProductClass3, rawValue3, name2, obj2, (cardInstitutionImages == null || (cardInstitutionImage = (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardInstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) cardInstitutionImages)) == null || (url3 = cardInstitutionImage.getUrl()) == null) ? null : url3.toString(), onCard.getNickName());
                    }
                } else {
                    com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount = instrument.getOnBankAccount();
                    java.lang.String id3 = onBankAccount.getId();
                    com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(onBankAccount.getType());
                    java.lang.String lastNChars2 = onBankAccount.getLastNChars();
                    com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus = onBankAccount.getBankAccountStatus();
                    java.lang.String rawValue4 = (bankAccountStatus == null || (value4 = bankAccountStatus.getValue()) == null) ? null : value4.getRawValue();
                    java.lang.String name3 = onBankAccount.getBankAccountIssuer().getName();
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> bankAccountInstitutionImages = onBankAccount.getBankAccountInstitutionImages();
                    depositInstrument = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument.BankAccount(id3, highResolutionOutputSizeshNQ4ISI, lastNChars2, rawValue4, name3, (bankAccountInstitutionImages == null || (bankAccountInstitutionImage = (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) bankAccountInstitutionImages)) == null || (url4 = bankAccountInstitutionImage.getUrl()) == null) ? null : url4.toString(), onBankAccount.getNickname());
                }
                arrayList5.add(new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFundingSource(rawValue, depositInstrument));
            }
            java.util.ArrayList arrayList6 = arrayList5;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> tags2 = option.getTags();
            if (tags2 != null) {
                java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> list2 = tags2;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((com.paypal.oslo.api.graphql.schema.type.TransferTag) it2.next()).getRawValue());
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            java.util.List emptyList = arrayList2 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList2;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Limit> limits = option.getLimits();
            if (limits != null) {
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Limit> list3 = limits;
                java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Limit limit : list3) {
                    com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.OnMoney3 onMoney3 = limit.getAmount().getOnMoney();
                    java.lang.String rawValue5 = limit.getLimitType().getRawValue();
                    java.lang.String value5 = onMoney3 != null ? onMoney3.getValue() : null;
                    java.lang.String str3 = str2;
                    if (value5 != null) {
                        str2 = value5;
                    }
                    java.lang.String obj3 = (onMoney3 == null || (currencyCode = onMoney3.getCurrencyCode()) == null) ? null : currencyCode.toString();
                    if (obj3 == null) {
                        obj3 = str3;
                    }
                    arrayList8.add(new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositLimit(rawValue5, str2, obj3));
                    str2 = str3;
                }
                str = str2;
                arrayList3 = arrayList8;
            } else {
                str = str2;
                arrayList3 = null;
            }
            arrayList4.add(new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption(id, z, arrayList6, transferSpeed3, emptyList, arrayList3 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList3, money2));
            str2 = str;
            i2 = 2;
            i3 = 1;
        }
        java.util.ArrayList arrayList9 = arrayList4;
        java.util.Iterator<T> it3 = depositOptions.getOptions().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> tags3 = ((com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Option) obj).getTags();
            if (tags3 != null && tags3.contains(com.paypal.oslo.api.graphql.schema.type.TransferTag.MOST_RECENTLY_USED)) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Option option2 = (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.Option) obj;
        if (option2 != null && (plan = option2.getPlan()) != null && (paymentDelivery = plan.getPaymentDelivery()) != null && (speed = paymentDelivery.getSpeed()) != null) {
            int i6 = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.WhenMappings.$EnumSwitchMapping$2[speed.ordinal()];
            if (i6 == 1) {
                transferSpeed = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT;
            } else if (i6 == 2) {
                transferSpeed = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD;
            } else {
                transferSpeed = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD;
            }
        }
        transferSpeed = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed4 = transferSpeed;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.IneligibleInstrument> ineligibleInstruments = depositOptions.getIneligibleInstruments();
        if (ineligibleInstruments != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.IneligibleInstrument ineligibleInstrument : ineligibleInstruments) {
                if (ineligibleInstrument.getOnBankAccount() == null) {
                    if (ineligibleInstrument.getOnCard() != null) {
                        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.OnCard1 onCard2 = ineligibleInstrument.getOnCard();
                        java.lang.String id4 = onCard2.getId();
                        java.lang.String rawValue6 = onCard2.getBrand().getRawValue();
                        java.lang.String lastNChars3 = onCard2.getLastNChars();
                        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass2 = onCard2.getProductClass();
                        if (productClass2 == null || (cardProductClass = com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toDomain(productClass2)) == null) {
                            cardProductClass = com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.UNKNOWN;
                        }
                        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass4 = cardProductClass;
                        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardStatus1 cardStatus2 = onCard2.getCardStatus();
                        java.lang.String rawValue7 = (cardStatus2 == null || (value = cardStatus2.getValue()) == null) ? null : value.getRawValue();
                        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardIssuer1 cardIssuer2 = onCard2.getCardIssuer();
                        java.lang.String name4 = cardIssuer2 != null ? cardIssuer2.getName() : null;
                        com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardArt1 cardArt2 = onCard2.getCardArt();
                        java.lang.String obj4 = (cardArt2 == null || (primaryImage = cardArt2.getPrimaryImage()) == null || (baseCdnLinkPath = primaryImage.getBaseCdnLinkPath()) == null) ? null : baseCdnLinkPath.toString();
                        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardInstitutionImage1> cardInstitutionImages2 = onCard2.getCardInstitutionImages();
                        card = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument.Card(id4, rawValue6, lastNChars3, cardProductClass4, rawValue7, name4, obj4, (cardInstitutionImages2 == null || (cardInstitutionImage1 = (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.CardInstitutionImage1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) cardInstitutionImages2)) == null || (url = cardInstitutionImage1.getUrl()) == null) ? null : url.toString(), onCard2.getNickName());
                    } else {
                        card = null;
                    }
                } else {
                    com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.OnBankAccount1 onBankAccount2 = ineligibleInstrument.getOnBankAccount();
                    java.lang.String id5 = onBankAccount2.getId();
                    com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(onBankAccount2.getType());
                    java.lang.String lastNChars4 = onBankAccount2.getLastNChars();
                    com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.BankAccountStatus1 bankAccountStatus2 = onBankAccount2.getBankAccountStatus();
                    java.lang.String rawValue8 = (bankAccountStatus2 == null || (value2 = bankAccountStatus2.getValue()) == null) ? null : value2.getRawValue();
                    java.lang.String name5 = onBankAccount2.getBankAccountIssuer().getName();
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage1> bankAccountInstitutionImages2 = onBankAccount2.getBankAccountInstitutionImages();
                    card = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument.BankAccount(id5, highResolutionOutputSizeshNQ4ISI2, lastNChars4, rawValue8, name5, (bankAccountInstitutionImages2 == null || (bankAccountInstitutionImage1 = (com.paypal.oslo.feature.wallet.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) bankAccountInstitutionImages2)) == null || (url2 = bankAccountInstitutionImage1.getUrl()) == null) ? null : url2.toString(), onBankAccount2.getNickname());
                }
                if (card != null) {
                    arrayList10.add(card);
                }
            }
            arrayList = arrayList10;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories(money3, depositType2, arrayList9, null, transferSpeed4, arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList, 8, null);
    }

    private static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType) {
        int i = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[bankAccountType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped BankAccountType encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlType", bankAccountType.toString())), null, 4, null);
        return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.DepositType toGraphQLDepositType(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositType, "");
        int i = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.WhenMappings.$EnumSwitchMapping$3[depositType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.DepositType.MANUAL_TOPUP;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.DepositType.ADD_FUNDS;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.DepositType.UNKNOWN__;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed toGraphQLTransferSpeed(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        int i = com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.GetDepositOptionsMapperKt.WhenMappings.$EnumSwitchMapping$4[transferSpeed.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.INSTANT;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.STANDARD;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput toDepositOptionsGraphQLInput(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest balanceDepositSelectionRequest) {
        com.paypal.oslo.api.graphql.schema.type.DepositType depositType;
        com.apollographql.apollo.api.Optional optional;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDepositSelectionRequest, "");
        com.paypal.oslo.api.graphql.schema.type.CurrencyInput currencyInput = new com.paypal.oslo.api.graphql.schema.type.CurrencyInput(new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(balanceDepositSelectionRequest.getDepositAmount().getCurrencyCode(), balanceDepositSelectionRequest.getDepositAmount().getValue())), null, null, 6, null);
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType2 = balanceDepositSelectionRequest.getDepositType();
        if (depositType2 == null || (depositType = toGraphQLDepositType(depositType2)) == null) {
            depositType = com.paypal.oslo.api.graphql.schema.type.DepositType.ADD_FUNDS;
        }
        com.paypal.oslo.api.graphql.schema.type.DepositType depositType3 = depositType;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed = balanceDepositSelectionRequest.getTransferSpeed();
        if (transferSpeed != null) {
            optional = new com.apollographql.apollo.api.Optional.Present(toGraphQLTransferSpeed(transferSpeed));
        } else {
            optional = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        return new com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput(currencyInput, depositType3, optional, null, null, new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.TransferFlowContextInput(null, new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.ProductFlowInput(com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.CONSUMER_TRANSFERS, null, new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.api.graphql.schema.type.TransferChannel.MOBILE), 2, null)), null, null, null, 29, null)), null, 88, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.DepositType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.DepositType.MANUAL_TOPUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.DepositType.ADD_FUNDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.DepositType.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.INSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.values().length];
            try {
                iArr4[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.MANUAL_TOPUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.ADD_FUNDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.values().length];
            try {
                iArr5[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr5[com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }
}
