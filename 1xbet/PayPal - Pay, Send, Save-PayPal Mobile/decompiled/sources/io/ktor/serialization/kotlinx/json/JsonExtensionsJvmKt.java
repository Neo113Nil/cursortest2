package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a2\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/serialization/json/Json;", "format", "Lio/ktor/utils/io/ByteReadChannel;", "content", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "Lkotlin/sequences/Sequence;", "", "deserializeSequence", "(Lkotlinx/serialization/json/Json;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class JsonExtensionsJvmKt {
    public static final java.lang.Object deserializeSequence(kotlinx.serialization.json.Json json, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.util.reflect.TypeInfo typeInfo, kotlin.coroutines.Continuation<? super kotlin.sequences.Sequence<? extends java.lang.Object>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2(byteReadChannel, typeInfo, json, null), continuation);
    }
}
