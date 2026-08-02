package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Landroidx/camera/video/internal/config/MediaInfo;", "", "Landroidx/camera/video/internal/config/ContainerInfo;", "containerInfo", "Landroidx/camera/video/internal/config/VideoMimeInfo;", "videoMimeInfo", "Landroidx/camera/video/internal/config/AudioMimeInfo;", "audioMimeInfo", "<init>", "(Landroidx/camera/video/internal/config/ContainerInfo;Landroidx/camera/video/internal/config/VideoMimeInfo;Landroidx/camera/video/internal/config/AudioMimeInfo;)V", "component1", "()Landroidx/camera/video/internal/config/ContainerInfo;", "component2", "()Landroidx/camera/video/internal/config/VideoMimeInfo;", "component3", "()Landroidx/camera/video/internal/config/AudioMimeInfo;", "copy", "(Landroidx/camera/video/internal/config/ContainerInfo;Landroidx/camera/video/internal/config/VideoMimeInfo;Landroidx/camera/video/internal/config/AudioMimeInfo;)Landroidx/camera/video/internal/config/MediaInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/video/internal/config/ContainerInfo;", "getContainerInfo", "Landroidx/camera/video/internal/config/VideoMimeInfo;", "getVideoMimeInfo", "Landroidx/camera/video/internal/config/AudioMimeInfo;", "getAudioMimeInfo"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MediaInfo {
    private final androidx.camera.video.internal.config.AudioMimeInfo audioMimeInfo;
    private final androidx.camera.video.internal.config.ContainerInfo containerInfo;
    private final androidx.camera.video.internal.config.VideoMimeInfo videoMimeInfo;

    public MediaInfo(androidx.camera.video.internal.config.ContainerInfo containerInfo, androidx.camera.video.internal.config.VideoMimeInfo videoMimeInfo, androidx.camera.video.internal.config.AudioMimeInfo audioMimeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoMimeInfo, "");
        this.containerInfo = containerInfo;
        this.videoMimeInfo = videoMimeInfo;
        this.audioMimeInfo = audioMimeInfo;
    }

    public final androidx.camera.video.internal.config.ContainerInfo getContainerInfo() {
        return this.containerInfo;
    }

    public final androidx.camera.video.internal.config.VideoMimeInfo getVideoMimeInfo() {
        return this.videoMimeInfo;
    }

    public final androidx.camera.video.internal.config.AudioMimeInfo getAudioMimeInfo() {
        return this.audioMimeInfo;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaInfo(containerInfo=");
        sb.append(this.containerInfo);
        sb.append(", videoMimeInfo=");
        sb.append(this.videoMimeInfo);
        sb.append(", audioMimeInfo=");
        sb.append(this.audioMimeInfo);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.containerInfo.hashCode();
        int hashCode2 = this.videoMimeInfo.hashCode();
        androidx.camera.video.internal.config.AudioMimeInfo audioMimeInfo = this.audioMimeInfo;
        return (((hashCode * 31) + hashCode2) * 31) + (audioMimeInfo == null ? 0 : audioMimeInfo.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.video.internal.config.MediaInfo)) {
            return false;
        }
        androidx.camera.video.internal.config.MediaInfo mediaInfo = (androidx.camera.video.internal.config.MediaInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.containerInfo, mediaInfo.containerInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.videoMimeInfo, mediaInfo.videoMimeInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.audioMimeInfo, mediaInfo.audioMimeInfo);
    }

    public final androidx.camera.video.internal.config.MediaInfo copy(androidx.camera.video.internal.config.ContainerInfo containerInfo, androidx.camera.video.internal.config.VideoMimeInfo videoMimeInfo, androidx.camera.video.internal.config.AudioMimeInfo audioMimeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoMimeInfo, "");
        return new androidx.camera.video.internal.config.MediaInfo(containerInfo, videoMimeInfo, audioMimeInfo);
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.camera.video.internal.config.AudioMimeInfo getAudioMimeInfo() {
        return this.audioMimeInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.camera.video.internal.config.VideoMimeInfo getVideoMimeInfo() {
        return this.videoMimeInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.camera.video.internal.config.ContainerInfo getContainerInfo() {
        return this.containerInfo;
    }

    public static /* synthetic */ androidx.camera.video.internal.config.MediaInfo copy$default(androidx.camera.video.internal.config.MediaInfo mediaInfo, androidx.camera.video.internal.config.ContainerInfo containerInfo, androidx.camera.video.internal.config.VideoMimeInfo videoMimeInfo, androidx.camera.video.internal.config.AudioMimeInfo audioMimeInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            containerInfo = mediaInfo.containerInfo;
        }
        if ((i & 2) != 0) {
            videoMimeInfo = mediaInfo.videoMimeInfo;
        }
        if ((i & 4) != 0) {
            audioMimeInfo = mediaInfo.audioMimeInfo;
        }
        return mediaInfo.copy(containerInfo, videoMimeInfo, audioMimeInfo);
    }
}
