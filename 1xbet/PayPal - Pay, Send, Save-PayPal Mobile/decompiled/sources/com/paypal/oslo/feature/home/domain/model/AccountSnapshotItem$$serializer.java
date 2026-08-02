package com.paypal.oslo.feature.home.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AccountSnapshotItem$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem$$serializer accountSnapshotItem$$serializer = new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem$$serializer();
        INSTANCE = accountSnapshotItem$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem", accountSnapshotItem$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("backgroundColor", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("titleColor", false);
        pluginGeneratedSerialDescriptor.addElement("amount", false);
        pluginGeneratedSerialDescriptor.addElement("amountColor", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("footer", false);
        pluginGeneratedSerialDescriptor.addElement("footerColor", false);
        pluginGeneratedSerialDescriptor.addElement("footerIcon", false);
        pluginGeneratedSerialDescriptor.addElement("footerIconColor", false);
        pluginGeneratedSerialDescriptor.addElement("imageUrls", false);
        pluginGeneratedSerialDescriptor.addElement("icons", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AccountSnapshotItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, lazyArr[1].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[2].getValue()), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[6].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[9].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[10].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[11].getValue()), lazyArr[12].getValue(), lazyArr[13].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        com.paypal.oslo.feature.home.domain.model.FooterColors footerColors;
        com.paypal.oslo.feature.home.domain.model.FooterColors footerColors2;
        java.util.List list;
        com.paypal.oslo.feature.home.domain.model.TitleColors titleColors;
        int i;
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon;
        java.lang.String str2;
        com.paypal.oslo.feature.home.api.AccountSnapshotType accountSnapshotType;
        com.paypal.oslo.feature.home.domain.model.AmountColors amountColors;
        java.lang.String str3;
        java.util.List list2;
        java.lang.String str4;
        java.lang.String str5;
        com.paypal.oslo.feature.home.domain.model.BackgroundColors backgroundColors;
        kotlin.Lazy[] lazyArr2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem.$childSerializers;
        int i2 = 8;
        int i3 = 10;
        int i4 = 9;
        java.util.List list3 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            com.paypal.oslo.feature.home.api.AccountSnapshotType accountSnapshotType2 = (com.paypal.oslo.feature.home.api.AccountSnapshotType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            com.paypal.oslo.feature.home.domain.model.BackgroundColors backgroundColors2 = (com.paypal.oslo.feature.home.domain.model.BackgroundColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            com.paypal.oslo.feature.home.domain.model.TitleColors titleColors2 = (com.paypal.oslo.feature.home.domain.model.TitleColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.lang.String str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            amountColors = (com.paypal.oslo.feature.home.domain.model.AmountColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.home.domain.model.FooterColors footerColors3 = (com.paypal.oslo.feature.home.domain.model.FooterColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (kotlinx.serialization.DeserializationStrategy) lazyArr[9].getValue(), null);
            com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon2 = (com.paypal.oslo.feature.home.domain.model.HomeIcon) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (kotlinx.serialization.DeserializationStrategy) lazyArr[10].getValue(), null);
            com.paypal.oslo.feature.home.domain.model.FooterColors footerColors4 = (com.paypal.oslo.feature.home.domain.model.FooterColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), null);
            java.util.List list4 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), null);
            list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 13, (kotlinx.serialization.DeserializationStrategy) lazyArr[13].getValue(), null);
            list = list4;
            str3 = str8;
            footerColors = footerColors3;
            str5 = decodeStringElement;
            str2 = str6;
            footerColors2 = footerColors4;
            homeIcon = homeIcon2;
            titleColors = titleColors2;
            str = str7;
            str4 = decodeStringElement2;
            i = 16383;
            backgroundColors = backgroundColors2;
            accountSnapshotType = accountSnapshotType2;
        } else {
            int i5 = 13;
            boolean z = true;
            com.paypal.oslo.feature.home.domain.model.FooterColors footerColors5 = null;
            com.paypal.oslo.feature.home.domain.model.FooterColors footerColors6 = null;
            java.util.List list5 = null;
            java.lang.String str9 = null;
            com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon3 = null;
            com.paypal.oslo.feature.home.api.AccountSnapshotType accountSnapshotType3 = null;
            com.paypal.oslo.feature.home.domain.model.AmountColors amountColors2 = null;
            java.lang.String str10 = null;
            com.paypal.oslo.feature.home.domain.model.TitleColors titleColors3 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            com.paypal.oslo.feature.home.domain.model.BackgroundColors backgroundColors3 = null;
            int i6 = 0;
            str = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        lazyArr2 = lazyArr;
                        z = false;
                        lazyArr = lazyArr2;
                        i5 = 13;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                    case 0:
                        lazyArr2 = lazyArr;
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        lazyArr = lazyArr2;
                        i5 = 13;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                    case 1:
                        lazyArr2 = lazyArr;
                        accountSnapshotType3 = (com.paypal.oslo.feature.home.api.AccountSnapshotType) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), accountSnapshotType3);
                        i6 |= 2;
                        lazyArr = lazyArr2;
                        i5 = 13;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                    case 2:
                        backgroundColors3 = (com.paypal.oslo.feature.home.domain.model.BackgroundColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), backgroundColors3);
                        i6 |= 4;
                        str10 = str10;
                        i5 = 13;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                    case 3:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 13;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                    case 4:
                        titleColors3 = (com.paypal.oslo.feature.home.domain.model.TitleColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), titleColors3);
                        i6 |= 16;
                        i5 = 13;
                        i2 = 8;
                        i3 = 10;
                        i4 = 9;
                    case 5:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i6 |= 32;
                        i5 = 13;
                        i2 = 8;
                        i3 = 10;
                    case 6:
                        amountColors2 = (com.paypal.oslo.feature.home.domain.model.AmountColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (kotlinx.serialization.DeserializationStrategy) lazyArr[6].getValue(), amountColors2);
                        i6 |= 64;
                        i5 = 13;
                        i2 = 8;
                    case 7:
                        str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str);
                        i6 |= 128;
                        i5 = 13;
                    case 8:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i6 |= 256;
                        i5 = 13;
                    case 9:
                        footerColors5 = (com.paypal.oslo.feature.home.domain.model.FooterColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (kotlinx.serialization.DeserializationStrategy) lazyArr[i4].getValue(), footerColors5);
                        i6 |= 512;
                        i5 = 13;
                    case 10:
                        homeIcon3 = (com.paypal.oslo.feature.home.domain.model.HomeIcon) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (kotlinx.serialization.DeserializationStrategy) lazyArr[i3].getValue(), homeIcon3);
                        i6 |= 1024;
                        i5 = 13;
                    case 11:
                        footerColors6 = (com.paypal.oslo.feature.home.domain.model.FooterColors) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (kotlinx.serialization.DeserializationStrategy) lazyArr[11].getValue(), footerColors6);
                        i6 |= 2048;
                        i5 = 13;
                    case 12:
                        list5 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 12, (kotlinx.serialization.DeserializationStrategy) lazyArr[12].getValue(), list5);
                        i6 |= 4096;
                        i5 = 13;
                    case 13:
                        list3 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, i5, (kotlinx.serialization.DeserializationStrategy) lazyArr[i5].getValue(), list3);
                        i6 |= 8192;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.home.api.AccountSnapshotType accountSnapshotType4 = accountSnapshotType3;
            footerColors = footerColors5;
            footerColors2 = footerColors6;
            list = list5;
            titleColors = titleColors3;
            i = i6;
            homeIcon = homeIcon3;
            str2 = str10;
            accountSnapshotType = accountSnapshotType4;
            amountColors = amountColors2;
            str3 = str9;
            list2 = list3;
            str4 = str11;
            str5 = str12;
            backgroundColors = backgroundColors3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem(i, str5, accountSnapshotType, backgroundColors, str4, titleColors, str2, amountColors, str, str3, footerColors, homeIcon, footerColors2, list, list2, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem.write$Self$home_prodRelease(value, beginStructure, serialDescriptor);
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
