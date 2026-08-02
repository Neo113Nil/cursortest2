package kotlinx.serialization.encoding;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/ChunkedDecoder;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "chunk", "", "consumeChunk", "decodeStringChunked", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes5.dex */
public interface ChunkedDecoder {
    @kotlinx.serialization.ExperimentalSerializationApi
    void decodeStringChunked(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> consumeChunk);
}
