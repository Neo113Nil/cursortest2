package com.zettle.sdk.core.user.userconfig;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/user/userconfig/SimplifiedUserConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/zettle/sdk/core/user/userconfig/SimplifiedUserConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/zettle/sdk/core/user/userconfig/SimplifiedUserConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/zettle/sdk/core/user/userconfig/SimplifiedUserConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class SimplifiedUserConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig> {
    public static final com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor descriptor;

    static {
        com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig$$serializer simplifiedUserConfig$$serializer = new com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig$$serializer();
        INSTANCE = simplifiedUserConfig$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig", simplifiedUserConfig$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("userUUID", false);
        pluginGeneratedSerialDescriptor.addElement("betaFeatures", false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("manualAppEvents", false);
        pluginGeneratedSerialDescriptor.addElement("configByCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("enabled", false);
        pluginGeneratedSerialDescriptor.addElement("readerProvisioning", false);
        pluginGeneratedSerialDescriptor.addElement("installments", false);
        pluginGeneratedSerialDescriptor.addElement("amountLimits", false);
        pluginGeneratedSerialDescriptor.addElement("accountTypeSelectionEnabled", false);
        pluginGeneratedSerialDescriptor.addElement("offline", false);
        pluginGeneratedSerialDescriptor.addElement("tokenProviderStatus", false);
        pluginGeneratedSerialDescriptor.addElement("readerSettings", false);
        pluginGeneratedSerialDescriptor.addElement("gratuityAmountMaxPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("networkTimeoutSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SimplifiedUserConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE)), new kotlinx.serialization.internal.LinkedHashMapSerializer(com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.TransactionConfigEntry$$serializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.ReaderProvisioning$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.Installments$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.AmountRange$$serializer.INSTANCE))), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, com.zettle.sdk.core.user.Offline$$serializer.INSTANCE, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.zettle.sdk.core.auth.TokenProviderStatus", com.zettle.sdk.core.auth.TokenProviderStatus.values()), new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.ReaderConfig$$serializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.LongSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        boolean z;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.String str;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        int i2;
        java.lang.Object obj14;
        java.lang.String str2;
        java.lang.Object obj15;
        java.lang.String str3;
        java.lang.Object obj16;
        java.lang.String str4;
        java.lang.Object obj17;
        java.lang.String str5;
        java.lang.Object obj18;
        java.lang.Object obj19;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        java.lang.String str6 = "com.zettle.sdk.core.auth.TokenProviderStatus";
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            obj4 = beginStructure.decodeSerializableElement(descriptor2, 1, new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            java.lang.Object decodeSerializableElement = beginStructure.decodeSerializableElement(descriptor2, 2, com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), null);
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 3, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            java.lang.Object decodeSerializableElement2 = beginStructure.decodeSerializableElement(descriptor2, 4, new kotlinx.serialization.internal.LinkedHashMapSerializer(com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.TransactionConfigEntry$$serializer.INSTANCE)), null);
            java.lang.Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, com.zettle.sdk.core.user.ReaderProvisioning$$serializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, com.zettle.sdk.core.user.Installments$$serializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement5 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.AmountRange$$serializer.INSTANCE)), null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 9);
            java.lang.Object decodeSerializableElement3 = beginStructure.decodeSerializableElement(descriptor2, 10, com.zettle.sdk.core.user.Offline$$serializer.INSTANCE, null);
            java.lang.Object decodeSerializableElement4 = beginStructure.decodeSerializableElement(descriptor2, 11, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.zettle.sdk.core.auth.TokenProviderStatus", com.zettle.sdk.core.auth.TokenProviderStatus.values()), null);
            java.lang.Object decodeSerializableElement5 = beginStructure.decodeSerializableElement(descriptor2, 12, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.ReaderConfig$$serializer.INSTANCE)), null);
            obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, kotlinx.serialization.internal.LongSerializer.INSTANCE, null);
            obj9 = decodeSerializableElement4;
            obj7 = decodeNullableSerializableElement4;
            z = decodeBooleanElement;
            obj6 = decodeSerializableElement;
            obj13 = decodeSerializableElement5;
            obj8 = decodeNullableSerializableElement5;
            obj = decodeSerializableElement2;
            i = 32767;
            obj10 = decodeSerializableElement3;
            obj11 = decodeNullableSerializableElement2;
            obj2 = decodeNullableSerializableElement3;
            obj12 = decodeNullableSerializableElement;
            str = decodeStringElement;
        } else {
            java.lang.Object obj20 = null;
            z = false;
            int i3 = 0;
            boolean z2 = true;
            java.lang.Object obj21 = null;
            java.lang.Object obj22 = null;
            java.lang.Object obj23 = null;
            java.lang.String str7 = null;
            java.lang.Object obj24 = null;
            java.lang.Object obj25 = null;
            java.lang.Object obj26 = null;
            java.lang.Object obj27 = null;
            obj = null;
            obj2 = null;
            java.lang.Object obj28 = null;
            java.lang.Object obj29 = null;
            java.lang.Object obj30 = null;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        i2 = i3;
                        z2 = false;
                        obj23 = obj23;
                        str7 = str7;
                        obj22 = obj22;
                        i3 = i2;
                    case 0:
                        obj14 = obj22;
                        str2 = str6;
                        obj15 = obj28;
                        i2 = i3 | 1;
                        str7 = beginStructure.decodeStringElement(descriptor2, 0);
                        obj23 = obj23;
                        obj28 = obj15;
                        obj22 = obj14;
                        str6 = str2;
                        i3 = i2;
                    case 1:
                        obj29 = beginStructure.decodeSerializableElement(descriptor2, 1, new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj29);
                        obj23 = obj23;
                        str7 = str7;
                        obj28 = obj28;
                        str6 = str6;
                        i3 |= 2;
                        obj22 = obj22;
                    case 2:
                        obj14 = obj22;
                        str2 = str6;
                        str3 = str7;
                        obj15 = obj28;
                        int i4 = i3;
                        obj16 = obj23;
                        obj30 = beginStructure.decodeSerializableElement(descriptor2, 2, com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), obj30);
                        i2 = i4 | 4;
                        obj23 = obj16;
                        str7 = str3;
                        obj28 = obj15;
                        obj22 = obj14;
                        str6 = str2;
                        i3 = i2;
                    case 3:
                        obj14 = obj22;
                        str2 = str6;
                        str4 = str7;
                        int i5 = i3;
                        obj17 = obj23;
                        obj25 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE), obj25);
                        i2 = i5 | 8;
                        obj23 = obj17;
                        str7 = str4;
                        obj22 = obj14;
                        str6 = str2;
                        i3 = i2;
                    case 4:
                        obj14 = obj22;
                        str2 = str6;
                        str3 = str7;
                        obj15 = obj28;
                        int i6 = i3;
                        obj16 = obj23;
                        obj = beginStructure.decodeSerializableElement(descriptor2, 4, new kotlinx.serialization.internal.LinkedHashMapSerializer(com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.TransactionConfigEntry$$serializer.INSTANCE)), obj);
                        i2 = i6 | 16;
                        obj23 = obj16;
                        str7 = str3;
                        obj28 = obj15;
                        obj22 = obj14;
                        str6 = str2;
                        i3 = i2;
                    case 5:
                        obj14 = obj22;
                        str2 = str6;
                        str3 = str7;
                        obj15 = obj28;
                        int i7 = i3;
                        obj16 = obj23;
                        obj21 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj21);
                        i2 = i7 | 32;
                        obj23 = obj16;
                        str7 = str3;
                        obj28 = obj15;
                        obj22 = obj14;
                        str6 = str2;
                        i3 = i2;
                    case 6:
                        obj14 = obj22;
                        str2 = str6;
                        str4 = str7;
                        int i8 = i3;
                        obj17 = obj23;
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, com.zettle.sdk.core.user.ReaderProvisioning$$serializer.INSTANCE, obj2);
                        i2 = i8 | 64;
                        obj23 = obj17;
                        str7 = str4;
                        obj22 = obj14;
                        str6 = str2;
                        i3 = i2;
                    case 7:
                        obj14 = obj22;
                        str2 = str6;
                        obj24 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, com.zettle.sdk.core.user.Installments$$serializer.INSTANCE, obj24);
                        i2 = i3 | 128;
                        obj23 = obj23;
                        obj22 = obj14;
                        str6 = str2;
                        i3 = i2;
                    case 8:
                        str3 = str7;
                        obj15 = obj28;
                        int i9 = i3;
                        obj16 = obj23;
                        obj14 = obj22;
                        str2 = str6;
                        obj26 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.AmountRange$$serializer.INSTANCE)), obj26);
                        i2 = i9 | 256;
                        obj23 = obj16;
                        str7 = str3;
                        obj28 = obj15;
                        obj22 = obj14;
                        str6 = str2;
                        i3 = i2;
                    case 9:
                        str5 = str7;
                        obj18 = obj28;
                        int i10 = i3;
                        obj19 = obj23;
                        z = beginStructure.decodeBooleanElement(descriptor2, 9);
                        i2 = i10 | 512;
                        obj23 = obj19;
                        str7 = str5;
                        obj28 = obj18;
                        i3 = i2;
                    case 10:
                        str5 = str7;
                        obj18 = obj28;
                        int i11 = i3;
                        obj19 = obj23;
                        obj20 = beginStructure.decodeSerializableElement(descriptor2, 10, com.zettle.sdk.core.user.Offline$$serializer.INSTANCE, obj20);
                        i2 = i11 | 1024;
                        obj23 = obj19;
                        str7 = str5;
                        obj28 = obj18;
                        i3 = i2;
                    case 11:
                        str5 = str7;
                        obj18 = obj28;
                        int i12 = i3;
                        obj19 = obj23;
                        obj27 = beginStructure.decodeSerializableElement(descriptor2, 11, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer(str6, com.zettle.sdk.core.auth.TokenProviderStatus.values()), obj27);
                        i2 = i12 | 2048;
                        obj23 = obj19;
                        str7 = str5;
                        obj28 = obj18;
                        i3 = i2;
                    case 12:
                        str5 = str7;
                        int i13 = i3;
                        obj19 = obj23;
                        obj18 = obj28;
                        obj22 = beginStructure.decodeSerializableElement(descriptor2, 12, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.ReaderConfig$$serializer.INSTANCE)), obj22);
                        i2 = i13 | 4096;
                        obj23 = obj19;
                        str7 = str5;
                        obj28 = obj18;
                        i3 = i2;
                    case 13:
                        obj28 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj28);
                        i2 = i3 | 8192;
                        obj23 = obj23;
                        str7 = str7;
                        i3 = i2;
                    case 14:
                        obj23 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, kotlinx.serialization.internal.LongSerializer.INSTANCE, obj23);
                        i3 |= 16384;
                        str7 = str7;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.Object obj31 = obj22;
            obj3 = obj28;
            obj4 = obj29;
            int i14 = i3;
            obj5 = obj23;
            i = i14;
            obj6 = obj30;
            obj7 = obj24;
            obj8 = obj26;
            obj9 = obj27;
            obj10 = obj20;
            str = str7;
            obj11 = obj21;
            obj12 = obj25;
            obj13 = obj31;
        }
        beginStructure.endStructure(descriptor2);
        return new com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig(i, str, (java.util.Set) obj4, (com.zettle.sdk.core.user.CurrencyCode) obj6, (java.util.Map) obj12, (java.util.Map) obj, (java.lang.Boolean) obj11, (com.zettle.sdk.core.user.ReaderProvisioning) obj2, (com.zettle.sdk.core.user.Installments) obj7, (java.util.Map) obj8, z, (com.zettle.sdk.core.user.Offline) obj10, (com.zettle.sdk.core.auth.TokenProviderStatus) obj9, (java.util.Map) obj13, (java.lang.String) obj3, (java.lang.Long) obj5, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
