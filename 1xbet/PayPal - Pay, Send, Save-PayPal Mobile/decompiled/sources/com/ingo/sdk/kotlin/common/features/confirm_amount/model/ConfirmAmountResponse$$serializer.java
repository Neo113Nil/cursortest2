package com.ingo.sdk.kotlin.common.features.confirm_amount.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class ConfirmAmountResponse$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse> {
    public static final com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse$$serializer confirmAmountResponse$$serializer = new com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse$$serializer();
        INSTANCE = confirmAmountResponse$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse", confirmAmountResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("transactionReferenceNumber", false);
        pluginGeneratedSerialDescriptor.addElement("checkAmountInCents", false);
        pluginGeneratedSerialDescriptor.addElement("inMinutesFees", false);
        pluginGeneratedSerialDescriptor.addElement("inDaysFees", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE, com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration$$serializer.INSTANCE, com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration transactionFeeConfiguration;
        java.lang.String str;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration transactionFeeConfiguration2;
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration transactionFeeConfiguration3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            long decodeLongElement = beginStructure.decodeLongElement(serialDescriptor, 1);
            com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration transactionFeeConfiguration4 = (com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration$$serializer.INSTANCE, null);
            str = decodeStringElement;
            transactionFeeConfiguration = (com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration$$serializer.INSTANCE, null);
            transactionFeeConfiguration2 = transactionFeeConfiguration4;
            i = 15;
            j = decodeLongElement;
        } else {
            int i2 = 0;
            boolean z = true;
            long j2 = 0;
            java.lang.String str2 = null;
            com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration transactionFeeConfiguration5 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str2 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    j2 = beginStructure.decodeLongElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    transactionFeeConfiguration5 = (com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 2, com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration$$serializer.INSTANCE, transactionFeeConfiguration5);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    transactionFeeConfiguration3 = (com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration) beginStructure.decodeSerializableElement(serialDescriptor, 3, com.ingo.sdk.kotlin.common.features.confirm_amount.model.TransactionFeeConfiguration$$serializer.INSTANCE, transactionFeeConfiguration3);
                    i2 |= 8;
                }
            }
            i = i2;
            transactionFeeConfiguration = transactionFeeConfiguration3;
            str = str2;
            transactionFeeConfiguration2 = transactionFeeConfiguration5;
            j = j2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse(i, str, j, transactionFeeConfiguration2, transactionFeeConfiguration, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse.write$Self$sharedSdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private ConfirmAmountResponse$$serializer() {
    }
}
