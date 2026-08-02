package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PayLaterHubRepositoryImpl$getPlansOverview$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.GetPlansOverviewQuery.Data, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getPlansOverview$2 getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getPlansOverview$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview invoke(com.paypal.oslo.feature.bnplservicing.graphql.GetPlansOverviewQuery.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.plansOverview.PlansOverviewMapperKt.toPlanList(data);
    }

    PayLaterHubRepositoryImpl$getPlansOverview$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.plansOverview.PlansOverviewMapperKt.class, "toPlanList", "toPlanList(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetPlansOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", 1);
    }
}
