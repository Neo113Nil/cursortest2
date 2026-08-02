package com.paypal.oslo.feature.dataprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/CreateDataAccessRequestUseCase;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/DataAccessRequestRepository;", "dataAccessRequestRepository", "Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/domain/repository/DataAccessRequestRepository;Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;)V", "", "", "selectedSources", "", "formatSelections", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "invoke", "(Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/DataAccessRequestRepository;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateDataAccessRequestUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CreateDataAccessRequestUseCase(com.paypal.oslo.feature.dataprivacy.domain.repository.DataAccessRequestRepository dataAccessRequestRepository, com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration dataPrivacyDynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataAccessRequestRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPrivacyDynamicConfiguration, "");
        this.getHighSpeedVideoFpsRanges = dataAccessRequestRepository;
        this.getHighSpeedVideoFpsRangesFor = dataPrivacyDynamicConfiguration;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final java.lang.Object invoke(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, java.lang.String>> continuation) {
        java.util.List listOf;
        if (list.isEmpty()) {
            return new arrow.core.Ior.Left(new com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError.InvalidInput("No sources selected"));
        }
        java.util.List<java.lang.String> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (java.lang.String str : list2) {
            java.lang.String str2 = map.get(str);
            if (str2 == null) {
                str2 = "PDF";
            }
            java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            java.lang.String str3 = (kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "PDF") || !kotlin.jvm.internal.Intrinsics.areEqual(upperCase, "JSON")) ? "application/pdf" : "application/json";
            switch (str.hashCode()) {
                case -1911368973:
                    if (str.equals("PayPal")) {
                        listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem[]{new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("PERSONAL_INFO", "ALL"), new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("FINANCIAL_INFO", "ALL"), new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("USAGE_INFO", "ALL")});
                        break;
                    }
                    listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("PERSONAL_INFO", "ALL"));
                    break;
                case -1621497404:
                    if (str.equals("Zettle")) {
                        listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem[]{new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("PERSONAL_INFO", "ALL"), new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("BUSINESS_INFO", "ALL")});
                        break;
                    }
                    listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("PERSONAL_INFO", "ALL"));
                    break;
                case 2731829:
                    if (str.equals("Xoom")) {
                        listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem[]{new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("PERSONAL_INFO", "ALL"), new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("TRANSACTION_INFO", "ALL")});
                        break;
                    }
                    listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("PERSONAL_INFO", "ALL"));
                    break;
                case 69909275:
                    if (str.equals("Honey")) {
                        listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem[]{new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("PERSONAL_INFO", "ALL"), new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("ACCOUNT_INFO", "ALL")});
                        break;
                    }
                    listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("PERSONAL_INFO", "ALL"));
                    break;
                default:
                    listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.dataprivacy.domain.model.DARItem("PERSONAL_INFO", "ALL"));
                    break;
            }
            arrayList.add(new com.paypal.oslo.feature.dataprivacy.domain.model.DARCategory("PROFILE", new com.paypal.oslo.feature.dataprivacy.domain.model.DARCriteria(listOf, kotlin.collections.CollectionsKt.listOf(str3), null, null, 12, null)));
        }
        return this.getHighSpeedVideoFpsRanges.createDataAccessRequest(new com.paypal.oslo.feature.dataprivacy.domain.model.CreateDARRequest("", "SELF_SERVICE", this.getHighSpeedVideoFpsRangesFor.isNativeDownloadEnabled() ? "APP_OSLO" : com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.COMPONENT, "PAYPAL", "DATA_ACCESS_REQUEST", arrayList), continuation);
    }
}
