package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class MediaFormatUtil {
    public static final java.lang.String KEY_MAX_BIT_RATE = "max-bitrate";
    public static final java.lang.String KEY_PCM_ENCODING_EXTENDED = "exo-pcm-encoding-int";
    public static final java.lang.String KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";

    public static androidx.media3.common.Format createFormatFromMediaFormat(android.media.MediaFormat mediaFormat) {
        java.lang.String string;
        androidx.media3.common.Format.Builder averageBitrate = new androidx.media3.common.Format.Builder().setSampleMimeType(mediaFormat.getString("mime")).setLanguage(mediaFormat.getString(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY)).setPeakBitrate(getInteger(mediaFormat, KEY_MAX_BIT_RATE, -1)).setAverageBitrate(getInteger(mediaFormat, "bitrate", -1));
        if (java.util.Objects.equals(mediaFormat.getString("mime"), androidx.media3.common.MimeTypes.VIDEO_H263) && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            string = androidx.media3.common.util.CodecSpecificDataUtil.buildH263CodecString(mediaFormat.getInteger("profile"), mediaFormat.getInteger("level"));
        } else if (java.util.Objects.equals(mediaFormat.getString("mime"), androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION) && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            string = androidx.media3.common.util.CodecSpecificDataUtil.buildDolbyVisionCodecString(androidx.media3.common.util.CodecSpecificDataUtil.dolbyVisionConstantToProfileNumber(mediaFormat.getInteger("profile")), androidx.media3.common.util.CodecSpecificDataUtil.dolbyVisionConstantToLevelNumber(mediaFormat.getInteger("level")));
        } else {
            string = getString(mediaFormat, "codecs-string", null);
        }
        androidx.media3.common.Format.Builder height = averageBitrate.setCodecs(string).setFrameRate(getFloatFromIntOrFloat(mediaFormat, "frame-rate", -1.0f)).setWidth(getInteger(mediaFormat, "width", -1)).setHeight(getInteger(mediaFormat, "height", -1));
        float f = 1.0f;
        if (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i = 0;
        androidx.media3.common.Format.Builder pcmEncoding = height.setPixelWidthHeightRatio(f).setMaxInputSize(getInteger(mediaFormat, "max-input-size", -1)).setRotationDegrees(getInteger(mediaFormat, "rotation-degrees", 0)).setColorInfo(getColorInfo(mediaFormat)).setSampleRate(getInteger(mediaFormat, "sample-rate", -1)).setChannelCount(getInteger(mediaFormat, "channel-count", -1)).setPcmEncoding(getInteger(mediaFormat, "pcm-encoding", -1));
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        while (true) {
            java.nio.ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-".concat(java.lang.String.valueOf(i)));
            if (byteBuffer == null) {
                break;
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.rewind();
            builder.add((com.google.common.collect.ImmutableList.Builder) bArr);
            i++;
        }
        pcmEncoding.setInitializationData(builder.build());
        if (mediaFormat.containsKey("track-id")) {
            pcmEncoding.setId(mediaFormat.getInteger("track-id"));
        }
        return pcmEncoding.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r1 != 22) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.media.MediaFormat createMediaFormatFromFormat(androidx.media3.common.Format format) {
        int i;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        maybeSetInteger(mediaFormat, "bitrate", format.bitrate);
        maybeSetInteger(mediaFormat, KEY_MAX_BIT_RATE, format.peakBitrate);
        maybeSetInteger(mediaFormat, "channel-count", format.channelCount);
        int audioTrackChannelConfig = androidx.media3.common.util.Util.getAudioTrackChannelConfig(format.channelCount);
        if (audioTrackChannelConfig != 0) {
            mediaFormat.setInteger("channel-mask", audioTrackChannelConfig);
        }
        maybeSetColorInfo(mediaFormat, format.colorInfo);
        maybeSetString(mediaFormat, "mime", format.sampleMimeType);
        maybeSetString(mediaFormat, "codecs-string", format.codecs);
        maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        maybeSetInteger(mediaFormat, "width", format.width);
        maybeSetInteger(mediaFormat, "height", format.height);
        setCsdBuffers(mediaFormat, format.initializationData);
        int i2 = format.pcmEncoding;
        if (i2 != -1) {
            maybeSetInteger(mediaFormat, KEY_PCM_ENCODING_EXTENDED, i2);
            if (i2 == 0) {
                i = 0;
            } else if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        i = 21;
                        if (i2 != 21) {
                            i = 22;
                        }
                    }
                }
            } else {
                i = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i);
        }
        maybeSetString(mediaFormat, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, format.language);
        maybeSetInteger(mediaFormat, "max-input-size", format.maxInputSize);
        maybeSetInteger(mediaFormat, "sample-rate", format.sampleRate);
        maybeSetInteger(mediaFormat, "caption-service-number", format.accessibilityChannel);
        mediaFormat.setInteger("rotation-degrees", format.rotationDegrees);
        int i3 = format.selectionFlags;
        int i4 = 1;
        mediaFormat.setInteger("is-autoselect", (i3 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i3 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i3 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", format.encoderDelay);
        mediaFormat.setInteger("encoder-padding", format.encoderPadding);
        float f = format.pixelWidthHeightRatio;
        mediaFormat.setFloat(KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT, f);
        int i5 = 1073741824;
        if (f < 1.0f) {
            i4 = (int) (f * 1.0737418E9f);
        } else if (f > 1.0f) {
            i5 = (int) (1.0737418E9f / f);
            i4 = 1073741824;
        } else {
            i5 = 1;
        }
        mediaFormat.setInteger("sar-width", i4);
        mediaFormat.setInteger("sar-height", i5);
        if (format.id != null) {
            try {
                mediaFormat.setInteger("track-id", java.lang.Integer.parseInt(format.id));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return mediaFormat;
    }

    public static void maybeSetString(android.media.MediaFormat mediaFormat, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public static void setCsdBuffers(android.media.MediaFormat mediaFormat, java.util.List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-".concat(java.lang.String.valueOf(i)), java.nio.ByteBuffer.wrap(list.get(i)));
        }
    }

    public static void maybeSetInteger(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void maybeSetFloat(android.media.MediaFormat mediaFormat, java.lang.String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void maybeSetByteBuffer(android.media.MediaFormat mediaFormat, java.lang.String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, java.nio.ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(android.media.MediaFormat mediaFormat, androidx.media3.common.ColorInfo colorInfo) {
        if (colorInfo != null) {
            maybeSetInteger(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            maybeSetInteger(mediaFormat, "color-standard", colorInfo.colorSpace);
            maybeSetInteger(mediaFormat, "color-range", colorInfo.colorRange);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }

    public static androidx.media3.common.ColorInfo getColorInfo(android.media.MediaFormat mediaFormat) {
        int integer = getInteger(mediaFormat, "color-standard", -1);
        int integer2 = getInteger(mediaFormat, "color-range", -1);
        int integer3 = getInteger(mediaFormat, "color-transfer", -1);
        java.nio.ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] array = byteBuffer != null ? getArray(byteBuffer) : null;
        if (integer != 2 && integer != 1 && integer != 6 && integer != -1) {
            integer = -1;
        }
        if (integer2 != 2 && integer2 != 1 && integer2 != -1) {
            integer2 = -1;
        }
        if (integer3 != 1 && integer3 != 3 && integer3 != 2 && integer3 != 6 && integer3 != 7 && integer3 != -1) {
            integer3 = -1;
        }
        if (integer == -1 && integer2 == -1 && integer3 == -1 && array == null) {
            return null;
        }
        return new androidx.media3.common.ColorInfo.Builder().setColorSpace(integer).setColorRange(integer2).setColorTransfer(integer3).setHdrStaticInfo(array).build();
    }

    public static int getInteger(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    public static float getFloat(android.media.MediaFormat mediaFormat, java.lang.String str, float f) {
        return mediaFormat.containsKey(str) ? mediaFormat.getFloat(str) : f;
    }

    public static java.lang.String getString(android.media.MediaFormat mediaFormat, java.lang.String str, java.lang.String str2) {
        return mediaFormat.containsKey(str) ? mediaFormat.getString(str) : str2;
    }

    public static float getFloatFromIntOrFloat(android.media.MediaFormat mediaFormat, java.lang.String str, float f) {
        int integer;
        if (!mediaFormat.containsKey(str)) {
            return f;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (mediaFormat.getValueTypeForKey(str) == 3) {
                return mediaFormat.getFloat(str);
            }
            integer = mediaFormat.getInteger(str);
        } else {
            try {
                return mediaFormat.getFloat(str);
            } catch (java.lang.ClassCastException unused) {
                integer = mediaFormat.getInteger(str);
            }
        }
        return integer;
    }

    public static byte[] getArray(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static boolean isVideoFormat(android.media.MediaFormat mediaFormat) {
        return androidx.media3.common.MimeTypes.isVideo(mediaFormat.getString("mime"));
    }

    public static boolean isAudioFormat(android.media.MediaFormat mediaFormat) {
        return androidx.media3.common.MimeTypes.isAudio(mediaFormat.getString("mime"));
    }

    public static java.lang.Integer getTimeLapseFrameRate(android.media.MediaFormat mediaFormat) {
        if (mediaFormat.containsKey(androidx.camera.video.internal.utils.MediaFormatExt.KEY_TIMELAPSE_ENABLED) && mediaFormat.getInteger(androidx.camera.video.internal.utils.MediaFormatExt.KEY_TIMELAPSE_ENABLED) > 0 && mediaFormat.containsKey(androidx.camera.video.internal.utils.MediaFormatExt.KEY_TIMELAPSE_FPS)) {
            return java.lang.Integer.valueOf(mediaFormat.getInteger(androidx.camera.video.internal.utils.MediaFormatExt.KEY_TIMELAPSE_FPS));
        }
        return null;
    }

    private MediaFormatUtil() {
    }
}
