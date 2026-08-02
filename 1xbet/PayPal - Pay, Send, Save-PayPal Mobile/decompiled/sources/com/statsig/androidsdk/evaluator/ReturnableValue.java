package com.statsig.androidsdk.evaluator;

@com.google.gson.annotations.JsonAdapter(com.statsig.androidsdk.evaluator.ReturnableValue.CustomSerializer.class)
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "", "", "booleanValue", "", "rawJson", "", "mapValue", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "other", "equals", "(Ljava/lang/Object;)Z", "getValue", "()Ljava/lang/Object;", "", "hashCode", "()I", "toString", "Ljava/lang/Boolean;", "getBooleanValue", "Ljava/util/Map;", "getMapValue", "Ljava/lang/String;", "getRawJson", "CustomSerializer"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ReturnableValue {
    private final java.lang.Boolean booleanValue;
    private final java.util.Map<java.lang.String, java.lang.Object> mapValue;
    private final java.lang.String rawJson;

    public ReturnableValue(java.lang.Boolean bool, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.booleanValue = bool;
        this.rawJson = str;
        this.mapValue = map;
    }

    public final java.lang.Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public /* synthetic */ ReturnableValue(java.lang.Boolean bool, java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? "null" : str, (i & 4) != 0 ? null : map);
    }

    public final java.lang.String getRawJson() {
        return this.rawJson;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getMapValue() {
        return this.mapValue;
    }

    public final java.lang.Object getValue() {
        java.lang.Boolean bool = this.booleanValue;
        if (bool != null) {
            return bool;
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.mapValue;
        if (map != null) {
            return map;
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/statsig/androidsdk/evaluator/ReturnableValue$CustomSerializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/statsig/androidsdk/evaluator/ReturnableValue;", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "serialize", "(Lcom/statsig/androidsdk/evaluator/ReturnableValue;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class CustomSerializer implements com.google.gson.JsonDeserializer<com.statsig.androidsdk.evaluator.ReturnableValue>, com.google.gson.JsonSerializer<com.statsig.androidsdk.evaluator.ReturnableValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public final com.statsig.androidsdk.evaluator.ReturnableValue deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) {
            if (json == null) {
                return new com.statsig.androidsdk.evaluator.ReturnableValue(null, null, null, 7, null);
            }
            if (json.isJsonPrimitive() && json.getAsJsonPrimitive().isBoolean()) {
                boolean asBoolean = json.getAsJsonPrimitive().getAsBoolean();
                java.lang.String obj = json.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return new com.statsig.androidsdk.evaluator.ReturnableValue(java.lang.Boolean.valueOf(asBoolean), obj, null);
            }
            if (json.isJsonObject()) {
                java.util.Map map = context != null ? (java.util.Map) context.deserialize(json.getAsJsonObject(), java.util.Map.class) : null;
                if (map == null) {
                    map = kotlin.collections.MapsKt.emptyMap();
                }
                java.lang.String obj2 = json.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                return new com.statsig.androidsdk.evaluator.ReturnableValue(null, obj2, map);
            }
            return new com.statsig.androidsdk.evaluator.ReturnableValue(null, null, null, 7, null);
        }

        @Override // com.google.gson.JsonSerializer
        public final com.google.gson.JsonElement serialize(com.statsig.androidsdk.evaluator.ReturnableValue src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            if (src == null) {
                com.google.gson.JsonNull jsonNull = com.google.gson.JsonNull.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonNull, "");
                return jsonNull;
            }
            com.google.gson.JsonElement parseString = com.google.gson.JsonParser.parseString(src.getRawJson());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseString, "");
            return parseString;
        }
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.booleanValue;
        java.lang.String str = this.rawJson;
        java.util.Map<java.lang.String, java.lang.Object> map = this.mapValue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReturnableValue(booleanValue=");
        sb.append(bool);
        sb.append(", rawJson=");
        sb.append(str);
        sb.append(", mapValue=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.booleanValue;
        int hashCode = bool == null ? 0 : bool.hashCode();
        int hashCode2 = this.rawJson.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map = this.mapValue;
        return (((hashCode * 31) + hashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.evaluator.ReturnableValue)) {
            return false;
        }
        com.statsig.androidsdk.evaluator.ReturnableValue returnableValue = (com.statsig.androidsdk.evaluator.ReturnableValue) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.booleanValue, returnableValue.booleanValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawJson, returnableValue.rawJson) && kotlin.jvm.internal.Intrinsics.areEqual(this.mapValue, returnableValue.mapValue);
    }

    public final com.statsig.androidsdk.evaluator.ReturnableValue copy(java.lang.Boolean booleanValue, java.lang.String rawJson, java.util.Map<java.lang.String, ? extends java.lang.Object> mapValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawJson, "");
        return new com.statsig.androidsdk.evaluator.ReturnableValue(booleanValue, rawJson, mapValue);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
        return this.mapValue;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRawJson() {
        return this.rawJson;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.statsig.androidsdk.evaluator.ReturnableValue copy$default(com.statsig.androidsdk.evaluator.ReturnableValue returnableValue, java.lang.Boolean bool, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = returnableValue.booleanValue;
        }
        if ((i & 2) != 0) {
            str = returnableValue.rawJson;
        }
        if ((i & 4) != 0) {
            map = returnableValue.mapValue;
        }
        return returnableValue.copy(bool, str, map);
    }

    public ReturnableValue() {
        this(null, null, null, 7, null);
    }
}
