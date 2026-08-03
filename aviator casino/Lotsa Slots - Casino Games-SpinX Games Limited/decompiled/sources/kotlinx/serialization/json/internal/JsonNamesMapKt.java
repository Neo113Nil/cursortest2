package kotlinx.serialization.json.internal;

/* compiled from: JsonNamesMap.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0000\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0012*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0017\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u001b\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0000\u001a&\u0010\u001c\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u0000\u001ac\u0010\u001e\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00042!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b!\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u001a0 2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020&0$H\u0080\bø\u0001\u0000\u001a\u0014\u0010'\u001a\u00020\u001a*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\"&\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\" \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"JsonDeserializationNamesKey", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "", "", "", "getJsonDeserializationNamesKey", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "JsonSerializationNamesKey", "", "getJsonSerializationNamesKey", "buildDeserializationNamesMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "json", "Lkotlinx/serialization/json/Json;", "deserializationNamesMap", "descriptor", "serializationNamesIndices", com.ironsource.X3.f.e, "Lkotlinx/serialization/json/JsonNamingStrategy;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonNamingStrategy;)[Ljava/lang/String;", "getJsonElementName", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "namingStrategy", "getJsonNameIndexSlowPath", "name", "decodeCaseInsensitive", "", "getJsonNameIndex", "getJsonNameIndexOrThrow", "suffix", "tryCoerceValue", "peekNull", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "consume", "peekString", "Lkotlin/Function0;", "onEnumCoercing", "", "ignoreUnknownKeys", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonNamesMapKt {
    private static final kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.util.Map<java.lang.String, java.lang.Integer>> JsonDeserializationNamesKey = new kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<>();
    private static final kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.String[]> JsonSerializationNamesKey = new kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<>();

    public static final kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.util.Map<java.lang.String, java.lang.Integer>> getJsonDeserializationNamesKey() {
        return JsonDeserializationNamesKey;
    }

    public static final kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.String[]> getJsonSerializationNamesKey() {
        return JsonSerializationNamesKey;
    }

    private static final void buildDeserializationNamesMap$putOrThrow(java.util.Map<java.lang.String, java.lang.Integer> map, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, java.lang.String str, int i) {
        java.lang.String str2 = kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) ? "enum value" : "property";
        if (map.containsKey(str)) {
            throw new kotlinx.serialization.json.internal.JsonException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.getElementName(i) + " is already one of the names for " + str2 + ' ' + serialDescriptor.getElementName(((java.lang.Number) kotlin.collections.MapsKt.getValue(map, str)).intValue()) + " in " + serialDescriptor);
        }
        map.put(str, java.lang.Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map<java.lang.String, java.lang.Integer> buildDeserializationNamesMap(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json) {
        java.lang.String serialNameForJson;
        java.lang.String[] names;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean decodeCaseInsensitive = decodeCaseInsensitive(json, serialDescriptor);
        kotlinx.serialization.json.JsonNamingStrategy namingStrategy = namingStrategy(serialDescriptor, json);
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            java.util.List<java.lang.annotation.Annotation> elementAnnotations = serialDescriptor.getElementAnnotations(i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : elementAnnotations) {
                if (obj instanceof kotlinx.serialization.json.JsonNames) {
                    arrayList.add(obj);
                }
            }
            kotlinx.serialization.json.JsonNames jsonNames = (kotlinx.serialization.json.JsonNames) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) arrayList);
            if (jsonNames != null && (names = jsonNames.names()) != null) {
                for (java.lang.String str : names) {
                    if (decodeCaseInsensitive) {
                        str = str.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    }
                    buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, str, i);
                }
            }
            if (decodeCaseInsensitive) {
                serialNameForJson = serialDescriptor.getElementName(i).toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialNameForJson, "toLowerCase(...)");
            } else {
                serialNameForJson = namingStrategy != null ? namingStrategy.serialNameForJson(serialDescriptor, i, serialDescriptor.getElementName(i)) : null;
            }
            if (serialNameForJson != null) {
                buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, serialNameForJson, i);
            }
        }
        return linkedHashMap.isEmpty() ? kotlin.collections.MapsKt.emptyMap() : linkedHashMap;
    }

    public static final java.util.Map<java.lang.String, java.lang.Integer> deserializationNamesMap(final kotlinx.serialization.json.Json json, final kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (java.util.Map) kotlinx.serialization.json.JsonSchemaCacheKt.getSchemaCache(json).getOrPut(descriptor, JsonDeserializationNamesKey, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Map buildDeserializationNamesMap;
                buildDeserializationNamesMap = kotlinx.serialization.json.internal.JsonNamesMapKt.buildDeserializationNamesMap(kotlinx.serialization.descriptors.SerialDescriptor.this, json);
                return buildDeserializationNamesMap;
            }
        });
    }

    public static final java.lang.String[] serializationNamesIndices(final kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, final kotlinx.serialization.json.JsonNamingStrategy strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        return (java.lang.String[]) kotlinx.serialization.json.JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonSerializationNamesKey, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String[] serializationNamesIndices$lambda$4;
                serializationNamesIndices$lambda$4 = kotlinx.serialization.json.internal.JsonNamesMapKt.serializationNamesIndices$lambda$4(kotlinx.serialization.descriptors.SerialDescriptor.this, strategy);
                return serializationNamesIndices$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String[] serializationNamesIndices$lambda$4(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.JsonNamingStrategy jsonNamingStrategy) {
        int elementsCount = serialDescriptor.getElementsCount();
        java.lang.String[] strArr = new java.lang.String[elementsCount];
        for (int i = 0; i < elementsCount; i++) {
            strArr[i] = jsonNamingStrategy.serialNameForJson(serialDescriptor, i, serialDescriptor.getElementName(i));
        }
        return strArr;
    }

    public static final java.lang.String getJsonElementName(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlinx.serialization.json.JsonNamingStrategy namingStrategy = namingStrategy(serialDescriptor, json);
        return namingStrategy == null ? serialDescriptor.getElementName(i) : serializationNamesIndices(serialDescriptor, json, namingStrategy)[i];
    }

    public static final kotlinx.serialization.json.JsonNamingStrategy namingStrategy(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        if (kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE)) {
            return json.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    private static final int getJsonNameIndexSlowPath(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, java.lang.String str) {
        java.lang.Integer num = deserializationNamesMap(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private static final boolean decodeCaseInsensitive(kotlinx.serialization.json.Json json, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        return json.getConfiguration().getDecodeEnumsCaseInsensitive() && kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE);
    }

    public static final int getJsonNameIndex(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        if (decodeCaseInsensitive(json, serialDescriptor)) {
            java.lang.String lowerCase = name.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return getJsonNameIndexSlowPath(serialDescriptor, json, lowerCase);
        }
        if (namingStrategy(serialDescriptor, json) != null) {
            return getJsonNameIndexSlowPath(serialDescriptor, json, name);
        }
        int elementIndex = serialDescriptor.getElementIndex(name);
        return (elementIndex == -3 && json.getConfiguration().getUseAlternativeNames()) ? getJsonNameIndexSlowPath(serialDescriptor, json, name) : elementIndex;
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    public static final int getJsonNameIndexOrThrow(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, java.lang.String name, java.lang.String suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, name);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new kotlinx.serialization.SerializationException(serialDescriptor.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ boolean tryCoerceValue$default(kotlinx.serialization.json.Json json, kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i, kotlin.jvm.functions.Function1 peekNull, kotlin.jvm.functions.Function0 peekString, kotlin.jvm.functions.Function0 onEnumCoercing, int i2, java.lang.Object obj) {
        java.lang.String str;
        if ((i2 & 16) != 0) {
            onEnumCoercing = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$tryCoerceValue$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peekString, "peekString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        boolean isElementOptional = descriptor.isElementOptional(i);
        kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i);
        if (isElementOptional && !elementDescriptor.isNullable() && ((java.lang.Boolean) peekNull.invoke(true)).booleanValue()) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(elementDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((java.lang.Boolean) peekNull.invoke(false)).booleanValue()) || (str = (java.lang.String) peekString.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, str);
        boolean z = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (isElementOptional || z)) {
            onEnumCoercing.invoke();
            return true;
        }
        return false;
    }

    public static final boolean tryCoerceValue(kotlinx.serialization.json.Json json, kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i, kotlin.jvm.functions.Function1<? super java.lang.Boolean, java.lang.Boolean> peekNull, kotlin.jvm.functions.Function0<java.lang.String> peekString, kotlin.jvm.functions.Function0<kotlin.Unit> onEnumCoercing) {
        java.lang.String invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(peekString, "peekString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        boolean isElementOptional = descriptor.isElementOptional(i);
        kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i);
        if (isElementOptional && !elementDescriptor.isNullable() && peekNull.invoke(true).booleanValue()) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(elementDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && peekNull.invoke(false).booleanValue()) || (invoke = peekString.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, invoke);
        boolean z = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (isElementOptional || z)) {
            onEnumCoercing.invoke();
            return true;
        }
        return false;
    }

    public static final boolean ignoreUnknownKeys(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        if (!json.getConfiguration().getIgnoreUnknownKeys()) {
            java.util.List<java.lang.annotation.Annotation> annotations = serialDescriptor.getAnnotations();
            if (!(annotations instanceof java.util.Collection) || !annotations.isEmpty()) {
                java.util.Iterator<T> it = annotations.iterator();
                while (it.hasNext()) {
                    if (((java.lang.annotation.Annotation) it.next()) instanceof kotlinx.serialization.json.JsonIgnoreUnknownKeys) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
