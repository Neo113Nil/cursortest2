package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lfinancial/atomic/transact/Config$TaskStatusUpdate$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lfinancial/atomic/transact/Config$TaskStatusUpdate;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$TaskStatusUpdate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$TaskStatusUpdate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class Config$TaskStatusUpdate$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<financial.atomic.transact.Config.TaskStatusUpdate> {
    public static final financial.atomic.transact.Config$TaskStatusUpdate$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        financial.atomic.transact.Config$TaskStatusUpdate$$serializer config$TaskStatusUpdate$$serializer = new financial.atomic.transact.Config$TaskStatusUpdate$$serializer();
        INSTANCE = config$TaskStatusUpdate$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.TaskStatusUpdate", config$TaskStatusUpdate$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("taskId", false);
        pluginGeneratedSerialDescriptor.addElement("product", false);
        pluginGeneratedSerialDescriptor.addElement("company", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("failReason", true);
        pluginGeneratedSerialDescriptor.addElement("switchData", true);
        pluginGeneratedSerialDescriptor.addElement("depositData", true);
        pluginGeneratedSerialDescriptor.addElement("managedBy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = financial.atomic.transact.Config.TaskStatusUpdate.$childSerializers;
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return new kotlinx.serialization.KSerializer[]{stringSerializer, lazyArr[1].getValue(), financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE, lazyArr[3].getValue(), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(financial.atomic.transact.Config$TaskStatusUpdate$DepositData$$serializer.INSTANCE), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(financial.atomic.transact.Config$TaskStatusUpdate$ManagedBy$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final financial.atomic.transact.Config.TaskStatusUpdate deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData;
        financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData;
        java.lang.String str;
        financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus taskStatus;
        int i;
        financial.atomic.transact.Config.Product product;
        financial.atomic.transact.Config.TransactCompany transactCompany;
        java.lang.String str2;
        financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = financial.atomic.transact.Config.TaskStatusUpdate.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus taskStatus2 = null;
        if (beginStructure.decodeSequentially()) {
            java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            financial.atomic.transact.Config.Product product2 = (financial.atomic.transact.Config.Product) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            financial.atomic.transact.Config.TransactCompany transactCompany2 = (financial.atomic.transact.Config.TransactCompany) beginStructure.decodeSerializableElement(serialDescriptor, 2, financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE, null);
            financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus taskStatus3 = (financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), null);
            java.lang.String str3 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, null);
            financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData2 = (financial.atomic.transact.Config.TaskStatusUpdate.SwitchData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$$serializer.INSTANCE, null);
            financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData2 = (financial.atomic.transact.Config.TaskStatusUpdate.DepositData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, financial.atomic.transact.Config$TaskStatusUpdate$DepositData$$serializer.INSTANCE, null);
            taskStatus = taskStatus3;
            str2 = decodeStringElement;
            managedBy = (financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, financial.atomic.transact.Config$TaskStatusUpdate$ManagedBy$$serializer.INSTANCE, null);
            depositData = depositData2;
            switchData = switchData2;
            str = str3;
            transactCompany = transactCompany2;
            product = product2;
            i = 255;
        } else {
            int i4 = 0;
            boolean z = true;
            java.lang.String str4 = null;
            financial.atomic.transact.Config.TransactCompany transactCompany3 = null;
            financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy2 = null;
            financial.atomic.transact.Config.TaskStatusUpdate.DepositData depositData3 = null;
            financial.atomic.transact.Config.TaskStatusUpdate.SwitchData switchData3 = null;
            financial.atomic.transact.Config.Product product3 = null;
            java.lang.String str5 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                    case 0:
                        str5 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                    case 1:
                        product3 = (financial.atomic.transact.Config.Product) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), product3);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        transactCompany3 = (financial.atomic.transact.Config.TransactCompany) beginStructure.decodeSerializableElement(serialDescriptor, 2, financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE, transactCompany3);
                        i4 |= 4;
                        i2 = 7;
                    case 3:
                        taskStatus2 = (financial.atomic.transact.Config.TaskStatusUpdate.TaskStatus) beginStructure.decodeSerializableElement(serialDescriptor, 3, (kotlinx.serialization.DeserializationStrategy) lazyArr[3].getValue(), taskStatus2);
                        i4 |= 8;
                    case 4:
                        str4 = (java.lang.String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, str4);
                        i4 |= 16;
                    case 5:
                        switchData3 = (financial.atomic.transact.Config.TaskStatusUpdate.SwitchData) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, financial.atomic.transact.Config$TaskStatusUpdate$SwitchData$$serializer.INSTANCE, switchData3);
                        i4 |= 32;
                    case 6:
                        depositData3 = (financial.atomic.transact.Config.TaskStatusUpdate.DepositData) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, financial.atomic.transact.Config$TaskStatusUpdate$DepositData$$serializer.INSTANCE, depositData3);
                        i4 |= 64;
                    case 7:
                        managedBy2 = (financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, financial.atomic.transact.Config$TaskStatusUpdate$ManagedBy$$serializer.INSTANCE, managedBy2);
                        i4 |= 128;
                    default:
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                }
            }
            financial.atomic.transact.Config.Product product4 = product3;
            depositData = depositData3;
            switchData = switchData3;
            str = str4;
            taskStatus = taskStatus2;
            i = i4;
            product = product4;
            financial.atomic.transact.Config.TaskStatusUpdate.ManagedBy managedBy3 = managedBy2;
            transactCompany = transactCompany3;
            str2 = str5;
            managedBy = managedBy3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new financial.atomic.transact.Config.TaskStatusUpdate(i, str2, product, transactCompany, taskStatus, str, switchData, depositData, managedBy, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, financial.atomic.transact.Config.TaskStatusUpdate value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        financial.atomic.transact.Config.TaskStatusUpdate.write$Self$transact_release(value, beginStructure, serialDescriptor);
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

    private Config$TaskStatusUpdate$$serializer() {
    }
}
