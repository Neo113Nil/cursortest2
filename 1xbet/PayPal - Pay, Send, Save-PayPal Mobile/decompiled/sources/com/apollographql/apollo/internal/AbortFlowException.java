package com.apollographql.apollo.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/apollographql/apollo/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "Lkotlinx/coroutines/flow/FlowCollector;", "p0", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/FlowCollector;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AbortFlowException extends java.util.concurrent.CancellationException {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final kotlinx.coroutines.flow.FlowCollector<?> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortFlowException(kotlinx.coroutines.flow.FlowCollector<?> flowCollector) {
        super("Flow was aborted, no more elements needed");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowCollector, "");
        this.getHighSpeedVideoSizes = flowCollector;
    }
}
