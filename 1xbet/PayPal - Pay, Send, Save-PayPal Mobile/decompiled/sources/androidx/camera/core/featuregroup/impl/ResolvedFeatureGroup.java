package androidx.camera.core.featuregroup.impl;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "", "", "Landroidx/camera/core/featuregroup/GroupableFeature;", "features", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getFeatures", "()Ljava/util/Set;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResolvedFeatureGroup {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup.Companion INSTANCE = new androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup.Companion(null);
    private final java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> features;

    /* JADX WARN: Multi-variable type inference failed */
    public ResolvedFeatureGroup(java.util.Set<? extends androidx.camera.core.featuregroup.GroupableFeature> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.features = set;
    }

    public final java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> getFeatures() {
        return this.features;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolvedFeatureGroup(features=");
        sb.append(this.features);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup$Companion;", "", "<init>", "()V", "Landroidx/camera/core/SessionConfig;", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolver;", "resolver", "Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "resolveFeatureGroup", "(Landroidx/camera/core/SessionConfig;Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolver;)Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolveFeatureGroup$default(androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup.Companion companion, androidx.camera.core.SessionConfig sessionConfig, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver featureGroupResolver, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                featureGroupResolver = new androidx.camera.core.featuregroup.impl.resolver.DefaultFeatureGroupResolver(cameraInfoInternal);
            }
            return companion.resolveFeatureGroup(sessionConfig, cameraInfoInternal, featureGroupResolver);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolveFeatureGroup(androidx.camera.core.SessionConfig sessionConfig, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver featureGroupResolver) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGroupResolver, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("resolveFeatureGroup: sessionConfig = ");
            sb.append(sessionConfig);
            sb.append(", lensFacing = ");
            sb.append(cameraInfoInternal.getLensFacing());
            androidx.camera.core.Logger.d("ResolvedFeatureGroup", sb.toString());
            if (sessionConfig.getRequiredFeatureGroup().isEmpty() && sessionConfig.getPreferredFeatureGroup().isEmpty()) {
                return null;
            }
            androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult resolveFeatureGroup = featureGroupResolver.resolveFeatureGroup(sessionConfig);
            if (resolveFeatureGroup instanceof androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported) {
                androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup = ((androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported) resolveFeatureGroup).getResolvedFeatureGroup();
                androidx.camera.core.Logger.d("ResolvedFeatureGroup", "resolvedFeatureGroup = ".concat(java.lang.String.valueOf(resolvedFeatureGroup)));
                return resolvedFeatureGroup;
            }
            if (resolveFeatureGroup instanceof androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Unsupported) {
                throw new java.lang.IllegalArgumentException("Feature group is not supported");
            }
            if (resolveFeatureGroup instanceof androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UnsupportedUseCase) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(((androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UnsupportedUseCase) resolveFeatureGroup).getUnsupportedUseCase());
                sb2.append(" is not supported");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            if (!(resolveFeatureGroup instanceof androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing useCaseMissing = (androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing) resolveFeatureGroup;
            sb3.append(useCaseMissing.getRequiredUseCases());
            sb3.append(" must be added for ");
            sb3.append(useCaseMissing.getFeatureRequiring());
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolveFeatureGroup(androidx.camera.core.SessionConfig sessionConfig, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
            return resolveFeatureGroup$default(this, sessionConfig, cameraInfoInternal, null, 2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolveFeatureGroup(androidx.camera.core.SessionConfig sessionConfig, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver featureGroupResolver) {
        return INSTANCE.resolveFeatureGroup(sessionConfig, cameraInfoInternal, featureGroupResolver);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolveFeatureGroup(androidx.camera.core.SessionConfig sessionConfig, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        return INSTANCE.resolveFeatureGroup(sessionConfig, cameraInfoInternal);
    }
}
