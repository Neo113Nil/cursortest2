package kotlinx.serialization.json.internal;

/* compiled from: Polymorphic.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ai\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u000226\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\bH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a(\u0010\u000f\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a7\u0010\u0015\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a\u0014\u0010\u0011\u001a\u00020\t*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u001a\u001a\u0010\u001f\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\"H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"encodePolymorphically", "", "T", "Lkotlinx/serialization/json/JsonEncoder;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "ifPolymorphic", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "discriminatorName", "serialName", "(Lkotlinx/serialization/json/JsonEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "validateIfSealed", "actualSerializer", "classDiscriminator", "checkKind", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "decodeSerializableValuePolymorphic", "Lkotlinx/serialization/json/JsonDecoder;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "path", "Lkotlin/Function0;", "(Lkotlinx/serialization/json/JsonDecoder;Lkotlinx/serialization/DeserializationStrategy;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "json", "Lkotlinx/serialization/json/Json;", "throwJsonElementPolymorphicException", "", "element", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PolymorphicKt {

    /* compiled from: Polymorphic.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.serialization.json.ClassDiscriminatorMode.values().length];
            try {
                iArr[kotlinx.serialization.json.ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.serialization.json.ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.serialization.json.ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r3.getJson().getConfiguration().getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void encodePolymorphically(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.SerializationStrategy<? super T> serializer, T t, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> ifPolymorphic) {
        java.lang.String classDiscriminator;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonEncoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ifPolymorphic, "ifPolymorphic");
        if (jsonEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize(jsonEncoder, t);
            return;
        }
        boolean z = serializer instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer;
        if (!z) {
            int i = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[jsonEncoder.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlinx.serialization.descriptors.SerialKind kind = serializer.getDescriptor().getKind();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE)) {
                }
                classDiscriminator = classDiscriminator(serializer.getDescriptor(), jsonEncoder.getJson());
            }
            classDiscriminator = null;
        }
        if (z) {
            kotlinx.serialization.internal.AbstractPolymorphicSerializer abstractPolymorphicSerializer = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) serializer;
            if (t == 0) {
                throw new java.lang.IllegalArgumentException(("Value for serializer " + abstractPolymorphicSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            kotlinx.serialization.SerializationStrategy<? super T> findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, jsonEncoder, t);
            if (classDiscriminator != null) {
                validateIfSealed(serializer, findPolymorphicSerializer, classDiscriminator);
                checkKind(findPolymorphicSerializer.getDescriptor().getKind());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = findPolymorphicSerializer;
        }
        if (classDiscriminator != null) {
            ifPolymorphic.invoke(classDiscriminator, serializer.getDescriptor().getSerialName());
        }
        serializer.serialize(jsonEncoder, t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateIfSealed(kotlinx.serialization.SerializationStrategy<?> serializationStrategy, kotlinx.serialization.SerializationStrategy<?> serializationStrategy2, java.lang.String str) {
        if ((serializationStrategy instanceof kotlinx.serialization.SealedClassSerializer) && kotlinx.serialization.internal.JsonInternalDependenciesKt.jsonCachedSerialNames(serializationStrategy2.getDescriptor()).contains(str)) {
            java.lang.String serialName = ((kotlinx.serialization.SealedClassSerializer) serializationStrategy).getDescriptor().getSerialName();
            throw new java.lang.IllegalStateException(("Sealed class '" + serializationStrategy2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }

    public static final void checkKind(kotlinx.serialization.descriptors.SerialKind kind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof kotlinx.serialization.descriptors.SerialKind.ENUM) {
            throw new java.lang.IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof kotlinx.serialization.descriptors.PrimitiveKind) {
            throw new java.lang.IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof kotlinx.serialization.descriptors.PolymorphicKind) {
            throw new java.lang.IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final <T> T decodeSerializableValuePolymorphic(kotlinx.serialization.json.JsonDecoder jsonDecoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializer, kotlin.jvm.functions.Function0<java.lang.String> path) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonDecoder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        if (!(deserializer instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer) || jsonDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(jsonDecoder);
        }
        kotlinx.serialization.internal.AbstractPolymorphicSerializer abstractPolymorphicSerializer = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer;
        java.lang.String classDiscriminator = classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), jsonDecoder.getJson());
        kotlinx.serialization.json.JsonElement decodeJsonElement = jsonDecoder.decodeJsonElement();
        java.lang.String serialName = abstractPolymorphicSerializer.getDescriptor().getSerialName();
        if (decodeJsonElement instanceof kotlinx.serialization.json.JsonObject) {
            kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) decodeJsonElement;
            kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) classDiscriminator);
            try {
                kotlinx.serialization.DeserializationStrategy findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializer, jsonDecoder, (jsonElement == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive));
                kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) kotlinx.serialization.json.internal.TreeJsonDecoderKt.readPolymorphicJson(jsonDecoder.getJson(), classDiscriminator, jsonObject, findPolymorphicSerializer);
            } catch (kotlinx.serialization.SerializationException e) {
                java.lang.String message = e.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNull(message);
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
            }
        }
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, "Expected " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName() + ", but had " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + path.invoke(), decodeJsonElement.toString());
    }

    public static final java.lang.String classDiscriminator(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        for (java.lang.annotation.Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof kotlinx.serialization.json.JsonClassDiscriminator) {
                return ((kotlinx.serialization.json.JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    public static final java.lang.Void throwJsonElementPolymorphicException(java.lang.String str, kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        throw new kotlinx.serialization.json.internal.JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(element.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }
}
