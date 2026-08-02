package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PlanDetailsOverviewRepositoryImpl$getPlanDetailsOverview$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Data, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl$getPlanDetailsOverview$2 getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl$getPlanDetailsOverview$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview invoke(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanDetailsOverviewMapperKt.toPlanDetailsOverview(data);
    }

    PlanDetailsOverviewRepositoryImpl$getPlanDetailsOverview$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanDetailsOverviewMapperKt.class, "toPlanDetailsOverview", "toPlanDetailsOverview(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetailsOverview;", 1);
    }
}
