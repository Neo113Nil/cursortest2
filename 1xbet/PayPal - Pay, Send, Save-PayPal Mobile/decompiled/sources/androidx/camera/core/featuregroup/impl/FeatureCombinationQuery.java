package androidx.camera.core.featuregroup.impl;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;", "", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "isSupported", "(Landroidx/camera/core/impl/SessionConfig;)Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FeatureCombinationQuery {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.featuregroup.impl.FeatureCombinationQuery.Companion INSTANCE = androidx.camera.core.featuregroup.impl.FeatureCombinationQuery.Companion.Camera2StreamConfigurationMap;
    public static final androidx.camera.core.featuregroup.impl.FeatureCombinationQuery NO_OP_FEATURE_COMBINATION_QUERY = new androidx.camera.core.featuregroup.impl.FeatureCombinationQuery() { // from class: androidx.camera.core.featuregroup.impl.FeatureCombinationQuery$Companion$NO_OP_FEATURE_COMBINATION_QUERY$1
        @Override // androidx.camera.core.featuregroup.impl.FeatureCombinationQuery
        public final boolean isSupported(androidx.camera.core.impl.SessionConfig sessionConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            return false;
        }
    };

    boolean isSupported(androidx.camera.core.impl.SessionConfig sessionConfig);

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0001"}, d2 = {"Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery$Companion;", "", "<init>", "()V", "Landroidx/camera/core/impl/UseCaseConfig;", "Landroid/util/Size;", "resolution", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "Landroidx/camera/core/impl/SessionConfig$Builder;", "createSessionConfigBuilder", "(Landroidx/camera/core/impl/UseCaseConfig;Landroid/util/Size;Landroidx/camera/core/DynamicRange;)Landroidx/camera/core/impl/SessionConfig$Builder;", "Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;", "NO_OP_FEATURE_COMBINATION_QUERY", "Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.core.featuregroup.impl.FeatureCombinationQuery.Companion Camera2StreamConfigurationMap = new androidx.camera.core.featuregroup.impl.FeatureCombinationQuery.Companion();

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, final android.util.Size size, androidx.camera.core.DynamicRange dynamicRange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
            final int inputFormat = useCaseConfig.getInputFormat();
            androidx.camera.core.impl.DeferrableSurface deferrableSurface = new androidx.camera.core.impl.DeferrableSurface(size, inputFormat) { // from class: androidx.camera.core.featuregroup.impl.FeatureCombinationQuery$Companion$createSessionConfigBuilder$deferrableSurface$1
                @Override // androidx.camera.core.impl.DeferrableSurface
                public final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface() {
                    com.google.common.util.concurrent.ListenableFuture<android.view.Surface> immediateFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(immediateFuture, "");
                    return immediateFuture;
                }
            };
            java.lang.Class<?> surfaceClass = androidx.camera.core.featuregroup.impl.UseCaseType.INSTANCE.getFeatureGroupUseCaseType(useCaseConfig).getSurfaceClass();
            if (surfaceClass != null) {
                deferrableSurface.setContainerClass(surfaceClass);
            }
            androidx.camera.core.impl.SessionConfig.Builder addSurface = androidx.camera.core.impl.SessionConfig.Builder.createFrom(useCaseConfig, size).addSurface(deferrableSurface, dynamicRange);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addSurface, "");
            return addSurface;
        }
    }

    @kotlin.jvm.JvmStatic
    static androidx.camera.core.impl.SessionConfig.Builder createSessionConfigBuilder(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, android.util.Size size, androidx.camera.core.DynamicRange dynamicRange) {
        return INSTANCE.createSessionConfigBuilder(useCaseConfig, size, dynamicRange);
    }
}
