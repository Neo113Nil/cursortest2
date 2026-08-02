package com.paypal.oslo.feature.identity.deviceunbinding.data.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0007*\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingInput;", "Lcom/paypal/oslo/api/graphql/schema/type/UnbindAuthenticationDeviceInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/UnbindAuthenticationDeviceInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingInput;)Lcom/paypal/oslo/api/graphql/schema/type/UnbindAuthenticationDeviceInput;", "Lcom/paypal/oslo/feature/identity/graphql/UnbindAuthenticationDeviceMutation$UnbindAuthenticationDevice;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingOutput;", "toDomainOutput", "(Lcom/paypal/oslo/feature/identity/graphql/UnbindAuthenticationDeviceMutation$UnbindAuthenticationDevice;)Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "toDomainError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeviceUnbindingDataMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.UnbindAuthenticationDeviceInput toGraphQLInput(com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingInput deviceUnbindingInput) {
        com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod deviceBindAuthenticationMethod;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceUnbindingInput, "");
        int i = com.paypal.oslo.feature.identity.deviceunbinding.data.mapper.DeviceUnbindingDataMapperKt.WhenMappings.$EnumSwitchMapping$0[deviceUnbindingInput.getMethod().ordinal()];
        if (i == 1) {
            deviceBindAuthenticationMethod = com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.BIOMETRIC_DEVICEAUTH;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            deviceBindAuthenticationMethod = com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.USER_PREVIEW;
        }
        return new com.paypal.oslo.api.graphql.schema.type.UnbindAuthenticationDeviceInput(deviceBindAuthenticationMethod);
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError, com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingOutput> toDomainOutput(com.paypal.oslo.feature.identity.graphql.UnbindAuthenticationDeviceMutation.UnbindAuthenticationDevice unbindAuthenticationDevice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unbindAuthenticationDevice, "");
        java.lang.Boolean success = unbindAuthenticationDevice.getSuccess();
        if (success == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.InvalidServerResponse.INSTANCE);
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingOutput(success.booleanValue(), unbindAuthenticationDevice.getMessage()));
    }

    public static final com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError toDomainError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.graphql.error.CallError.Network network = (com.paypal.oslo.core.network.graphql.error.CallError.Network) callError;
            java.lang.String obj = network.getError().toString();
            com.paypal.oslo.core.network.http.error.NetworkError error = network.getError();
            com.paypal.oslo.core.network.http.error.NetworkError.UnknownError unknownError = error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError ? (com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error : null;
            return new com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Network(obj, unknownError != null ? unknownError.getCause() : null);
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.Server(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
