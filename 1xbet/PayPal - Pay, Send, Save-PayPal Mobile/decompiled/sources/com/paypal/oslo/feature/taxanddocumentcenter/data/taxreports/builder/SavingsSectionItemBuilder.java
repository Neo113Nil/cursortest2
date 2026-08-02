package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/SavingsSectionItemBuilder;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "resourceCoordinator", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "dateUtil", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;)V", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportDomain;", "reports", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportItemDomain;", "buildItems", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/taxreports/builder/TaxReportResourceCoordinator;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taxanddocumentcenter/data/util/TaxReportDateUtil;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SavingsSectionItemBuilder {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SavingsSectionItemBuilder(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator, com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportResourceCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportDateUtil, "");
        this.getHighSpeedVideoFpsRangesFor = taxReportResourceCoordinator;
        this.getHighSpeedVideoFpsRanges = taxReportDateUtil;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain> buildItems(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain> reports, java.lang.String year) {
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain copy;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType badgeType;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain copy2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain copy3;
        str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reports, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(year, "");
        if (reports.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        str2 = "********0000";
        if (reports.size() == 1) {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain taxReportDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) kotlin.collections.CollectionsKt.first((java.util.List) reports);
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTitleResourceKey(taxReportDomain.getType()), null, 2, null);
            java.lang.String accountNumber = taxReportDomain.getAccountNumber();
            if (accountNumber == null) {
                accountNumber = "";
            }
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toSingleAccountDescriptionResourceKey(taxReportDomain.getType()), kotlin.collections.CollectionsKt.listOf(accountNumber.length() >= 4 ? "********".concat(java.lang.String.valueOf(kotlin.text.StringsKt.takeLast(accountNumber, 4))) : "********0000"));
            java.lang.String downloadId = taxReportDomain.getDownloadId();
            copy3 = taxReportDomain.copy((r28 & 1) != 0 ? taxReportDomain.id : null, (r28 & 2) != 0 ? taxReportDomain.mode : null, (r28 & 4) != 0 ? taxReportDomain.status : null, (r28 & 8) != 0 ? taxReportDomain.type : null, (r28 & 16) != 0 ? taxReportDomain.name : null, (r28 & 32) != 0 ? taxReportDomain.createdTime : null, (r28 & 64) != 0 ? taxReportDomain.accountNumber : null, (r28 & 128) != 0 ? taxReportDomain.downloadId : null, (r28 & 256) != 0 ? taxReportDomain.correctionFlowStatus : null, (r28 & 512) != 0 ? taxReportDomain.correction : null, (r28 & 1024) != 0 ? taxReportDomain.inReview : false, (r28 & 2048) != 0 ? taxReportDomain.reportStatus : com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportStatus.DOWNLOADABLE, (r28 & 4096) != 0 ? taxReportDomain.cta : this.getHighSpeedVideoFpsRangesFor.buildDownloadCta(downloadId != null ? downloadId : "", year));
            return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy3, stringKey, stringKey2, null, null, null, 56, null));
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain taxReportDomain2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) kotlin.collections.CollectionsKt.first((java.util.List) reports);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain taxReportTypeDomain = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.MULTI_SAVINGS_1099_INT;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toTitleResourceKey(taxReportTypeDomain), null, 2, null);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toMultiAccountDescriptionResourceKey(taxReportTypeDomain), kotlin.collections.CollectionsKt.listOf(year));
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain taxReportDomain3 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) kotlin.collections.CollectionsKt.first((java.util.List) reports);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey5 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toMultiSavingsSheetTitleResourceKey(taxReportDomain3.getType()), kotlin.collections.CollectionsKt.listOf(year));
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey6 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toMultiSavingsSheetDescriptionResourceKey(taxReportDomain3.getType()), kotlin.collections.CollectionsKt.emptyList());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain taxReportDomain4 : reports) {
            java.lang.String accountNumber2 = taxReportDomain4.getAccountNumber();
            java.lang.String str3 = accountNumber2 == null ? "" : accountNumber2;
            java.lang.Object obj = linkedHashMap.get(str3);
            if (obj == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                linkedHashMap.put(str3, arrayList);
                obj = arrayList;
            }
            ((java.util.List) obj).add(taxReportDomain4);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str4 = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            java.lang.String str5 = str;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain taxReportDomain5 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain) it2.next();
                java.lang.String accountNumber3 = taxReportDomain5.getAccountNumber();
                java.util.Iterator it3 = it2;
                if (accountNumber3 == null) {
                    accountNumber3 = str5;
                }
                java.util.Iterator it4 = it;
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey7 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toSavingsAccountTitleResourceKey(), kotlin.collections.CollectionsKt.listOf(accountNumber3.length() >= 4 ? "********".concat(java.lang.String.valueOf(kotlin.text.StringsKt.takeLast(accountNumber3, 4))) : str2));
                java.lang.String str6 = str2;
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey8 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toSavingsReportDescriptionResourceKey(taxReportDomain5.getMode()), kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRanges.formatCreatedTime(taxReportDomain5.getCreatedTime())));
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey9 = stringKey4;
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey10 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toBadgeLabelResourceKey(taxReportDomain5.getMode()), kotlin.collections.CollectionsKt.emptyList());
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain mode = taxReportDomain5.getMode();
                if (mode != null && com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder.WhenMappings.$EnumSwitchMapping$0[mode.ordinal()] == 1) {
                    badgeType = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType.FEATURE;
                } else {
                    badgeType = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.BadgeType.NEUTRAL;
                }
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain reportBadgeDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ReportBadgeDomain(stringKey10, badgeType);
                java.lang.String downloadId2 = taxReportDomain5.getDownloadId();
                if (downloadId2 == null) {
                    downloadId2 = str5;
                }
                copy2 = taxReportDomain5.copy((r28 & 1) != 0 ? taxReportDomain5.id : null, (r28 & 2) != 0 ? taxReportDomain5.mode : null, (r28 & 4) != 0 ? taxReportDomain5.status : null, (r28 & 8) != 0 ? taxReportDomain5.type : null, (r28 & 16) != 0 ? taxReportDomain5.name : null, (r28 & 32) != 0 ? taxReportDomain5.createdTime : null, (r28 & 64) != 0 ? taxReportDomain5.accountNumber : null, (r28 & 128) != 0 ? taxReportDomain5.downloadId : null, (r28 & 256) != 0 ? taxReportDomain5.correctionFlowStatus : null, (r28 & 512) != 0 ? taxReportDomain5.correction : null, (r28 & 1024) != 0 ? taxReportDomain5.inReview : false, (r28 & 2048) != 0 ? taxReportDomain5.reportStatus : null, (r28 & 4096) != 0 ? taxReportDomain5.cta : this.getHighSpeedVideoFpsRangesFor.buildDownloadCta(downloadId2, year));
                arrayList3.add(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsReportCardDomain(copy2, stringKey7, stringKey8, reportBadgeDomain));
                it2 = it3;
                it = it4;
                str2 = str6;
                stringKey4 = stringKey9;
            }
            arrayList2.add(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain(str4, null, arrayList3));
            str = str5;
            it = it;
        }
        java.lang.String str7 = str2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey stringKey11 = stringKey4;
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList2);
        if (mutableList.size() > 1) {
            int i = 0;
            for (java.lang.Object obj2 : mutableList) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain savingsAccountDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain) obj2;
                java.lang.String savingsAccountTitleResourceKey = com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.TaxReportResourceMapper.INSTANCE.toSavingsAccountTitleResourceKey();
                java.lang.String accountNumber4 = savingsAccountDomain.getAccountNumber();
                mutableList.set(i, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SavingsAccountDomain.copy$default(savingsAccountDomain, null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTextResource.StringKey(savingsAccountTitleResourceKey, kotlin.collections.CollectionsKt.listOf(accountNumber4.length() >= 4 ? "********".concat(java.lang.String.valueOf(kotlin.text.StringsKt.takeLast(accountNumber4, 4))) : str7)), null, 5, null));
                i++;
            }
        }
        copy = taxReportDomain2.copy((r28 & 1) != 0 ? taxReportDomain2.id : null, (r28 & 2) != 0 ? taxReportDomain2.mode : null, (r28 & 4) != 0 ? taxReportDomain2.status : null, (r28 & 8) != 0 ? taxReportDomain2.type : taxReportTypeDomain, (r28 & 16) != 0 ? taxReportDomain2.name : null, (r28 & 32) != 0 ? taxReportDomain2.createdTime : null, (r28 & 64) != 0 ? taxReportDomain2.accountNumber : null, (r28 & 128) != 0 ? taxReportDomain2.downloadId : null, (r28 & 256) != 0 ? taxReportDomain2.correctionFlowStatus : null, (r28 & 512) != 0 ? taxReportDomain2.correction : null, (r28 & 1024) != 0 ? taxReportDomain2.inReview : false, (r28 & 2048) != 0 ? taxReportDomain2.reportStatus : null, (r28 & 4096) != 0 ? taxReportDomain2.cta : new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCtaDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.HALF_SHEET, null, null, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain.MULTI_SAVING, null, new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.MultiSavingsSheetDataDomain(stringKey5, stringKey6, mutableList), 22, null));
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportItemDomain(copy, stringKey3, stringKey11, null, null, null, 56, null));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain.CORRECTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
