package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PACKAGE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FILE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005"}, d2 = {"Landroidx/annotation/RestrictTo;", "", "Landroidx/annotation/RestrictTo$Scope;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "()[Landroidx/annotation/RestrictTo$Scope;", "Scope"}, k = 1, mv = {1, 9, 0}, xi = 48)
@java.lang.annotation.Documented
/* loaded from: classes.dex */
public @interface RestrictTo {
    androidx.annotation.RestrictTo.Scope[] value();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "<init>", "(Ljava/lang/String;I)V", "LIBRARY", "LIBRARY_GROUP", "LIBRARY_GROUP_PREFIX", "GROUP_ID", "TESTS", "SUBCLASSES"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scope {

        @kotlin.Deprecated(message = "Use LIBRARY_GROUP_PREFIX instead.")
        public static final androidx.annotation.RestrictTo.Scope GROUP_ID;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY_GROUP;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY_GROUP_PREFIX;
        public static final androidx.annotation.RestrictTo.Scope SUBCLASSES;
        public static final androidx.annotation.RestrictTo.Scope TESTS;
        private static final /* synthetic */ androidx.annotation.RestrictTo.Scope[] getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private Scope(java.lang.String str, int i) {
        }

        static {
            androidx.annotation.RestrictTo.Scope scope = new androidx.annotation.RestrictTo.Scope("LIBRARY", 0);
            LIBRARY = scope;
            androidx.annotation.RestrictTo.Scope scope2 = new androidx.annotation.RestrictTo.Scope("LIBRARY_GROUP", 1);
            LIBRARY_GROUP = scope2;
            androidx.annotation.RestrictTo.Scope scope3 = new androidx.annotation.RestrictTo.Scope("LIBRARY_GROUP_PREFIX", 2);
            LIBRARY_GROUP_PREFIX = scope3;
            androidx.annotation.RestrictTo.Scope scope4 = new androidx.annotation.RestrictTo.Scope("GROUP_ID", 3);
            GROUP_ID = scope4;
            androidx.annotation.RestrictTo.Scope scope5 = new androidx.annotation.RestrictTo.Scope("TESTS", 4);
            TESTS = scope5;
            androidx.annotation.RestrictTo.Scope scope6 = new androidx.annotation.RestrictTo.Scope("SUBCLASSES", 5);
            SUBCLASSES = scope6;
            androidx.annotation.RestrictTo.Scope[] scopeArr = {scope, scope2, scope3, scope4, scope5, scope6};
            getHighSpeedVideoFpsRangesFor = scopeArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(scopeArr);
        }

        public static androidx.annotation.RestrictTo.Scope[] values() {
            return (androidx.annotation.RestrictTo.Scope[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.annotation.RestrictTo.Scope valueOf(java.lang.String str) {
            return (androidx.annotation.RestrictTo.Scope) java.lang.Enum.valueOf(androidx.annotation.RestrictTo.Scope.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.annotation.RestrictTo.Scope> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }
}
