package kotlinx.coroutines.stream;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ljava/util/stream/Stream;", "Lkotlinx/coroutines/flow/Flow;", "consumeAsFlow", "(Ljava/util/stream/Stream;)Lkotlinx/coroutines/flow/Flow;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StreamKt {
    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(java.util.stream.Stream<T> stream) {
        return new kotlinx.coroutines.stream.StreamFlow(stream);
    }
}
