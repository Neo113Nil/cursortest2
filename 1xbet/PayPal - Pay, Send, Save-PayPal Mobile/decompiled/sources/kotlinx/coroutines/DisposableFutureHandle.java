package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/coroutines/DisposableFutureHandle;", "Lkotlinx/coroutines/DisposableHandle;", "Ljava/util/concurrent/Future;", "p0", "<init>", "(Ljava/util/concurrent/Future;)V", "", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/Future;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DisposableFutureHandle implements kotlinx.coroutines.DisposableHandle {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.Future<?> Camera2StreamConfigurationMap;

    public DisposableFutureHandle(java.util.concurrent.Future<?> future) {
        this.Camera2StreamConfigurationMap = future;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        this.Camera2StreamConfigurationMap.cancel(false);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisposableFutureHandle[");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
