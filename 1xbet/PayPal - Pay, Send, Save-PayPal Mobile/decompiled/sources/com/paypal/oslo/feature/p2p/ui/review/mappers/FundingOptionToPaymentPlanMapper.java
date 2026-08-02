package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/FundingOptionToPaymentPlanMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/DisclosureToPlanDisclosureInfoMapper;", "disclosureMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/mappers/DisclosureToPlanDisclosureInfoMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;)Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSource;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;)Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSource;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/DisclosureToPlanDisclosureInfoMapper;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FundingOptionToPaymentPlanMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.domain.model.FundingOption, com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> {
    public static final int $stable = 0;

    @java.lang.Deprecated
    public static final java.lang.String BRAND_AMERICAN_EXPRESS = "americanexpress";

    @java.lang.Deprecated
    public static final java.lang.String BRAND_AMEX = "amex";

    @java.lang.Deprecated
    public static final java.lang.String BRAND_DISCOVER = "discover";

    @java.lang.Deprecated
    public static final java.lang.String BRAND_MASTERCARD = "mastercard";

    @java.lang.Deprecated
    public static final java.lang.String BRAND_VISA = "visa";
    private static final com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.Companion Companion = new com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String LOGO_URL_AMEX = "https://www.paypalobjects.com/webstatic/wallet/bankscards/img-fi-amex-small.png";

    @java.lang.Deprecated
    public static final java.lang.String LOGO_URL_BANK = "https://www.paypalobjects.com/ui-web/money-icons/bank/generic_bank.png";

    @java.lang.Deprecated
    public static final java.lang.String LOGO_URL_DISCOVER = "https://www.paypalobjects.com/webstatic/wallet/bankscards/img-fi-discover-small.png";

    @java.lang.Deprecated
    public static final java.lang.String LOGO_URL_GENERIC_CARD = "https://www.paypalobjects.com/webstatic/wallet/bankscards/img-fi-generic-small.png";

    @java.lang.Deprecated
    public static final java.lang.String LOGO_URL_MASTERCARD = "https://www.paypalobjects.com/webstatic/wallet/bankscards/img-fi-mastercard-small.png";

    @java.lang.Deprecated
    public static final java.lang.String LOGO_URL_PAYPAL = "https://www.paypalobjects.com/dp/wallet/pp_balance_large.png";

    @java.lang.Deprecated
    public static final java.lang.String LOGO_URL_VISA = "https://www.paypalobjects.com/webstatic/wallet/bankscards/img-fi-visa-small.png";
    private final com.paypal.oslo.feature.p2p.ui.review.mappers.DisclosureToPlanDisclosureInfoMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FundingOptionToPaymentPlanMapper(com.paypal.oslo.feature.p2p.ui.review.mappers.DisclosureToPlanDisclosureInfoMapper disclosureToPlanDisclosureInfoMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disclosureToPlanDisclosureInfoMapper, "");
        this.getHighSpeedVideoFpsRangesFor = disclosureToPlanDisclosureInfoMapper;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan map(com.paypal.oslo.feature.p2p.domain.model.FundingOption input) {
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery paymentDelivery;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed transferSpeed;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String id = input.getId();
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> fundingSources = input.getFundingSources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingSources, 10));
        java.util.Iterator<T> it = fundingSources.iterator();
        while (it.hasNext()) {
            arrayList2.add(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.p2p.domain.model.FundingSource) it.next()));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingSource> backupFundingSources = input.getBackupFundingSources();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(backupFundingSources, 10));
        java.util.Iterator<T> it2 = backupFundingSources.iterator();
        while (it2.hasNext()) {
            arrayList4.add(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.p2p.domain.model.FundingSource) it2.next()));
        }
        java.util.ArrayList arrayList5 = arrayList4;
        com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown amountsBreakdown = input.getAmountsBreakdown();
        com.paypal.oslo.feature.p2p.domain.model.Amount totalAmountSent = amountsBreakdown.getSender().getTotalAmountSent();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(totalAmountSent.getCurrencyCode(), totalAmountSent.getAmount());
        com.paypal.oslo.feature.p2p.domain.model.Amount amountSent = amountsBreakdown.getSender().getAmountSent();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat2 = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(amountSent.getCurrencyCode(), amountSent.getAmount());
        com.paypal.oslo.feature.p2p.domain.model.Amount totalFee = amountsBreakdown.getSender().getTotalFee();
        com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown2 = new com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown(fiat, fiat2, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(totalFee.getCurrencyCode(), totalFee.getAmount()), null, 8, null);
        boolean isDefault = input.isDefault();
        com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery2 = input.getPaymentDelivery();
        if (paymentDelivery2 != null) {
            int i = com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.WhenMappings.$EnumSwitchMapping$1[paymentDelivery2.getSpeed().ordinal()];
            if (i == 1) {
                transferSpeed = com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.INSTANT;
            } else if (i == 2) {
                transferSpeed = com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.STANDARD;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                transferSpeed = com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.DEFERRED;
            }
            paymentDelivery = new com.paypal.oslo.feature.moneymovement.api.domain.PaymentDelivery(transferSpeed, paymentDelivery2.getMinimumDuration(), paymentDelivery2.getMaximumDuration(), paymentDelivery2.getEstimatedArrivalTime(), null);
        } else {
            paymentDelivery = null;
        }
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures = input.getDisclosures();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.Object obj : disclosures) {
            if (!com.paypal.oslo.feature.p2p.domain.model.Disclosure.INSTANCE.getPAYMENT_LINK_TYPENAMES().contains(((com.paypal.oslo.feature.p2p.domain.model.Disclosure) obj).getType())) {
                arrayList6.add(obj);
            }
        }
        java.util.ArrayList arrayList7 = arrayList6;
        if (arrayList7.isEmpty()) {
            arrayList7 = null;
        }
        if (arrayList7 != null) {
            java.util.ArrayList arrayList8 = arrayList7;
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
            java.util.Iterator it3 = arrayList8.iterator();
            while (it3.hasNext()) {
                arrayList9.add(this.getHighSpeedVideoFpsRangesFor.map((com.paypal.oslo.feature.p2p.domain.model.Disclosure) it3.next()));
            }
            arrayList = arrayList9;
        } else {
            arrayList = null;
        }
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> contingencies = input.getContingencies();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        for (java.lang.Object obj2 : contingencies) {
            com.paypal.oslo.feature.p2p.domain.model.PlanContingency planContingency = (com.paypal.oslo.feature.p2p.domain.model.PlanContingency) obj2;
            if (planContingency.getAction() == com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.CARD_VERIFICATION_DATA_COLLECTION_REQUIRED && planContingency.getStatus() == com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.UNRESOLVED) {
                arrayList10.add(obj2);
            }
        }
        java.util.ArrayList<com.paypal.oslo.feature.p2p.domain.model.PlanContingency> arrayList11 = arrayList10;
        java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
        for (com.paypal.oslo.feature.p2p.domain.model.PlanContingency planContingency2 : arrayList11) {
            com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyAction planContingencyAction = com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyAction.CARD_VERIFICATION_DATA_COLLECTION_REQUIRED;
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails details = planContingency2.getDetails();
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection cardVerificationDataCollection = details instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection ? (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection) details : null;
            arrayList12.add(new com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo(planContingencyAction, cardVerificationDataCollection != null ? cardVerificationDataCollection.getCvvLength() : null));
        }
        java.util.ArrayList arrayList13 = arrayList12;
        return new com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan(id, arrayList3, arrayList5, amountsBreakdown2, isDefault, paymentDelivery, null, arrayList13.isEmpty() ? null : arrayList13, arrayList, 64, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r8.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_AMEX) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        r6 = com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.LOGO_URL_AMEX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r8.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_AMERICAN_EXPRESS) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        if (r6 == null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.paypal.oslo.feature.moneymovement.api.domain.FundingSource getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource) {
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType;
        java.lang.String str;
        java.lang.String str2;
        int i = com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.WhenMappings.$EnumSwitchMapping$0[fundingSource.getType().ordinal()];
        if (i == 1) {
            fundingSourceType = com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.BALANCE;
        } else if (i == 2) {
            fundingSourceType = com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.BANK;
        } else if (i == 3) {
            fundingSourceType = com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.CARD;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            fundingSourceType = com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.CREDIT;
        }
        com.paypal.oslo.feature.p2p.domain.model.Amount amount = fundingSource.getAmount();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(amount.getCurrencyCode(), amount.getAmount());
        java.lang.String id = fundingSource.getId();
        com.paypal.oslo.feature.p2p.domain.model.FundingSourceType type = fundingSource.getType();
        java.lang.String brand = fundingSource.getBrand();
        int i2 = com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            str = LOGO_URL_PAYPAL;
        } else if (i2 == 2) {
            str = LOGO_URL_BANK;
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = LOGO_URL_GENERIC_CARD;
            if (brand != null) {
                java.util.Locale locale = java.util.Locale.ROOT;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = brand.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                java.lang.String replace$default = kotlin.text.StringsKt.replace$default(lowerCase, " ", "", false, 4, (java.lang.Object) null);
                switch (replace$default.hashCode()) {
                    case -2038717326:
                        if (replace$default.equals(BRAND_MASTERCARD)) {
                            str = LOGO_URL_MASTERCARD;
                            break;
                        }
                        break;
                    case -885176496:
                        break;
                    case 2997727:
                        break;
                    case 3619905:
                        if (replace$default.equals(BRAND_VISA)) {
                            str = LOGO_URL_VISA;
                            break;
                        }
                        break;
                    case 273184745:
                        if (replace$default.equals(BRAND_DISCOVER)) {
                            str = LOGO_URL_DISCOVER;
                            break;
                        }
                        break;
                }
            }
        }
        java.lang.String str3 = str;
        java.lang.String nickname = fundingSource.getNickname();
        if (nickname != null) {
            if (kotlin.text.StringsKt.isBlank(nickname)) {
                nickname = null;
            }
        }
        nickname = fundingSource.getIssuerName();
        if (nickname == null || kotlin.text.StringsKt.isBlank(nickname)) {
            nickname = null;
        }
        if (nickname == null) {
            int i3 = com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.WhenMappings.$EnumSwitchMapping$0[fundingSource.getType().ordinal()];
            if (i3 == 1) {
                str2 = "PayPal Balance";
            } else if (i3 == 2) {
                str2 = "Bank Account";
            } else if (i3 == 3) {
                str2 = "Debit Card";
            } else {
                if (i3 != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str2 = "Credit Card";
            }
            java.lang.String lastNChars = fundingSource.getLastNChars();
            java.lang.String concat = lastNChars == null ? com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.SSN_MASK_CHAR.concat(java.lang.String.valueOf(lastNChars)) : null;
            java.lang.String value = fundingSource.getValue();
            return new com.paypal.oslo.feature.moneymovement.api.domain.FundingSource(fundingSourceType, fiat, new com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument(id, str3, str2, concat, value == null ? com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(fundingSource.getAmount().getCurrencyCode(), value) : null));
        }
        str2 = nickname;
        java.lang.String lastNChars2 = fundingSource.getLastNChars();
        if (lastNChars2 == null) {
        }
        java.lang.String value2 = fundingSource.getValue();
        return new com.paypal.oslo.feature.moneymovement.api.domain.FundingSource(fundingSourceType, fiat, new com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument(id, str3, str2, concat, value2 == null ? com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(fundingSource.getAmount().getCurrencyCode(), value2) : null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/FundingOptionToPaymentPlanMapper$Companion;", "", "<init>", "()V", "", "BRAND_VISA", "Ljava/lang/String;", "BRAND_MASTERCARD", "BRAND_AMEX", "BRAND_AMERICAN_EXPRESS", "BRAND_DISCOVER", "LOGO_URL_PAYPAL", "LOGO_URL_VISA", "LOGO_URL_MASTERCARD", "LOGO_URL_AMEX", "LOGO_URL_DISCOVER", "LOGO_URL_GENERIC_CARD", "LOGO_URL_BANK"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.FundingSourceType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.FundingSourceType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.FundingSourceType.BANK_ACCOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.FundingSourceType.DEBIT_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.FundingSourceType.CREDIT_CARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.values().length];
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.INSTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.DEFERRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
