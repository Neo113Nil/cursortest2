package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TypeComponentPosition {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition FLEXIBLE_LOWER;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition FLEXIBLE_UPPER;
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition INFLEXIBLE;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] getHighSpeedVideoFpsRanges;

    private TypeComponentPosition(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition typeComponentPosition = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition("FLEXIBLE_LOWER", 0);
        FLEXIBLE_LOWER = typeComponentPosition;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition typeComponentPosition2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition("FLEXIBLE_UPPER", 1);
        FLEXIBLE_UPPER = typeComponentPosition2;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition typeComponentPosition3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition("INFLEXIBLE", 2);
        INFLEXIBLE = typeComponentPosition3;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] typeComponentPositionArr = {typeComponentPosition, typeComponentPosition2, typeComponentPosition3};
        getHighSpeedVideoFpsRanges = typeComponentPositionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(typeComponentPositionArr);
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[] values() {
        return (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.class, str);
    }
}
