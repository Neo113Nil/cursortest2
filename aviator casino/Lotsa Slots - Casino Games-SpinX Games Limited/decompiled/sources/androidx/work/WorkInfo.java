package androidx.work;

/* loaded from: classes2.dex */
public final class WorkInfo {
    private final int mGeneration;
    private java.util.UUID mId;
    private androidx.work.Data mOutputData;
    private androidx.work.Data mProgress;
    private int mRunAttemptCount;
    private androidx.work.WorkInfo.State mState;
    private java.util.Set<java.lang.String> mTags;

    public WorkInfo(java.util.UUID id, androidx.work.WorkInfo.State state, androidx.work.Data outputData, java.util.List<java.lang.String> tags, androidx.work.Data progress, int runAttemptCount, int generation) {
        this.mId = id;
        this.mState = state;
        this.mOutputData = outputData;
        this.mTags = new java.util.HashSet(tags);
        this.mProgress = progress;
        this.mRunAttemptCount = runAttemptCount;
        this.mGeneration = generation;
    }

    public java.util.UUID getId() {
        return this.mId;
    }

    public androidx.work.WorkInfo.State getState() {
        return this.mState;
    }

    public androidx.work.Data getOutputData() {
        return this.mOutputData;
    }

    public java.util.Set<java.lang.String> getTags() {
        return this.mTags;
    }

    public androidx.work.Data getProgress() {
        return this.mProgress;
    }

    public int getRunAttemptCount() {
        return this.mRunAttemptCount;
    }

    public int getGeneration() {
        return this.mGeneration;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        androidx.work.WorkInfo workInfo = (androidx.work.WorkInfo) o;
        if (this.mRunAttemptCount == workInfo.mRunAttemptCount && this.mGeneration == workInfo.mGeneration && this.mId.equals(workInfo.mId) && this.mState == workInfo.mState && this.mOutputData.equals(workInfo.mOutputData) && this.mTags.equals(workInfo.mTags)) {
            return this.mProgress.equals(workInfo.mProgress);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.mId.hashCode() * 31) + this.mState.hashCode()) * 31) + this.mOutputData.hashCode()) * 31) + this.mTags.hashCode()) * 31) + this.mProgress.hashCode()) * 31) + this.mRunAttemptCount) * 31) + this.mGeneration;
    }

    public java.lang.String toString() {
        return "WorkInfo{mId='" + this.mId + "', mState=" + this.mState + ", mOutputData=" + this.mOutputData + ", mTags=" + this.mTags + ", mProgress=" + this.mProgress + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }
}
