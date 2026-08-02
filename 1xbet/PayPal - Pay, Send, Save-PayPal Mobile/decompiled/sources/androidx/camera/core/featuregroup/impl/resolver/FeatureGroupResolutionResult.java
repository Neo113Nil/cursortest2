package androidx.camera.core.featuregroup.impl.resolver;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "", "Supported", "UseCaseMissing", "UnsupportedUseCase", "Unsupported", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Supported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Unsupported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UnsupportedUseCase;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FeatureGroupResolutionResult {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Supported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "resolvedFeatureGroup", "<init>", "(Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;)V", "component1", "()Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "copy", "(Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;)Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Supported;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/core/featuregroup/impl/ResolvedFeatureGroup;", "getResolvedFeatureGroup"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Supported implements androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult {
        private final androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup;

        public Supported(androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvedFeatureGroup, "");
            this.resolvedFeatureGroup = resolvedFeatureGroup;
        }

        public final androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup getResolvedFeatureGroup() {
            return this.resolvedFeatureGroup;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Supported(resolvedFeatureGroup=");
            sb.append(this.resolvedFeatureGroup);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.resolvedFeatureGroup.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolvedFeatureGroup, ((androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported) other).resolvedFeatureGroup);
        }

        public final androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported copy(androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvedFeatureGroup, "");
            return new androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported(resolvedFeatureGroup);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup getResolvedFeatureGroup() {
            return this.resolvedFeatureGroup;
        }

        public static /* synthetic */ androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported copy$default(androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported supported, androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup resolvedFeatureGroup, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                resolvedFeatureGroup = supported.resolvedFeatureGroup;
            }
            return supported.copy(resolvedFeatureGroup);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "", "requiredUseCases", "Landroidx/camera/core/featuregroup/GroupableFeature;", "featureRequiring", "<init>", "(Ljava/lang/String;Landroidx/camera/core/featuregroup/GroupableFeature;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/camera/core/featuregroup/GroupableFeature;", "copy", "(Ljava/lang/String;Landroidx/camera/core/featuregroup/GroupableFeature;)Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequiredUseCases", "Landroidx/camera/core/featuregroup/GroupableFeature;", "getFeatureRequiring"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UseCaseMissing implements androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult {
        private final androidx.camera.core.featuregroup.GroupableFeature featureRequiring;
        private final java.lang.String requiredUseCases;

        public UseCaseMissing(java.lang.String str, androidx.camera.core.featuregroup.GroupableFeature groupableFeature) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(groupableFeature, "");
            this.requiredUseCases = str;
            this.featureRequiring = groupableFeature;
        }

        public final java.lang.String getRequiredUseCases() {
            return this.requiredUseCases;
        }

        public final androidx.camera.core.featuregroup.GroupableFeature getFeatureRequiring() {
            return this.featureRequiring;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UseCaseMissing(requiredUseCases=");
            sb.append(this.requiredUseCases);
            sb.append(", featureRequiring=");
            sb.append(this.featureRequiring);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.requiredUseCases.hashCode() * 31) + this.featureRequiring.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing)) {
                return false;
            }
            androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing useCaseMissing = (androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requiredUseCases, useCaseMissing.requiredUseCases) && kotlin.jvm.internal.Intrinsics.areEqual(this.featureRequiring, useCaseMissing.featureRequiring);
        }

        public final androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing copy(java.lang.String requiredUseCases, androidx.camera.core.featuregroup.GroupableFeature featureRequiring) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredUseCases, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureRequiring, "");
            return new androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing(requiredUseCases, featureRequiring);
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.camera.core.featuregroup.GroupableFeature getFeatureRequiring() {
            return this.featureRequiring;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequiredUseCases() {
            return this.requiredUseCases;
        }

        public static /* synthetic */ androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing copy$default(androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing useCaseMissing, java.lang.String str, androidx.camera.core.featuregroup.GroupableFeature groupableFeature, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = useCaseMissing.requiredUseCases;
            }
            if ((i & 2) != 0) {
                groupableFeature = useCaseMissing.featureRequiring;
            }
            return useCaseMissing.copy(str, groupableFeature);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UnsupportedUseCase;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "Landroidx/camera/core/UseCase;", "unsupportedUseCase", "<init>", "(Landroidx/camera/core/UseCase;)V", "component1", "()Landroidx/camera/core/UseCase;", "copy", "(Landroidx/camera/core/UseCase;)Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UnsupportedUseCase;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/core/UseCase;", "getUnsupportedUseCase"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnsupportedUseCase implements androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult {
        private final androidx.camera.core.UseCase unsupportedUseCase;

        public UnsupportedUseCase(androidx.camera.core.UseCase useCase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
            this.unsupportedUseCase = useCase;
        }

        public final androidx.camera.core.UseCase getUnsupportedUseCase() {
            return this.unsupportedUseCase;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnsupportedUseCase(unsupportedUseCase=");
            sb.append(this.unsupportedUseCase);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.unsupportedUseCase.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UnsupportedUseCase) && kotlin.jvm.internal.Intrinsics.areEqual(this.unsupportedUseCase, ((androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UnsupportedUseCase) other).unsupportedUseCase);
        }

        public final androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UnsupportedUseCase copy(androidx.camera.core.UseCase unsupportedUseCase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsupportedUseCase, "");
            return new androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UnsupportedUseCase(unsupportedUseCase);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.camera.core.UseCase getUnsupportedUseCase() {
            return this.unsupportedUseCase;
        }

        public static /* synthetic */ androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UnsupportedUseCase copy$default(androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UnsupportedUseCase unsupportedUseCase, androidx.camera.core.UseCase useCase, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                useCase = unsupportedUseCase.unsupportedUseCase;
            }
            return unsupportedUseCase.copy(useCase);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$Unsupported;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Unsupported implements androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult {
        public static final androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Unsupported INSTANCE = new androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Unsupported();

        private Unsupported() {
        }
    }
}
