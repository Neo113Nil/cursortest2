package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\fJ#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H$¢\u0006\u0004\b$\u0010%J\u0017\u0010\u000b\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010&J\u0017\u0010\"\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016¢\u0006\u0004\b<\u0010=R\u001a\u0010$\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b?\u0010@R\u001a\u00109\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010A\u001a\u0004\b6\u0010\fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\"\u0010B\u001a\u0004\b9\u0010CR\u0014\u0010\"\u001a\u00020D8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u00106\u001a\u00020G8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010H\u0082\u0001\u0003IJK"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlinx/serialization/json/JsonElement;", "p1", "", "p2", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Camera2StreamConfigurationMap", "()Lkotlinx/serialization/json/JsonElement;", "getInputFormats", "(Ljava/lang/String;)Ljava/lang/String;", "decodeJsonElement", "T", "Lkotlinx/serialization/DeserializationStrategy;", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "composeName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "decodeNotNullMark", "()Z", "Lkotlinx/serialization/json/JsonPrimitive;", "", "getHighSpeedVideoFpsRangesFor", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "(Ljava/lang/String;)Z", "", "(Ljava/lang/String;)B", "", "getHighSpeedVideoSizesFor", "(Ljava/lang/String;)S", "", "getOutputMinFrameDuration", "(Ljava/lang/String;)I", "", "getInputSizeshNQ4ISI", "(Ljava/lang/String;)J", "", "getOutputFormats", "(Ljava/lang/String;)F", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)D", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;)C", "Lkotlinx/serialization/encoding/Decoder;", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/JsonElement;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeListDecoder;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
abstract class AbstractJsonTreeDecoder extends kotlinx.serialization.internal.NamedValueDecoder implements kotlinx.serialization.json.JsonDecoder {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    protected final kotlinx.serialization.json.JsonConfiguration getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;
    private final kotlinx.serialization.json.JsonElement getHighSpeedVideoSizes;

    protected abstract kotlinx.serialization.json.JsonElement getHighSpeedVideoFpsRanges(java.lang.String p0);

