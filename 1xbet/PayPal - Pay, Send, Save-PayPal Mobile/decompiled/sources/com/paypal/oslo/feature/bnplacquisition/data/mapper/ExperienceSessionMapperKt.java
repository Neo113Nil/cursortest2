package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/CreateBnplApplicationSessionMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ExperienceSession;", "toExperienceSession", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/CreateBnplApplicationSessionMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ExperienceSession;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExperienceSessionMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.ExperienceSession toExperienceSession(com.paypal.oslo.feature.bnplacquisition.graphql.CreateBnplApplicationSessionMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.CreateBnplApplicationSessionMutation.CreateBnplApplicationSession createBnplApplicationSession;
        if (data == null || (createBnplApplicationSession = data.getCreateBnplApplicationSession()) == null) {
            return null;
        }
        java.lang.Object id = createBnplApplicationSession.getId();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.ExperienceSession(id instanceof java.lang.String ? (java.lang.String) id : null);
    }
}
