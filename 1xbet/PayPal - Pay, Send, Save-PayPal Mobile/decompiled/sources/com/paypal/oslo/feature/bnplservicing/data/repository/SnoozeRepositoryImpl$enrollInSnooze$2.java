package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class SnoozeRepositoryImpl$enrollInSnooze$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.EnrollInBnplPlanProgramMutation.Data, com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl$enrollInSnooze$2 getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl$enrollInSnooze$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult invoke(com.paypal.oslo.feature.bnplservicing.graphql.EnrollInBnplPlanProgramMutation.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.snooze.SnoozeEnrollMapperKt.toSnoozeEnrollResult(data);
    }

    SnoozeRepositoryImpl$enrollInSnooze$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.snooze.SnoozeEnrollMapperKt.class, "toSnoozeEnrollResult", "toSnoozeEnrollResult(Lcom/paypal/oslo/feature/bnplservicing/graphql/EnrollInBnplPlanProgramMutation$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult;", 1);
    }
}
