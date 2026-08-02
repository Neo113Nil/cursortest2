package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/user/Installments$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/zettle/sdk/core/user/Installments;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/zettle/sdk/core/user/Installments;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/zettle/sdk/core/user/Installments;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class Installments$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.zettle.sdk.core.user.Installments> {
    public static final com.zettle.sdk.core.user.Installments$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor descriptor;

    static {
        com.zettle.sdk.core.user.Installments$$serializer installments$$serializer = new com.zettle.sdk.core.user.Installments$$serializer();
        INSTANCE = installments$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.zettle.sdk.core.user.Installments", installments$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("min_amount", false);
        pluginGeneratedSerialDescriptor.addElement("options", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Installments$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.LongSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.IntSerializer.INSTANCE))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.zettle.sdk.core.user.Installments deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        java.lang.Object obj;
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        java.lang.Object obj2 = null;
        if (beginStructure.decodeSequentially()) {
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 0);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 1, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.IntSerializer.INSTANCE), null);
            j = decodeLongElement;
            i = 3;
        } else {
            long j2 = 0;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    j2 = beginStructure.decodeLongElement(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.IntSerializer.INSTANCE), obj2);
                    i2 |= 2;
                }
            }
            i = i2;
            obj = obj2;
            j = j2;
        }
        beginStructure.endStructure(descriptor2);
        return new com.zettle.sdk.core.user.Installments(i, j, (java.util.List) obj, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.zettle.sdk.core.user.Installments value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.zettle.sdk.core.user.Installments.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
