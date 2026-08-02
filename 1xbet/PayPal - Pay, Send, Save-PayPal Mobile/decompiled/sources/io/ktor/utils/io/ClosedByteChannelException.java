package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/utils/io/ClosedByteChannelException;", "Ljava/io/IOException;", "Lkotlinx/io/getHighResolutionOutputSizeshNQ4ISI;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ClosedByteChannelException extends java.io.IOException {
    public ClosedByteChannelException(java.lang.Throwable th) {
        super(th != null ? th.getMessage() : null, th);
    }

    public /* synthetic */ ClosedByteChannelException(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClosedByteChannelException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
