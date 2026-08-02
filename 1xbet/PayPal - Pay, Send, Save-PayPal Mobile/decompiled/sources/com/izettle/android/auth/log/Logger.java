package com.izettle.android.auth.log;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\fJ7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/izettle/android/auth/log/Logger;", "", "Lcom/izettle/android/auth/log/Logger$Level;", "level", "", "tag", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Lcom/izettle/android/auth/log/Logger$Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Level"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Logger {
    void log(com.izettle.android.auth.log.Logger.Level level, java.lang.String tag, java.lang.String message, java.lang.Throwable throwable);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void log$default(com.izettle.android.auth.log.Logger logger, com.izettle.android.auth.log.Logger.Level level, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                th = null;
            }
            logger.log(level, str, str2, th);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/izettle/android/auth/log/Logger$Level;", "", "", "tag", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "VERBOSE", "WARN", "DEBUG", "INFO", "ERROR", "WTF"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Level {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ com.izettle.android.auth.log.Logger.Level[] $VALUES;
        private final java.lang.String tag;
        public static final com.izettle.android.auth.log.Logger.Level VERBOSE = new com.izettle.android.auth.log.Logger.Level("VERBOSE", 0, "V");
        public static final com.izettle.android.auth.log.Logger.Level WARN = new com.izettle.android.auth.log.Logger.Level("WARN", 1, "W");
        public static final com.izettle.android.auth.log.Logger.Level DEBUG = new com.izettle.android.auth.log.Logger.Level("DEBUG", 2, "D");
        public static final com.izettle.android.auth.log.Logger.Level INFO = new com.izettle.android.auth.log.Logger.Level("INFO", 3, com.visa.cbp.getEncExpo.warmup);
        public static final com.izettle.android.auth.log.Logger.Level ERROR = new com.izettle.android.auth.log.Logger.Level("ERROR", 4, "E");
        public static final com.izettle.android.auth.log.Logger.Level WTF = new com.izettle.android.auth.log.Logger.Level("WTF", 5, "WTF");

        private Level(java.lang.String str, int i, java.lang.String str2) {
            this.tag = str2;
        }

        public final java.lang.String getTag() {
            return this.tag;
        }

        static {
            com.izettle.android.auth.log.Logger.Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static com.izettle.android.auth.log.Logger.Level[] values() {
            return (com.izettle.android.auth.log.Logger.Level[]) $VALUES.clone();
        }

        public static com.izettle.android.auth.log.Logger.Level valueOf(java.lang.String str) {
            return (com.izettle.android.auth.log.Logger.Level) java.lang.Enum.valueOf(com.izettle.android.auth.log.Logger.Level.class, str);
        }

        public static kotlin.enums.EnumEntries<com.izettle.android.auth.log.Logger.Level> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ com.izettle.android.auth.log.Logger.Level[] $values() {
            return new com.izettle.android.auth.log.Logger.Level[]{VERBOSE, WARN, DEBUG, INFO, ERROR, WTF};
        }
    }
}
