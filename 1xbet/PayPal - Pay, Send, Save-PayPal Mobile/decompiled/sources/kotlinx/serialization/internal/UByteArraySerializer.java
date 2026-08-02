package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lkotlinx/serialization/internal/UByteArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UByteArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UByte;", "Lkotlinx/serialization/internal/UByteArrayBuilder;", "<init>", "()V", "", "collectionSize-GBYM_sE", "([B)I", "collectionSize", "toBuilder-GBYM_sE", "([B)Lkotlinx/serialization/internal/UByteArrayBuilder;", "toBuilder", "empty-TcUX1vc", "()[B", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/UByteArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", io.ktor.http.ContentDisposition.Parameters.Size, "writeContent-Coi6ktg", "(Lkotlinx/serialization/encoding/CompositeEncoder;[BI)V", "writeContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes5.dex */
public final class UByteArraySerializer extends kotlinx.serialization.internal.PrimitiveArraySerializer<kotlin.UByte, kotlin.UByteArray, kotlinx.serialization.internal.UByteArrayBuilder> implements kotlinx.serialization.KSerializer<kotlin.UByteArray> {
    public static final kotlinx.serialization.internal.UByteArraySerializer INSTANCE = new kotlinx.serialization.internal.UByteArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final /* synthetic */ int collectionSize(java.lang.Object obj) {
        return m24225collectionSizeGBYM_sE(((kotlin.UByteArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final /* synthetic */ kotlin.UByteArray empty() {
        return kotlin.UByteArray.m23452boximpl(m24226emptyTcUX1vc());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final /* synthetic */ java.lang.Object toBuilder(java.lang.Object obj) {
        return m24227toBuilderGBYM_sE(((kotlin.UByteArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final /* synthetic */ void writeContent(kotlinx.serialization.encoding.CompositeEncoder compositeEncoder, kotlin.UByteArray uByteArray, int i) {
        m24228writeContentCoi6ktg(compositeEncoder, uByteArray.getGetHighSpeedVideoFpsRanges(), i);
    }

    private UByteArraySerializer() {
        super(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.UByte.INSTANCE));
    }

    /* renamed from: collectionSize-GBYM_sE, reason: not valid java name */
    protected final int m24225collectionSizeGBYM_sE(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return kotlin.UByteArray.m23460getSizeimpl(bArr);
    }

    /* renamed from: toBuilder-GBYM_sE, reason: not valid java name */
    protected final kotlinx.serialization.internal.UByteArrayBuilder m24227toBuilderGBYM_sE(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return new kotlinx.serialization.internal.UByteArrayBuilder(bArr, null);
    }

    /* renamed from: empty-TcUX1vc, reason: not valid java name */
    protected final byte[] m24226emptyTcUX1vc() {
        return kotlin.UByteArray.m23453constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void readElement(kotlinx.serialization.encoding.CompositeDecoder decoder, int index, kotlinx.serialization.internal.UByteArrayBuilder builder, boolean checkIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.m24223append7apg3OU$kotlinx_serialization_core(kotlin.UByte.m23446constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeByte()));
    }

    /* renamed from: writeContent-Coi6ktg, reason: not valid java name */
    protected final void m24228writeContentCoi6ktg(kotlinx.serialization.encoding.CompositeEncoder encoder, byte[] content, int size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeByte(kotlin.UByteArray.m23459getw2LRezQ(content, i));
        }
    }
}
