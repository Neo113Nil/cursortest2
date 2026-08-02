package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class RewardsDetailUiModel$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel$$serializer rewardsDetailUiModel$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel$$serializer();
        INSTANCE = rewardsDetailUiModel$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel", rewardsDetailUiModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("promoTitle", true);
        pluginGeneratedSerialDescriptor.addElement("cashBackBalance", false);
        pluginGeneratedSerialDescriptor.addElement("yearToDateCashBack", false);
        pluginGeneratedSerialDescriptor.addElement("lifetimeCashBack", false);
        pluginGeneratedSerialDescriptor.addElement("isRedeemSectionEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("isPayPalPlusEnrolled", true);
        pluginGeneratedSerialDescriptor.addElement("isPayPalPlusEligible", true);
        pluginGeneratedSerialDescriptor.addElement("loyaltyProgramLearnMoreUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RewardsDetailUiModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[1].getValue(), kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        boolean z;
        java.lang.String str;
        boolean z2;
        boolean z3;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalanceUiModel;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        int i5 = 3;
        if (beginStructure.decodeSequentially()) {
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalanceUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(serialDescriptor, 6);
            cashBackBalanceUiModel = cashBackBalanceUiModel2;
            str2 = str5;
            str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            z = decodeBooleanElement3;
            z2 = decodeBooleanElement2;
            str3 = decodeStringElement2;
            z3 = decodeBooleanElement;
            str4 = decodeStringElement;
            i = 255;
        } else {
            boolean z4 = true;
            boolean z5 = false;
            boolean z6 = false;
            int i6 = 0;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalanceUiModel3 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            boolean z7 = false;
            while (z4) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z4 = false;
                        i3 = 6;
                        i4 = 5;
                        i5 = 3;
                    case 0:
                        str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str8);
                        i6 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 3;
                    case 1:
                        cashBackBalanceUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), cashBackBalanceUiModel3);
                        i6 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                    case 3:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, i5);
                        i6 |= 8;
                    case 4:
                        z6 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i6 |= 16;
                    case 5:
                        z7 = beginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i6 |= 32;
                    case 6:
                        z5 = beginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i6 |= 64;
                    case 7:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i6 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel cashBackBalanceUiModel4 = cashBackBalanceUiModel3;
            java.lang.String str10 = str8;
            z = z5;
            str = str9;
            z2 = z7;
            z3 = z6;
            i = i6;
            cashBackBalanceUiModel = cashBackBalanceUiModel4;
            str2 = str10;
            java.lang.String str11 = str7;
            str3 = str6;
            str4 = str11;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel(i, str2, cashBackBalanceUiModel, str4, str3, z3, z2, z, str, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
