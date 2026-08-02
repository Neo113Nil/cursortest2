package androidx.annotation.experimental;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/annotation/experimental/Experimental;", "", "Landroidx/annotation/experimental/Experimental$Level;", "level", "()Landroidx/annotation/experimental/Experimental$Level;", "Level"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.Deprecated(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @kotlin.ReplaceWith(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface Experimental {
    androidx.annotation.experimental.Experimental.Level level() default androidx.annotation.experimental.Experimental.Level.ERROR;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/annotation/experimental/Experimental$Level;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {
        public static final androidx.annotation.experimental.Experimental.Level ERROR;
        public static final androidx.annotation.experimental.Experimental.Level WARNING;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ androidx.annotation.experimental.Experimental.Level[] getHighSpeedVideoFpsRanges;

        private Level(java.lang.String str, int i) {
        }

        static {
            androidx.annotation.experimental.Experimental.Level level = new androidx.annotation.experimental.Experimental.Level("WARNING", 0);
            WARNING = level;
            androidx.annotation.experimental.Experimental.Level level2 = new androidx.annotation.experimental.Experimental.Level("ERROR", 1);
            ERROR = level2;
            androidx.annotation.experimental.Experimental.Level[] levelArr = {level, level2};
            getHighSpeedVideoFpsRanges = levelArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(levelArr);
        }

        public static androidx.annotation.experimental.Experimental.Level valueOf(java.lang.String str) {
            return (androidx.annotation.experimental.Experimental.Level) java.lang.Enum.valueOf(androidx.annotation.experimental.Experimental.Level.class, str);
        }

        public static androidx.annotation.experimental.Experimental.Level[] values() {
            return (androidx.annotation.experimental.Experimental.Level[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static kotlin.enums.EnumEntries<androidx.annotation.experimental.Experimental.Level> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
