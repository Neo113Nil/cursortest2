package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes17.dex */
public class WriteContext {
    private final kotlin.reflect.jvm.internal.impl.metadata.serialization.MutableVersionRequirementTable getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.metadata.serialization.StringTable getHighSpeedVideoFpsRanges;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> getHighSpeedVideoFpsRangesFor;

    public final kotlin.reflect.jvm.internal.impl.metadata.serialization.StringTable getStrings() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.serialization.MutableVersionRequirementTable getVersionRequirements$kotlin_metadata() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> getExtensions$kotlin_metadata() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int get(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return this.getHighSpeedVideoFpsRanges.getStringIndex(str);
    }

    public final int getClassName$kotlin_metadata(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.getClassNameIndex(this.getHighSpeedVideoFpsRanges, str);
    }
}
