package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lkotlinx/serialization/internal/FloatArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/FloatArrayBuilder;", "<init>", "()V", "", "collectionSize", "([F)I", "toBuilder", "([F)Lkotlinx/serialization/internal/FloatArrayBuilder;", "empty", "()[F", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/FloatArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", io.ktor.http.ContentDisposition.Parameters.Size, "writeContent", "(Lkotlinx/serialization/encoding/CompositeEncoder;[FI)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FloatArraySerializer extends kotlinx.serialization.internal.PrimitiveArraySerializer<java.lang.Float, float[], kotlinx.serialization.internal.FloatArrayBuilder> implements kotlinx.serialization.KSerializer<float[]> {
    public static final kotlinx.serialization.internal.FloatArraySerializer INSTANCE = new kotlinx.serialization.internal.FloatArraySerializer();

    private FloatArraySerializer() {
        super(kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.FloatCompanionObject.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(float[] fArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fArr, "");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final kotlinx.serialization.internal.FloatArrayBuilder toBuilder(float[] fArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fArr, "");
        return new kotlinx.serialization.internal.FloatArrayBuilder(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final float[] empty() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void readElement(kotlinx.serialization.encoding.CompositeDecoder decoder, int index, kotlinx.serialization.internal.FloatArrayBuilder builder, boolean checkIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.append$kotlinx_serialization_core(decoder.decodeFloatElement(getDescriptor(), index));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void writeContent(kotlinx.serialization.encoding.CompositeEncoder encoder, float[] content, int size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        for (int i = 0; i < size; i++) {
            encoder.encodeFloatElement(getDescriptor(), i, content[i]);
        }
    }
}
