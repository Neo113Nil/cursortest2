package com.ingo.sdk.kotlin.common.core.http.response;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionInProgressInformation;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes.dex */
public final /* synthetic */ class TransactionInProgressInformation$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation> {
    public static final com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation$$serializer transactionInProgressInformation$$serializer = new com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation$$serializer();
        INSTANCE = transactionInProgressInformation$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation", transactionInProgressInformation$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("transactionReferenceNumber", false);
        pluginGeneratedSerialDescriptor.addElement("transactionAmountInCents", false);
        pluginGeneratedSerialDescriptor.addElement("checkAmountInCents", false);
        pluginGeneratedSerialDescriptor.addElement("fundsTiming", false);
        pluginGeneratedSerialDescriptor.addElement("fundsTimingDescription", false);
        pluginGeneratedSerialDescriptor.addElement("frontImageThumbnailUrl", false);
        pluginGeneratedSerialDescriptor.addElement("checkSubmissionDateUTC", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        java.lang.String str;
        java.lang.String str2;
        int i2;
        java.lang.String str3;
        int i3;
        java.lang.String str4;
        java.lang.String str5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 1);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 2);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 3);
            java.lang.String decodeStringElement3 = beginStructure.decodeStringElement(serialDescriptor, 4);
            java.lang.String decodeStringElement4 = beginStructure.decodeStringElement(serialDescriptor, 5);
            str5 = decodeStringElement;
            str = beginStructure.decodeStringElement(serialDescriptor, 6);
            str2 = decodeStringElement4;
            str4 = decodeStringElement2;
            str3 = decodeStringElement3;
            i = decodeIntElement2;
            i3 = decodeIntElement;
            i2 = 127;
        } else {
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            boolean z = true;
            i = 0;
            int i4 = 0;
            int i5 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str6 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        continue;
                    case 1:
                        i4 = beginStructure.decodeIntElement(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        i = beginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        str9 = beginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        str8 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        break;
                    case 6:
                        str7 = beginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        break;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str7;
            str2 = str8;
            i2 = i5;
            str3 = str10;
            i3 = i4;
            str4 = str9;
            str5 = str6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation(i2, str5, i3, i, str4, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressInformation.write$Self$sharedSdk_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private TransactionInProgressInformation$$serializer() {
    }
}
