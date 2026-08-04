package io.sentry.android.replay.video;

import C6.o;
import W5.AbstractC0486a1;
import Y4.D;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.SystemProperties;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.nio.ByteBuffer;
import p031e1.k;
import p044f6.b;
import p044f6.c;
import s6.a;
import t6.e;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class SimpleVideoEncoder {
    public static final int $stable = 8;
    private final MediaCodec.BufferInfo bufferInfo;
    private final SimpleMp4FrameMuxer frameMuxer;
    private final b hasExynosCodec$delegate;
    private final MediaCodec mediaCodec;
    private final b mediaFormat$delegate;
    private final MuxerConfig muxerConfig;
    private final a onClose;
    private final SentryOptions options;
    private Surface surface;

    public SimpleVideoEncoder(SentryOptions sentryOptions, MuxerConfig muxerConfig, a aVar) {
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(muxerConfig, "muxerConfig");
        this.options = sentryOptions;
        this.muxerConfig = muxerConfig;
        this.onClose = aVar;
        c[] cVarArr = c.f13005a;
        this.hasExynosCodec$delegate = D.B(SimpleVideoEncoder$hasExynosCodec$2.INSTANCE);
        MediaCodec mediaCodecCreateByCodecName = getHasExynosCodec() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.getMimeType());
        h.d(mediaCodecCreateByCodecName, "if (hasExynosCodec) {\n  …rConfig.mimeType)\n      }");
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.mediaFormat$delegate = D.B(new SimpleVideoEncoder$mediaFormat$2(this));
        this.bufferInfo = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.getFile().getAbsolutePath();
        h.d(absolutePath, "muxerConfig.file.absolutePath");
        this.frameMuxer = new SimpleMp4FrameMuxer(absolutePath, muxerConfig.getFrameRate());
    }

    private final void drainCodec(boolean z4) {
        ByteBuffer byteBuffer;
        if (this.options.getSessionReplay().isDebug()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "[Encoder]: drainCodec(" + z4 + ')', new Object[0]);
        }
        if (z4) {
            if (this.options.getSessionReplay().isDebug()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            this.mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.mediaCodec.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(this.bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z4) {
                    return;
                }
                if (this.options.getSessionReplay().isDebug()) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.mediaCodec.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.frameMuxer.isStarted()) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                h.d(outputFormat, "mediaCodec.outputFormat");
                if (this.options.getSessionReplay().isDebug()) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                }
                this.frameMuxer.start(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                if (this.options.getSessionReplay().isDebug()) {
                    this.options.getLogger().log(SentryLevel.DEBUG, k.d(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                }
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    throw new RuntimeException(AbstractC0486a1.f(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                if ((this.bufferInfo.flags & 2) != 0) {
                    if (this.options.getSessionReplay().isDebug()) {
                        this.options.getLogger().log(SentryLevel.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    }
                    this.bufferInfo.size = 0;
                }
                if (this.bufferInfo.size != 0) {
                    if (!this.frameMuxer.isStarted()) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    this.frameMuxer.muxVideoFrame(byteBuffer, this.bufferInfo);
                    if (this.options.getSessionReplay().isDebug()) {
                        this.options.getLogger().log(SentryLevel.DEBUG, k.g(new StringBuilder("[Encoder]: sent "), this.bufferInfo.size, " bytes to muxer"), new Object[0]);
                    }
                }
                this.mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.bufferInfo.flags & 4) != 0) {
                    if (this.options.getSessionReplay().isDebug()) {
                        if (z4) {
                            this.options.getLogger().log(SentryLevel.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                            return;
                        } else {
                            this.options.getLogger().log(SentryLevel.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    private final boolean getHasExynosCodec() {
        return ((Boolean) this.hasExynosCodec$delegate.getValue()).booleanValue();
    }

    private final MediaFormat getMediaFormat() {
        return (MediaFormat) this.mediaFormat$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    public final void encode(Bitmap bitmap) {
        Surface surface;
        Canvas canvasLockCanvas;
        h.e(bitmap, "image");
        String str = Build.MANUFACTURER;
        h.d(str, "MANUFACTURER");
        if (o.p0(str, "xiaomi", true) || o.p0(str, "motorola", true)) {
            surface = this.surface;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            SystemProperties systemProperties = SystemProperties.INSTANCE;
            SystemProperties.Property property = SystemProperties.Property.SOC_MANUFACTURER;
            String str2 = SystemProperties.get$default(systemProperties, property, null, 2, null);
            if (str2 == null ? false : str2.equalsIgnoreCase("spreadtrum")) {
                surface = this.surface;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                String str3 = SystemProperties.get$default(systemProperties, property, null, 2, null);
                if (str3 == null ? false : str3.equalsIgnoreCase("unisoc")) {
                    surface = this.surface;
                    if (surface != null) {
                        canvasLockCanvas = surface.lockCanvas(null);
                    } else {
                        canvasLockCanvas = null;
                    }
                } else {
                    Surface surface2 = this.surface;
                    if (surface2 != null) {
                        canvasLockCanvas = surface2.lockHardwareCanvas();
                    } else {
                        canvasLockCanvas = null;
                    }
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = this.surface;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        drainCodec(false);
    }

    public final long getDuration() {
        return this.frameMuxer.getVideoTime();
    }

    public final MediaCodec getMediaCodec$sentry_android_replay_release() {
        return this.mediaCodec;
    }

    public final MuxerConfig getMuxerConfig() {
        return this.muxerConfig;
    }

    public final a getOnClose() {
        return this.onClose;
    }

    public final SentryOptions getOptions() {
        return this.options;
    }

    public final void release() {
        try {
            a aVar = this.onClose;
            if (aVar != null) {
                aVar.invoke();
            }
            drainCodec(true);
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.frameMuxer.release();
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Failed to properly release video encoder", th);
        }
    }

    public final void start() {
        this.mediaCodec.configure(getMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
        this.surface = this.mediaCodec.createInputSurface();
        this.mediaCodec.start();
        drainCodec(false);
    }

    public /* synthetic */ SimpleVideoEncoder(SentryOptions sentryOptions, MuxerConfig muxerConfig, a aVar, int i7, e eVar) {
        this(sentryOptions, muxerConfig, (i7 & 4) != 0 ? null : aVar);
    }
}
