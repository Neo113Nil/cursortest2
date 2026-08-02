package com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0019\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/taxreports/TaxReportsMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/mapper/Mapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$TaxReports;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportsDomain;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$TaxReports;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportsDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$TaxReports;", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsAndFaqsQuery$TaxReports;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportsDomain;", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportMode;", "p0", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportModeDomain;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/api/graphql/schema/type/TaxReportMode;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportModeDomain;", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportStatusDomain;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportStatusDomain;", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;", "(Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportTypeDomain;", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionStatusDomain;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionStatusDomain;", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionFlowStatusDomain;", "(Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportCorrectionFlowStatusDomain;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxReportsMapper implements com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportsDomain> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TaxReportsMapper() {
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportsDomain map(com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item> items = input.getItems();
        java.util.ArrayList arrayList = null;
        if (items != null) {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item> list = items;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item item : list) {
                java.lang.String id = item.getId();
                com.paypal.oslo.api.graphql.schema.type.TaxReportMode mode = item.getMode();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain highSpeedVideoFpsRangesFor = mode != null ? getHighSpeedVideoFpsRangesFor(mode) : null;
                com.paypal.oslo.api.graphql.schema.type.TaxReportStatus status = item.getStatus();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain highResolutionOutputSizeshNQ4ISI = status != null ? getHighResolutionOutputSizeshNQ4ISI(status) : null;
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(item.getType());
                java.lang.String name2 = item.getName();
                java.lang.Object createdTime = item.getCreatedTime();
                java.lang.String obj = createdTime != null ? createdTime.toString() : null;
                java.lang.String accountNumber = item.getAccountNumber();
                java.lang.String downloadId = item.getDownloadId();
                com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus correctionFlowStatus = item.getCorrectionFlowStatus();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain highSpeedVideoFpsRanges = correctionFlowStatus != null ? getHighSpeedVideoFpsRanges(correctionFlowStatus) : null;
                com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction correction = item.getCorrection();
                arrayList2.add(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain(id, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, name2, obj, accountNumber, downloadId, highSpeedVideoFpsRanges, correction != null ? new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain(getHighSpeedVideoFpsRanges(correction.getStatus()), correction.getId(), correction.getDeepLink().toString()) : null, false, null, null, 7168, null));
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportsDomain(arrayList);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportsDomain map(com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.TaxReports input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Item> items = input.getItems();
        java.util.ArrayList arrayList = null;
        if (items != null) {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Item> list = items;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Item item : list) {
                java.lang.String id = item.getId();
                com.paypal.oslo.api.graphql.schema.type.TaxReportMode mode = item.getMode();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain highSpeedVideoFpsRangesFor = mode != null ? getHighSpeedVideoFpsRangesFor(mode) : null;
                com.paypal.oslo.api.graphql.schema.type.TaxReportStatus status = item.getStatus();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain highResolutionOutputSizeshNQ4ISI = status != null ? getHighResolutionOutputSizeshNQ4ISI(status) : null;
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(item.getType());
                java.lang.String name2 = item.getName();
                java.lang.Object createdTime = item.getCreatedTime();
                java.lang.String obj = createdTime != null ? createdTime.toString() : null;
                java.lang.String accountNumber = item.getAccountNumber();
                java.lang.String downloadId = item.getDownloadId();
                com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus correctionFlowStatus = item.getCorrectionFlowStatus();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain highSpeedVideoFpsRanges = correctionFlowStatus != null ? getHighSpeedVideoFpsRanges(correctionFlowStatus) : null;
                com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsAndFaqsQuery.Correction correction = item.getCorrection();
                arrayList2.add(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportDomain(id, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, name2, obj, accountNumber, downloadId, highSpeedVideoFpsRanges, correction != null ? new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionDomain(getHighSpeedVideoFpsRanges(correction.getStatus()), correction.getId(), correction.getDeepLink().toString()) : null, false, null, null, 7168, null));
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportsDomain(arrayList);
    }

    private static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain getHighSpeedVideoFpsRangesFor(com.paypal.oslo.api.graphql.schema.type.TaxReportMode p0) {
        int i = com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain.INITIAL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportModeDomain.CORRECTION;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        throw new java.lang.IllegalStateException("Unknown TaxReportMode: ".concat(java.lang.String.valueOf(p0)).toString());
    }

    private static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.TaxReportStatus p0) {
        switch (com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper.WhenMappings.$EnumSwitchMapping$1[p0.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.DEPENDENT_REPORT_NOT_READY;
            case 2:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.UNAVAILABLE_NO_ACTION;
            case 3:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.GENERATION_ON_ACTION;
            case 4:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.GENERATED;
            case 5:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.GENERATION_ON_DEMAND;
            case 6:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.GENERATION_IN_PROGRESS;
            case 7:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportStatusDomain.NOT_ELIGIBLE;
            case 8:
                throw new java.lang.IllegalStateException("Unknown TaxReportStatus: ".concat(java.lang.String.valueOf(p0)).toString());
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.TaxReportType p0) {
        switch (com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper.WhenMappings.$EnumSwitchMapping$2[p0.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_1099K;
            case 2:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SALES_TRANSACTIONS_STATEMENT;
            case 3:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099K;
            case 4:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099_DA;
            case 5:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_GAINS_LOSSES_STATEMENT;
            case 6:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_TRANSACTIONS_STATEMENT;
            case 7:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.SAVINGS_1099_INT;
            case 8:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.CRYPTO_1099_MISC;
            case 9:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportTypeDomain.FIAT_1099_MISC;
            case 10:
                throw new java.lang.IllegalStateException("Unknown TaxReportType: ".concat(java.lang.String.valueOf(p0)).toString());
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain getHighSpeedVideoFpsRanges(com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus p0) {
        switch (com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper.WhenMappings.$EnumSwitchMapping$3[p0.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.INITIAL;
            case 2:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.MANUAL_REVIEW;
            case 3:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.PENDING_INFORMATION;
            case 4:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.PROCESSING_REPORT;
            case 5:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.PROCESSING_FAILED;
            case 6:
                return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionStatusDomain.COMPLETED;
            case 7:
                throw new java.lang.IllegalStateException("Unknown TaxReportCorrectionStatus: ".concat(java.lang.String.valueOf(p0)).toString());
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain getHighSpeedVideoFpsRanges(com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus p0) {
        int i = com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper.WhenMappings.$EnumSwitchMapping$4[p0.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.ACTION_REQUIRED_NEW;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.ACTION_REQUIRED_RESUME;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.IN_PROGRESS;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.NOT_AVAILABLE;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Unknown TaxReportCorrectionFlowStatus received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enum_value", p0.toString()), kotlin.TuplesKt.to("raw_value", p0.getRawValue()), kotlin.TuplesKt.to("default_value", "NOT_AVAILABLE")), null, 4, null);
        return com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportCorrectionFlowStatusDomain.NOT_AVAILABLE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.TaxReportMode.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.TaxReportMode.INITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.TaxReportMode.CORRECTION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.TaxReportMode.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.DEPENDENT_REPORT_NOT_READY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.UNAVAILABLE_NO_ACTION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.GENERATION_ON_ACTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.GENERATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.GENERATION_ON_DEMAND.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.GENERATION_IN_PROGRESS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.NOT_ELIGIBLE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.TaxReportStatus.UNKNOWN__.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.TaxReportType.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.SALES_1099K.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.SALES_TRANSACTIONS_STATEMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_1099K.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_1099_DA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_GAINS_LOSSES_STATEMENT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_TRANSACTIONS_STATEMENT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.SAVINGS_1099_INT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.CRYPTO_1099_MISC.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.FIAT_1099_MISC.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.TaxReportType.UNKNOWN__.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.values().length];
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.INITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.MANUAL_REVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.PENDING_INFORMATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.PROCESSING_REPORT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.PROCESSING_FAILED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.COMPLETED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus.UNKNOWN__.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.values().length];
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.ACTION_REQUIRED_NEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.ACTION_REQUIRED_RESUME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.IN_PROGRESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.NOT_AVAILABLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }
}
