package io.ktor.util.reflect;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u001a1\u0010\b\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00078G¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\"\u0010\u0017\u001a\u00060\u0000j\u0002`\u0001*\u00020\u00058GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014*\n\u0010\u0018\"\u00020\u00002\u00020\u0000"}, d2 = {"Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/getHighSpeedVideoFpsRangesFor;", "reifiedType", "Lkotlin/reflect/KClass;", "kClass", "Lkotlin/reflect/KType;", "kType", "Lio/ktor/util/reflect/TypeInfo;", "typeInfoImpl", "(Ljava/lang/reflect/Type;Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)Lio/ktor/util/reflect/TypeInfo;", "", "type", "", "instanceOf", "(Ljava/lang/Object;Lkotlin/reflect/KClass;)Z", "getReifiedType", "(Lio/ktor/util/reflect/TypeInfo;)Ljava/lang/reflect/Type;", "getReifiedType$annotations", "(Lio/ktor/util/reflect/TypeInfo;)V", "getPlatformType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getPlatformType$annotations", "(Lkotlin/reflect/KType;)V", "platformType", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TypeInfoJvmKt {
    @kotlin.Deprecated(message = "Not used anymore in common code as it was needed only for JVM target.")
    public static /* synthetic */ void Type$annotations() {
    }

    @kotlin.Deprecated(message = "Use KType.javaType instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.javaType", imports = {"kotlin.reflect.javaType"}))
    public static /* synthetic */ void getPlatformType$annotations(kotlin.reflect.KType kType) {
    }

    public static /* synthetic */ void getReifiedType$annotations(io.ktor.util.reflect.TypeInfo typeInfo) {
    }

    public static final java.lang.reflect.Type getReifiedType(io.ktor.util.reflect.TypeInfo typeInfo) {
        java.lang.reflect.Type javaType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeInfo, "");
        kotlin.reflect.KType kotlinType = typeInfo.getKotlinType();
        return (kotlinType == null || (javaType = kotlin.reflect.TypesJVMKt.getJavaType(kotlinType)) == null) ? kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) typeInfo.getType()) : javaType;
    }

    @kotlin.Deprecated(message = "Use TypeInfo constructor instead.", replaceWith = @kotlin.ReplaceWith(expression = "TypeInfo(kClass, kType)", imports = {}))
    public static final io.ktor.util.reflect.TypeInfo typeInfoImpl(java.lang.reflect.Type type, kotlin.reflect.KClass<?> kClass, kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return new io.ktor.util.reflect.TypeInfo(kClass, kType);
    }

    public static final boolean instanceOf(java.lang.Object obj, kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).isInstance(obj);
    }

    public static final java.lang.reflect.Type getPlatformType(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        return kotlin.reflect.TypesJVMKt.getJavaType(kType);
    }
}
