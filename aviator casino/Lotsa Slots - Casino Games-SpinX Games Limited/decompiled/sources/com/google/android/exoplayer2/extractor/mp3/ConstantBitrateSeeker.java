package com.google.android.exoplayer2.extractor.mp3;

/* loaded from: classes3.dex */
final class ConstantBitrateSeeker extends com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap implements com.google.android.exoplayer2.extractor.mp3.Seeker {
    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    public ConstantBitrateSeeker(long j, long j2, com.google.android.exoplayer2.audio.MpegAudioUtil.Header header, boolean z) {
        super(j, j2, header.bitrate, header.frameSize, z);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }
}
