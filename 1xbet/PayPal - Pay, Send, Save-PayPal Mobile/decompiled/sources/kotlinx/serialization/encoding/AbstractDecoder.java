package kotlinx.serialization.encoding;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001a\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J5\u00102\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010\u00052\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\n\b\u0002\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00122\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u00152\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u00182\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020!2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020$2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\bL\u0010MJ=\u0010N\u001a\u00028\u0000\"\u0004\b\u0000\u0010.2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bN\u0010OJC\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010.*\u00020\u00052\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bP\u0010O"}, d2 = {"Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", "", "decodeValue", "()Ljava/lang/Object;", "", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "", "decodeString", "()Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "decodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "descriptor", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "index", "decodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "decodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "decodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "decodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "decodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "decodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "decodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "decodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "decodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "decodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "decodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes3.dex */
public abstract class AbstractDecoder implements kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder {
    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public java.lang.Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public /* bridge */ int decodeCollectionSize(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        return super.decodeCollectionSize(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @kotlinx.serialization.ExperimentalSerializationApi
    public /* bridge */ <T> T decodeNullableSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
        return (T) super.decodeNullableSerializableValue(deserializationStrategy);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    @kotlinx.serialization.ExperimentalSerializationApi
    public /* bridge */ boolean decodeSequentially() {
        return super.decodeSequentially();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public /* bridge */ <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy) {
        return (T) super.decodeSerializableValue(deserializationStrategy);
    }

    public java.lang.Object decodeValue() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()));
        sb.append(" can't retrieve untyped values");
        throw new kotlinx.serialization.SerializationException(sb.toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return ((java.lang.Boolean) decodeValue).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return ((java.lang.Byte) decodeValue).byteValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return ((java.lang.Short) decodeValue).shortValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return ((java.lang.Integer) decodeValue).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return ((java.lang.Long) decodeValue).longValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return ((java.lang.Float) decodeValue).floatValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return ((java.lang.Double) decodeValue).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return ((java.lang.Character) decodeValue).charValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public java.lang.String decodeString() {
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return (java.lang.String) decodeValue;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int decodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "");
        java.lang.Object decodeValue = decodeValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeValue, "");
        return ((java.lang.Integer) decodeValue).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.Decoder decodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return this;
    }

    public static /* synthetic */ java.lang.Object decodeSerializableValue$default(kotlinx.serialization.encoding.AbstractDecoder abstractDecoder, kotlinx.serialization.DeserializationStrategy deserializationStrategy, java.lang.Object obj, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        return abstractDecoder.decodeSerializableValue(deserializationStrategy, obj);
    }

    public <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeBoolean();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeByte();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeShort();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeInt();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeLong();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeFloat();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeDouble();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeChar();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final java.lang.String decodeStringElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeString();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public kotlinx.serialization.encoding.Decoder decodeInlineElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeInline(descriptor.getElementDescriptor(index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        return (T) decodeSerializableValue(deserializer, previousValue);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeNullableSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        kotlinx.serialization.encoding.AbstractDecoder abstractDecoder = this;
        return (deserializer.getDescriptor().isNullable() || abstractDecoder.decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer, previousValue) : (T) abstractDecoder.decodeNull();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
    }
}
