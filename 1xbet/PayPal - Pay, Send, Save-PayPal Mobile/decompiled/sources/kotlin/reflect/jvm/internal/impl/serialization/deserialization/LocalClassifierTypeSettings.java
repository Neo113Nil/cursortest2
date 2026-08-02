package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public interface LocalClassifierTypeSettings {
    kotlin.reflect.jvm.internal.impl.types.SimpleType getReplacementTypeForLocalClassifiers();

    public static final class Default implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings {
        public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        public final kotlin.reflect.jvm.internal.impl.types.SimpleType getReplacementTypeForLocalClassifiers() {
            return null;
        }

        private Default() {
        }
    }
}
