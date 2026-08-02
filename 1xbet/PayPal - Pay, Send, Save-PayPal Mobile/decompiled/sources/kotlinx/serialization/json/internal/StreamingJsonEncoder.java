package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010 \u001a\u00020\u0012\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010\u001bJA\u0010)\u001a\u00020\u0012\"\b\b\u0000\u0010\u001c*\u00020(2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u001f\u0010J\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001e\u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010U\u001a\u00020\\8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010]R\u0016\u0010L\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010`"}, d2 = {"Lkotlinx/serialization/json/internal/StreamingJsonEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/json/internal/Composer;", "composer", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/WriteMode;", "mode", "", "modeReuseCache", "<init>", "(Lkotlinx/serialization/json/internal/Composer;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "output", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/WriteMode;[Lkotlinx/serialization/json/JsonEncoder;)V", "Lkotlinx/serialization/json/JsonElement;", "element", "", "encodeJsonElement", "(Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "shouldEncodeElementDefault", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "encodeSerializableValue", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "encodeElement", "", "encodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeNull", "()V", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "enumDescriptor", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/json/internal/Composer;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/json/internal/WriteMode;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "[Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/json/JsonConfiguration;", "Z", "getHighSpeedVideoSizesFor", "Ljava/lang/String;", "getInputFormats", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StreamingJsonEncoder extends kotlinx.serialization.encoding.AbstractEncoder implements kotlinx.serialization.json.JsonEncoder {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.serialization.json.internal.WriteMode getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.serialization.json.internal.Composer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.json.JsonEncoder[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.json.JsonConfiguration getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private java.lang.String getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private java.lang.String getOutputFormats;
    private final kotlinx.serialization.json.Json json;
    private final kotlinx.serialization.modules.SerializersModule serializersModule;

    public StreamingJsonEncoder(kotlinx.serialization.json.internal.Composer composer, kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.WriteMode writeMode, kotlinx.serialization.json.JsonEncoder[] jsonEncoderArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeMode, "");
        this.getHighSpeedVideoFpsRangesFor = composer;
        this.json = json;
        this.getHighSpeedVideoSizes = writeMode;
        this.Camera2StreamConfigurationMap = jsonEncoderArr;
        this.serializersModule = getJson().getSerializersModule();
        this.getHighSpeedVideoFpsRanges = getJson().getConfiguration();
        int ordinal = writeMode.ordinal();
        if (jsonEncoderArr != null) {
            kotlinx.serialization.json.JsonEncoder jsonEncoder = jsonEncoderArr[ordinal];
            if (jsonEncoder == null && jsonEncoder == this) {
                return;
            }
            jsonEncoderArr[ordinal] = this;
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final kotlinx.serialization.json.Json getJson() {
        return this.json;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamingJsonEncoder(kotlinx.serialization.json.internal.InternalJsonWriter internalJsonWriter, kotlinx.serialization.json.Json json, kotlinx.serialization.json.internal.WriteMode writeMode, kotlinx.serialization.json.JsonEncoder[] jsonEncoderArr) {
        this(kotlinx.serialization.json.internal.ComposersKt.Composer(internalJsonWriter, json), json, writeMode, jsonEncoderArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonEncoderArr, "");
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final void encodeJsonElement(kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        if (this.getInputFormats != null && !(element instanceof kotlinx.serialization.json.JsonObject)) {
            kotlinx.serialization.json.internal.PolymorphicKt.throwJsonElementPolymorphicException(this.getOutputFormats, element);
            throw new kotlin.KotlinNothingValueException();
        }
        encodeSerializableValue(kotlinx.serialization.json.JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final boolean shouldEncodeElementDefault(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        return this.getHighSpeedVideoFpsRanges.getEncodeDefaults();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r1.getJson().getConfiguration().getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void encodeSerializableValue(kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        java.lang.String classDiscriminator;
        kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
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
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Value for serializer ");
                sb.append(abstractPolymorphicSerializer.getDescriptor());
                sb.append(" should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            serializationStrategy = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, streamingJsonEncoder, value);
            kotlin.jvm.internal.Intrinsics.checkNotNull(serializationStrategy, "");
        } else {
            serializationStrategy = serializer;
        }
        if (classDiscriminator != null) {
            kotlinx.serialization.json.internal.PolymorphicKt.access$checkEncodingConflicts(streamingJsonEncoder.getJson(), serializer, serializationStrategy, classDiscriminator);
            kotlinx.serialization.json.internal.PolymorphicKt.checkKind(serializationStrategy.getDescriptor().getKind());
            java.lang.String getHighSpeedVideoSizes = serializationStrategy.getDescriptor().getGetHighSpeedVideoSizes();
            this.getInputFormats = classDiscriminator;
            this.getOutputFormats = getHighSpeedVideoSizes;
        }
        serializationStrategy.serialize(streamingJsonEncoder, value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final kotlinx.serialization.encoding.CompositeEncoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlinx.serialization.json.JsonEncoder jsonEncoder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlinx.serialization.json.internal.WriteMode switchMode = kotlinx.serialization.json.internal.WriteModeKt.switchMode(getJson(), descriptor);
        if (switchMode.begin != 0) {
            this.getHighSpeedVideoFpsRangesFor.print(switchMode.begin);
            this.getHighSpeedVideoFpsRangesFor.indent();
        }
        java.lang.String str = this.getInputFormats;
        if (str != null) {
            java.lang.String str2 = this.getOutputFormats;
            if (str2 == null) {
                str2 = descriptor.getGetHighSpeedVideoSizes();
            }
            this.getHighSpeedVideoFpsRangesFor.nextItem();
            encodeString(str);
            this.getHighSpeedVideoFpsRangesFor.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            this.getHighSpeedVideoFpsRangesFor.space();
            encodeString(str2);
            this.getInputFormats = null;
            this.getOutputFormats = null;
        }
        if (this.getHighSpeedVideoSizes == switchMode) {
            return this;
        }
        kotlinx.serialization.json.JsonEncoder[] jsonEncoderArr = this.Camera2StreamConfigurationMap;
        return (jsonEncoderArr == null || (jsonEncoder = jsonEncoderArr[switchMode.ordinal()]) == null) ? new kotlinx.serialization.json.internal.StreamingJsonEncoder(this.getHighSpeedVideoFpsRangesFor, getJson(), switchMode, this.Camera2StreamConfigurationMap) : jsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (this.getHighSpeedVideoSizes.end != 0) {
            this.getHighSpeedVideoFpsRangesFor.unIndent();
            this.getHighSpeedVideoFpsRangesFor.nextItemIfNotFirst();
            this.getHighSpeedVideoFpsRangesFor.print(this.getHighSpeedVideoSizes.end);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public final boolean encodeElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        int i = kotlinx.serialization.json.internal.StreamingJsonEncoder.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.ordinal()];
        if (i != 1) {
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    if (!this.getHighSpeedVideoFpsRangesFor.getWritingFirst()) {
                        this.getHighSpeedVideoFpsRangesFor.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                    }
                    this.getHighSpeedVideoFpsRangesFor.nextItem();
                    encodeString(kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonElementName(descriptor, getJson(), index));
                    this.getHighSpeedVideoFpsRangesFor.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                    this.getHighSpeedVideoFpsRangesFor.space();
                } else {
                    if (index == 0) {
                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                    }
                    if (index == 1) {
                        this.getHighSpeedVideoFpsRangesFor.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                        this.getHighSpeedVideoFpsRangesFor.space();
                        this.getHighResolutionOutputSizeshNQ4ISI = false;
                    }
                }
            } else if (!this.getHighSpeedVideoFpsRangesFor.getWritingFirst()) {
                if (index % 2 == 0) {
                    this.getHighSpeedVideoFpsRangesFor.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                    this.getHighSpeedVideoFpsRangesFor.nextItem();
                    z = true;
                } else {
                    this.getHighSpeedVideoFpsRangesFor.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                    this.getHighSpeedVideoFpsRangesFor.space();
                }
                this.getHighResolutionOutputSizeshNQ4ISI = z;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
            }
            return true;
        }
        if (!this.getHighSpeedVideoFpsRangesFor.getWritingFirst()) {
            this.getHighSpeedVideoFpsRangesFor.print(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        }
        this.getHighSpeedVideoFpsRangesFor.nextItem();
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final <T> void encodeNullableSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index, kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        if (value != null || this.getHighSpeedVideoFpsRanges.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, index, serializer, value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final kotlinx.serialization.encoding.Encoder encodeInline(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        if (!kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnsignedNumber(descriptor)) {
            if (!kotlinx.serialization.json.internal.StreamingJsonEncoderKt.isUnquotedLiteral(descriptor)) {
                if (this.getInputFormats == null) {
                    return super.encodeInline(descriptor);
                }
                this.getOutputFormats = descriptor.getGetHighSpeedVideoSizes();
                return this;
            }
            kotlinx.serialization.json.internal.ComposerForUnquotedLiterals composerForUnquotedLiterals = this.getHighSpeedVideoFpsRangesFor;
            if (!(composerForUnquotedLiterals instanceof kotlinx.serialization.json.internal.ComposerForUnquotedLiterals)) {
                composerForUnquotedLiterals = new kotlinx.serialization.json.internal.ComposerForUnquotedLiterals(composerForUnquotedLiterals.writer, this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return new kotlinx.serialization.json.internal.StreamingJsonEncoder(composerForUnquotedLiterals, getJson(), this.getHighSpeedVideoSizes, (kotlinx.serialization.json.JsonEncoder[]) null);
        }
        kotlinx.serialization.json.internal.ComposerForUnsignedNumbers composerForUnsignedNumbers = this.getHighSpeedVideoFpsRangesFor;
        if (!(composerForUnsignedNumbers instanceof kotlinx.serialization.json.internal.ComposerForUnsignedNumbers)) {
            composerForUnsignedNumbers = new kotlinx.serialization.json.internal.ComposerForUnsignedNumbers(composerForUnsignedNumbers.writer, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return new kotlinx.serialization.json.internal.StreamingJsonEncoder(composerForUnsignedNumbers, getJson(), this.getHighSpeedVideoSizes, (kotlinx.serialization.json.JsonEncoder[]) null);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeNull() {
        this.getHighSpeedVideoFpsRangesFor.print("null");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeBoolean(boolean value) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.getHighSpeedVideoFpsRangesFor.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte value) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            encodeString(java.lang.String.valueOf((int) value));
        } else {
            this.getHighSpeedVideoFpsRangesFor.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short value) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            encodeString(java.lang.String.valueOf((int) value));
        } else {
            this.getHighSpeedVideoFpsRangesFor.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int value) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.getHighSpeedVideoFpsRangesFor.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long value) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.getHighSpeedVideoFpsRangesFor.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float value) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.getHighSpeedVideoFpsRangesFor.print(value);
        }
        if (!this.getHighSpeedVideoFpsRanges.getAllowSpecialFloatingPointValues() && java.lang.Math.abs(value) > Float.MAX_VALUE) {
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointEncoded(java.lang.Float.valueOf(value), this.getHighSpeedVideoFpsRangesFor.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double value) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            encodeString(java.lang.String.valueOf(value));
        } else {
            this.getHighSpeedVideoFpsRangesFor.print(value);
        }
        if (!this.getHighSpeedVideoFpsRanges.getAllowSpecialFloatingPointValues() && java.lang.Math.abs(value) > Double.MAX_VALUE) {
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidFloatingPointEncoded(java.lang.Double.valueOf(value), this.getHighSpeedVideoFpsRangesFor.writer.toString());
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char value) {
        encodeString(java.lang.String.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeString(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRangesFor.printQuoted(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor, int index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumDescriptor, "");
        encodeString(enumDescriptor.getElementName(index));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
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
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
