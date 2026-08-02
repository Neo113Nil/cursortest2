package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/PublicCancelFutureOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "Ljava/util/concurrent/Future;", "p0", "<init>", "(Ljava/util/concurrent/Future;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/Future;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PublicCancelFutureOnCancel implements kotlinx.coroutines.CancelHandler {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.Future<?> getHighSpeedVideoSizes;

    public PublicCancelFutureOnCancel(java.util.concurrent.Future<?> future) {
        this.getHighSpeedVideoSizes = future;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void invoke(java.lang.Throwable p0) {
        if (p0 != null) {
            this.getHighSpeedVideoSizes.cancel(false);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelFutureOnCancel[");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
