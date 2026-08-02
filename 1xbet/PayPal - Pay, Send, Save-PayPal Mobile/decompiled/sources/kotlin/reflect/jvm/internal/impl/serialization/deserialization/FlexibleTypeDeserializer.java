package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public interface FlexibleTypeDeserializer {
    kotlin.reflect.jvm.internal.impl.types.KotlinType create(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, java.lang.String str, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2);

    public static final class ThrowException implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer {
        public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException();

        private ThrowException() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        public final kotlin.reflect.jvm.internal.impl.types.KotlinType create(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, java.lang.String str, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType2, "");
            throw new java.lang.IllegalArgumentException("This method should not be used.");
        }
    }
}
