package kotlinx.serialization.json;

/* compiled from: JsonElementBuilders.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\fH\u0001R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/serialization/json/JsonObjectBuilder;", "", "<init>", "()V", "content", "", "", "Lkotlinx/serialization/json/JsonElement;", "put", com.ironsource.X3.i.W, "element", "build", "Lkotlinx/serialization/json/JsonObject;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.json.JsonDslMarker
/* loaded from: classes6.dex */
public final class JsonObjectBuilder {
    private final java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> content = new java.util.LinkedHashMap();

    public final kotlinx.serialization.json.JsonElement put(java.lang.String key, kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        return this.content.put(key, element);
    }

    public final kotlinx.serialization.json.JsonObject build() {
        return new kotlinx.serialization.json.JsonObject(this.content);
    }
}
