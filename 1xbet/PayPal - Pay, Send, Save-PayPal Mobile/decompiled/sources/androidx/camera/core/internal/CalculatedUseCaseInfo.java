package androidx.camera.core.internal;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010#J¤\u0001\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b3\u0010\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b7\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001fR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010!R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b@\u0010#"}, d2 = {"Landroidx/camera/core/internal/CalculatedUseCaseInfo;", "", "", "Landroidx/camera/core/UseCase;", "appUseCases", "cameraUseCases", "", "cameraUseCasesToAttach", "cameraUseCasesToKeep", "cameraUseCasesToDetach", "Landroidx/camera/core/streamsharing/StreamSharing;", "streamSharing", "placeholderForExtensions", "", "Landroidx/camera/core/internal/CameraUseCaseAdapter$ConfigPair;", "useCaseConfigs", "Landroidx/camera/core/internal/StreamSpecQueryResult;", "primaryStreamSpecResult", "secondaryStreamSpecResult", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/core/streamsharing/StreamSharing;Landroidx/camera/core/UseCase;Ljava/util/Map;Landroidx/camera/core/internal/StreamSpecQueryResult;Landroidx/camera/core/internal/StreamSpecQueryResult;)V", "component1", "()Ljava/util/Collection;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Landroidx/camera/core/streamsharing/StreamSharing;", "component7", "()Landroidx/camera/core/UseCase;", "component8", "()Ljava/util/Map;", "component9", "()Landroidx/camera/core/internal/StreamSpecQueryResult;", "component10", "copy", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/core/streamsharing/StreamSharing;Landroidx/camera/core/UseCase;Ljava/util/Map;Landroidx/camera/core/internal/StreamSpecQueryResult;Landroidx/camera/core/internal/StreamSpecQueryResult;)Landroidx/camera/core/internal/CalculatedUseCaseInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Collection;", "getAppUseCases", "getCameraUseCases", "Ljava/util/List;", "getCameraUseCasesToAttach", "getCameraUseCasesToKeep", "getCameraUseCasesToDetach", "Landroidx/camera/core/streamsharing/StreamSharing;", "getStreamSharing", "Landroidx/camera/core/UseCase;", "getPlaceholderForExtensions", "Ljava/util/Map;", "getUseCaseConfigs", "Landroidx/camera/core/internal/StreamSpecQueryResult;", "getPrimaryStreamSpecResult", "getSecondaryStreamSpecResult"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CalculatedUseCaseInfo {
    private final java.util.Collection<androidx.camera.core.UseCase> appUseCases;
    private final java.util.Collection<androidx.camera.core.UseCase> cameraUseCases;
    private final java.util.List<androidx.camera.core.UseCase> cameraUseCasesToAttach;
    private final java.util.List<androidx.camera.core.UseCase> cameraUseCasesToDetach;
    private final java.util.List<androidx.camera.core.UseCase> cameraUseCasesToKeep;
    private final androidx.camera.core.UseCase placeholderForExtensions;
    private final androidx.camera.core.internal.StreamSpecQueryResult primaryStreamSpecResult;
    private final androidx.camera.core.internal.StreamSpecQueryResult secondaryStreamSpecResult;
    private final androidx.camera.core.streamsharing.StreamSharing streamSharing;
    private final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> useCaseConfigs;

    /* JADX WARN: Multi-variable type inference failed */
    public CalculatedUseCaseInfo(java.util.Collection<? extends androidx.camera.core.UseCase> collection, java.util.Collection<? extends androidx.camera.core.UseCase> collection2, java.util.List<? extends androidx.camera.core.UseCase> list, java.util.List<? extends androidx.camera.core.UseCase> list2, java.util.List<? extends androidx.camera.core.UseCase> list3, androidx.camera.core.streamsharing.StreamSharing streamSharing, androidx.camera.core.UseCase useCase, java.util.Map<androidx.camera.core.UseCase, ? extends androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> map, androidx.camera.core.internal.StreamSpecQueryResult streamSpecQueryResult, androidx.camera.core.internal.StreamSpecQueryResult streamSpecQueryResult2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecQueryResult, "");
        this.appUseCases = collection;
        this.cameraUseCases = collection2;
        this.cameraUseCasesToAttach = list;
        this.cameraUseCasesToKeep = list2;
        this.cameraUseCasesToDetach = list3;
        this.streamSharing = streamSharing;
        this.placeholderForExtensions = useCase;
        this.useCaseConfigs = map;
        this.primaryStreamSpecResult = streamSpecQueryResult;
        this.secondaryStreamSpecResult = streamSpecQueryResult2;
    }

    public final java.util.Collection<androidx.camera.core.UseCase> getAppUseCases() {
        return this.appUseCases;
    }

    public final java.util.Collection<androidx.camera.core.UseCase> getCameraUseCases() {
        return this.cameraUseCases;
    }

    public final java.util.List<androidx.camera.core.UseCase> getCameraUseCasesToAttach() {
        return this.cameraUseCasesToAttach;
    }

    public final java.util.List<androidx.camera.core.UseCase> getCameraUseCasesToKeep() {
        return this.cameraUseCasesToKeep;
    }

    public final java.util.List<androidx.camera.core.UseCase> getCameraUseCasesToDetach() {
        return this.cameraUseCasesToDetach;
    }

    public final androidx.camera.core.streamsharing.StreamSharing getStreamSharing() {
        return this.streamSharing;
    }

    public final androidx.camera.core.UseCase getPlaceholderForExtensions() {
        return this.placeholderForExtensions;
    }

    public final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> getUseCaseConfigs() {
        return this.useCaseConfigs;
    }

    public final androidx.camera.core.internal.StreamSpecQueryResult getPrimaryStreamSpecResult() {
        return this.primaryStreamSpecResult;
    }

    public final androidx.camera.core.internal.StreamSpecQueryResult getSecondaryStreamSpecResult() {
        return this.secondaryStreamSpecResult;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CalculatedUseCaseInfo(appUseCases=");
        sb.append(this.appUseCases);
        sb.append(", cameraUseCases=");
        sb.append(this.cameraUseCases);
        sb.append(", cameraUseCasesToAttach=");
        sb.append(this.cameraUseCasesToAttach);
        sb.append(", cameraUseCasesToKeep=");
        sb.append(this.cameraUseCasesToKeep);
        sb.append(", cameraUseCasesToDetach=");
        sb.append(this.cameraUseCasesToDetach);
        sb.append(", streamSharing=");
        sb.append(this.streamSharing);
        sb.append(", placeholderForExtensions=");
        sb.append(this.placeholderForExtensions);
        sb.append(", useCaseConfigs=");
        sb.append(this.useCaseConfigs);
        sb.append(", primaryStreamSpecResult=");
        sb.append(this.primaryStreamSpecResult);
        sb.append(", secondaryStreamSpecResult=");
        sb.append(this.secondaryStreamSpecResult);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.appUseCases.hashCode();
        int hashCode2 = this.cameraUseCases.hashCode();
        int hashCode3 = this.cameraUseCasesToAttach.hashCode();
        int hashCode4 = this.cameraUseCasesToKeep.hashCode();
        int hashCode5 = this.cameraUseCasesToDetach.hashCode();
        androidx.camera.core.streamsharing.StreamSharing streamSharing = this.streamSharing;
        int hashCode6 = streamSharing == null ? 0 : streamSharing.hashCode();
        androidx.camera.core.UseCase useCase = this.placeholderForExtensions;
        int hashCode7 = useCase == null ? 0 : useCase.hashCode();
        int hashCode8 = this.useCaseConfigs.hashCode();
        int hashCode9 = this.primaryStreamSpecResult.hashCode();
        androidx.camera.core.internal.StreamSpecQueryResult streamSpecQueryResult = this.secondaryStreamSpecResult;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (streamSpecQueryResult != null ? streamSpecQueryResult.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.core.internal.CalculatedUseCaseInfo)) {
            return false;
        }
        androidx.camera.core.internal.CalculatedUseCaseInfo calculatedUseCaseInfo = (androidx.camera.core.internal.CalculatedUseCaseInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.appUseCases, calculatedUseCaseInfo.appUseCases) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraUseCases, calculatedUseCaseInfo.cameraUseCases) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraUseCasesToAttach, calculatedUseCaseInfo.cameraUseCasesToAttach) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraUseCasesToKeep, calculatedUseCaseInfo.cameraUseCasesToKeep) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraUseCasesToDetach, calculatedUseCaseInfo.cameraUseCasesToDetach) && kotlin.jvm.internal.Intrinsics.areEqual(this.streamSharing, calculatedUseCaseInfo.streamSharing) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholderForExtensions, calculatedUseCaseInfo.placeholderForExtensions) && kotlin.jvm.internal.Intrinsics.areEqual(this.useCaseConfigs, calculatedUseCaseInfo.useCaseConfigs) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryStreamSpecResult, calculatedUseCaseInfo.primaryStreamSpecResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryStreamSpecResult, calculatedUseCaseInfo.secondaryStreamSpecResult);
    }

    public final androidx.camera.core.internal.CalculatedUseCaseInfo copy(java.util.Collection<? extends androidx.camera.core.UseCase> appUseCases, java.util.Collection<? extends androidx.camera.core.UseCase> cameraUseCases, java.util.List<? extends androidx.camera.core.UseCase> cameraUseCasesToAttach, java.util.List<? extends androidx.camera.core.UseCase> cameraUseCasesToKeep, java.util.List<? extends androidx.camera.core.UseCase> cameraUseCasesToDetach, androidx.camera.core.streamsharing.StreamSharing streamSharing, androidx.camera.core.UseCase placeholderForExtensions, java.util.Map<androidx.camera.core.UseCase, ? extends androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> useCaseConfigs, androidx.camera.core.internal.StreamSpecQueryResult primaryStreamSpecResult, androidx.camera.core.internal.StreamSpecQueryResult secondaryStreamSpecResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appUseCases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraUseCases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraUseCasesToAttach, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraUseCasesToKeep, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraUseCasesToDetach, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseConfigs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryStreamSpecResult, "");
        return new androidx.camera.core.internal.CalculatedUseCaseInfo(appUseCases, cameraUseCases, cameraUseCasesToAttach, cameraUseCasesToKeep, cameraUseCasesToDetach, streamSharing, placeholderForExtensions, useCaseConfigs, primaryStreamSpecResult, secondaryStreamSpecResult);
    }

    /* renamed from: component9, reason: from getter */
    public final androidx.camera.core.internal.StreamSpecQueryResult getPrimaryStreamSpecResult() {
        return this.primaryStreamSpecResult;
    }

    public final java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> component8() {
        return this.useCaseConfigs;
    }

    /* renamed from: component7, reason: from getter */
    public final androidx.camera.core.UseCase getPlaceholderForExtensions() {
        return this.placeholderForExtensions;
    }

    /* renamed from: component6, reason: from getter */
    public final androidx.camera.core.streamsharing.StreamSharing getStreamSharing() {
        return this.streamSharing;
    }

    public final java.util.List<androidx.camera.core.UseCase> component5() {
        return this.cameraUseCasesToDetach;
    }

    public final java.util.List<androidx.camera.core.UseCase> component4() {
        return this.cameraUseCasesToKeep;
    }

    public final java.util.List<androidx.camera.core.UseCase> component3() {
        return this.cameraUseCasesToAttach;
    }

    public final java.util.Collection<androidx.camera.core.UseCase> component2() {
        return this.cameraUseCases;
    }

    /* renamed from: component10, reason: from getter */
    public final androidx.camera.core.internal.StreamSpecQueryResult getSecondaryStreamSpecResult() {
        return this.secondaryStreamSpecResult;
    }

    public final java.util.Collection<androidx.camera.core.UseCase> component1() {
        return this.appUseCases;
    }
}
