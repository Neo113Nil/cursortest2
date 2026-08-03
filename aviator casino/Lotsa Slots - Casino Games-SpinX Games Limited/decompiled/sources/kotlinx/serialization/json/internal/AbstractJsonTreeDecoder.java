package kotlinx.serialization.json.internal;

/* compiled from: TreeJsonDecoder.kt */
@kotlin.Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0017\u001a\u00020\u0006H\u0004J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bJ\b\u0010\u001a\u001a\u00020\u0006H\u0016J!\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0016¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0014J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J*\u0010'\u001a\u0002H\u001c\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&H\u0086\b¢\u0006\u0002\u0010(J2\u0010'\u001a\u0002H\u001c\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0086\b¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020-2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u0019\u00100\u001a\u0002012\u0006\u0010*\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0084\bJC\u00100\u001a\u0002H\u001c\"\b\b\u0000\u0010\u001c*\u0002022\u0006\u0010*\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0019\u00104\u001a\u0015\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u0001H\u001c05¢\u0006\u0002\b6H\u0082\b¢\u0006\u0002\u00107J \u00108\u001a\u0002092\u0006\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0002J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\bH$J\u0018\u0010=\u001a\u00020>2\u0006\u0010*\u001a\u00020\b2\u0006\u0010?\u001a\u00020&H\u0014J\u0012\u0010@\u001a\u0004\u0018\u0001092\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010A\u001a\u00020/2\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010B\u001a\u00020/2\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010C\u001a\u00020D2\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010E\u001a\u00020F2\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010G\u001a\u00020>2\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010H\u001a\u00020I2\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010J\u001a\u00020K2\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010L\u001a\u00020M2\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010N\u001a\u00020O2\u0006\u0010*\u001a\u00020\bH\u0014J\u0010\u0010P\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0014J\u0018\u0010Q\u001a\u00020R2\u0006\u0010*\u001a\u00020\b2\u0006\u0010S\u001a\u00020&H\u0014J\u0010\u0010T\u001a\u00020R2\u0006\u0010%\u001a\u00020&H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u00020\u00168\u0004X\u0085\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0003UVW¨\u0006X"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "json", "Lkotlinx/serialization/json/Json;", "value", "Lkotlinx/serialization/json/JsonElement;", "polymorphicDiscriminator", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "getValue", "()Lkotlinx/serialization/json/JsonElement;", "getPolymorphicDiscriminator", "()Ljava/lang/String;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "currentObject", "renderTagStack", "currentTag", "decodeJsonElement", "decodeSerializableValue", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "composeName", "parentName", "childName", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "cast", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/JsonElement;", "serialName", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "endStructure", "", "decodeNotNullMark", "", "getPrimitiveValue", "Lkotlinx/serialization/json/JsonPrimitive;", "", "primitiveName", "convert", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "unparsedPrimitive", "", "literal", kotlinx.serialization.json.internal.TreeJsonEncoderKt.PRIMITIVE_TAG, "currentElement", "decodeTaggedEnum", "", "enumDescriptor", "decodeTaggedNull", "decodeTaggedNotNullMark", "decodeTaggedBoolean", "decodeTaggedByte", "", "decodeTaggedShort", "", "decodeTaggedInt", "decodeTaggedLong", "", "decodeTaggedFloat", "", "decodeTaggedDouble", "", "decodeTaggedChar", "", "decodeTaggedString", "decodeTaggedInline", "Lkotlinx/serialization/encoding/Decoder;", "inlineDescriptor", "decodeInline", "Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
abstract class AbstractJsonTreeDecoder extends kotlinx.serialization.internal.NamedValueDecoder implements kotlinx.serialization.json.JsonDecoder {
    protected final kotlinx.serialization.json.JsonConfiguration configuration;
    private final kotlinx.serialization.json.Json json;
    private final java.lang.String polymorphicDiscriminator;
    private final kotlinx.serialization.json.JsonElement value;

