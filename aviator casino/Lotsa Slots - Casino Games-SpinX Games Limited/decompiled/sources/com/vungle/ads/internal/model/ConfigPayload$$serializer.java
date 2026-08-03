package com.vungle.ads.internal.model;

/* compiled from: ConfigPayload.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class ConfigPayload$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.vungle.ads.internal.model.ConfigPayload> {
    public static final com.vungle.ads.internal.model.ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        com.vungle.ads.internal.model.ConfigPayload$$serializer configPayload$$serializer = new com.vungle.ads.internal.model.ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("reuse_assets", true);
        pluginGeneratedSerialDescriptor.addElement(com.helpshift.proactive.InAppViewConstants.CONFIG, true);
        pluginGeneratedSerialDescriptor.addElement("endpoints", true);
        pluginGeneratedSerialDescriptor.addElement("log_metrics", true);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.C3225pd.c, true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement(com.vungle.ads.internal.model.Cookie.CONFIG_EXTENSION, true);
        pluginGeneratedSerialDescriptor.addElement(com.vungle.ads.internal.model.Cookie.COPPA_DISABLE_AD_ID, true);
        pluginGeneratedSerialDescriptor.addElement("ri_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("wait_for_connectivity_for_tpat", true);
        pluginGeneratedSerialDescriptor.addElement("sdk_session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("signals_disabled", true);
        pluginGeneratedSerialDescriptor.addElement("fpd_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("rta_debugging", true);
        pluginGeneratedSerialDescriptor.addElement("config_last_validated_ts", true);
        pluginGeneratedSerialDescriptor.addElement("auto_redirect", true);
        pluginGeneratedSerialDescriptor.addElement("enable_ot", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.ConfigPayload$CleverCache$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.ConfigPayload$ConfigSettings$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.ConfigPayload$Endpoints$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.ConfigPayload$LogMetricsSettings$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.model.Placement$$serializer.INSTANCE)), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.ConfigPayload$UserPrivacy$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.IntSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.LongSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.vungle.ads.internal.model.ConfigPayload$AutoRedirect$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.BooleanSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public com.vungle.ads.internal.model.ConfigPayload deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        int i;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        java.lang.Object obj14;
        java.lang.Object obj15;
        java.lang.Object obj16;
        java.lang.Object obj17;
        java.lang.Object obj18;
        java.lang.Object obj19;
        java.lang.Object obj20;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            java.lang.Object decodeNullableSerializableElement = beginStructure.decodeNullableSerializableElement(descriptor2, 0, com.vungle.ads.internal.model.ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            obj9 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, com.vungle.ads.internal.model.ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            obj8 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, com.vungle.ads.internal.model.ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement2 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, com.vungle.ads.internal.model.ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            obj10 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.model.Placement$$serializer.INSTANCE), null);
            java.lang.Object decodeNullableSerializableElement3 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, com.vungle.ads.internal.model.ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement4 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement5 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            java.lang.Object decodeNullableSerializableElement6 = beginStructure.decodeNullableSerializableElement(descriptor2, 8, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj18 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj17 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj16 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, kotlinx.serialization.internal.IntSerializer.INSTANCE, null);
            obj15 = beginStructure.decodeNullableSerializableElement(descriptor2, 12, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj14 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj13 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj12 = beginStructure.decodeNullableSerializableElement(descriptor2, 15, kotlinx.serialization.internal.LongSerializer.INSTANCE, null);
            obj4 = decodeNullableSerializableElement3;
            i = 262143;
            obj3 = decodeNullableSerializableElement4;
            obj2 = decodeNullableSerializableElement5;
            obj = decodeNullableSerializableElement6;
            obj11 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, com.vungle.ads.internal.model.ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            obj6 = decodeNullableSerializableElement;
            obj5 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, null);
            obj7 = decodeNullableSerializableElement2;
        } else {
            java.lang.Object obj21 = null;
            java.lang.Object obj22 = null;
            java.lang.Object obj23 = null;
            java.lang.Object obj24 = null;
            java.lang.Object obj25 = null;
            java.lang.Object obj26 = null;
            java.lang.Object obj27 = null;
            obj = null;
            obj2 = null;
            obj3 = null;
            java.lang.Object obj28 = null;
            obj4 = null;
            java.lang.Object obj29 = null;
            java.lang.Object obj30 = null;
            java.lang.Object obj31 = null;
            java.lang.Object obj32 = null;
            java.lang.Object obj33 = null;
            java.lang.Object obj34 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        obj21 = obj21;
                        obj25 = obj25;
                        obj22 = obj22;
                        z = false;
                    case 0:
                        obj34 = beginStructure.decodeNullableSerializableElement(descriptor2, 0, com.vungle.ads.internal.model.ConfigPayload$CleverCache$$serializer.INSTANCE, obj34);
                        i2 |= 1;
                        obj21 = obj21;
                        obj25 = obj25;
                        obj22 = obj22;
                    case 1:
                        i2 |= 2;
                        obj21 = beginStructure.decodeNullableSerializableElement(descriptor2, 1, com.vungle.ads.internal.model.ConfigPayload$ConfigSettings$$serializer.INSTANCE, obj21);
                        obj25 = obj25;
                        obj29 = obj29;
                    case 2:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj24 = beginStructure.decodeNullableSerializableElement(descriptor2, 2, com.vungle.ads.internal.model.ConfigPayload$Endpoints$$serializer.INSTANCE, obj24);
                        i2 |= 4;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 3:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj23 = beginStructure.decodeNullableSerializableElement(descriptor2, 3, com.vungle.ads.internal.model.ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, obj23);
                        i2 |= 8;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 4:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj28 = beginStructure.decodeNullableSerializableElement(descriptor2, 4, new kotlinx.serialization.internal.ArrayListSerializer(com.vungle.ads.internal.model.Placement$$serializer.INSTANCE), obj28);
                        i2 |= 16;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 5:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj4 = beginStructure.decodeNullableSerializableElement(descriptor2, 5, com.vungle.ads.internal.model.ConfigPayload$UserPrivacy$$serializer.INSTANCE, obj4);
                        i2 |= 32;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 6:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj3 = beginStructure.decodeNullableSerializableElement(descriptor2, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, obj3);
                        i2 |= 64;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 7:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj2 = beginStructure.decodeNullableSerializableElement(descriptor2, 7, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj2);
                        i2 |= 128;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 8:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj = beginStructure.decodeNullableSerializableElement(descriptor2, 8, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj);
                        i2 |= 256;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 9:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj22 = beginStructure.decodeNullableSerializableElement(descriptor2, 9, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj22);
                        i2 |= 512;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 10:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj27 = beginStructure.decodeNullableSerializableElement(descriptor2, 10, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj27);
                        i2 |= 1024;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 11:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj26 = beginStructure.decodeNullableSerializableElement(descriptor2, 11, kotlinx.serialization.internal.IntSerializer.INSTANCE, obj26);
                        i2 |= 2048;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 12:
                        obj19 = obj21;
                        obj29 = beginStructure.decodeNullableSerializableElement(descriptor2, 12, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj29);
                        i2 |= 4096;
                        obj25 = obj25;
                        obj30 = obj30;
                        obj21 = obj19;
                    case 13:
                        obj19 = obj21;
                        obj30 = beginStructure.decodeNullableSerializableElement(descriptor2, 13, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj30);
                        i2 |= 8192;
                        obj25 = obj25;
                        obj31 = obj31;
                        obj21 = obj19;
                    case 14:
                        obj19 = obj21;
                        obj31 = beginStructure.decodeNullableSerializableElement(descriptor2, 14, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj31);
                        i2 |= 16384;
                        obj25 = obj25;
                        obj32 = obj32;
                        obj21 = obj19;
                    case 15:
                        obj19 = obj21;
                        obj32 = beginStructure.decodeNullableSerializableElement(descriptor2, 15, kotlinx.serialization.internal.LongSerializer.INSTANCE, obj32);
                        i2 |= 32768;
                        obj25 = obj25;
                        obj33 = obj33;
                        obj21 = obj19;
                    case 16:
                        obj19 = obj21;
                        obj20 = obj25;
                        obj33 = beginStructure.decodeNullableSerializableElement(descriptor2, 16, com.vungle.ads.internal.model.ConfigPayload$AutoRedirect$$serializer.INSTANCE, obj33);
                        i2 |= 65536;
                        obj25 = obj20;
                        obj21 = obj19;
                    case 17:
                        obj19 = obj21;
                        obj25 = beginStructure.decodeNullableSerializableElement(descriptor2, 17, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, obj25);
                        i2 |= 131072;
                        obj21 = obj19;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.Object obj35 = obj22;
            obj5 = obj25;
            java.lang.Object obj36 = obj21;
            obj6 = obj34;
            obj7 = obj23;
            obj8 = obj24;
            i = i2;
            obj9 = obj36;
            obj10 = obj28;
            obj11 = obj33;
            obj12 = obj32;
            obj13 = obj31;
            obj14 = obj30;
            obj15 = obj29;
            obj16 = obj26;
            obj17 = obj27;
            obj18 = obj35;
        }
        beginStructure.endStructure(descriptor2);
        return new com.vungle.ads.internal.model.ConfigPayload(i, (com.vungle.ads.internal.model.ConfigPayload.CleverCache) obj6, (com.vungle.ads.internal.model.ConfigPayload.ConfigSettings) obj9, (com.vungle.ads.internal.model.ConfigPayload.Endpoints) obj8, (com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings) obj7, (java.util.List) obj10, (com.vungle.ads.internal.model.ConfigPayload.UserPrivacy) obj4, (java.lang.String) obj3, (java.lang.Boolean) obj2, (java.lang.Boolean) obj, (java.lang.Integer) obj18, (java.lang.Boolean) obj17, (java.lang.Integer) obj16, (java.lang.Boolean) obj15, (java.lang.Boolean) obj14, (java.lang.Boolean) obj13, (java.lang.Long) obj12, (com.vungle.ads.internal.model.ConfigPayload.AutoRedirect) obj11, (java.lang.Boolean) obj5, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.vungle.ads.internal.model.ConfigPayload value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.vungle.ads.internal.model.ConfigPayload.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
