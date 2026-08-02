package com.zettle.sdk.core.user.userconfig;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class DetailedUserConfig$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.zettle.sdk.core.user.userconfig.DetailedUserConfig> {
    public static final com.zettle.sdk.core.user.userconfig.DetailedUserConfig$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor descriptor;

    static {
        com.zettle.sdk.core.user.userconfig.DetailedUserConfig$$serializer detailedUserConfig$$serializer = new com.zettle.sdk.core.user.userconfig.DetailedUserConfig$$serializer();
        INSTANCE = detailedUserConfig$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.zettle.sdk.core.user.userconfig.DetailedUserConfig", detailedUserConfig$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("publicName", false);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement(androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("imageUrlTemplate", false);
        pluginGeneratedSerialDescriptor.addElement("terminalLocaleString", false);
        pluginGeneratedSerialDescriptor.addElement("countryId", false);
        pluginGeneratedSerialDescriptor.addElement("betaFeatures", false);
        pluginGeneratedSerialDescriptor.addElement("features", false);
        pluginGeneratedSerialDescriptor.addElement("organizationSettings", false);
        pluginGeneratedSerialDescriptor.addElement("userUUID", false);
        pluginGeneratedSerialDescriptor.addElement("organizationUUID", false);
        pluginGeneratedSerialDescriptor.addElement("manualAppEvents", false);
        pluginGeneratedSerialDescriptor.addElement("supportedReaders", false);
        pluginGeneratedSerialDescriptor.addElement("configByCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("gratuityAmountMaxPercentage", false);
        pluginGeneratedSerialDescriptor.addElement("isShowAdvance", false);
        pluginGeneratedSerialDescriptor.addElement("isGetStartedList", false);
        pluginGeneratedSerialDescriptor.addElement("userInfoHash", false);
        pluginGeneratedSerialDescriptor.addElement("transactionConfigHash", false);
        pluginGeneratedSerialDescriptor.addElement("tokenProviderStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DetailedUserConfig$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.CountryCode.INSTANCE.serializer(), new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.zettle.sdk.core.user.OrganizationSettings$$serializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE)), new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), new kotlinx.serialization.internal.LinkedHashMapSerializer(com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.TransactionConfigEntry$$serializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.zettle.sdk.core.auth.TokenProviderStatus", com.zettle.sdk.core.auth.TokenProviderStatus.values()))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.zettle.sdk.core.user.userconfig.DetailedUserConfig deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        boolean z;
        java.lang.Object obj6;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object obj7;
        boolean z2;
        java.lang.Object obj8;
        java.lang.Object obj9;
        int i;
        java.lang.String str5;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        java.lang.Object obj14;
        java.lang.Object obj15;
        java.lang.String str6;
        int i2;
        boolean decodeBooleanElement;
        int i3;
        java.lang.String str7;
        java.lang.Object obj16;
        java.lang.String str8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i4 = 9;
        java.lang.String str9 = "com.zettle.sdk.core.auth.TokenProviderStatus";
        if (beginStructure.decodeSequentially()) {
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            obj12 = beginStructure.decodeSerializableElement(descriptor2, 1, com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), null);
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 4);
            obj10 = beginStructure.decodeSerializableElement(descriptor2, 5, com.zettle.sdk.core.user.CountryCode.INSTANCE.serializer(), null);
            obj8 = beginStructure.decodeSerializableElement(descriptor2, 6, new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            obj7 = beginStructure.decodeSerializableElement(descriptor2, 7, new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            java.lang.Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, com.zettle.sdk.core.user.OrganizationSettings$$serializer.INSTANCE, null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 9);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 10);
            obj6 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            obj11 = beginStructure.decodeSerializableElement(descriptor2, 12, new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), null);
            java.lang.Object decodeSerializableElement = beginStructure.decodeSerializableElement(descriptor2, 13, new kotlinx.serialization.internal.LinkedHashMapSerializer(com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.TransactionConfigEntry$$serializer.INSTANCE)), null);
            java.lang.Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 15);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 16);
            obj3 = decodeNullableSerializableElement4;
            i = 1048575;
            str5 = beginStructure.decodeStringElement(descriptor2, 17);
            z = decodeBooleanElement2;
            str = decodeStringElement2;
            str2 = decodeStringElement3;
            z2 = decodeBooleanElement3;
            obj = decodeSerializableElement;
            str3 = beginStructure.decodeStringElement(descriptor2, 18);
            obj5 = decodeNullableSerializableElement2;
            str4 = decodeStringElement;
            obj13 = decodeNullableSerializableElement3;
            obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 19, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.zettle.sdk.core.auth.TokenProviderStatus", com.zettle.sdk.core.auth.TokenProviderStatus.values()), null);
            obj4 = decodeNullableSerializableElement;
        } else {
            int i5 = 19;
            boolean z3 = true;
            boolean z4 = false;
            boolean z5 = false;
            java.lang.Object obj17 = null;
            java.lang.Object obj18 = null;
            java.lang.Object obj19 = null;
            java.lang.Object obj20 = null;
            java.lang.Object obj21 = null;
            obj = null;
            obj2 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.Object obj22 = null;
            java.lang.Object obj23 = null;
            java.lang.Object obj24 = null;
            java.lang.Object obj25 = null;
            java.lang.Object obj26 = null;
            java.lang.Object obj27 = null;
            int i6 = 0;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        obj14 = obj23;
                        z3 = false;
                        obj17 = obj17;
                        obj18 = obj18;
                        str9 = str9;
                        i4 = 9;
                        obj23 = obj14;
                    case 0:
                        obj14 = obj23;
                        obj26 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj26);
                        i6 |= 1;
                        obj17 = obj17;
                        obj25 = obj25;
                        obj18 = obj18;
                        str9 = str9;
                        i5 = 19;
                        i4 = 9;
                        obj23 = obj14;
                    case 1:
                        obj16 = obj18;
                        str8 = str9;
                        obj22 = beginStructure.decodeSerializableElement(descriptor2, 1, com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), obj22);
                        i6 |= 2;
                        obj17 = obj17;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 2:
                        obj16 = obj18;
                        str8 = str9;
                        obj27 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj27);
                        i6 |= 4;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 3:
                        obj16 = obj18;
                        str8 = str9;
                        obj24 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj24);
                        i6 |= 8;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 4:
                        obj16 = obj18;
                        str8 = str9;
                        str14 = beginStructure.decodeStringElement(descriptor2, 4);
                        i6 |= 16;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 5:
                        obj16 = obj18;
                        str8 = str9;
                        obj23 = beginStructure.decodeSerializableElement(descriptor2, 5, com.zettle.sdk.core.user.CountryCode.INSTANCE.serializer(), obj23);
                        i6 |= 32;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 6:
                        obj16 = obj18;
                        str8 = str9;
                        obj19 = beginStructure.decodeSerializableElement(descriptor2, 6, new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj19);
                        i6 |= 64;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 7:
                        obj15 = obj18;
                        str6 = str9;
                        i2 = i4;
                        obj25 = beginStructure.decodeSerializableElement(descriptor2, 7, new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj25);
                        i6 |= 128;
                        i4 = i2;
                        obj18 = obj15;
                        str9 = str6;
                        i5 = 19;
                    case 8:
                        obj17 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, com.zettle.sdk.core.user.OrganizationSettings$$serializer.INSTANCE, obj17);
                        i6 |= 256;
                        i4 = i4;
                        str9 = str9;
                        i5 = 19;
                        obj18 = obj18;
                    case 9:
                        obj15 = obj18;
                        str6 = str9;
                        i2 = i4;
                        str10 = beginStructure.decodeStringElement(descriptor2, i2);
                        i6 |= 512;
                        i4 = i2;
                        obj18 = obj15;
                        str9 = str6;
                        i5 = 19;
                    case 10:
                        obj16 = obj18;
                        str8 = str9;
                        str11 = beginStructure.decodeStringElement(descriptor2, 10);
                        i6 |= 1024;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 11:
                        obj16 = obj18;
                        str8 = str9;
                        obj21 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE), obj21);
                        i6 |= 2048;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 12:
                        obj16 = obj18;
                        str8 = str9;
                        obj20 = beginStructure.decodeSerializableElement(descriptor2, 12, new kotlinx.serialization.internal.LinkedHashSetSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), obj20);
                        i6 |= 4096;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 13:
                        obj16 = obj18;
                        str8 = str9;
                        obj = beginStructure.decodeSerializableElement(descriptor2, 13, new kotlinx.serialization.internal.LinkedHashMapSerializer(com.zettle.sdk.core.user.CurrencyCode.INSTANCE.serializer(), new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.TransactionConfigEntry$$serializer.INSTANCE)), obj);
                        i6 |= 8192;
                        obj18 = obj16;
                        str9 = str8;
                        i5 = 19;
                        i4 = 9;
                    case 14:
                        obj18 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj18);
                        i6 |= 16384;
                        i5 = 19;
                        i4 = 9;
                    case 15:
                        decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 15);
                        java.lang.String str15 = str12;
                        i3 = 32768;
                        str7 = str15;
                        i6 |= i3;
                        z4 = decodeBooleanElement;
                        str12 = str7;
                        i5 = 19;
                    case 16:
                        z5 = beginStructure.decodeBooleanElement(descriptor2, 16);
                        str7 = str12;
                        i3 = 65536;
                        decodeBooleanElement = z4;
                        i6 |= i3;
                        z4 = decodeBooleanElement;
                        str12 = str7;
                        i5 = 19;
                    case 17:
                        i3 = 131072;
                        str7 = beginStructure.decodeStringElement(descriptor2, 17);
                        decodeBooleanElement = z4;
                        i6 |= i3;
                        z4 = decodeBooleanElement;
                        str12 = str7;
                        i5 = 19;
                    case 18:
                        str13 = beginStructure.decodeStringElement(descriptor2, 18);
                        i6 |= 262144;
                    case 19:
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, i5, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer(str9, com.zettle.sdk.core.auth.TokenProviderStatus.values()), obj2);
                        i6 |= 524288;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.Object obj28 = obj17;
            obj3 = obj18;
            java.lang.Object obj29 = obj23;
            java.lang.Object obj30 = obj25;
            obj4 = obj26;
            obj5 = obj24;
            z = z4;
            obj6 = obj21;
            str = str10;
            str2 = str11;
            str3 = str13;
            str4 = str14;
            obj7 = obj30;
            z2 = z5;
            obj8 = obj19;
            obj9 = obj27;
            i = i6;
            str5 = str12;
            obj10 = obj29;
            obj11 = obj20;
            obj12 = obj22;
            obj13 = obj28;
        }
        beginStructure.endStructure(descriptor2);
        return new com.zettle.sdk.core.user.userconfig.DetailedUserConfig(i, (java.lang.String) obj4, (com.zettle.sdk.core.user.CurrencyCode) obj12, (java.lang.String) obj9, (java.lang.String) obj5, str4, (com.zettle.sdk.core.user.CountryCode) obj10, (java.util.Set) obj8, (java.util.Set) obj7, (com.zettle.sdk.core.user.OrganizationSettings) obj13, str, str2, (java.util.Map) obj6, (java.util.Set) obj11, (java.util.Map) obj, (java.lang.String) obj3, z, z2, str5, str3, (com.zettle.sdk.core.auth.TokenProviderStatus) obj2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.zettle.sdk.core.user.userconfig.DetailedUserConfig value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.zettle.sdk.core.user.userconfig.DetailedUserConfig.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
