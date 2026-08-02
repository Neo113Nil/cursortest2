package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lkotlinx/serialization/internal/UIntArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UIntArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UInt;", "Lkotlinx/serialization/internal/UIntArrayBuilder;", "<init>", "()V", "", "collectionSize--ajY-9A", "([I)I", "collectionSize", "toBuilder--ajY-9A", "([I)Lkotlinx/serialization/internal/UIntArrayBuilder;", "toBuilder", "empty--hP7Qyg", "()[I", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/UIntArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", io.ktor.http.ContentDisposition.Parameters.Size, "writeContent-CPlH8fI", "(Lkotlinx/serialization/encoding/CompositeEncoder;[II)V", "writeContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes5.dex */
public final class UIntArraySerializer extends kotlinx.serialization.internal.PrimitiveArraySerializer<kotlin.UInt, kotlin.UIntArray, kotlinx.serialization.internal.UIntArrayBuilder> implements kotlinx.serialization.KSerializer<kotlin.UIntArray> {
    public static final kotlinx.serialization.internal.UIntArraySerializer INSTANCE = new kotlinx.serialization.internal.UIntArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final /* synthetic */ int collectionSize(java.lang.Object obj) {
        return m24233collectionSizeajY9A(((kotlin.UIntArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final /* synthetic */ kotlin.UIntArray empty() {
        return kotlin.UIntArray.m23476boximpl(m24234emptyhP7Qyg());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final /* synthetic */ java.lang.Object toBuilder(java.lang.Object obj) {
        return m24235toBuilderajY9A(((kotlin.UIntArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final /* synthetic */ void writeContent(kotlinx.serialization.encoding.CompositeEncoder compositeEncoder, kotlin.UIntArray uIntArray, int i) {
        m24236writeContentCPlH8fI(compositeEncoder, uIntArray.getGetHighSpeedVideoFpsRanges(), i);
    }

    private UIntArraySerializer() {
        super(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UInt.INSTANCE));
    }

    /* renamed from: collectionSize--ajY-9A, reason: not valid java name */
    protected final int m24233collectionSizeajY9A(int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        return kotlin.UIntArray.m23484getSizeimpl(iArr);
    }

    /* renamed from: toBuilder--ajY-9A, reason: not valid java name */
    protected final kotlinx.serialization.internal.UIntArrayBuilder m24235toBuilderajY9A(int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        return new kotlinx.serialization.internal.UIntArrayBuilder(iArr, null);
    }

    /* renamed from: empty--hP7Qyg, reason: not valid java name */
    protected final int[] m24234emptyhP7Qyg() {
        return kotlin.UIntArray.m23477constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void readElement(kotlinx.serialization.encoding.CompositeDecoder decoder, int index, kotlinx.serialization.internal.UIntArrayBuilder builder, boolean checkIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.m24231appendWZ4Q5Ns$kotlinx_serialization_core(kotlin.UInt.m23470constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeInt()));
    }

    /* renamed from: writeContent-CPlH8fI, reason: not valid java name */
    protected final void m24236writeContentCPlH8fI(kotlinx.serialization.encoding.CompositeEncoder encoder, int[] content, int size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeInt(kotlin.UIntArray.m23483getpVg5ArA(content, i));
        }
    }
}
