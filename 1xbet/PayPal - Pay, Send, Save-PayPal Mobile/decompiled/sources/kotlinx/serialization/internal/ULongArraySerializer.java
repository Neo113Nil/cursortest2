package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lkotlinx/serialization/internal/ULongArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ULongArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/ULong;", "Lkotlinx/serialization/internal/ULongArrayBuilder;", "<init>", "()V", "", "collectionSize-QwZRm1k", "([J)I", "collectionSize", "toBuilder-QwZRm1k", "([J)Lkotlinx/serialization/internal/ULongArrayBuilder;", "toBuilder", "empty-Y2RjT0g", "()[J", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/ULongArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", io.ktor.http.ContentDisposition.Parameters.Size, "writeContent-0q3Fkuo", "(Lkotlinx/serialization/encoding/CompositeEncoder;[JI)V", "writeContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes5.dex */
public final class ULongArraySerializer extends kotlinx.serialization.internal.PrimitiveArraySerializer<kotlin.ULong, kotlin.ULongArray, kotlinx.serialization.internal.ULongArrayBuilder> implements kotlinx.serialization.KSerializer<kotlin.ULongArray> {
    public static final kotlinx.serialization.internal.ULongArraySerializer INSTANCE = new kotlinx.serialization.internal.ULongArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final /* synthetic */ int collectionSize(java.lang.Object obj) {
        return m24241collectionSizeQwZRm1k(((kotlin.ULongArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final /* synthetic */ kotlin.ULongArray empty() {
        return kotlin.ULongArray.m23500boximpl(m24242emptyY2RjT0g());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final /* synthetic */ java.lang.Object toBuilder(java.lang.Object obj) {
        return m24243toBuilderQwZRm1k(((kotlin.ULongArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final /* synthetic */ void writeContent(kotlinx.serialization.encoding.CompositeEncoder compositeEncoder, kotlin.ULongArray uLongArray, int i) {
        m24244writeContent0q3Fkuo(compositeEncoder, uLongArray.getGetHighSpeedVideoFpsRanges(), i);
    }

    private ULongArraySerializer() {
        super(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.ULong.INSTANCE));
    }

    /* renamed from: collectionSize-QwZRm1k, reason: not valid java name */
    protected final int m24241collectionSizeQwZRm1k(long[] jArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
        return kotlin.ULongArray.m23508getSizeimpl(jArr);
    }

    /* renamed from: toBuilder-QwZRm1k, reason: not valid java name */
    protected final kotlinx.serialization.internal.ULongArrayBuilder m24243toBuilderQwZRm1k(long[] jArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
        return new kotlinx.serialization.internal.ULongArrayBuilder(jArr, null);
    }

    /* renamed from: empty-Y2RjT0g, reason: not valid java name */
    protected final long[] m24242emptyY2RjT0g() {
        return kotlin.ULongArray.m23501constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void readElement(kotlinx.serialization.encoding.CompositeDecoder decoder, int index, kotlinx.serialization.internal.ULongArrayBuilder builder, boolean checkIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.m24239appendVKZWuLQ$kotlinx_serialization_core(kotlin.ULong.m23494constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeLong()));
    }

    /* renamed from: writeContent-0q3Fkuo, reason: not valid java name */
    protected final void m24244writeContent0q3Fkuo(kotlinx.serialization.encoding.CompositeEncoder encoder, long[] content, int size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeLong(kotlin.ULongArray.m23507getsVKNKU(content, i));
        }
    }
}
