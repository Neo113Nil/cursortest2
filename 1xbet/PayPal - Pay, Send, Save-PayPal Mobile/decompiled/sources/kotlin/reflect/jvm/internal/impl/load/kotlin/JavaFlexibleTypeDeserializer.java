package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class JavaFlexibleTypeDeserializer implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.JavaFlexibleTypeDeserializer INSTANCE = new kotlin.reflect.jvm.internal.impl.load.kotlin.JavaFlexibleTypeDeserializer();

    private JavaFlexibleTypeDeserializer() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType create(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, java.lang.String str, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType2, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, "kotlin.jvm.PlatformType")) {
            return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, simpleType.toString(), simpleType2.toString());
        }
        if (type.hasExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.isRaw)) {
            return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(simpleType, simpleType2);
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleType, simpleType2);
    }
}
