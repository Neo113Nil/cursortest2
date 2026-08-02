package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00120\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00120\n2\u0006\u0010\u0015\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/PayLaterHubRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/input/PayLaterHubInput;", "input", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubOverview;", "getOverview", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/input/PayLaterHubInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;", "p0", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plansInput", "getPlansSection", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "p1", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;)Ljava/util/List;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayLaterHubRepositoryImpl extends com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayLaterHubRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$getReadyToUsePlans(com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepositoryImpl, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansListInput, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getReadyToUsePlans$1 payLaterHubRepositoryImpl$getReadyToUsePlans$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getReadyToUsePlans$1) {
            payLaterHubRepositoryImpl$getReadyToUsePlans$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getReadyToUsePlans$1) continuation;
            if ((payLaterHubRepositoryImpl$getReadyToUsePlans$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                payLaterHubRepositoryImpl$getReadyToUsePlans$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = payLaterHubRepositoryImpl$getReadyToUsePlans$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payLaterHubRepositoryImpl$getReadyToUsePlans$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    payLaterHubRepositoryImpl$getReadyToUsePlans$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plansListInput);
                    payLaterHubRepositoryImpl$getReadyToUsePlans$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = payLaterHubRepositoryImpl.getHighSpeedVideoFpsRanges(plansListInput, payLaterHubRepositoryImpl$getReadyToUsePlans$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview) ((arrow.core.Ior.Right) ior).getValue();
                    return new arrow.core.Ior.Right(plansOverview != null ? plansOverview.getPlans() : null);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview) both.getRightValue();
                return new arrow.core.Ior.Both(leftValue, plansOverview2 != null ? plansOverview2.getPlans() : null);
            }
        }
        payLaterHubRepositoryImpl$getReadyToUsePlans$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getReadyToUsePlans$1(payLaterHubRepositoryImpl, continuation);
        java.lang.Object obj2 = payLaterHubRepositoryImpl$getReadyToUsePlans$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payLaterHubRepositoryImpl$getReadyToUsePlans$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository
    public final java.lang.Object getOverview(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput payLaterHubInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview>> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2(payLaterHubInput, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansListInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview>> continuation) {
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.bnplservicing.graphql.GetPlansOverviewQuery(com.paypal.oslo.feature.bnplservicing.data.mapper.plansOverview.PlansOverviewMapperKt.toBNPLPlansInput(plansListInput.getActivePlansInput()), com.paypal.oslo.feature.bnplservicing.data.mapper.plansOverview.PlansOverviewMapperKt.toBNPLPlansInput(plansListInput.getHistoryPlansInput()), plansListInput.getIncludeActive(), plansListInput.getIncludeHistory()), com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getPlansOverview$2.getHighSpeedVideoSizes, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED), continuation, 4, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPlansSection(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansListInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getPlansSection$1 payLaterHubRepositoryImpl$getPlansSection$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getPlansSection$1) {
            payLaterHubRepositoryImpl$getPlansSection$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getPlansSection$1) continuation;
            if ((payLaterHubRepositoryImpl$getPlansSection$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                payLaterHubRepositoryImpl$getPlansSection$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = payLaterHubRepositoryImpl$getPlansSection$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payLaterHubRepositoryImpl$getPlansSection$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    payLaterHubRepositoryImpl$getPlansSection$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plansListInput);
                    payLaterHubRepositoryImpl$getPlansSection$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getHighSpeedVideoFpsRanges(plansListInput, payLaterHubRepositoryImpl$getPlansSection$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) ((arrow.core.Ior.Left) ior).getValue(), com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.PLANS_OVERVIEW));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return ior;
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                return new arrow.core.Ior.Both(getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) both.getLeftValue(), com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.PLANS_OVERVIEW), both.getRightValue());
            }
        }
        payLaterHubRepositoryImpl$getPlansSection$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getPlansSection$1(this, continuation);
        java.lang.Object obj2 = payLaterHubRepositoryImpl$getPlansSection$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payLaterHubRepositoryImpl$getPlansSection$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> getHighSpeedVideoFpsRanges(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> p0, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource p1) {
        java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> list = p0;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network network : list) {
            if (network instanceof com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network) {
                network = ((com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.Network) network).withSource$bnpl_servicing_prodRelease(p1);
            }
            arrayList.add(network);
        }
        return arrayList;
    }

    public static final /* synthetic */ arrow.core.Ior access$combineResults(com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepositoryImpl, arrow.core.Ior ior, arrow.core.Ior ior2, arrow.core.Ior ior3, arrow.core.Ior ior4) {
        boolean z = (ior instanceof arrow.core.Ior.Right) && (ior2 instanceof arrow.core.Ior.Right) && (ior3 instanceof arrow.core.Ior.Right) && (ior4 instanceof arrow.core.Ior.Right);
        boolean z2 = (ior instanceof arrow.core.Ior.Left) && (ior2 instanceof arrow.core.Ior.Left) && (ior3 instanceof arrow.core.Ior.Left) && (ior4 instanceof arrow.core.Ior.Left);
        if (z) {
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview) ior.getOrNull();
            return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview(null, null, plansOverview, (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList) ior2.getOrNull(), (com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount) ior3.getOrNull(), (com.paypal.oslo.feature.bnplservicing.domain.model.application.ApplicationEligibility) ior4.getOrNull(), plansOverview != null ? plansOverview.getHasEverUsedBnpl() : true, 3, null));
        }
        if (z2) {
            java.util.List list = (java.util.List) ior.leftOrNull();
            if (list == null) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) list, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.PLANS_OVERVIEW);
            java.util.List list2 = (java.util.List) ior2.leftOrNull();
            if (list2 == null) {
                list2 = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) list2, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.READY_TO_USE_PLANS);
            java.util.List list3 = (java.util.List) ior3.leftOrNull();
            if (list3 == null) {
                list3 = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) list3, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.PREQUALIFICATION_SUMMARY);
            java.util.List list4 = (java.util.List) ior4.leftOrNull();
            if (list4 == null) {
                list4 = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) list4, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.APPLICATION_ELIGIBILITY);
            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) highSpeedVideoFpsRanges, (java.lang.Iterable) highSpeedVideoFpsRanges2), (java.lang.Iterable) highSpeedVideoFpsRanges3), (java.lang.Iterable) highSpeedVideoFpsRanges4);
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "PayLaterHub: All queries failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("plansErrorCount", java.lang.Integer.valueOf(highSpeedVideoFpsRanges.size())), kotlin.TuplesKt.to("readyToUsePlansErrorCount", java.lang.Integer.valueOf(highSpeedVideoFpsRanges2.size())), kotlin.TuplesKt.to("prequalErrorCount", java.lang.Integer.valueOf(highSpeedVideoFpsRanges3.size())), kotlin.TuplesKt.to("applicationEligibilityErrorCount", java.lang.Integer.valueOf(highSpeedVideoFpsRanges4.size()))), null, 4, null);
            return new arrow.core.Ior.Left(plus);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview plansOverview2 = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview) ior.getOrNull();
        com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview payLaterHubOverview = new com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview(null, null, plansOverview2, (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList) ior2.getOrNull(), (com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount) ior3.getOrNull(), (com.paypal.oslo.feature.bnplservicing.domain.model.application.ApplicationEligibility) ior4.getOrNull(), plansOverview2 != null ? plansOverview2.getHasEverUsedBnpl() : true, 3, null);
        java.util.List list5 = (java.util.List) ior.leftOrNull();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> highSpeedVideoFpsRanges5 = list5 != null ? getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) list5, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.PLANS_OVERVIEW) : null;
        if (highSpeedVideoFpsRanges5 == null) {
            highSpeedVideoFpsRanges5 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list6 = (java.util.List) ior2.leftOrNull();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> highSpeedVideoFpsRanges6 = list6 != null ? getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) list6, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.READY_TO_USE_PLANS) : null;
        if (highSpeedVideoFpsRanges6 == null) {
            highSpeedVideoFpsRanges6 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list7 = (java.util.List) ior3.leftOrNull();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> highSpeedVideoFpsRanges7 = list7 != null ? getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) list7, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.PREQUALIFICATION_SUMMARY) : null;
        if (highSpeedVideoFpsRanges7 == null) {
            highSpeedVideoFpsRanges7 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list8 = (java.util.List) ior4.leftOrNull();
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> highSpeedVideoFpsRanges8 = list8 != null ? getHighSpeedVideoFpsRanges((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>) list8, com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.APPLICATION_ELIGIBILITY) : null;
        if (highSpeedVideoFpsRanges8 == null) {
            highSpeedVideoFpsRanges8 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List plus2 = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) highSpeedVideoFpsRanges5, (java.lang.Iterable) highSpeedVideoFpsRanges6), (java.lang.Iterable) highSpeedVideoFpsRanges7), (java.lang.Iterable) highSpeedVideoFpsRanges8);
        if (!plus2.isEmpty()) {
            return new arrow.core.Ior.Both(plus2, payLaterHubOverview);
        }
        return new arrow.core.Ior.Right(payLaterHubOverview);
    }

    public static final /* synthetic */ java.lang.Object access$getApplicationEligibility(com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepositoryImpl, com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput applicationEligibilityInput, kotlin.coroutines.Continuation continuation) {
        com.apollographql.apollo.ApolloClient apolloClient = payLaterHubRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository.fetchData$default(payLaterHubRepositoryImpl, apolloClient, new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplApplicationEligibilityQuery(com.paypal.oslo.feature.bnplservicing.data.mapper.application.ApplicationEligibilityInputMapperKt.toGraphQLInput(applicationEligibilityInput)), com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getApplicationEligibility$2.getHighResolutionOutputSizeshNQ4ISI, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, payLaterHubRepositoryImpl.createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED), continuation, 4, (java.lang.Object) null);
    }

    public static final /* synthetic */ java.lang.Object access$getPrequalificationSummary(com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepositoryImpl, com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput payLaterHubInput, kotlin.coroutines.Continuation continuation) {
        com.apollographql.apollo.ApolloClient apolloClient = payLaterHubRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository.fetchData$default(payLaterHubRepositoryImpl, apolloClient, new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery(com.paypal.oslo.feature.bnplservicing.data.mapper.prequal.PrequalifiedAmountMapperKt.toPrequalificationSummaryInput(payLaterHubInput.getPrequalProductIdentifiers())), com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getPrequalificationSummary$2.getHighSpeedVideoFpsRangesFor, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, payLaterHubRepositoryImpl.createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED), continuation, 4, (java.lang.Object) null);
    }
}
