package kotlinx.serialization.json;

/* compiled from: JsonElementBuilders.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a2\u0010\u0007\u001a\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a-\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a-\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a#\u0010\u000f\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013\u001a\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u001a \u0010\u000f\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0014H\u0007\u001a\u0019\u0010\u0015\u001a\u00020\u0011*\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0016\u001a\u0014\u0010\u0015\u001a\u00020\u0011*\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013\u001a\u0014\u0010\u0015\u001a\u00020\u0011*\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u001a\u0016\u0010\u0015\u001a\u00020\u0011*\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0014H\u0007\u001a#\u0010\u0017\u001a\u00020\u0011*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a#\u0010\u0018\u001a\u00020\u0011*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a!\u0010\u0019\u001a\u00020\u0011*\u00020\t2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001bH\u0007¢\u0006\u0002\b\u001c\u001a!\u0010\u0019\u001a\u00020\u0011*\u00020\t2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001bH\u0007¢\u0006\u0002\b\u001d\u001a!\u0010\u0019\u001a\u00020\u0011*\u00020\t2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001bH\u0007¢\u0006\u0002\b\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"buildJsonObject", "Lkotlinx/serialization/json/JsonObject;", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonObjectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "buildJsonArray", "Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonArrayBuilder;", "putJsonObject", "Lkotlinx/serialization/json/JsonElement;", com.ironsource.X3.i.W, "", "putJsonArray", "put", "value", "", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonElement;", "", "", "add", "(Lkotlinx/serialization/json/JsonArrayBuilder;Ljava/lang/Boolean;)Z", "addJsonObject", "addJsonArray", "addAll", "values", "", "addAllStrings", "addAllBooleans", "addAllNumbers", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonElementBuildersKt {
    public static final kotlinx.serialization.json.JsonObject buildJsonObject(kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonObjectBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
        builderAction.invoke(jsonObjectBuilder);
        return jsonObjectBuilder.build();
    }

    public static final kotlinx.serialization.json.JsonArray buildJsonArray(kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonArrayBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder = new kotlinx.serialization.json.JsonArrayBuilder();
        builderAction.invoke(jsonArrayBuilder);
        return jsonArrayBuilder.build();
    }

    public static final kotlinx.serialization.json.JsonElement put(kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder, java.lang.String key, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(bool));
    }

    public static final kotlinx.serialization.json.JsonElement put(kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder, java.lang.String key, java.lang.Number number) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(number));
    }

    public static final kotlinx.serialization.json.JsonElement put(kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder, java.lang.String key, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, kotlinx.serialization.json.JsonElementKt.JsonPrimitive(str));
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final kotlinx.serialization.json.JsonElement put(kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder, java.lang.String key, java.lang.Void r2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, kotlinx.serialization.json.JsonNull.INSTANCE);
    }

    public static final boolean add(kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        return jsonArrayBuilder.add(kotlinx.serialization.json.JsonElementKt.JsonPrimitive(bool));
    }

    public static final boolean add(kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder, java.lang.Number number) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        return jsonArrayBuilder.add(kotlinx.serialization.json.JsonElementKt.JsonPrimitive(number));
    }

    public static final boolean add(kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        return jsonArrayBuilder.add(kotlinx.serialization.json.JsonElementKt.JsonPrimitive(str));
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final boolean add(kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder, java.lang.Void r1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        return jsonArrayBuilder.add(kotlinx.serialization.json.JsonNull.INSTANCE);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final boolean addAllStrings(kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder, java.util.Collection<java.lang.String> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        java.util.Collection<java.lang.String> collection = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.serialization.json.JsonElementKt.JsonPrimitive((java.lang.String) it.next()));
        }
        return jsonArrayBuilder.addAll(arrayList);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final boolean addAllBooleans(kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder, java.util.Collection<java.lang.Boolean> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        java.util.Collection<java.lang.Boolean> collection = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.serialization.json.JsonElementKt.JsonPrimitive((java.lang.Boolean) it.next()));
        }
        return jsonArrayBuilder.addAll(arrayList);
    }

    @kotlinx.serialization.ExperimentalSerializationApi
    public static final boolean addAllNumbers(kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder, java.util.Collection<? extends java.lang.Number> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        java.util.Collection<? extends java.lang.Number> collection = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.serialization.json.JsonElementKt.JsonPrimitive((java.lang.Number) it.next()));
        }
        return jsonArrayBuilder.addAll(arrayList);
    }

    public static final kotlinx.serialization.json.JsonElement putJsonObject(kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder, java.lang.String key, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonObjectBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder2 = new kotlinx.serialization.json.JsonObjectBuilder();
        builderAction.invoke(jsonObjectBuilder2);
        return jsonObjectBuilder.put(key, jsonObjectBuilder2.build());
    }

    public static final kotlinx.serialization.json.JsonElement putJsonArray(kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder, java.lang.String key, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonArrayBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder = new kotlinx.serialization.json.JsonArrayBuilder();
        builderAction.invoke(jsonArrayBuilder);
        return jsonObjectBuilder.put(key, jsonArrayBuilder.build());
    }

    public static final boolean addJsonObject(kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonObjectBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
        builderAction.invoke(jsonObjectBuilder);
        return jsonArrayBuilder.add(jsonObjectBuilder.build());
    }

    public static final boolean addJsonArray(kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonArrayBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArrayBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        kotlinx.serialization.json.JsonArrayBuilder jsonArrayBuilder2 = new kotlinx.serialization.json.JsonArrayBuilder();
        builderAction.invoke(jsonArrayBuilder2);
        return jsonArrayBuilder.add(jsonArrayBuilder2.build());
    }
}
