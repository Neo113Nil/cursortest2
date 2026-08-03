package com.google.android.exoplayer2.extractor;

/* loaded from: classes3.dex */
public final class SeekPoint {
    public static final com.google.android.exoplayer2.extractor.SeekPoint START = new com.google.android.exoplayer2.extractor.SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j, long j2) {
        this.timeUs = j;
        this.position = j2;
    }

    public java.lang.String toString() {
        return "[timeUs=" + this.timeUs + ", position=" + this.position + com.ironsource.X3.j.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.extractor.SeekPoint seekPoint = (com.google.android.exoplayer2.extractor.SeekPoint) obj;
        return this.timeUs == seekPoint.timeUs && this.position == seekPoint.position;
    }

    public int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }
}
