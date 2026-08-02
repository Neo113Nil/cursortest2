package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lfinancial/atomic/transact/Config$Deeplink$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lfinancial/atomic/transact/Config$Deeplink;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$Deeplink;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$Deeplink;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class Config$Deeplink$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<financial.atomic.transact.Config.Deeplink> {
    public static final financial.atomic.transact.Config$Deeplink$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        financial.atomic.transact.Config$Deeplink$$serializer config$Deeplink$$serializer = new financial.atomic.transact.Config$Deeplink$$serializer();
        INSTANCE = config$Deeplink$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.Deeplink", config$Deeplink$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("companyId", true);
        pluginGeneratedSerialDescriptor.addElement("connectorId", true);
        pluginGeneratedSerialDescriptor.addElement("companyName", true);
        pluginGeneratedSerialDescriptor.addElement("singleSwitch", true);
        pluginGeneratedSerialDescriptor.addElement("payments", true);
        pluginGeneratedSerialDescriptor.addElement("accountId", true);
        pluginGeneratedSerialDescriptor.addElement("step", true);
        pluginGeneratedSerialDescriptor.addElement(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = financial.atomic.transact.Config.Deeplink.$childSerializers;
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.internal.BooleanSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[4].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final financial.atomic.transact.Config.Deeplink deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.List list;
        boolean z;
        java.lang.String str5;
        java.lang.String str6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = financial.atomic.transact.Config.Deeplink.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        if (beginStructure.decodeSequentially()) {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 3);
            java.util.List list2 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 6);
            list = list2;
            str = str9;
            str2 = beginStructure.decodeStringElement(serialDescriptor, 7);
            str3 = decodeStringElement;
            i = 255;
            z = decodeBooleanElement;
            str6 = str8;
            str5 = str7;
        } else {
            boolean z2 = true;
            int i5 = 0;
            java.util.List list3 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            java.lang.String str15 = null;
            boolean z3 = false;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 0:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 1:
                        str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, str10);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        i5 |= 4;
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i2 = 7;
                        i3 = 6;
                    case 3:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i5 |= 8;
                    case 4:
                        list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (kotlinx.serialization.DeserializationStrategy) lazyArr[4].getValue(), list3);
                        i5 |= 16;
                    case 5:
                        str15 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str15);
                        i5 |= 32;
                    case 6:
                        str12 = beginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 64;
                    case 7:
                        str11 = beginStructure.decodeStringElement(serialDescriptor, i2);
                        i5 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            java.lang.String str16 = str13;
            java.lang.String str17 = str14;
            i = i5;
            str = str15;
            str2 = str11;
            str3 = str12;
            str4 = str17;
            list = list3;
            z = z3;
            str5 = str10;
            str6 = str16;
        }
        beginStructure.endStructure(serialDescriptor);
        return new financial.atomic.transact.Config.Deeplink(i, str4, str5, str6, z, list, str, str3, str2, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, financial.atomic.transact.Config.Deeplink value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        financial.atomic.transact.Config.Deeplink.write$Self$transact_release(value, beginStructure, serialDescriptor);
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

    private Config$Deeplink$$serializer() {
    }
}
