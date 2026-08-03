package com.google.android.exoplayer2.source.chunk;

/* loaded from: classes3.dex */
public final class BaseMediaChunkOutput implements com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider {
    private static final java.lang.String TAG = "BaseMediaChunkOutput";
    private final com.google.android.exoplayer2.source.SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider
    public com.google.android.exoplayer2.extractor.TrackOutput track(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i3 < iArr.length) {
                if (i2 == iArr[i3]) {
                    return this.sampleQueues[i3];
                }
                i3++;
            } else {
                com.google.android.exoplayer2.util.Log.e(TAG, "Unmatched track of type: " + i2);
                return new com.google.android.exoplayer2.extractor.DummyTrackOutput();
            }
        }
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.source.SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i] = sampleQueueArr[i].getWriteIndex();
            i++;
        }
    }

    public void setSampleOffsetUs(long j) {
        for (com.google.android.exoplayer2.source.SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j);
        }
    }
}
