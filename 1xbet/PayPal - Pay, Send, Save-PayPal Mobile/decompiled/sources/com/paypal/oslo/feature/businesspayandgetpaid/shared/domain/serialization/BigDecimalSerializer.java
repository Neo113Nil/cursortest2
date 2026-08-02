package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.serialization;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/serialization/BigDecimalSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/math/BigDecimal;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/math/BigDecimal;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/math/BigDecimal;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BigDecimalSerializer implements kotlinx.serialization.KSerializer<java.math.BigDecimal> {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.serialization.BigDecimalSerializer INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.serialization.BigDecimalSerializer();
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.PrimitiveSerialDescriptor("BigDecimal", kotlinx.serialization.descriptors.PrimitiveKind.STRING.INSTANCE);
    public static final int $stable = 8;

    private BigDecimalSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.math.BigDecimal value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.String plainString = value.toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        encoder.encodeString(plainString);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final java.math.BigDecimal deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        java.lang.String decodeString = decoder.decodeString();
        try {
            return new java.math.BigDecimal(decodeString);
        } catch (java.lang.NumberFormatException e) {
            java.lang.NumberFormatException numberFormatException = e;
            com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log.e("Invalid number format", numberFormatException);
            throw new kotlinx.serialization.SerializationException("Invalid BigDecimal format: ".concat(java.lang.String.valueOf(decodeString)), numberFormatException);
        }
    }
}
