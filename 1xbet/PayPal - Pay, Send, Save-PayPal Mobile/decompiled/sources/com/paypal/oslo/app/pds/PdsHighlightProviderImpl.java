package com.paypal.oslo.app.pds;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/app/pds/PdsHighlightProviderImpl;", "Lcom/paypal/oslo/app/pds/PdsHighlightProvider;", "Lcom/paypal/oslo/app/pds/PdsHighlightSetter;", "<init>", "()V", "", "enabled", "", "setPdsHighlightEnabled", "(Z)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getEnabled", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PdsHighlightProviderImpl implements com.paypal.oslo.app.pds.PdsHighlightProvider, com.paypal.oslo.app.pds.PdsHighlightSetter {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> enabled;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PdsHighlightProviderImpl() {
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.enabled = MutableStateFlow;
    }

    @Override // com.paypal.oslo.app.pds.PdsHighlightProvider
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getEnabled() {
        return this.enabled;
    }

    @Override // com.paypal.oslo.app.pds.PdsHighlightSetter
    public final void setPdsHighlightEnabled(boolean enabled) {
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(enabled));
    }
}
