package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Landroidx/camera/video/internal/config/VideoMimeInfo;", "Landroidx/camera/video/internal/config/MimeInfo;", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "profile", "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "compatibleVideoProfile", "<init>", "(Ljava/lang/String;ILandroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "copy", "(Ljava/lang/String;ILandroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;)Landroidx/camera/video/internal/config/VideoMimeInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getMimeType", com.visa.cbp.getEncExpo.warmup, "getProfile", "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "getCompatibleVideoProfile"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class VideoMimeInfo implements androidx.camera.video.internal.config.MimeInfo {
    private final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile;
    private final java.lang.String mimeType;
    private final int profile;

    public VideoMimeInfo(java.lang.String str, int i, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.mimeType = str;
        this.profile = i;
        this.compatibleVideoProfile = videoProfileProxy;
    }

    public /* synthetic */ VideoMimeInfo(java.lang.String str, int i, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? null : videoProfileProxy);
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final int getProfile() {
        return this.profile;
    }

    public final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getCompatibleVideoProfile() {
        return this.compatibleVideoProfile;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoMimeInfo(mimeType=");
        sb.append(this.mimeType);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", compatibleVideoProfile=");
        sb.append(this.compatibleVideoProfile);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.mimeType.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.profile);
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.compatibleVideoProfile;
        return (((hashCode * 31) + hashCode2) * 31) + (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.video.internal.config.VideoMimeInfo)) {
            return false;
        }
        androidx.camera.video.internal.config.VideoMimeInfo videoMimeInfo = (androidx.camera.video.internal.config.VideoMimeInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, videoMimeInfo.mimeType) && this.profile == videoMimeInfo.profile && kotlin.jvm.internal.Intrinsics.areEqual(this.compatibleVideoProfile, videoMimeInfo.compatibleVideoProfile);
    }

    public final androidx.camera.video.internal.config.VideoMimeInfo copy(java.lang.String mimeType, int profile, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
        return new androidx.camera.video.internal.config.VideoMimeInfo(mimeType, profile, compatibleVideoProfile);
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getCompatibleVideoProfile() {
        return this.compatibleVideoProfile;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProfile() {
        return this.profile;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public static /* synthetic */ androidx.camera.video.internal.config.VideoMimeInfo copy$default(androidx.camera.video.internal.config.VideoMimeInfo videoMimeInfo, java.lang.String str, int i, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = videoMimeInfo.mimeType;
        }
        if ((i2 & 2) != 0) {
            i = videoMimeInfo.profile;
        }
        if ((i2 & 4) != 0) {
            videoProfileProxy = videoMimeInfo.compatibleVideoProfile;
        }
        return videoMimeInfo.copy(str, i, videoProfileProxy);
    }
}
