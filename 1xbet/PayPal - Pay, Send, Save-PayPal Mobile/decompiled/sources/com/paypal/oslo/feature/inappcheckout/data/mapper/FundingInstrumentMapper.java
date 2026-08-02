package com.paypal.oslo.feature.inappcheckout.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingInstrumentMapper;", "", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "contingencyMapper", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;)V", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingInstrumentDTO;", "fundingInstrumentDTO", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "map", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingInstrumentDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingConfigDTO;", "configDTO", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionConfig;", "mapConfigFromDTO", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingConfigDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionConfig;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FundingInstrumentMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FundingInstrumentMapper(com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = contingencyMapper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument map(com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO fundingInstrumentDTO) {
        java.util.ArrayList arrayList;
        java.util.ArrayList listOf;
        com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer creditOffer;
        java.util.List<java.lang.String> disallowedReasons;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentDTO, "");
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO contingency = fundingInstrumentDTO.getContingency();
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity map = contingency != null ? this.getHighResolutionOutputSizeshNQ4ISI.map(contingency) : null;
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> instrumentLevelContingencies = fundingInstrumentDTO.getInstrumentLevelContingencies();
        if (instrumentLevelContingencies != null) {
            java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> list = instrumentLevelContingencies;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.getHighResolutionOutputSizeshNQ4ISI.map((com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.Companion companion = com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.INSTANCE;
        com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO usability = fundingInstrumentDTO.getUsability();
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus valueFrom = companion.valueFrom(usability != null ? usability.getStatus() : null);
        boolean z = map instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.ThreeDsContingency;
        if (z || (map instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.UserConsentForBankAccountInfoContingency) || (map instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.BankAccountBalanceRequiredContingency) || (map instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency)) {
            valueFrom = com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.DISALLOWED;
        }
        if (z || (map instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.UserConsentForBankAccountInfoContingency) || (map instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.BankAccountBalanceRequiredContingency) || (map instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentLevelUnknownContingency)) {
            listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.UNKNOWN__);
        } else {
            com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO usability2 = fundingInstrumentDTO.getUsability();
            if (usability2 == null || (disallowedReasons = usability2.getDisallowedReasons()) == null) {
                listOf = null;
            } else {
                java.util.List<java.lang.String> list2 = disallowedReasons;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.INSTANCE.valueFrom((java.lang.String) it2.next()));
                }
                listOf = arrayList3;
            }
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability fundingSelectionUsability = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability(valueFrom, listOf);
        com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO creditOffer2 = fundingInstrumentDTO.getCreditOffer();
        if (creditOffer2 != null) {
            java.lang.String text1 = creditOffer2.getText1();
            if (text1 == null) {
                text1 = "";
            }
            java.lang.String text2 = creditOffer2.getText2();
            if (text2 == null) {
                text2 = "";
            }
            java.lang.String termLink = creditOffer2.getTermLink();
            if (termLink == null) {
                termLink = "";
            }
            java.lang.String termLinkText = creditOffer2.getTermLinkText();
            if (termLinkText == null) {
                termLinkText = "";
            }
            creditOffer = new com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer(text1, text2, termLink, termLinkText);
        } else {
            creditOffer = null;
        }
        java.lang.String type = fundingInstrumentDTO.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case 2031164:
                    if (type.equals("BANK")) {
                        java.lang.String id = fundingInstrumentDTO.getId();
                        java.lang.String str = id == null ? "" : id;
                        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType = com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.BANK;
                        java.lang.String label = fundingInstrumentDTO.getLabel();
                        java.lang.String str2 = label == null ? "" : label;
                        com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO imageUrl = fundingInstrumentDTO.getImageUrl();
                        com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData imageUrlData = new com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData(imageUrl != null ? imageUrl.getImagePath() : null);
                        java.lang.String lastDigits = fundingInstrumentDTO.getLastDigits();
                        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.Companion companion2 = com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.INSTANCE;
                        java.lang.String subtype = fundingInstrumentDTO.getSubtype();
                        if (subtype == null) {
                            subtype = "UNKNOWN__";
                        }
                        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument(str, fundingInstrumentType, str2, imageUrlData, fundingSelectionUsability, map, lastDigits, companion2.valueFrom(subtype), (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) null, (java.lang.String) null, (com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer) null, (java.lang.String) null, arrayList, (java.lang.String) null, 11008, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    break;
                case 2061072:
                    if (type.equals("CARD")) {
                        java.lang.String id2 = fundingInstrumentDTO.getId();
                        java.lang.String str3 = id2 == null ? "" : id2;
                        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType2 = com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.CARD;
                        java.lang.String label2 = fundingInstrumentDTO.getLabel();
                        java.lang.String str4 = label2 == null ? "" : label2;
                        com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO imageUrl2 = fundingInstrumentDTO.getImageUrl();
                        com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData imageUrlData2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData(imageUrl2 != null ? imageUrl2.getImagePath() : null);
                        java.lang.String lastDigits2 = fundingInstrumentDTO.getLastDigits();
                        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.Companion companion3 = com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.INSTANCE;
                        java.lang.String subtype2 = fundingInstrumentDTO.getSubtype();
                        if (subtype2 == null) {
                            subtype2 = "UNKNOWN";
                        }
                        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument(str3, fundingInstrumentType2, str4, imageUrlData2, fundingSelectionUsability, map, lastDigits2, (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) null, companion3.valueFrom(subtype2), fundingInstrumentDTO.getCardBrand(), (com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer) null, (java.lang.String) null, arrayList, (java.lang.String) null, 10368, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    break;
                case 740598213:
                    if (type.equals("PAYPAL_CREDIT")) {
                        java.lang.String id3 = fundingInstrumentDTO.getId();
                        java.lang.String str5 = id3 == null ? "" : id3;
                        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType3 = com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.PAYPAL_CREDIT;
                        java.lang.String label3 = fundingInstrumentDTO.getLabel();
                        java.lang.String str6 = label3 == null ? "" : label3;
                        com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO imageUrl3 = fundingInstrumentDTO.getImageUrl();
                        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument(str5, fundingInstrumentType3, str6, new com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData(imageUrl3 != null ? imageUrl3.getImagePath() : null), fundingSelectionUsability, map, (java.lang.String) null, (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) null, (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) null, (java.lang.String) null, creditOffer, (java.lang.String) null, arrayList, (java.lang.String) null, androidx.work.Data.MAX_DATA_BYTES, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    break;
                case 1658367611:
                    if (type.equals("COBRAND")) {
                        java.lang.String id4 = fundingInstrumentDTO.getId();
                        java.lang.String str7 = id4 == null ? "" : id4;
                        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType4 = com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.COBRAND;
                        java.lang.String label4 = fundingInstrumentDTO.getLabel();
                        java.lang.String str8 = label4 == null ? "" : label4;
                        com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO imageUrl4 = fundingInstrumentDTO.getImageUrl();
                        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument(str7, fundingInstrumentType4, str8, new com.paypal.oslo.feature.inappcheckout.domain.entity.ImageUrlData(imageUrl4 != null ? imageUrl4.getImagePath() : null), fundingSelectionUsability, map, (java.lang.String) null, (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) null, (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) null, (java.lang.String) null, (com.paypal.oslo.feature.inappcheckout.domain.entity.CreditOffer) null, (java.lang.String) null, arrayList, (java.lang.String) null, androidx.work.Data.MAX_DATA_BYTES, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    break;
            }
        }
        return null;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionConfig mapConfigFromDTO(com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO configDTO) {
        com.paypal.oslo.feature.inappcheckout.data.dto.InstantVaultDTO instantVault;
        java.lang.String balanceSubType;
        java.lang.Boolean balanceEligibility;
        java.util.List<java.lang.String> selectedInstrumentIds = configDTO != null ? configDTO.getSelectedInstrumentIds() : null;
        if (selectedInstrumentIds == null) {
            selectedInstrumentIds = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<java.lang.String> list = selectedInstrumentIds;
        boolean z = false;
        boolean booleanValue = (configDTO == null || (balanceEligibility = configDTO.getBalanceEligibility()) == null) ? false : balanceEligibility.booleanValue();
        if ((configDTO != null ? kotlin.jvm.internal.Intrinsics.areEqual(configDTO.getBalanceEligibility(), java.lang.Boolean.TRUE) : false) && kotlin.jvm.internal.Intrinsics.areEqual(configDTO.getBalanceSelected(), java.lang.Boolean.TRUE)) {
            z = true;
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionConfig(list, configDTO != null ? configDTO.getPreferredInstrumentId() : null, configDTO != null ? configDTO.getRecommendedInstrumentId() : null, java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(z), (configDTO == null || (balanceSubType = configDTO.getBalanceSubType()) == null) ? null : com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType.valueOf(balanceSubType), (configDTO == null || (instantVault = configDTO.getInstantVault()) == null) ? null : new com.paypal.oslo.feature.inappcheckout.domain.entity.InstantVaultMetadata(instantVault.getFundingInstrumentIds(), java.lang.Boolean.valueOf(instantVault.isBalanceUsed()), null));
    }
}
