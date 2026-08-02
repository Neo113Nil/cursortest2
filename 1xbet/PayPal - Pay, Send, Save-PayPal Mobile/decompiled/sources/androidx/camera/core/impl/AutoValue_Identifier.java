package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_Identifier extends androidx.camera.core.impl.Identifier {
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    AutoValue_Identifier(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Null value");
        }
        this.getHighSpeedVideoFpsRanges = obj;
    }

    @Override // androidx.camera.core.impl.Identifier
    public final java.lang.Object getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Identifier{value=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof androidx.camera.core.impl.Identifier) {
            return this.getHighSpeedVideoFpsRanges.equals(((androidx.camera.core.impl.Identifier) obj).getValue());
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode() ^ 1000003;
    }
}
