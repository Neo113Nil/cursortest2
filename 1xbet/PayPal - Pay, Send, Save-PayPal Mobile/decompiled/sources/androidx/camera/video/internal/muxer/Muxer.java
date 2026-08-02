package androidx.camera.video.internal.muxer;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 '2\u00020\u0001:\u0002'(J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H&¢\u0006\u0004\b\u001b\u0010\u001aJ'\u0010!\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010%\u001a\u00020$H&¢\u0006\u0004\b%\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/video/internal/muxer/Muxer;", "", "", "path", "", "format", "", "setOutput", "(Ljava/lang/String;I)V", "Landroid/os/ParcelFileDescriptor;", "parcelFileDescriptor", "(Landroid/os/ParcelFileDescriptor;I)V", "degrees", "setOrientationDegrees", "(I)V", "", "latitude", "longitude", "setLocation", "(DD)V", "captureFps", "setCaptureFps", "Landroid/media/MediaFormat;", "addTrack", "(Landroid/media/MediaFormat;)I", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "trackIndex", "Ljava/nio/ByteBuffer;", "byteBuffer", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "writeSampleData", "(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V", "release", "", "isInterruptionResilient", "()Z", "Companion", "Format"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Muxer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.video.internal.muxer.Muxer.Companion INSTANCE = androidx.camera.video.internal.muxer.Muxer.Companion.getHighSpeedVideoFpsRangesFor;
    public static final int MUXER_FORMAT_3GPP = 2;
    public static final int MUXER_FORMAT_MPEG_4 = 0;
    public static final int MUXER_FORMAT_WEBM = 1;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/camera/video/internal/muxer/Muxer$Format;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface Format {
    }

    int addTrack(android.media.MediaFormat format) throws androidx.camera.video.internal.muxer.MuxerException;

    boolean isInterruptionResilient();

    void release();

    void setCaptureFps(int captureFps) throws java.lang.IllegalArgumentException;

    void setLocation(double latitude, double longitude) throws java.lang.IllegalArgumentException;

    void setOrientationDegrees(int degrees) throws java.lang.IllegalArgumentException;

    void setOutput(android.os.ParcelFileDescriptor parcelFileDescriptor, int format) throws java.io.IOException;

    void setOutput(java.lang.String path, int format) throws java.io.IOException;

    void start() throws androidx.camera.video.internal.muxer.MuxerException;

    void stop() throws androidx.camera.video.internal.muxer.MuxerException;

    void writeSampleData(int trackIndex, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws androidx.camera.video.internal.muxer.MuxerException;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/camera/video/internal/muxer/Muxer$Companion;", "", "<init>", "()V", "", "MUXER_FORMAT_MPEG_4", com.visa.cbp.getEncExpo.warmup, "MUXER_FORMAT_WEBM", "MUXER_FORMAT_3GPP"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final int MUXER_FORMAT_3GPP = 2;
        public static final int MUXER_FORMAT_MPEG_4 = 0;
        public static final int MUXER_FORMAT_WEBM = 1;
        static final /* synthetic */ androidx.camera.video.internal.muxer.Muxer.Companion getHighSpeedVideoFpsRangesFor = new androidx.camera.video.internal.muxer.Muxer.Companion();

        private Companion() {
        }
    }
}
