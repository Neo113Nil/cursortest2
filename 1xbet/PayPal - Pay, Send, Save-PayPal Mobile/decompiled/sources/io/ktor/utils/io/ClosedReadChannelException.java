package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/utils/io/ClosedReadChannelException;", "Lio/ktor/utils/io/ClosedByteChannelException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ClosedReadChannelException extends io.ktor.utils.io.ClosedByteChannelException {
    public ClosedReadChannelException(java.lang.Throwable th) {
        super(th);
    }

    public /* synthetic */ ClosedReadChannelException(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClosedReadChannelException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
