package kotlinx.serialization.internal;

/* compiled from: Primitives.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\f\u0010\f\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u0003\"\b\b\u0000\u0010\u000e*\u00020\u000f*\b\u0012\u0004\u0012\u0002H\u000e0\u0002H\u0000\"\"\u0010\u0000\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"BUILTIN_SERIALIZERS", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "PrimitiveDescriptorSafe", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "", "kind", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "checkNameIsNotAPrimitive", "", "capitalize", "builtinSerializerOrNull", "T", "", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrimitivesKt {
    private static final java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>> BUILTIN_SERIALIZERS = kotlinx.serialization.internal.PlatformKt.initBuiltins();

    public static final kotlinx.serialization.descriptors.SerialDescriptor PrimitiveDescriptorSafe(java.lang.String serialName, kotlinx.serialization.descriptors.PrimitiveKind kind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "kind");
        checkNameIsNotAPrimitive(serialName);
        return new kotlinx.serialization.internal.PrimitiveSerialDescriptor(serialName, kind);
    }

    public static final void checkNameIsNotAPrimitive(java.lang.String serialName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        for (kotlinx.serialization.KSerializer<?> kSerializer : BUILTIN_SERIALIZERS.values()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(serialName, kSerializer.getDescriptor().getSerialName())) {
                throw new java.lang.IllegalArgumentException(kotlin.text.StringsKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }

    private static final java.lang.String capitalize(java.lang.String str) {
        if (str.length() <= 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char charAt = str.charAt(0);
        sb.append((java.lang.Object) (java.lang.Character.isLowerCase(charAt) ? kotlin.text.CharsKt.titlecase(charAt) : java.lang.String.valueOf(charAt)));
        java.lang.String substring = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    public static final <T> kotlinx.serialization.KSerializer<T> builtinSerializerOrNull(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (kotlinx.serialization.KSerializer) BUILTIN_SERIALIZERS.get(kClass);
    }
}
