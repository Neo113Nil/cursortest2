package com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityDetailDestinationArgs;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityDetailDestinationArgs$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs> {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs$$serializer activityDetailDestinationArgs$$serializer = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs$$serializer();
        INSTANCE = activityDetailDestinationArgs$$serializer;
        $stable = 8;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs", activityDetailDestinationArgs$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("transaction", false);
        pluginGeneratedSerialDescriptor.addElement("creditAccountId", true);
        pluginGeneratedSerialDescriptor.addElement("creditProductIdentifier", false);
        pluginGeneratedSerialDescriptor.addElement("servicingContact", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ActivityDetailDestinationArgs$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{lazyArr[0].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE), lazyArr[2].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact;
        java.lang.String str;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs.$childSerializers;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = null;
        if (beginStructure.decodeSequentially()) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), null);
            java.lang.String str2 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            transaction = transaction2;
            customerServiceContact = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact$$serializer.INSTANCE, null);
            str = str2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact2 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    transaction3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction) beginStructure.decodeSerializableElement(serialDescriptor, 0, (kotlinx.serialization.DeserializationStrategy) lazyArr[0].getValue(), transaction3);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), creditProductIdentifier2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    customerServiceContact2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact$$serializer.INSTANCE, customerServiceContact2);
                    i2 |= 8;
                }
            }
            i = i2;
            creditProductIdentifier = creditProductIdentifier2;
            customerServiceContact = customerServiceContact2;
            str = str3;
            transaction = transaction3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs(i, transaction, str, creditProductIdentifier, customerServiceContact, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs.write$Self$revolvingcredit_servicing_prodRelease(value, beginStructure, serialDescriptor);
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
