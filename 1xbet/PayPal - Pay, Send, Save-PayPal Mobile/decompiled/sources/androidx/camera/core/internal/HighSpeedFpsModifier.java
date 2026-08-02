package androidx.camera.core.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/core/internal/HighSpeedFpsModifier;", "", "<init>", "()V", "", "Landroidx/camera/core/impl/SessionConfig$OutputConfig;", "outputConfigs", "Landroidx/camera/core/impl/CaptureConfig$Builder;", "repeatingConfigBuilder", "", "modifyFpsForPreviewOnlyRepeating", "(Ljava/util/Collection;Landroidx/camera/core/impl/CaptureConfig$Builder;)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HighSpeedFpsModifier {
    private static final androidx.camera.core.internal.HighSpeedFpsModifier.Companion Companion = new androidx.camera.core.internal.HighSpeedFpsModifier.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/core/internal/HighSpeedFpsModifier$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void modifyFpsForPreviewOnlyRepeating(java.util.Collection<? extends androidx.camera.core.impl.SessionConfig.OutputConfig> outputConfigs, androidx.camera.core.impl.CaptureConfig.Builder repeatingConfigBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputConfigs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeatingConfigBuilder, "");
        if (outputConfigs.size() == 2) {
            java.util.Collection<? extends androidx.camera.core.impl.SessionConfig.OutputConfig> collection = outputConfigs;
            if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
                return;
            }
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                androidx.camera.core.impl.DeferrableSurface surface = ((androidx.camera.core.impl.SessionConfig.OutputConfig) it.next()).getSurface();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surface, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(surface.getContainerClass(), android.media.MediaCodec.class)) {
                    java.util.Set<androidx.camera.core.impl.DeferrableSurface> surfaces = repeatingConfigBuilder.getSurfaces();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces, "");
                    java.util.Set<androidx.camera.core.impl.DeferrableSurface> set = surfaces;
                    if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                        for (androidx.camera.core.impl.DeferrableSurface deferrableSurface : set) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(deferrableSurface);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(deferrableSurface.getContainerClass(), android.media.MediaCodec.class)) {
                                return;
                            }
                        }
                    }
                    android.util.Range<java.lang.Integer> expectedFrameRateRange = repeatingConfigBuilder.getExpectedFrameRateRange();
                    if (expectedFrameRateRange != null) {
                        if (expectedFrameRateRange.getUpper().intValue() < 120 || !kotlin.jvm.internal.Intrinsics.areEqual(expectedFrameRateRange.getLower(), expectedFrameRateRange.getUpper())) {
                            expectedFrameRateRange = null;
                        }
                        if (expectedFrameRateRange != null) {
                            android.util.Range<java.lang.Integer> range = new android.util.Range<>((java.lang.Comparable) 30, expectedFrameRateRange.getUpper());
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Modified high-speed FPS range from ");
                            sb.append(expectedFrameRateRange);
                            sb.append(" to ");
                            sb.append(range);
                            androidx.camera.core.Logger.d("HighSpeedFpsModifier", sb.toString());
                            repeatingConfigBuilder.setExpectedFrameRateRange(range);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
