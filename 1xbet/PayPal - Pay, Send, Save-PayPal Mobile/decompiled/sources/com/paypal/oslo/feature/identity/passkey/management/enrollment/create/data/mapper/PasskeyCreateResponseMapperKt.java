package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyCreateMutation$Data;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateSuccess;", "toDomain", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyCreateResponseMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess> toDomain(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data> graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.Data data = graphQLData.getData();
        com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation.CreatePasskey createPasskey = data != null ? data.getCreatePasskey() : null;
        if (createPasskey == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.MissingData.INSTANCE);
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess(createPasskey.getCredentialId(), createPasskey.getRawCredentialId()));
    }
}
