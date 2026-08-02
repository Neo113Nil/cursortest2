package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/io/RawSource;", "Lkotlinx/io/Source;", "buffered", "(Lkotlinx/io/RawSource;)Lkotlinx/io/Source;", "Lkotlinx/io/RawSink;", "Lkotlinx/io/Sink;", "(Lkotlinx/io/RawSink;)Lkotlinx/io/Sink;", "discardingSink", "()Lkotlinx/io/RawSink;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoreKt {
    public static final kotlinx.io.Source buffered(kotlinx.io.RawSource rawSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawSource, "");
        return new kotlinx.io.RealSource(rawSource);
    }

    public static final kotlinx.io.Sink buffered(kotlinx.io.RawSink rawSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawSink, "");
        return new kotlinx.io.RealSink(rawSink);
    }

    public static final kotlinx.io.RawSink discardingSink() {
        return new kotlinx.io.DiscardingSink();
    }
}
