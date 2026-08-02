package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$TaskStatusUpdate$SwitchData$PaymentMethod;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class Config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod> {
    public static final financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer = new financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer();
        INSTANCE = config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod", config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("_id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("expiry", true);
        pluginGeneratedSerialDescriptor.addElement("brand", true);
        pluginGeneratedSerialDescriptor.addElement("lastFour", true);
        pluginGeneratedSerialDescriptor.addElement("routingNumber", true);
        pluginGeneratedSerialDescriptor.addElement("accountType", true);
        pluginGeneratedSerialDescriptor.addElement("lastFourAccountNumber", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.$childSerializers;
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{stringSerializer, stringSerializer, lazyArr[2].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType paymentType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        java.lang.String str9 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            java.lang.String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType paymentType2 = (financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), null);
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            java.lang.String str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            java.lang.String str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            java.lang.String str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            paymentType = paymentType2;
            str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str2 = str13;
            str7 = str12;
            str8 = str10;
            str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            str6 = str11;
            i = 511;
            str3 = decodeStringElement2;
            str5 = decodeStringElement;
        } else {
            int i5 = 0;
            boolean z = true;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            java.lang.String str16 = null;
            java.lang.String str17 = null;
            java.lang.String str18 = null;
            java.lang.String str19 = null;
            financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType paymentType3 = null;
            java.lang.String str20 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 0:
                        str20 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 1:
                        str17 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 2:
                        paymentType3 = (financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.PaymentType) beginStructure.decodeSerializableElement(serialDescriptor, 2, (kotlinx.serialization.DeserializationStrategy) lazyArr[2].getValue(), paymentType3);
                        i5 |= 4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 3:
                        i5 |= 8;
                        str19 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str19);
                        i2 = 7;
                        i3 = 6;
                    case 4:
                        str16 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str16);
                        i5 |= 16;
                    case 5:
                        str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str9);
                        i5 |= 32;
                    case 6:
                        str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        i5 |= 64;
                    case 7:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i5 |= 128;
                    case 8:
                        str18 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, str18);
                        i5 |= 256;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str21 = str19;
            i = i5;
            str = str14;
            str2 = str15;
            str3 = str17;
            str4 = str18;
            str5 = str20;
            str6 = str16;
            str7 = str9;
            str8 = str21;
            paymentType = paymentType3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod(i, str5, str3, paymentType, str8, str6, str7, str2, str, str4, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        financial.atomic.transact.Config.TaskStatusUpdate.SwitchData.PaymentMethod.write$Self$transact_release(value, beginStructure, serialDescriptor);
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

    private Config$TaskStatusUpdate$SwitchData$PaymentMethod$$serializer() {
    }
}
