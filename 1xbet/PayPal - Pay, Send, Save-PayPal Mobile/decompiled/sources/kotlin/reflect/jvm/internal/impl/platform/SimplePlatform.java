package kotlin.reflect.jvm.internal.impl.platform;

/* loaded from: classes5.dex */
public abstract class SimplePlatform {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.platform.TargetPlatformVersion getHighSpeedVideoFpsRanges;

    public java.lang.String toString() {
        java.lang.String targetName = getTargetName();
        if (targetName.length() <= 0) {
            return this.Camera2StreamConfigurationMap;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" (");
        sb.append(targetName);
        sb.append(')');
        return sb.toString();
    }

    public java.lang.String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    public kotlin.reflect.jvm.internal.impl.platform.TargetPlatformVersion getTargetPlatformVersion() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
