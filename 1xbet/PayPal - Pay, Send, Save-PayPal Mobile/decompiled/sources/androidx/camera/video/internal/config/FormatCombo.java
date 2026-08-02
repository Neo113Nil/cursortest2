package androidx.camera.video.internal.config;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fR\u001d\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Landroidx/camera/video/internal/config/FormatCombo;", "", "", "container", "", "videoMime", "audioMime", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Landroidx/camera/video/internal/config/FormatCombo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getContainer", "getContainer$annotations", "()V", "Ljava/lang/String;", "getVideoMime", "getAudioMime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FormatCombo {
    private final java.lang.String audioMime;
    private final int container;
    private final java.lang.String videoMime;

    public static /* synthetic */ void getContainer$annotations() {
    }

    public FormatCombo(int i, java.lang.String str, java.lang.String str2) {
        this.container = i;
        this.videoMime = str;
        this.audioMime = str2;
        if (str == null && str2 == null) {
            throw new java.lang.IllegalArgumentException("FormatCombo must have at least one valid track. Both videoMime and audioMime cannot be null.".toString());
        }
    }

    public final int getContainer() {
        return this.container;
    }

    public final java.lang.String getVideoMime() {
        return this.videoMime;
    }

    public final java.lang.String getAudioMime() {
        return this.audioMime;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FormatCombo(container=");
        sb.append(this.container);
        sb.append(", videoMime=");
        sb.append(this.videoMime);
        sb.append(", audioMime=");
        sb.append(this.audioMime);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.container);
        java.lang.String str = this.videoMime;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.audioMime;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.video.internal.config.FormatCombo)) {
            return false;
        }
        androidx.camera.video.internal.config.FormatCombo formatCombo = (androidx.camera.video.internal.config.FormatCombo) other;
        return this.container == formatCombo.container && kotlin.jvm.internal.Intrinsics.areEqual(this.videoMime, formatCombo.videoMime) && kotlin.jvm.internal.Intrinsics.areEqual(this.audioMime, formatCombo.audioMime);
    }

    public final androidx.camera.video.internal.config.FormatCombo copy(int container, java.lang.String videoMime, java.lang.String audioMime) {
        return new androidx.camera.video.internal.config.FormatCombo(container, videoMime, audioMime);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAudioMime() {
        return this.audioMime;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getVideoMime() {
        return this.videoMime;
    }

    /* renamed from: component1, reason: from getter */
    public final int getContainer() {
        return this.container;
    }

    public static /* synthetic */ androidx.camera.video.internal.config.FormatCombo copy$default(androidx.camera.video.internal.config.FormatCombo formatCombo, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = formatCombo.container;
        }
        if ((i2 & 2) != 0) {
            str = formatCombo.videoMime;
        }
        if ((i2 & 4) != 0) {
            str2 = formatCombo.audioMime;
        }
        return formatCombo.copy(i, str, str2);
    }
}
