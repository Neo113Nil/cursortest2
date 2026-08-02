package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007j\u0002`\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "productConfigurations", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "specialFinancingMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/specialfinancing/uimodel/SpecialFinancingItemUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/specialfinancing/SpecialFinancingSectionUiState;", "mapToSpecialFinancingSectionUiState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingSectionUiStateMapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x016b -> B:10:0x0177). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object mapToSpecialFinancingSectionUiState(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.SpecialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1 specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1;
        int i;
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.List list2;
        java.util.ArrayList arrayList2;
        java.util.Iterator it;
        int i2;
        int i3;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.SpecialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1 specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.SpecialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1) {
            specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.SpecialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1) continuation;
            if ((specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.unwrapAs & Integer.MIN_VALUE) != 0) {
                specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.unwrapAs -= 2147483648;
                java.lang.Object obj3 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.isOutputSupportedForhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.unwrapAs;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> promotionalActivitiesOverview = accountSummaryOverView.getPromotionalActivitiesOverview();
                    if (promotionalActivitiesOverview != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj4 : promotionalActivitiesOverview) {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) obj4;
                            if (promotionalActivity.getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.ACTIVE || promotionalActivity.getStatus() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.EXPIRING) {
                                arrayList3.add(obj4);
                            }
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    if (productConfigurations == null || !productConfigurations.hasValueProposition(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition.RECEIVE_SPECIAL_FINANCING_OFFERS)) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden.INSTANCE;
                    }
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list3 = promotionalActivitiesOverview;
                    if (list3 == null || list3.isEmpty()) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Hidden.INSTANCE;
                    }
                    if (arrayList.isEmpty()) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty.INSTANCE;
                    }
                    java.util.List take = kotlin.collections.CollectionsKt.take(arrayList, 3);
                    list = promotionalActivitiesOverview;
                    obj = take;
                    obj2 = obj;
                    list2 = arrayList;
                    arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(take, 10));
                    it = take.iterator();
                    i2 = 0;
                    i3 = 0;
                    creditProductIdentifier2 = creditProductIdentifier;
                    productConfigurations2 = productConfigurations;
                    specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1;
                    accountSummaryOverView2 = accountSummaryOverView;
                    specialFinancingMapper2 = specialFinancingMapper;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.Camera2StreamConfigurationMap;
                    int i5 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getHighSpeedVideoFpsRanges;
                    int i6 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getHighResolutionOutputSizeshNQ4ISI;
                    ?? r7 = (java.util.Collection) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getInputFormats;
                    java.lang.Object obj5 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getOutputMinFrameDuration;
                    java.util.Iterator it2 = (java.util.Iterator) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.toString;
                    ?? r9 = (java.util.Collection) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getOutputStallDuration;
                    java.lang.Object obj6 = (java.lang.Iterable) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object obj7 = (java.lang.Iterable) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getOutputStallDurationlomOqCM;
                    java.util.List list4 = (java.util.List) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getOutputSizeshNQ4ISI;
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list5 = (java.util.List) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getOutputSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getOutputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list6 = list5;
                    java.lang.Object obj8 = obj7;
                    java.util.Iterator it3 = it2;
                    arrayList2 = r7;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.SpecialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1 specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$13 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1;
                    specialFinancingMapper2 = specialFinancingMapper3;
                    java.util.List list7 = list4;
                    java.lang.Object obj9 = obj6;
                    java.util.ArrayList arrayList4 = r9;
                    int i7 = i6;
                    creditProductIdentifier2 = creditProductIdentifier3;
                    int i8 = i5;
                    accountSummaryOverView2 = accountSummaryOverView3;
                    arrayList2.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel) obj3);
                    productConfigurations2 = productConfigurations3;
                    i2 = i8;
                    specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$13;
                    i3 = i7;
                    arrayList2 = arrayList4;
                    it = it3;
                    obj = obj9;
                    obj2 = obj8;
                    list2 = list7;
                    list = list6;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) next;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSummaryOverView2);
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(productConfigurations2);
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getHighSpeedVideoSizesFor = specialFinancingMapper2;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getOutputFormats = creditProductIdentifier2;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getOutputStallDuration = arrayList2;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.toString = it;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(promotionalActivity2);
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getInputFormats = arrayList2;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getHighResolutionOutputSizeshNQ4ISI = i3;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.getHighSpeedVideoFpsRanges = i2;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.Camera2StreamConfigurationMap = 0;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12.unwrapAs = 1;
                        java.lang.Object mapToUiModel = specialFinancingMapper2.mapToUiModel(promotionalActivity2, creditProductIdentifier2, specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12);
                        coroutine_suspended = coroutine_suspended;
                        if (mapToUiModel == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list6 = list;
                        obj8 = obj2;
                        it3 = it;
                        i7 = i3;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$13 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12;
                        i8 = i2;
                        productConfigurations3 = productConfigurations2;
                        obj3 = mapToUiModel;
                        list7 = list2;
                        obj9 = obj;
                        arrayList4 = arrayList2;
                        arrayList2.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.specialfinancing.uimodel.SpecialFinancingItemUiModel) obj3);
                        productConfigurations2 = productConfigurations3;
                        i2 = i8;
                        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$12 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$13;
                        i3 = i7;
                        arrayList2 = arrayList4;
                        it = it3;
                        obj = obj9;
                        obj2 = obj8;
                        list2 = list7;
                        list = list6;
                        if (it.hasNext()) {
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(arrayList2);
                        }
                    }
                }
            }
        }
        specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.SpecialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1(continuation);
        java.lang.Object obj32 = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = specialFinancingSectionUiStateMapperKt$mapToSpecialFinancingSectionUiState$1.unwrapAs;
        if (i != 0) {
        }
    }
}
