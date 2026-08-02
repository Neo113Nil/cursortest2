package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lfinancial/atomic/transact/Config$TransactDataResponse$CardData$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$TransactDataResponse$CardData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class Config$TransactDataResponse$CardData$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<financial.atomic.transact.Config.TransactDataResponse.CardData> {
    public static final financial.atomic.transact.Config$TransactDataResponse$CardData$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        financial.atomic.transact.Config$TransactDataResponse$CardData$$serializer config$TransactDataResponse$CardData$$serializer = new financial.atomic.transact.Config$TransactDataResponse$CardData$$serializer();
        INSTANCE = config$TransactDataResponse$CardData$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.TransactDataResponse.CardData", config$TransactDataResponse$CardData$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("number", false);
        pluginGeneratedSerialDescriptor.addElement("expiry", false);
        pluginGeneratedSerialDescriptor.addElement(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{stringSerializer, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final financial.atomic.transact.Config.TransactDataResponse.CardData deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        java.lang.String str4 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            java.lang.String str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str2 = decodeStringElement;
            str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            i = 7;
            str = str5;
        } else {
            int i2 = 0;
            boolean z = true;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str6 = beginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str4);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str7);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            str3 = str7;
        }
        beginStructure.endStructure(serialDescriptor);
        return new financial.atomic.transact.Config.TransactDataResponse.CardData(i, str2, str, str3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, financial.atomic.transact.Config.TransactDataResponse.CardData value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        financial.atomic.transact.Config.TransactDataResponse.CardData.write$Self$transact_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private Config$TransactDataResponse$CardData$$serializer() {
    }
}
