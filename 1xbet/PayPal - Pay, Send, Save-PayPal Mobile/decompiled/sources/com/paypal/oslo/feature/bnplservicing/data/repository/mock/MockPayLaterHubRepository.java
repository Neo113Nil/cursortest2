package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPayLaterHubRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/input/PayLaterHubInput;", "input", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubOverview;", "getOverview", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/input/PayLaterHubInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;", "plansInput", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", "getPlansSection", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$OnTrackPlan;", "getHighResolutionOutputSizeshNQ4ISI", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$OnTrackPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CompletedPlan;", "getHighSpeedVideoSizes", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$CompletedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$MaturedPlan;", "getInputFormats", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$MaturedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$DelinquentPlan;", "Camera2StreamConfigurationMap", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanListSnapshot$DelinquentPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialError;", "getHighSpeedVideoFpsRanges", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError$GraphQL$PartialError;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockPayLaterHubRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository.Companion(null);
    private static com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario scenario = com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario.NO_ACTIVE_PLANS_HISTORY_PARTIAL_ERROR;

    @javax.inject.Inject
    public MockPayLaterHubRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getOverview(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput payLaterHubInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository$getOverview$1 mockPayLaterHubRepository$getOverview$1;
        int i;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository$getOverview$1) {
            mockPayLaterHubRepository$getOverview$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository$getOverview$1) continuation;
            if ((mockPayLaterHubRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockPayLaterHubRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockPayLaterHubRepository$getOverview$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPayLaterHubRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPayLaterHubRepository$getOverview$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payLaterHubInput);
                    mockPayLaterHubRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockPayLaterHubRepository$getOverview$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                i2 = com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository.WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()];
                if (i2 != 1) {
                    return new arrow.core.Ior.Right(getHighSpeedVideoFpsRangesFor(this, null, null, false, 7));
                }
                if (i2 == 2) {
                    return new arrow.core.Ior.Both(kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRanges()), getHighSpeedVideoFpsRangesFor(this, kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI()), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan[]{getHighSpeedVideoSizes(), getInputFormats()}), false, 4));
                }
                if (i2 == 3) {
                    return new arrow.core.Ior.Both(kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRangesFor()), getHighSpeedVideoFpsRangesFor(this, null, kotlin.collections.CollectionsKt.emptyList(), false, 4));
                }
                if (i2 != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return new arrow.core.Ior.Both(kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRangesFor()), getHighSpeedVideoFpsRangesFor(this, kotlin.collections.CollectionsKt.listOf(Camera2StreamConfigurationMap()), null, false, 4));
            }
        }
        mockPayLaterHubRepository$getOverview$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository$getOverview$1(this, continuation);
        java.lang.Object obj2 = mockPayLaterHubRepository$getOverview$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPayLaterHubRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        i2 = com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository.WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()];
        if (i2 != 1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPlansSection(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansListInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository$getPlansSection$1 mockPayLaterHubRepository$getPlansSection$1;
        int i;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository$getPlansSection$1) {
            mockPayLaterHubRepository$getPlansSection$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository$getPlansSection$1) continuation;
            if ((mockPayLaterHubRepository$getPlansSection$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockPayLaterHubRepository$getPlansSection$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockPayLaterHubRepository$getPlansSection$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPayLaterHubRepository$getPlansSection$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPayLaterHubRepository$getPlansSection$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plansListInput);
                    mockPayLaterHubRepository$getPlansSection$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockPayLaterHubRepository$getPlansSection$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                i2 = com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository.WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()];
                if (i2 != 1) {
                    return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList(kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI()), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan[]{getHighSpeedVideoSizes(), getInputFormats()})), false, 2, null));
                }
                if (i2 == 2) {
                    return new arrow.core.Ior.Both(kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRanges()), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList(kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI()), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan[]{getHighSpeedVideoSizes(), getInputFormats()})), false, 2, null));
                }
                if (i2 == 3) {
                    return new arrow.core.Ior.Both(kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRangesFor()), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList(null, kotlin.collections.CollectionsKt.emptyList()), false, 2, null));
                }
                if (i2 != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return new arrow.core.Ior.Both(kotlin.collections.CollectionsKt.listOf(getHighSpeedVideoFpsRangesFor()), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList(kotlin.collections.CollectionsKt.listOf(Camera2StreamConfigurationMap()), null), false, 2, null));
            }
        }
        mockPayLaterHubRepository$getPlansSection$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository$getPlansSection$1(this, continuation);
        java.lang.Object obj2 = mockPayLaterHubRepository$getPlansSection$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPayLaterHubRepository$getPlansSection$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        i2 = com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository.WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()];
        if (i2 != 1) {
        }
    }

    private static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository mockPayLaterHubRepository, java.util.List list, java.util.List list2, boolean z, int i) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview("hub-account-123", com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList((i & 1) != 0 ? kotlin.collections.CollectionsKt.listOf(getHighResolutionOutputSizeshNQ4ISI()) : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan[]{getHighSpeedVideoSizes(), getInputFormats()}) : list2), false, 2, null), null, new com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "1500.00"), true, null, null, 12, null), null, (i & 4) != 0 ? true : z, 40, null);
    }

    private static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan getHighResolutionOutputSizeshNQ4ISI() {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan(2, 2, 4, true, "2025-12-10", new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields("hub-plan-active-123", com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US, new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.CREDIT_FINANCIAL_INSTRUMENT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CHECKOUT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.AUTOPAY_OPTIONAL), "https://example.com/apple.png", "Apple Store", "AirPods Pro", com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ON_TRACK, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "400.00"), com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.UNKNOWN));
    }

    private static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan getHighSpeedVideoSizes() {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan("2025-11-15T10:30:00Z", 4, 0, 4, false, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields("hub-plan-completed-456", com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US, new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.CREDIT_FINANCIAL_INSTRUMENT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CHECKOUT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.AUTOPAY_OPTIONAL), null, "Nike", "Running Shoes", com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.COMPLETED, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "120.00"), com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.UNKNOWN));
    }

    private static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan getInputFormats() {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan("2025-10-20T14:00:00Z", false, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields("hub-plan-matured-789", com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.CREDIT_FINANCIAL_INSTRUMENT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CHECKOUT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.AUTOPAY_OPTIONAL), null, "Best Buy", "MacBook Pro", com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.MATURED, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "999.00"), com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.UNKNOWN));
    }

    private static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan Camera2StreamConfigurationMap() {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan(2, 2, 2, 4, new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields("5c1006c4-a25a-4817-8149-9827c439e336", com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US, new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.CREDIT_FINANCIAL_INSTRUMENT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CHECKOUT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.AUTOPAY_REQUIRED), null, "ExampleStore", com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanTestTag.PAYMENT_PLAN, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.DELINQUENT, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "270.00"), com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.DELINQUENT));
    }

    private static com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError getHighSpeedVideoFpsRanges() {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLANS_OVERVIEW_ACTIVE, "Cannot read properties of undefined (reading '0')", kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_ACTIVE), new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, "crcacctaggregnodeserv", kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, "An internal server error has occurred.", null, null))));
    }

    private static com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError getHighSpeedVideoFpsRangesFor() {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialError(com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.PartialErrorType.PLANS_OVERVIEW_HISTORY, "Cannot read properties of undefined (reading '0')", kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PLANS_OVERVIEW_HISTORY), new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.GraphQLExtensions(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, "crcacctaggregnodeserv", kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError.GraphQL.ErrorDetail(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, "An internal server error has occurred.", null, null))));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPayLaterHubRepository$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/PayLaterHubMockScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/PayLaterHubMockScenario;", "getScenario", "()Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/PayLaterHubMockScenario;", "setScenario", "(Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/PayLaterHubMockScenario;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario getScenario() {
            return com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository.scenario;
        }

        public final void setScenario(com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario payLaterHubMockScenario) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubMockScenario, "");
            com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository.scenario = payLaterHubMockScenario;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario.ACTIVE_PLANS_PARTIAL_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario.NO_ACTIVE_PLANS_HISTORY_PARTIAL_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.data.repository.mock.PayLaterHubMockScenario.ACTIVE_PLANS_WITH_HISTORY_PARTIAL_ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
