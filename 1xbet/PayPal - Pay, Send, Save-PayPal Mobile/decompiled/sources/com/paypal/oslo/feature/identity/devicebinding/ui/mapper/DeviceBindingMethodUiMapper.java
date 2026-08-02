package com.paypal.oslo.feature.identity.devicebinding.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/ui/mapper/DeviceBindingMethodUiMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "method", "", "getDisplayName", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeviceBindingMethodUiMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.devicebinding.ui.mapper.DeviceBindingMethodUiMapper INSTANCE = new com.paypal.oslo.feature.identity.devicebinding.ui.mapper.DeviceBindingMethodUiMapper();

    private DeviceBindingMethodUiMapper() {
    }

    public final java.lang.String getDisplayName(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return method.getDisplayName();
    }
}
