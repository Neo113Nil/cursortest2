package com.ingo.sdk.kotlin.common.features.history.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class TransactionDetails$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails> {
    public static final com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails$$serializer transactionDetails$$serializer = new com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails$$serializer();
        INSTANCE = transactionDetails$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails", transactionDetails$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("transactionReferenceNumber", false);
        pluginGeneratedSerialDescriptor.addElement("transactionStatus", false);
        pluginGeneratedSerialDescriptor.addElement("transactionStatusTitle", false);
        pluginGeneratedSerialDescriptor.addElement("transactionStatusDescription", false);
        pluginGeneratedSerialDescriptor.addElement("fundsTiming", false);
        pluginGeneratedSerialDescriptor.addElement("fundsTimingDescription", false);
        pluginGeneratedSerialDescriptor.addElement("totalFundingAmountInCents", false);
        pluginGeneratedSerialDescriptor.addElement("checkDetails", false);
        pluginGeneratedSerialDescriptor.addElement("fundingDestinations", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.LongSerializer.INSTANCE, com.ingo.sdk.kotlin.common.features.history.model.CheckDetails$$serializer.INSTANCE, lazyArr[8].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        long j;
        java.util.List list;
        com.ingo.sdk.kotlin.common.features.history.model.CheckDetails checkDetails;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails.$childSerializers;
        int i2 = 7;
        java.lang.String str7 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 2);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement5 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement6 = beginStructure.decodeStringElement(serialDescriptor, 5);
            long decodeLongElement = beginStructure.decodeLongElement(serialDescriptor, 6);
            com.ingo.sdk.kotlin.common.features.history.model.CheckDetails checkDetails2 = (com.ingo.sdk.kotlin.common.features.history.model.CheckDetails) beginStructure.decodeSerializableElement(serialDescriptor, 7, com.ingo.sdk.kotlin.common.features.history.model.CheckDetails$$serializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), null);
            str3 = decodeStringElement;
            checkDetails = checkDetails2;
            i = 511;
            str4 = decodeStringElement6;
            str = decodeStringElement5;
            str6 = decodeStringElement2;
            j = decodeLongElement;
            str5 = decodeStringElement4;
            str2 = decodeStringElement3;
        } else {
            int i3 = 0;
            boolean z = true;
            java.util.List list2 = null;
            com.ingo.sdk.kotlin.common.features.history.model.CheckDetails checkDetails3 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            long j2 = 0;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                    case 3:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                    case 4:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                    case 5:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                    case 6:
                        j2 = beginStructure.decodeLongElement(serialDescriptor, 6);
                        i3 |= 64;
                    case 7:
                        checkDetails3 = (com.ingo.sdk.kotlin.common.features.history.model.CheckDetails) beginStructure.decodeSerializableElement(serialDescriptor, i2, com.ingo.sdk.kotlin.common.features.history.model.CheckDetails$$serializer.INSTANCE, checkDetails3);
                        i3 |= 128;
                    case 8:
                        list2 = (java.util.List) beginStructure.decodeSerializableElement(serialDescriptor, 8, (kotlinx.serialization.DeserializationStrategy) lazyArr[8].getValue(), list2);
                        i3 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str11;
            str2 = str8;
            str3 = str10;
            str4 = str12;
            str5 = str7;
            str6 = str9;
            j = j2;
            list = list2;
            checkDetails = checkDetails3;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails(i, str3, str6, str2, str5, str, str4, j, checkDetails, list, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails.write$Self$sharedSdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private TransactionDetails$$serializer() {
    }
}
