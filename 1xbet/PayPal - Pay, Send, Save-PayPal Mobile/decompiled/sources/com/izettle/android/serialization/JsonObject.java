package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R)\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00160\u00158\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/izettle/android/serialization/JsonObject;", "Lcom/izettle/android/serialization/JsonElement;", "<init>", "()V", "", "key", "", "containsKey", "(Ljava/lang/String;)Z", "get", "(Ljava/lang/String;)Lcom/izettle/android/serialization/JsonElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/String;Lcom/izettle/android/serialization/JsonElement;)Lcom/izettle/android/serialization/JsonObject;", "remove", "(Ljava/lang/String;)Lcom/izettle/android/serialization/JsonObject;", "", "set", "(Ljava/lang/String;Lcom/izettle/android/serialization/JsonElement;)V", "toString", "()Ljava/lang/String;", "", "", "entries", "Ljava/util/Set;", "getEntries", "()Ljava/util/Set;", "", "keyValuePairs", "Ljava/util/Map;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "getKeys", "", "values", "Ljava/util/Collection;", "getValues", "()Ljava/util/Collection;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonObject extends com.izettle.android.serialization.JsonElement {
    private final java.util.Set<java.util.Map.Entry<java.lang.String, com.izettle.android.serialization.JsonElement>> entries;
    private final java.util.Map<java.lang.String, com.izettle.android.serialization.JsonElement> keyValuePairs;
    private final java.util.Set<java.lang.String> keys;
    private final java.util.Collection<com.izettle.android.serialization.JsonElement> values;

    public JsonObject() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.keyValuePairs = linkedHashMap;
        this.keys = linkedHashMap.keySet();
        this.values = linkedHashMap.values();
        this.entries = linkedHashMap.entrySet();
    }

    public final java.util.Set<java.lang.String> getKeys() {
        return this.keys;
    }

    public final java.util.Collection<com.izettle.android.serialization.JsonElement> getValues() {
        return this.values;
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.String, com.izettle.android.serialization.JsonElement>> getEntries() {
        return this.entries;
    }

    public final void set(java.lang.String key, com.izettle.android.serialization.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.keyValuePairs.put(key, value);
    }

    public final com.izettle.android.serialization.JsonElement get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.keyValuePairs.get(key);
    }

    public final boolean containsKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.keyValuePairs.containsKey(key);
    }

    public final com.izettle.android.serialization.JsonObject put(java.lang.String key, com.izettle.android.serialization.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.keyValuePairs.put(key, value);
        return this;
    }

    public final com.izettle.android.serialization.JsonObject remove(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.keyValuePairs.remove(key);
        return this;
    }

    public final java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.keyValuePairs.entrySet(), ",", "{", "}", 0, null, new kotlin.jvm.functions.Function1<java.util.Map.Entry<java.lang.String, com.izettle.android.serialization.JsonElement>, java.lang.CharSequence>() { // from class: com.izettle.android.serialization.JsonObject$toString$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.CharSequence invoke(java.util.Map.Entry<java.lang.String, com.izettle.android.serialization.JsonElement> entry) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
                java.lang.String key = entry.getKey();
                com.izettle.android.serialization.JsonElement value = entry.getValue();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
                sb.append(key);
                sb.append("\":");
                sb.append(value);
                return sb.toString();
            }
        }, 24, null);
    }
}
