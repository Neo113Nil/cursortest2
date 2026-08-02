package com.paypal.oslo.feature.home.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/home/ui/navigation/NavigationParams$ShoppingParams;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class NavigationParams$ShoppingParams$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.home.ui.navigation.NavigationParams$ShoppingParams$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.home.ui.navigation.NavigationParams$ShoppingParams$$serializer navigationParams$ShoppingParams$$serializer = new com.paypal.oslo.feature.home.ui.navigation.NavigationParams$ShoppingParams$$serializer();
        INSTANCE = navigationParams$ShoppingParams$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams", navigationParams$ShoppingParams$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("itemId", false);
        pluginGeneratedSerialDescriptor.addElement("itemType", false);
        pluginGeneratedSerialDescriptor.addElement("itemName", true);
        pluginGeneratedSerialDescriptor.addElement("storeUrl", true);
        pluginGeneratedSerialDescriptor.addElement("merchantLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("benefitTypes", true);
        pluginGeneratedSerialDescriptor.addElement("benefitsMetadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NavigationParams$ShoppingParams$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[5].getValue(), com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata;
        java.util.List list;
        java.lang.String str2;
        java.lang.String str3;
        int i;
        com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams.$childSerializers;
        int i2 = 6;
        java.lang.String str5 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType2 = (com.paypal.oslo.feature.home.ui.navigation.CollectionType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            str3 = decodeStringElement;
            benefitsMetadata = (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata) beginStructure.decodeSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE, null);
            str4 = str7;
            str2 = str8;
            str = str6;
            i = 127;
            collectionType = collectionType2;
        } else {
            int i3 = 0;
            boolean z = true;
            com.paypal.oslo.feature.home.ui.navigation.CollectionType collectionType3 = null;
            com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata benefitsMetadata2 = null;
            java.util.List list2 = null;
            java.lang.String str9 = null;
            str = null;
            java.lang.String str10 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        collectionType3 = (com.paypal.oslo.feature.home.ui.navigation.CollectionType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), collectionType3);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str);
                        i3 |= 4;
                    case 3:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i3 |= 8;
                    case 4:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i3 |= 16;
                    case 5:
                        list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), list2);
                        i3 |= 32;
                    case 6:
                        benefitsMetadata2 = (com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata) beginStructure.decodeSerializableElement(serialDescriptor, i2, com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.BenefitsMetadata$$serializer.INSTANCE, benefitsMetadata2);
                        i3 |= 64;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            benefitsMetadata = benefitsMetadata2;
            list = list2;
            str2 = str9;
            str3 = str10;
            i = i3;
            collectionType = collectionType3;
            str4 = str5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams(i, str3, collectionType, str, str4, str2, list, benefitsMetadata, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.home.ui.navigation.NavigationParams.ShoppingParams.write$Self$home_prodRelease(value, beginStructure, serialDescriptor);
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
