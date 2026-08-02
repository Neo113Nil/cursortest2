package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH$¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\bH\u0014¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u00102\u001a\u00020\u0007H\u0014¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u0006J\u0015\u0010:\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020%¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0019¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001c¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001f¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\"¢\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020(¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020+¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0007¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0007H\u0014¢\u0006\u0004\bR\u0010QJ%\u0010S\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020%¢\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0016¢\u0006\u0004\bU\u0010VJ%\u0010W\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0019¢\u0006\u0004\bW\u0010XJ%\u0010Y\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001c¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001f¢\u0006\u0004\b]\u0010^J%\u0010_\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\"¢\u0006\u0004\b_\u0010`J%\u0010a\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020(¢\u0006\u0004\ba\u0010bJ%\u0010c\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020+¢\u0006\u0004\bc\u0010dJ\u001d\u0010e\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\be\u0010fJA\u0010j\u001a\u00020\u000e\"\n\b\u0001\u0010g*\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00010h2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\bj\u0010kJA\u0010l\u001a\u00020\u000e\"\b\b\u0001\u0010g*\u00020\u00012\u0006\u00105\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00010h2\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\bl\u0010kJ\u0017\u0010n\u001a\u00020\u000e2\u0006\u0010m\u001a\u00028\u0000H\u0004¢\u0006\u0004\bn\u0010\u0012J\u000f\u0010o\u001a\u00028\u0000H\u0005¢\u0006\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020q8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR$\u0010y\u001a\u0012\u0012\u0004\u0012\u00028\u00000uj\b\u0012\u0004\u0012\u00028\u0000`v8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010{\u001a\u00028\u00008EX\u0084\u0004¢\u0006\u0006\u001a\u0004\bz\u0010pR\u0016\u0010}\u001a\u0004\u0018\u00018\u00008EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b|\u0010p"}, d2 = {"Lkotlinx/serialization/internal/TaggedEncoder;", "", "Tag", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "getTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "tag", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "encodeTaggedValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "encodeTaggedNonNullMark", "(Ljava/lang/Object;)V", "encodeTaggedNull", "encodeTaggedInt", "(Ljava/lang/Object;I)V", "", "encodeTaggedByte", "(Ljava/lang/Object;B)V", "", "encodeTaggedShort", "(Ljava/lang/Object;S)V", "", "encodeTaggedLong", "(Ljava/lang/Object;J)V", "", "encodeTaggedFloat", "(Ljava/lang/Object;F)V", "", "encodeTaggedDouble", "(Ljava/lang/Object;D)V", "", "encodeTaggedBoolean", "(Ljava/lang/Object;Z)V", "", "encodeTaggedChar", "(Ljava/lang/Object;C)V", "", "encodeTaggedString", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "encodeTaggedEnum", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "inlineDescriptor", "encodeTaggedInline", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "descriptor", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeNotNullMark", "encodeNull", "encodeBoolean", "(Z)V", "encodeByte", "(B)V", "encodeShort", "(S)V", "encodeInt", "(I)V", "encodeLong", "(J)V", "encodeFloat", "(F)V", "encodeDouble", "(D)V", "encodeChar", "(C)V", "encodeString", "(Ljava/lang/String;)V", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "endEncode", "encodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "encodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "encodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "encodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "encodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "encodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "encodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "encodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "encodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "encodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeNullableSerializableElement", "name", "pushTag", "popTag", "()Ljava/lang/Object;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/ArrayList;", "getHighSpeedVideoFpsRangesFor", "getCurrentTag", "currentTag", "getCurrentTagOrNull", "currentTagOrNull"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes5.dex */
public abstract class TaggedEncoder<Tag> implements kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.ArrayList<Tag> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();

    protected void encodeTaggedNonNullMark(Tag tag) {
    }

    protected abstract Tag getTag(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i);

    @Override // kotlinx.serialization.encoding.Encoder
    public /* bridge */ kotlinx.serialization.encoding.CompositeEncoder beginCollection(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
        return super.beginCollection(serialDescriptor, i);
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

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    @kotlinx.serialization.ExperimentalSerializationApi
    public /* bridge */ boolean shouldEncodeElementDefault(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
        return super.shouldEncodeElementDefault(serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule();
    }

    protected void encodeTaggedValue(Tag tag, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Non-serializable ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()));
        sb.append(" is not supported by ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()));
        sb.append(" encoder");
        throw new kotlinx.serialization.SerializationException(sb.toString());
    }

    protected void encodeTaggedNull(Tag tag) {
        throw new kotlinx.serialization.SerializationException("null is not supported");
    }

    protected void encodeTaggedInt(Tag tag, int value) {
        encodeTaggedValue(tag, java.lang.Integer.valueOf(value));
    }

    protected void encodeTaggedByte(Tag tag, byte value) {
        encodeTaggedValue(tag, java.lang.Byte.valueOf(value));
    }

    protected void encodeTaggedShort(Tag tag, short value) {
        encodeTaggedValue(tag, java.lang.Short.valueOf(value));
    }

    protected void encodeTaggedLong(Tag tag, long value) {
        encodeTaggedValue(tag, java.lang.Long.valueOf(value));
    }

    protected void encodeTaggedFloat(Tag tag, float value) {
        encodeTaggedValue(tag, java.lang.Float.valueOf(value));
    }

    protected void encodeTaggedDouble(Tag tag, double value) {
        encodeTaggedValue(tag, java.lang.Double.valueOf(value));
    }

    protected void encodeTaggedBoolean(Tag tag, boolean value) {
        encodeTaggedValue(tag, java.lang.Boolean.valueOf(value));
    }

    protected void encodeTaggedChar(Tag tag, char value) {
        encodeTaggedValue(tag, java.lang.Character.valueOf(value));
    }

    protected void encodeTaggedString(Tag tag, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encodeTaggedValue(tag, value);
    }

    protected void encodeTaggedEnum(Tag tag, kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor, int ordinal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "");
        encodeTaggedValue(tag, java.lang.Integer.valueOf(ordinal));
    }

    public kotlinx.serialization.encoding.Encoder encodeTaggedInline(Tag tag, kotlinx.serialization.descriptors.SerialDescriptor inlineDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inlineDescriptor, "");
        pushTag(tag);
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public kotlinx.serialization.encoding.Encoder encodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return encodeTaggedInline(popTag(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
        encodeTaggedNonNullMark(getCurrentTag());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        encodeTaggedNull(popTag());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean value) {
        encodeTaggedBoolean(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte value) {
        encodeTaggedByte(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short value) {
        encodeTaggedShort(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int value) {
        encodeTaggedInt(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long value) {
        encodeTaggedLong(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float value) {
        encodeTaggedFloat(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double value) {
        encodeTaggedDouble(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char value) {
        encodeTaggedChar(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeString(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encodeTaggedString(popTag(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "");
        encodeTaggedEnum(popTag(), enumDescriptor, index);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public kotlinx.serialization.encoding.CompositeEncoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            popTag();
        }
        endEncode(descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        encodeTaggedBoolean(getTag(descriptor, index), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, byte value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        encodeTaggedByte(getTag(descriptor, index), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, short value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        encodeTaggedShort(getTag(descriptor, index), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        encodeTaggedInt(getTag(descriptor, index), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        encodeTaggedLong(getTag(descriptor, index), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, float value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        encodeTaggedFloat(getTag(descriptor, index), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        encodeTaggedDouble(getTag(descriptor, index), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, char value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        encodeTaggedChar(getTag(descriptor, index), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encodeTaggedString(getTag(descriptor, index), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final kotlinx.serialization.encoding.Encoder encodeInlineElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return encodeTaggedInline(getTag(descriptor, index), descriptor.getElementDescriptor(index));
    }

    public final Tag getCurrentTag() {
        return (Tag) kotlin.collections.CollectionsKt.last((java.util.List) this.getHighSpeedVideoFpsRangesFor);
    }

    protected final Tag getCurrentTagOrNull() {
        return (Tag) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.getHighSpeedVideoFpsRangesFor);
    }

    protected final void pushTag(Tag name2) {
        this.getHighSpeedVideoFpsRangesFor.add(name2);
    }

    @kotlin.IgnorableReturnValue
    protected final Tag popTag() {
        if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            java.util.ArrayList<Tag> arrayList = this.getHighSpeedVideoFpsRangesFor;
            return arrayList.remove(kotlin.collections.CollectionsKt.getLastIndex(arrayList));
        }
        throw new kotlinx.serialization.SerializationException("No tag in stack for requested element");
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        pushTag(getTag(descriptor, index));
        encodeNullableSerializableValue(serializer, value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        pushTag(getTag(descriptor, index));
        encodeSerializableValue(serializer, value);
    }

    protected void endEncode(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
    }
}
