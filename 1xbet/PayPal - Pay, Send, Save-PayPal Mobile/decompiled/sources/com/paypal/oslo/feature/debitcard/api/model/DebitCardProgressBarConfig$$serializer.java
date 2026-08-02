package com.paypal.oslo.feature.debitcard.api.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProgressBarConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProgressBarConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProgressBarConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProgressBarConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DebitCardProgressBarConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig$$serializer debitCardProgressBarConfig$$serializer = new com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig$$serializer();
        INSTANCE = debitCardProgressBarConfig$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig", debitCardProgressBarConfig$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("currentProgress", true);
        pluginGeneratedSerialDescriptor.addElement("maxProgress", true);
        pluginGeneratedSerialDescriptor.addElement("currentSegment", true);
        pluginGeneratedSerialDescriptor.addElement("totalSegments", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private DebitCardProgressBarConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.FloatSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        float f;
        int i;
        int i2;
        float f2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            float decodeFloatElement = beginStructure.decodeFloatElement(serialDescriptor, 0);
            float decodeFloatElement2 = beginStructure.decodeFloatElement(serialDescriptor, 1);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 2);
            f = decodeFloatElement;
            i = beginStructure.decodeIntElement(serialDescriptor, 3);
            i2 = decodeIntElement;
            f2 = decodeFloatElement2;
            i3 = 15;
        } else {
            float f3 = 0.0f;
            float f4 = 0.0f;
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    f3 = beginStructure.decodeFloatElement(serialDescriptor, 0);
                    i6 |= 1;
                } else if (decodeElementIndex == 1) {
                    f4 = beginStructure.decodeFloatElement(serialDescriptor, 1);
                    i6 |= 2;
                } else if (decodeElementIndex == 2) {
                    i5 = beginStructure.decodeIntElement(serialDescriptor, 2);
                    i6 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    i4 = beginStructure.decodeIntElement(serialDescriptor, 3);
                    i6 |= 8;
                }
            }
            f = f3;
            i = i4;
            i2 = i5;
            f2 = f4;
            i3 = i6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig(i3, f, f2, i2, i, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig.write$Self$debit_card_api_prodRelease(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }
}
