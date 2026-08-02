package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/UserConfigShadow$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/zettle/sdk/core/user/shadow/UserConfigShadow;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/zettle/sdk/core/user/shadow/UserConfigShadow;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/zettle/sdk/core/user/shadow/UserConfigShadow;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
/* loaded from: classes3.dex */
public final class UserConfigShadow$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.zettle.sdk.core.user.shadow.UserConfigShadow> {
    public static final com.zettle.sdk.core.user.shadow.UserConfigShadow$$serializer INSTANCE;
    private static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor descriptor;

    static {
        com.zettle.sdk.core.user.shadow.UserConfigShadow$$serializer userConfigShadow$$serializer = new com.zettle.sdk.core.user.shadow.UserConfigShadow$$serializer();
        INSTANCE = userConfigShadow$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.zettle.sdk.core.user.shadow.UserConfigShadow", userConfigShadow$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("USER_INFO", false);
        pluginGeneratedSerialDescriptor.addElement("USER_INFO_HASH", false);
        pluginGeneratedSerialDescriptor.addElement("TRANSACTION_CONFIG_HASH", false);
        pluginGeneratedSerialDescriptor.addElement("TRANSACTION_CONFIG", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserConfigShadow$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.zettle.sdk.core.user.shadow.UserInfoShadow$$serializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, com.zettle.sdk.core.user.shadow.TransactionConfigShadow$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.zettle.sdk.core.user.shadow.UserConfigShadow deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        java.lang.String str3 = null;
        if (beginStructure.decodeSequentially()) {
            obj2 = beginStructure.decodeSerializableElement(descriptor2, 0, com.zettle.sdk.core.user.shadow.UserInfoShadow$$serializer.INSTANCE, null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 1);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            obj = beginStructure.decodeSerializableElement(descriptor2, 3, com.zettle.sdk.core.user.shadow.TransactionConfigShadow$$serializer.INSTANCE, null);
            str = decodeStringElement2;
            str2 = decodeStringElement;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.Object obj3 = null;
            java.lang.String str4 = null;
            java.lang.Object obj4 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    obj4 = beginStructure.decodeSerializableElement(descriptor2, 0, com.zettle.sdk.core.user.shadow.UserInfoShadow$$serializer.INSTANCE, obj4);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str4 = beginStructure.decodeStringElement(descriptor2, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str3 = beginStructure.decodeStringElement(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    obj3 = beginStructure.decodeSerializableElement(descriptor2, 3, com.zettle.sdk.core.user.shadow.TransactionConfigShadow$$serializer.INSTANCE, obj3);
                    i2 |= 8;
                }
            }
            i = i2;
            obj = obj3;
            obj2 = obj4;
            str = str3;
            str2 = str4;
        }
        beginStructure.endStructure(descriptor2);
        return new com.zettle.sdk.core.user.shadow.UserConfigShadow(i, (com.zettle.sdk.core.user.shadow.UserInfoShadow) obj2, str2, str, (com.zettle.sdk.core.user.shadow.TransactionConfigShadow) obj, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.zettle.sdk.core.user.shadow.UserConfigShadow value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        com.zettle.sdk.core.user.shadow.UserConfigShadow.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
