package androidx.camera.video.internal.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n"}, d2 = {"Landroidx/camera/video/internal/utils/MediaFormatExt;", "", "<init>", "()V", "Landroid/media/MediaFormat;", "", "isVideo", "(Landroid/media/MediaFormat;)Z", "", "KEY_CSD_0", "Ljava/lang/String;", "KEY_CSD_1", "KEY_CSD_2", "KEY_TIMELAPSE_ENABLED", "KEY_TIMELAPSE_FPS"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaFormatExt {
    public static final androidx.camera.video.internal.utils.MediaFormatExt INSTANCE = new androidx.camera.video.internal.utils.MediaFormatExt();
    public static final java.lang.String KEY_CSD_0 = "csd-0";
    public static final java.lang.String KEY_CSD_1 = "csd-1";
    public static final java.lang.String KEY_CSD_2 = "csd-2";
    public static final java.lang.String KEY_TIMELAPSE_ENABLED = "time-lapse-enable";
    public static final java.lang.String KEY_TIMELAPSE_FPS = "time-lapse-fps";

    private MediaFormatExt() {
    }

    public final boolean isVideo(android.media.MediaFormat mediaFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaFormat, "");
        java.lang.String string = mediaFormat.getString("mime");
        if (string != null) {
            return kotlin.text.StringsKt.startsWith$default(string, "video/", false, 2, (java.lang.Object) null);
        }
        return false;
    }
}
