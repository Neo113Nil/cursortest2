package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u000b*\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"(\u0010\u0013\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"", "serialName", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kind", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "PrimitiveDescriptorSafe", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/PrimitiveKind;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "checkNameIsNotAPrimitive", "(Ljava/lang/String;)V", "", "T", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "builtinSerializerOrNull", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PrimitivesKt {
    private static final java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>> getHighSpeedVideoFpsRangesFor = kotlinx.serialization.internal.PlatformKt.initBuiltins();

    public static final kotlinx.serialization.descriptors.SerialDescriptor PrimitiveDescriptorSafe(java.lang.String str, kotlinx.serialization.descriptors.PrimitiveKind primitiveKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primitiveKind, "");
        checkNameIsNotAPrimitive(str);
        return new kotlinx.serialization.internal.PrimitiveSerialDescriptor(str, primitiveKind);
    }

    public static final void checkNameIsNotAPrimitive(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        for (kotlinx.serialization.KSerializer<?> kSerializer : getHighSpeedVideoFpsRangesFor.values()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, kSerializer.getDescriptor().getGetHighSpeedVideoSizes())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ");
                sb.append(str);
                sb.append(" there already exists ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName());
                sb.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new java.lang.IllegalArgumentException(kotlin.text.StringsKt.trimIndent(sb.toString()));
            }
        }
    }

    public static final <T> kotlinx.serialization.KSerializer<T> builtinSerializerOrNull(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return (kotlinx.serialization.KSerializer) getHighSpeedVideoFpsRangesFor.get(kClass);
    }
}
