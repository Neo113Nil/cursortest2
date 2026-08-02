package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/payair/logic/implementation/Certificate$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/payair/logic/implementation/Certificate;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/payair/logic/implementation/Certificate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/payair/logic/implementation/Certificate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes2.dex */
public final class Certificate$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.payair.logic.implementation.Certificate> {
    public static final com.payair.logic.implementation.Certificate$$serializer INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor f4438a;

    static {
        com.payair.logic.implementation.Certificate$$serializer certificate$$serializer = new com.payair.logic.implementation.Certificate$$serializer();
        INSTANCE = certificate$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.payair.logic.implementation.Certificate", certificate$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("alg", false);
        pluginGeneratedSerialDescriptor.addElement("e", false);
        pluginGeneratedSerialDescriptor.addElement("kid", false);
        pluginGeneratedSerialDescriptor.addElement("kty", false);
        pluginGeneratedSerialDescriptor.addElement("n", false);
        pluginGeneratedSerialDescriptor.addElement("use", false);
        f4438a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.payair.logic.implementation.Certificate deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(descriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(descriptor, 3);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(descriptor, 4);
            str6 = decodeStringElement;
            str2 = beginStructure.decodeStringElement(descriptor, 5);
            str5 = decodeStringElement4;
            str3 = decodeStringElement5;
            str = decodeStringElement3;
            str4 = decodeStringElement2;
            i = 63;
        } else {
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            str = null;
            java.lang.String str11 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str7 = beginStructure.decodeStringElement(descriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str11 = beginStructure.decodeStringElement(descriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str = beginStructure.decodeStringElement(descriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str9 = beginStructure.decodeStringElement(descriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str10 = beginStructure.decodeStringElement(descriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        str8 = beginStructure.decodeStringElement(descriptor, 5);
                        i2 |= 32;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str8;
            i = i2;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            str6 = str7;
        }
        beginStructure.endStructure(descriptor);
        return new com.payair.logic.implementation.Certificate(i, str6, str4, str, str5, str3, str2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f4438a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.payair.logic.implementation.Certificate value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        com.payair.logic.implementation.Certificate.getHighResolutionOutputSizeshNQ4ISI(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
