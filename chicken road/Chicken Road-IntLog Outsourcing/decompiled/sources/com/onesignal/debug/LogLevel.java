package com.onesignal.debug;

import java.util.Locale;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LogLevel {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final Companion Companion;
    public static final LogLevel NONE = new LogLevel("NONE", 0);
    public static final LogLevel FATAL = new LogLevel("FATAL", 1);
    public static final LogLevel ERROR = new LogLevel("ERROR", 2);
    public static final LogLevel WARN = new LogLevel("WARN", 3);
    public static final LogLevel INFO = new LogLevel("INFO", 4);
    public static final LogLevel DEBUG = new LogLevel("DEBUG", 5);
    public static final LogLevel VERBOSE = new LogLevel("VERBOSE", 6);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final LogLevel fromInt(int i2) {
            return LogLevel.values()[i2];
        }

        public final LogLevel fromString(String str) {
            if (str == null) {
                return null;
            }
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                i.d(upperCase, "toUpperCase(...)");
                return LogLevel.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{NONE, FATAL, ERROR, WARN, INFO, DEBUG, VERBOSE};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
        Companion = new Companion(null);
    }

    private LogLevel(String str, int i2) {
    }

    public static final LogLevel fromInt(int i2) {
        return Companion.fromInt(i2);
    }

    public static final LogLevel fromString(String str) {
        return Companion.fromString(str);
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
