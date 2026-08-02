package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public final class MetadataVersion extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion {
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion INSTANCE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion INSTANCE_NEXT;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion INVALID_VERSION;
    private final boolean Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(int[] iArr, boolean z) {
        super(java.util.Arrays.copyOf(iArr, iArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        this.Camera2StreamConfigurationMap = z;
    }

    public final boolean isStrictSemantics() {
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(int... iArr) {
        this(iArr, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion lastSupportedVersionWithThisLanguageVersion(boolean z) {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion = z ? INSTANCE : INSTANCE_NEXT;
        return metadataVersion.getHighSpeedVideoSizes(this) ? metadataVersion : this;
    }

    public final boolean isCompatibleWithCurrentCompilerVersion() {
        return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap ? INSTANCE : INSTANCE_NEXT);
    }

    public final boolean isCompatible(kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
        return getHighSpeedVideoFpsRangesFor(metadataVersion.lastSupportedVersionWithThisLanguageVersion(this.Camera2StreamConfigurationMap));
    }

    private final boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        if ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0) {
            return false;
        }
        return !getHighSpeedVideoSizes(metadataVersion);
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion next() {
        return (getMajor() == 1 && getMinor() == 9) ? new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(2, 0, 0) : new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(getMajor(), getMinor() + 1, 0);
    }

    private final boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        if (getMajor() > metadataVersion.getMajor()) {
            return true;
        }
        return getMajor() >= metadataVersion.getMajor() && getMinor() > metadataVersion.getMinor();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(2, 3, 0);
        INSTANCE = metadataVersion;
        INSTANCE_NEXT = metadataVersion.next();
        INVALID_VERSION = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(new int[0]);
    }
}
