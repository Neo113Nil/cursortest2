package org.slf4j.event;

/* loaded from: classes18.dex */
public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, com.datadog.android.internal.network.HttpSpec.Method.TRACE);

    private final java.lang.String Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoSizes;

    Level(int i, java.lang.String str) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = str;
    }

    public final int toInt() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.slf4j.event.Level intToLevel(int i) {
        if (i == 0) {
            return TRACE;
        }
        if (i == 10) {
            return DEBUG;
        }
        if (i == 20) {
            return INFO;
        }
        if (i == 30) {
            return WARN;
        }
        if (i == 40) {
            return ERROR;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Level integer [");
        sb.append(i);
        sb.append("] not recognized.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }
}
