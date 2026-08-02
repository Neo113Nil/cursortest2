package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Landroidx/camera/video/internal/config/ContainerInfo;", "", "", "outputFormat", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "compatibleEncoderProfiles", "<init>", "(ILandroidx/camera/core/impl/EncoderProfilesProxy;)V", "component1", "()I", "component2", "()Landroidx/camera/core/impl/EncoderProfilesProxy;", "copy", "(ILandroidx/camera/core/impl/EncoderProfilesProxy;)Landroidx/camera/video/internal/config/ContainerInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getOutputFormat", "getOutputFormat$annotations", "()V", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "getCompatibleEncoderProfiles"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ContainerInfo {
    private final androidx.camera.core.impl.EncoderProfilesProxy compatibleEncoderProfiles;
    private final int outputFormat;

    public static /* synthetic */ void getOutputFormat$annotations() {
    }

    public ContainerInfo(int i, androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy) {
        this.outputFormat = i;
        this.compatibleEncoderProfiles = encoderProfilesProxy;
    }

    public final int getOutputFormat() {
        return this.outputFormat;
    }

    public final androidx.camera.core.impl.EncoderProfilesProxy getCompatibleEncoderProfiles() {
        return this.compatibleEncoderProfiles;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContainerInfo(outputFormat=");
        sb.append(this.outputFormat);
        sb.append(", compatibleEncoderProfiles=");
        sb.append(this.compatibleEncoderProfiles);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.outputFormat);
        androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy = this.compatibleEncoderProfiles;
        return (hashCode * 31) + (encoderProfilesProxy == null ? 0 : encoderProfilesProxy.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.video.internal.config.ContainerInfo)) {
            return false;
        }
        androidx.camera.video.internal.config.ContainerInfo containerInfo = (androidx.camera.video.internal.config.ContainerInfo) other;
        return this.outputFormat == containerInfo.outputFormat && kotlin.jvm.internal.Intrinsics.areEqual(this.compatibleEncoderProfiles, containerInfo.compatibleEncoderProfiles);
    }

    public final androidx.camera.video.internal.config.ContainerInfo copy(int outputFormat, androidx.camera.core.impl.EncoderProfilesProxy compatibleEncoderProfiles) {
        return new androidx.camera.video.internal.config.ContainerInfo(outputFormat, compatibleEncoderProfiles);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.camera.core.impl.EncoderProfilesProxy getCompatibleEncoderProfiles() {
        return this.compatibleEncoderProfiles;
    }

    /* renamed from: component1, reason: from getter */
    public final int getOutputFormat() {
        return this.outputFormat;
    }

    public static /* synthetic */ androidx.camera.video.internal.config.ContainerInfo copy$default(androidx.camera.video.internal.config.ContainerInfo containerInfo, int i, androidx.camera.core.impl.EncoderProfilesProxy encoderProfilesProxy, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = containerInfo.outputFormat;
        }
        if ((i2 & 2) != 0) {
            encoderProfilesProxy = containerInfo.compatibleEncoderProfiles;
        }
        return containerInfo.copy(i, encoderProfilesProxy);
    }
}
