package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isVersionRequirementTableWrittenCorrectly(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        return isKotlin1Dot4OrLater(binaryVersion);
    }

    public static final boolean isKotlin1Dot4OrLater(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        return (binaryVersion.getMajor() == 1 && binaryVersion.getMinor() >= 4) || binaryVersion.getMajor() > 1;
    }
}
