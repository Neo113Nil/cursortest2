package com.google.android.exoplayer2.metadata.mp4;

/* loaded from: classes3.dex */
public final class SlowMotionData implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.mp4.SlowMotionData> CREATOR = new android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.mp4.SlowMotionData>() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.mp4.SlowMotionData createFromParcel(android.os.Parcel parcel) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            parcel.readList(arrayList, com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment.class.getClassLoader());
            return new com.google.android.exoplayer2.metadata.mp4.SlowMotionData(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.exoplayer2.metadata.mp4.SlowMotionData[] newArray(int i) {
            return new com.google.android.exoplayer2.metadata.mp4.SlowMotionData[i];
        }
    };
    public final java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> segments;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataBytes(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ com.google.android.exoplayer2.Format getWrappedMetadataFormat() {
        return com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataFormat(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder builder) {
        com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$populateMediaMetadata(this, builder);
    }

    public static final class Segment implements android.os.Parcelable {
        public static final java.util.Comparator<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> BY_START_THEN_END_THEN_DIVISOR = new java.util.Comparator() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int result;
                result = com.google.common.collect.ComparisonChain.start().compare(r1.startTimeMs, r2.startTimeMs).compare(r1.endTimeMs, r2.endTimeMs).compare(((com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment) obj).speedDivisor, ((com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment) obj2).speedDivisor).result();
                return result;
            }
        };
        public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> CREATOR = new android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment>() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment[] newArray(int i) {
                return new com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment[i];
            }
        };
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Segment(long j, long j2, int i) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(j < j2);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        public java.lang.String toString() {
            return com.google.android.exoplayer2.util.Util.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", java.lang.Long.valueOf(this.startTimeMs), java.lang.Long.valueOf(this.endTimeMs), java.lang.Integer.valueOf(this.speedDivisor));
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment segment = (com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment) obj;
            return this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor;
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(java.lang.Long.valueOf(this.startTimeMs), java.lang.Long.valueOf(this.endTimeMs), java.lang.Integer.valueOf(this.speedDivisor));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeLong(this.startTimeMs);
            parcel.writeLong(this.endTimeMs);
            parcel.writeInt(this.speedDivisor);
        }
    }

    public SlowMotionData(java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> list) {
        this.segments = list;
        com.google.android.exoplayer2.util.Assertions.checkArgument(!doSegmentsOverlap(list));
    }

    public java.lang.String toString() {
        return "SlowMotion: segments=" + this.segments;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((com.google.android.exoplayer2.metadata.mp4.SlowMotionData) obj).segments);
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.segments);
    }

    private static boolean doSegmentsOverlap(java.util.List<com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).endTimeMs;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).startTimeMs < j) {
                return true;
            }
            j = list.get(i).endTimeMs;
        }
        return false;
    }
}
