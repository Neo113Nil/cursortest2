package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/serialization/internal/UShortSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UShort;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize-i8woANY", "(Lkotlinx/serialization/encoding/Encoder;S)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-BwKQO78", "(Lkotlinx/serialization/encoding/Decoder;)S", "deserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UShortSerializer implements kotlinx.serialization.KSerializer<kotlin.UShort> {
    public static final kotlinx.serialization.internal.UShortSerializer INSTANCE = new kotlinx.serialization.internal.UShortSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.internal.InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UShort", kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(kotlin.jvm.internal.ShortCompanionObject.INSTANCE));

    private UShortSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        return kotlin.UShort.m23517boximpl(m24253deserializeBwKQO78(decoder));
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        m24254serializei8woANY(encoder, ((kotlin.UShort) obj).getGetHighResolutionOutputSizeshNQ4ISI());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* renamed from: serialize-i8woANY, reason: not valid java name */
    public final void m24254serializei8woANY(kotlinx.serialization.encoding.Encoder encoder, short value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        encoder.encodeInline(getDescriptor()).encodeShort(value);
    }

    /* renamed from: deserialize-BwKQO78, reason: not valid java name */
    public final short m24253deserializeBwKQO78(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return kotlin.UShort.m23518constructorimpl(decoder.decodeInline(getDescriptor()).decodeShort());
    }
}
