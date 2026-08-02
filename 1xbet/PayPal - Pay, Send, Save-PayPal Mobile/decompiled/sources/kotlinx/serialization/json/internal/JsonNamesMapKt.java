package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\t*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aj\u0010%\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00052!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u0016\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001d0\u001c2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040!2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0!H\u0080\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\u00020\u001d*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b'\u0010(\",\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030)8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"&\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0)8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "", "deserializationNamesMap", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", "json", "Lkotlinx/serialization/json/JsonNamingStrategy;", "strategy", "", "serializationNamesIndices", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonNamingStrategy;)[Ljava/lang/String;", "index", "getJsonElementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;I)Ljava/lang/String;", "", "getJsonEncodedNames", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Ljava/util/Set;", "namingStrategy", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/JsonNamingStrategy;", "name", "getJsonNameIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Ljava/lang/String;)I", "suffix", "getJsonNameIndexOrThrow", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Ljava/lang/String;Ljava/lang/String;)I", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "consume", "peekNull", "Lkotlin/Function0;", "peekString", "", "onEnumCoercing", "tryCoerceValue", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z", "ignoreUnknownKeys", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Z", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "JsonDeserializationNamesKey", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "getJsonDeserializationNamesKey", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "JsonSerializationNamesKey", "getJsonSerializationNamesKey"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonNamesMapKt {
    private static final kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.util.Map<java.lang.String, java.lang.Integer>> JsonDeserializationNamesKey = new kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<>();
    private static final kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.String[]> JsonSerializationNamesKey = new kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<>();

    public static final kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.util.Map<java.lang.String, java.lang.Integer>> getJsonDeserializationNamesKey() {
        return JsonDeserializationNamesKey;
    }

    public static final kotlinx.serialization.json.internal.DescriptorSchemaCache.Key<java.lang.String[]> getJsonSerializationNamesKey() {
        return JsonSerializationNamesKey;
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Integer> map, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, java.lang.String str, int i) {
        java.lang.String str2 = kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) ? "enum value" : "property";
        if (map.containsKey(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The suggested name '");
            sb.append(str);
            sb.append("' for ");
            sb.append(str2);
            sb.append(' ');
            sb.append(serialDescriptor.getElementName(i));
            sb.append(" is already one of the names for ");
            sb.append(str2);
            sb.append(' ');
            sb.append(serialDescriptor.getElementName(((java.lang.Number) kotlin.collections.MapsKt.getValue(map, str)).intValue()));
            sb.append(" in ");
            sb.append(serialDescriptor);
            throw new kotlinx.serialization.json.internal.JsonDecodingException(sb.toString());
        }
        map.put(str, java.lang.Integer.valueOf(i));
    }

    public static final java.util.Map<java.lang.String, java.lang.Integer> deserializationNamesMap(final kotlinx.serialization.json.Json json, final kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return (java.util.Map) kotlinx.serialization.json.JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonDeserializationNamesKey, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.serialization.json.internal.JsonNamesMapKt.$r8$lambda$0Wrxba8wq6selDNjX8p_NiECb3A(kotlinx.serialization.descriptors.SerialDescriptor.this, json);
            }
        });
    }

    public static final java.lang.String[] serializationNamesIndices(final kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, final kotlinx.serialization.json.JsonNamingStrategy jsonNamingStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonNamingStrategy, "");
        return (java.lang.String[]) kotlinx.serialization.json.JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonSerializationNamesKey, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.serialization.json.internal.JsonNamesMapKt.m24260$r8$lambda$4Y9X3xk0EwiAxOtgM5IdVRukjk(kotlinx.serialization.descriptors.SerialDescriptor.this, jsonNamingStrategy);
            }
        });
    }

    public static final java.lang.String getJsonElementName(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlinx.serialization.json.JsonNamingStrategy namingStrategy = namingStrategy(serialDescriptor, json);
        return namingStrategy == null ? serialDescriptor.getElementName(i) : serializationNamesIndices(serialDescriptor, json, namingStrategy)[i];
    }

    public static final java.util.Set<java.lang.String> getJsonEncodedNames(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlinx.serialization.json.JsonNamingStrategy namingStrategy = namingStrategy(serialDescriptor, json);
        return namingStrategy == null ? kotlinx.serialization.internal.JsonInternalDependenciesKt.jsonCachedSerialNames(serialDescriptor) : kotlin.collections.ArraysKt.toSet(serializationNamesIndices(serialDescriptor, json, namingStrategy));
    }

    public static final kotlinx.serialization.json.JsonNamingStrategy namingStrategy(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE)) {
            return json.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    public static final int getJsonNameIndexOrThrow(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, str);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(serialDescriptor.getGetHighSpeedVideoSizes());
        sb.append(" does not contain element with name '");
        sb.append(str);
        sb.append('\'');
        sb.append(str2);
        throw new kotlinx.serialization.SerializationException(sb.toString());
    }

    public static /* synthetic */ boolean tryCoerceValue$default(kotlinx.serialization.json.Json json, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i2, java.lang.Object obj) {
        java.lang.String str;
        if ((i2 & 16) != 0) {
            function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$tryCoerceValue$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        boolean isElementOptional = serialDescriptor.isElementOptional(i);
        kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i);
        if (isElementOptional && !elementDescriptor.isNullable() && ((java.lang.Boolean) function1.invoke(java.lang.Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(elementDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((java.lang.Boolean) function1.invoke(java.lang.Boolean.FALSE)).booleanValue()) || (str = (java.lang.String) function0.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, str);
        boolean z = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (isElementOptional || z)) {
            function02.invoke();
            return true;
        }
        return false;
    }

    public static final boolean tryCoerceValue(kotlinx.serialization.json.Json json, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i, kotlin.jvm.functions.Function1<? super java.lang.Boolean, java.lang.Boolean> function1, kotlin.jvm.functions.Function0<java.lang.String> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        java.lang.String invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        boolean isElementOptional = serialDescriptor.isElementOptional(i);
        kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i);
        if (isElementOptional && !elementDescriptor.isNullable() && function1.invoke(java.lang.Boolean.TRUE).booleanValue()) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(elementDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && function1.invoke(java.lang.Boolean.FALSE).booleanValue()) || (invoke = function0.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, invoke);
        boolean z = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (isElementOptional || z)) {
            function02.invoke();
            return true;
        }
        return false;
    }

    public static final boolean ignoreUnknownKeys(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        if (json.getConfiguration().getIgnoreUnknownKeys()) {
            return true;
        }
        java.util.List<java.lang.annotation.Annotation> annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof java.util.Collection) && annotations.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            if (((java.lang.annotation.Annotation) it.next()) instanceof kotlinx.serialization.json.JsonIgnoreUnknownKeys) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ java.util.Map $r8$lambda$0Wrxba8wq6selDNjX8p_NiECb3A(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json) {
        java.lang.String serialNameForJson;
        java.lang.String[] names;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean z = json.getConfiguration().getDecodeEnumsCaseInsensitive() && kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE);
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
                    if (z) {
                        str = str.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    }
                    getHighResolutionOutputSizeshNQ4ISI(linkedHashMap, serialDescriptor, str, i);
                }
            }
            if (z) {
                serialNameForJson = serialDescriptor.getElementName(i).toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialNameForJson, "");
            } else {
                serialNameForJson = namingStrategy != null ? namingStrategy.serialNameForJson(serialDescriptor, i, serialDescriptor.getElementName(i)) : null;
            }
            if (serialNameForJson != null) {
                getHighResolutionOutputSizeshNQ4ISI(linkedHashMap, serialDescriptor, serialNameForJson, i);
            }
        }
        return linkedHashMap.isEmpty() ? kotlin.collections.MapsKt.emptyMap() : linkedHashMap;
    }

    /* renamed from: $r8$lambda$4Y9X3xk0EwiAxOtgM5IdVRuk-jk, reason: not valid java name */
    public static /* synthetic */ java.lang.String[] m24260$r8$lambda$4Y9X3xk0EwiAxOtgM5IdVRukjk(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.JsonNamingStrategy jsonNamingStrategy) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        int elementsCount = serialDescriptor.getElementsCount();
        java.lang.String[] strArr = new java.lang.String[elementsCount];
        for (int i = 0; i < elementsCount; i++) {
            java.lang.String elementName = serialDescriptor.getElementName(i);
            java.lang.String serialNameForJson = jsonNamingStrategy.serialNameForJson(serialDescriptor, i, elementName);
            if (!linkedHashSet.add(serialNameForJson)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The transformed name '");
                sb.append(serialNameForJson);
                sb.append("' for property ");
                sb.append(elementName);
                sb.append(" already exists in ");
                sb.append(serialDescriptor);
                throw new kotlinx.serialization.json.internal.JsonEncodingException(sb.toString());
            }
            strArr[i] = serialNameForJson;
        }
        return strArr;
    }

    public static final int getJsonNameIndex(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (json.getConfiguration().getDecodeEnumsCaseInsensitive() && kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE)) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.Integer num = deserializationNamesMap(json, serialDescriptor).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        if (namingStrategy(serialDescriptor, json) == null) {
            int elementIndex = serialDescriptor.getElementIndex(str);
            if (elementIndex != -3 || !json.getConfiguration().getUseAlternativeNames()) {
                return elementIndex;
            }
            java.lang.Integer num2 = deserializationNamesMap(json, serialDescriptor).get(str);
            if (num2 != null) {
                return num2.intValue();
            }
            return -3;
        }
        java.lang.Integer num3 = deserializationNamesMap(json, serialDescriptor).get(str);
        if (num3 != null) {
            return num3.intValue();
        }
        return -3;
    }
}
