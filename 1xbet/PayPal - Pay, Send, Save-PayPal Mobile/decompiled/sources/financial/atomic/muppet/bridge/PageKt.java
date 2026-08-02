package financial.atomic.muppet.bridge;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/serialization/json/JsonObject;", "jo", "", "", "_jsonObjectToMap", "(Lkotlinx/serialization/json/JsonObject;)Ljava/util/Map;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PageKt {
    public static final java.util.Map<java.lang.String, java.lang.String> _jsonObjectToMap(kotlinx.serialization.json.JsonObject jsonObject) {
        java.lang.String obj;
        if (jsonObject == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        try {
            java.util.Iterator<T> it = jsonObject.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object obj2 = (kotlinx.serialization.json.JsonElement) entry.getValue();
                if (obj2 instanceof kotlinx.serialization.json.JsonPrimitive) {
                    obj = ((kotlinx.serialization.json.JsonPrimitive) obj2).getContent();
                } else if (obj2 instanceof kotlinx.serialization.json.JsonArray) {
                    obj = kotlin.collections.CollectionsKt.joinToString$default((java.lang.Iterable) obj2, ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: financial.atomic.muppet.bridge.PageKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return financial.atomic.muppet.bridge.PageKt.m23219$r8$lambda$9jQpMmKE7q6XqJVD7Dq27msTU((kotlinx.serialization.json.JsonElement) obj3);
                        }
                    }, 30, null);
                } else {
                    if (!(obj2 instanceof kotlinx.serialization.json.JsonObject)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    obj = ((kotlinx.serialization.json.JsonObject) obj2).toString();
                }
                linkedHashMap.put(str, obj);
            }
            return linkedHashMap;
        } catch (java.lang.Exception e) {
            financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
            new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.bridge.PageKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.lang.String concat;
                    concat = "_jsonObjectToMap failed: ".concat(java.lang.String.valueOf(e));
                    return concat;
                }
            };
            return linkedHashMap;
        }
    }

    /* renamed from: $r8$lambda$9j-QpMmKE7q6XqJVD7Dq27m-sTU, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m23219$r8$lambda$9jQpMmKE7q6XqJVD7Dq27msTU(kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        return jsonElement instanceof kotlinx.serialization.json.JsonPrimitive ? ((kotlinx.serialization.json.JsonPrimitive) jsonElement).getContent() : jsonElement.toString();
    }
}
