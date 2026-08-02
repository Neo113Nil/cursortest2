package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate$$serializer;", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$TransactAuthStatusUpdate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class Config$TransactAuthStatusUpdate$$serializer implements kotlinx.serialization.internal.GeneratedSerializer<financial.atomic.transact.Config.TransactAuthStatusUpdate> {
    public static final financial.atomic.transact.Config$TransactAuthStatusUpdate$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        financial.atomic.transact.Config$TransactAuthStatusUpdate$$serializer config$TransactAuthStatusUpdate$$serializer = new financial.atomic.transact.Config$TransactAuthStatusUpdate$$serializer();
        INSTANCE = config$TransactAuthStatusUpdate$$serializer;
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.TransactAuthStatusUpdate", config$TransactAuthStatusUpdate$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("company", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        kotlin.Lazy[] lazyArr;
        lazyArr = financial.atomic.transact.Config.TransactAuthStatusUpdate.$childSerializers;
        return new kotlinx.serialization.KSerializer[]{financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE, lazyArr[1].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final financial.atomic.transact.Config.TransactAuthStatusUpdate deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.Lazy[] lazyArr;
        financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus authStatus;
        financial.atomic.transact.Config.TransactCompany transactCompany;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        lazyArr = financial.atomic.transact.Config.TransactAuthStatusUpdate.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            transactCompany = (financial.atomic.transact.Config.TransactCompany) beginStructure.decodeSerializableElement(serialDescriptor, 0, financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE, null);
            authStatus = (financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            int i2 = 0;
            financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus authStatus2 = null;
            financial.atomic.transact.Config.TransactCompany transactCompany2 = null;
            boolean z = true;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    transactCompany2 = (financial.atomic.transact.Config.TransactCompany) beginStructure.decodeSerializableElement(serialDescriptor, 0, financial.atomic.transact.Config$TransactCompany$$serializer.INSTANCE, transactCompany2);
                    i2 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                    }
                    authStatus2 = (financial.atomic.transact.Config.TransactAuthStatusUpdate.AuthStatus) beginStructure.decodeSerializableElement(serialDescriptor, 1, (kotlinx.serialization.DeserializationStrategy) lazyArr[1].getValue(), authStatus2);
                    i2 |= 2;
                }
            }
            authStatus = authStatus2;
            transactCompany = transactCompany2;
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new financial.atomic.transact.Config.TransactAuthStatusUpdate(i, transactCompany, authStatus, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, financial.atomic.transact.Config.TransactAuthStatusUpdate value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        financial.atomic.transact.Config.TransactAuthStatusUpdate.write$Self$transact_release(value, beginStructure, serialDescriptor);
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

    private Config$TransactAuthStatusUpdate$$serializer() {
    }
}
