package com.paypal.oslo.feature.userprofile.api.navigation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/api/navigation/ConfirmationBottomSheetDestination$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/userprofile/api/navigation/ConfirmationBottomSheetDestination;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/userprofile/api/navigation/ConfirmationBottomSheetDestination;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/userprofile/api/navigation/ConfirmationBottomSheetDestination;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ConfirmationBottomSheetDestination$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination> {
    public static final com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination$$serializer confirmationBottomSheetDestination$$serializer = new com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination$$serializer();
        INSTANCE = confirmationBottomSheetDestination$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination", confirmationBottomSheetDestination$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("iconName", true);
        pluginGeneratedSerialDescriptor.addElement("titleRes", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionRes", false);
        pluginGeneratedSerialDescriptor.addElement("primaryButtonTextRes", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryButtonTextRes", false);
        pluginGeneratedSerialDescriptor.addElement("analyticsScreenId", true);
        pluginGeneratedSerialDescriptor.addElement("analyticsFeature", true);
        pluginGeneratedSerialDescriptor.addElement("analyticsAction", true);
        pluginGeneratedSerialDescriptor.addElement("analyticsPrimaryItemName", true);
        pluginGeneratedSerialDescriptor.addElement("analyticsSecondaryItemName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConfirmationBottomSheetDestination$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i2;
        java.lang.String str4;
        int i3;
        java.lang.String str5;
        int i4;
        java.lang.String str6;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i6 = 9;
        int i7 = 7;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 1);
            i3 = beginStructure.decodeIntElement(serialDescriptor, 2);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 3);
            int decodeIntElement3 = beginStructure.decodeIntElement(serialDescriptor, 4);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            str6 = str10;
            str5 = str9;
            str4 = str8;
            str2 = str11;
            str = str7;
            i5 = decodeIntElement2;
            i2 = 1023;
            i = decodeIntElement3;
            i4 = decodeIntElement;
        } else {
            boolean z = true;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            java.lang.String str16 = null;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            i = 0;
            java.lang.String str17 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i7 = 7;
                    case 0:
                        i9 |= 1;
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i6 = 9;
                        i7 = 7;
                    case 1:
                        i9 |= 2;
                        i11 = beginStructure.decodeIntElement(serialDescriptor, 1);
                        i6 = 9;
                    case 2:
                        i9 |= 4;
                        i10 = beginStructure.decodeIntElement(serialDescriptor, 2);
                        i6 = 9;
                    case 3:
                        i9 |= 8;
                        i8 = beginStructure.decodeIntElement(serialDescriptor, 3);
                        i6 = 9;
                    case 4:
                        i = beginStructure.decodeIntElement(serialDescriptor, 4);
                        i9 |= 16;
                        i6 = 9;
                    case 5:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i9 |= 32;
                        i6 = 9;
                    case 6:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i9 |= 64;
                        i6 = 9;
                    case 7:
                        str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i7, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        i9 |= 128;
                    case 8:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i9 |= 256;
                    case 9:
                        str17 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i6, kotlinx.serialization.internal.StringSerializer.INSTANCE, str17);
                        i9 |= 512;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str16;
            str2 = str12;
            str3 = str17;
            i2 = i9;
            str4 = str14;
            i3 = i10;
            str5 = str13;
            i4 = i11;
            str6 = str15;
            i5 = i8;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination(i2, str, i4, i3, i5, i, str4, str5, str6, str2, str3, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination.write$Self$user_profile_api_prodRelease(value, beginStructure, serialDescriptor);
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
