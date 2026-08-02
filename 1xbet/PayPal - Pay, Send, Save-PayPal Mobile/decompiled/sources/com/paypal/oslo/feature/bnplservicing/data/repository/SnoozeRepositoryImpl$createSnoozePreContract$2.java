package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class SnoozeRepositoryImpl$createSnoozePreContract$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data, com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozePreContractOverview> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl$createSnoozePreContract$2 getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl$createSnoozePreContract$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozePreContractOverview invoke(com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.snooze.SnoozePreContractMapperKt.toSnoozePreContractOverview(data);
    }

    SnoozeRepositoryImpl$createSnoozePreContract$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.snooze.SnoozePreContractMapperKt.class, "toSnoozePreContractOverview", "toSnoozePreContractOverview(Lcom/paypal/oslo/feature/bnplservicing/graphql/CreateSnoozePreContractMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozePreContractOverview;", 1);
    }
}
