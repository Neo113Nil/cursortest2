package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0001\u0002\r\u000e"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "isString", "()Z", "getContent", "content", "Companion", "Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/json/JsonNull;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.serialization.json.JsonPrimitiveSerializer.class)
/* loaded from: classes5.dex */
public abstract class JsonPrimitive extends kotlinx.serialization.json.JsonElement {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.serialization.json.JsonPrimitive.Companion INSTANCE = new kotlinx.serialization.json.JsonPrimitive.Companion(null);

    public abstract java.lang.String getContent();

    public abstract boolean isString();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitive$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonPrimitive> serializer() {
            return kotlinx.serialization.json.JsonPrimitiveSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private JsonPrimitive() {
        super(null);
    }

    public java.lang.String toString() {
        return getContent();
    }

    public /* synthetic */ JsonPrimitive(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