    public /* synthetic */ AbstractJsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, str);
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    protected java.lang.String composeName(java.lang.String parentName, java.lang.String childName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentName, "parentName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract kotlinx.serialization.json.JsonElement currentElement(java.lang.String tag);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public java.lang.Void decodeTaggedNull(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        return null;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public /* synthetic */ AbstractJsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, (i & 4) != 0 ? null : str, null);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public kotlinx.serialization.json.Json getJson() {
        return this.json;
    }

    public kotlinx.serialization.json.JsonElement getValue() {
        return this.value;
    }

    protected final java.lang.String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    private AbstractJsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str) {
        this.json = json;
        this.value = jsonElement;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    protected final kotlinx.serialization.json.JsonElement currentObject() {
        kotlinx.serialization.json.JsonElement currentElement;
        java.lang.String currentTagOrNull = getCurrentTagOrNull();
        return (currentTagOrNull == null || (currentElement = currentElement(currentTagOrNull)) == null) ? getValue() : currentElement;
    }

    public final java.lang.String renderTagStack(java.lang.String currentTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return renderTagStack() + '.' + currentTag;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public kotlinx.serialization.json.JsonElement decodeJsonElement() {
        return currentObject();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlinx.serialization.json.internal.AbstractJsonTreeDecoder abstractJsonTreeDecoder = this;
        if (!(deserializer instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer) || abstractJsonTreeDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(abstractJsonTreeDecoder);
        }
        kotlinx.serialization.internal.AbstractPolymorphicSerializer abstractPolymorphicSerializer = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer;
        java.lang.String classDiscriminator = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), abstractJsonTreeDecoder.getJson());
        kotlinx.serialization.json.JsonElement decodeJsonElement = abstractJsonTreeDecoder.decodeJsonElement();
        java.lang.String serialName = abstractPolymorphicSerializer.getDescriptor().getSerialName();
        if (decodeJsonElement instanceof kotlinx.serialization.json.JsonObject) {
            kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) decodeJsonElement;
            kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) classDiscriminator);
            try {
                kotlinx.serialization.DeserializationStrategy findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer, abstractJsonTreeDecoder, (jsonElement == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive));
                kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) kotlinx.serialization.json.internal.TreeJsonDecoderKt.readPolymorphicJson(abstractJsonTreeDecoder.getJson(), classDiscriminator, jsonObject, findPolymorphicSerializer);
            } catch (kotlinx.serialization.SerializationException e) {
                java.lang.String message = e.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNull(message);
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), decodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlinx.serialization.encoding.CompositeDecoder jsonTreeMapDecoder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.JsonElement currentObject = currentObject();
        kotlinx.serialization.descriptors.SerialKind kind = descriptor.getKind();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE) && !(kind instanceof kotlinx.serialization.descriptors.PolymorphicKind)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.MAP.INSTANCE)) {
                kotlinx.serialization.json.Json json = getJson();
                kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor = kotlinx.serialization.json.internal.WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
                kotlinx.serialization.descriptors.SerialKind kind2 = carrierDescriptor.getKind();
                if ((kind2 instanceof kotlinx.serialization.descriptors.PrimitiveKind) || kotlin.jvm.internal.Intrinsics.areEqual(kind2, kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE)) {
                    kotlinx.serialization.json.Json json2 = getJson();
                    java.lang.String serialName = descriptor.getSerialName();
                    if (currentObject instanceof kotlinx.serialization.json.JsonObject) {
                        jsonTreeMapDecoder = new kotlinx.serialization.json.internal.JsonTreeMapDecoder(json2, (kotlinx.serialization.json.JsonObject) currentObject);
                    } else {
                        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), currentObject.toString());
                    }
                } else if (json.getConfiguration().getAllowStructuredMapKeys()) {
                    kotlinx.serialization.json.Json json3 = getJson();
                    java.lang.String serialName2 = descriptor.getSerialName();
                    if (currentObject instanceof kotlinx.serialization.json.JsonArray) {
                        jsonTreeMapDecoder = new kotlinx.serialization.json.internal.JsonTreeListDecoder(json3, (kotlinx.serialization.json.JsonArray) currentObject);
                    } else {
                        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonArray.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName2 + " at element: " + renderTagStack(), currentObject.toString());
                    }
                } else {
                    throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
                }
                return jsonTreeMapDecoder;
            }
            kotlinx.serialization.json.Json json4 = getJson();
            java.lang.String serialName3 = descriptor.getSerialName();
            if (currentObject instanceof kotlinx.serialization.json.JsonObject) {
                return new kotlinx.serialization.json.internal.JsonTreeDecoder(json4, (kotlinx.serialization.json.JsonObject) currentObject, this.polymorphicDiscriminator, null, 8, null);
            }
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName3 + " at element: " + renderTagStack(), currentObject.toString());
        }
        kotlinx.serialization.json.Json json5 = getJson();
        java.lang.String serialName4 = descriptor.getSerialName();
        if (currentObject instanceof kotlinx.serialization.json.JsonArray) {
            return new kotlinx.serialization.json.internal.JsonTreeListDecoder(json5, (kotlinx.serialization.json.JsonArray) currentObject);
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonArray.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName4 + " at element: " + renderTagStack(), currentObject.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends kotlinx.serialization.json.JsonElement> T cast(kotlinx.serialization.json.JsonElement value, kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        java.lang.String serialName = descriptor.getSerialName();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
        if (value instanceof kotlinx.serialization.json.JsonElement) {
            return value;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonElement.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(serialName);
        sb.append(" at element: ");
        sb.append(renderTagStack());
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), value.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(currentObject() instanceof kotlinx.serialization.json.JsonNull);
    }

    protected final kotlinx.serialization.json.JsonPrimitive getPrimitiveValue(java.lang.String tag, kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        java.lang.String serialName = descriptor.getSerialName();
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            return (kotlinx.serialization.json.JsonPrimitive) currentElement;
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), currentElement.toString());
    }

    private final <T> T getPrimitiveValue(java.lang.String tag, java.lang.String primitiveName, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonPrimitive, ? extends T> convert) {
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            try {
                T invoke = convert.invoke(jsonPrimitive);
                if (invoke != null) {
                    return invoke;
                }
                unparsedPrimitive(jsonPrimitive, primitiveName, tag);
                throw new kotlin.KotlinNothingValueException();
            } catch (java.lang.IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, primitiveName, tag);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of " + primitiveName + " at element: " + renderTagStack(tag), currentElement.toString());
    }

    private final java.lang.Void unparsedPrimitive(kotlinx.serialization.json.JsonPrimitive literal, java.lang.String primitive, java.lang.String tag) {
        java.lang.StringBuilder sb = kotlin.text.StringsKt.startsWith$default(primitive, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, false, 2, (java.lang.Object) null) ? new java.lang.StringBuilder("an ") : new java.lang.StringBuilder("a ");
        sb.append(primitive);
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal '" + literal + "' as " + sb.toString() + " value at element: " + renderTagStack(tag), currentObject().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedEnum(java.lang.String tag, kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        kotlinx.serialization.json.Json json = getJson();
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        java.lang.String serialName = enumDescriptor.getSerialName();
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            return kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, json, ((kotlinx.serialization.json.JsonPrimitive) currentElement).getContent(), null, 4, null);
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedNotNullMark(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        return currentElement(tag) != kotlinx.serialization.json.JsonNull.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedBoolean(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            try {
                java.lang.Boolean booleanOrNull = kotlinx.serialization.json.JsonElementKt.getBooleanOrNull(jsonPrimitive);
                if (booleanOrNull == null) {
                    unparsedPrimitive(jsonPrimitive, "boolean", tag);
                    throw new kotlin.KotlinNothingValueException();
                }
                return booleanOrNull.booleanValue();
            } catch (java.lang.IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "boolean", tag);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public byte decodeTaggedByte(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            try {
                long parseLongImpl = kotlinx.serialization.json.JsonElementKt.parseLongImpl(jsonPrimitive);
                java.lang.Byte valueOf = (-128 > parseLongImpl || parseLongImpl > 127) ? null : java.lang.Byte.valueOf((byte) parseLongImpl);
                if (valueOf == null) {
                    unparsedPrimitive(jsonPrimitive, "byte", tag);
                    throw new kotlin.KotlinNothingValueException();
                }
                return valueOf.byteValue();
            } catch (java.lang.IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "byte", tag);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of byte at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public short decodeTaggedShort(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            try {
                long parseLongImpl = kotlinx.serialization.json.JsonElementKt.parseLongImpl(jsonPrimitive);
                java.lang.Short valueOf = (-32768 > parseLongImpl || parseLongImpl > 32767) ? null : java.lang.Short.valueOf((short) parseLongImpl);
                if (valueOf == null) {
                    unparsedPrimitive(jsonPrimitive, "short", tag);
                    throw new kotlin.KotlinNothingValueException();
                }
                return valueOf.shortValue();
            } catch (java.lang.IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "short", tag);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of short at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedInt(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            try {
                long parseLongImpl = kotlinx.serialization.json.JsonElementKt.parseLongImpl(jsonPrimitive);
                java.lang.Integer valueOf = (-2147483648L > parseLongImpl || parseLongImpl > 2147483647L) ? null : java.lang.Integer.valueOf((int) parseLongImpl);
                if (valueOf == null) {
                    unparsedPrimitive(jsonPrimitive, "int", tag);
                    throw new kotlin.KotlinNothingValueException();
                }
                return valueOf.intValue();
            } catch (java.lang.IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "int", tag);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of int at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public java.lang.String decodeTaggedString(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            if (!(jsonPrimitive instanceof kotlinx.serialization.json.JsonLiteral)) {
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + renderTagStack(tag), currentObject().toString());
            }
            kotlinx.serialization.json.JsonLiteral jsonLiteral = (kotlinx.serialization.json.JsonLiteral) jsonPrimitive;
            if (!jsonLiteral.getIsString() && !getJson().getConfiguration().getIsLenient()) {
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted at element: " + renderTagStack(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", currentObject().toString());
            }
            return jsonLiteral.getContent();
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of string at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public kotlinx.serialization.encoding.Decoder decodeTaggedInline(java.lang.String tag, kotlinx.serialization.descriptors.SerialDescriptor inlineDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            kotlinx.serialization.json.Json json = getJson();
            kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
            java.lang.String serialName = inlineDescriptor.getSerialName();
            if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
                return new kotlinx.serialization.json.internal.JsonDecoderForUnsignedTypes(kotlinx.serialization.json.internal.StringJsonLexerKt.StringJsonLexer(json, ((kotlinx.serialization.json.JsonPrimitive) currentElement).getContent()), getJson());
            }
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(tag), currentElement.toString());
        }
        return super.decodeTaggedInline((kotlinx.serialization.json.internal.AbstractJsonTreeDecoder) tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.Decoder decodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return getCurrentTagOrNull() != null ? super.decodeInline(descriptor) : new kotlinx.serialization.json.internal.JsonPrimitiveDecoder(getJson(), getValue(), this.polymorphicDiscriminator).decodeInline(descriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends kotlinx.serialization.json.JsonElement> T cast(kotlinx.serialization.json.JsonElement value, java.lang.String serialName, java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
        if (value instanceof kotlinx.serialization.json.JsonElement) {
            return value;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonElement.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(serialName);
        sb.append(" at element: ");
        sb.append(renderTagStack(tag));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), value.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public long decodeTaggedLong(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            try {
                return kotlinx.serialization.json.JsonElementKt.parseLongImpl(jsonPrimitive);
            } catch (java.lang.IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, com.adjust.sdk.Constants.LONG, tag);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of long at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public float decodeTaggedFloat(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            try {
                float f = kotlinx.serialization.json.JsonElementKt.getFloat(jsonPrimitive);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || java.lang.Math.abs(f) <= Float.MAX_VALUE) {
                    return f;
                }
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointDecoded(java.lang.Float.valueOf(f), tag, currentObject().toString());
            } catch (java.lang.IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "float", tag);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of float at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public double decodeTaggedDouble(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            try {
                double d = kotlinx.serialization.json.JsonElementKt.getDouble(jsonPrimitive);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues() || java.lang.Math.abs(d) <= Double.MAX_VALUE) {
                    return d;
                }
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointDecoded(java.lang.Double.valueOf(d), tag, currentObject().toString());
            } catch (java.lang.IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "double", tag);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of double at element: " + renderTagStack(tag), currentElement.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public char decodeTaggedChar(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) currentElement;
            try {
                return kotlin.text.StringsKt.single(jsonPrimitive.getContent());
            } catch (java.lang.IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "char", tag);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentElement.getClass()).getSimpleName() + " as the serialized body of char at element: " + renderTagStack(tag), currentElement.toString());
    }
}
