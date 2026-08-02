package androidx.camera.video.internal.audio;

/* loaded from: classes6.dex */
final class AutoValue_AudioStream_PacketInfo extends androidx.camera.video.internal.audio.AudioStream.PacketInfo {
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoSizes;

    AutoValue_AudioStream_PacketInfo(int i, long j) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public final int getSizeInBytes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    public final long getTimestampNs() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", timestampNs=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.internal.audio.AudioStream.PacketInfo)) {
            return false;
        }
        androidx.camera.video.internal.audio.AudioStream.PacketInfo packetInfo = (androidx.camera.video.internal.audio.AudioStream.PacketInfo) obj;
        return this.getHighSpeedVideoSizes == packetInfo.getSizeInBytes() && this.getHighResolutionOutputSizeshNQ4ISI == packetInfo.getTimestampNs();
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoSizes;
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
