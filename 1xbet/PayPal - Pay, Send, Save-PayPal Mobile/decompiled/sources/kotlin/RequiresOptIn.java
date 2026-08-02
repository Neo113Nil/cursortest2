package kotlin;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Lkotlin/RequiresOptIn;", "", "", "message", "Lkotlin/RequiresOptIn$Level;", "level", "()Ljava/lang/String;", "()Lkotlin/RequiresOptIn$Level;", "Level"}, k = 1, mv = {2, 3, 0}, xi = 48)
@java.lang.annotation.Documented
/* loaded from: classes3.dex */
public @interface RequiresOptIn {
    kotlin.RequiresOptIn.Level level() default kotlin.RequiresOptIn.Level.ERROR;

    java.lang.String message() default "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lkotlin/RequiresOptIn$Level;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Level {
        public static final kotlin.RequiresOptIn.Level ERROR;
        public static final kotlin.RequiresOptIn.Level WARNING;
        private static final /* synthetic */ kotlin.RequiresOptIn.Level[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private Level(java.lang.String str, int i) {
        }

        static {
            kotlin.RequiresOptIn.Level level = new kotlin.RequiresOptIn.Level("WARNING", 0);
            WARNING = level;
            kotlin.RequiresOptIn.Level level2 = new kotlin.RequiresOptIn.Level("ERROR", 1);
            ERROR = level2;
            kotlin.RequiresOptIn.Level[] levelArr = {level, level2};
            getHighResolutionOutputSizeshNQ4ISI = levelArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(levelArr);
        }

        public static kotlin.RequiresOptIn.Level[] values() {
            return (kotlin.RequiresOptIn.Level[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static kotlin.RequiresOptIn.Level valueOf(java.lang.String str) {
            return (kotlin.RequiresOptIn.Level) java.lang.Enum.valueOf(kotlin.RequiresOptIn.Level.class, str);
        }

        public static kotlin.enums.EnumEntries<kotlin.RequiresOptIn.Level> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }
}
