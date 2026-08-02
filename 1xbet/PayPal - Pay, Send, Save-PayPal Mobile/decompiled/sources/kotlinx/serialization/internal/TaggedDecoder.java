package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH$¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0007H\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u00102J3\u00107\u001a\u00028\u0001\"\n\b\u0001\u00103*\u0004\u0018\u00010\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0001042\b\u00106\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000fH\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u000f¢\u0006\u0004\b@\u0010=J\r\u0010A\u001a\u00020\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0019¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\b¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u001e¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020!¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020$¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020'¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020*¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020U2\u0006\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\bV\u0010WJ\u001d\u0010X\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bZ\u0010[J\u001d\u0010\\\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b^\u0010_J\u001d\u0010`\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020!2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bb\u0010cJ\u001d\u0010d\u001a\u00020$2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bd\u0010eJ\u001d\u0010f\u001a\u00020'2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bf\u0010gJ\u001d\u0010h\u001a\u00020*2\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bh\u0010iJ\u001d\u0010j\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bj\u0010kJA\u0010l\u001a\u00028\u0001\"\n\b\u0001\u00103*\u0004\u0018\u00010\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0001042\b\u00106\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bl\u0010mJC\u0010n\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u00103*\u00020\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001042\b\u00106\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bn\u0010mJ\u0017\u0010p\u001a\u00020U2\u0006\u0010o\u001a\u00028\u0000H\u0004¢\u0006\u0004\bp\u0010qJ\u001d\u0010s\u001a\u00020U2\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0004¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00028\u0000H\u0005¢\u0006\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020w8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR+\u0010}\u001a\u0012\u0012\u0004\u0012\u00028\u00000{j\b\u0012\u0004\u0012\u00028\u0000`|8\u0001X\u0081\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0082\u0001\u001a\u00028\u00008EX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010vR\u0018\u0010\u0084\u0001\u001a\u0004\u0018\u00018\u00008EX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010vR\u0019\u0010\u0087\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001"}, d2 = {"Lkotlinx/serialization/internal/TaggedDecoder;", "", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "getTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "tag", "decodeTaggedValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "decodeTaggedNotNullMark", "(Ljava/lang/Object;)Z", "", "decodeTaggedNull", "(Ljava/lang/Object;)Ljava/lang/Void;", "decodeTaggedBoolean", "", "decodeTaggedByte", "(Ljava/lang/Object;)B", "", "decodeTaggedShort", "(Ljava/lang/Object;)S", "decodeTaggedInt", "(Ljava/lang/Object;)I", "", "decodeTaggedLong", "(Ljava/lang/Object;)J", "", "decodeTaggedFloat", "(Ljava/lang/Object;)F", "", "decodeTaggedDouble", "(Ljava/lang/Object;)D", "", "decodeTaggedChar", "(Ljava/lang/Object;)C", "", "decodeTaggedString", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "decodeTaggedEnum", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "inlineDescriptor", "decodeTaggedInline", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeNotNullMark", "()Z", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "decodeByte", "()B", "decodeShort", "()S", "decodeInt", "()I", "decodeLong", "()J", "decodeFloat", "()F", "decodeDouble", "()D", "decodeChar", "()C", "decodeString", "()Ljava/lang/String;", "decodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "decodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "decodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "decodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "decodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "decodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "decodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "decodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "decodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "decodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "decodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "decodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "name", "pushTag", "(Ljava/lang/Object;)V", "other", "copyTagsTo", "(Lkotlinx/serialization/internal/TaggedDecoder;)V", "popTag", "()Ljava/lang/Object;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "tagStack", "Ljava/util/ArrayList;", "getTagStack$kotlinx_serialization_core", "()Ljava/util/ArrayList;", "getCurrentTag", "currentTag", "getCurrentTagOrNull", "currentTagOrNull", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes5.dex */
public abstract class TaggedDecoder<Tag> implements kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private final java.util.ArrayList<Tag> tagStack = new java.util.ArrayList<>();

    @Override // kotlinx.serialization.encoding.Decoder
    public final java.lang.Void decodeNull() {
        return null;
    }

    protected boolean decodeTaggedNotNullMark(Tag tag) {
        return true;
    }

    protected java.lang.Void decodeTaggedNull(Tag tag) {
        return null;
    }

    protected abstract Tag getTag(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i);

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

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule();
    }

    protected java.lang.Object decodeTaggedValue(Tag tag) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()));
        sb.append(" can't retrieve untyped values");
        throw new kotlinx.serialization.SerializationException(sb.toString());
    }

    protected boolean decodeTaggedBoolean(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return ((java.lang.Boolean) decodeTaggedValue).booleanValue();
    }

    protected byte decodeTaggedByte(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return ((java.lang.Byte) decodeTaggedValue).byteValue();
    }

    protected short decodeTaggedShort(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return ((java.lang.Short) decodeTaggedValue).shortValue();
    }

    protected int decodeTaggedInt(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return ((java.lang.Integer) decodeTaggedValue).intValue();
    }

    protected long decodeTaggedLong(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return ((java.lang.Long) decodeTaggedValue).longValue();
    }

    protected float decodeTaggedFloat(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return ((java.lang.Float) decodeTaggedValue).floatValue();
    }

    protected double decodeTaggedDouble(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return ((java.lang.Double) decodeTaggedValue).doubleValue();
    }

    protected char decodeTaggedChar(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return ((java.lang.Character) decodeTaggedValue).charValue();
    }

    protected java.lang.String decodeTaggedString(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return (java.lang.String) decodeTaggedValue;
    }

    protected int decodeTaggedEnum(Tag tag, kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "");
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "");
        return ((java.lang.Integer) decodeTaggedValue).intValue();
    }

    public kotlinx.serialization.encoding.Decoder decodeTaggedInline(Tag tag, kotlinx.serialization.descriptors.SerialDescriptor inlineDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inlineDescriptor, "");
        pushTag(tag);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.Decoder decodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedInline(popTag(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        Tag currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            return false;
        }
        return decodeTaggedNotNullMark(currentTagOrNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        return decodeTaggedBoolean(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        return decodeTaggedByte(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        return decodeTaggedShort(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        return decodeTaggedInt(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return decodeTaggedLong(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        return decodeTaggedFloat(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        return decodeTaggedDouble(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        return decodeTaggedChar(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final java.lang.String decodeString() {
        return decodeTaggedString(popTag());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "");
        return decodeTaggedEnum(popTag(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedBoolean(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedByte(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedShort(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedInt(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedLong(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedFloat(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedDouble(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedChar(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final java.lang.String decodeStringElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedString(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final kotlinx.serialization.encoding.Decoder decodeInlineElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return decodeTaggedInline(getTag(descriptor, index), descriptor.getElementDescriptor(index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, final kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, final T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        Tag tag = getTag(descriptor, index);
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.TaggedDecoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.Object decodeSerializableValue;
                decodeSerializableValue = kotlinx.serialization.internal.TaggedDecoder.this.decodeSerializableValue(deserializer, previousValue);
                return decodeSerializableValue;
            }
        };
        pushTag(tag);
        T t = (T) function0.invoke();
        if (!this.getHighSpeedVideoSizes) {
            popTag();
        }
        this.getHighSpeedVideoSizes = false;
        return t;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeNullableSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, final kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, final T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        Tag tag = getTag(descriptor, index);
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.TaggedDecoder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.serialization.internal.TaggedDecoder.m24222$r8$lambda$KNCb4ndNy8p39bnFdLtrj8IusI(kotlinx.serialization.internal.TaggedDecoder.this, deserializer, previousValue);
            }
        };
        pushTag(tag);
        T t = (T) function0.invoke();
        if (!this.getHighSpeedVideoSizes) {
            popTag();
        }
        this.getHighSpeedVideoSizes = false;
        return t;
    }

    public final java.util.ArrayList<Tag> getTagStack$kotlinx_serialization_core() {
        return this.tagStack;
    }

    protected final Tag getCurrentTag() {
        return (Tag) kotlin.collections.CollectionsKt.last((java.util.List) this.tagStack);
    }

    protected final Tag getCurrentTagOrNull() {
        return (Tag) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) this.tagStack);
    }

    protected final void pushTag(Tag name2) {
        this.tagStack.add(name2);
    }

    protected final void copyTagsTo(kotlinx.serialization.internal.TaggedDecoder<Tag> other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        other.tagStack.addAll(this.tagStack);
    }

    @kotlin.IgnorableReturnValue
    protected final Tag popTag() {
        java.util.ArrayList<Tag> arrayList = this.tagStack;
        Tag remove = arrayList.remove(kotlin.collections.CollectionsKt.getLastIndex(arrayList));
        this.getHighSpeedVideoSizes = true;
        return remove;
    }

    /* renamed from: $r8$lambda$KNCb4ndNy8p39bnFdLtrj8-IusI, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m24222$r8$lambda$KNCb4ndNy8p39bnFdLtrj8IusI(kotlinx.serialization.internal.TaggedDecoder taggedDecoder, kotlinx.serialization.DeserializationStrategy deserializationStrategy, java.lang.Object obj) {
        kotlinx.serialization.internal.TaggedDecoder taggedDecoder2 = taggedDecoder;
        return (deserializationStrategy.getDescriptor().isNullable() || taggedDecoder2.decodeNotNullMark()) ? taggedDecoder.decodeSerializableValue(deserializationStrategy, obj) : taggedDecoder2.decodeNull();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
    }
}
