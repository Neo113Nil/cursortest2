package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/serialization/json/JsonObjectBuilder;", "", "<init>", "()V", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "put", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonObject;", "build", "()Lkotlinx/serialization/json/JsonObject;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.json.JsonDslMarker
/* loaded from: classes5.dex */
public final class JsonObjectBuilder {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> getHighSpeedVideoSizes = new java.util.LinkedHashMap();

    @kotlin.IgnorableReturnValue
    public final kotlinx.serialization.json.JsonElement put(java.lang.String key, kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return this.getHighSpeedVideoSizes.put(key, element);
    }

    public final kotlinx.serialization.json.JsonObject build() {
        return new kotlinx.serialization.json.JsonObject(this.getHighSpeedVideoSizes);
    }
}
