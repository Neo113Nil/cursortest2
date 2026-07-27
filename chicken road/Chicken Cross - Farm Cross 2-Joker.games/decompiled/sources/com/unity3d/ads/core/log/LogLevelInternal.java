package com.unity3d.ads.core.log;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/log/LogLevelInternal;", "", "level", "", "<init>", "(Ljava/lang/String;II)V", "getLevel$unity_ads_defaultRelease", "()I", "DISABLED", "ERROR", "INFO", "DEBUG", "TRACE", "toAndroidLogLevel", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogLevelInternal {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogLevelInternal[] $VALUES;
    private final int level;
    public static final LogLevelInternal DISABLED = new LogLevelInternal("DISABLED", 0, 0);
    public static final LogLevelInternal ERROR = new LogLevelInternal("ERROR", 1, 1);
    public static final LogLevelInternal INFO = new LogLevelInternal("INFO", 2, 2);
    public static final LogLevelInternal DEBUG = new LogLevelInternal("DEBUG", 3, 3);
    public static final LogLevelInternal TRACE = new LogLevelInternal("TRACE", 4, 4);

    /* compiled from: LogLevel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevelInternal.values().length];
            try {
                iArr[LogLevelInternal.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevelInternal.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevelInternal.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevelInternal.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevelInternal.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ LogLevelInternal[] $values() {
        return new LogLevelInternal[]{DISABLED, ERROR, INFO, DEBUG, TRACE};
    }

    public static EnumEntries<LogLevelInternal> getEntries() {
        return $ENTRIES;
    }

    private LogLevelInternal(String str, int i, int i2) {
        this.level = i2;
    }

    /* renamed from: getLevel$unity_ads_defaultRelease, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    static {
        LogLevelInternal[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final int toAndroidLogLevel() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return Integer.MAX_VALUE;
        }
        if (i == 2) {
            return 6;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static LogLevelInternal valueOf(String str) {
        return (LogLevelInternal) Enum.valueOf(LogLevelInternal.class, str);
    }

    public static LogLevelInternal[] values() {
        return (LogLevelInternal[]) $VALUES.clone();
    }
}
