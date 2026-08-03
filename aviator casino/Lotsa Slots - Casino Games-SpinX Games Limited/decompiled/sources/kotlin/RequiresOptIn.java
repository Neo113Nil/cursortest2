package kotlin;

/* compiled from: OptIn.kt */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/RequiresOptIn;", "", "message", "", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "Lkotlin/RequiresOptIn$Level;", "()Ljava/lang/String;", "()Lkotlin/RequiresOptIn$Level;", "Level", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes6.dex */
public @interface RequiresOptIn {
    kotlin.RequiresOptIn.Level level() default kotlin.RequiresOptIn.Level.ERROR;

    java.lang.String message() default "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptIn.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/RequiresOptIn$Level;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ kotlin.RequiresOptIn.Level[] $VALUES;
        public static final kotlin.RequiresOptIn.Level WARNING = new kotlin.RequiresOptIn.Level("WARNING", 0);
        public static final kotlin.RequiresOptIn.Level ERROR = new kotlin.RequiresOptIn.Level("ERROR", 1);

        private static final /* synthetic */ kotlin.RequiresOptIn.Level[] $values() {
            return new kotlin.RequiresOptIn.Level[]{WARNING, ERROR};
        }

        public static kotlin.enums.EnumEntries<kotlin.RequiresOptIn.Level> getEntries() {
            return $ENTRIES;
        }

        private Level(java.lang.String str, int i) {
        }

        static {
            kotlin.RequiresOptIn.Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static kotlin.RequiresOptIn.Level valueOf(java.lang.String str) {
            return (kotlin.RequiresOptIn.Level) java.lang.Enum.valueOf(kotlin.RequiresOptIn.Level.class, str);
        }

        public static kotlin.RequiresOptIn.Level[] values() {
            return (kotlin.RequiresOptIn.Level[]) $VALUES.clone();
        }
    }
}
