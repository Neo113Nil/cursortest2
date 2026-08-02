package coil3.content;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0011J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u00020\u00048'@'X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/util/Logger;", "", "", "tag", "Lcoil3/util/Logger$Level;", "level", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Ljava/lang/String;Lcoil3/util/Logger$Level;Ljava/lang/String;Ljava/lang/Throwable;)V", "getMinLevel", "()Lcoil3/util/Logger$Level;", "setMinLevel", "(Lcoil3/util/Logger$Level;)V", "minLevel", "Level"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Logger {
    coil3.util.Logger.Level getMinLevel();

    void log(java.lang.String tag, coil3.util.Logger.Level level, java.lang.String message, java.lang.Throwable throwable);

    void setMinLevel(coil3.util.Logger.Level level);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcoil3/util/Logger$Level;", "", "<init>", "(Ljava/lang/String;I)V", "Verbose", "Debug", "Info", "Warn", "Error"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Level {
        public static final coil3.util.Logger.Level Debug;
        public static final coil3.util.Logger.Level Error;
        public static final coil3.util.Logger.Level Info;
        public static final coil3.util.Logger.Level Verbose;
        public static final coil3.util.Logger.Level Warn;
        private static final /* synthetic */ coil3.util.Logger.Level[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private Level(java.lang.String str, int i) {
        }

        static {
            coil3.util.Logger.Level level = new coil3.util.Logger.Level("Verbose", 0);
            Verbose = level;
            coil3.util.Logger.Level level2 = new coil3.util.Logger.Level("Debug", 1);
            Debug = level2;
            coil3.util.Logger.Level level3 = new coil3.util.Logger.Level("Info", 2);
            Info = level3;
            coil3.util.Logger.Level level4 = new coil3.util.Logger.Level("Warn", 3);
            Warn = level4;
            coil3.util.Logger.Level level5 = new coil3.util.Logger.Level("Error", 4);
            Error = level5;
            coil3.util.Logger.Level[] levelArr = {level, level2, level3, level4, level5};
            getHighSpeedVideoFpsRanges = levelArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(levelArr);
        }

        public static coil3.util.Logger.Level[] values() {
            return (coil3.util.Logger.Level[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static coil3.util.Logger.Level valueOf(java.lang.String str) {
            return (coil3.util.Logger.Level) java.lang.Enum.valueOf(coil3.util.Logger.Level.class, str);
        }

        public static kotlin.enums.EnumEntries<coil3.util.Logger.Level> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }
}
