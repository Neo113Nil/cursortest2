package kotlinx.serialization.json.internal;

/* compiled from: StreamingJsonEncoder.kt */
@kotlin.Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB1\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J)\u0010'\u001a\u00020\u001f\"\u0004\b\u0000\u0010(2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H(0*2\u0006\u0010+\u001a\u0002H(H\u0016¢\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH\u0002J\u0010\u00100\u001a\u0002012\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u00102\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u00103\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J?\u00104\u001a\u00020\u001f\"\b\b\u0000\u0010(*\u0002052\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H(0*2\b\u0010+\u001a\u0004\u0018\u0001H(H\u0016¢\u0006\u0002\u00106J\u0010\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020$H\u0016JR\u00109\u001a\u0002H(\"\n\b\u0000\u0010(\u0018\u0001*\u00020\u000426\u0010:\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H(0;H\u0082\b¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020\u001fH\u0016J\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001aH\u0016J\u0010\u0010B\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020&H\u0016J\u0010\u0010G\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020LH\u0016J\u0010\u0010M\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0018\u0010P\u001a\u00020\u001f2\u0006\u0010Q\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "composer", "Lkotlinx/serialization/json/internal/Composer;", "json", "Lkotlinx/serialization/json/Json;", com.ironsource.X3.a.t, "Lkotlinx/serialization/json/internal/WriteMode;", "modeReuseCache", "", "<init>", "(Lkotlinx/serialization/json/internal/Composer;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "output", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "[Lkotlinx/serialization/json/JsonEncoder;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "forceQuoting", "", "polymorphicDiscriminator", "", "polymorphicSerialName", "encodeJsonElement", "", "element", "Lkotlinx/serialization/json/JsonElement;", "shouldEncodeElementDefault", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "encodeSerializableValue", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeTypeInfo", "discriminator", "serialName", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "endStructure", "encodeElement", "encodeNullableSerializableElement", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeInline", "Lkotlinx/serialization/encoding/Encoder;", "composerAs", "composerCreator", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "writer", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/serialization/json/internal/Composer;", "encodeNull", "encodeBoolean", "encodeByte", "", "encodeShort", "", "encodeInt", "encodeLong", "", "encodeFloat", "", "encodeDouble", "", "encodeChar", "", "encodeString", "encodeEnum", "enumDescriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamingJsonEncoder extends kotlinx.serialization.encoding.AbstractEncoder implements kotlinx.serialization.json.JsonEncoder {
    private final kotlinx.serialization.json.internal.Composer composer;
    private final kotlinx.serialization.json.JsonConfiguration configuration;
    private boolean forceQuoting;
    private final kotlinx.serialization.json.Json json;
    private final kotlinx.serialization.json.internal.WriteMode mode;
    private final kotlinx.serialization.json.JsonEncoder[] modeReuseCache;
    private java.lang.String polymorphicDiscriminator;
    private java.lang.String polymorphicSerialName;
    private final kotlinx.serialization.modules.SerializersModule serializersModule;

    /* compiled from: StreamingJsonEncoder.kt */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public kotlinx.serialization.json.Json getJson() {
        return this.json;
    }

    public StreamingJsonEncoder(kotlinx.serialization.json.internal.Composer composer, kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.WriteMode mode, kotlinx.serialization.json.JsonEncoder[] jsonEncoderArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composer, "composer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = jsonEncoderArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int ordinal = mode.ordinal();
        if (jsonEncoderArr != null) {
            kotlinx.serialization.json.JsonEncoder jsonEncoder = jsonEncoderArr[ordinal];
            if (jsonEncoder == null && jsonEncoder == this) {
                return;
            }
            jsonEncoderArr[ordinal] = this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamingJsonEncoder(kotlinx.serialization.json.internal.InternalJsonWriter output, kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.WriteMode mode, kotlinx.serialization.json.JsonEncoder[] modeReuseCache) {
        this(kotlinx.serialization.json.internal.ComposersKt.Composer(output, json), json, mode, modeReuseCache);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return this.serializersModule;
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

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r0.getJson().getConfiguration().getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> void encodeSerializableValue(kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        java.lang.String classDiscriminator;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlinx.serialization.json.internal.StreamingJsonEncoder streamingJsonEncoder = this;
        if (streamingJsonEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(streamingJsonEncoder, value);
            return;
        }
        boolean z = serializer instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer;
        if (!z) {
            int i = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[streamingJsonEncoder.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlinx.serialization.descriptors.SerialKind kind = serializer.getDescriptor().getKind();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE)) {
                }
                classDiscriminator = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(serializer.getDescriptor(), streamingJsonEncoder.getJson());
            }
            classDiscriminator = null;
        }
        if (z) {
            kotlinx.serialization.internal.AbstractPolymorphicSerializer abstractPolymorphicSerializer = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) serializer;
            if (value == 0) {
                throw new java.lang.IllegalArgumentException(("Value for serializer " + abstractPolymorphicSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            kotlinx.serialization.SerializationStrategy<? super T> findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, streamingJsonEncoder, value);
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
        serializer.serialize(streamingJsonEncoder, value);
    }

    private final void encodeTypeInfo(java.lang.String discriminator, java.lang.String serialName) {
        this.composer.nextItem();
        encodeString(discriminator);
        this.composer.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        this.composer.space();
        encodeString(serialName);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public kotlinx.serialization.encoding.CompositeEncoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlinx.serialization.json.JsonEncoder streamingJsonEncoder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.internal.WriteMode switchMode = kotlinx.serialization.json.internal.WriteModeKt.switchMode(getJson(), descriptor);
        if (switchMode.begin != 0) {
            this.composer.print(switchMode.begin);
            this.composer.indent();
        }
        java.lang.String str = this.polymorphicDiscriminator;
        if (str != null) {
            java.lang.String str2 = this.polymorphicSerialName;
            if (str2 == null) {
                str2 = descriptor.getSerialName();
            }
            encodeTypeInfo(str, str2);
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        if (this.mode == switchMode) {
            return this;
        }
        kotlinx.serialization.json.JsonEncoder[] jsonEncoderArr = this.modeReuseCache;
        if (jsonEncoderArr == null || (streamingJsonEncoder = jsonEncoderArr[switchMode.ordinal()]) == null) {
            streamingJsonEncoder = new kotlinx.serialization.json.internal.StreamingJsonEncoder(this.composer, getJson(), switchMode, this.modeReuseCache);
        }
        return streamingJsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.unIndent();
            this.composer.nextItemIfNotFirst();
            this.composer.print(this.mode.end);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public boolean encodeElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = kotlinx.serialization.json.internal.StreamingJsonEncoder.WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i != 1) {
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                    }
                    this.composer.nextItem();
                    encodeString(kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonElementName(descriptor, getJson(), index));
                    this.composer.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                    this.composer.space();
                } else {
                    if (index == 0) {
                        this.forceQuoting = true;
                    }
                    if (index == 1) {
                        this.composer.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                        this.composer.space();
                        this.forceQuoting = false;
                    }
                }
            } else if (!this.composer.getWritingFirst()) {
                if (index % 2 == 0) {
                    this.composer.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                    this.composer.nextItem();
                    z = true;
                } else {
                    this.composer.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                    this.composer.space();
                }
                this.forceQuoting = z;
            } else {
                this.forceQuoting = true;
                this.composer.nextItem();
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            this.composer.nextItem();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, index, serializer, value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public kotlinx.serialization.encoding.Encoder encodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnsignedNumber(descriptor)) {
            if (!kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnquotedLiteral(descriptor)) {
                if (this.polymorphicDiscriminator == null) {
                    return super.encodeInline(descriptor);
                }
                this.polymorphicSerialName = descriptor.getSerialName();
                return this;
            }
            kotlinx.serialization.json.internal.ComposerForUnquotedLiterals composerForUnquotedLiterals = this.composer;
            if (!(composerForUnquotedLiterals instanceof kotlinx.serialization.json.internal.ComposerForUnquotedLiterals)) {
                composerForUnquotedLiterals = new kotlinx.serialization.json.internal.ComposerForUnquotedLiterals(composerForUnquotedLiterals.writer, this.forceQuoting);
            }
            return new kotlinx.serialization.json.internal.StreamingJsonEncoder(composerForUnquotedLiterals, getJson(), this.mode, (kotlinx.serialization.json.JsonEncoder[]) null);
        }
        kotlinx.serialization.json.internal.ComposerForUnsignedNumbers composerForUnsignedNumbers = this.composer;
        if (!(composerForUnsignedNumbers instanceof kotlinx.serialization.json.internal.ComposerForUnsignedNumbers)) {
            composerForUnsignedNumbers = new kotlinx.serialization.json.internal.ComposerForUnsignedNumbers(composerForUnsignedNumbers.writer, this.forceQuoting);
        }
        return new kotlinx.serialization.json.internal.StreamingJsonEncoder(composerForUnsignedNumbers, getJson(), this.mode, (kotlinx.serialization.json.JsonEncoder[]) null);
    }

    private final /* synthetic */ <T extends kotlinx.serialization.json.internal.Composer> T composerAs(kotlin.jvm.functions.Function2<? super kotlinx.serialization.json.internal.InternalJsonWriter, ? super java.lang.Boolean, ? extends T> composerCreator) {
        kotlinx.serialization.json.internal.Composer composer = this.composer;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
        return composer instanceof kotlinx.serialization.json.internal.Composer ? (T) this.composer : composerCreator.invoke(this.composer.writer, java.lang.Boolean.valueOf(this.forceQuoting));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        this.composer.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean value) {
        if (this.forceQuoting) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte value) {
        if (this.forceQuoting) {
            encodeString(java.lang.String.valueOf((int) value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short value) {
        if (this.forceQuoting) {
            encodeString(java.lang.String.valueOf((int) value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int value) {
        if (this.forceQuoting) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long value) {
        if (this.forceQuoting) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float value) {
        if (this.forceQuoting) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.composer.print(value);
        }
        if (!this.configuration.getAllowSpecialFloatingPointValues() && java.lang.Math.abs(value) > Float.MAX_VALUE) {
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointEncoded(java.lang.Float.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double value) {
        if (this.forceQuoting) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.composer.print(value);
        }
        if (!this.configuration.getAllowSpecialFloatingPointValues() && java.lang.Math.abs(value) > Double.MAX_VALUE) {
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointEncoded(java.lang.Double.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char value) {
        encodeString(java.lang.String.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeString(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.composer.printQuoted(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.getElementName(index));
    }
}
