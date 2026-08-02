package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Landroidx/annotation/RequiresOptIn;", "", "Landroidx/annotation/RequiresOptIn$Level;", "level", "", "message", "()Landroidx/annotation/RequiresOptIn$Level;", "()Ljava/lang/String;", "Level"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface RequiresOptIn {
    androidx.annotation.RequiresOptIn.Level level() default androidx.annotation.RequiresOptIn.Level.ERROR;

    java.lang.String message() default "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/annotation/RequiresOptIn$Level;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ androidx.annotation.RequiresOptIn.Level[] Camera2StreamConfigurationMap;
        public static final androidx.annotation.RequiresOptIn.Level ERROR;
        public static final androidx.annotation.RequiresOptIn.Level WARNING;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

        private Level(java.lang.String str, int i) {
        }

        static {
            androidx.annotation.RequiresOptIn.Level level = new androidx.annotation.RequiresOptIn.Level("WARNING", 0);
            WARNING = level;
            androidx.annotation.RequiresOptIn.Level level2 = new androidx.annotation.RequiresOptIn.Level("ERROR", 1);
            ERROR = level2;
            androidx.annotation.RequiresOptIn.Level[] levelArr = {level, level2};
            Camera2StreamConfigurationMap = levelArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(levelArr);
        }

        public static androidx.annotation.RequiresOptIn.Level valueOf(java.lang.String str) {
            return (androidx.annotation.RequiresOptIn.Level) java.lang.Enum.valueOf(androidx.annotation.RequiresOptIn.Level.class, str);
        }

        public static androidx.annotation.RequiresOptIn.Level[] values() {
            return (androidx.annotation.RequiresOptIn.Level[]) Camera2StreamConfigurationMap.clone();
        }

        public static kotlin.enums.EnumEntries<androidx.annotation.RequiresOptIn.Level> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }
}
