package kotlinx.serialization.json.internal;

/* compiled from: TreeJsonDecoder.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000fH\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "json", "Lkotlinx/serialization/json/Json;", "value", "Lkotlinx/serialization/json/JsonObject;", "polymorphicDiscriminator", "", "polyDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getValue", "()Lkotlinx/serialization/json/JsonObject;", "position", "", "forceNull", "", "decodeElementIndex", "descriptor", "setForceNull", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "decodeNotNullMark", "elementName", "currentElement", "Lkotlinx/serialization/json/JsonElement;", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "currentElementOrNull", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "endStructure", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
class JsonTreeDecoder extends kotlinx.serialization.json.internal.AbstractJsonTreeDecoder {
    private boolean forceNull;
    private final kotlinx.serialization.descriptors.SerialDescriptor polyDescriptor;
    private int position;
    private final kotlinx.serialization.json.JsonObject value;

    public /* synthetic */ JsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public kotlinx.serialization.json.JsonObject getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonObject value, java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        super(json, value, str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.polyDescriptor = serialDescriptor;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i = this.position;
            this.position = i + 1;
            java.lang.String tag = getTag(descriptor, i);
            int i2 = this.position - 1;
            this.forceNull = false;
            if (getValue().containsKey((java.lang.Object) tag) || setForceNull(descriptor, i2)) {
                if (!this.configuration.getCoerceInputValues()) {
                    return i2;
                }
                kotlinx.serialization.json.Json json = getJson();
                boolean isElementOptional = descriptor.isElementOptional(i2);
                kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i2);
                if (!isElementOptional || elementDescriptor.isNullable() || !(currentElementOrNull(tag) instanceof kotlinx.serialization.json.JsonNull)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(elementDescriptor.getKind(), kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE) && (!elementDescriptor.isNullable() || !(currentElementOrNull(tag) instanceof kotlinx.serialization.json.JsonNull))) {
                        kotlinx.serialization.json.JsonElement currentElementOrNull = currentElementOrNull(tag);
                        kotlinx.serialization.json.JsonPrimitive jsonPrimitive = currentElementOrNull instanceof kotlinx.serialization.json.JsonPrimitive ? (kotlinx.serialization.json.JsonPrimitive) currentElementOrNull : null;
                        java.lang.String contentOrNull = jsonPrimitive != null ? kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive) : null;
                        if (contentOrNull != null) {
                            int jsonNameIndex = kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, contentOrNull);
                            boolean z = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
                            if (jsonNameIndex == -3 && ((isElementOptional || z) && !setForceNull(descriptor, i2))) {
                            }
                        }
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    private final boolean setForceNull(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        boolean z = (getJson().getConfiguration().getExplicitNulls() || descriptor.isElementOptional(index) || !descriptor.getElementDescriptor(index).isNullable()) ? false : true;
        this.forceNull = z;
        return z;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !this.forceNull && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    protected java.lang.String elementName(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int index) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.JsonNamingStrategy namingStrategy = kotlinx.serialization.json.internal.JsonNamesMapKt.namingStrategy(descriptor, getJson());
        java.lang.String elementName = descriptor.getElementName(index);
        if (namingStrategy == null && (!this.configuration.getUseAlternativeNames() || getValue().keySet().contains(elementName))) {
            return elementName;
        }
        java.util.Map<java.lang.String, java.lang.Integer> deserializationNamesMap = kotlinx.serialization.json.internal.JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor);
        java.util.Iterator<T> it = getValue().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.lang.Integer num = deserializationNamesMap.get((java.lang.String) obj);
            if (num != null && num.intValue() == index) {
                break;
            }
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            return str;
        }
        java.lang.String serialNameForJson = namingStrategy != null ? namingStrategy.serialNameForJson(descriptor, index, elementName) : null;
        return serialNameForJson == null ? elementName : serialNameForJson;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public kotlinx.serialization.json.JsonElement currentElement(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        return (kotlinx.serialization.json.JsonElement) kotlin.collections.MapsKt.getValue(getValue(), tag);
    }

    public final kotlinx.serialization.json.JsonElement currentElementOrNull(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        return (kotlinx.serialization.json.JsonElement) getValue().get((java.lang.Object) tag);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public kotlinx.serialization.encoding.CompositeDecoder beginStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor == this.polyDescriptor) {
            kotlinx.serialization.json.Json json = getJson();
            kotlinx.serialization.json.internal.JsonTreeDecoder jsonTreeDecoder = this;
            kotlinx.serialization.json.JsonElement currentObject = currentObject();
            java.lang.String serialName = this.polyDescriptor.getSerialName();
            if (currentObject instanceof kotlinx.serialization.json.JsonObject) {
                return new kotlinx.serialization.json.internal.JsonTreeDecoder(json, (kotlinx.serialization.json.JsonObject) currentObject, getPolymorphicDiscriminator(), this.polyDescriptor);
            }
            throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + jsonTreeDecoder.renderTagStack(), currentObject.toString());
        }
        return super.beginStructure(descriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        java.util.Set<java.lang.String> plus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (kotlinx.serialization.json.internal.JsonNamesMapKt.ignoreUnknownKeys(descriptor, getJson()) || (descriptor.getKind() instanceof kotlinx.serialization.descriptors.PolymorphicKind)) {
            return;
        }
        kotlinx.serialization.json.JsonNamingStrategy namingStrategy = kotlinx.serialization.json.internal.JsonNamesMapKt.namingStrategy(descriptor, getJson());
        if (namingStrategy == null && !this.configuration.getUseAlternativeNames()) {
            plus = kotlinx.serialization.internal.JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
        } else if (namingStrategy != null) {
            plus = kotlinx.serialization.json.internal.JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor).keySet();
        } else {
            java.util.Set<java.lang.String> jsonCachedSerialNames = kotlinx.serialization.internal.JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            java.util.Map map = (java.util.Map) kotlinx.serialization.json.JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonDeserializationNamesKey());
            java.util.Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = kotlin.collections.SetsKt.emptySet();
            }
            plus = kotlin.collections.SetsKt.plus((java.util.Set) jsonCachedSerialNames, (java.lang.Iterable) keySet);
        }
        for (java.lang.String str : getValue().keySet()) {
            if (!plus.contains(str) && !kotlin.jvm.internal.Intrinsics.areEqual(str, getPolymorphicDiscriminator())) {
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Encountered an unknown key '" + str + "' at element: " + renderTagStack() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) kotlinx.serialization.json.internal.JsonExceptionsKt.minify$default(getValue().toString(), 0, 1, null)));
            }
        }
    }
}
