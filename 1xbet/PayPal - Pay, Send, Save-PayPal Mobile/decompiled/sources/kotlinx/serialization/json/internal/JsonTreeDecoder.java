package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010&"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlinx/serialization/json/JsonObject;", "p1", "", "p2", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "p3", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "Camera2StreamConfigurationMap", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "decodeNotNullMark", "()Z", "elementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/JsonObject;", "()Lkotlinx/serialization/json/JsonObject;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
class JsonTreeDecoder extends kotlinx.serialization.json.internal.AbstractJsonTreeDecoder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;
    private final kotlinx.serialization.json.JsonObject getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.descriptors.SerialDescriptor getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ JsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter and merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.JsonObject getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        super(json, jsonObject, str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
        this.getHighSpeedVideoFpsRangesFor = jsonObject;
        this.getHighResolutionOutputSizeshNQ4ISI = serialDescriptor;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        while (this.getHighSpeedVideoSizes < p0.getElementsCount()) {
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i + 1;
            java.lang.String tag = getTag(p0, i);
            int i2 = this.getHighSpeedVideoSizes - 1;
            boolean z = false;
            this.getHighSpeedVideoFpsRanges = false;
            if (getGetHighSpeedVideoSizes().containsKey((java.lang.Object) tag) || Camera2StreamConfigurationMap(p0, i2)) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.getCoerceInputValues()) {
                    kotlinx.serialization.json.Json json = getJson();
                    boolean isElementOptional = p0.isElementOptional(i2);
                    kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor = p0.getElementDescriptor(i2);
                    if (isElementOptional && !elementDescriptor.isNullable()) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
                        if (((kotlinx.serialization.json.JsonElement) getGetHighSpeedVideoSizes().get((java.lang.Object) tag)) instanceof kotlinx.serialization.json.JsonNull) {
                            continue;
                        }
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(elementDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE)) {
                        if (elementDescriptor.isNullable()) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
                            if (((kotlinx.serialization.json.JsonElement) getGetHighSpeedVideoSizes().get((java.lang.Object) tag)) instanceof kotlinx.serialization.json.JsonNull) {
                                return i2;
                            }
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
                        kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) getGetHighSpeedVideoSizes().get((java.lang.Object) tag);
                        kotlinx.serialization.json.JsonPrimitive jsonPrimitive = jsonElement instanceof kotlinx.serialization.json.JsonPrimitive ? (kotlinx.serialization.json.JsonPrimitive) jsonElement : null;
                        java.lang.String contentOrNull = jsonPrimitive != null ? kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive) : null;
                        if (contentOrNull == null) {
                            return i2;
                        }
                        int jsonNameIndex = kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, contentOrNull);
                        if (!json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable()) {
                            z = true;
                        }
                        if (jsonNameIndex == -3 && ((isElementOptional || z) && !Camera2StreamConfigurationMap(p0, i2))) {
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    private final boolean Camera2StreamConfigurationMap(kotlinx.serialization.descriptors.SerialDescriptor p0, int p1) {
        boolean z = (getJson().getConfiguration().getExplicitNulls() || p0.isElementOptional(p1) || !p0.getElementDescriptor(p1).isNullable()) ? false : true;
        this.getHighSpeedVideoFpsRanges = z;
        return z;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !this.getHighSpeedVideoFpsRanges && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public java.lang.String elementName(kotlinx.serialization.descriptors.SerialDescriptor p0, int p1) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.json.JsonNamingStrategy namingStrategy = kotlinx.serialization.json.internal.JsonNamesMapKt.namingStrategy(p0, getJson());
        java.lang.String elementName = p0.getElementName(p1);
        if (namingStrategy != null || (this.getHighResolutionOutputSizeshNQ4ISI.getUseAlternativeNames() && !getGetHighSpeedVideoSizes().keySet().contains(elementName))) {
            java.util.Map<java.lang.String, java.lang.Integer> deserializationNamesMap = kotlinx.serialization.json.internal.JsonNamesMapKt.deserializationNamesMap(getJson(), p0);
            java.util.Iterator<T> it = getGetHighSpeedVideoSizes().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.Integer num = deserializationNamesMap.get((java.lang.String) obj);
                if (num != null && num.intValue() == p1) {
                    break;
                }
            }
            java.lang.String str = (java.lang.String) obj;
            if (str != null) {
                return str;
            }
            java.lang.String serialNameForJson = namingStrategy != null ? namingStrategy.serialNameForJson(p0, p1, elementName) : null;
            if (serialNameForJson != null) {
                return serialNameForJson;
            }
        }
        return elementName;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    protected kotlinx.serialization.json.JsonElement getHighSpeedVideoFpsRanges(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return (kotlinx.serialization.json.JsonElement) kotlin.collections.MapsKt.getValue(getGetHighSpeedVideoSizes(), p0);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        if (p0 == this.getHighResolutionOutputSizeshNQ4ISI) {
            kotlinx.serialization.json.Json json = getJson();
            kotlinx.serialization.json.internal.JsonTreeDecoder jsonTreeDecoder = this;
            kotlinx.serialization.json.JsonElement Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            java.lang.String getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoSizes();
            if (Camera2StreamConfigurationMap instanceof kotlinx.serialization.json.JsonObject) {
                return new kotlinx.serialization.json.internal.JsonTreeDecoder(json, (kotlinx.serialization.json.JsonObject) Camera2StreamConfigurationMap, getCamera2StreamConfigurationMap(), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName());
            sb.append(", but had ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(Camera2StreamConfigurationMap.getClass()).getSimpleName());
            sb.append(" as the serialized body of ");
            sb.append(getHighSpeedVideoSizes);
            sb.append(" at element: ");
            sb.append(jsonTreeDecoder.renderTagStack());
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), Camera2StreamConfigurationMap.toString());
        }
        return super.beginStructure(p0);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        java.util.Set<java.lang.String> plus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        if (kotlinx.serialization.json.internal.JsonNamesMapKt.ignoreUnknownKeys(p0, getJson()) || (p0.getKind() instanceof kotlinx.serialization.descriptors.PolymorphicKind)) {
            return;
        }
        kotlinx.serialization.json.JsonNamingStrategy namingStrategy = kotlinx.serialization.json.internal.JsonNamesMapKt.namingStrategy(p0, getJson());
        if (namingStrategy == null && !this.getHighResolutionOutputSizeshNQ4ISI.getUseAlternativeNames()) {
            plus = kotlinx.serialization.internal.JsonInternalDependenciesKt.jsonCachedSerialNames(p0);
        } else if (namingStrategy != null) {
            plus = kotlinx.serialization.json.internal.JsonNamesMapKt.deserializationNamesMap(getJson(), p0).keySet();
        } else {
            java.util.Set<java.lang.String> jsonCachedSerialNames = kotlinx.serialization.internal.JsonInternalDependenciesKt.jsonCachedSerialNames(p0);
            java.util.Map map = (java.util.Map) kotlinx.serialization.json.JsonSchemaCacheKt.getSchemaCache(getJson()).get(p0, kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonDeserializationNamesKey());
            java.util.Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = kotlin.collections.SetsKt.emptySet();
            }
            plus = kotlin.collections.SetsKt.plus((java.util.Set) jsonCachedSerialNames, (java.lang.Iterable) keySet);
        }
        for (java.lang.String str : getGetHighSpeedVideoSizes().keySet()) {
            if (!plus.contains(str) && !kotlin.jvm.internal.Intrinsics.areEqual(str, getCamera2StreamConfigurationMap())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Encountered an unknown key '");
                sb.append(str);
                sb.append("' at element: ");
                sb.append(renderTagStack());
                sb.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sb.append((java.lang.Object) kotlinx.serialization.json.internal.JsonExceptionsKt.minify$default(getGetHighSpeedVideoSizes().toString(), 0, 1, null));
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString());
            }
        }
    }
}
