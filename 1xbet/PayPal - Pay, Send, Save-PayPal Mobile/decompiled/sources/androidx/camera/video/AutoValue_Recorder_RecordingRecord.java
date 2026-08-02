package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_Recorder_RecordingRecord extends androidx.camera.video.Recorder.RecordingRecord {
    private final androidx.camera.video.OutputOptions getInputSizeshNQ4ISI;
    private final androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> getOutputFormats;
    private final java.util.concurrent.Executor getOutputMinFrameDuration;
    private final long getOutputSizeshNQ4ISI;
    private final boolean getOutputStallDuration;
    private final boolean getOutputStallDurationlomOqCM;

    AutoValue_Recorder_RecordingRecord(androidx.camera.video.OutputOptions outputOptions, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> consumer, boolean z, boolean z2, long j) {
        if (outputOptions == null) {
            throw new java.lang.NullPointerException("Null getOutputOptions");
        }
        this.getInputSizeshNQ4ISI = outputOptions;
        this.getOutputMinFrameDuration = executor;
        this.getOutputFormats = consumer;
        this.getOutputStallDurationlomOqCM = z;
        this.getOutputStallDuration = z2;
        this.getOutputSizeshNQ4ISI = j;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final androidx.camera.video.OutputOptions Camera2StreamConfigurationMap() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final java.util.concurrent.Executor getHighSpeedVideoSizes() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> getHighSpeedVideoFpsRanges() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final boolean getInputSizeshNQ4ISI() {
        return this.getOutputStallDuration;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final long getHighSpeedVideoFpsRangesFor() {
        return this.getOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", getCallbackExecutor=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", getEventListener=");
        sb.append(this.getOutputFormats);
        sb.append(", hasAudioEnabled=");
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(", isPersistent=");
        sb.append(this.getOutputStallDuration);
        sb.append(", getRecordingId=");
        sb.append(this.getOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.Recorder.RecordingRecord)) {
            return false;
        }
        androidx.camera.video.Recorder.RecordingRecord recordingRecord = (androidx.camera.video.Recorder.RecordingRecord) obj;
        if (!this.getInputSizeshNQ4ISI.equals(recordingRecord.Camera2StreamConfigurationMap())) {
            return false;
        }
        java.util.concurrent.Executor executor = this.getOutputMinFrameDuration;
        if (executor == null) {
            if (recordingRecord.getHighSpeedVideoSizes() != null) {
                return false;
            }
        } else if (!executor.equals(recordingRecord.getHighSpeedVideoSizes())) {
            return false;
        }
        androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> consumer = this.getOutputFormats;
        if (consumer == null) {
            if (recordingRecord.getHighSpeedVideoFpsRanges() != null) {
                return false;
            }
        } else if (!consumer.equals(recordingRecord.getHighSpeedVideoFpsRanges())) {
            return false;
        }
        return this.getOutputStallDurationlomOqCM == recordingRecord.getHighResolutionOutputSizeshNQ4ISI() && this.getOutputStallDuration == recordingRecord.getInputSizeshNQ4ISI() && this.getOutputSizeshNQ4ISI == recordingRecord.getHighSpeedVideoFpsRangesFor();
    }

    public final int hashCode() {
        int hashCode = this.getInputSizeshNQ4ISI.hashCode();
        java.util.concurrent.Executor executor = this.getOutputMinFrameDuration;
        int hashCode2 = executor == null ? 0 : executor.hashCode();
        androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> consumer = this.getOutputFormats;
        int hashCode3 = consumer != null ? consumer.hashCode() : 0;
        int i = this.getOutputStallDurationlomOqCM ? 1231 : 1237;
        int i2 = this.getOutputStallDuration ? 1231 : 1237;
        long j = this.getOutputSizeshNQ4ISI;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }
}
