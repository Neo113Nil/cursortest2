package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\nj\u0002`\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/RecentActivitiesSectionUiStateMapper;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/TransactionToRecentActivityUiModelMapper;", "uiModelMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/TransactionToRecentActivityUiModelMapper;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "accountSummaryOverView", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/AccountSummarySectionUiState;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/transactionitem/TransactionItemUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recentactivites/RecentActivitiesSectionUiState;", "mapToRecentActivitiesUiState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/TransactionToRecentActivityUiModelMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RecentActivitiesSectionUiStateMapper {
    public static final int $stable = 0;
    public static final int MAX_ACTIVITIES = 3;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public RecentActivitiesSectionUiStateMapper(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.TransactionToRecentActivityUiModelMapper transactionToRecentActivityUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionToRecentActivityUiModelMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = transactionToRecentActivityUiModelMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0109 -> B:10:0x010d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToRecentActivitiesUiState(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1 recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1;
        int i;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> list;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int i2;
        int i3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1 recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper recentActivitiesSectionUiStateMapper = this;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1) {
            recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1) continuation;
            if ((recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage activitiesOverview = accountSummaryOverView.getActivitiesOverview();
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> creditActivities = activitiesOverview != null ? activitiesOverview.getCreditActivities() : null;
                    if (creditActivities == null) {
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Error(null, 1, null);
                    }
                    if (creditActivities.isEmpty()) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Empty.INSTANCE;
                    }
                    java.util.List take = kotlin.collections.CollectionsKt.take(creditActivities, 3);
                    list = creditActivities;
                    iterable = take;
                    iterable2 = iterable;
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(take, 10));
                    it = take.iterator();
                    i2 = 0;
                    i3 = 0;
                    accountSummaryOverView2 = accountSummaryOverView;
                    recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12 = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1;
                    creditProductIdentifier2 = creditProductIdentifier;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.Camera2StreamConfigurationMap;
                    int i5 = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getHighSpeedVideoFpsRangesFor;
                    java.util.Collection collection = (java.util.Collection) recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object obj2 = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputStallDuration;
                    java.util.Iterator it2 = (java.util.Iterator) recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getHighSpeedVideoSizesFor;
                    ?? r10 = (java.util.Collection) recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getInputFormats;
                    iterable = (java.lang.Iterable) recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getInputSizeshNQ4ISI;
                    iterable2 = (java.lang.Iterable) recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputMinFrameDuration;
                    list = (java.util.List) recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i7 = i6;
                    i2 = i5;
                    recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12 = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1;
                    creditProductIdentifier2 = creditProductIdentifier3;
                    boolean z = true;
                    it = it2;
                    arrayList = r10;
                    collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel) obj);
                    recentActivitiesSectionUiStateMapper = this;
                    i3 = i7;
                    accountSummaryOverView2 = accountSummaryOverView3;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity transactionActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity) next;
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSummaryOverView2);
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getHighSpeedVideoFpsRanges = creditProductIdentifier2;
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getInputFormats = arrayList;
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getHighSpeedVideoSizesFor = it;
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transactionActivity);
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getOutputMinFrameDurationlomOqCM = arrayList;
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getHighSpeedVideoFpsRangesFor = i3;
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getHighResolutionOutputSizeshNQ4ISI = i2;
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.Camera2StreamConfigurationMap = 0;
                        z = true;
                        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12.getOutputSizeshNQ4ISI = 1;
                        java.lang.Object map = recentActivitiesSectionUiStateMapper.getHighResolutionOutputSizeshNQ4ISI.map(transactionActivity, creditProductIdentifier2, recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$12);
                        if (map == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        accountSummaryOverView3 = accountSummaryOverView2;
                        obj = map;
                        i7 = i3;
                        collection = arrayList;
                        collection.add((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.transactionitem.TransactionItemUiModel) obj);
                        recentActivitiesSectionUiStateMapper = this;
                        i3 = i7;
                        accountSummaryOverView2 = accountSummaryOverView3;
                        if (it.hasNext()) {
                            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState.Ready(arrayList);
                        }
                    }
                }
            }
        }
        recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1(recentActivitiesSectionUiStateMapper, continuation);
        java.lang.Object obj3 = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recentActivitiesSectionUiStateMapper$mapToRecentActivitiesUiState$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }
}
