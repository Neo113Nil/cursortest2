package com.paypal.oslo.feature.identity.passkey.management.deletion.data;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DeletePasskeyInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/DeletePasskeyInput;", "toData", "(Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteRequest;)Lcom/paypal/oslo/api/graphql/schema/type/DeletePasskeyInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyDeleteInputBuilderKt {
    public static final com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput toData(com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteRequest passkeyDeleteRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyDeleteRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(passkeyDeleteRequest.getPasskeyCredentialId()), null, 5, null);
    }
}
