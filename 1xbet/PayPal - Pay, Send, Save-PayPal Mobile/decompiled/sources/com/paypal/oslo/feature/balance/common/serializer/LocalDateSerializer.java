package com.paypal.oslo.feature.balance.common.serializer;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0006*\u00020\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/serializer/LocalDateSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/time/LocalDate;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/time/LocalDate;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/time/LocalDate;", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoFpsRanges", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocalDateSerializer implements kotlinx.serialization.KSerializer<java.time.LocalDate> {
    public static final com.paypal.oslo.feature.balance.common.serializer.LocalDateSerializer INSTANCE = new com.paypal.oslo.feature.balance.common.serializer.LocalDateSerializer();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.time.format.DateTimeFormatter getHighSpeedVideoFpsRangesFor = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.PrimitiveSerialDescriptor("LocalDate", kotlinx.serialization.descriptors.PrimitiveKind.STRING.INSTANCE);
    public static final int $stable = 8;

    private LocalDateSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.time.LocalDate value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.String format = value.format(getHighSpeedVideoFpsRangesFor);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        encoder.encodeString(format);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final java.time.LocalDate deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        java.time.LocalDate parse = java.time.LocalDate.parse(decoder.decodeString(), getHighSpeedVideoFpsRangesFor);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        return parse;
    }
}
