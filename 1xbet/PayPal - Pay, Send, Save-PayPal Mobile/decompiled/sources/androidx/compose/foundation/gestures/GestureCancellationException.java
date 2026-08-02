package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/GestureCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/getHighSpeedVideoFpsRanges;", "", "message", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GestureCancellationException extends java.util.concurrent.CancellationException {
    public static final int $stable = 8;

    public GestureCancellationException(java.lang.String str) {
        super(str);
    }

    public /* synthetic */ GestureCancellationException(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GestureCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
