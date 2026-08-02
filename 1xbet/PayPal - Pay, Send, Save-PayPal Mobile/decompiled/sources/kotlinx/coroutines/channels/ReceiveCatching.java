package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/channels/ReceiveCatching;", "E", "Lkotlinx/coroutines/Waiter;", "Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlinx/coroutines/channels/ChannelResult;", "p0", "<init>", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "Lkotlinx/coroutines/internal/Segment;", "", "p1", "", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ReceiveCatching<E> implements kotlinx.coroutines.Waiter {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public final kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveCatching(kotlinx.coroutines.CancellableContinuationImpl<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> cancellableContinuationImpl) {
        this.getHighResolutionOutputSizeshNQ4ISI = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> p0, int p1) {
        this.getHighResolutionOutputSizeshNQ4ISI.invokeOnCancellation(p0, p1);
    }
}
