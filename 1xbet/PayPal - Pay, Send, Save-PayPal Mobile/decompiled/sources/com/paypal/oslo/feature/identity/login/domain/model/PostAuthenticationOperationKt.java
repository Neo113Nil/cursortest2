package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\"\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "toDeviceAuthMethod", "(Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;)Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "", "", "toAllowedDeviceAuthMethods", "(Ljava/util/List;)Ljava/util/Set;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PostAuthenticationOperationKt {
    public static final com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod toDeviceAuthMethod(com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation postAuthenticationOperation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthenticationOperation, "");
        int i = com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperationKt.WhenMappings.$EnumSwitchMapping$0[postAuthenticationOperation.getType().ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS;
        }
        if (i == 2 || i == 3 || i == 4) {
            return com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC;
        }
        if (i == 5) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final java.util.Set<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> toAllowedDeviceAuthMethods(java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = toDeviceAuthMethod((com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation) it.next());
            if (deviceAuthMethod != null) {
                arrayList.add(deviceAuthMethod);
            }
        }
        return kotlin.collections.CollectionsKt.toSet(arrayList);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.USER_PREVIEW_BIND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.BIOMETRIC_DEVICE_AUTH_BIND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.BIOMETRIC_FINGERPRINT_BIND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.BIOMETRIC_FACE_ID_BIND.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.PostAuthOperationType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
