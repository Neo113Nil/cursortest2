package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/user/Gratuity$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/zettle/sdk/core/user/Gratuity;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/zettle/sdk/core/user/Gratuity;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/zettle/sdk/core/user/Gratuity;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class Gratuity$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.zettle.sdk.core.user.Gratuity> {
    public static final com.zettle.sdk.core.user.Gratuity$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor descriptor;

    static {
        com.zettle.sdk.core.user.Gratuity$$serializer gratuity$$serializer = new com.zettle.sdk.core.user.Gratuity$$serializer();
        INSTANCE = gratuity$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.zettle.sdk.core.user.Gratuity", gratuity$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, true);
        pluginGeneratedSerialDescriptor.addElement("currency_exponent", true);
        pluginGeneratedSerialDescriptor.addElement("min_pa_version", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("max_percentage", true);
        pluginGeneratedSerialDescriptor.addElement("types", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Gratuity$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(com.zettle.sdk.core.user.GratuityType$$serializer.INSTANCE))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.zettle.sdk.core.user.Gratuity deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i;
        java.lang.Object obj6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i2 = 5;
        java.lang.Object obj7 = null;
        if (beginStructure.decodeSequentially()) {
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj = beginStructure.decodeNullableSerializableElement(descriptor2, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, new kotlinx.serialization.internal.ArrayListSerializer(com.zettle.sdk.core.user.GratuityType$$serializer.INSTANCE), null);
            i = 63;
        } else {
            int i3 = 0;
            boolean z = true;
            java.lang.Object obj8 = null;
            java.lang.Object obj9 = null;
            java.lang.Object obj10 = null;
            java.lang.Object obj11 = null;
            java.lang.Object obj12 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        obj12 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj12);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj9);
                        i3 |= 2;
                    case 2:
                        obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj10);
                        i3 |= 4;
                    case 3:
                        obj11 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj11);
                        i3 |= 8;
                    case 4:
                        obj7 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj7);
                        i3 |= 16;
                    case 5:
                        obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, i2, new kotlinx.serialization.internal.ArrayListSerializer(com.zettle.sdk.core.user.GratuityType$$serializer.INSTANCE), obj8);
                        i3 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            obj = obj7;
            obj2 = obj8;
            obj3 = obj9;
            obj4 = obj10;
            obj5 = obj11;
            i = i3;
            obj6 = obj12;
        }
        beginStructure.endStructure(descriptor2);
        return new com.zettle.sdk.core.user.Gratuity(i, (java.lang.Boolean) obj6, (java.lang.String) obj3, (java.lang.String) obj4, (java.lang.String) obj5, (java.lang.Integer) obj, (java.util.List) obj2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.zettle.sdk.core.user.Gratuity value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.zettle.sdk.core.user.Gratuity.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
