package io.ktor.util.cio;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/util/cio/ChannelWriteException;", "Lio/ktor/util/cio/ChannelIOException;", "", "message", "", "exception", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ChannelWriteException extends io.ktor.util.cio.ChannelIOException {
    public /* synthetic */ ChannelWriteException(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Cannot write to channel" : str, th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelWriteException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
    }
}
