package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lfinancial/atomic/transact/Config$TaskData$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lfinancial/atomic/transact/Config$TaskData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$TaskData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$TaskData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class Config$TaskData$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<financial.atomic.transact.Config.TaskData> {
    public static final financial.atomic.transact.Config$TaskData$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        financial.atomic.transact.Config$TaskData$$serializer config$TaskData$$serializer = new financial.atomic.transact.Config$TaskData$$serializer();
        INSTANCE = config$TaskData$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.TaskData", config$TaskData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("product", true);
        pluginGeneratedSerialDescriptor.addElement("distribution", true);
        pluginGeneratedSerialDescriptor.addElement(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, true);
        pluginGeneratedSerialDescriptor.addElement("forms", true);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("apps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = financial.atomic.transact.Config.TaskData.$childSerializers;
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(financial.atomic.transact.Config$Distribution$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[3].getValue()), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(financial.atomic.transact.Config$UserAction$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) lazyArr[5].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final financial.atomic.transact.Config.TaskData deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        java.util.List list;
        java.lang.String str;
        financial.atomic.transact.Config.UserAction userAction;
        financial.atomic.transact.Config.Distribution distribution;
        int i;
        java.util.List list2;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = financial.atomic.transact.Config.TaskData.$childSerializers;
        int i2 = 4;
        financial.atomic.transact.Config.Distribution distribution2 = null;
        if (beginStructure.decodeSequentially()) {
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            java.lang.String str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            financial.atomic.transact.Config.Distribution distribution3 = (financial.atomic.transact.Config.Distribution) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, financial.atomic.transact.Config$Distribution$$serializer.INSTANCE, null);
            java.lang.String str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            java.util.List list3 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            financial.atomic.transact.Config.UserAction userAction2 = (financial.atomic.transact.Config.UserAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, financial.atomic.transact.Config$UserAction$$serializer.INSTANCE, null);
            list = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), null);
            str2 = str4;
            userAction = userAction2;
            list2 = list3;
            i = 63;
            str = str3;
            distribution = distribution3;
        } else {
            int i3 = 0;
            boolean z = true;
            java.util.List list4 = null;
            financial.atomic.transact.Config.UserAction userAction3 = null;
            java.util.List list5 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 4;
                    case 0:
                        str6 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, str6);
                        i3 |= 1;
                        i2 = 4;
                    case 1:
                        distribution2 = (financial.atomic.transact.Config.Distribution) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, financial.atomic.transact.Config$Distribution$$serializer.INSTANCE, distribution2);
                        i3 |= 2;
                    case 2:
                        str5 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, str5);
                        i3 |= 4;
                    case 3:
                        list5 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), list5);
                        i3 |= 8;
                    case 4:
                        userAction3 = (financial.atomic.transact.Config.UserAction) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, financial.atomic.transact.Config$UserAction$$serializer.INSTANCE, userAction3);
                        i3 |= 16;
                    case 5:
                        list4 = (java.util.List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (kotlinx.serialization.DeserializationStrategy) lazyArr[5].getValue(), list4);
                        i3 |= 32;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            list = list4;
            str = str6;
            userAction = userAction3;
            distribution = distribution2;
            i = i3;
            java.lang.String str7 = str5;
            list2 = list5;
            str2 = str7;
        }
        beginStructure.endStructure(serialDescriptor);
        return new financial.atomic.transact.Config.TaskData(i, str, distribution, str2, list2, userAction, list, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, financial.atomic.transact.Config.TaskData value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        financial.atomic.transact.Config.TaskData.write$Self$transact_release(value, beginStructure, serialDescriptor);
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

    private Config$TaskData$$serializer() {
    }
}
