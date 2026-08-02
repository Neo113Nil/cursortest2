package com.paypal.oslo.feature.wallet.api.ui.fi.add.config;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/fi/add/config/AddFI$Config$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/fi/add/config/AddFI$Config;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/wallet/api/ui/fi/add/config/AddFI$Config;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/wallet/api/ui/fi/add/config/AddFI$Config;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AddFI$Config$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI$Config$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI$Config$$serializer addFI$Config$$serializer = new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI$Config$$serializer();
        INSTANCE = addFI$Config$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config", addFI$Config$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("topBarTitle", true);
        pluginGeneratedSerialDescriptor.addElement("startNavAction", true);
        pluginGeneratedSerialDescriptor.addElement("endNavAction", true);
        pluginGeneratedSerialDescriptor.addElement("screenTitle", true);
        pluginGeneratedSerialDescriptor.addElement("screenDescription", true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private AddFI$Config$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[1].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[2].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.util.Map map;
        com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction;
        java.lang.String str3;
        com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config.$childSerializers;
        int i2 = 3;
        java.lang.String str4 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction3 = (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction4 = (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            map = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            str2 = str5;
            str = str6;
            str3 = str7;
            i = 63;
            navAction = navAction3;
            navAction2 = navAction4;
        } else {
            int i3 = 0;
            boolean z = true;
            java.util.Map map2 = null;
            java.lang.String str8 = null;
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction5 = null;
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction6 = null;
            java.lang.String str9 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                    case 0:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i3 |= 1;
                        i2 = 3;
                    case 1:
                        navAction5 = (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), navAction5);
                        i3 |= 2;
                    case 2:
                        navAction6 = (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), navAction6);
                        i3 |= 4;
                    case 3:
                        str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str4);
                        i3 |= 8;
                    case 4:
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i3 |= 16;
                    case 5:
                        map2 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), map2);
                        i3 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction7 = navAction5;
            str = str4;
            str2 = str9;
            map = map2;
            navAction = navAction7;
            com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction8 = navAction6;
            str3 = str8;
            navAction2 = navAction8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config(i, str2, navAction, navAction2, str, str3, map, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config.write$Self$wallet_api_prodRelease(value, beginStructure, serialDescriptor);
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
