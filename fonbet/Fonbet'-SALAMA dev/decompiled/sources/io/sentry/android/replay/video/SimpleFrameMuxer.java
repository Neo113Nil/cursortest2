package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface SimpleFrameMuxer {
    long getVideoTime();

    boolean isStarted();

    void muxVideoFrame(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void release();

    void start(MediaFormat mediaFormat);
}
