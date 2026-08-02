package androidx.media3.container;

/* loaded from: classes7.dex */
public final class ReorderingBufferQueue {
    private final androidx.media3.container.ReorderingBufferQueue.OutputConsumer getHighResolutionOutputSizeshNQ4ISI;
    private androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp getHighSpeedVideoFpsRanges;
    private final java.util.ArrayDeque<androidx.media3.common.util.ParsableByteArray> getInputSizeshNQ4ISI = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp> getHighSpeedVideoSizes = new java.util.ArrayDeque<>();
    private final java.util.PriorityQueue<androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp> getHighSpeedVideoFpsRangesFor = new java.util.PriorityQueue<>();
    private int Camera2StreamConfigurationMap = -1;

    public interface OutputConsumer {
        void consume(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray);
    }

    public ReorderingBufferQueue(androidx.media3.container.ReorderingBufferQueue.OutputConsumer outputConsumer) {
        this.getHighResolutionOutputSizeshNQ4ISI = outputConsumer;
    }

    public final void setMaxSize(int i) {
        com.google.common.base.Preconditions.checkState(i >= 0);
        this.Camera2StreamConfigurationMap = i;
        getHighSpeedVideoSizes(i);
    }

    public final int getMaxSize() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void add(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i;
        androidx.media3.common.util.ParsableByteArray pop;
        androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp pop2;
        if (j == androidx.media3.common.C.TIME_UNSET || (i = this.Camera2StreamConfigurationMap) == 0 || (i != -1 && this.getHighSpeedVideoFpsRangesFor.size() >= this.Camera2StreamConfigurationMap && j < ((androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp) androidx.media3.common.util.Util.castNonNull(this.getHighSpeedVideoFpsRangesFor.peek())).getHighSpeedVideoFpsRangesFor)) {
            this.getHighResolutionOutputSizeshNQ4ISI.consume(j, parsableByteArray);
            return;
        }
        if (this.getInputSizeshNQ4ISI.isEmpty()) {
            pop = new androidx.media3.common.util.ParsableByteArray();
        } else {
            pop = this.getInputSizeshNQ4ISI.pop();
        }
        pop.reset(parsableByteArray.bytesLeft());
        java.lang.System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), pop.getData(), 0, pop.bytesLeft());
        androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp buffersWithTimestamp = this.getHighSpeedVideoFpsRanges;
        if (buffersWithTimestamp != null && j == buffersWithTimestamp.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.add(pop);
            return;
        }
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            pop2 = new androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp();
        } else {
            pop2 = this.getHighSpeedVideoSizes.pop();
        }
        com.google.common.base.Preconditions.checkArgument(j != androidx.media3.common.C.TIME_UNSET);
        com.google.common.base.Preconditions.checkState(pop2.getHighResolutionOutputSizeshNQ4ISI.isEmpty());
        pop2.getHighSpeedVideoFpsRangesFor = j;
        pop2.getHighResolutionOutputSizeshNQ4ISI.add(pop);
        this.getHighSpeedVideoFpsRangesFor.add(pop2);
        this.getHighSpeedVideoFpsRanges = pop2;
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 != -1) {
            getHighSpeedVideoSizes(i2);
        }
    }

    public final void clear() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    public final void flush() {
        getHighSpeedVideoSizes(0);
    }

    private void getHighSpeedVideoSizes(int i) {
        while (this.getHighSpeedVideoFpsRangesFor.size() > i) {
            androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp buffersWithTimestamp = (androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp) androidx.media3.common.util.Util.castNonNull(this.getHighSpeedVideoFpsRangesFor.poll());
            for (int i2 = 0; i2 < buffersWithTimestamp.getHighResolutionOutputSizeshNQ4ISI.size(); i2++) {
                this.getHighResolutionOutputSizeshNQ4ISI.consume(buffersWithTimestamp.getHighSpeedVideoFpsRangesFor, buffersWithTimestamp.getHighResolutionOutputSizeshNQ4ISI.get(i2));
                this.getInputSizeshNQ4ISI.push(buffersWithTimestamp.getHighResolutionOutputSizeshNQ4ISI.get(i2));
            }
            buffersWithTimestamp.getHighResolutionOutputSizeshNQ4ISI.clear();
            androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp buffersWithTimestamp2 = this.getHighSpeedVideoFpsRanges;
            if (buffersWithTimestamp2 != null && buffersWithTimestamp2.getHighSpeedVideoFpsRangesFor == buffersWithTimestamp.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRanges = null;
            }
            this.getHighSpeedVideoSizes.push(buffersWithTimestamp);
        }
    }

    static final class BuffersWithTimestamp implements java.lang.Comparable<androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp> {
        public long getHighSpeedVideoFpsRangesFor = androidx.media3.common.C.TIME_UNSET;
        public final java.util.List<androidx.media3.common.util.ParsableByteArray> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp buffersWithTimestamp) {
            return java.lang.Long.compare(this.getHighSpeedVideoFpsRangesFor, buffersWithTimestamp.getHighSpeedVideoFpsRangesFor);
        }
    }
}
