package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$TaskStatusUpdate$DepositData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class Config$TaskStatusUpdate$DepositData$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<financial.atomic.transact.Config.TaskStatusUpdate.DepositData> {
    public static final financial.atomic.transact.Config$TaskStatusUpdate$DepositData$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        financial.atomic.transact.Config$TaskStatusUpdate$DepositData$$serializer config$TaskStatusUpdate$DepositData$$serializer = new financial.atomic.transact.Config$TaskStatusUpdate$DepositData$$serializer();
        INSTANCE = config$TaskStatusUpdate$DepositData$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.TaskStatusUpdate.DepositData", config$TaskStatusUpdate$DepositData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("accountType", true);
        pluginGeneratedSerialDescriptor.addElement("distributionAmount", true);
        pluginGeneratedSerialDescriptor.addElement("distributionType", true);
        pluginGeneratedSerialDescriptor.addElement("lastFour", true);
        pluginGeneratedSerialDescriptor.addElement("routingNumber", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.DoubleSerializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final financial.atomic.transact.Config.TaskStatusUpdate.DepositData deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Double d;
        java.lang.String str4;
        java.lang.String str5;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        java.lang.String str6 = null;
        if (beginStructure.decodeSequentially()) {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            java.lang.String str7 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            java.lang.Double d2 = (java.lang.Double) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, null);
            java.lang.String str8 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            java.lang.String str9 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            java.lang.String str10 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            str = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            i = 63;
            str5 = str9;
            str3 = str10;
            str4 = str8;
            str2 = str7;
            d = d2;
        } else {
            int i3 = 0;
            boolean z = true;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            java.lang.Double d3 = null;
            java.lang.String str13 = null;
            java.lang.String str14 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        str14 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str14);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        d3 = (java.lang.Double) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kotlinx.serialization.internal.DoubleSerializer.INSTANCE, d3);
                        i3 |= 2;
                    case 2:
                        str13 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str13);
                        i3 |= 4;
                    case 3:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i3 |= 8;
                    case 4:
                        str12 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str12);
                        i3 |= 16;
                    case 5:
                        str11 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str11);
                        i3 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            str = str11;
            str2 = str14;
            str3 = str12;
            d = d3;
            str4 = str13;
            str5 = str6;
            i = i3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new financial.atomic.transact.Config.TaskStatusUpdate.DepositData(i, str2, d, str4, str5, str3, str, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, financial.atomic.transact.Config.TaskStatusUpdate.DepositData value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        financial.atomic.transact.Config.TaskStatusUpdate.DepositData.write$Self$transact_release(value, beginStructure, serialDescriptor);
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

    private Config$TaskStatusUpdate$DepositData$$serializer() {
    }
}
