package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/util/reflect/TypeInfo;", "argumentTypeInfo", "(Lio/ktor/util/reflect/TypeInfo;)Lio/ktor/util/reflect/TypeInfo;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KotlinxSerializationJsonExtensionsKt {
    public static final io.ktor.util.reflect.TypeInfo argumentTypeInfo(io.ktor.util.reflect.TypeInfo typeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeInfo, "");
        kotlin.reflect.KType kotlinType = typeInfo.getKotlinType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType);
        kotlin.reflect.KType type = kotlinType.getArguments().get(0).getType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(type);
        kotlin.reflect.KClassifier classifier = type.getClassifier();
        kotlin.jvm.internal.Intrinsics.checkNotNull(classifier, "");
        return new io.ktor.util.reflect.TypeInfo((kotlin.reflect.KClass) classifier, type);
    }
}
