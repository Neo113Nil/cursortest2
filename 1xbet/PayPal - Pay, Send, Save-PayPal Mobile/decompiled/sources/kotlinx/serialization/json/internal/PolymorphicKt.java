package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001ak\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u000026\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u0006*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\"\u001a\u00020!2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "discriminatorName", "serialName", "", "ifPolymorphic", "encodePolymorphically", "(Lkotlinx/serialization/json/JsonEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "checkKind", "(Lkotlinx/serialization/descriptors/SerialKind;)V", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkotlin/Function0;", "path", "decodeSerializableValuePolymorphic", "(Lkotlinx/serialization/json/JsonDecoder;Lkotlinx/serialization/DeserializationStrategy;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/Json;", "json", "classDiscriminator", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "element", "", "throwJsonElementPolymorphicException", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Void;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PolymorphicKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r4.getJson().getConfiguration().getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void encodePolymorphically(kotlinx.serialization.json.JsonEncoder jsonEncoder, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy, T t, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2) {
        java.lang.String classDiscriminator;
        kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonEncoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (jsonEncoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializationStrategy.serialize(jsonEncoder, t);
            return;
        }
        boolean z = serializationStrategy instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer;
        if (!z) {
            int i = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[jsonEncoder.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlinx.serialization.descriptors.SerialKind kind = serializationStrategy.getDescriptor().getKind();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE)) {
                }
                classDiscriminator = classDiscriminator(serializationStrategy.getDescriptor(), jsonEncoder.getJson());
            }
            classDiscriminator = null;
        }
        if (z) {
            kotlinx.serialization.internal.AbstractPolymorphicSerializer abstractPolymorphicSerializer = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) serializationStrategy;
            if (t == 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Value for serializer ");
                sb.append(abstractPolymorphicSerializer.getDescriptor());
                sb.append(" should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            serializationStrategy2 = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, jsonEncoder, t);
            kotlin.jvm.internal.Intrinsics.checkNotNull(serializationStrategy2, "");
        } else {
            serializationStrategy2 = serializationStrategy;
        }
        if (classDiscriminator != null) {
            access$checkEncodingConflicts(jsonEncoder.getJson(), serializationStrategy, serializationStrategy2, classDiscriminator);
            checkKind(serializationStrategy2.getDescriptor().getKind());
            function2.invoke(classDiscriminator, serializationStrategy2.getDescriptor().getGetHighSpeedVideoSizes());
        }
        serializationStrategy2.serialize(jsonEncoder, t);
    }

    public static final void checkKind(kotlinx.serialization.descriptors.SerialKind serialKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialKind, "");
        if (serialKind instanceof kotlinx.serialization.descriptors.SerialKind.ENUM) {
            throw new java.lang.IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (serialKind instanceof kotlinx.serialization.descriptors.PrimitiveKind) {
            throw new java.lang.IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (serialKind instanceof kotlinx.serialization.descriptors.PolymorphicKind) {
            throw new java.lang.IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final <T> T decodeSerializableValuePolymorphic(kotlinx.serialization.json.JsonDecoder jsonDecoder, kotlinx.serialization.DeserializationStrategy<? extends T> deserializationStrategy, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonDecoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (!(deserializationStrategy instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer) || jsonDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializationStrategy.deserialize(jsonDecoder);
        }
        kotlinx.serialization.internal.AbstractPolymorphicSerializer abstractPolymorphicSerializer = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializationStrategy;
        java.lang.String classDiscriminator = classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), jsonDecoder.getJson());
        kotlinx.serialization.json.JsonElement decodeJsonElement = jsonDecoder.decodeJsonElement();
        java.lang.String getHighSpeedVideoSizes = abstractPolymorphicSerializer.getDescriptor().getGetHighSpeedVideoSizes();
        if (decodeJsonElement instanceof kotlinx.serialization.json.JsonObject) {
            kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) decodeJsonElement;
            kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) classDiscriminator);
            try {
                kotlinx.serialization.DeserializationStrategy findPolymorphicSerializer = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer((kotlinx.serialization.internal.AbstractPolymorphicSerializer) deserializationStrategy, jsonDecoder, (jsonElement == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : kotlinx.serialization.json.JsonElementKt.getContentOrNull(jsonPrimitive));
                kotlin.jvm.internal.Intrinsics.checkNotNull(findPolymorphicSerializer, "");
                return (T) kotlinx.serialization.json.internal.TreeJsonDecoderKt.readPolymorphicJson(jsonDecoder.getJson(), classDiscriminator, jsonObject, findPolymorphicSerializer);
            } catch (kotlinx.serialization.SerializationException e) {
                java.lang.String message = e.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNull(message);
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonObject.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(getHighSpeedVideoSizes);
        sb.append(" at element: ");
        sb.append(function0.invoke());
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), decodeJsonElement.toString());
    }

    public static final java.lang.String classDiscriminator(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        for (java.lang.annotation.Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof kotlinx.serialization.json.JsonClassDiscriminator) {
                return ((kotlinx.serialization.json.JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    public static final java.lang.Void throwJsonElementPolymorphicException(java.lang.String str, kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class with serial name ");
        sb.append(str);
        sb.append(" cannot be serialized polymorphically because it is represented as ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName());
        sb.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new kotlinx.serialization.json.internal.JsonEncodingException(sb.toString());
    }

    public static final /* synthetic */ void access$checkEncodingConflicts(kotlinx.serialization.json.Json json, kotlinx.serialization.SerializationStrategy serializationStrategy, kotlinx.serialization.SerializationStrategy serializationStrategy2, java.lang.String str) {
        java.lang.String obj;
        if (kotlinx.serialization.json.internal.JsonNamesMapKt.getJsonEncodedNames(serializationStrategy2.getDescriptor(), json).contains(str)) {
            java.lang.String getHighSpeedVideoSizes = serializationStrategy.getDescriptor().getGetHighSpeedVideoSizes();
            java.lang.String getHighSpeedVideoSizes2 = serializationStrategy2.getDescriptor().getGetHighSpeedVideoSizes();
            if (json.getConfiguration().getClassDiscriminatorMode() == kotlinx.serialization.json.ClassDiscriminatorMode.ALL_JSON_OBJECTS && kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoSizes, getHighSpeedVideoSizes2)) {
                obj = "in ALL_JSON_OBJECTS class discriminator mode";
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("as base class '");
                sb.append(getHighSpeedVideoSizes);
                sb.append('\'');
                obj = sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Class '");
            sb2.append(getHighSpeedVideoSizes2);
            sb2.append("' cannot be serialized ");
            sb2.append(obj);
            sb2.append(" because it has property name that conflicts with JSON class discriminator '");
            sb2.append(str);
            sb2.append("'. You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            throw new kotlinx.serialization.json.internal.JsonEncodingException(sb2.toString());
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
    public static final /* synthetic */ class WhenMappings {
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
}
