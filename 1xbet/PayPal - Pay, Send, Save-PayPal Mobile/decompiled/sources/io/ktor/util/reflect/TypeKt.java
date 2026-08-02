package io.ktor.util.reflect;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001a\u0010\t\u001a\u0004\u0018\u00010\b\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0080\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"T", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "()Lio/ktor/util/reflect/TypeInfo;", "Lkotlinx/serialization/KSerializer;", "", "serializer", "(Lio/ktor/util/reflect/TypeInfo;)Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KType;", "typeOfOrNull", "()Lkotlin/reflect/KType;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TypeKt {
    public static final /* synthetic */ <T> io.ktor.util.reflect.TypeInfo typeInfo() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        return new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, null);
    }

    public static final kotlinx.serialization.KSerializer<? extends java.lang.Object> serializer(io.ktor.util.reflect.TypeInfo typeInfo) {
        kotlinx.serialization.KSerializer<? extends java.lang.Object> serializer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeInfo, "");
        kotlin.reflect.KType kotlinType = typeInfo.getKotlinType();
        return (kotlinType == null || (serializer = kotlinx.serialization.SerializersKt.serializer(kotlinType)) == null) ? kotlinx.serialization.SerializersKt.serializer(typeInfo.getType()) : serializer;
    }

    public static final /* synthetic */ <T> kotlin.reflect.KType typeOfOrNull() {
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
