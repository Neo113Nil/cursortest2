package kotlin.reflect.jvm.internal.impl.incremental.components;

/* loaded from: classes5.dex */
public final class Position implements java.io.Serializable {
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.Position.Companion Companion = new kotlin.reflect.jvm.internal.impl.incremental.components.Position.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.incremental.components.Position getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.incremental.components.Position(-1, -1);
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.incremental.components.Position getNO_POSITION() {
            return kotlin.reflect.jvm.internal.impl.incremental.components.Position.getHighSpeedVideoSizes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Position(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Position(line=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", column=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor) * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.incremental.components.Position)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.incremental.components.Position position = (kotlin.reflect.jvm.internal.impl.incremental.components.Position) obj;
        return this.getHighSpeedVideoFpsRangesFor == position.getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap == position.Camera2StreamConfigurationMap;
    }
}
