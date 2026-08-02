package com.paypal.oslo.app.network;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/app/network/ChuckerConfigImpl;", "Lcom/paypal/oslo/app/network/ChuckerConfig;", "Lcom/paypal/oslo/app/network/ChuckerSetter;", "<init>", "()V", "", "enabled", "", "setEnabled", "(Z)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "isEnabled", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChuckerConfigImpl implements com.paypal.oslo.app.network.ChuckerConfig, com.paypal.oslo.app.network.ChuckerSetter {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> Camera2StreamConfigurationMap = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);

    @javax.inject.Inject
    public ChuckerConfigImpl() {
    }

    @Override // com.paypal.oslo.app.network.ChuckerConfig
    public final boolean isEnabled() {
        return this.Camera2StreamConfigurationMap.getValue().booleanValue();
    }

    @Override // com.paypal.oslo.app.network.ChuckerSetter
    public final void setEnabled(boolean enabled) {
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(enabled));
    }
}
