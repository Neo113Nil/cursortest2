package org.slf4j.event;

/* loaded from: classes6.dex */
public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    private final int levelInt;
    private final java.lang.String levelStr;

    Level(int i, java.lang.String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    public int toInt() {
        return this.levelInt;
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
        throw new java.lang.IllegalArgumentException("Level integer [" + i + "] not recognized.");
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.levelStr;
    }
}
