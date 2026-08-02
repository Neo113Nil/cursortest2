package androidx.media3.container;

/* loaded from: classes7.dex */
public final class Mp4OrientationData implements androidx.media3.common.Metadata.Entry {
    public final int orientation;

    public Mp4OrientationData(int i) {
        com.google.common.base.Preconditions.checkArgument(i == 0 || i == 90 || i == 180 || i == 270, "Unsupported orientation");
        this.orientation = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.media3.container.Mp4OrientationData) && this.orientation == ((androidx.media3.container.Mp4OrientationData) obj).orientation;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.orientation) + 527;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Orientation= ");
        sb.append(this.orientation);
        return sb.toString();
    }
}
