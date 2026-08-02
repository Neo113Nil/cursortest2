package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/user/ApprovePolicy$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/zettle/sdk/core/user/ApprovePolicy;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/zettle/sdk/core/user/ApprovePolicy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/zettle/sdk/core/user/ApprovePolicy;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class ApprovePolicy$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.zettle.sdk.core.user.ApprovePolicy> {
    public static final com.zettle.sdk.core.user.ApprovePolicy$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor descriptor;

    static {
        com.zettle.sdk.core.user.ApprovePolicy$$serializer approvePolicy$$serializer = new com.zettle.sdk.core.user.ApprovePolicy$$serializer();
        INSTANCE = approvePolicy$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.zettle.sdk.core.user.ApprovePolicy", approvePolicy$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("card_entry_modes", false);
        pluginGeneratedSerialDescriptor.addElement("amount_max", false);
        pluginGeneratedSerialDescriptor.addElement("tvr_mask", false);
        pluginGeneratedSerialDescriptor.addElement("tsi_mask", false);
        pluginGeneratedSerialDescriptor.addElement("disallowed_aid", false);
        pluginGeneratedSerialDescriptor.addElement("unexpired_application", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ApprovePolicy$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.LongSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.zettle.sdk.core.user.ApprovePolicy deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        long j;
        java.lang.Object obj;
        java.lang.String str;
        int i;
        boolean z;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i2 = 5;
        java.lang.String str2 = null;
        if (beginStructure.decodeSequentially()) {
            obj2 = beginStructure.decodeSerializableElement(descriptor2, 0, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 1);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 2);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 3);
            obj = beginStructure.decodeSerializableElement(descriptor2, 4, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            z = beginStructure.decodeBooleanElement(descriptor2, 5);
            str2 = decodeStringElement2;
            i = 63;
            str = decodeStringElement;
            j = decodeLongElement;
        } else {
            long j2 = 0;
            boolean z2 = true;
            boolean z3 = false;
            int i3 = 0;
            java.lang.Object obj3 = null;
            java.lang.Object obj4 = null;
            java.lang.String str3 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                    case 0:
                        obj4 = beginStructure.decodeSerializableElement(descriptor2, 0, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj4);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        j2 = beginStructure.decodeLongElement(descriptor2, 1);
                        i3 |= 2;
                        i2 = 5;
                    case 2:
                        str3 = beginStructure.decodeStringElement(descriptor2, 2);
                        i3 |= 4;
                        i2 = 5;
                    case 3:
                        str2 = beginStructure.decodeStringElement(descriptor2, 3);
                        i3 |= 8;
                        i2 = 5;
                    case 4:
                        obj3 = beginStructure.decodeSerializableElement(descriptor2, 4, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj3);
                        i3 |= 16;
                        i2 = 5;
                    case 5:
                        z3 = beginStructure.decodeBooleanElement(descriptor2, i2);
                        i3 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            j = j2;
            obj = obj3;
            str = str3;
            i = i3;
            z = z3;
            obj2 = obj4;
        }
        beginStructure.endStructure(descriptor2);
        return new com.zettle.sdk.core.user.ApprovePolicy(i, (java.util.List) obj2, j, str, str2, (java.util.List) obj, z, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.zettle.sdk.core.user.ApprovePolicy value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.zettle.sdk.core.user.ApprovePolicy.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
