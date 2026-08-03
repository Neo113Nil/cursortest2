package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public class MediaPeriodId {
    public final int adGroupIndex;
    public final int adIndexInAdGroup;
    public final int nextAdGroupIndex;
    public final java.lang.Object periodUid;
    public final long windowSequenceNumber;

    public MediaPeriodId(java.lang.Object obj) {
        this(obj, -1L);
    }

    public MediaPeriodId(java.lang.Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public MediaPeriodId(java.lang.Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public MediaPeriodId(java.lang.Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    protected MediaPeriodId(com.google.android.exoplayer2.source.MediaPeriodId mediaPeriodId) {
        this.periodUid = mediaPeriodId.periodUid;
        this.adGroupIndex = mediaPeriodId.adGroupIndex;
        this.adIndexInAdGroup = mediaPeriodId.adIndexInAdGroup;
        this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
        this.nextAdGroupIndex = mediaPeriodId.nextAdGroupIndex;
    }

    private MediaPeriodId(java.lang.Object obj, int i, int i2, long j, int i3) {
        this.periodUid = obj;
        this.adGroupIndex = i;
        this.adIndexInAdGroup = i2;
        this.windowSequenceNumber = j;
        this.nextAdGroupIndex = i3;
    }

    public com.google.android.exoplayer2.source.MediaPeriodId copyWithPeriodUid(java.lang.Object obj) {
        return this.periodUid.equals(obj) ? this : new com.google.android.exoplayer2.source.MediaPeriodId(obj, this.adGroupIndex, this.adIndexInAdGroup, this.windowSequenceNumber, this.nextAdGroupIndex);
    }

    public com.google.android.exoplayer2.source.MediaPeriodId copyWithWindowSequenceNumber(long j) {
        return this.windowSequenceNumber == j ? this : new com.google.android.exoplayer2.source.MediaPeriodId(this.periodUid, this.adGroupIndex, this.adIndexInAdGroup, j, this.nextAdGroupIndex);
    }

    public boolean isAd() {
        return this.adGroupIndex != -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.exoplayer2.source.MediaPeriodId)) {
            return false;
        }
        com.google.android.exoplayer2.source.MediaPeriodId mediaPeriodId = (com.google.android.exoplayer2.source.MediaPeriodId) obj;
        return this.periodUid.equals(mediaPeriodId.periodUid) && this.adGroupIndex == mediaPeriodId.adGroupIndex && this.adIndexInAdGroup == mediaPeriodId.adIndexInAdGroup && this.windowSequenceNumber == mediaPeriodId.windowSequenceNumber && this.nextAdGroupIndex == mediaPeriodId.nextAdGroupIndex;
    }

    public int hashCode() {
        return ((((((((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.periodUid.hashCode()) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup) * 31) + ((int) this.windowSequenceNumber)) * 31) + this.nextAdGroupIndex;
    }
}
