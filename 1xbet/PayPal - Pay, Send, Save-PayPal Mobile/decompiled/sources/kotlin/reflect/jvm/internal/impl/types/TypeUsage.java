package kotlin.reflect.jvm.internal.impl.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TypeUsage {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeUsage COMMON;
    public static final kotlin.reflect.jvm.internal.impl.types.TypeUsage SUPERTYPE;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeUsage[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private TypeUsage(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.types.TypeUsage typeUsage = new kotlin.reflect.jvm.internal.impl.types.TypeUsage("SUPERTYPE", 0);
        SUPERTYPE = typeUsage;
        kotlin.reflect.jvm.internal.impl.types.TypeUsage typeUsage2 = new kotlin.reflect.jvm.internal.impl.types.TypeUsage(com.google.android.gms.stats.CodePackage.COMMON, 1);
        COMMON = typeUsage2;
        kotlin.reflect.jvm.internal.impl.types.TypeUsage[] typeUsageArr = {typeUsage, typeUsage2};
        getHighResolutionOutputSizeshNQ4ISI = typeUsageArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(typeUsageArr);
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeUsage[] values() {
        return (kotlin.reflect.jvm.internal.impl.types.TypeUsage[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeUsage valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.types.TypeUsage) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.types.TypeUsage.class, str);
    }
}
