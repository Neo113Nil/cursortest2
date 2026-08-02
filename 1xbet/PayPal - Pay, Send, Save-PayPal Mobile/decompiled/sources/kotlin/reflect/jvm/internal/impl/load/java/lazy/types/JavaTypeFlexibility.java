package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class JavaTypeFlexibility {
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility FLEXIBLE_LOWER_BOUND;
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility FLEXIBLE_UPPER_BOUND;
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility INFLEXIBLE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility[] getHighSpeedVideoSizes;

    private JavaTypeFlexibility(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility("INFLEXIBLE", 0);
        INFLEXIBLE = javaTypeFlexibility;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
        FLEXIBLE_UPPER_BOUND = javaTypeFlexibility2;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility javaTypeFlexibility3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);
        FLEXIBLE_LOWER_BOUND = javaTypeFlexibility3;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility[] javaTypeFlexibilityArr = {javaTypeFlexibility, javaTypeFlexibility2, javaTypeFlexibility3};
        getHighSpeedVideoSizes = javaTypeFlexibilityArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(javaTypeFlexibilityArr);
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility[] values() {
        return (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.class, str);
    }
}
