package com.paypal.oslo.feature.helpcenter.ui.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/util/VideoThumbnailExtractor;", "", "<init>", "()V", "", "videoUrl", "", "timeUs", "Landroid/graphics/Bitmap;", "extractThumbnail", "(Ljava/lang/String;J)Landroid/graphics/Bitmap;", "DEFAULT_FRAME_TIME_US", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoThumbnailExtractor {
    public static final int $stable = 0;
    public static final long DEFAULT_FRAME_TIME_US = 3000000;
    public static final com.paypal.oslo.feature.helpcenter.ui.util.VideoThumbnailExtractor INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.util.VideoThumbnailExtractor();

    private VideoThumbnailExtractor() {
    }

    public static /* synthetic */ android.graphics.Bitmap extractThumbnail$default(com.paypal.oslo.feature.helpcenter.ui.util.VideoThumbnailExtractor videoThumbnailExtractor, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = DEFAULT_FRAME_TIME_US;
        }
        return videoThumbnailExtractor.extractThumbnail(str, j);
    }

    public final android.graphics.Bitmap extractThumbnail(java.lang.String videoUrl, long timeUs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoUrl, "");
        if (timeUs < 0 || kotlin.text.StringsKt.isBlank(videoUrl)) {
            return null;
        }
        try {
            android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(videoUrl, new java.util.HashMap());
            android.graphics.Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(timeUs, 2);
            mediaMetadataRetriever.release();
            return frameAtTime;
        } catch (java.io.IOException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.SecurityException unused) {
            return null;
        }
    }
}
