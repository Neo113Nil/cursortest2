package com.paypal.oslo.feature.checkcapture.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Data;", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;", "toSessionDetails", "(Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Data;)Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureMapperKt {
    public static final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails toSessionDetails(com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser = data.getAuthenticateCheckCaptureUser();
        if (authenticateCheckCaptureUser == null) {
            throw new java.lang.IllegalStateException("authenticateCheckCaptureUser is null".toString());
        }
        return new com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails(new com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer(authenticateCheckCaptureUser.getCustomer().getId(), com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus.INSTANCE.fromString(authenticateCheckCaptureUser.getCustomer().getStatus().getRawValue())), authenticateCheckCaptureUser.getSessionId(), authenticateCheckCaptureUser.getSsoToken());
    }
}
