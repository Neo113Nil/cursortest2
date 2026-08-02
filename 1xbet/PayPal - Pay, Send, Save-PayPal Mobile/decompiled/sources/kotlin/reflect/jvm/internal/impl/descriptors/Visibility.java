package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public abstract class Visibility {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRangesFor;

    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility normalize() {
        return this;
    }

    public Visibility(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public final boolean isPublicAPI() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getInternalDisplayName() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.Integer compareTo(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibility, "");
        return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    public final java.lang.String toString() {
        return getInternalDisplayName();
    }
}
