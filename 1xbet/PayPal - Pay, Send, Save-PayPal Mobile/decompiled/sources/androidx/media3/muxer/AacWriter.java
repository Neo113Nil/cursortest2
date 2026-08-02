package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class AacWriter {
    static final com.google.common.collect.ImmutableMap<java.lang.Integer, java.lang.Integer> Camera2StreamConfigurationMap = com.google.common.collect.ImmutableMap.ofEntries(androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) java.lang.Integer.valueOf(androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE), (java.lang.Object) 0), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 88200, (java.lang.Object) 1), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 64000, (java.lang.Object) 2), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 48000, (java.lang.Object) 3), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 44100, (java.lang.Object) 4), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 32000, (java.lang.Object) 5), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 24000, (java.lang.Object) 6), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 22050, (java.lang.Object) 7), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 16000, (java.lang.Object) 8), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) java.lang.Integer.valueOf(com.google.android.gms.safetynet.SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES), (java.lang.Object) 9), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 11025, (java.lang.Object) 10), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) java.lang.Integer.valueOf(com.visa.cbp.sdk.facade.data.Constants.ON_ERROR_DAS_VALIDATE_GETKEY), (java.lang.Object) 11), androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9178m((java.lang.Object) 7350, (java.lang.Object) 12));
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final java.nio.channels.FileChannel getHighSpeedVideoFpsRangesFor;
    androidx.media3.common.Format getHighSpeedVideoSizes;

    public AacWriter(java.io.FileOutputStream fileOutputStream) {
        this.getHighSpeedVideoFpsRangesFor = fileOutputStream.getChannel();
    }
}
