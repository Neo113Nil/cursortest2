package kotlinx.serialization.json.internal;

/* compiled from: StreamingJsonDecoder.kt */
@kotlin.Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001UB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020!H\u0016J!\u0010\"\u001a\u0002H#\"\u0004\b\u0000\u0010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0%H\u0016¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010,\u001a\u00020\u0013H\u0016J\n\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020*H\u0002J;\u00100\u001a\u0002H#\"\u0004\b\u0000\u0010#2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0%2\b\u00102\u001a\u0004\u0018\u0001H#H\u0016¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u00105\u001a\u00020\u001bH\u0002J\u0018\u00106\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u001bH\u0002J\u0010\u00107\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u00108\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0015H\u0002J\b\u0010:\u001a\u00020\u001bH\u0002J\b\u0010;\u001a\u00020\u0013H\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020\u001bH\u0016J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020\u0015H\u0002J\b\u0010J\u001a\u00020\u0015H\u0016J+\u0010K\u001a\u00020*2!\u0010L\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020*0MH\u0016J\u0010\u0010Q\u001a\u00020R2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010S\u001a\u00020\u001b2\u0006\u0010T\u001a\u00020\u000bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/ChunkedDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "json", "Lkotlinx/serialization/json/Json;", com.ironsource.X3.a.t, "Lkotlinx/serialization/json/internal/WriteMode;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "discriminatorHolder", "Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "trySkip", "", "unknownKey", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "currentIndex", "", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "elementMarker", "Lkotlinx/serialization/json/internal/JsonElementMarker;", "decodeJsonElement", "Lkotlinx/serialization/json/JsonElement;", "decodeSerializableValue", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "endStructure", "", "skipLeftoverElements", "decodeNotNullMark", "decodeNull", "", "checkLeadingComma", "decodeSerializableElement", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "previousValue", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeElementIndex", "decodeMapIndex", "coerceInputValue", "decodeObjectIndex", "handleUnknown", com.ironsource.X3.i.W, "decodeListIndex", "decodeBoolean", "decodeByte", "", "decodeShort", "", "decodeInt", "decodeLong", "", "decodeFloat", "", "decodeDouble", "", "decodeChar", "", "decodeStringKey", "decodeString", "decodeStringChunked", "consumeChunk", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "chunk", "decodeInline", "Lkotlinx/serialization/encoding/Decoder;", "decodeEnum", "enumDescriptor", "DiscriminatorHolder", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class StreamingJsonDecoder extends kotlinx.serialization.encoding.AbstractDecoder implements kotlinx.serialization.json.JsonDecoder, kotlinx.serialization.encoding.ChunkedDecoder {
    private final kotlinx.serialization.json.JsonConfiguration configuration;
    private int currentIndex;
    private kotlinx.serialization.json.internal.StreamingJsonDecoder.DiscriminatorHolder discriminatorHolder;
    private final kotlinx.serialization.json.internal.JsonElementMarker elementMarker;
    private final kotlinx.serialization.json.Json json;
    public final kotlinx.serialization.json.internal.AbstractJsonLexer lexer;
    private final kotlinx.serialization.json.internal.WriteMode mode;
    private final kotlinx.serialization.modules.SerializersModule serializersModule;

    /* compiled from: StreamingJsonDecoder.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public java.lang.Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final kotlinx.serialization.json.Json getJson() {
        return this.json;
    }

    public StreamingJsonDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.WriteMode mode, kotlinx.serialization.json.internal.AbstractJsonLexer lexer, kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlinx.serialization.json.internal.StreamingJsonDecoder.DiscriminatorHolder discriminatorHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lexer, "lexer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = discriminatorHolder;
        kotlinx.serialization.json.JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new kotlinx.serialization.json.internal.JsonElementMarker(descriptor);
    }

    /* compiled from: StreamingJsonDecoder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonDecoder$DiscriminatorHolder;", "", "discriminatorToSkip", "", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DiscriminatorHolder {
        public java.lang.String discriminatorToSkip;

        public DiscriminatorHolder(java.lang.String str) {
            this.discriminatorToSkip = str;
        }
    }

    private final boolean trySkip(kotlinx.serialization.json.internal.StreamingJsonDecoder.DiscriminatorHolder discriminatorHolder, java.lang.String str) {
        if (discriminatorHolder == null || !kotlin.jvm.internal.Intrinsics.areEqual(discriminatorHolder.discriminatorToSkip, str)) {
            return false;
        }
        discriminatorHolder.discriminatorToSkip = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public kotlinx.serialization.json.JsonElement decodeJsonElement() {
        return new kotlinx.serialization.json.internal.JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170  */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer) {
        java.lang.String message;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
        } catch (kotlinx.serialization.MissingFieldException e) {
            message = e.getMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNull(message);
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "at path", false, 2, (java.lang.Object) null)) {
            }
        }
        if ((deserializer instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer) && !this.json.getConfiguration().getUseArrayPolymorphism()) {
            java.lang.String classDiscriminator = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer).getDescriptor(), this.json);
            java.lang.String peekLeadingMatchingValue = this.lexer.peekLeadingMatchingValue(classDiscriminator, this.configuration.getIsLenient());
            if (peekLeadingMatchingValue == null) {
                kotlinx.serialization.json.internal.StreamingJsonDecoder streamingJsonDecoder = this;
                if ((deserializer instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer) && !streamingJsonDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
                    java.lang.String classDiscriminator2 = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer).getDescriptor(), streamingJsonDecoder.getJson());
                    kotlinx.serialization.json.JsonElement decodeJsonElement = streamingJsonDecoder.decodeJsonElement();
                    java.lang.String serialName = ((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer).getDescriptor().getSerialName();
                    if (decodeJsonElement instanceof kotlinx.serialization.json.JsonObject) {
                        kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) decodeJsonElement;
                        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) classDiscriminator2);
                        try {
                            kotlinx.serialization.DeserializationStrategy findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer, streamingJsonDecoder, (jsonElement == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive));
                            kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                            return (T) kotlinx.serialization.json.internal.TreeJsonDecoderKt.readPolymorphicJson(streamingJsonDecoder.getJson(), classDiscriminator2, jsonObject, findPolymorphicSerializer);
                        } catch (kotlinx.serialization.SerializationException e2) {
                            java.lang.String message2 = e2.getMessage();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(message2);
                            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, message2, jsonObject.toString());
                        }
                    }
                    throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + this.lexer.path.getPath(), decodeJsonElement.toString());
                }
                return deserializer.deserialize(streamingJsonDecoder);
            }
            try {
                kotlinx.serialization.DeserializationStrategy findPolymorphicSerializer2 = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer, this, peekLeadingMatchingValue);
                kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                this.discriminatorHolder = new kotlinx.serialization.json.internal.StreamingJsonDecoder.DiscriminatorHolder(classDiscriminator);
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
            throw new kotlinx.serialization.MissingFieldException(e.getMissingFields(), e.getMessage() + " at path: " + this.lexer.path.getPath(), e);
        }
        return deserializer.deserialize(this);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.internal.WriteMode switchMode = kotlinx.serialization.json.internal.WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(switchMode.begin);
        checkLeadingComma();
        int i = kotlinx.serialization.json.internal.StreamingJsonDecoder.WhenMappings.$EnumSwitchMapping$0[switchMode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new kotlinx.serialization.json.internal.StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.discriminatorHolder);
        }
        return (this.mode == switchMode && this.json.getConfiguration().getExplicitNulls()) ? this : new kotlinx.serialization.json.internal.StreamingJsonDecoder(this.json, switchMode, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor.getElementsCount() == 0 && kotlinx.serialization.json.internal.JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json)) {
            skipLeftoverElements(descriptor);
        }
        if (this.lexer.tryConsumeComma() && !this.json.getConfiguration().getAllowTrailingComma()) {
            kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma(this.lexer, "");
            throw new kotlin.KotlinNothingValueException();
        }
        this.lexer.consumeNextToken(this.mode.end);
        this.lexer.path.popDescriptor();
    }

    private final void skipLeftoverElements(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        while (decodeElementIndex(descriptor) != -1) {
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        kotlinx.serialization.json.internal.JsonElementMarker jsonElementMarker = this.elementMarker;
        return (jsonElementMarker == null || !jsonElementMarker.getIsUnmarkedNull()) && !kotlinx.serialization.json.internal.AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, null);
    }

    private final void checkLeadingComma() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, T previousValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z = this.mode == kotlinx.serialization.json.internal.WriteMode.MAP && (index & 1) == 0;
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
        int decodeMapIndex;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = kotlinx.serialization.json.internal.StreamingJsonDecoder.WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i == 2) {
            decodeMapIndex = decodeMapIndex();
        } else if (i == 4) {
            decodeMapIndex = decodeObjectIndex(descriptor);
        } else {
            decodeMapIndex = decodeListIndex();
        }
        if (this.mode != kotlinx.serialization.json.internal.WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(decodeMapIndex);
        }
        return decodeMapIndex;
    }

    private final int decodeMapIndex() {
        int i = this.currentIndex;
        boolean z = false;
        boolean z2 = i % 2 != 0;
        if (!z2) {
            this.lexer.consumeNextToken(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        } else if (i != -1) {
            z = this.lexer.tryConsumeComma();
        }
        if (this.lexer.canConsumeValue()) {
            if (z2) {
                if (this.currentIndex != -1) {
                    kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer = this.lexer;
                    int i2 = abstractJsonLexer.currentPosition;
                    if (!z) {
                        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected comma after the key-value pair", i2, null, 4, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                } else {
                    kotlinx.serialization.json.internal.AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                    boolean z3 = !z;
                    int i3 = abstractJsonLexer2.currentPosition;
                    if (!z3) {
                        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer2, "Unexpected leading comma", i3, null, 4, null);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            }
            int i4 = this.currentIndex + 1;
            this.currentIndex = i4;
            return i4;
        }
        if (!z || this.json.getConfiguration().getAllowTrailingComma()) {
            return -1;
        }
        kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
        throw new kotlin.KotlinNothingValueException();
    }

    private final boolean coerceInputValue(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        java.lang.String peekString;
        kotlinx.serialization.json.Json json = this.json;
        boolean isElementOptional = descriptor.isElementOptional(index);
        kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
        if (isElementOptional && !elementDescriptor.isNullable() && this.lexer.tryConsumeNull(true)) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(elementDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) && ((!elementDescriptor.isNullable() || !this.lexer.tryConsumeNull(false)) && (peekString = this.lexer.peekString(this.configuration.getIsLenient())) != null)) {
            int jsonNameIndex = kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, peekString);
            boolean z = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
            if (jsonNameIndex == -3 && (isElementOptional || z)) {
                this.lexer.consumeString();
                return true;
            }
        }
        return false;
    }

    private final int decodeObjectIndex(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        int jsonNameIndex;
        boolean z;
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        while (true) {
            boolean z2 = true;
            if (this.lexer.canConsumeValue()) {
                java.lang.String decodeStringKey = decodeStringKey();
                this.lexer.consumeNextToken(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                jsonNameIndex = kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndex(descriptor, this.json, decodeStringKey);
                if (jsonNameIndex == -3) {
                    z = false;
                } else {
                    if (!this.configuration.getCoerceInputValues() || !coerceInputValue(descriptor, jsonNameIndex)) {
                        break;
                    }
                    z = this.lexer.tryConsumeComma();
                    z2 = false;
                }
                tryConsumeComma = z2 ? handleUnknown(descriptor, decodeStringKey) : z;
            } else {
                if (tryConsumeComma && !this.json.getConfiguration().getAllowTrailingComma()) {
                    kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlinx.serialization.json.internal.JsonElementMarker jsonElementMarker = this.elementMarker;
                if (jsonElementMarker != null) {
                    return jsonElementMarker.nextUnmarkedIndex$kotlinx_serialization_json();
                }
                return -1;
            }
        }
        kotlinx.serialization.json.internal.JsonElementMarker jsonElementMarker2 = this.elementMarker;
        if (jsonElementMarker2 != null) {
            jsonElementMarker2.mark$kotlinx_serialization_json(jsonNameIndex);
        }
        return jsonNameIndex;
    }

    private final boolean handleUnknown(kotlinx.serialization.descriptors.SerialDescriptor descriptor, java.lang.String key) {
        if (kotlinx.serialization.json.internal.JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.json) || trySkip(this.discriminatorHolder, key)) {
            this.lexer.skipElement(this.configuration.getIsLenient());
        } else {
            this.lexer.path.popDescriptor();
            this.lexer.failOnUnknownKey(key);
        }
        return this.lexer.tryConsumeComma();
    }

    private final int decodeListIndex() {
        boolean tryConsumeComma = this.lexer.tryConsumeComma();
        if (this.lexer.canConsumeValue()) {
            int i = this.currentIndex;
            if (i != -1 && !tryConsumeComma) {
                kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
                throw new kotlin.KotlinNothingValueException();
            }
            int i2 = i + 1;
            this.currentIndex = i2;
            return i2;
        }
        if (!tryConsumeComma || this.json.getConfiguration().getAllowTrailingComma()) {
            return -1;
        }
        kotlinx.serialization.json.internal.JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
        throw new kotlin.KotlinNothingValueException();
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
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s = (short) consumeNumericLiteral;
        if (consumeNumericLiteral == s) {
            return s;
        }
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long consumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i = (int) consumeNumericLiteral;
        if (consumeNumericLiteral == i) {
            return i;
        }
        kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Failed to parse int for input '" + consumeNumericLiteral + '\'', 0, null, 6, null);
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
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'float' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
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
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type 'double' for input '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        java.lang.String consumeStringLenient = this.lexer.consumeStringLenient();
        if (consumeStringLenient.length() != 1) {
            kotlinx.serialization.json.internal.AbstractJsonLexer.fail$default(this.lexer, "Expected single char, but got '" + consumeStringLenient + '\'', 0, null, 6, null);
            throw new kotlin.KotlinNothingValueException();
        }
        return consumeStringLenient.charAt(0);
    }

    private final java.lang.String decodeStringKey() {
        if (this.configuration.getIsLenient()) {
            return this.lexer.consumeStringLenientNotNull();
        }
        return this.lexer.consumeKeyString();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public java.lang.String decodeString() {
        if (this.configuration.getIsLenient()) {
            return this.lexer.consumeStringLenientNotNull();
        }
        return this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.ChunkedDecoder
    public void decodeStringChunked(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> consumeChunk) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        this.lexer.consumeStringChunked(this.configuration.getIsLenient(), consumeChunk);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.Decoder decodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnsignedNumber(descriptor) ? new kotlinx.serialization.json.internal.JsonDecoderForUnsignedTypes(this.lexer, this.json) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, decodeString(), " at path " + this.lexer.path.getPath());
    }
}
