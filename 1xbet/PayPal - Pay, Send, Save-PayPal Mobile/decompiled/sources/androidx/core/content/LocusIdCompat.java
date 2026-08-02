package androidx.core.content;

/* loaded from: classes3.dex */
public final class LocusIdCompat {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final android.content.LocusId getHighSpeedVideoSizes;

    public LocusIdCompat(java.lang.String str) {
        this.Camera2StreamConfigurationMap = (java.lang.String) androidx.core.util.Preconditions.checkStringNotEmpty(str, "id cannot be empty");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.getHighSpeedVideoSizes = androidx.core.content.LocusIdCompat.Api29Impl.bJ_(str);
        } else {
            this.getHighSpeedVideoSizes = null;
        }
    }

    public final java.lang.String getId() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.core.content.LocusIdCompat locusIdCompat = (androidx.core.content.LocusIdCompat) obj;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (str == null) {
            return locusIdCompat.Camera2StreamConfigurationMap == null;
        }
        return str.equals(locusIdCompat.Camera2StreamConfigurationMap);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocusIdCompat[");
        sb.append(Camera2StreamConfigurationMap());
        sb.append("]");
        return sb.toString();
    }

    public final android.content.LocusId toLocusId() {
        return this.getHighSpeedVideoSizes;
    }

    public static androidx.core.content.LocusIdCompat toLocusIdCompat(android.content.LocusId locusId) {
        androidx.core.util.Preconditions.checkNotNull(locusId, "locusId cannot be null");
        return new androidx.core.content.LocusIdCompat((java.lang.String) androidx.core.util.Preconditions.checkStringNotEmpty(androidx.core.content.LocusIdCompat.Api29Impl.bK_(locusId), "id cannot be empty"));
    }

    private java.lang.String Camera2StreamConfigurationMap() {
        int length = this.Camera2StreamConfigurationMap.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(length);
        sb.append("_chars");
        return sb.toString();
    }

    /* loaded from: classes7.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        static android.content.LocusId bJ_(java.lang.String str) {
            return new android.content.LocusId(str);
        }

        static java.lang.String bK_(android.content.LocusId locusId) {
            return locusId.getId();
        }
    }
}
