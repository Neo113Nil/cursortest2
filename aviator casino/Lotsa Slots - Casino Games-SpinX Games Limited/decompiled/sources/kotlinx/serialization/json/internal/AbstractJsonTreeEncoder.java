package kotlinx.serialization.json.internal;

/* compiled from: TreeJsonEncoder.kt */
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002JM\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0014J\u0018\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0007H&J\b\u0010&\u001a\u00020\u0007H&J\b\u0010'\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020\bH\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0016H\u0014J\u0018\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u001cH\u0014J\u0018\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020.H\u0014J\u0018\u0010/\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u000200H\u0014J\u0018\u00101\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u000202H\u0014J\u0018\u00103\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u000204H\u0014J)\u00105\u001a\u00020\b\"\u0004\b\u0000\u001062\f\u00107\u001a\b\u0012\u0004\u0012\u0002H6082\u0006\u0010,\u001a\u0002H6H\u0016¢\u0006\u0002\u00109J\u0018\u0010:\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020;H\u0014J\u0018\u0010<\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020 H\u0014J\u0018\u0010=\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020>H\u0014J\u0018\u0010?\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0016H\u0014J \u0010@\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001cH\u0014J\u0018\u0010C\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020DH\u0014J\u0018\u0010E\u001a\u00020F2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u001aH\u0014J\u0010\u0010H\u001a\u00020F2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010I\u001a\u00020J2\u0006\u0010*\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010KJ\u001d\u0010L\u001a\u00020M2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010NJ\u0010\u0010O\u001a\u00020P2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010Q\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u00148\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0001\u0003RST¨\u0006U"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "getNodeConsumer", "()Lkotlin/jvm/functions/Function1;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "polymorphicDiscriminator", "", "polymorphicSerialName", "elementName", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "encodeJsonElement", "element", "shouldEncodeElementDefault", "", "composeName", "parentName", "childName", "putElement", com.ironsource.X3.i.W, "getCurrent", "encodeNotNullMark", "encodeNull", "encodeTaggedNull", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "encodeTaggedInt", "value", "encodeTaggedByte", "", "encodeTaggedShort", "", "encodeTaggedLong", "", "encodeTaggedFloat", "", "encodeSerializableValue", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeTaggedDouble", "", "encodeTaggedBoolean", "encodeTaggedChar", "", "encodeTaggedString", "encodeTaggedEnum", "enumDescriptor", com.unity3d.ads.metadata.MediationMetaData.KEY_ORDINAL, "encodeTaggedValue", "", "encodeTaggedInline", "Lkotlinx/serialization/encoding/Encoder;", "inlineDescriptor", "encodeInline", "inlineUnsignedNumberEncoder", "kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1", "(Ljava/lang/String;)Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1;", "inlineUnquotedLiteralEncoder", "kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "endEncode", "Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
abstract class AbstractJsonTreeEncoder extends kotlinx.serialization.internal.NamedValueEncoder implements kotlinx.serialization.json.JsonEncoder {
    protected final kotlinx.serialization.json.JsonConfiguration configuration;
    private final kotlinx.serialization.json.Json json;
    private final kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonElement, kotlin.Unit> nodeConsumer;
    private java.lang.String polymorphicDiscriminator;
    private java.lang.String polymorphicSerialName;

