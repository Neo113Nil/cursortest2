package com.paypal.oslo.feature.searchandintelligence.domain.model.productcard;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ProductCard$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard$$serializer productCard$$serializer = new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard$$serializer();
        INSTANCE = productCard$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard", productCard$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("primary_image_url", true);
        pluginGeneratedSerialDescriptor.addElement("secondary_image_urls", true);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("info", true);
        pluginGeneratedSerialDescriptor.addElement("current_price", false);
        pluginGeneratedSerialDescriptor.addElement("list_price", true);
        pluginGeneratedSerialDescriptor.addElement("promotional_message", true);
        pluginGeneratedSerialDescriptor.addElement("canonical_url", true);
        pluginGeneratedSerialDescriptor.addElement("details", true);
        pluginGeneratedSerialDescriptor.addElement("agenticActions", true);
        pluginGeneratedSerialDescriptor.addElement("store_id", true);
        pluginGeneratedSerialDescriptor.addElement("store_logo_url", true);
        pluginGeneratedSerialDescriptor.addElement("store_name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProductCard$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[2].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price$$serializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[9].getValue(), lazyArr[10].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.Map map;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price price;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List list;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price price2;
        java.util.List list2;
        int i;
        java.util.List list3;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price price3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard.$childSerializers;
        int i2 = 8;
        int i3 = 10;
        java.util.List list4 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.util.List list5 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 4);
            com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price price4 = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price$$serializer.INSTANCE, null);
            com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price price5 = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price$$serializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 8);
            java.util.Map map2 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            java.util.List list6 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            price2 = price4;
            str6 = decodeStringElement5;
            str = str11;
            map = map2;
            str5 = decodeStringElement2;
            list2 = list6;
            i = 16383;
            str4 = str10;
            price = price5;
            str8 = decodeStringElement3;
            str7 = decodeStringElement4;
            str9 = decodeStringElement;
            list = list5;
        } else {
            int i4 = 13;
            boolean z = true;
            java.util.Map map3 = null;
            com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price price6 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            java.lang.String str16 = null;
            java.lang.String str17 = null;
            java.lang.String str18 = null;
            java.util.List list7 = null;
            java.lang.String str19 = null;
            com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price price7 = null;
            int i5 = 0;
            java.lang.String str20 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        list3 = list7;
                        price3 = price7;
                        z = false;
                        price7 = price3;
                        list7 = list3;
                        i4 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 0:
                        list3 = list7;
                        price3 = price7;
                        i5 |= 1;
                        str19 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        price7 = price3;
                        list7 = list3;
                        i4 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 1:
                        list3 = list7;
                        price3 = price7;
                        i5 |= 2;
                        str15 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        price7 = price3;
                        list7 = list3;
                        i4 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 2:
                        price3 = price7;
                        i5 |= 4;
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), list7);
                        price7 = price3;
                        list7 = list3;
                        i4 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 3:
                        price3 = price7;
                        i5 |= 8;
                        str18 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        list3 = list7;
                        price7 = price3;
                        list7 = list3;
                        i4 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 4:
                        price3 = price7;
                        i5 |= 16;
                        str17 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        list3 = list7;
                        price7 = price3;
                        list7 = list3;
                        i4 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 5:
                        price3 = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price) beginStructure.decodeSerializableElement(serialDescriptor, 5, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price$$serializer.INSTANCE, price7);
                        i5 |= 32;
                        list3 = list7;
                        price7 = price3;
                        list7 = list3;
                        i4 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 6:
                        price6 = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.Price$$serializer.INSTANCE, price6);
                        i5 |= 64;
                        list3 = list7;
                        price3 = price7;
                        price7 = price3;
                        list7 = list3;
                        i4 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 7:
                        i5 |= 128;
                        str20 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str20);
                        list3 = list7;
                        price3 = price7;
                        price7 = price3;
                        list7 = list3;
                        i4 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 8:
                        str16 = beginStructure.decodeStringElement(serialDescriptor, i2);
                        i5 |= 256;
                        i4 = 13;
                    case 9:
                        map3 = (java.util.Map) beginStructure.decodeSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), map3);
                        i5 |= 512;
                        i4 = 13;
                    case 10:
                        list4 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, i3, (kotlinx.serialization.DeserializationStrategy) lazyArr[i3].getValue(), list4);
                        i5 |= 1024;
                        i4 = 13;
                    case 11:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i5 |= 2048;
                        i4 = 13;
                    case 12:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i5 |= 4096;
                        i4 = 13;
                    case 13:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i5 |= 8192;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            map = map3;
            price = price6;
            str = str12;
            str2 = str13;
            str3 = str14;
            list = list7;
            str4 = str20;
            str5 = str15;
            str6 = str16;
            str7 = str17;
            str8 = str18;
            str9 = str19;
            price2 = price7;
            list2 = list4;
            i = i5;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard(i, str9, str5, list, str8, str7, price2, price, str4, str6, map, list2, str, str3, str2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard.write$Self$search_and_intelligence_prodRelease(value, beginStructure, serialDescriptor);
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
