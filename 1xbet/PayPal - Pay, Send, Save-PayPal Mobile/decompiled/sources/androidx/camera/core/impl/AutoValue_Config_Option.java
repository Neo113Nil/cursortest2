package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_Config_Option<T> extends androidx.camera.core.impl.Config.Option<T> {
    private final java.lang.Class<T> Camera2StreamConfigurationMap;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    AutoValue_Config_Option(java.lang.String str, java.lang.Class<T> cls, java.lang.Object obj) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.getHighSpeedVideoFpsRanges = str;
        if (cls == null) {
            throw new java.lang.NullPointerException("Null valueClass");
        }
        this.Camera2StreamConfigurationMap = cls;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public final java.lang.String getId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public final java.lang.Class<T> getValueClass() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public final java.lang.Object getToken() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Option{id=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", valueClass=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", token=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.Config.Option)) {
            return false;
        }
        androidx.camera.core.impl.Config.Option option = (androidx.camera.core.impl.Config.Option) obj;
        if (!this.getHighSpeedVideoFpsRanges.equals(option.getId()) || !this.Camera2StreamConfigurationMap.equals(option.getValueClass())) {
            return false;
        }
        java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (obj2 == null) {
            if (option.getToken() != null) {
                return false;
            }
        } else if (!obj2.equals(option.getToken())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode2 = this.Camera2StreamConfigurationMap.hashCode();
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (obj == null ? 0 : obj.hashCode());
    }
}
