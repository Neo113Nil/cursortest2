package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lkotlinx/serialization/internal/UShortArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UShortArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UShort;", "Lkotlinx/serialization/internal/UShortArrayBuilder;", "<init>", "()V", "", "collectionSize-rL5Bavg", "([S)I", "collectionSize", "toBuilder-rL5Bavg", "([S)Lkotlinx/serialization/internal/UShortArrayBuilder;", "toBuilder", "empty-amswpOA", "()[S", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/UShortArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", io.ktor.http.ContentDisposition.Parameters.Size, "writeContent-eny0XGE", "(Lkotlinx/serialization/encoding/CompositeEncoder;[SI)V", "writeContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes5.dex */
public final class UShortArraySerializer extends kotlinx.serialization.internal.PrimitiveArraySerializer<kotlin.UShort, kotlin.UShortArray, kotlinx.serialization.internal.UShortArrayBuilder> implements kotlinx.serialization.KSerializer<kotlin.UShortArray> {
    public static final kotlinx.serialization.internal.UShortArraySerializer INSTANCE = new kotlinx.serialization.internal.UShortArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final /* synthetic */ int collectionSize(java.lang.Object obj) {
        return m24249collectionSizerL5Bavg(((kotlin.UShortArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final /* synthetic */ kotlin.UShortArray empty() {
        return kotlin.UShortArray.m23524boximpl(m24250emptyamswpOA());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final /* synthetic */ java.lang.Object toBuilder(java.lang.Object obj) {
        return m24251toBuilderrL5Bavg(((kotlin.UShortArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final /* synthetic */ void writeContent(kotlinx.serialization.encoding.CompositeEncoder compositeEncoder, kotlin.UShortArray uShortArray, int i) {
        m24252writeContenteny0XGE(compositeEncoder, uShortArray.getGetHighSpeedVideoFpsRanges(), i);
    }

    private UShortArraySerializer() {
        super(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UShort.INSTANCE));
    }

    /* renamed from: collectionSize-rL5Bavg, reason: not valid java name */
    protected final int m24249collectionSizerL5Bavg(short[] sArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
        return kotlin.UShortArray.m23532getSizeimpl(sArr);
    }

    /* renamed from: toBuilder-rL5Bavg, reason: not valid java name */
    protected final kotlinx.serialization.internal.UShortArrayBuilder m24251toBuilderrL5Bavg(short[] sArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
        return new kotlinx.serialization.internal.UShortArrayBuilder(sArr, null);
    }

    /* renamed from: empty-amswpOA, reason: not valid java name */
    protected final short[] m24250emptyamswpOA() {
        return kotlin.UShortArray.m23525constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void readElement(kotlinx.serialization.encoding.CompositeDecoder decoder, int index, kotlinx.serialization.internal.UShortArrayBuilder builder, boolean checkIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.m24247appendxj2QHRw$kotlinx_serialization_core(kotlin.UShort.m23518constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeShort()));
    }

    /* renamed from: writeContent-eny0XGE, reason: not valid java name */
    protected final void m24252writeContenteny0XGE(kotlinx.serialization.encoding.CompositeEncoder encoder, short[] content, int size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeShort(kotlin.UShortArray.m23531getMh2AYeg(content, i));
        }
    }
}
