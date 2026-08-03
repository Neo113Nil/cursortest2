package kotlinx.serialization.json.internal;

/* compiled from: TreeJsonEncoder.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a;\u0010\u0010\u001a\u0002H\u0002\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0014\"\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"writeJson", "Lkotlinx/serialization/json/JsonElement;", "T", "json", "Lkotlinx/serialization/json/Json;", "value", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Lkotlinx/serialization/SerializationStrategy;)Lkotlinx/serialization/json/JsonElement;", "requiresTopLevelTag", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getRequiresTopLevelTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "PRIMITIVE_TAG", "", "cast", "serialName", "path", "Lkotlin/Function0;", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TreeJsonEncoderKt {
    public static final java.lang.String PRIMITIVE_TAG = "primitive";

    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static final <T> kotlinx.serialization.json.JsonElement writeJson(kotlinx.serialization.json.Json json, T t, kotlinx.serialization.SerializationStrategy<? super T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        new kotlinx.serialization.json.internal.JsonTreeEncoder(json, new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.json.internal.TreeJsonEncoderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit writeJson$lambda$0;
                writeJson$lambda$0 = kotlinx.serialization.json.internal.TreeJsonEncoderKt.writeJson$lambda$0(kotlin.jvm.internal.Ref.ObjectRef.this, (kotlinx.serialization.json.JsonElement) obj);
                return writeJson$lambda$0;
            }
        }).encodeSerializableValue(serializer, t);
        if (objectRef.element != null) {
            return (kotlinx.serialization.json.JsonElement) objectRef.element;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.Unit writeJson$lambda$0(kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlinx.serialization.json.JsonElement it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        objectRef.element = it;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRequiresTopLevelTag(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        return (serialDescriptor.getKind() instanceof kotlinx.serialization.descriptors.PrimitiveKind) || serialDescriptor.getKind() == kotlinx.serialization.descriptors.SerialKind.ENUM.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends kotlinx.serialization.json.JsonElement> T cast(kotlinx.serialization.json.JsonElement value, java.lang.String serialName, kotlin.jvm.functions.Function0<java.lang.String> path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
        if (value instanceof kotlinx.serialization.json.JsonElement) {
            return value;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.JsonElement.class).getSimpleName());
        sb.append(", but had ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(serialName);
        sb.append(" at element: ");
        sb.append(path.invoke());
        throw kotlinx.serialization.json.internal.JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), value.toString());
    }
}
