package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class ExperienceSessionRepositoryImpl$createExperienceSessionId$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.CreateBnplApplicationSessionMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.common.ExperienceSession> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl$createExperienceSessionId$2 getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl$createExperienceSessionId$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.common.ExperienceSession invoke(com.paypal.oslo.feature.bnplacquisition.graphql.CreateBnplApplicationSessionMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.ExperienceSessionMapperKt.toExperienceSession(data);
    }

    ExperienceSessionRepositoryImpl$createExperienceSessionId$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.ExperienceSessionMapperKt.class, "toExperienceSession", "toExperienceSession(Lcom/paypal/oslo/feature/bnplacquisition/graphql/CreateBnplApplicationSessionMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ExperienceSession;", 1);
    }
}
