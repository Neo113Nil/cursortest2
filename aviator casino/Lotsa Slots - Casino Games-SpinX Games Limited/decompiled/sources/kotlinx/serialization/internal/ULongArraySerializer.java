package kotlinx.serialization.internal;

/* compiled from: PrimitiveArraysSerializers.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\t*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lkotlinx/serialization/internal/ULongArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ULongArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/ULong;", "Lkotlinx/serialization/internal/ULongArrayBuilder;", "<init>", "()V", "collectionSize", "", "collectionSize-QwZRm1k", "([J)I", "toBuilder", "toBuilder-QwZRm1k", "([J)Lkotlinx/serialization/internal/ULongArrayBuilder;", "empty", "empty-Y2RjT0g", "()[J", "readElement", "", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "builder", "checkIndex", "", "writeContent", "encoder", "Lkotlinx/serialization/encoding/CompositeEncoder;", "content", "size", "writeContent-0q3Fkuo", "(Lkotlinx/serialization/encoding/CompositeEncoder;[JI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes6.dex */
public final class ULongArraySerializer extends kotlinx.serialization.internal.PrimitiveArraySerializer<kotlin.ULong, kotlin.ULongArray, kotlinx.serialization.internal.ULongArrayBuilder> implements kotlinx.serialization.KSerializer<kotlin.ULongArray> {
    public static final kotlinx.serialization.internal.ULongArraySerializer INSTANCE = new kotlinx.serialization.internal.ULongArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(java.lang.Object obj) {
        return m12430collectionSizeQwZRm1k(((kotlin.ULongArray) obj).getStorage());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ kotlin.ULongArray empty() {
        return kotlin.ULongArray.m11028boximpl(m12431emptyY2RjT0g());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ java.lang.Object toBuilder(java.lang.Object obj) {
        return m12432toBuilderQwZRm1k(((kotlin.ULongArray) obj).getStorage());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(kotlinx.serialization.encoding.CompositeEncoder compositeEncoder, kotlin.ULongArray uLongArray, int i) {
        m12433writeContent0q3Fkuo(compositeEncoder, uLongArray.getStorage(), i);
    }

    private ULongArraySerializer() {
        super(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.ULong.INSTANCE));
    }

    /* renamed from: collectionSize-QwZRm1k, reason: not valid java name */
    protected int m12430collectionSizeQwZRm1k(long[] collectionSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return kotlin.ULongArray.m11036getSizeimpl(collectionSize);
    }

    /* renamed from: toBuilder-QwZRm1k, reason: not valid java name */
    protected kotlinx.serialization.internal.ULongArrayBuilder m12432toBuilderQwZRm1k(long[] toBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new kotlinx.serialization.internal.ULongArrayBuilder(toBuilder, null);
    }

    /* renamed from: empty-Y2RjT0g, reason: not valid java name */
    protected long[] m12431emptyY2RjT0g() {
        return kotlin.ULongArray.m11029constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(kotlinx.serialization.encoding.CompositeDecoder decoder, int index, kotlinx.serialization.internal.ULongArrayBuilder builder, boolean checkIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m12428appendVKZWuLQ$kotlinx_serialization_core(kotlin.ULong.m10975constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeLong()));
    }

    /* renamed from: writeContent-0q3Fkuo, reason: not valid java name */
    protected void m12433writeContent0q3Fkuo(kotlinx.serialization.encoding.CompositeEncoder encoder, long[] content, int size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeLong(kotlin.ULongArray.m11035getsVKNKU(content, i));
        }
    }
}
