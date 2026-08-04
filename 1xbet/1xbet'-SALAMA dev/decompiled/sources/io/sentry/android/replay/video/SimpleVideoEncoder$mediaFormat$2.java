package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import io.sentry.SentryLevel;
import s6.a;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleVideoEncoder$mediaFormat$2 extends i implements a {
    final /* synthetic */ SimpleVideoEncoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleVideoEncoder$mediaFormat$2(SimpleVideoEncoder simpleVideoEncoder) {
        super(0);
        this.this$0 = simpleVideoEncoder;
    }

    @Override // s6.a
    public final MediaFormat invoke() {
        int bitRate = this.this$0.getMuxerConfig().getBitRate();
        try {
            MediaCodecInfo.VideoCapabilities videoCapabilities = this.this$0.getMediaCodec$sentry_android_replay_release().getCodecInfo().getCapabilitiesForType(this.this$0.getMuxerConfig().getMimeType()).getVideoCapabilities();
            if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(bitRate))) {
                this.this$0.getOptions().getLogger().log(SentryLevel.DEBUG, "Encoder doesn't support the provided bitRate: " + bitRate + ", the value will be clamped to the closest one", new Object[0]);
                Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(bitRate));
                h.d(objClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                bitRate = ((Number) objClamp).intValue();
            }
        } catch (Throwable th) {
            this.this$0.getOptions().getLogger().log(SentryLevel.DEBUG, "Could not retrieve MediaCodec info", th);
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.this$0.getMuxerConfig().getMimeType(), this.this$0.getMuxerConfig().getRecordingWidth(), this.this$0.getMuxerConfig().getRecordingHeight());
        h.d(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …ecordingHeight,\n        )");
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", bitRate);
        mediaFormatCreateVideoFormat.setFloat("frame-rate", this.this$0.getMuxerConfig().getFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
        return mediaFormatCreateVideoFormat;
    }
}
