package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "json", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/serialization/SerializationStrategy;", "serializer", "Lkotlinx/serialization/json/JsonElement;", "writeJson", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Lkotlinx/serialization/SerializationStrategy;)Lkotlinx/serialization/json/JsonElement;", "", "serialName", "Lkotlin/Function0;", "path", "cast", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/json/JsonElement;", "PRIMITIVE_TAG", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreeJsonEncoderKt {
    public static final java.lang.String PRIMITIVE_TAG = "primitive";

    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> kotlinx.serialization.json.JsonElement writeJson(kotlinx.serialization.json.Json json, T t, kotlinx.serialization.SerializationStrategy<? super T> serializationStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializationStrategy, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        new kotlinx.serialization.json.internal.JsonTreeEncoder(json, new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.json.internal.TreeJsonEncoderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.serialization.json.internal.TreeJsonEncoderKt.$r8$lambda$ZaxIACq9xWYy8YKLNxcOkgN3pXo(kotlin.jvm.internal.Ref.ObjectRef.this, (kotlinx.serialization.json.JsonElement) obj);
            }
        }).encodeSerializableValue(serializationStrategy, t);
        if (objectRef.element != null) {
            return (kotlinx.serialization.json.JsonElement) objectRef.element;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends kotlinx.serialization.json.JsonElement> T cast(kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
        if (jsonElement instanceof kotlinx.serialization.json.JsonElement) {
            return jsonElement;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonElement.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(str);
        sb.append(" at element: ");
        sb.append(function0.invoke());
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), jsonElement.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$ZaxIACq9xWYy8YKLNxcOkgN3pXo(kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlinx.serialization.json.JsonElement jsonElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        objectRef.element = jsonElement;
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$getRequiresTopLevelTag(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        return (serialDescriptor.getKind() instanceof kotlinx.serialization.descriptors.PrimitiveKind) || serialDescriptor.getKind() == kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE;
    }
}
