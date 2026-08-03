package kotlinx.serialization.json;

/* compiled from: Json.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\u0006\u0010\u0017\u001a\u0002H\u0014¢\u0006\u0002\u0010\u0018J)\u0010\u0019\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u0013¢\u0006\u0002\u0010\u001dJ'\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\u0006\u0010\u0017\u001a\u0002H\u0014¢\u0006\u0002\u0010 J'\u0010!\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001b2\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u001f2\b\b\u0001\u0010\u001c\u001a\u00020\u0013J\u001e\u0010\u0012\u001a\u00020\u0013\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0017\u001a\u0002H\u0014H\u0086\b¢\u0006\u0002\u0010%J \u0010\u0019\u001a\u0002H\u0014\"\u0006\b\u0000\u0010\u0014\u0018\u00012\b\b\u0001\u0010\u001c\u001a\u00020\u0013H\u0086\b¢\u0006\u0002\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002()¨\u0006*"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/StringFormat;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/modules/SerializersModule;)V", "getConfiguration", "()Lkotlinx/serialization/json/JsonConfiguration;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "_schemaCache", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "get_schemaCache$kotlinx_serialization_json", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "encodeToString", "", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "decodeFromString", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "string", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "encodeToJsonElement", "Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "decodeFromJsonElement", "element", "(Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "parseToJsonElement", "(Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/Object;", androidx.webkit.Profile.DEFAULT_PROFILE_NAME, "Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/JsonImpl;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Json implements kotlinx.serialization.StringFormat {

    /* renamed from: Default, reason: from kotlin metadata */
    public static final kotlinx.serialization.json.Json.Companion INSTANCE = new kotlinx.serialization.json.Json.Companion(null);
    private final kotlinx.serialization.json.internal.DescriptorSchemaCache _schemaCache;
    private final kotlinx.serialization.json.JsonConfiguration configuration;
    private final kotlinx.serialization.modules.SerializersModule serializersModule;

    public /* synthetic */ Json(kotlinx.serialization.json.JsonConfiguration jsonConfiguration, kotlinx.serialization.modules.SerializersModule serializersModule, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonConfiguration, serializersModule);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Should not be accessed directly, use Json.schemaCache accessor instead", replaceWith = @kotlin.ReplaceWith(expression = "schemaCache", imports = {}))
    public static /* synthetic */ void get_schemaCache$kotlinx_serialization_json$annotations() {
    }

    private Json(kotlinx.serialization.json.JsonConfiguration jsonConfiguration, kotlinx.serialization.modules.SerializersModule serializersModule) {
        this.configuration = jsonConfiguration;
        this.serializersModule = serializersModule;
        this._schemaCache = new kotlinx.serialization.json.internal.DescriptorSchemaCache();
    }

    public final kotlinx.serialization.json.JsonConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // kotlinx.serialization.SerialFormat
    public kotlinx.serialization.modules.SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    /* renamed from: get_schemaCache$kotlinx_serialization_json, reason: from getter */
    public final kotlinx.serialization.json.internal.DescriptorSchemaCache get_schemaCache() {
        return this._schemaCache;
    }

    /* compiled from: Json.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/Json;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.serialization.json.Json$Default, reason: from kotlin metadata */
    public static final class Companion extends kotlinx.serialization.json.Json {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(new kotlinx.serialization.json.JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), kotlinx.serialization.modules.SerializersModuleBuildersKt.EmptySerializersModule(), null);
        }
    }

    @Override // kotlinx.serialization.StringFormat
    public final <T> java.lang.String encodeToString(kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlinx.serialization.json.internal.JsonToStringWriter jsonToStringWriter = new kotlinx.serialization.json.internal.JsonToStringWriter();
        try {
            kotlinx.serialization.json.internal.JsonStreamsKt.encodeByWriter(this, jsonToStringWriter, serializer, value);
            return jsonToStringWriter.toString();
        } finally {
            jsonToStringWriter.release();
        }
    }

    @Override // kotlinx.serialization.StringFormat
    public final <T> T decodeFromString(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlinx.serialization.json.internal.StringJsonLexer StringJsonLexer = kotlinx.serialization.json.internal.StringJsonLexerKt.StringJsonLexer(this, string);
        T t = (T) new kotlinx.serialization.json.internal.StreamingJsonDecoder(this, kotlinx.serialization.json.internal.WriteMode.OBJ, StringJsonLexer, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        StringJsonLexer.expectEof();
        return t;
    }

    public final <T> kotlinx.serialization.json.JsonElement encodeToJsonElement(kotlinx.serialization.SerializationStrategy<? super T> serializer, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        return kotlinx.serialization.json.internal.TreeJsonEncoderKt.writeJson(this, value, serializer);
    }

    public final <T> T decodeFromJsonElement(kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        return (T) kotlinx.serialization.json.internal.TreeJsonDecoderKt.readJson(this, element, deserializer);
    }

    public final kotlinx.serialization.json.JsonElement parseToJsonElement(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        return (kotlinx.serialization.json.JsonElement) decodeFromString(kotlinx.serialization.json.JsonElementSerializer.INSTANCE, string);
    }

    public final /* synthetic */ <T> java.lang.String encodeToString(T value) {
        kotlinx.serialization.modules.SerializersModule serializersModule = getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToString(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), value);
    }

    public final /* synthetic */ <T> T decodeFromString(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlinx.serialization.modules.SerializersModule serializersModule = getSerializersModule();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromString(kotlinx.serialization.SerializersKt.serializer(serializersModule, (kotlin.reflect.KType) null), string);
    }
}
