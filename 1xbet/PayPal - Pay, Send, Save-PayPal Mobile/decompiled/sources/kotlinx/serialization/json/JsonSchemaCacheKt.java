package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "getSchemaCache", "(Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "getSchemaCache$annotations", "(Lkotlinx/serialization/json/Json;)V", "schemaCache"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonSchemaCacheKt {
    public static /* synthetic */ void getSchemaCache$annotations(kotlinx.serialization.json.Json json) {
    }

    public static final kotlinx.serialization.json.internal.DescriptorSchemaCache getSchemaCache(kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        return json.get_schemaCache();
    }
}