    public /* synthetic */ AbstractJsonTreeEncoder(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    protected java.lang.String composeName(java.lang.String parentName, java.lang.String childName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentName, "parentName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
    }

    public abstract kotlinx.serialization.json.JsonElement getCurrent();

    public abstract void putElement(java.lang.String key, kotlinx.serialization.json.JsonElement element);

    @Override // kotlinx.serialization.json.JsonEncoder
    public final kotlinx.serialization.json.Json getJson() {
        return this.json;
    }

    protected final kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonElement, kotlin.Unit> getNodeConsumer() {
        return this.nodeConsumer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractJsonTreeEncoder(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonElement, kotlin.Unit> function1) {
        this.json = json;
        this.nodeConsumer = function1;
        this.configuration = json.getConfiguration();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return this.json.getSerializersModule();
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    protected java.lang.String elementName(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonElementName(descriptor, this.json, index);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        if (this.polymorphicDiscriminator != null && !(element instanceof kotlinx.serialization.json.JsonObject)) {
            kotlinx.serialization.json.internal.PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element);
            throw new kotlin.KotlinNothingValueException();
        }
        encodeSerializableValue(kotlinx.serialization.json.JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        java.lang.String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.nodeConsumer.invoke(kotlinx.serialization.json.JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(currentTagOrNull);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedNull(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, kotlinx.serialization.json.JsonNull.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedInt(java.lang.String tag, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Integer.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedByte(java.lang.String tag, byte value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Byte.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedShort(java.lang.String tag, short value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Short.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedLong(java.lang.String tag, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Long.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedFloat(java.lang.String tag, float value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Float.valueOf(value)));
        if (!this.configuration.getAllowSpecialFloatingPointValues() && java.lang.Math.abs(value) > Float.MAX_VALUE) {
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointEncoded(java.lang.Float.valueOf(value), tag, getCurrent().toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r0.getJson().getConfiguration().getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE) == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> void encodeSerializableValue(kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        java.lang.String classDiscriminator;
        boolean requiresTopLevelTag;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (getCurrentTagOrNull() == null) {
            requiresTopLevelTag = kotlinx.serialization.json.internal.TreeJsonEncoderKt.getRequiresTopLevelTag(kotlinx.serialization.json.internal.WriteModeKt.carrierDescriptor(serializer.getDescriptor(), getSerializersModule()));
            if (requiresTopLevelTag) {
                new kotlinx.serialization.json.internal.JsonPrimitiveEncoder(this.json, this.nodeConsumer).encodeSerializableValue(serializer, value);
                return;
            }
        }
        kotlinx.serialization.json.internal.AbstractJsonTreeEncoder abstractJsonTreeEncoder = this;
        if (abstractJsonTreeEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(abstractJsonTreeEncoder, value);
            return;
        }
        boolean z = serializer instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer;
        if (!z) {
            int i = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[abstractJsonTreeEncoder.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlinx.serialization.descriptors.SerialKind kind = serializer.getDescriptor().getKind();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE)) {
                }
                classDiscriminator = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(serializer.getDescriptor(), abstractJsonTreeEncoder.getJson());
            }
            classDiscriminator = null;
        }
        if (z) {
            kotlinx.serialization.internal.AbstractPolymorphicSerializer abstractPolymorphicSerializer = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) serializer;
            if (value == 0) {
                throw new java.lang.IllegalArgumentException(("Value for serializer " + abstractPolymorphicSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            kotlinx.serialization.SerializationStrategy<? super T> findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, abstractJsonTreeEncoder, value);
            if (classDiscriminator != null) {
                kotlinx.serialization.json.internal.PolymorphicKt.validateIfSealed(serializer, findPolymorphicSerializer, classDiscriminator);
                kotlinx.serialization.json.internal.PolymorphicKt.checkKind(findPolymorphicSerializer.getDescriptor().getKind());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = findPolymorphicSerializer;
        }
        if (classDiscriminator != null) {
            java.lang.String serialName = serializer.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = classDiscriminator;
            this.polymorphicSerialName = serialName;
        }
        serializer.serialize(abstractJsonTreeEncoder, value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedDouble(java.lang.String tag, double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Double.valueOf(value)));
        if (!this.configuration.getAllowSpecialFloatingPointValues() && java.lang.Math.abs(value) > Double.MAX_VALUE) {
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointEncoded(java.lang.Double.valueOf(value), tag, getCurrent().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedBoolean(java.lang.String tag, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.Boolean.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedChar(java.lang.String tag, char value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(java.lang.String.valueOf(value)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedString(java.lang.String tag, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(value));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedEnum(java.lang.String tag, kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor, int ordinal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(ordinal)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedValue(java.lang.String tag, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        putElement(tag, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(value.toString()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedEncoder
    public kotlinx.serialization.encoding.Encoder encodeTaggedInline(java.lang.String tag, kotlinx.serialization.descriptors.SerialDescriptor inlineDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        return kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor) ? inlineUnsignedNumberEncoder(tag) : kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnquotedLiteral(inlineDescriptor) ? inlineUnquotedLiteralEncoder(tag, inlineDescriptor) : super.encodeTaggedInline((kotlinx.serialization.json.internal.AbstractJsonTreeEncoder) tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public kotlinx.serialization.encoding.Encoder encodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (getCurrentTagOrNull() != null) {
            if (this.polymorphicDiscriminator != null) {
                this.polymorphicSerialName = descriptor.getSerialName();
            }
            return super.encodeInline(descriptor);
        }
        return new kotlinx.serialization.json.internal.JsonPrimitiveEncoder(this.json, this.nodeConsumer).encodeInline(descriptor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1] */
    private final kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1 inlineUnsignedNumberEncoder(final java.lang.String tag) {
        return new kotlinx.serialization.encoding.AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1
            private final kotlinx.serialization.modules.SerializersModule serializersModule;

            {
                this.serializersModule = kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
                return this.serializersModule;
            }

            public final void putUnquotedString(java.lang.String s) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "s");
                kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.this.putElement(tag, new kotlinx.serialization.json.JsonLiteral(s, false, null, 4, null));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int value) {
                java.lang.String m10868m;
                m10868m = kotlin.UByte$$ExternalSyntheticBackport0.m10868m(kotlin.UInt.m10896constructorimpl(value), 10);
                putUnquotedString(m10868m);
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long value) {
                java.lang.String m$1;
                m$1 = kotlin.UByte$$ExternalSyntheticBackport0.m$1(kotlin.ULong.m10975constructorimpl(value), 10);
                putUnquotedString(m$1);
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte value) {
                putUnquotedString(kotlin.UByte.m10860toStringimpl(kotlin.UByte.m10816constructorimpl(value)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short value) {
                putUnquotedString(kotlin.UShort.m11126toStringimpl(kotlin.UShort.m11082constructorimpl(value)));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1] */
    private final kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1 inlineUnquotedLiteralEncoder(final java.lang.String tag, final kotlinx.serialization.descriptors.SerialDescriptor inlineDescriptor) {
        return new kotlinx.serialization.encoding.AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1
            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
                return kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeString(java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.this.putElement(tag, new kotlinx.serialization.json.JsonLiteral(value, false, inlineDescriptor));
            }
        };
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public kotlinx.serialization.encoding.CompositeEncoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlinx.serialization.json.internal.JsonTreeListEncoder jsonTreeListEncoder;
        kotlinx.serialization.json.internal.AbstractJsonTreeEncoder jsonTreeMapEncoder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonElement, kotlin.Unit> function1 = getCurrentTagOrNull() == null ? this.nodeConsumer : new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit beginStructure$lambda$2;
                beginStructure$lambda$2 = kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.beginStructure$lambda$2(kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.this, (kotlinx.serialization.json.JsonElement) obj);
                return beginStructure$lambda$2;
            }
        };
        kotlinx.serialization.descriptors.SerialKind kind = descriptor.getKind();
        if (kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE) || (kind instanceof kotlinx.serialization.descriptors.PolymorphicKind)) {
            jsonTreeListEncoder = new kotlinx.serialization.json.internal.JsonTreeListEncoder(this.json, function1);
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.MAP.INSTANCE)) {
            jsonTreeListEncoder = new kotlinx.serialization.json.internal.JsonTreeEncoder(this.json, function1);
        } else {
            kotlinx.serialization.json.Json json = this.json;
            kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor = kotlinx.serialization.json.internal.WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
            kotlinx.serialization.descriptors.SerialKind kind2 = carrierDescriptor.getKind();
            if ((kind2 instanceof kotlinx.serialization.descriptors.PrimitiveKind) || kotlin.jvm.internal.Intrinsics.areEqual(kind2, kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE)) {
                jsonTreeMapEncoder = new kotlinx.serialization.json.internal.JsonTreeMapEncoder(this.json, function1);
            } else if (json.getConfiguration().getAllowStructuredMapKeys()) {
                jsonTreeMapEncoder = new kotlinx.serialization.json.internal.JsonTreeListEncoder(this.json, function1);
            } else {
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
            }
            jsonTreeListEncoder = jsonTreeMapEncoder;
        }
        java.lang.String str = this.polymorphicDiscriminator;
        if (str != null) {
            if (jsonTreeListEncoder instanceof kotlinx.serialization.json.internal.JsonTreeMapEncoder) {
                kotlinx.serialization.json.internal.JsonTreeMapEncoder jsonTreeMapEncoder2 = (kotlinx.serialization.json.internal.JsonTreeMapEncoder) jsonTreeListEncoder;
                jsonTreeMapEncoder2.putElement(com.ironsource.X3.i.W, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(str));
                java.lang.String str2 = this.polymorphicSerialName;
                if (str2 == null) {
                    str2 = descriptor.getSerialName();
                }
                jsonTreeMapEncoder2.putElement("value", kotlinx.serialization.json.JsonElementKt.JsonPrimitive(str2));
            } else {
                java.lang.String str3 = this.polymorphicSerialName;
                if (str3 == null) {
                    str3 = descriptor.getSerialName();
                }
                jsonTreeListEncoder.putElement(str, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(str3));
            }
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        return jsonTreeListEncoder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit beginStructure$lambda$2(kotlinx.serialization.json.internal.AbstractJsonTreeEncoder abstractJsonTreeEncoder, kotlinx.serialization.json.JsonElement node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        abstractJsonTreeEncoder.putElement(abstractJsonTreeEncoder.getCurrentTag(), node);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    protected void endEncode(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.nodeConsumer.invoke(getCurrent());
    }
}
