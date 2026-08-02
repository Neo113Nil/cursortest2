package com.payair.logic.storage;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/payair/logic/storage/TimestampMap$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/payair/csdk/r2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/payair/csdk/r2;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/payair/csdk/r2;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimestampMap$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.payair.csdk.r2> {
    public static final com.payair.logic.storage.TimestampMap$$serializer INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor f4512a;

    static {
        com.payair.logic.storage.TimestampMap$$serializer timestampMap$$serializer = new com.payair.logic.storage.TimestampMap$$serializer();
        INSTANCE = timestampMap$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.payair.logic.storage.TimestampMap", timestampMap$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, false);
        f4512a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.payair.csdk.r2.b[0]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.payair.csdk.r2 deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.util.Map map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        kotlinx.serialization.KSerializer[] kSerializerArr = com.payair.csdk.r2.b;
        int i = 1;
        java.util.Map map2 = null;
        if (beginStructure.decodeSequentially()) {
            map = (java.util.Map) beginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], null);
        } else {
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else {
                    if (decodeElementIndex != 0) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    map2 = (java.util.Map) beginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], map2);
                    i2 = 1;
                }
            }
            map = map2;
            i = i2;
        }
        beginStructure.endStructure(descriptor);
        return new com.payair.csdk.r2(i, map);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f4512a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.payair.csdk.r2 value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        beginStructure.encodeSerializableElement(descriptor, 0, com.payair.csdk.r2.b[0], value.f4307a);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
