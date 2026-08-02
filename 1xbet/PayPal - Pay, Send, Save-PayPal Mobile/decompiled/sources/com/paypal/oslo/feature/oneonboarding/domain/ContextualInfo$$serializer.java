package com.paypal.oslo.feature.oneonboarding.domain;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ContextualInfo$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo$$serializer contextualInfo$$serializer = new com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo$$serializer();
        INSTANCE = contextualInfo$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo", contextualInfo$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("componentId", false);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, false);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContextualInfo$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[2].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata contextualInfoMetadata;
        java.lang.String str;
        java.lang.String str2;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId componentId = (com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, null);
            java.lang.String m16614unboximpl = componentId != null ? componentId.m16614unboximpl() : null;
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
            contextualInfoMetadata = (com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            str = m16614unboximpl;
            str2 = decodeStringElement;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata contextualInfoMetadata2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId componentId2 = (com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId) beginStructure.decodeSerializableElement(serialDescriptor, 0, com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, str3 != null ? com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16607boximpl(str3) : null);
                    str3 = componentId2 != null ? componentId2.m16614unboximpl() : null;
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str4 = beginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    contextualInfoMetadata2 = (com.paypal.oslo.feature.oneonboarding.domain.ContextualInfoMetadata) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), contextualInfoMetadata2);
                    i2 |= 4;
                }
            }
            contextualInfoMetadata = contextualInfoMetadata2;
            str = str3;
            str2 = str4;
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo(i, str, str2, contextualInfoMetadata, null, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo.write$Self$one_onboarding_prodRelease(value, beginStructure, serialDescriptor);
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
