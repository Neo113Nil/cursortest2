package com.paypal.oslo.app.launch;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/app/launch/AppLaunchSourceTracker;", "Lcom/paypal/oslo/app/launch/AppLaunchSourceProvider;", "<init>", "()V", "Lcom/paypal/oslo/app/launch/AppLaunchSource;", "source", "", "setLaunchSource", "(Lcom/paypal/oslo/app/launch/AppLaunchSource;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "launchSource", "Lkotlinx/coroutines/flow/StateFlow;", "getLaunchSource", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppLaunchSourceTracker implements com.paypal.oslo.app.launch.AppLaunchSourceProvider {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.app.launch.AppLaunchSource> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.app.launch.AppLaunchSource> launchSource;

    @javax.inject.Inject
    public AppLaunchSourceTracker() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.app.launch.AppLaunchSource> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.launchSource = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.app.launch.AppLaunchSourceProvider
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.app.launch.AppLaunchSource> getLaunchSource() {
        return this.launchSource;
    }

    public final void setLaunchSource(com.paypal.oslo.app.launch.AppLaunchSource source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.app.LoggerKt.log, "Setting app launch source", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", source)), null, 4, null);
        this.getHighSpeedVideoFpsRanges.setValue(source);
    }
}
