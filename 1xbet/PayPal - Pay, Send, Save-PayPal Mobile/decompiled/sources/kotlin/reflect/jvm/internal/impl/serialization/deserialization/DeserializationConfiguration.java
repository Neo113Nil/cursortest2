package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public interface DeserializationConfiguration {
    boolean getAllowUnstableDependencies();

    kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getMetadataVersion();

    boolean getPreserveDeclarationsOrdering();

    boolean getReportErrorsOnPreReleaseDependencies();

    boolean getSkipMetadataVersionCheck();

    boolean getSkipPrereleaseCheck();

    boolean getTypeAliasesAllowed();

    public static final class Default implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration {
        public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public final boolean getAllowUnstableDependencies() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public final boolean getPreserveDeclarationsOrdering() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public final boolean getReportErrorsOnPreReleaseDependencies() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public final boolean getSkipMetadataVersionCheck() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public final boolean getSkipPrereleaseCheck() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public final boolean getTypeAliasesAllowed() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion getMetadataVersion() {
            return kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.INSTANCE;
        }

        private Default() {
        }
    }
}
