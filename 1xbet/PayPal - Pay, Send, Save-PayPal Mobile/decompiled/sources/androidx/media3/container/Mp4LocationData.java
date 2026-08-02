package androidx.media3.container;

/* loaded from: classes7.dex */
public final class Mp4LocationData implements androidx.media3.common.Metadata.Entry {
    public final float latitude;
    public final float longitude;

    public Mp4LocationData(float f, float f2) {
        com.google.common.base.Preconditions.checkArgument(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.latitude = f;
        this.longitude = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.container.Mp4LocationData mp4LocationData = (androidx.media3.container.Mp4LocationData) obj;
        return this.latitude == mp4LocationData.latitude && this.longitude == mp4LocationData.longitude;
    }

    public final int hashCode() {
        return ((com.google.common.primitives.Floats.hashCode(this.latitude) + 527) * 31) + com.google.common.primitives.Floats.hashCode(this.longitude);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("xyz: latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        return sb.toString();
    }
}
