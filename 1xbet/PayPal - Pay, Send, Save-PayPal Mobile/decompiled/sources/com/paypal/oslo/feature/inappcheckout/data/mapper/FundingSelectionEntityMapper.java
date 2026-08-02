package com.paypal.oslo.feature.inappcheckout.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;", "", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingInstrumentMapper;", "fundingInstrumentMapper", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "contingencyMapper", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingInstrumentMapper;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;)V", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingSelectionDTO;", "dto", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "convert", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingSelectionDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "p0", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;)Z", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingInstrumentMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FundingSelectionEntityMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FundingSelectionEntityMapper(com.paypal.oslo.feature.inappcheckout.data.mapper.FundingInstrumentMapper fundingInstrumentMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = fundingInstrumentMapper;
        this.getHighSpeedVideoFpsRanges = contingencyMapper;
    }

    private static boolean getHighSpeedVideoSizes(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity p0) {
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName name2 = p0 != null ? p0.getName() : null;
        return (name2 == com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.UNKNOWN__ || name2 == com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.THREE_DS_AUTHENTICATION_REQUIRED || name2 == com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED || name2 == com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED || name2 == com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.BANK_ACCOUNT_BALANCE_REQUIRED) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r7.isUsable() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity convert(com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO dto) {
        boolean z;
        boolean z2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.AddCardContingency addCardContingency;
        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO contingencyDTO;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dto, "");
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO> fundingInstruments = dto.getFundingInstruments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = fundingInstruments.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument map = this.getHighResolutionOutputSizeshNQ4ISI.map((com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO) it.next());
            if (map != null) {
                arrayList.add(map);
            }
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionConfig mapConfigFromDTO = this.getHighResolutionOutputSizeshNQ4ISI.mapConfigFromDTO(dto.getConfig());
        java.util.ArrayList arrayList2 = arrayList;
        boolean z3 = true;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!getHighSpeedVideoSizes(((com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) it2.next()).getContingency())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) mapConfigFromDTO.getSelectedInstrumentIds());
        if (str != null) {
            if (!z) {
                java.util.Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) obj2).getId(), str)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) obj2;
                if (fundingInstrument != null) {
                }
            }
            java.util.Iterator it4 = arrayList2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) obj;
                if (fundingInstrument2.getUsability().getStatus() == com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.USABLE && getHighSpeedVideoSizes(fundingInstrument2.getContingency())) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) obj;
            mapConfigFromDTO = fundingInstrument3 != null ? com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionConfig.copy$default(mapConfigFromDTO, kotlin.collections.CollectionsKt.listOf(fundingInstrument3.getId()), null, null, null, null, null, null, 126, null) : com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionConfig.copy$default(mapConfigFromDTO, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, null, null, 126, null);
        }
        final java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) mapConfigFromDTO.getSelectedInstrumentIds());
        kotlin.Pair pair = new kotlin.Pair(kotlin.collections.CollectionsKt.sortedWith(arrayList2, new java.util.Comparator() { // from class: com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper$sortFundingInstruments$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.lang.Integer num;
                java.lang.Integer num2;
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument4 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) t;
                if (kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrument4.getId(), str2)) {
                    num = (java.lang.Comparable) 0;
                } else if (fundingInstrument4.getUsability().getStatus() == com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.USABLE) {
                    num = (java.lang.Comparable) 1;
                } else {
                    num = (java.lang.Comparable) 2;
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument5 = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) t2;
                if (kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrument5.getId(), str2)) {
                    num2 = (java.lang.Comparable) 0;
                } else if (fundingInstrument5.getUsability().getStatus() == com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.USABLE) {
                    num2 = (java.lang.Comparable) 1;
                } else {
                    num2 = (java.lang.Comparable) 2;
                }
                return kotlin.comparisons.ComparisonsKt.compareValues(num, num2);
            }
        }), mapConfigFromDTO);
        java.util.List list = (java.util.List) pair.component1();
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionConfig fundingSelectionConfig = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionConfig) pair.component2();
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument> list2 = list;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            for (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument4 : list2) {
                if (fundingInstrument4.isUsable() && getHighSpeedVideoSizes(fundingInstrument4.getContingency())) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> transactionLevelContingencies = dto.getTransactionLevelContingencies();
        if (transactionLevelContingencies == null || (contingencyDTO = (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) transactionLevelContingencies)) == null || (addCardContingency = this.getHighSpeedVideoFpsRanges.map(contingencyDTO)) == null) {
            addCardContingency = !z2 ? new com.paypal.oslo.feature.inappcheckout.domain.entity.AddCardContingency(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.ADD_INSTRUMENT, com.paypal.oslo.feature.inappcheckout.domain.model.ApiName.FUNDING_SELECTION) : null;
        }
        if (z2) {
            java.lang.String str3 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fundingSelectionConfig.getSelectedInstrumentIds());
            java.lang.String preferredInstrumentId = fundingSelectionConfig.getPreferredInstrumentId();
            java.lang.String recommendedInstrumentId = fundingSelectionConfig.getRecommendedInstrumentId();
            java.lang.String str4 = str3;
            if (str4 != null && !kotlin.text.StringsKt.isBlank(str4)) {
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument findMatchingInstrumentId = com.paypal.oslo.feature.inappcheckout.extensions.InAppCheckoutExtensionsKt.findMatchingInstrumentId(list, str3);
                if ((findMatchingInstrumentId != null ? findMatchingInstrumentId.getType() : null) != com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.PAYPAL_CREDIT && (kotlin.jvm.internal.Intrinsics.areEqual(str3, preferredInstrumentId) || kotlin.jvm.internal.Intrinsics.areEqual(str3, recommendedInstrumentId))) {
                    z3 = false;
                }
            }
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity(list, fundingSelectionConfig, addCardContingency, z3);
    }
}
