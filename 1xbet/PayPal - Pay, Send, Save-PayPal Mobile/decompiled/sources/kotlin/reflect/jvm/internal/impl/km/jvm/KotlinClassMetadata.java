package kotlin.reflect.jvm.internal.impl.km.jvm;

/* loaded from: classes5.dex */
public abstract class KotlinClassMetadata {
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.Companion Companion = new kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata.Companion(null);
    private boolean getHighSpeedVideoFpsRangesFor;

    private KotlinClassMetadata() {
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    public final void setAllowedToWrite$kotlin_metadata_jvm(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public static final class Class extends kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata {
        private kotlin.reflect.jvm.internal.impl.km.KmClass Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;
        private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass, kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmMetadataVersion, "");
            this.Camera2StreamConfigurationMap = kmClass;
            this.getHighSpeedVideoSizes = jvmMetadataVersion;
            this.getHighSpeedVideoFpsRanges = i;
        }

        public final kotlin.reflect.jvm.internal.impl.km.KmClass getKmClass() {
            return this.Camera2StreamConfigurationMap;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Class(kotlin.Metadata metadata, boolean z) {
            this(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmReadUtils.INSTANCE.readKmClass$kotlin_metadata_jvm(metadata), new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(metadata.mv()), metadata.xi());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }
    }

    public static final class FileFacade extends kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata {
        private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private kotlin.reflect.jvm.internal.impl.km.KmPackage getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileFacade(kotlin.reflect.jvm.internal.impl.km.KmPackage kmPackage, kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmPackage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmMetadataVersion, "");
            this.getHighSpeedVideoFpsRangesFor = kmPackage;
            this.getHighResolutionOutputSizeshNQ4ISI = jvmMetadataVersion;
            this.getHighSpeedVideoFpsRanges = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public FileFacade(kotlin.Metadata metadata, boolean z) {
            this(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmReadUtils.INSTANCE.readKmPackage$kotlin_metadata_jvm(metadata), new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(metadata.mv()), metadata.xi());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }
    }

    public static final class SyntheticClass extends kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata {
        private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion Camera2StreamConfigurationMap;
        private kotlin.reflect.jvm.internal.impl.km.KmLambda getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SyntheticClass(kotlin.reflect.jvm.internal.impl.km.KmLambda kmLambda, kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmMetadataVersion, "");
            this.getHighSpeedVideoFpsRanges = kmLambda;
            this.Camera2StreamConfigurationMap = jvmMetadataVersion;
            this.getHighSpeedVideoSizes = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SyntheticClass(kotlin.Metadata metadata, boolean z) {
            this(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmReadUtils.INSTANCE.readKmLambda$kotlin_metadata_jvm(metadata), new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(metadata.mv()), metadata.xi());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }
    }

    public static final class MultiFileClassFacade extends kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata {
        private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;
        private java.util.List<java.lang.String> getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiFileClassFacade(java.util.List<java.lang.String> list, kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmMetadataVersion, "");
            this.getHighSpeedVideoSizes = list;
            this.Camera2StreamConfigurationMap = jvmMetadataVersion;
            this.getHighSpeedVideoFpsRanges = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public MultiFileClassFacade(kotlin.Metadata metadata, boolean z) {
            this(kotlin.collections.ArraysKt.asList(metadata.d1()), new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(metadata.mv()), metadata.xi());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }
    }

    public static final class MultiFileClassPart extends kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.km.KmPackage getHighSpeedVideoFpsRanges;
        private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion getHighSpeedVideoFpsRangesFor;
        private java.lang.String getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiFileClassPart(kotlin.reflect.jvm.internal.impl.km.KmPackage kmPackage, java.lang.String str, kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion jvmMetadataVersion, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmPackage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmMetadataVersion, "");
            this.getHighSpeedVideoFpsRanges = kmPackage;
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRangesFor = jvmMetadataVersion;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public MultiFileClassPart(kotlin.Metadata metadata, boolean z) {
            this(kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmReadUtils.INSTANCE.readKmPackage$kotlin_metadata_jvm(metadata), metadata.xs(), new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(metadata.mv()), metadata.xi());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            setAllowedToWrite$kotlin_metadata_jvm(!z);
        }
    }

    public static final class Unknown extends kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion getHighSpeedVideoFpsRanges;
        private final kotlin.Metadata getHighSpeedVideoFpsRangesFor;
        private final boolean getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(kotlin.Metadata metadata, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            this.getHighSpeedVideoFpsRangesFor = metadata;
            this.getHighSpeedVideoSizes = z;
            this.getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMetadataVersion(metadata.mv());
            this.getHighResolutionOutputSizeshNQ4ISI = metadata.xi();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata readLenient(kotlin.Metadata metadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            return kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmReadUtils.INSTANCE.readMetadataImpl$kotlin_metadata_jvm(metadata, true);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ KotlinClassMetadata(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
