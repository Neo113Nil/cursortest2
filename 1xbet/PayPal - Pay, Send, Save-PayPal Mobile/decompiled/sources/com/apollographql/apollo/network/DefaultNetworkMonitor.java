package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0016R\u0015\u0010\u0019\u001a\u00020\u00048CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/apollographql/apollo/network/DefaultNetworkMonitor;", "Lcom/apollographql/apollo/network/NetworkMonitor;", "Lcom/apollographql/apollo/network/NetworkObserver$Listener;", "Lkotlin/Function0;", "Lcom/apollographql/apollo/network/NetworkObserver;", "networkObserverFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "close", "()V", "", "isOnline", "networkChanged", "(Z)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultNetworkMonitor implements com.apollographql.apollo.network.NetworkMonitor, com.apollographql.apollo.network.NetworkObserver.Listener {
    private final kotlin.jvm.functions.Function0<com.apollographql.apollo.network.NetworkObserver> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultNetworkMonitor(kotlin.jvm.functions.Function0<? extends com.apollographql.apollo.network.NetworkObserver> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.DefaultNetworkMonitor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.network.DefaultNetworkMonitor.m9977$r8$lambda$rnq6fjj7UW1AX4BMG6AUZySAA(com.apollographql.apollo.network.DefaultNetworkMonitor.this);
            }
        });
    }

    @Override // com.apollographql.apollo.network.NetworkObserver.Listener
    public final void networkChanged(boolean isOnline) {
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(isOnline));
    }

    /* renamed from: $r8$lambda$rnq6fjj7UW1AX4-BM-G6AUZySAA, reason: not valid java name */
    public static /* synthetic */ com.apollographql.apollo.network.NetworkObserver m9977$r8$lambda$rnq6fjj7UW1AX4BMG6AUZySAA(com.apollographql.apollo.network.DefaultNetworkMonitor defaultNetworkMonitor) {
        com.apollographql.apollo.network.NetworkObserver invoke = defaultNetworkMonitor.Camera2StreamConfigurationMap.invoke();
        invoke.setListener(defaultNetworkMonitor);
        return invoke;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((com.apollographql.apollo.network.NetworkObserver) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).close();
    }

    @Override // com.apollographql.apollo.network.NetworkMonitor
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isOnline() {
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(this.getHighSpeedVideoSizes);
    }
}
