package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Landroidx/camera/core/LegacySessionConfig;", "Landroidx/camera/core/SessionConfig;", "", "Landroidx/camera/core/UseCase;", "useCases", "Landroidx/camera/core/ViewPort;", "viewPort", "Landroidx/camera/core/CameraEffect;", "effects", "<init>", "(Ljava/util/List;Landroidx/camera/core/ViewPort;Ljava/util/List;)V", "Landroidx/camera/core/UseCaseGroup;", "useCaseGroup", "(Landroidx/camera/core/UseCaseGroup;)V", "", "isLegacy", "Z", "()Z", "requireNonEmptyUseCases", "getRequireNonEmptyUseCases"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LegacySessionConfig extends androidx.camera.core.SessionConfig {
    private final boolean isLegacy;
    private final boolean requireNonEmptyUseCases;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacySessionConfig(java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.ViewPort viewPort, java.util.List<? extends androidx.camera.core.CameraEffect> list2) {
        super(list, viewPort, list2, null, null, null, 56, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.isLegacy = true;
    }

    public /* synthetic */ LegacySessionConfig(java.util.List list, androidx.camera.core.ViewPort viewPort, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : viewPort, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    @Override // androidx.camera.core.SessionConfig
    /* renamed from: isLegacy, reason: from getter */
    public final boolean getIsLegacy() {
        return this.isLegacy;
    }

    @Override // androidx.camera.core.SessionConfig
    public final boolean getRequireNonEmptyUseCases() {
        return this.requireNonEmptyUseCases;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LegacySessionConfig(androidx.camera.core.UseCaseGroup useCaseGroup) {
        this(r1, r2, r4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseGroup, "");
        java.util.List<androidx.camera.core.UseCase> useCases = useCaseGroup.getUseCases();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(useCases, "");
        androidx.camera.core.ViewPort viewPort = useCaseGroup.getViewPort();
        java.util.List<androidx.camera.core.CameraEffect> effects = useCaseGroup.getEffects();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(effects, "");
    }
}
