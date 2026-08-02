package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001)B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001d0\u001c8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010\u000eR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010%8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'"}, d2 = {"Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonElement;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "key", "containsKey", "(Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "(Lkotlinx/serialization/json/JsonElement;)Z", "get", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "isEmpty", "()Z", "Ljava/util/Map;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "", "getValues", "()Ljava/util/Collection;", "values", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.serialization.json.JsonObjectSerializer.class)
/* loaded from: classes3.dex */
public final class JsonObject extends kotlinx.serialization.json.JsonElement implements java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.serialization.json.JsonObject.Companion INSTANCE = new kotlinx.serialization.json.JsonObject.Companion(null);
    private final java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> content;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonObject> serializer() {
            return kotlinx.serialization.json.JsonObjectSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(java.util.Map<java.lang.String, ? extends kotlinx.serialization.json.JsonElement> map) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.content = map;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof kotlinx.serialization.json.JsonElement) {
            return containsValue((kotlinx.serialization.json.JsonElement) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    /* renamed from: get, reason: avoid collision after fix types in other method */
    public final /* bridge */ kotlinx.serialization.json.JsonElement get2(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final java.util.Collection<kotlinx.serialization.json.JsonElement> values() {
        return getValues();
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, other);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.content.hashCode();
    }

    public final java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.content.entrySet(), ",", "{", "}", 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.json.JsonObject$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.serialization.json.JsonObject.$r8$lambda$8UQicTDKvEOXw6BISW6HiQjevb0((java.util.Map.Entry) obj);
            }
        }, 24, null);
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$8UQicTDKvEOXw6BISW6HiQjevb0(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        java.lang.String str = (java.lang.String) entry.getKey();
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) entry.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlinx.serialization.json.internal.StringOpsKt.printQuoted(sb, str);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(jsonElement);
        return sb.toString();
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public final boolean replace2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement, kotlinx.serialization.json.JsonElement jsonElement2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean replace(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement, kotlinx.serialization.json.JsonElement jsonElement2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public final kotlinx.serialization.json.JsonElement replace2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ kotlinx.serialization.json.JsonElement replace(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final kotlinx.serialization.json.JsonElement remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public final kotlinx.serialization.json.JsonElement putIfAbsent2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ kotlinx.serialization.json.JsonElement putIfAbsent(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.String, ? extends kotlinx.serialization.json.JsonElement> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public final kotlinx.serialization.json.JsonElement put2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ kotlinx.serialization.json.JsonElement put(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    public final kotlinx.serialization.json.JsonElement merge2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement, java.util.function.BiFunction<? super kotlinx.serialization.json.JsonElement, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ kotlinx.serialization.json.JsonElement merge(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement, java.util.function.BiFunction<? super kotlinx.serialization.json.JsonElement, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.content.isEmpty();
    }

    public final java.util.Collection<kotlinx.serialization.json.JsonElement> getValues() {
        return this.content.values();
    }

    public final int getSize() {
        return this.content.size();
    }

    public final java.util.Set<java.lang.String> getKeys() {
        return this.content.keySet();
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement>> getEntries() {
        return this.content.entrySet();
    }

    public final kotlinx.serialization.json.JsonElement get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.content.get(key);
    }

    public final boolean containsValue(kotlinx.serialization.json.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return this.content.containsValue(value);
    }

    public final boolean containsKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.content.containsKey(key);
    }

    /* renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public final kotlinx.serialization.json.JsonElement computeIfPresent2(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ kotlinx.serialization.json.JsonElement computeIfPresent(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public final kotlinx.serialization.json.JsonElement computeIfAbsent2(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends kotlinx.serialization.json.JsonElement> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ kotlinx.serialization.json.JsonElement computeIfAbsent(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends kotlinx.serialization.json.JsonElement> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: compute, reason: avoid collision after fix types in other method */
    public final kotlinx.serialization.json.JsonElement compute2(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ kotlinx.serialization.json.JsonElement compute(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
