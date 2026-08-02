package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001dB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J=\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\u0010&\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001eH\u0016¢\u0006\u0004\b+\u0010 J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ2\u0010H\u001a\u00020\u001b2!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110@¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(F\u0012\u0004\u0012\u00020\u001b0CH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020J2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020$2\u0006\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010UR\u001a\u0010W\u001a\u00020V8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010[\u001a\u00020`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010aR\u0016\u0010R\u001a\u0004\u0018\u00010b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b_\u0010c"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/ChunkedDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "discriminatorHolder", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;)V", "Lkotlinx/serialization/json/JsonElement;", "decodeJsonElement", "()Lkotlinx/serialization/json/JsonElement;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "decodeNotNullMark", "()Z", "", "decodeNull", "()Ljava/lang/Void;", "", "index", "previousValue", "decodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "decodeBoolean", "", "decodeByte", "()B", "", "decodeShort", "()S", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeFloat", "()F", "", "decodeDouble", "()D", "", "decodeChar", "()C", "", "decodeString", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "chunk", "consumeChunk", "decodeStringChunked", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/serialization/encoding/Decoder;", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "enumDescriptor", "decodeEnum", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/internal/WriteMode;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "DiscriminatorHolder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class StreamingJsonDecoder extends kotlinx.serialization.encoding.AbstractDecoder implements kotlinx.serialization.json.JsonDecoder, kotlinx.serialization.encoding.ChunkedDecoder {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.serialization.json.internal.StreamingJsonDecoder.DiscriminatorHolder getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.serialization.json.JsonConfiguration getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.json.internal.JsonElementMarker getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.json.internal.WriteMode getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.serialization.json.Json json;
    public final kotlinx.serialization.json.internal.AbstractJsonLexer lexer;
    private final kotlinx.serialization.modules.SerializersModule serializersModule;

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public java.lang.Void decodeNull() {
        return null;
    }

    public StreamingJsonDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.WriteMode writeMode, kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.internal.StreamingJsonDecoder.DiscriminatorHolder discriminatorHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractJsonLexer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        this.json = json;
        this.getHighResolutionOutputSizeshNQ4ISI = writeMode;
        this.lexer = abstractJsonLexer;
        this.serializersModule = json.getSerializersModule();
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoFpsRangesFor = discriminatorHolder;
        kotlinx.serialization.json.JsonConfiguration configuration = json.getConfiguration();
        this.getHighSpeedVideoFpsRanges = configuration;
        this.getHighSpeedVideoSizes = configuration.getExplicitNulls() ? null : new kotlinx.serialization.json.internal.JsonElementMarker(serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    /* renamed from: getJson, reason: from getter */
    public final kotlinx.serialization.json.Json getGetHighSpeedVideoFpsRanges() {
        return this.json;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "", "", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DiscriminatorHolder {
        public java.lang.String discriminatorToSkip;

        public DiscriminatorHolder(java.lang.String str) {
            this.discriminatorToSkip = str;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public kotlinx.serialization.json.JsonElement decodeJsonElement() {
        return new kotlinx.serialization.json.internal.JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
        java.lang.String message;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        try {
        } catch (kotlinx.serialization.MissingFieldException e) {
            message = e.getMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNull(message);
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "at path", false, 2, (java.lang.Object) null)) {
            }
        }
        if ((deserializer instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer) && !this.json.getConfiguration().getUseArrayPolymorphism()) {
            java.lang.String classDiscriminator = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer).getDescriptor(), this.json);
            java.lang.String peekLeadingMatchingValue = this.lexer.peekLeadingMatchingValue(classDiscriminator, this.getHighSpeedVideoFpsRanges.getIsLenient());
            if (peekLeadingMatchingValue == null) {
                kotlinx.serialization.json.internal.StreamingJsonDecoder streamingJsonDecoder = this;
                if ((deserializer instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer) && !streamingJsonDecoder.getGetHighSpeedVideoFpsRanges().getConfiguration().getUseArrayPolymorphism()) {
                    java.lang.String classDiscriminator2 = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer).getDescriptor(), streamingJsonDecoder.getGetHighSpeedVideoFpsRanges());
                    kotlinx.serialization.json.JsonElement decodeJsonElement = streamingJsonDecoder.decodeJsonElement();
                    java.lang.String getHighSpeedVideoSizes = ((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer).getDescriptor().getGetHighSpeedVideoSizes();
                    if (decodeJsonElement instanceof kotlinx.serialization.json.JsonObject) {
                        kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) decodeJsonElement;
                        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) classDiscriminator2);
                        try {
                            kotlinx.serialization.DeserializationStrategy findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer, streamingJsonDecoder, (jsonElement == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive));
                            kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer, "");
                            return (T) kotlinx.serialization.json.internal.TreeJsonDecoderKt.readPolymorphicJson(streamingJsonDecoder.getGetHighSpeedVideoFpsRanges(), classDiscriminator2, jsonObject, findPolymorphicSerializer);
                        } catch (kotlinx.serialization.SerializationException e2) {
                            java.lang.String message2 = e2.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(message2);
                            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, message2, jsonObject.toString());
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
                    sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName());
                    sb.append(", but had ");
                    sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()).getSimpleName());
                    sb.append(" as the serialized body of ");
                    sb.append(getHighSpeedVideoSizes);
                    sb.append(" at element: ");
                    sb.append(this.lexer.path.getPath());
                    throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), decodeJsonElement.toString());
                }
                return deserializer.deserialize(streamingJsonDecoder);
            }
            try {
                kotlinx.serialization.DeserializationStrategy findPolymorphicSerializer2 = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer, this, peekLeadingMatchingValue);
                kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer2, "");
                this.getHighSpeedVideoFpsRangesFor = new kotlinx.serialization.json.internal.StreamingJsonDecoder.DiscriminatorHolder(classDiscriminator);
                return (T) findPolymorphicSerializer2.deserialize(this);
            } catch (kotlinx.serialization.SerializationException e3) {
                java.lang.String message3 = e3.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNull(message3);
                java.lang.String removeSuffix = kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.substringBefore$default(message3, '\n', (java.lang.String) null, 2, (java.lang.Object) null), (java.lang.CharSequence) ".");
                java.lang.String message4 = e3.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNull(message4);
                kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, removeSuffix, 0, kotlin.text.StringsKt.substringAfter(message4, '\n', ""), 2, null);
                throw new kotlin.KotlinNothingValueException();
            }
            message = e.getMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNull(message);
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "at path", false, 2, (java.lang.Object) null)) {
                throw e;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(e.getMessage());
            sb2.append(" at path: ");
            sb2.append(this.lexer.path.getPath());
            throw kotlinx.serialization.internal.JsonInternalDependenciesKt.missingFieldExceptionWithNewMessage(e, sb2.toString());
        }
        return deserializer.deserialize(this);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlinx.serialization.json.internal.WriteMode switchMode = kotlinx.serialization.json.internal.WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(switchMode.begin);
        if (this.lexer.peekNextToken() != 4) {
            int i = kotlinx.serialization.json.internal.StreamingJsonDecoder.WhenMappings.$EnumSwitchMapping$0[switchMode.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return new kotlinx.serialization.json.internal.StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.getHighSpeedVideoFpsRangesFor);
            }
            return (this.getHighResolutionOutputSizeshNQ4ISI == switchMode && this.json.getConfiguration().getExplicitNulls()) ? this : new kotlinx.serialization.json.internal.StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.getHighSpeedVideoFpsRangesFor);
        }
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (descriptor.getElementsCount() == 0 && kotlinx.serialization.json.internal.JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json)) {
            while (decodeElementIndex(descriptor) != -1) {
            }
        }
        if (this.lexer.tryConsumeComma() && !this.json.getConfiguration().getAllowTrailingComma()) {
            kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma(this.lexer, "");
            throw new kotlin.KotlinNothingValueException();
        }
        this.lexer.consumeNextToken(this.getHighResolutionOutputSizeshNQ4ISI.end);
        this.lexer.path.popDescriptor();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        kotlinx.serialization.json.internal.JsonElementMarker jsonElementMarker = this.getHighSpeedVideoSizes;
        return (jsonElementMarker == null || !jsonElementMarker.getIsUnmarkedNull()) && !kotlinx.serialization.json.internal.AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, null);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI == kotlinx.serialization.json.internal.WriteMode.MAP && (index & 1) == 0;
        if (z) {
            this.lexer.path.resetCurrentMapKey();
        }
        T t = (T) super.decodeSerializableElement(descriptor, index, deserializer, previousValue);
        if (z) {
            this.lexer.path.updateCurrentMapKey(t);
        }
        return t;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        java.lang.String consumeKeyString;
        boolean z;
        boolean z2;
        java.lang.String peekString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        int i = kotlinx.serialization.json.internal.StreamingJsonDecoder.WhenMappings.$EnumSwitchMapping$0[this.getHighResolutionOutputSizeshNQ4ISI.ordinal()];
        int i2 = -1;
        boolean z3 = false;
        if (i == 2) {
            int i3 = this.Camera2StreamConfigurationMap;
            boolean z4 = i3 % 2 != 0;
            if (!z4) {
                this.lexer.consumeNextToken(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            } else if (i3 != -1) {
                z3 = this.lexer.tryConsumeComma();
            }
            if (this.lexer.canConsumeValue()) {
                if (z4) {
                    if (this.Camera2StreamConfigurationMap != -1) {
                        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
                        int i4 = abstractJsonLexer.currentPosition;
                        if (!z3) {
                            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected comma after the key-value pair", i4, null, 4, null);
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else {
                        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                        int i5 = abstractJsonLexer2.currentPosition;
                        if (z3) {
                            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer2, "Unexpected leading comma", i5, null, 4, null);
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }
                }
                i2 = this.Camera2StreamConfigurationMap + 1;
                this.Camera2StreamConfigurationMap = i2;
            } else if (z3 && !this.json.getConfiguration().getAllowTrailingComma()) {
                kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                throw new kotlin.KotlinNothingValueException();
            }
        } else if (i != 4) {
            boolean tryConsumeComma = this.lexer.tryConsumeComma();
            if (this.lexer.canConsumeValue()) {
                int i6 = this.Camera2StreamConfigurationMap;
                if (i6 != -1 && !tryConsumeComma) {
                    kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
                    throw new kotlin.KotlinNothingValueException();
                }
                i2 = i6 + 1;
                this.Camera2StreamConfigurationMap = i2;
            } else if (tryConsumeComma && !this.json.getConfiguration().getAllowTrailingComma()) {
                kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
                throw new kotlin.KotlinNothingValueException();
            }
        } else {
            boolean tryConsumeComma2 = this.lexer.tryConsumeComma();
            while (this.lexer.canConsumeValue()) {
                if (this.getHighSpeedVideoFpsRanges.getIsLenient()) {
                    consumeKeyString = this.lexer.consumeStringLenientNotNull();
                } else {
                    consumeKeyString = this.lexer.consumeKeyString();
                }
                this.lexer.consumeNextToken(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                int jsonNameIndex = kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndex(descriptor, this.json, consumeKeyString);
                if (jsonNameIndex != -3) {
                    if (this.getHighSpeedVideoFpsRanges.getCoerceInputValues()) {
                        kotlinx.serialization.json.Json json = this.json;
                        boolean isElementOptional = descriptor.isElementOptional(jsonNameIndex);
                        kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(jsonNameIndex);
                        if (!isElementOptional || elementDescriptor.isNullable() || !this.lexer.tryConsumeNull(true)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(elementDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) && ((!elementDescriptor.isNullable() || !this.lexer.tryConsumeNull(false)) && (peekString = this.lexer.peekString(this.getHighSpeedVideoFpsRanges.getIsLenient())) != null)) {
                                int jsonNameIndex2 = kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, peekString);
                                boolean z5 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
                                if (jsonNameIndex2 == -3 && (isElementOptional || z5)) {
                                    this.lexer.consumeString();
                                }
                            }
                        }
                        z = this.lexer.tryConsumeComma();
                        z2 = false;
                    }
                    kotlinx.serialization.json.internal.JsonElementMarker jsonElementMarker = this.getHighSpeedVideoSizes;
                    if (jsonElementMarker != null) {
                        jsonElementMarker.mark$kotlinx_serialization_json(jsonNameIndex);
                    }
                    i2 = jsonNameIndex;
                } else {
                    z = false;
                    z2 = true;
                }
                if (z2) {
                    if (!kotlinx.serialization.json.internal.JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json)) {
                        kotlinx.serialization.json.internal.StreamingJsonDecoder.DiscriminatorHolder discriminatorHolder = this.getHighSpeedVideoFpsRangesFor;
                        if (discriminatorHolder == null || !kotlin.jvm.internal.Intrinsics.areEqual(discriminatorHolder.discriminatorToSkip, consumeKeyString)) {
                            this.lexer.path.popDescriptor();
                            this.lexer.failOnUnknownKey(consumeKeyString);
                            tryConsumeComma2 = this.lexer.tryConsumeComma();
                        } else {
                            discriminatorHolder.discriminatorToSkip = null;
                        }
                    }
                    this.lexer.skipElement(this.getHighSpeedVideoFpsRanges.getIsLenient());
                    tryConsumeComma2 = this.lexer.tryConsumeComma();
                } else {
                    tryConsumeComma2 = z;
                }
            }
            if (tryConsumeComma2 && !this.json.getConfiguration().getAllowTrailingComma()) {
                kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                throw new kotlin.KotlinNothingValueException();
            }
            kotlinx.serialization.json.internal.JsonElementMarker jsonElementMarker2 = this.getHighSpeedVideoSizes;
            if (jsonElementMarker2 != null) {
                i2 = jsonElementMarker2.nextUnmarkedIndex$kotlinx_serialization_json();
            }
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != kotlinx.serialization.json.internal.WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(i2);
        }
        return i2;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return this.lexer.consumeBooleanLenient();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b = (byte) consumeNumericLiteral;
        if (consumeNumericLiteral == b) {
            return b;
        }
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse byte for input '");
        sb.append(consumeNumericLiteral);
        sb.append('\'');
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s = (short) consumeNumericLiteral;
        if (consumeNumericLiteral == s) {
            return s;
        }
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse short for input '");
        sb.append(consumeNumericLiteral);
        sb.append('\'');
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i = (int) consumeNumericLiteral;
        if (consumeNumericLiteral == i) {
            return i;
        }
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse int for input '");
        sb.append(consumeNumericLiteral);
        sb.append('\'');
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            float parseFloat = java.lang.Float.parseFloat(consumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues() || java.lang.Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            kotlinx.serialization.json.internal.JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, java.lang.Float.valueOf(parseFloat));
            throw new kotlin.KotlinNothingValueException();
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse type 'float' for input '");
            sb.append(consumeStringLenient);
            sb.append('\'');
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
        java.lang.String consumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            double parseDouble = java.lang.Double.parseDouble(consumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues() || java.lang.Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            kotlinx.serialization.json.internal.JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, java.lang.Double.valueOf(parseDouble));
            throw new kotlin.KotlinNothingValueException();
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse type 'double' for input '");
            sb.append(consumeStringLenient);
            sb.append('\'');
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        java.lang.String consumeStringLenient = this.lexer.consumeStringLenient();
        if (consumeStringLenient.length() != 1) {
            kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected single char, but got '");
            sb.append(consumeStringLenient);
            sb.append('\'');
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, sb.toString(), 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        return consumeStringLenient.charAt(0);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public java.lang.String decodeString() {
        if (this.getHighSpeedVideoFpsRanges.getIsLenient()) {
            return this.lexer.consumeStringLenientNotNull();
        }
        return this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.ChunkedDecoder
    public void decodeStringChunked(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> consumeChunk) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumeChunk, "");
        this.lexer.consumeStringChunked(this.getHighSpeedVideoFpsRanges.getIsLenient(), consumeChunk);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.Decoder decodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnsignedNumber(descriptor) ? new kotlinx.serialization.json.internal.JsonDecoderForUnsignedTypes(this.lexer, this.json) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "");
        kotlinx.serialization.json.Json json = this.json;
        java.lang.String decodeString = decodeString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" at path ");
        sb.append(this.lexer.path.getPath());
        return kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, json, decodeString, sb.toString());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.serialization.json.internal.WriteMode.values().length];
            try {
                iArr[kotlinx.serialization.json.internal.WriteMode.LIST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.serialization.json.internal.WriteMode.MAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.serialization.json.internal.WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlinx.serialization.json.internal.WriteMode.OBJ.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
