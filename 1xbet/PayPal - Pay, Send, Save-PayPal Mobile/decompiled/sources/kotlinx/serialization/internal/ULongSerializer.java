package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/serialization/internal/ULongSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ULong;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize-2TYgG_w", "(Lkotlinx/serialization/encoding/Encoder;J)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-I7RO_PI", "(Lkotlinx/serialization/encoding/Decoder;)J", "deserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ULongSerializer implements kotlinx.serialization.KSerializer<kotlin.ULong> {
    public static final kotlinx.serialization.internal.ULongSerializer INSTANCE = new kotlinx.serialization.internal.ULongSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.internal.InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.ULong", kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.LongCompanionObject.INSTANCE));

    private ULongSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        return kotlin.ULong.m23493boximpl(m24245deserializeI7RO_PI(decoder));
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        m24246serialize2TYgG_w(encoder, ((kotlin.ULong) obj).getGetHighSpeedVideoFpsRanges());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* renamed from: serialize-2TYgG_w, reason: not valid java name */
    public final void m24246serialize2TYgG_w(kotlinx.serialization.encoding.Encoder encoder, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        encoder.encodeInline(getDescriptor()).encodeLong(value);
    }

    /* renamed from: deserialize-I7RO_PI, reason: not valid java name */
    public final long m24245deserializeI7RO_PI(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return kotlin.ULong.m23494constructorimpl(decoder.decodeInline(getDescriptor()).decodeLong());
    }
}
