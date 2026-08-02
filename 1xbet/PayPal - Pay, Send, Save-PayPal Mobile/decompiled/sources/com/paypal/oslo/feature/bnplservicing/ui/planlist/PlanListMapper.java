package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u0010H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\u0010H\u0000¢\u0006\u0004\b$\u0010%J#\u0010*\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\u0004\u0018\u00010(*\u00020\u0010H\u0080@¢\u0006\u0004\b,\u0010\u001aR\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListMapper;", "", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "formatter", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/content/PlanListContentProvider;", "contentProvider", "Lcom/paypal/oslo/feature/bnplservicing/config/planlist/PlanListConfig;", "planListConfig", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/content/PlanListContentProvider;Lcom/paypal/oslo/feature/bnplservicing/config/planlist/PlanListConfig;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", "overview", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListUiModel;", "toPlanListUiModel", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/PlanModel;", "toPlanModel$bnpl_servicing_prodRelease", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$ReadyToUsePlan;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/ReadyToUsePlanModel;", "toReadyToUsePlanModel$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$ReadyToUsePlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/AfterPurchasePlanModel;", "toAfterPurchasePlanModel$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;", "getProgressBar$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;)Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;", "", "totalInstallmentsPaid", "totalInstallmentsCount", "toBarModel$bnpl_servicing_prodRelease", "(II)Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PaymentProgressBarModel;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getPlanDescription$bnpl_servicing_prodRelease", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "", "isRefundPending", "", "date", "getCompleteOrMatureDescription$bnpl_servicing_prodRelease", "(ZLjava/lang/String;)Lcom/paypal/oslo/core/commonui/utils/RefText;", "getFormattedAmount$bnpl_servicing_prodRelease", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/content/PlanListContentProvider;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/config/planlist/PlanListConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanListMapper {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PlanListMapper(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider planListContentProvider, com.paypal.oslo.feature.bnplservicing.config.planlist.PlanListConfig planListConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListConfig, "");
        this.getHighSpeedVideoFpsRangesFor = bnplServFormatter;
        this.getHighSpeedVideoSizes = planListContentProvider;
        this.getHighSpeedVideoFpsRanges = planListConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0088, code lost:
    
        if (r12 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toPlanListUiModel(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanListUiModel$1 planListMapper$toPlanListUiModel$1;
        int i;
        java.util.List list;
        java.util.List list2;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> history;
        java.util.List list3;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanListUiModel$1) {
            planListMapper$toPlanListUiModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanListUiModel$1) continuation;
            if ((planListMapper$toPlanListUiModel$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                planListMapper$toPlanListUiModel$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = planListMapper$toPlanListUiModel$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planListMapper$toPlanListUiModel$1.Camera2StreamConfigurationMap;
                list = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> active = plansOverview.getPlans().getActive();
                    if (active == null) {
                        list2 = null;
                        if (list2 == null) {
                            list2 = kotlin.collections.CollectionsKt.emptyList();
                        }
                        history = plansOverview.getPlans().getHistory();
                        if (history != null) {
                            java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> arrayList = new java.util.ArrayList<>();
                            for (java.lang.Object obj2 : history) {
                                com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot) obj2;
                                if (!(planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) || !((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) planListSnapshot).isRefundPending()) {
                                    arrayList.add(obj2);
                                }
                            }
                            planListMapper$toPlanListUiModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plansOverview);
                            planListMapper$toPlanListUiModel$1.getHighSpeedVideoFpsRanges = list2;
                            planListMapper$toPlanListUiModel$1.Camera2StreamConfigurationMap = 2;
                            java.lang.Object planModel$bnpl_servicing_prodRelease = toPlanModel$bnpl_servicing_prodRelease(arrayList, planListMapper$toPlanListUiModel$1);
                            if (planModel$bnpl_servicing_prodRelease != coroutine_suspended) {
                                java.util.List list4 = list2;
                                obj = planModel$bnpl_servicing_prodRelease;
                                list3 = list4;
                                list = (java.util.List) obj;
                                list2 = list3;
                            }
                            return coroutine_suspended;
                        }
                        if (list == null) {
                        }
                        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel(list2, kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.toSet(list)), new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent(this.getHighSpeedVideoSizes.getActivePlanTab(), this.getHighSpeedVideoSizes.getPlanHistoryTab(), new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent(this.getHighSpeedVideoSizes.getEmptyContent().getActivePlansTitle(), this.getHighSpeedVideoSizes.getEmptyContent().getHistoryPlansTitle(), this.getHighSpeedVideoSizes.getEmptyContent().getHistoryPlansDescription())));
                    }
                    java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> arrayList2 = new java.util.ArrayList<>();
                    for (java.lang.Object obj3 : active) {
                        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot) obj3;
                        if (!(planListSnapshot2 instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) || ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) planListSnapshot2).isRefundPending()) {
                            arrayList2.add(obj3);
                        }
                    }
                    planListMapper$toPlanListUiModel$1.getHighSpeedVideoFpsRangesFor = plansOverview;
                    planListMapper$toPlanListUiModel$1.Camera2StreamConfigurationMap = 1;
                    obj = toPlanModel$bnpl_servicing_prodRelease(arrayList2, planListMapper$toPlanListUiModel$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list3 = (java.util.List) planListMapper$toPlanListUiModel$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        list = (java.util.List) obj;
                        list2 = list3;
                        if (list == null) {
                            list = kotlin.collections.CollectionsKt.emptyList();
                        }
                        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel(list2, kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.toSet(list)), new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent(this.getHighSpeedVideoSizes.getActivePlanTab(), this.getHighSpeedVideoSizes.getPlanHistoryTab(), new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent(this.getHighSpeedVideoSizes.getEmptyContent().getActivePlansTitle(), this.getHighSpeedVideoSizes.getEmptyContent().getHistoryPlansTitle(), this.getHighSpeedVideoSizes.getEmptyContent().getHistoryPlansDescription())));
                    }
                    plansOverview = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview) planListMapper$toPlanListUiModel$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                list2 = (java.util.List) obj;
                if (list2 == null) {
                }
                history = plansOverview.getPlans().getHistory();
                if (history != null) {
                }
                if (list == null) {
                }
                return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel(list2, kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.toSet(list)), new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent(this.getHighSpeedVideoSizes.getActivePlanTab(), this.getHighSpeedVideoSizes.getPlanHistoryTab(), new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent(this.getHighSpeedVideoSizes.getEmptyContent().getActivePlansTitle(), this.getHighSpeedVideoSizes.getEmptyContent().getHistoryPlansTitle(), this.getHighSpeedVideoSizes.getEmptyContent().getHistoryPlansDescription())));
            }
        }
        planListMapper$toPlanListUiModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanListUiModel$1(this, continuation);
        java.lang.Object obj4 = planListMapper$toPlanListUiModel$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planListMapper$toPlanListUiModel$1.Camera2StreamConfigurationMap;
        list = null;
        if (i != 0) {
        }
        list2 = (java.util.List) obj4;
        if (list2 == null) {
        }
        history = plansOverview.getPlans().getHistory();
        if (history != null) {
        }
        if (list == null) {
        }
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel(list2, kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.toSet(list)), new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.PlanListContent(this.getHighSpeedVideoSizes.getActivePlanTab(), this.getHighSpeedVideoSizes.getPlanHistoryTab(), new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListUiModel.EmptyContent(this.getHighSpeedVideoSizes.getEmptyContent().getActivePlansTitle(), this.getHighSpeedVideoSizes.getEmptyContent().getHistoryPlansTitle(), this.getHighSpeedVideoSizes.getEmptyContent().getHistoryPlansDescription())));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0129 -> B:11:0x012c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toPlanModel$bnpl_servicing_prodRelease(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel>> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanModel$1 planListMapper$toPlanModel$1;
        int i;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.util.Collection arrayList;
        int i2;
        java.util.Iterator it;
        java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list2;
        int i3;
        java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list3;
        java.util.Collection collection;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel planModel;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanModel$1) {
            planListMapper$toPlanModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanModel$1) continuation;
            if ((planListMapper$toPlanModel$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                planListMapper$toPlanModel$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = planListMapper$toPlanModel$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planListMapper$toPlanModel$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot> list4 = list;
                    iterable = list4;
                    iterable2 = iterable;
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                    i2 = 0;
                    it = list4.iterator();
                    list2 = list;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    int i4 = planListMapper$toPlanModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = planListMapper$toPlanModel$1.getHighSpeedVideoSizes;
                    i3 = planListMapper$toPlanModel$1.Camera2StreamConfigurationMap;
                    arrayList = (java.util.Collection) planListMapper$toPlanModel$1.getOutputSizeshNQ4ISI;
                    java.lang.Object obj2 = planListMapper$toPlanModel$1.getOutputFormats;
                    it = (java.util.Iterator) planListMapper$toPlanModel$1.getOutputMinFrameDuration;
                    collection = (java.util.Collection) planListMapper$toPlanModel$1.getHighSpeedVideoSizesFor;
                    iterable = (java.lang.Iterable) planListMapper$toPlanModel$1.getInputFormats;
                    iterable2 = (java.lang.Iterable) planListMapper$toPlanModel$1.getHighSpeedVideoFpsRangesFor;
                    list3 = (java.util.List) planListMapper$toPlanModel$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    planModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel) obj;
                    arrayList.add(planModel);
                    arrayList = collection;
                    list2 = list3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = planListMapper$toPlanModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = planListMapper$toPlanModel$1.getHighSpeedVideoSizes;
                    i3 = planListMapper$toPlanModel$1.Camera2StreamConfigurationMap;
                    arrayList = (java.util.Collection) planListMapper$toPlanModel$1.getOutputSizeshNQ4ISI;
                    java.lang.Object obj3 = planListMapper$toPlanModel$1.getOutputFormats;
                    it = (java.util.Iterator) planListMapper$toPlanModel$1.getOutputMinFrameDuration;
                    collection = (java.util.Collection) planListMapper$toPlanModel$1.getHighSpeedVideoSizesFor;
                    iterable = (java.lang.Iterable) planListMapper$toPlanModel$1.getInputFormats;
                    iterable2 = (java.lang.Iterable) planListMapper$toPlanModel$1.getHighSpeedVideoFpsRangesFor;
                    list3 = (java.util.List) planListMapper$toPlanModel$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    planModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel) obj;
                    arrayList.add(planModel);
                    arrayList = collection;
                    list2 = list3;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot) next;
                        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) {
                            planListMapper$toPlanModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                            planListMapper$toPlanModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                            planListMapper$toPlanModel$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                            planListMapper$toPlanModel$1.getHighSpeedVideoSizesFor = arrayList;
                            planListMapper$toPlanModel$1.getOutputMinFrameDuration = it;
                            planListMapper$toPlanModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            planListMapper$toPlanModel$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(planListSnapshot);
                            planListMapper$toPlanModel$1.getOutputSizeshNQ4ISI = arrayList;
                            planListMapper$toPlanModel$1.Camera2StreamConfigurationMap = i3;
                            planListMapper$toPlanModel$1.getHighSpeedVideoSizes = i2;
                            planListMapper$toPlanModel$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            planListMapper$toPlanModel$1.getOutputStallDurationlomOqCM = 1;
                            java.lang.Object readyToUsePlanModel$bnpl_servicing_prodRelease = toReadyToUsePlanModel$bnpl_servicing_prodRelease((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) planListSnapshot, planListMapper$toPlanModel$1);
                            if (readyToUsePlanModel$bnpl_servicing_prodRelease != coroutine_suspended) {
                                list3 = list2;
                                collection = arrayList;
                                planModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel) readyToUsePlanModel$bnpl_servicing_prodRelease;
                                arrayList.add(planModel);
                                arrayList = collection;
                                list2 = list3;
                                if (it.hasNext()) {
                                    return (java.util.List) arrayList;
                                }
                            }
                        } else {
                            planListMapper$toPlanModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                            planListMapper$toPlanModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                            planListMapper$toPlanModel$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                            planListMapper$toPlanModel$1.getHighSpeedVideoSizesFor = arrayList;
                            planListMapper$toPlanModel$1.getOutputMinFrameDuration = it;
                            planListMapper$toPlanModel$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            planListMapper$toPlanModel$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(planListSnapshot);
                            planListMapper$toPlanModel$1.getOutputSizeshNQ4ISI = arrayList;
                            planListMapper$toPlanModel$1.Camera2StreamConfigurationMap = i3;
                            planListMapper$toPlanModel$1.getHighSpeedVideoSizes = i2;
                            planListMapper$toPlanModel$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            planListMapper$toPlanModel$1.getOutputStallDurationlomOqCM = 2;
                            java.lang.Object afterPurchasePlanModel$bnpl_servicing_prodRelease = toAfterPurchasePlanModel$bnpl_servicing_prodRelease(planListSnapshot, planListMapper$toPlanModel$1);
                            if (afterPurchasePlanModel$bnpl_servicing_prodRelease != coroutine_suspended) {
                                list3 = list2;
                                obj = afterPurchasePlanModel$bnpl_servicing_prodRelease;
                                collection = arrayList;
                                planModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel) obj;
                                arrayList.add(planModel);
                                arrayList = collection;
                                list2 = list3;
                                if (it.hasNext()) {
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                }
            }
        }
        planListMapper$toPlanModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanModel$1(this, continuation);
        java.lang.Object obj4 = planListMapper$toPlanModel$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planListMapper$toPlanModel$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r15 != r8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toReadyToUsePlanModel$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan readyToUsePlan, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toReadyToUsePlanModel$1 planListMapper$toReadyToUsePlanModel$1;
        int i;
        java.lang.String str;
        int i2;
        com.paypal.oslo.core.commonui.utils.RefText inStoreOnly;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        java.lang.String validityDuration;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan readyToUsePlan2;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider planListContentProvider;
        java.lang.String creditAccountId;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toReadyToUsePlanModel$1) {
            planListMapper$toReadyToUsePlanModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toReadyToUsePlanModel$1) continuation;
            if ((planListMapper$toReadyToUsePlanModel$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                planListMapper$toReadyToUsePlanModel$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = planListMapper$toReadyToUsePlanModel$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planListMapper$toReadyToUsePlanModel$1.getInputSizeshNQ4ISI;
                com.paypal.oslo.core.commonui.utils.RefText refText2 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String rawValue = readyToUsePlan.getRawValue();
                    if (rawValue.length() <= 0) {
                        rawValue = null;
                    }
                    if (rawValue == null) {
                        str = null;
                        i2 = com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper.WhenMappings.$EnumSwitchMapping$0[readyToUsePlan.getUsageChannel().ordinal()];
                        if (i2 == 1) {
                            inStoreOnly = this.getHighSpeedVideoSizes.getInStoreOnly();
                        } else if (i2 == 2) {
                            inStoreOnly = this.getHighSpeedVideoSizes.getOnlineOnly();
                        } else {
                            refText = null;
                            validityDuration = readyToUsePlan.getValidityDuration();
                            if (validityDuration != null) {
                                com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider planListContentProvider2 = this.getHighSpeedVideoSizes;
                                com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter = this.getHighSpeedVideoFpsRangesFor;
                                planListMapper$toReadyToUsePlanModel$1.getHighSpeedVideoSizes = readyToUsePlan;
                                planListMapper$toReadyToUsePlanModel$1.getHighSpeedVideoFpsRangesFor = str;
                                planListMapper$toReadyToUsePlanModel$1.getHighResolutionOutputSizeshNQ4ISI = refText;
                                planListMapper$toReadyToUsePlanModel$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validityDuration);
                                planListMapper$toReadyToUsePlanModel$1.getInputFormats = planListContentProvider2;
                                planListMapper$toReadyToUsePlanModel$1.Camera2StreamConfigurationMap = 0;
                                planListMapper$toReadyToUsePlanModel$1.getInputSizeshNQ4ISI = 2;
                                obj = bnplServFormatter.formatDurationCompact(validityDuration, planListMapper$toReadyToUsePlanModel$1);
                                if (obj != coroutine_suspended) {
                                    readyToUsePlan2 = readyToUsePlan;
                                    planListContentProvider = planListContentProvider2;
                                    refText2 = planListContentProvider.validityText((java.lang.String) obj);
                                    readyToUsePlan = readyToUsePlan2;
                                }
                                return coroutine_suspended;
                            }
                            creditAccountId = readyToUsePlan.getCreditAccountId();
                            if (creditAccountId == null) {
                            }
                            return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel(creditAccountId, str, refText, refText2);
                        }
                        refText = inStoreOnly;
                        validityDuration = readyToUsePlan.getValidityDuration();
                        if (validityDuration != null) {
                        }
                        creditAccountId = readyToUsePlan.getCreditAccountId();
                        if (creditAccountId == null) {
                        }
                        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel(creditAccountId, str, refText, refText2);
                    }
                    com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter2 = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(readyToUsePlan.getCurrencyCode(), rawValue);
                    planListMapper$toReadyToUsePlanModel$1.getHighSpeedVideoSizes = readyToUsePlan;
                    planListMapper$toReadyToUsePlanModel$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rawValue);
                    planListMapper$toReadyToUsePlanModel$1.Camera2StreamConfigurationMap = 0;
                    planListMapper$toReadyToUsePlanModel$1.getInputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(bnplServFormatter2, money, null, 0, planListMapper$toReadyToUsePlanModel$1, 6, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = planListMapper$toReadyToUsePlanModel$1.Camera2StreamConfigurationMap;
                        planListContentProvider = (com.paypal.oslo.feature.bnplservicing.ui.planlist.content.PlanListContentProvider) planListMapper$toReadyToUsePlanModel$1.getInputFormats;
                        refText = (com.paypal.oslo.core.commonui.utils.RefText) planListMapper$toReadyToUsePlanModel$1.getHighResolutionOutputSizeshNQ4ISI;
                        str = (java.lang.String) planListMapper$toReadyToUsePlanModel$1.getHighSpeedVideoFpsRangesFor;
                        readyToUsePlan2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) planListMapper$toReadyToUsePlanModel$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        refText2 = planListContentProvider.validityText((java.lang.String) obj);
                        readyToUsePlan = readyToUsePlan2;
                        creditAccountId = readyToUsePlan.getCreditAccountId();
                        if (creditAccountId == null) {
                            creditAccountId = "";
                        }
                        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel(creditAccountId, str, refText, refText2);
                    }
                    int i4 = planListMapper$toReadyToUsePlanModel$1.Camera2StreamConfigurationMap;
                    readyToUsePlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.ReadyToUsePlan) planListMapper$toReadyToUsePlanModel$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                i2 = com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper.WhenMappings.$EnumSwitchMapping$0[readyToUsePlan.getUsageChannel().ordinal()];
                if (i2 == 1) {
                }
                refText = inStoreOnly;
                validityDuration = readyToUsePlan.getValidityDuration();
                if (validityDuration != null) {
                }
                creditAccountId = readyToUsePlan.getCreditAccountId();
                if (creditAccountId == null) {
                }
                return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel(creditAccountId, str, refText, refText2);
            }
        }
        planListMapper$toReadyToUsePlanModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toReadyToUsePlanModel$1(this, continuation);
        java.lang.Object obj2 = planListMapper$toReadyToUsePlanModel$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planListMapper$toReadyToUsePlanModel$1.getInputSizeshNQ4ISI;
        com.paypal.oslo.core.commonui.utils.RefText refText22 = null;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        i2 = com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper.WhenMappings.$EnumSwitchMapping$0[readyToUsePlan.getUsageChannel().ordinal()];
        if (i2 == 1) {
        }
        refText = inStoreOnly;
        validityDuration = readyToUsePlan.getValidityDuration();
        if (validityDuration != null) {
        }
        creditAccountId = readyToUsePlan.getCreditAccountId();
        if (creditAccountId == null) {
        }
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel(creditAccountId, str, refText, refText22);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toAfterPurchasePlanModel$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel> continuation) {
        com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toAfterPurchasePlanModel$1 planListMapper$toAfterPurchasePlanModel$1;
        int i;
        java.lang.String str;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType afterPurchasePlanType;
        java.lang.String merchantName;
        java.lang.String str2;
        java.lang.String productName;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot2;
        java.lang.String str5;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toAfterPurchasePlanModel$1) {
            planListMapper$toAfterPurchasePlanModel$1 = (com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toAfterPurchasePlanModel$1) continuation;
            if ((planListMapper$toAfterPurchasePlanModel$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                planListMapper$toAfterPurchasePlanModel$1.getInputFormats -= 2147483648;
                java.lang.Object obj = planListMapper$toAfterPurchasePlanModel$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planListMapper$toAfterPurchasePlanModel$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String creditAccountId = planListSnapshot.getCreditAccountId();
                    str = creditAccountId == null ? "" : creditAccountId;
                    java.lang.String merchantLogoUrl = planListSnapshot.getMerchantLogoUrl();
                    if (planListSnapshot.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
                        afterPurchasePlanType = com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.InProgress;
                    } else if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) {
                        afterPurchasePlanType = ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) planListSnapshot).isRefundPending() ? com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Refund : com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Completed;
                    } else if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan) {
                        afterPurchasePlanType = com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.PastDue;
                    } else if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan) {
                        afterPurchasePlanType = com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.PastDue;
                    } else if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) {
                        afterPurchasePlanType = ((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) planListSnapshot).isRefundPending() ? com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Refund : com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.Completed;
                    } else {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplservicing.LoggerKt.log;
                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(planListSnapshot.getClass()).getSimpleName();
                        com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logUnknownMapping(logger, simpleName != null ? simpleName : "");
                        afterPurchasePlanType = com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.InProgress;
                    }
                    merchantName = planListSnapshot.getMerchantName();
                    str2 = null;
                    productName = this.getHighSpeedVideoFpsRanges.getUIs().getPlansListSection().getShouldShowProductName() ? planListSnapshot.getProductName() : null;
                    if (planListSnapshot.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
                        str3 = merchantLogoUrl;
                        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str, null, str3, afterPurchasePlanType, merchantName, productName, str2, getPlanDescription$bnpl_servicing_prodRelease(planListSnapshot), getProgressBar$bnpl_servicing_prodRelease(planListSnapshot), 2, null);
                    }
                    planListMapper$toAfterPurchasePlanModel$1.getHighSpeedVideoSizes = planListSnapshot;
                    planListMapper$toAfterPurchasePlanModel$1.Camera2StreamConfigurationMap = str;
                    planListMapper$toAfterPurchasePlanModel$1.getHighSpeedVideoFpsRanges = merchantLogoUrl;
                    planListMapper$toAfterPurchasePlanModel$1.getHighResolutionOutputSizeshNQ4ISI = afterPurchasePlanType;
                    planListMapper$toAfterPurchasePlanModel$1.getHighSpeedVideoFpsRangesFor = merchantName;
                    planListMapper$toAfterPurchasePlanModel$1.getHighSpeedVideoSizesFor = productName;
                    planListMapper$toAfterPurchasePlanModel$1.getInputFormats = 1;
                    java.lang.Object formattedAmount$bnpl_servicing_prodRelease = getFormattedAmount$bnpl_servicing_prodRelease(planListSnapshot, planListMapper$toAfterPurchasePlanModel$1);
                    if (formattedAmount$bnpl_servicing_prodRelease == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = merchantLogoUrl;
                    obj = formattedAmount$bnpl_servicing_prodRelease;
                    str4 = merchantName;
                    planListSnapshot2 = planListSnapshot;
                    str5 = productName;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (java.lang.String) planListMapper$toAfterPurchasePlanModel$1.getHighSpeedVideoSizesFor;
                    str4 = (java.lang.String) planListMapper$toAfterPurchasePlanModel$1.getHighSpeedVideoFpsRangesFor;
                    afterPurchasePlanType = (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType) planListMapper$toAfterPurchasePlanModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    str3 = (java.lang.String) planListMapper$toAfterPurchasePlanModel$1.getHighSpeedVideoFpsRanges;
                    str = (java.lang.String) planListMapper$toAfterPurchasePlanModel$1.Camera2StreamConfigurationMap;
                    planListSnapshot2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot) planListMapper$toAfterPurchasePlanModel$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str2 = (java.lang.String) obj;
                productName = str5;
                planListSnapshot = planListSnapshot2;
                merchantName = str4;
                return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str, null, str3, afterPurchasePlanType, merchantName, productName, str2, getPlanDescription$bnpl_servicing_prodRelease(planListSnapshot), getProgressBar$bnpl_servicing_prodRelease(planListSnapshot), 2, null);
            }
        }
        planListMapper$toAfterPurchasePlanModel$1 = new com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toAfterPurchasePlanModel$1(this, continuation);
        java.lang.Object obj2 = planListMapper$toAfterPurchasePlanModel$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planListMapper$toAfterPurchasePlanModel$1.getInputFormats;
        if (i != 0) {
        }
        str2 = (java.lang.String) obj2;
        productName = str5;
        planListSnapshot = planListSnapshot2;
        merchantName = str4;
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanModel(str, null, str3, afterPurchasePlanType, merchantName, productName, str2, getPlanDescription$bnpl_servicing_prodRelease(planListSnapshot), getProgressBar$bnpl_servicing_prodRelease(planListSnapshot), 2, null);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel getProgressBar$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListSnapshot, "");
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan onTrackPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan) planListSnapshot;
            return toBarModel$bnpl_servicing_prodRelease(onTrackPlan.getTotalInstallmentsPaid(), onTrackPlan.getTotalInstallmentsCount());
        }
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan pastDuePlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan) planListSnapshot;
            return toBarModel$bnpl_servicing_prodRelease(pastDuePlan.getTotalInstallmentsPaid(), pastDuePlan.getTotalInstallmentsCount());
        }
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan pendingPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan) planListSnapshot;
            return toBarModel$bnpl_servicing_prodRelease(pendingPlan.getTotalInstallmentsPaid(), pendingPlan.getTotalInstallmentsCount());
        }
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan completedPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) planListSnapshot;
            if (completedPlan.isRefundPending()) {
                return null;
            }
            return toBarModel$bnpl_servicing_prodRelease(completedPlan.getTotalInstallmentsPaid(), completedPlan.getTotalInstallmentsCount());
        }
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan delinquentPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan) planListSnapshot;
            return toBarModel$bnpl_servicing_prodRelease(delinquentPlan.getTotalInstallmentsPaid(), delinquentPlan.getTotalInstallmentsCount());
        }
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) {
            return null;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplservicing.LoggerKt.log;
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(planListSnapshot.getClass()).getSimpleName();
        com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logUnknownMapping(logger, simpleName != null ? simpleName : "");
        return null;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel toBarModel$bnpl_servicing_prodRelease(int totalInstallmentsPaid, int totalInstallmentsCount) {
        return new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentProgressBarModel(totalInstallmentsPaid, totalInstallmentsCount);
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getPlanDescription$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListSnapshot, "");
        if (planListSnapshot.getContextualLabel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.PENDING_FRAUD) {
            return this.getHighSpeedVideoSizes.getStatusInReview();
        }
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan onTrackPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan) planListSnapshot;
            if (onTrackPlan.isDueToday()) {
                return this.getHighSpeedVideoSizes.getDueToday();
            }
            java.lang.String nextPaymentDueDate = onTrackPlan.getNextPaymentDueDate();
            if (nextPaymentDueDate == null) {
                return null;
            }
            return this.getHighSpeedVideoSizes.nextPayment(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatDate$default(this.getHighSpeedVideoFpsRangesFor, nextPaymentDueDate, null, 2, null));
        }
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan completedPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan) planListSnapshot;
            return getCompleteOrMatureDescription$bnpl_servicing_prodRelease(completedPlan.isRefundPending(), completedPlan.getPlanCompletedDateTime());
        }
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan maturedPlan = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan) planListSnapshot;
            return getCompleteOrMatureDescription$bnpl_servicing_prodRelease(maturedPlan.isRefundPending(), maturedPlan.getPlanCompletedDateTime());
        }
        if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PendingPlan) {
            return this.getHighSpeedVideoSizes.getPending();
        }
        if (!(planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan) && !(planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan)) {
            if (planListSnapshot instanceof com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan) {
                return null;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.getHighSpeedVideoSizes.getPastDue();
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getCompleteOrMatureDescription$bnpl_servicing_prodRelease(boolean isRefundPending, java.lang.String date) {
        if (isRefundPending) {
            return this.getHighSpeedVideoSizes.getRefundPending();
        }
        if (date == null) {
            return null;
        }
        return this.getHighSpeedVideoSizes.completedOn(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatDate$default(this.getHighSpeedVideoFpsRangesFor, date, null, 2, null));
    }

    public final java.lang.Object getFormattedAmount$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot planListSnapshot, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String rawValue = planListSnapshot.getRawValue();
        if (rawValue.length() <= 0) {
            rawValue = null;
        }
        if (rawValue == null) {
            return null;
        }
        java.lang.Object formatCurrency$default = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.formatCurrency$default(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(planListSnapshot.getCurrencyCode(), com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers.INSTANCE.normalizeRefundAmount(rawValue, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanListHelpers.INSTANCE.isRefundPending(planListSnapshot))), null, 0, continuation, 6, null);
        return formatCurrency$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? formatCurrency$default : (java.lang.String) formatCurrency$default;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CONTACTLESS_MOBILE_WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CHECKOUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
