package kotlinx.serialization.internal;

/* compiled from: Tagged.kt */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00028\u0000*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH$¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0015J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020#2\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00020&2\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u00020)2\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010*J\u0015\u0010+\u001a\u00020,2\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010-J\u0015\u0010.\u001a\u00020/2\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u00100J\u001d\u00101\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u00102\u001a\u00020\fH\u0014¢\u0006\u0002\u00103J\u001d\u00104\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u00105\u001a\u00020\fH\u0014¢\u0006\u0002\u00106J1\u00107\u001a\u0002H8\"\n\b\u0001\u00108*\u0004\u0018\u00010\u00022\f\u00109\u001a\b\u0012\u0004\u0012\u0002H80:2\b\u0010;\u001a\u0004\u0018\u0001H8H\u0014¢\u0006\u0002\u0010<J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\fH\u0016J\b\u0010?\u001a\u00020\u0014H\u0016J\b\u0010@\u001a\u0004\u0018\u00010\u0017J\u0006\u0010A\u001a\u00020\u0014J\u0006\u0010B\u001a\u00020\u001bJ\u0006\u0010C\u001a\u00020\u001eJ\u0006\u0010D\u001a\u00020\u000eJ\u0006\u0010E\u001a\u00020#J\u0006\u0010F\u001a\u00020&J\u0006\u0010G\u001a\u00020)J\u0006\u0010H\u001a\u00020,J\u0006\u0010I\u001a\u00020/J\u000e\u0010J\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\fJ\u0010\u0010K\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\fH\u0016J\u0010\u0010L\u001a\u00020M2\u0006\u0010>\u001a\u00020\fH\u0016J\u0016\u0010N\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010O\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010P\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010Q\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010R\u001a\u00020#2\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010S\u001a\u00020&2\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010T\u001a\u00020)2\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010U\u001a\u00020,2\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010V\u001a\u00020/2\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010W\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ?\u0010X\u001a\u0002H8\"\n\b\u0001\u00108*\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u00109\u001a\b\u0012\u0004\u0012\u0002H80:2\b\u0010;\u001a\u0004\u0018\u0001H8¢\u0006\u0002\u0010YJA\u0010Z\u001a\u0004\u0018\u0001H8\"\b\b\u0001\u00108*\u00020\u00022\u0006\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H80:2\b\u0010;\u001a\u0004\u0018\u0001H8¢\u0006\u0002\u0010YJ)\u0010[\u001a\u0002H\\\"\u0004\b\u0001\u0010\\2\u0006\u0010\u0011\u001a\u00028\u00002\f\u0010]\u001a\b\u0012\u0004\u0012\u0002H\\0^H\u0002¢\u0006\u0002\u0010_J\u0015\u0010j\u001a\u00020M2\u0006\u0010k\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010lJ\u0016\u0010m\u001a\u00020M2\f\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0004J\r\u0010p\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010gR\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010`\u001a\u0012\u0012\u0004\u0012\u00028\u00000aj\b\u0012\u0004\u0012\u00028\u0000`bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0014\u0010e\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0016\u0010h\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bi\u0010gR\u000e\u0010o\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lkotlinx/serialization/internal/TaggedDecoder;", "Tag", "", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "getTag", "Lkotlinx/serialization/descriptors/SerialDescriptor;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "decodeTaggedValue", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "decodeTaggedNotNullMark", "", "(Ljava/lang/Object;)Z", "decodeTaggedNull", "", "(Ljava/lang/Object;)Ljava/lang/Void;", "decodeTaggedBoolean", "decodeTaggedByte", "", "(Ljava/lang/Object;)B", "decodeTaggedShort", "", "(Ljava/lang/Object;)S", "decodeTaggedInt", "(Ljava/lang/Object;)I", "decodeTaggedLong", "", "(Ljava/lang/Object;)J", "decodeTaggedFloat", "", "(Ljava/lang/Object;)F", "decodeTaggedDouble", "", "(Ljava/lang/Object;)D", "decodeTaggedChar", "", "(Ljava/lang/Object;)C", "decodeTaggedString", "", "(Ljava/lang/Object;)Ljava/lang/String;", "decodeTaggedEnum", "enumDescriptor", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "decodeTaggedInline", "inlineDescriptor", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeSerializableValue", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "previousValue", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeInline", "descriptor", "decodeNotNullMark", "decodeNull", "decodeBoolean", "decodeByte", "decodeShort", "decodeInt", "decodeLong", "decodeFloat", "decodeDouble", "decodeChar", "decodeString", "decodeEnum", "beginStructure", "endStructure", "", "decodeBooleanElement", "decodeByteElement", "decodeShortElement", "decodeIntElement", "decodeLongElement", "decodeFloatElement", "decodeDoubleElement", "decodeCharElement", "decodeStringElement", "decodeInlineElement", "decodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "tagBlock", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "tagStack", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTagStack$kotlinx_serialization_core", "()Ljava/util/ArrayList;", "currentTag", "getCurrentTag", "()Ljava/lang/Object;", "currentTagOrNull", "getCurrentTagOrNull", "pushTag", "name", "(Ljava/lang/Object;)V", "copyTagsTo", "other", "flag", "popTag", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.InternalSerializationApi
/* loaded from: classes6.dex */
public abstract class TaggedDecoder<Tag> implements kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder {
    private boolean flag;
    private final java.util.ArrayList<Tag> tagStack = new java.util.ArrayList<>();

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public /* synthetic */ int decodeCollectionSize(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        return kotlinx.serialization.encoding.CompositeDecoder.CC.$default$decodeCollectionSize(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final java.lang.Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public /* synthetic */ java.lang.Object decodeNullableSerializableValue(kotlinx.serialization.DeserializationStrategy deserializationStrategy) {
        return kotlinx.serialization.encoding.Decoder.CC.$default$decodeNullableSerializableValue(this, deserializationStrategy);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public /* synthetic */ boolean decodeSequentially() {
        return kotlinx.serialization.encoding.CompositeDecoder.CC.$default$decodeSequentially(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public /* synthetic */ java.lang.Object decodeSerializableValue(kotlinx.serialization.DeserializationStrategy deserializationStrategy) {
        return kotlinx.serialization.encoding.Decoder.CC.$default$decodeSerializableValue(this, deserializationStrategy);
    }

    protected boolean decodeTaggedNotNullMark(Tag tag) {
        return true;
    }

    protected java.lang.Void decodeTaggedNull(Tag tag) {
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    protected abstract Tag getTag(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i);

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule();
    }

    protected java.lang.Object decodeTaggedValue(Tag tag) {
        throw new kotlinx.serialization.SerializationException(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    protected boolean decodeTaggedBoolean(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((java.lang.Boolean) decodeTaggedValue).booleanValue();
    }

    protected byte decodeTaggedByte(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((java.lang.Byte) decodeTaggedValue).byteValue();
    }

    protected short decodeTaggedShort(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.Short");
        return ((java.lang.Short) decodeTaggedValue).shortValue();
    }

    protected int decodeTaggedInt(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) decodeTaggedValue).intValue();
    }

    protected long decodeTaggedLong(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.Long");
        return ((java.lang.Long) decodeTaggedValue).longValue();
    }

    protected float decodeTaggedFloat(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((java.lang.Float) decodeTaggedValue).floatValue();
    }

    protected double decodeTaggedDouble(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.Double");
        return ((java.lang.Double) decodeTaggedValue).doubleValue();
    }

    protected char decodeTaggedChar(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.Char");
        return ((java.lang.Character) decodeTaggedValue).charValue();
    }

    protected java.lang.String decodeTaggedString(Tag tag) {
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.String");
        return (java.lang.String) decodeTaggedValue;
    }

    protected int decodeTaggedEnum(Tag tag, kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        java.lang.Object decodeTaggedValue = decodeTaggedValue(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeTaggedValue, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) decodeTaggedValue).intValue();
    }

    protected kotlinx.serialization.encoding.Decoder decodeTaggedInline(Tag tag, kotlinx.serialization.descriptors.SerialDescriptor inlineDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        pushTag(tag);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.Decoder decodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return decodeTaggedEnum(popTag(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedBoolean(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedByte(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedShort(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInt(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedLong(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedFloat(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedDouble(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedChar(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final java.lang.String decodeStringElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedString(getTag(descriptor, index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final kotlinx.serialization.encoding.Decoder decodeInlineElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return decodeTaggedInline(getTag(descriptor, index), descriptor.getElementDescriptor(index));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, final kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, final T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) tagBlock(getTag(descriptor, index), new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.TaggedDecoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.Object decodeSerializableValue;
                decodeSerializableValue = kotlinx.serialization.internal.TaggedDecoder.this.decodeSerializableValue(deserializer, previousValue);
                return decodeSerializableValue;
            }
        });
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final <T> T decodeNullableSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, final kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, final T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) tagBlock(getTag(descriptor, index), new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.TaggedDecoder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.Object decodeNullableSerializableElement$lambda$3;
                decodeNullableSerializableElement$lambda$3 = kotlinx.serialization.internal.TaggedDecoder.decodeNullableSerializableElement$lambda$3(kotlinx.serialization.internal.TaggedDecoder.this, deserializer, previousValue);
                return decodeNullableSerializableElement$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object decodeNullableSerializableElement$lambda$3(kotlinx.serialization.internal.TaggedDecoder taggedDecoder, kotlinx.serialization.DeserializationStrategy deserializationStrategy, java.lang.Object obj) {
        kotlinx.serialization.internal.TaggedDecoder taggedDecoder2 = taggedDecoder;
        return (deserializationStrategy.getDescriptor().isNullable() || taggedDecoder2.decodeNotNullMark()) ? taggedDecoder.decodeSerializableValue(deserializationStrategy, obj) : taggedDecoder2.decodeNull();
    }

    private final <E> E tagBlock(Tag tag, kotlin.jvm.functions.Function0<? extends E> block) {
        pushTag(tag);
        E invoke = block.invoke();
        if (!this.flag) {
            popTag();
        }
        this.flag = false;
        return invoke;
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

    protected final void pushTag(Tag name) {
        this.tagStack.add(name);
    }

    protected final void copyTagsTo(kotlinx.serialization.internal.TaggedDecoder<Tag> other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        other.tagStack.addAll(this.tagStack);
    }

    protected final Tag popTag() {
        java.util.ArrayList<Tag> arrayList = this.tagStack;
        Tag remove = arrayList.remove(kotlin.collections.CollectionsKt.getLastIndex(arrayList));
        this.flag = true;
        return remove;
    }
}
