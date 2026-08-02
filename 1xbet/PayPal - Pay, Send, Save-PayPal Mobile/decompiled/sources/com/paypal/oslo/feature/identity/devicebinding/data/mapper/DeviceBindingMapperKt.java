package com.paypal.oslo.feature.identity.devicebinding.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\u00060\u0006j\u0002`\u0007*\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingSource;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationFlowVariant;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticationFlowVariant;", "toGraphQL", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingSource;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationFlowVariant;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceBindAuthenticationMethod;", "Lcom/paypal/oslo/feature/identity/graphql/type/DeviceBindAuthenticationMethod;", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceBindAuthenticationMethod;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeviceBindingMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant toGraphQL(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource deviceBindingSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingSource, "");
        int i = com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMapperKt.WhenMappings.$EnumSwitchMapping$0[deviceBindingSource.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant.NATIVE_LOGIN;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant.APP_SETTINGS;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod toGraphQL(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAuthMethod, "");
        int i = com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMapperKt.WhenMappings.$EnumSwitchMapping$1[deviceAuthMethod.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.BIOMETRIC_FINGERPRINT;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.USER_PREVIEW;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource.NATIVE_LOGIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource.APP_SETTINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.values().length];
            try {
                iArr2[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
