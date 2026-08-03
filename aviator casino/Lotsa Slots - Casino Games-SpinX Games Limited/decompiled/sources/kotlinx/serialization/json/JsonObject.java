package kotlinx.serialization.json;

/* compiled from: JsonElement.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\"B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0011\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0001J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0003J\t\u0010\u0013\u001a\u00020\bH\u0096\u0001R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00160\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0012\u0010\u001b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonElement;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "equals", "", "other", "", "hashCode", "", "toString", "containsKey", com.ironsource.X3.i.W, "containsValue", "value", "get", "isEmpty", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "getKeys", "size", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.serialization.json.JsonObjectSerializer.class)
/* loaded from: classes6.dex */
public final class JsonObject extends kotlinx.serialization.json.JsonElement implements java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.serialization.json.JsonObject.Companion INSTANCE = new kotlinx.serialization.json.JsonObject.Companion(null);
    private final java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> content;

    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement compute(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: compute, reason: avoid collision after fix types in other method */
    public kotlinx.serialization.json.JsonElement compute2(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement computeIfAbsent(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends kotlinx.serialization.json.JsonElement> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public kotlinx.serialization.json.JsonElement computeIfAbsent2(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends kotlinx.serialization.json.JsonElement> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement computeIfPresent(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public kotlinx.serialization.json.JsonElement computeIfPresent2(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.content.containsKey(key);
    }

    public boolean containsValue(kotlinx.serialization.json.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return this.content.containsValue(value);
    }

    public kotlinx.serialization.json.JsonElement get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.content.get(key);
    }

    public java.util.Set<java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement>> getEntries() {
        return this.content.entrySet();
    }

    public java.util.Set<java.lang.String> getKeys() {
        return this.content.keySet();
    }

    public int getSize() {
        return this.content.size();
    }

    public java.util.Collection<kotlinx.serialization.json.JsonElement> getValues() {
        return this.content.values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement merge(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement, java.util.function.BiFunction<? super kotlinx.serialization.json.JsonElement, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    public kotlinx.serialization.json.JsonElement merge2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement, java.util.function.BiFunction<? super kotlinx.serialization.json.JsonElement, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement put(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public kotlinx.serialization.json.JsonElement put2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends kotlinx.serialization.json.JsonElement> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement putIfAbsent(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public kotlinx.serialization.json.JsonElement putIfAbsent2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public kotlinx.serialization.json.JsonElement remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement replace(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public kotlinx.serialization.json.JsonElement replace2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement, kotlinx.serialization.json.JsonElement jsonElement2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement, kotlinx.serialization.json.JsonElement jsonElement2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.JsonElement, ? extends kotlinx.serialization.json.JsonElement> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* compiled from: JsonElement.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonObject> serializer() {
            return kotlinx.serialization.json.JsonObjectSerializer.INSTANCE;
        }
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
    public final /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.JsonElement>> entrySet() {
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
    public final /* bridge */ java.util.Set<java.lang.String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<kotlinx.serialization.json.JsonElement> values() {
        return getValues();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(java.util.Map<java.lang.String, ? extends kotlinx.serialization.json.JsonElement> content) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, other);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    public java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.content.entrySet(), ",", "{", "}", 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.json.JsonObject$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence string$lambda$1;
                string$lambda$1 = kotlinx.serialization.json.JsonObject.toString$lambda$1((java.util.Map.Entry) obj);
                return string$lambda$1;
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence toString$lambda$1(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "<destruct>");
        java.lang.String str = (java.lang.String) entry.getKey();
        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) entry.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlinx.serialization.json.internal.StringOpsKt.printQuoted(sb, str);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(jsonElement);
        return sb.toString();
    }
}
