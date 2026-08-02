package androidx.media3.common.audio;

/* loaded from: classes7.dex */
public final class AudioMixingUtil {
    public static boolean canMix(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        if (audioFormat.sampleRate == -1 || audioFormat.channelCount == -1) {
            return false;
        }
        return audioFormat.encoding == 2 || audioFormat.encoding == 4;
    }

    public static boolean canMix(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2) {
        return audioFormat.sampleRate == audioFormat2.sampleRate && canMix(audioFormat) && canMix(audioFormat2);
    }

    public static java.nio.ByteBuffer mix(java.nio.ByteBuffer byteBuffer, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat, java.nio.ByteBuffer byteBuffer2, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat2, androidx.media3.common.audio.ChannelMixingMatrix channelMixingMatrix, int i, boolean z, boolean z2) {
        androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat3;
        boolean z3;
        float f;
        if (audioFormat.encoding == 2) {
            audioFormat3 = audioFormat2;
            z3 = true;
        } else {
            audioFormat3 = audioFormat2;
            z3 = false;
        }
        boolean z4 = audioFormat3.encoding == 2;
        int inputChannelCount = channelMixingMatrix.getInputChannelCount();
        int outputChannelCount = channelMixingMatrix.getOutputChannelCount();
        float[] fArr = new float[inputChannelCount];
        float[] fArr2 = new float[outputChannelCount];
        for (int i2 = 0; i2 < i; i2++) {
            if (z) {
                int position = byteBuffer2.position();
                for (int i3 = 0; i3 < outputChannelCount; i3++) {
                    fArr2[i3] = getHighSpeedVideoFpsRanges(byteBuffer2, z4, z4);
                }
                byteBuffer2.position(position);
            }
            for (int i4 = 0; i4 < inputChannelCount; i4++) {
                fArr[i4] = getHighSpeedVideoFpsRanges(byteBuffer, z3, z4);
            }
            for (int i5 = 0; i5 < outputChannelCount; i5++) {
                for (int i6 = 0; i6 < inputChannelCount; i6++) {
                    fArr2[i5] = fArr2[i5] + (fArr[i6] * channelMixingMatrix.getMixingCoefficient(i6, i5));
                }
                if (z4) {
                    byteBuffer2.putShort((short) androidx.media3.common.util.Util.constrainValue(fArr2[i5], -32768.0f, 32767.0f));
                } else {
                    if (z2) {
                        f = androidx.media3.common.util.Util.constrainValue(fArr2[i5], -1.0f, 1.0f);
                    } else {
                        f = fArr2[i5];
                    }
                    byteBuffer2.putFloat(f);
                }
                fArr2[i5] = 0.0f;
            }
        }
        return byteBuffer2;
    }

    private static float getHighSpeedVideoFpsRanges(java.nio.ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            return androidx.media3.common.util.Util.constrainValue(f * (f >= 0.0f ? 32767 : 32768), -32768.0f, 32767.0f);
        }
        if (!z) {
            return byteBuffer.getFloat();
        }
        short s = byteBuffer.getShort();
        return s / (s >= 0 ? 32767 : 32768);
    }

    private AudioMixingUtil() {
    }
}
