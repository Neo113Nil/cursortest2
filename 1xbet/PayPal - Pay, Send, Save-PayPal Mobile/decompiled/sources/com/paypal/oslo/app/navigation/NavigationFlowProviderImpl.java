package com.paypal.oslo.app.navigation;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/app/navigation/NavigationFlowProviderImpl;", "Lcom/paypal/oslo/app/navigation/NavigationFlowProvider;", "Lcom/paypal/oslo/app/navigation/NavigationFlowSetter;", "<init>", "()V", "", "shouldAlwaysShowSMBFlow", "()Z", "enabled", "", "setAlwaysShowSMBFlow", "(Z)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationFlowProviderImpl implements com.paypal.oslo.app.navigation.NavigationFlowProvider, com.paypal.oslo.app.navigation.NavigationFlowSetter {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);

    @javax.inject.Inject
    public NavigationFlowProviderImpl() {
    }

    @Override // com.paypal.oslo.app.navigation.NavigationFlowProvider
    public final boolean shouldAlwaysShowSMBFlow() {
        return this.getHighSpeedVideoFpsRangesFor.getValue().booleanValue();
    }

    @Override // com.paypal.oslo.app.navigation.NavigationFlowSetter
    public final void setAlwaysShowSMBFlow(boolean enabled) {
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(enabled));
    }
}
