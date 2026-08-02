package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "isString", "()Z", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.serialization.json.JsonNullSerializer.class)
/* loaded from: classes5.dex */
public final class JsonNull extends kotlinx.serialization.json.JsonPrimitive {
    public static final kotlinx.serialization.json.JsonNull INSTANCE = new kotlinx.serialization.json.JsonNull();
    private static final java.lang.String content = "null";

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: isString */
    public final boolean getIsString() {
        return false;
    }

    private JsonNull() {
        super(null);
    }

    public final kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonNull> serializer() {
        return kotlinx.serialization.json.JsonNullSerializer.INSTANCE;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final java.lang.String getContent() {
        return content;
    }
}
