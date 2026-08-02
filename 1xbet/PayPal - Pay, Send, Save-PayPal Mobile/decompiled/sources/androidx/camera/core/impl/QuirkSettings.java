package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class QuirkSettings {
    private final java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> getHighSpeedVideoFpsRangesFor;

    /* synthetic */ QuirkSettings(boolean z, java.util.Set set, java.util.Set set2, byte b) {
        this(z, set, set2);
    }

    private QuirkSettings(boolean z, java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set, java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set2) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = set == null ? java.util.Collections.emptySet() : new java.util.HashSet<>(set);
        this.getHighSpeedVideoFpsRangesFor = set2 == null ? java.util.Collections.emptySet() : new java.util.HashSet<>(set2);
    }

    public static androidx.camera.core.impl.QuirkSettings withDefaultBehavior() {
        return new androidx.camera.core.impl.QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(true).build();
    }

    public static androidx.camera.core.impl.QuirkSettings withAllQuirksDisabled() {
        return new androidx.camera.core.impl.QuirkSettings.Builder().setEnabledWhenDeviceHasQuirk(false).build();
    }

    public static androidx.camera.core.impl.QuirkSettings withQuirksForceEnabled(java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set) {
        return new androidx.camera.core.impl.QuirkSettings.Builder().forceEnableQuirks(set).build();
    }

    public static androidx.camera.core.impl.QuirkSettings withQuirksForceDisabled(java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set) {
        return new androidx.camera.core.impl.QuirkSettings.Builder().forceDisableQuirks(set).build();
    }

    public boolean isEnabledWhenDeviceHasQuirk() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> getForceEnabledQuirks() {
        return java.util.Collections.unmodifiableSet(this.Camera2StreamConfigurationMap);
    }

    public java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> getForceDisabledQuirks() {
        return java.util.Collections.unmodifiableSet(this.getHighSpeedVideoFpsRangesFor);
    }

    public boolean shouldEnableQuirk(java.lang.Class<? extends androidx.camera.core.impl.Quirk> cls, boolean z) {
        if (this.Camera2StreamConfigurationMap.contains(cls)) {
            return true;
        }
        return !this.getHighSpeedVideoFpsRangesFor.contains(cls) && this.getHighResolutionOutputSizeshNQ4ISI && z;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.camera.core.impl.QuirkSettings)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        androidx.camera.core.impl.QuirkSettings quirkSettings = (androidx.camera.core.impl.QuirkSettings) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == quirkSettings.getHighResolutionOutputSizeshNQ4ISI && java.util.Objects.equals(this.Camera2StreamConfigurationMap, quirkSettings.Camera2StreamConfigurationMap) && java.util.Objects.equals(this.getHighSpeedVideoFpsRangesFor, quirkSettings.getHighSpeedVideoFpsRangesFor);
    }

    public int hashCode() {
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
        return java.util.Objects.hash(java.lang.Boolean.valueOf(z), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QuirkSettings{enabledWhenDeviceHasQuirk=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", forceEnabledQuirks=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", forceDisabledQuirks=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public static class Builder {
        private java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges = true;
        private java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> getHighSpeedVideoSizes;

        public androidx.camera.core.impl.QuirkSettings.Builder setEnabledWhenDeviceHasQuirk(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public androidx.camera.core.impl.QuirkSettings.Builder forceEnableQuirks(java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet(set);
            return this;
        }

        public androidx.camera.core.impl.QuirkSettings.Builder forceDisableQuirks(java.util.Set<java.lang.Class<? extends androidx.camera.core.impl.Quirk>> set) {
            this.getHighSpeedVideoSizes = new java.util.HashSet(set);
            return this;
        }

        public androidx.camera.core.impl.QuirkSettings build() {
            return new androidx.camera.core.impl.QuirkSettings(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, (byte) 0);
        }
    }
}
