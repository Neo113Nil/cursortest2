package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class SimpleMp4FrameMuxer implements SimpleFrameMuxer {
    public static final int $stable = 8;
    private long finalVideoTime;
    private final long frameDurationUsec;
    private final MediaMuxer muxer;
    private boolean started;
    private int videoFrames;
    private int videoTrackIndex;

    public SimpleMp4FrameMuxer(String str, float f7) {
        h.e(str, "path");
        this.frameDurationUsec = (long) (TimeUnit.SECONDS.toMicros(1L) / f7);
        this.muxer = new MediaMuxer(str, 0);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public long getVideoTime() {
        if (this.videoFrames == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.finalVideoTime + this.frameDurationUsec, TimeUnit.MICROSECONDS);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public boolean isStarted() {
        return this.started;
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void muxVideoFrame(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        h.e(byteBuffer, "encodedData");
        h.e(bufferInfo, "bufferInfo");
        long j = this.frameDurationUsec;
        int i7 = this.videoFrames;
        this.videoFrames = i7 + 1;
        long j3 = j * ((long) i7);
        this.finalVideoTime = j3;
        bufferInfo.presentationTimeUs = j3;
        this.muxer.writeSampleData(this.videoTrackIndex, byteBuffer, bufferInfo);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void release() {
        this.muxer.stop();
        this.muxer.release();
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void start(MediaFormat mediaFormat) {
        h.e(mediaFormat, "videoFormat");
        this.videoTrackIndex = this.muxer.addTrack(mediaFormat);
        this.muxer.start();
        this.started = true;
    }
}
