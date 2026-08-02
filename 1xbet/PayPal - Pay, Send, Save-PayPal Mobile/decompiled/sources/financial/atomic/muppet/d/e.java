package financial.atomic.muppet.d;

/* loaded from: classes17.dex */
public final class e {
    private boolean Camera2StreamConfigurationMap = true;

    public final boolean a() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof financial.atomic.muppet.d.e) && this.Camera2StreamConfigurationMap == ((financial.atomic.muppet.d.e) obj).Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Options(hideOnClose=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }
}
