package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "p0", "<init>", "(I)V", "", "Camera2StreamConfigurationMap", "(I)Z", "getHighSpeedVideoFpsRanges", "()Ljava/lang/Integer;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SubscriptionCountStateFlow extends kotlinx.coroutines.flow.SharedFlowImpl<java.lang.Integer> implements kotlinx.coroutines.flow.StateFlow<java.lang.Integer> {
    public SubscriptionCountStateFlow(int i) {
        super(1, Integer.MAX_VALUE, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST);
        tryEmit(java.lang.Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.coroutines.flow.StateFlow
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer getValue() {
        int intValue;
        synchronized (this) {
            intValue = getLastReplayedLocked().intValue();
        }
        return java.lang.Integer.valueOf(intValue);
    }

    public final boolean Camera2StreamConfigurationMap(int p0) {
        boolean tryEmit;
        synchronized (this) {
            tryEmit = tryEmit(java.lang.Integer.valueOf(getLastReplayedLocked().intValue() + p0));
        }
        return tryEmit;
    }
}
