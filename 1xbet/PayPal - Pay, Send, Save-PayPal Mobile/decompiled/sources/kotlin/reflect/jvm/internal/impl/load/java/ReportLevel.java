package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ReportLevel {
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.Companion Companion;
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel IGNORE;
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel STRICT;
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel WARN;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String Camera2StreamConfigurationMap;

    private ReportLevel(java.lang.String str, int i, java.lang.String str2) {
        this.Camera2StreamConfigurationMap = str2;
    }

    public final java.lang.String getDescription() {
        return this.Camera2StreamConfigurationMap;
    }

    static {
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel = new kotlin.reflect.jvm.internal.impl.load.java.ReportLevel("IGNORE", 0, "ignore");
        IGNORE = reportLevel;
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel2 = new kotlin.reflect.jvm.internal.impl.load.java.ReportLevel("WARN", 1, "warn");
        WARN = reportLevel2;
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel3 = new kotlin.reflect.jvm.internal.impl.load.java.ReportLevel(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_STRICT, 2, "strict");
        STRICT = reportLevel3;
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] reportLevelArr = {reportLevel, reportLevel2, reportLevel3};
        getHighSpeedVideoFpsRanges = reportLevelArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(reportLevelArr);
        Companion = new kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.Companion(null);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean isWarning() {
        return this == WARN;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[] values() {
        return (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.ReportLevel valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.class, str);
    }
}
