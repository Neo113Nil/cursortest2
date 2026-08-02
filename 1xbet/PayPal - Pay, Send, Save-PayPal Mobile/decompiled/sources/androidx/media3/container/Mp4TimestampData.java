package androidx.media3.container;

/* loaded from: classes7.dex */
public final class Mp4TimestampData implements androidx.media3.common.Metadata.Entry {
    public static final int TIMESCALE_UNSET = -1;
    public final long creationTimestampSeconds;
    public final long modificationTimestampSeconds;
    public final long timescale;

    public Mp4TimestampData(long j, long j2) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j2;
        this.timescale = -1L;
    }

    public Mp4TimestampData(long j, long j2, long j3) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j2;
        this.timescale = j3;
    }

    public static long unixTimeToMp4TimeSeconds(long j) {
        return (j / 1000) + 2082844800;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.container.Mp4TimestampData)) {
            return false;
        }
        androidx.media3.container.Mp4TimestampData mp4TimestampData = (androidx.media3.container.Mp4TimestampData) obj;
        return this.creationTimestampSeconds == mp4TimestampData.creationTimestampSeconds && this.modificationTimestampSeconds == mp4TimestampData.modificationTimestampSeconds && this.timescale == mp4TimestampData.timescale;
    }

    public final int hashCode() {
        return ((((com.google.common.primitives.Longs.hashCode(this.creationTimestampSeconds) + 527) * 31) + com.google.common.primitives.Longs.hashCode(this.modificationTimestampSeconds)) * 31) + com.google.common.primitives.Longs.hashCode(this.timescale);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mp4Timestamp: creation time=");
        sb.append(this.creationTimestampSeconds);
        sb.append(", modification time=");
        sb.append(this.modificationTimestampSeconds);
        sb.append(", timescale=");
        sb.append(this.timescale);
        return sb.toString();
    }
}
