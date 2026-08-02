package androidx.camera.video.internal;

/* loaded from: classes6.dex */
public final class DebugUtils {
    private DebugUtils() {
    }

    public static java.lang.String readableUs(long j) {
        return readableMs(java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(j));
    }

    public static java.lang.String readableBufferInfo(android.media.MediaCodec.BufferInfo bufferInfo) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Dump BufferInfo: ");
        sb2.append(bufferInfo.toString());
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        sb.append(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\toffset: ");
        sb3.append(bufferInfo.offset);
        sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        sb.append(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\tsize: ");
        sb4.append(bufferInfo.size);
        sb4.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        sb.append(sb4.toString());
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("\tflag: ");
        sb5.append(bufferInfo.flags);
        sb.append(sb5.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((bufferInfo.flags & 4) != 0) {
            arrayList.add("EOS");
        }
        if ((bufferInfo.flags & 2) != 0) {
            arrayList.add("CODEC_CONFIG");
        }
        if ((bufferInfo.flags & 1) != 0) {
            arrayList.add("KEY_FRAME");
        }
        if ((bufferInfo.flags & 8) != 0) {
            arrayList.add("PARTIAL_FRAME");
        }
        if (!arrayList.isEmpty()) {
            sb.append(" (");
            sb.append(android.text.TextUtils.join(com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR, arrayList));
            sb.append(")");
        }
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\tpresentationTime: ");
        sb6.append(bufferInfo.presentationTimeUs);
        sb6.append(" (");
        sb6.append(readableUs(bufferInfo.presentationTimeUs));
        sb6.append(")\n");
        sb.append(sb6.toString());
        return sb.toString();
    }

    public static java.lang.String dumpMediaCodecListForFormat(android.media.MediaCodecList mediaCodecList, android.media.MediaFormat mediaFormat) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[Start] Dump MediaCodecList for mediaFormat ".concat(java.lang.String.valueOf(mediaFormat)));
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String string = mediaFormat.getString("mime");
        for (android.media.MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z = true;
                try {
                    androidx.core.util.Preconditions.checkArgument(string != null);
                    android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z = false;
                    }
                    androidx.core.util.Preconditions.checkArgument(z);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("[Start] [");
                    sb2.append(mediaCodecInfo.getName());
                    sb2.append("]");
                    sb.append(sb2.toString());
                    sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                    getHighSpeedVideoFpsRanges(sb, capabilitiesForType, mediaFormat);
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append("[End] [");
                    sb3.append(mediaCodecInfo.getName());
                    sb3.append("]");
                    sb.append(sb3.toString());
                    sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                } catch (java.lang.IllegalArgumentException unused) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[");
                    sb4.append(mediaCodecInfo.getName());
                    sb4.append("] does not support mime ");
                    sb4.append(string);
                    sb.append(sb4.toString());
                    sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                }
            }
        }
        sb.append("[End] Dump MediaCodecList");
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.String obj = sb.toString();
        if (androidx.camera.core.Logger.isInfoEnabled("DebugUtils")) {
            java.util.Scanner scanner = new java.util.Scanner(obj);
            while (scanner.hasNextLine()) {
                androidx.camera.core.Logger.i("DebugUtils", scanner.nextLine());
            }
        }
        return obj;
    }

    public static java.lang.String dumpCodecCapabilities(java.lang.String str, android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            androidx.core.util.Preconditions.checkArgument(capabilitiesForType != null);
            getHighSpeedVideoFpsRanges(sb, capabilitiesForType, mediaFormat);
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[");
            sb2.append(mediaCodec.getName());
            sb2.append("] does not support mime ");
            sb2.append(str);
            sb.append(sb2.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        return sb.toString();
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, android.media.MediaFormat mediaFormat) {
        try {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[CodecCaps] isFormatSupported = ");
            sb2.append(codecCapabilities.isFormatSupported(mediaFormat));
            sb.append(sb2.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        } catch (java.lang.ClassCastException unused) {
            sb.append("[CodecCaps] isFormatSupported=false");
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[CodecCaps] getDefaultFormat = ");
        sb3.append(codecCapabilities.getDefaultFormat());
        sb.append(sb3.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        if (codecCapabilities.profileLevels != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(getHighResolutionOutputSizeshNQ4ISI(codecProfileLevel));
            }
            sb4.append(android.text.TextUtils.join(", ", arrayList));
            sb4.append("]");
            sb.append("[CodecCaps] profileLevels = ".concat(java.lang.String.valueOf(sb4)));
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (codecCapabilities.colorFormats != null) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("[CodecCaps] colorFormats = ");
            sb5.append(java.util.Arrays.toString(codecCapabilities.colorFormats));
            sb.append(sb5.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            getHighResolutionOutputSizeshNQ4ISI(sb, videoCapabilities, mediaFormat);
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            getHighSpeedVideoFpsRanges(sb, audioCapabilities, mediaFormat);
        }
        android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            Camera2StreamConfigurationMap(sb, encoderCapabilities, mediaFormat);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, android.media.MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[VideoCaps] getBitrateRange = ");
        sb2.append(videoCapabilities.getBitrateRange());
        sb.append(sb2.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[VideoCaps] getSupportedWidths = ");
        sb3.append(videoCapabilities.getSupportedWidths());
        sb3.append(", getWidthAlignment = ");
        sb3.append(videoCapabilities.getWidthAlignment());
        sb.append(sb3.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[VideoCaps] getSupportedHeights = ");
        sb4.append(videoCapabilities.getSupportedHeights());
        sb4.append(", getHeightAlignment = ");
        sb4.append(videoCapabilities.getHeightAlignment());
        sb.append(sb4.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        boolean z2 = true;
        int i3 = 0;
        try {
            i = mediaFormat.getInteger("width");
            i2 = mediaFormat.getInteger("height");
            androidx.core.util.Preconditions.checkArgument(i > 0 && i2 > 0);
            z = true;
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException unused) {
            sb.append("[VideoCaps] mediaFormat does not contain valid width and height");
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            i = 0;
            i2 = 0;
            z = false;
        }
        if (z) {
            try {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("[VideoCaps] getSupportedHeightsFor ");
                sb5.append(i);
                sb5.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                sb5.append(videoCapabilities.getSupportedHeightsFor(i));
                sb.append(sb5.toString());
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            } catch (java.lang.IllegalArgumentException unused2) {
                sb.append("[VideoCaps] could not getSupportedHeightsFor ".concat(java.lang.String.valueOf(i)));
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            }
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[VideoCaps] getSupportedWidthsFor ");
                sb6.append(i2);
                sb6.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                sb6.append(videoCapabilities.getSupportedWidthsFor(i2));
                sb.append(sb6.toString());
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            } catch (java.lang.IllegalArgumentException unused3) {
                sb.append("[VideoCaps] could not getSupportedWidthsFor ".concat(java.lang.String.valueOf(i2)));
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[VideoCaps] isSizeSupported for ");
            sb7.append(i);
            sb7.append("x");
            sb7.append(i2);
            sb7.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
            sb7.append(videoCapabilities.isSizeSupported(i, i2));
            sb.append(sb7.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[VideoCaps] getSupportedFrameRates = ");
        sb8.append(videoCapabilities.getSupportedFrameRates());
        sb.append(sb8.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        try {
            int integer = mediaFormat.getInteger("frame-rate");
            if (integer <= 0) {
                z2 = false;
            }
            androidx.core.util.Preconditions.checkArgument(z2);
            i3 = integer;
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException unused4) {
            sb.append("[VideoCaps] mediaFormat does not contain frame rate");
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (z) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[VideoCaps] getSupportedFrameRatesFor ");
            sb9.append(i);
            sb9.append("x");
            sb9.append(i2);
            sb9.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
            sb9.append(videoCapabilities.getSupportedFrameRatesFor(i, i2));
            sb.append(sb9.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (!z || i3 <= 0) {
            return;
        }
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[VideoCaps] areSizeAndRateSupported for ");
        sb10.append(i);
        sb10.append("x");
        sb10.append(i2);
        sb10.append(", ");
        sb10.append(i3);
        sb10.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb10.append(videoCapabilities.areSizeAndRateSupported(i, i2, i3));
        sb.append(sb10.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, android.media.MediaCodecInfo.AudioCapabilities audioCapabilities, android.media.MediaFormat mediaFormat) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[AudioCaps] getBitrateRange = ");
        sb2.append(audioCapabilities.getBitrateRange());
        sb.append(sb2.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[AudioCaps] getMaxInputChannelCount = ");
        sb3.append(audioCapabilities.getMaxInputChannelCount());
        sb.append(sb3.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[AudioCaps] getMinInputChannelCount = ");
            sb4.append(androidx.camera.video.internal.compat.Api31Impl.getMinInputChannelCount(audioCapabilities));
            sb.append(sb4.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("[AudioCaps] getInputChannelCountRanges = ");
            sb5.append(java.util.Arrays.toString(androidx.camera.video.internal.compat.Api31Impl.getInputChannelCountRanges(audioCapabilities)));
            sb.append(sb5.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AudioCaps] getSupportedSampleRateRanges = ");
        sb6.append(java.util.Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        sb.append(sb6.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[AudioCaps] getSupportedSampleRates = ");
        sb7.append(java.util.Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        sb.append(sb7.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[AudioCaps] isSampleRateSupported for ");
            sb8.append(integer);
            sb8.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
            sb8.append(audioCapabilities.isSampleRateSupported(integer));
            sb.append(sb8.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException unused) {
            sb.append("[AudioCaps] mediaFormat does not contain sample rate");
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.StringBuilder sb, android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities, android.media.MediaFormat mediaFormat) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[EncoderCaps] getComplexityRange = ");
        sb2.append(encoderCapabilities.getComplexityRange());
        sb.append(sb2.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[EncoderCaps] getQualityRange = ");
            sb3.append(androidx.camera.video.internal.compat.Api28Impl.getQualityRange(encoderCapabilities));
            sb.append(sb3.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        try {
            int integer = mediaFormat.getInteger("bitrate-mode");
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[EncoderCaps] isBitrateModeSupported = ");
            sb4.append(encoderCapabilities.isBitrateModeSupported(integer));
            sb.append(sb4.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException unused) {
            sb.append("[EncoderCaps] mediaFormat does not contain bitrate mode");
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        if (codecProfileLevel == null) {
            return "null";
        }
        return java.lang.String.format("{level=%d, profile=%d}", java.lang.Integer.valueOf(codecProfileLevel.level), java.lang.Integer.valueOf(codecProfileLevel.profile));
    }

    public static java.lang.String bytesToHexString(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            sb.append(java.lang.String.format("%02X ", java.lang.Byte.valueOf(b)));
        }
        return sb.toString().trim();
    }

    public static java.lang.String byteBufferToHex(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int position = byteBuffer.position();
        try {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return bytesToHexString(bArr);
        } finally {
            byteBuffer.position(position);
        }
    }

    public static java.lang.String getCsdHex(android.media.MediaFormat mediaFormat) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{csd-0 = ");
        sb.append(byteBufferToHex(mediaFormat.getByteBuffer(androidx.camera.video.internal.utils.MediaFormatExt.KEY_CSD_0)));
        if (mediaFormat.containsKey(androidx.camera.video.internal.utils.MediaFormatExt.KEY_CSD_1)) {
            sb.append(", csd-1 = ");
            sb.append(byteBufferToHex(mediaFormat.getByteBuffer(androidx.camera.video.internal.utils.MediaFormatExt.KEY_CSD_1)));
        }
        if (mediaFormat.containsKey(androidx.camera.video.internal.utils.MediaFormatExt.KEY_CSD_2)) {
            sb.append(", csd-2 = ");
            sb.append(byteBufferToHex(mediaFormat.getByteBuffer(androidx.camera.video.internal.utils.MediaFormatExt.KEY_CSD_2)));
        }
        sb.append("}");
        return sb.toString();
    }

    public static java.lang.String readableMs(long j) {
        long hours = java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j);
        long minutes = java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j - java.util.concurrent.TimeUnit.HOURS.toMillis(hours));
        long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds((j - java.util.concurrent.TimeUnit.HOURS.toMillis(hours)) - java.util.concurrent.TimeUnit.MINUTES.toMillis(minutes));
        long millis = java.util.concurrent.TimeUnit.HOURS.toMillis(hours);
        long millis2 = java.util.concurrent.TimeUnit.MINUTES.toMillis(minutes);
        return java.lang.String.format(java.util.Locale.US, "%02d:%02d:%02d.%03d", java.lang.Long.valueOf(hours), java.lang.Long.valueOf(minutes), java.lang.Long.valueOf(seconds), java.lang.Long.valueOf(((j - millis) - millis2) - java.util.concurrent.TimeUnit.SECONDS.toMillis(seconds)));
    }
}
