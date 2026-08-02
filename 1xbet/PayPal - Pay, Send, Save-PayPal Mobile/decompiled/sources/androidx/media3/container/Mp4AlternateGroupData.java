package androidx.media3.container;

/* loaded from: classes7.dex */
public final class Mp4AlternateGroupData implements androidx.media3.common.Metadata.Entry {
    public final int alternateGroup;

    public Mp4AlternateGroupData(int i) {
        this.alternateGroup = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.media3.container.Mp4AlternateGroupData) && this.alternateGroup == ((androidx.media3.container.Mp4AlternateGroupData) obj).alternateGroup;
    }

    public final int hashCode() {
        return this.alternateGroup;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mp4AlternateGroup: ");
        sb.append(this.alternateGroup);
        return sb.toString();
    }
}