    private AbstractJsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = json;
        this.getHighSpeedVideoSizes = jsonElement;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = getGetHighSpeedVideoFpsRanges().getConfiguration();
    }

    public /* synthetic */ AbstractJsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, (i & 4) != 0 ? null : str, null);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public /* synthetic */ int decodeTaggedEnum(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges = getGetHighSpeedVideoFpsRanges();
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str2);
        java.lang.String getHighSpeedVideoSizes = serialDescriptor.getGetHighSpeedVideoSizes();
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            return kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndexOrThrow$default(serialDescriptor, getHighSpeedVideoFpsRanges, ((kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges).getContent(), null, 4, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(getHighSpeedVideoSizes);
        sb.append(" at element: ");
        sb.append(getInputFormats(str2));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public /* synthetic */ kotlinx.serialization.encoding.Decoder decodeTaggedInline(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnsignedNumber(serialDescriptor)) {
            kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges = getGetHighSpeedVideoFpsRanges();
            kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str2);
            java.lang.String getHighSpeedVideoSizes = serialDescriptor.getGetHighSpeedVideoSizes();
            if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
                return new kotlinx.serialization.json.internal.JsonDecoderForUnsignedTypes(kotlinx.serialization.json.internal.StringJsonLexerKt.StringJsonLexer(getHighSpeedVideoFpsRanges, ((kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges).getContent()), getGetHighSpeedVideoFpsRanges());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
            sb.append(", but had ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
            sb.append(" as the serialized body of ");
            sb.append(getHighSpeedVideoSizes);
            sb.append(" at element: ");
            sb.append(getInputFormats(str2));
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
        }
        return super.decodeTaggedInline(str2, serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public /* synthetic */ boolean decodeTaggedNotNullMark(java.lang.String str) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return getHighSpeedVideoFpsRanges(str2) != kotlinx.serialization.json.JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public /* synthetic */ java.lang.Void decodeTaggedNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return null;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public /* synthetic */ java.lang.String decodeTaggedString(java.lang.String str) {
        kotlinx.serialization.json.JsonElement getHighSpeedVideoSizes;
        kotlinx.serialization.json.JsonElement getHighSpeedVideoSizes2;
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str2);
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges;
            if (!(jsonPrimitive instanceof kotlinx.serialization.json.JsonLiteral)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected string value for a non-null key '");
                sb.append(str2);
                sb.append("', got null literal instead at element: ");
                sb.append(getInputFormats(str2));
                java.lang.String obj = sb.toString();
                java.lang.String currentTagOrNull = getCurrentTagOrNull();
                if (currentTagOrNull == null || (getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(currentTagOrNull)) == null) {
                    getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
                }
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, obj, getHighSpeedVideoSizes.toString());
            }
            kotlinx.serialization.json.JsonLiteral jsonLiteral = (kotlinx.serialization.json.JsonLiteral) jsonPrimitive;
            if (!jsonLiteral.getIsString() && !getGetHighSpeedVideoFpsRanges().getConfiguration().getIsLenient()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("String literal for key '");
                sb2.append(str2);
                sb2.append("' should be quoted at element: ");
                sb2.append(getInputFormats(str2));
                sb2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
                java.lang.String obj2 = sb2.toString();
                java.lang.String currentTagOrNull2 = getCurrentTagOrNull();
                if (currentTagOrNull2 == null || (getHighSpeedVideoSizes2 = getHighSpeedVideoFpsRanges(currentTagOrNull2)) == null) {
                    getHighSpeedVideoSizes2 = getGetHighSpeedVideoSizes();
                }
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, obj2, getHighSpeedVideoSizes2.toString());
            }
            return jsonLiteral.getContent();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected ");
        sb3.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb3.append(", but had ");
        sb3.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb3.append(" as the serialized body of string at element: ");
        sb3.append(getInputFormats(str2));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb3.toString(), highSpeedVideoFpsRanges.toString());
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    /* renamed from: getJson, reason: from getter */
    public kotlinx.serialization.json.Json getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public kotlinx.serialization.json.JsonElement getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    protected final java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return getGetHighSpeedVideoFpsRanges().getSerializersModule();
    }

    protected final kotlinx.serialization.json.JsonElement Camera2StreamConfigurationMap() {
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges;
        java.lang.String currentTagOrNull = getCurrentTagOrNull();
        return (currentTagOrNull == null || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(currentTagOrNull)) == null) ? getGetHighSpeedVideoSizes() : highSpeedVideoFpsRanges;
    }

    private java.lang.String getInputFormats(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(renderTagStack());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(p0);
        return sb.toString();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> p0) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.internal.AbstractJsonTreeDecoder abstractJsonTreeDecoder = this;
        if (!(p0 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer) || abstractJsonTreeDecoder.getGetHighSpeedVideoFpsRanges().getConfiguration().getUseArrayPolymorphism()) {
            return p0.deserialize(abstractJsonTreeDecoder);
        }
        kotlinx.serialization.internal.AbstractPolymorphicSerializer abstractPolymorphicSerializer = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) p0;
        java.lang.String classDiscriminator = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), abstractJsonTreeDecoder.getGetHighSpeedVideoFpsRanges());
        kotlinx.serialization.json.JsonElement decodeJsonElement = abstractJsonTreeDecoder.decodeJsonElement();
        java.lang.String getHighSpeedVideoSizes = abstractPolymorphicSerializer.getDescriptor().getGetHighSpeedVideoSizes();
        if (decodeJsonElement instanceof kotlinx.serialization.json.JsonObject) {
            kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) decodeJsonElement;
            kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) classDiscriminator);
            try {
                kotlinx.serialization.DeserializationStrategy findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer((kotlinx.serialization.internal.AbstractPolymorphicSerializer) p0, abstractJsonTreeDecoder, (jsonElement == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive));
                kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer, "");
                return (T) kotlinx.serialization.json.internal.TreeJsonDecoderKt.readPolymorphicJson(abstractJsonTreeDecoder.getGetHighSpeedVideoFpsRanges(), classDiscriminator, jsonObject, findPolymorphicSerializer);
            } catch (kotlinx.serialization.SerializationException e) {
                java.lang.String message = e.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNull(message);
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(getHighSpeedVideoSizes);
        sb.append(" at element: ");
        sb.append(renderTagStack());
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), decodeJsonElement.toString());
    }

    private final java.lang.Void getHighSpeedVideoFpsRangesFor(kotlinx.serialization.json.JsonPrimitive p0, java.lang.String p1, java.lang.String p2) {
        kotlinx.serialization.json.JsonElement getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = kotlin.text.StringsKt.startsWith$default(p1, "i", false, 2, (java.lang.Object) null) ? new java.lang.StringBuilder("an ") : new java.lang.StringBuilder("a ");
        sb.append(p1);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to parse literal '");
        sb2.append(p0);
        sb2.append("' as ");
        sb2.append(obj);
        sb2.append(" value at element: ");
        sb2.append(getInputFormats(p2));
        java.lang.String obj2 = sb2.toString();
        java.lang.String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null || (getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(currentTagOrNull)) == null) {
            getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, obj2, getHighSpeedVideoSizes.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.Decoder decodeInline(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return getCurrentTagOrNull() != null ? super.decodeInline(p0) : new kotlinx.serialization.json.internal.JsonPrimitiveDecoder(getGetHighSpeedVideoFpsRanges(), getGetHighSpeedVideoSizes(), this.Camera2StreamConfigurationMap).decodeInline(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public boolean decodeTaggedBoolean(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges;
            try {
                java.lang.Boolean booleanOrNull = kotlinx.serialization.json.JsonElementKt.getBooleanOrNull(jsonPrimitive);
                if (booleanOrNull == null) {
                    getHighSpeedVideoFpsRangesFor(jsonPrimitive, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN, p0);
                    throw new kotlin.KotlinNothingValueException();
                }
                return booleanOrNull.booleanValue();
            } catch (java.lang.IllegalArgumentException unused) {
                getHighSpeedVideoFpsRangesFor(jsonPrimitive, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN, p0);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb.append(" as the serialized body of boolean at element: ");
        sb.append(getInputFormats(p0));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public byte decodeTaggedByte(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges;
            try {
                long parseLongImpl = kotlinx.serialization.json.JsonElementKt.parseLongImpl(jsonPrimitive);
                java.lang.Byte valueOf = (-128 > parseLongImpl || parseLongImpl > 127) ? null : java.lang.Byte.valueOf((byte) parseLongImpl);
                if (valueOf == null) {
                    getHighSpeedVideoFpsRangesFor(jsonPrimitive, "byte", p0);
                    throw new kotlin.KotlinNothingValueException();
                }
                return valueOf.byteValue();
            } catch (java.lang.IllegalArgumentException unused) {
                getHighSpeedVideoFpsRangesFor(jsonPrimitive, "byte", p0);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb.append(" as the serialized body of byte at element: ");
        sb.append(getInputFormats(p0));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: getHighSpeedVideoSizesFor, reason: merged with bridge method [inline-methods] */
    public short decodeTaggedShort(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges;
            try {
                long parseLongImpl = kotlinx.serialization.json.JsonElementKt.parseLongImpl(jsonPrimitive);
                java.lang.Short valueOf = (-32768 > parseLongImpl || parseLongImpl > 32767) ? null : java.lang.Short.valueOf((short) parseLongImpl);
                if (valueOf == null) {
                    getHighSpeedVideoFpsRangesFor(jsonPrimitive, "short", p0);
                    throw new kotlin.KotlinNothingValueException();
                }
                return valueOf.shortValue();
            } catch (java.lang.IllegalArgumentException unused) {
                getHighSpeedVideoFpsRangesFor(jsonPrimitive, "short", p0);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb.append(" as the serialized body of short at element: ");
        sb.append(getInputFormats(p0));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: getOutputMinFrameDuration, reason: merged with bridge method [inline-methods] */
    public int decodeTaggedInt(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges;
            try {
                long parseLongImpl = kotlinx.serialization.json.JsonElementKt.parseLongImpl(jsonPrimitive);
                java.lang.Integer valueOf = (androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask > parseLongImpl || parseLongImpl > androidx.collection.SieveCacheKt.NodeLinkMask) ? null : java.lang.Integer.valueOf((int) parseLongImpl);
                if (valueOf == null) {
                    getHighSpeedVideoFpsRangesFor(jsonPrimitive, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT, p0);
                    throw new kotlin.KotlinNothingValueException();
                }
                return valueOf.intValue();
            } catch (java.lang.IllegalArgumentException unused) {
                getHighSpeedVideoFpsRangesFor(jsonPrimitive, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT, p0);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb.append(" as the serialized body of int at element: ");
        sb.append(getInputFormats(p0));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: getInputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public long decodeTaggedLong(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges;
            try {
                return kotlinx.serialization.json.JsonElementKt.parseLongImpl(jsonPrimitive);
            } catch (java.lang.IllegalArgumentException unused) {
                getHighSpeedVideoFpsRangesFor(jsonPrimitive, com.adjust.sdk.Constants.LONG, p0);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb.append(" as the serialized body of long at element: ");
        sb.append(getInputFormats(p0));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: getOutputFormats, reason: merged with bridge method [inline-methods] */
    public float decodeTaggedFloat(java.lang.String p0) {
        kotlinx.serialization.json.JsonElement getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges;
            try {
                float f = kotlinx.serialization.json.JsonElementKt.getFloat(jsonPrimitive);
                if (getGetHighSpeedVideoFpsRanges().getConfiguration().getAllowSpecialFloatingPointValues() || java.lang.Math.abs(f) <= Float.MAX_VALUE) {
                    return f;
                }
                java.lang.Float valueOf = java.lang.Float.valueOf(f);
                java.lang.String currentTagOrNull = getCurrentTagOrNull();
                if (currentTagOrNull == null || (getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(currentTagOrNull)) == null) {
                    getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
                }
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointDecoded(valueOf, p0, getHighSpeedVideoSizes.toString());
            } catch (java.lang.IllegalArgumentException unused) {
                getHighSpeedVideoFpsRangesFor(jsonPrimitive, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT, p0);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb.append(" as the serialized body of float at element: ");
        sb.append(getInputFormats(p0));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public double decodeTaggedDouble(java.lang.String p0) {
        kotlinx.serialization.json.JsonElement getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges;
            try {
                double d = kotlinx.serialization.json.JsonElementKt.getDouble(jsonPrimitive);
                if (getGetHighSpeedVideoFpsRanges().getConfiguration().getAllowSpecialFloatingPointValues() || java.lang.Math.abs(d) <= Double.MAX_VALUE) {
                    return d;
                }
                java.lang.Double valueOf = java.lang.Double.valueOf(d);
                java.lang.String currentTagOrNull = getCurrentTagOrNull();
                if (currentTagOrNull == null || (getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(currentTagOrNull)) == null) {
                    getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
                }
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointDecoded(valueOf, p0, getHighSpeedVideoSizes.toString());
            } catch (java.lang.IllegalArgumentException unused) {
                getHighSpeedVideoFpsRangesFor(jsonPrimitive, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE, p0);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb.append(" as the serialized body of double at element: ");
        sb.append(getInputFormats(p0));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public char decodeTaggedChar(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        if (highSpeedVideoFpsRanges instanceof kotlinx.serialization.json.JsonPrimitive) {
            kotlinx.serialization.json.JsonPrimitive jsonPrimitive = (kotlinx.serialization.json.JsonPrimitive) highSpeedVideoFpsRanges;
            try {
                return kotlin.text.StringsKt.single(jsonPrimitive.getContent());
            } catch (java.lang.IllegalArgumentException unused) {
                getHighSpeedVideoFpsRangesFor(jsonPrimitive, "char", p0);
                throw new kotlin.KotlinNothingValueException();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonPrimitive.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(highSpeedVideoFpsRanges.getClass()).getSimpleName());
        sb.append(" as the serialized body of char at element: ");
        sb.append(getInputFormats(p0));
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), highSpeedVideoFpsRanges.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlinx.serialization.json.JsonElement getHighSpeedVideoSizes;
        kotlinx.serialization.encoding.CompositeDecoder jsonTreeMapDecoder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.lang.String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null || (getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(currentTagOrNull)) == null) {
            getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        }
        kotlinx.serialization.descriptors.SerialKind kind = p0.getKind();
        if (kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE) || (kind instanceof kotlinx.serialization.descriptors.PolymorphicKind)) {
            kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges = getGetHighSpeedVideoFpsRanges();
            java.lang.String getHighSpeedVideoSizes2 = p0.getGetHighSpeedVideoSizes();
            if (getHighSpeedVideoSizes instanceof kotlinx.serialization.json.JsonArray) {
                return new kotlinx.serialization.json.internal.JsonTreeListDecoder(getHighSpeedVideoFpsRanges, (kotlinx.serialization.json.JsonArray) getHighSpeedVideoSizes);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonArray.class).getSimpleName());
            sb.append(", but had ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getHighSpeedVideoSizes.getClass()).getSimpleName());
            sb.append(" as the serialized body of ");
            sb.append(getHighSpeedVideoSizes2);
            sb.append(" at element: ");
            sb.append(renderTagStack());
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), getHighSpeedVideoSizes.toString());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.MAP.INSTANCE)) {
            kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges2 = getGetHighSpeedVideoFpsRanges();
            java.lang.String getHighSpeedVideoSizes3 = p0.getGetHighSpeedVideoSizes();
            if (getHighSpeedVideoSizes instanceof kotlinx.serialization.json.JsonObject) {
                return new kotlinx.serialization.json.internal.JsonTreeDecoder(getHighSpeedVideoFpsRanges2, (kotlinx.serialization.json.JsonObject) getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null, 8, null);
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected ");
            sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getHighSpeedVideoSizes.getClass()).getSimpleName());
            sb2.append(" as the serialized body of ");
            sb2.append(getHighSpeedVideoSizes3);
            sb2.append(" at element: ");
            sb2.append(renderTagStack());
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), getHighSpeedVideoSizes.toString());
        }
        kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges3 = getGetHighSpeedVideoFpsRanges();
        kotlinx.serialization.descriptors.SerialDescriptor carrierDescriptor = kotlinx.serialization.json.internal.WriteModeKt.carrierDescriptor(p0.getElementDescriptor(0), getHighSpeedVideoFpsRanges3.getSerializersModule());
        kotlinx.serialization.descriptors.SerialKind kind2 = carrierDescriptor.getKind();
        if ((kind2 instanceof kotlinx.serialization.descriptors.PrimitiveKind) || kotlin.jvm.internal.Intrinsics.areEqual(kind2, kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE)) {
            kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges4 = getGetHighSpeedVideoFpsRanges();
            java.lang.String getHighSpeedVideoSizes4 = p0.getGetHighSpeedVideoSizes();
            if (getHighSpeedVideoSizes instanceof kotlinx.serialization.json.JsonObject) {
                jsonTreeMapDecoder = new kotlinx.serialization.json.internal.JsonTreeMapDecoder(getHighSpeedVideoFpsRanges4, (kotlinx.serialization.json.JsonObject) getHighSpeedVideoSizes);
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected ");
                sb3.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName());
                sb3.append(", but had ");
                sb3.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getHighSpeedVideoSizes.getClass()).getSimpleName());
                sb3.append(" as the serialized body of ");
                sb3.append(getHighSpeedVideoSizes4);
                sb3.append(" at element: ");
                sb3.append(renderTagStack());
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb3.toString(), getHighSpeedVideoSizes.toString());
            }
        } else if (getHighSpeedVideoFpsRanges3.getConfiguration().getAllowStructuredMapKeys()) {
            kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges5 = getGetHighSpeedVideoFpsRanges();
            java.lang.String getHighSpeedVideoSizes5 = p0.getGetHighSpeedVideoSizes();
            if (getHighSpeedVideoSizes instanceof kotlinx.serialization.json.JsonArray) {
                jsonTreeMapDecoder = new kotlinx.serialization.json.internal.JsonTreeListDecoder(getHighSpeedVideoFpsRanges5, (kotlinx.serialization.json.JsonArray) getHighSpeedVideoSizes);
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Expected ");
                sb4.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonArray.class).getSimpleName());
                sb4.append(", but had ");
                sb4.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getHighSpeedVideoSizes.getClass()).getSimpleName());
                sb4.append(" as the serialized body of ");
                sb4.append(getHighSpeedVideoSizes5);
                sb4.append(" at element: ");
                sb4.append(renderTagStack());
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb4.toString(), getHighSpeedVideoSizes.toString());
            }
        } else {
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
        }
        return jsonTreeMapDecoder;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public kotlinx.serialization.json.JsonElement decodeJsonElement() {
        kotlinx.serialization.json.JsonElement highSpeedVideoFpsRanges;
        java.lang.String currentTagOrNull = getCurrentTagOrNull();
        return (currentTagOrNull == null || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(currentTagOrNull)) == null) ? getGetHighSpeedVideoSizes() : highSpeedVideoFpsRanges;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        kotlinx.serialization.json.JsonElement getHighSpeedVideoSizes;
        java.lang.String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null || (getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(currentTagOrNull)) == null) {
            getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        }
        return !(getHighSpeedVideoSizes instanceof kotlinx.serialization.json.JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public java.lang.String composeName(java.lang.String p0, java.lang.String p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        return p1;
    }

    public /* synthetic */ AbstractJsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, str);
    }
}
