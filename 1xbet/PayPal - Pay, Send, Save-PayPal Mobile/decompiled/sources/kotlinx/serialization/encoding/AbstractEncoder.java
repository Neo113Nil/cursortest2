package kotlinx.serialization.encoding;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J%\u00106\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0018¢\u0006\u0004\b6\u00107J%\u00108\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u001b¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020 ¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020#¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020&¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020)¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020,¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bF\u0010GJA\u0010K\u001a\u00020\t\"\n\b\u0000\u0010H*\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\bK\u0010LJA\u0010M\u001a\u00020\t\"\b\b\u0000\u0010H*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bM\u0010L"}, d2 = {"Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "encodeElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "encodeValue", "(Ljava/lang/Object;)V", "encodeNull", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "enumDescriptor", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "encodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "encodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "encodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "encodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "encodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "encodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "encodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "encodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "encodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeNullableSerializableElement"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes3.dex */
public abstract class AbstractEncoder implements kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder {
    @Override // kotlinx.serialization.encoding.Encoder
    public /* bridge */ kotlinx.serialization.encoding.CompositeEncoder beginCollection(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
        return super.beginCollection(serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @kotlinx.serialization.ExperimentalSerializationApi
    public /* bridge */ void encodeNotNullMark() {
        super.encodeNotNullMark();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @kotlinx.serialization.ExperimentalSerializationApi
    public /* bridge */ <T> void encodeNullableSerializableValue(kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t) {
        super.encodeNullableSerializableValue(serializationStrategy, t);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public /* bridge */ <T> void encodeSerializableValue(kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t) {
        super.encodeSerializableValue(serializationStrategy, t);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public /* bridge */ boolean shouldEncodeElementDefault(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
        return super.shouldEncodeElementDefault(serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public kotlinx.serialization.encoding.CompositeEncoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return this;
    }

    public void encodeValue(java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Non-serializable ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()));
        sb.append(" is not supported by ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()));
        sb.append(" encoder");
        throw new kotlinx.serialization.SerializationException(sb.toString());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        throw new kotlinx.serialization.SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean value) {
        encodeValue(java.lang.Boolean.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte value) {
        encodeValue(java.lang.Byte.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeShort(short value) {
        encodeValue(java.lang.Short.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeInt(int value) {
        encodeValue(java.lang.Integer.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeLong(long value) {
        encodeValue(java.lang.Long.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float value) {
        encodeValue(java.lang.Float.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double value) {
        encodeValue(java.lang.Double.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeChar(char value) {
        encodeValue(java.lang.Character.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeString(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encodeValue(value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "");
        encodeValue(java.lang.Integer.valueOf(index));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public kotlinx.serialization.encoding.Encoder encodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (encodeElement(descriptor, index)) {
            encodeBoolean(value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, byte value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (encodeElement(descriptor, index)) {
            encodeByte(value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, short value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (encodeElement(descriptor, index)) {
            encodeShort(value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (encodeElement(descriptor, index)) {
            encodeInt(value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (encodeElement(descriptor, index)) {
            encodeLong(value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, float value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (encodeElement(descriptor, index)) {
            encodeFloat(value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (encodeElement(descriptor, index)) {
            encodeDouble(value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, char value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (encodeElement(descriptor, index)) {
            encodeChar(value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        if (encodeElement(descriptor, index)) {
            encodeString(value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final kotlinx.serialization.encoding.Encoder encodeInlineElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return encodeElement(descriptor, index) ? encodeInline(descriptor.getElementDescriptor(index)) : kotlinx.serialization.internal.NoOpEncoder.INSTANCE;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        if (encodeElement(descriptor, index)) {
            encodeSerializableValue(serializer, value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        if (encodeElement(descriptor, index)) {
            encodeNullableSerializableValue(serializer, value);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
    }

    public boolean encodeElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return true;
    }
}
